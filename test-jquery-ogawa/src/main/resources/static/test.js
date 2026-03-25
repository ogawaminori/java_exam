//1
console.log('小川未乃梨');

//2
$(function(){
    $('#btn').on('click',function(){
        $('#q2').css('color','red');
    });
});

//3
$(function(){
    $('#btn3').on('click',function(){
        alert($('#q3'));
    });
});

//4
$(function(){
    $('#btn4').on('click',function(){
        $('#btn4').prop("disabled", false ).css('color','gray');
    });
});

//5
$(function(){
    $('#q51').on('change',function(){
         $('#q54').text('初期表示');
    });
    
    $('#q52').on('change',function(){
         $('#q54').text('System.out.println("Hello World");');
    });

    $('#q53').on('change',function(){
         $('#q54').text('console.log("Hello World");');
    });

});
