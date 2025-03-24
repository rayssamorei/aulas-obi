//definição f(0) = 0 e f(1) = 1
// f(n)=f(n-1)+f(n-2) para n >=2

//sem recursividade
function fibonnaci (n){
    if(n === 0) return 0;
    if(n === 1) return 1;
    if(n >= 2){
        return (n-1)+(n-2);
    }
}
console.log(fibonnaci(5));

//com recursividade
function recursivafibonnaci (n){
    if(n === 0) return 0;
    if(n === 1) return 1;
    return recursivafibonnaci(n-1) + recursivafibonnaci(n-2);
}
console.log(fibonnaci(4));
