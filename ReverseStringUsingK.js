var reverseStr = function(s, k,arr=s.split(""),k2=k*2) {
    let l=arr.length-1;
    for(let i=0;i<l;i+=k2){
        swap(i,Math.min(i+k-1,l));
    }
    return arr.join("");

    function swap(start,end){
    while(start<end){
        [arr[start],arr[end]]=[arr[end],arr[start]];
        start++;
        end--;
        }
    } 
};
let s="abcdefgh";
let k=2;
let result=reverseStr(s,k);
console.log(`The string after reversing is- ${result}`);