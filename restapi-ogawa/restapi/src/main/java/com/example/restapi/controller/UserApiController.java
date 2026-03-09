package com.example.restapi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
        RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@Validated
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }


    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Integer id) {

        User user = userService.findById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new UserResponse(user));
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
        User user,
        @RequestParam @NotBlank String name,
        @RequestParam @NotBlank @Email String email) {

            List<User> users =userService.searchUsers(user);
            List<UserResponse> userResponses = new ArrayList<>();

            for(User userlist:users){
                userResponses.add(new UserResponse(userlist));
            }

            if(name == null || email ==null){
                return ResponseEntity.badRequest().build();
            }

        return ResponseEntity.ok(userResponses);
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping("")
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest) {
        User user =new User(userRequest.getEmail(),userRequest.getName());
        userService.createUser(user);

        if(userRequest == null ){
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(201).body(new UserResponse(user));
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(
        @Valid @RequestBody UserRequest userRequest,
        @PathVariable Integer id) {
            User exist = userService.findById(id);
            if(exist == null ){
                return ResponseEntity.badRequest().build();
            }

            User user=new User(userRequest.getName(),userRequest.getEmail());
            userService.updateUser(id, user);
            return ResponseEntity.ok(new UserResponse(user));
             }

}
