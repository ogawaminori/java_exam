//1
console.log('小川未乃梨');

//2
let firstName='Minori';
let lastName='Ogawa';
console.log(firstName+' '+lastName);

//3
let a=200;
let b=250;

console.log('小計');
console.log(a*3+b*4);
console.log('消費税');
console.log((a*3+b*4)/10);
console.log('合計金額');
console.log((a*3+b*4)+(a*3+b*4)/10);

//4
let testScore=0;
if(testScore>=0 && testScore <=79){
    console.log('追試です');
}else if(testScore>=80 &&testScore<=100){
    console.log('合格です');
}else{
    console.log('存在しない点数です');
}

//5
let i=0;
for(let j=0;j<=100;j++){
    i=i+j;
}console.log(i);

//6
function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
function multi(a,b){
    return a*b;
}
function div(a,b){
    return a/b;
}
console.log('5+3='+add(5,3));
console.log('5-3='+sub(5,3));
console.log('5*3='+multi(5,3));
console.log('5/3='+div(5,3));
