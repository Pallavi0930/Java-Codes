class Demo {
 public static void main(String[] args){
int i = 20;
if((i++ >100) & (++i>100)){ 
  //20   22

}
System.out.println(i);
System.out.println("value of i is: "+ i++ + ++i + --i + i-- + i);
}		//22  24       23     23     22  //114
}

//&& ----- 20
//& --------21