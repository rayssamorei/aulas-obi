
//sum(5) = 5 + sum(4)
function soma (n){
    if(n > 0){
        return n + soma(n-1);
    } else {
        return 0;
    }
}
console.log(soma(5));

