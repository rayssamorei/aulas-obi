function fatorial (n){
    if(n === 0 || n === 1) return 1;
    return n * fatorial(n-1);
}
//fatorial em js
console.log(fatorial(500));