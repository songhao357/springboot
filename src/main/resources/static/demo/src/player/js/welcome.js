function showSignin() {

  $("#signin").css("display", "block");
  $("#register").css("display", "none");
}

function showRegister() {
  $("#signin").css("display", "none");
  $("#register").css("display", "block");

}

function register() {
      let nam = $("#name")[0].value.toString();
      let nickName = $("#nickName")[0].value.toString();
      let psw = $("#pwd")[0].value.toString();
      let psw2 = $("#pwd2")[0].value.toString();

      if(psw!=psw2){
        alert("密码不一致，请确认")
        return;
      }

      let y = new Object();
      y.name = nam;
      y.nickName=nickName;
      y.password = psw;
      let a = JSON.stringify(y);

      $.ajax({
        type: "POST",
        data: a,
        async: true,
        contentType: "application/json;charset=UTF-8",
        url: "http://localhost:8087/player/registerPlayer",
        success(res) {
          if("nameRepeat"==res){
            alert("名字已经被注册，换一个吧")
          }
          console.log(res)

        },
        error(res) {
          console.log(res)
        }

      })

}

function signin() {


  let nam = $("#name1")[0].value.toString();

  let psw = $("#pwd1")[0].value.toString();


  let y = new Object();

  y.name = nam;
  y.password = psw;
  let a = JSON.stringify(y);

  $.ajax({
    type: "POST",
    data: a,
    async: true,
    contentType: "application/json;charset=UTF-8",
    url: "http://localhost:8087/player/login",
    success(res) {
      console.log(res)


    },
    error(res) {
      console.log(res)
    }


  })


}
