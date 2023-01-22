package methodTest;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class MethodTask {	
// 1~ 10���� println()���� ����ϴ� �޼ҵ�
	void print(){
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
			if(i == 9) {
				System.out.println();
			}
		}
	}
	
// "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void nameCount(int count){
		for (int i = 0; i < count; i++) {
			System.out.println(i + 1 +". " + "ȫ�浿");
		}
	}
	
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void name(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(i + 1 + ". " +name);
		}
	}
	
//	�� ������ ������ ���ִ� �޼ҵ�
	int sub(int[] numbers) {
			return numbers[0] - numbers[1] - numbers[2];
	}
	
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	int[] div(int number1, int number2) {
		int[] result = null;
		
		if(number2 != 0) {
			result = new int[2];
			result[0] = number1 / number1;
			result[1] = number1 % number2;
		}
		
		return result;
	}
	
//	1~n������ ���� �����ִ� �޼ҵ�
	int sum(int count) {
		int result = 0;
		for (int i = 0; i < count; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int sniffling(int number) {
		return ++number;
	}
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String upLowCasting(String eng) {
		String result = "";
		for (int i = 0; i < eng.length(); i++) {
			
			char c= eng.charAt(i);
			
			if(c >= 65 && c <=90) {
				
				result += (char)(c + 32);
			}else if(c >= 97 && c <= 122) {
				
				result += (char)(c - 32);
			}else {
				
				result += c;
			}
		}
		return result;
	}
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int stringCount(String data,char c) {
		int result = 0;
		
		for (int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == c) {
				result++;
			}
		}
		
		return result;
	}
	
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int indexNumber(int[] numbers, int num) {
		return numbers[num];
	}
	
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(1024 -> �ϰ��̻�)
	String strChangeNumber(String data) {
		String hangle = "�����̻�����ĥ�ȱ�";
		String result = "";
		
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt((int)data.charAt(i)- 48);
		}
		return result;
	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	int[] maxMin(int[] numbers) {
		int[] result = new int[2];
		int min = numbers[0], max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		result[0] = max;
		result[1] = min;
		
		return result;
	}
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	 void maxMin(int[] numbers, int result[]) {
		int min = numbers[0], max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
			}
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		result[0] = max;
		result[1] = min;
	}
	 
//	 indexOf() �����
//	 ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//	 ���� �ش� ���ڰ� ������ -1�� �����Ѵ�
	 int indexOf(String str, char c) {
		 for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c){
				return i;
			}
		}
		 return -1;
	 }
	 
//-------------------------------------------------------------------
//	 ����� Ǯ��
//   1~10���� println()���� ����ϴ� �޼ҵ�
   void printFrom1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }

//   "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
   void printHong(int count) {
      for (int i = 0; i < count; i++) {
         System.out.println("ȫ�浿");
      }
   }

//   �̸��� n�� println()���� ����ϴ� �޼ҵ�
   void printName(String name, int count) {
      for (int i = 0; i < count; i++) {
         System.out.println(name);
      }
   }

//   �� ������ ������ ���ִ� �޼ҵ�
   int sub(int number1, int number2, int number3) {
      int result = number1 - number2 - number3;
      return result;
   }

//   �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
   int[] div2(int number1, int number2) {
      int[] result = null;

      if (number2 != 0) {
         result = new int[2];
         result[0] = number1 / number2;
         result[1] = number1 % number2;
      }
      return result;
   }

//   1~n������ ���� �����ִ� �޼ҵ�
   int getTotalFrom1(int end) {
      int total = 0;
      for (int i = 0; i < end; i++) {
         total += i + 1;
      }
      return total;
   }

//   Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
   int change(int number) {
      return ++number;
   }

//   ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
   String changeToUpperOrLower(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++) {
         char c = str.charAt(i);
         if (c >= 65 && c <= 90) {
            result += (char) (c + 32);

         } else if (c >= 97 && c <= 122) {
            result += (char) (c - 32);

         } else {

            result += c;
         }
      }
      return result;
   }

//   ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
   int getCount(String str, char c) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }

//   5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
   int getValue(int[] arData, int index) {
      return arData[index];
   }

//   �ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
   int changeToInteger(String hangle) {
      String hangleOriginal = "�����̻�����ĥ�ȱ�";
      String result = "";
      for (int i = 0; i < hangle.length(); i++) {
         result += hangleOriginal.indexOf(hangle.charAt(i));
      }
      return Integer.parseInt(result);
    }

//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
   int[] getMaxAndMin(int[] arData) {
      int[] result = {arData[0], arData[0]};
      
      for (int i = 0; i < arData.length; i++) {
         if(result[0] < arData[i]) {result[0] = arData[i];} 
         if(result[1] > arData[i]) {result[1] = arData[i];} 
      }
      return result;
   }
   
   
//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
   void getMaxAndMin(int[] arData, int[] result) {
      result[0] = arData[0];
      result[1] = arData[0];
      
      for (int i = 0; i < arData.length; i++) {
         if(result[0] < arData[i]) {result[0] = arData[i];} 
         if(result[1] > arData[i]) {result[1] = arData[i];} 
      }
   }
   
//	 indexOf() �����
//	 ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//	 ���� �ش� ���ڰ� ������ -1�� �����Ѵ�	
    int indexOf1(String str, char c) {
    	for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				return i;
			}
		}
    	return -1;
    }
   
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
//		int[] numbers = {20, 25};
//		mt.print();
//		mt.nameCount(3);
//		mt.name("������", 3);
//		System.out.println(mt.sub(numbers));
//		int[] result = mt.div(10, 0);
//		if(result == null) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}else {
//			System.out.println("�� : " + result[0]);
//			System.out.println("������ : " + result[1]);
//		}
		
//		-----------------------------------------------------------

//		1~n������ ���� �����ִ� �޼ҵ�		
//		System.out.println(mt.sum(10));
//		-----------------------------------------------------------
		
//		Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�		
//		System.out.println(mt.sniffling(3));
//		-----------------------------------------------------------	
		
//		���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�		
//		System.out.println(mt.upLowCasting("StrIng"));
//		-----------------------------------------------------------
		
//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�		
//		System.out.println(mt.stringCount("andibviaaarer",'a'));
		
//		-----------------------------------------------------------		
//		�ѱ��� ������ �ٲ��ִ� �޼ҵ�(1024 -> �ϰ��̻�)
//		System.out.println(mt.strChangeNumber("1024"));

//		-----------------------------------------------------------
		
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//		int[] arDatas = new int[5];
//		for (int i = 0; i < arDatas.length; i++) {
//			System.out.println(i+1 + "��° ���� : ");
//			arDatas[i] = sc.nextInt();
//		}
////		System.out.println("�ִ밪 : " + mt.maxMin(arDatas)[0]);
////		System.out.println("�ּҰ� : " + mt.maxMin(arDatas)[1]);
////		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
//		int[] result = new int[2];
//		mt.maxMin(arDatas, result);
//		System.out.println("�ִ밪 :" +result[0]);
//		System.out.println("�ּҰ� :" +result[1]);
//		-----------------------------------------------------------
//		 indexOf() �����
//		 ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//		 ���� �ش� ���ڰ� ������ -1�� �����Ѵ�		
//		int result = mt.indexOf("abcdefghijk", 'h');
//		System.out.println(result);
		
	}
}
