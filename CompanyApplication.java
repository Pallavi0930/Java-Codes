public class CompanyApplication{
    public static void main(String[] args){
        Company company= new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();
    }
}
class Company{
    int n;
    boolean flag=false;
    // flag = flase : chance =producer :: flag=true : chance=consumer
    synchronized public void produce_item(int n) throws Exception{
        if(flag){
            wait();
        }
        this.n=n;
        System.out.println("Produced: "+this.n);
        flag=true;
        notify();
    }
    synchronized public int consume_item() throws Exception{
        if(!flag){
            wait();
        }
        System.out.println("Consumed: "+this.n);
        flag=false;
        notify();
        return this.n;
    }

}
class Producer extends Thread{
    Company c;
    public Producer(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while(true){

            //sleep() throws interrupted checked exception to handle it always use try-catch
            try      {
                this.c.produce_item(i);
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}

class Consumer extends Thread{
    Company c;
    public Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while(true){

            //sleep() throws interrupted checked exception to handle it always use try-catch
            try{
                this.c.consume_item();
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}