function sp1tang(){
    var sp=document.getElementById("sp1");
    var t = document.getElementById("thanhTien");
    sp.innerText++;
    t.innerText=Number(t.innerText)+582000;

}
function sp1giam(){
    var sp=document.getElementById("sp1");

    if(sp.innerText<=1){
        alert("Số lượng đang bé hơn định dạng!");

    }else{
        sp.innerText--;
        var t = document.getElementById("thanhTien");
        t.innerText = t.innerText-582000;
    }
}
//
function sp2tang() {
    var sp = document.getElementById("sp2");


    var t = document.getElementById("thanhTien2");
    sp.innerText++;
    t.innerText = Number(t.innerText) + 1730000;
}
function sp2giam(){
    var sp=document.getElementById("sp2");

    if(sp.innerText<=1){
        alert("Số lượng đang bé hơn định dạng!");

    }else{
        sp.innerText--;
        var t = document.getElementById("thanhTien2");
        t.innerText = t.innerText-1730000;
    }
}
//
function sp3tang(){
    var sp=document.getElementById("sp3");


    var t = document.getElementById("thanhTien3");
    sp.innerText++;
    t.innerText=Number(t.innerText)+150000;
}
function sp3giam(){
    var sp=document.getElementById("sp3");

    if(sp.innerText<=1){
        alert("Số lượng đang bé hơn định dạng!");

    }else{
        sp.innerText--;
        var t = document.getElementById("thanhTien3");
        t.innerText = t.innerText-150000;
    }
}

function a(){
    let a = document.getElementById("tensp1");
    let soluong = document.getElementById("sp1");
    let sottien = document.getElementById("thanhTien");

    let tenspmd = document.getElementById("tenspmd1");
    let sotienmd = document.getElementById("sotienmd1");
    let soluongmd = document.getElementById("soluongmd1");

    tenspmd.value = a.innerText;
    sotienmd.value = sottien.innerText;
    soluongmd.value=soluong.innerText;

}
function bb(){
    let b = document.getElementById("tensp2");
    let soluong2 = document.getElementById("sp2");
    let sottien2 = document.getElementById("thanhTien2");

    let tenspmd2 = document.getElementById("tenspmd2");
    let sotienmd2 = document.getElementById("sotienmd2");
    let soluongmd2 = document.getElementById("soluongmd2");

    alert("OK");

    tenspmd2.innerText = "yES";
    sotienmd2.innerText = sottien2.innerText;
    soluongmd2.innerText=soluong2.innerText;
}
function cc(){
    let f = document.getElementById("3");
    let t = document.getElementById("sp3");
    let v = document.getElementById("thanhTien3");

    f.innerText="Số lượng: "+ t.innerText +","+"Thành tiền: "+v.innerText;
}