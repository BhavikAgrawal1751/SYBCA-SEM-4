var products = [
  {
    pname: "asus tuf  f15",
    price: "63000",
    img: "laptop.jpg",
  },
  {
    pname: "samsung crystal UHD",
    price: "55000",
    img: "tv.jpg",
  },
  {
    pname: "casio digital watch",
    price: "2000",
    img: "watch.jpg",
  },
  {
    pname:"modern bycycle",
    price:"12000",
    img:"cycle.jpg"
  },
  {
    pname:"rich dad poor dad",
    price:"450",
    img:"book.jpg"
  }
];

const rightButton = document.getElementById("rightButton");
const leftButton = document.getElementById("leftButton");
const img = document.getElementById("imgDiv");
const productName =  document.getElementById("nameDiv");
const productPrice = document.getElementById("priceDiv");

var index = 0;
img.innerHTML = '<img src= "'+ products[index].img+'">'
productName.innerHTML = products[index].pname
productPrice.innerHTML = products[index].price

rightButton.addEventListener("click", () => {
    index++;
    if (index == products.length) {
        index = 0;
    }
    img.innerHTML = '<img src= "'+ products[index].img+'">'
    productName.innerHTML = products[index].pname
    productPrice.innerHTML = products[index].price
    
});

leftButton.addEventListener("click", () => {
    index--;
    if (index < 0) {
        index = products.length - 1;
    }
    img.innerHTML = '<img src= "'+ products[index].img+'">'
    productName.innerHTML = products[index].pname
    productPrice.innerHTML = products[index].price
});
