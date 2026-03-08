package com.example.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.service.UserService;

///////Userで定義した変数
//id、name、email、cratedAt、updatedAt

///////サービスクラスで定義したメソッド名
// 初期データ作成：initializeUsers
// IDでユーザー検索(id)：findById
// 条件に一致するユーザーを検索(user→name/email)：serachUsers
// ユーザーを作成(user)：createUser
// ユーザーを更新(id、user)：updateUser
// ユーザーを削除(id)：deleteUser


/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）　@PathVariable　Integer id
    // 引数や戻り値は適宜修正してください
    public void getUserById() {
        return;
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）　　@RequstParam(required=false)
    // 引数や戻り値は適宜修正してください
    public void searchUsers() {
        return;
    }

    // POSTメソッドによるユーザー作成（POST /users）　　　　　@Valid　@Requestbody　UserRequest request
    // 引数や戻り値は適宜修正してください
    public void createUser() {
        return;
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）　　　@PathVariable　Integer id/@Requestbody　UserRequest request
    // 引数や戻り値は適宜修正してください
    public void updateUser() {
        return;
    }

    // DELETEメソッドによるユーザー削除（DELETE /users/{id}）　　@PathVariable　Integer id
    // 引数や戻り値は適宜修正してください
    public void deleteUser() {
        return;
    }
}
