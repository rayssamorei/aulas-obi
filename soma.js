function print(n){
    console.log(n);
    if(n <= 0) return;
    print(n - 1);
}

print(5);