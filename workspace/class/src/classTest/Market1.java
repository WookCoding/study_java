package classTest;

class Company1 {
   static int sequence;
   static int total;
   int id;
   String name;
   int income;
   
//   �ʱ�ȭ ��
//   ������ ȣ��� ������ ����
   {
      this.id = ++sequence;
   }
   
}

public class Market1 {
   public static void main(String[] args) {
      Company1 �ѵ��� = new Company1();
      Company1 ������ = new Company1();
      Company1 ���¾� = new Company1();
      Company1 ��� = new Company1();
      
      System.out.println(�ѵ���.id);
      System.out.println(������.id);
      System.out.println(���¾�.id);
      System.out.println(���.id);
      
//      Company.total += �ѵ���.income += 300;
//      Company.total += ������.income += 1000;
//      Company.total += ���¾�.income += 2000;
//      Company.total += ���.income += 3000;
      
      �ѵ���.income += 300;
      �ѵ���.income += 700;
      ������.income += 1000;
      ���¾�.income += 2000;
      ���.income += 3000;
      
      Company.total += �ѵ���.income;
      Company.total += ������.income;
      Company.total += ���¾�.income;
      Company.total += ���.income;
      
      System.out.println("ȸ�� ���� : " + Company.total + "����");
   }
}



















