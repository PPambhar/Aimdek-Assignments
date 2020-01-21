var i = 1;
var total = 0;

function addProduct() {
    var product_name = document.getElementById("product_name");
    var product_img = document.getElementById("product_img");
    var product_desc = document.getElementById("desc");
    var qty = document.getElementById("qty");
    var price = document.getElementById("price");

    let files = document.getElementById("product_img").files;
    if (files && files.length) {
        var fr = new FileReader();
        fr.onload = function() {

            var div = document.getElementById("product_list_section");
            div.innerHTML += '<div class="row border border-success rounded m-2" id="product_row_' + i + '"><div class="col-md-3"><img src="' + fr.result + '" class="border border-dark rounded mt-1" alt="Smiley face" id="list_img_' + i + '" style="height:90%; width:100%;" /></div><div class="col-md-9"><div class="row mt-3"><div class="col-md-6"><label for="" id="list_product_name_' + i + '"><b>Name:</b></label></div><div class="col-md-3"><label value="" for="" id="list_qty_' + i + '"><b>Quantity:</b></label></div><div class="col-md-3"><label for="" id=""></label></div><div class="col-md-6"><label for="" id="list_desc_' + i + '"><b>Description:</b></label></div><div class="col-md-3"><label value="" for="" id="list_price_' + i + '"><b>Price:</b></label></div><div class="col-md-3"><button type="button" id="' + i + '" class="btn btn-primary mt-n3" onclick="addToCart(this)">add to cart</button></div></div></div></div><input type="hidden" id="h_qty_' + i + '" value=""/><input type="hidden" id="h_price_' + i + '" value=""/>';
            document.getElementById("list_product_name_" + i).innerHTML += " " + product_name.value;
            document.getElementById("list_desc_" + i).innerHTML += " " + product_desc.value;
            document.getElementById("list_qty_" + i).innerHTML += " " + qty.value;
            document.getElementById("list_price_" + i).innerHTML += " " + price.value;

            document.getElementById("h_qty_" + i).value = qty.value;
            document.getElementById("h_price_" + i).value = price.value;
        }
        fr.readAsDataURL(files[0]);
    }
    i++;
}

function addToCart(btn) {

    var btnid = btn.id;

    //arr.push(btnid);
    //alert(btn.id);
    var pname = document.getElementById("list_product_name_" + btnid).innerHTML;
    var pdesc = document.getElementById("list_desc_" + btnid).innerHTML;
    var lqty = document.getElementById("h_qty_" + btnid).value;
    if (lqty == 0) {
        alert("Product out of stock !!!!");
    } else {
        var cart_qty = prompt("Enter Quantity");

        var lprice = document.getElementById("h_price_" + btnid).value;

        var final_qty = lqty - cart_qty;

        if (final_qty < 0) {
            alert("please enter valid quantity !!!");
        } else {
            document.getElementById("list_qty_" + btnid).innerHTML = "<b>Quantity: </b>" + final_qty;
            document.getElementById("h_qty_" + btnid).value = final_qty;
            //alert(lqty);
            var total_price = Number(Number(cart_qty) * Number(lprice));
            var div = document.getElementById("cart_list_section");
            var sc = document.getElementById("list_img_" + btnid).src;
            //alert(sc);
            div.innerHTML += '<div class="row border border-success rounded m-1" id="' + btnid + '"><div class="col-md-3"><img src="' + sc + '" class="border border-dark rounded mt-1" alt="Smiley face" style="height:90%; width:100%;" /></div><div class="col-md-9"><div class="row"><div class="col-md-10"><label for="">' + pname + '</label></div><div class="col-md-2 ml-n3"><i class="btn fa fa-times" style="color:red;" aria-hidden="true" onclick="deleteFromCart(' + btnid + ')"></i></div><div class="col-md-12"><label id="product_total" for=""><b>Total: </b>' + cart_qty + ' * ' + lprice + ' = ' + total_price + '</label></div></div></div></div>';
            total = total + total_price;
            document.getElementById("grand_total").innerHTML = "<b>Grand Total: </b>" + total;
        }
    }
}

function deleteFromCart(btn_del) {
    var del = document.getElementById(btn_del);
    del.parentNode.removeChild(del);
    // document.getElementById("list_qty_" + btnid).innerHTML = "<b>Quantity: </b>" + final_qty;
    // document.getElementById("h_qty_" + btnid).value = final_qty;
    //document.getElementById("grand_total").innerHTML = "<b>Grand Total: </b>" + total;

}