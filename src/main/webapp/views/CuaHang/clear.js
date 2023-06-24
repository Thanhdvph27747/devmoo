function clear(){
    alert("Thanh cong!");
    let a = document.getElementsByName("ma");
    var b = document.getElementsByName("ten");
    var c = document.getElementsByName("diaChi");
    var d = document.getElementsByName("thanhPho");
    var e = document.getElementsByName("quocGia");
    a.value= "";
    b.value= "";
    c.value= "";
    d.value= "";
    if(a.value.trim().length<=0||
    b.value.trim().length<=0||
    c.value.trim().length<=0||
    d.value.trim().length<=0){
    //alert("Vui long khong de trong!");
    return;
    }

}
