package project0213;

public class class002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		** shift ������
			*int�� �����͸� ������ bit ������ �о�� ����� int�� �����ϴ� ������
			*<<, >>, <<<
				a<<b - a�� b bit��ŭ �������� �̵� : ù��° ��Ʈ�� ����
			  ex) 23<<2 =92
			      23>>2 = 5
			  int a = 23:
			  *****<<,>> : ù��°��Ʈ�� ���� ����Ʈ
			  *****<<< : ù��° ��Ʈ�� �����ؼ� �������� ����Ʈ
		*/
		
		System.out.printf("%d\n", 23<<2);
		System.out.printf("%d\n", 23>>34);  //32�� �̻� ������ �ʽ��ϴ�. ->�׷��� �Ǹ� %32�� ��ŭ�� �о���ϴ�.
											//�̰� int���� 32�� �и� ���� �� ��. �׷��� 32�̻� ����Ʈ�� �ȵǴ� ����.����?
		System.out.printf("%d\n", 23>>2);
		System.out.printf("%d\n", 16<<27);
		
		//������ �켱����  : ���� > ��Ģ���� > shift > ��Ʈ���������� > ���迬���� > ���ǳ���������
		
		/*
		 ���迬����
		 	1. �񱳿����� (>,>=,<,<=)
		 		���� �����͸� ������ �����ϰ� ����� boolean
		 	2. ������� (==(����), !=(�ٸ���))
		 		��� �����Ϳ� �� ��밡��. ����� boolean
		 */
		
		
		
		/*
		*** ����������
			1. ��Ʈ���������� (&(and), |(or), ^(xor_Exclusive OR)) _ �������� ��������� �����ؾ� �����Ѵ�!
				int�� ������ 2���� ������ bit������ �����ؼ� ����� ������ �����ϴ� ������
					& : �� �� 1�� �� 1, �� �̿ܿ��� 0�� ������		ex) 20(10100(2))&17(10001(2)) : 10000(2)=16
						����ü ��� ����..? -> �׷��� ���α׷�(��ġ�� �� ), �ý��� ���α׷���(&0���� �����,���� � ����)
					| : �Ѵ� 0�� �� 0, �� �̿ܿ��� 1�� ������		ex) 20(10100(2))|17(10001(2)) : 10101(2)=21
						��� ��� ����..?  -> �׷���(����+����=����(�츰�� ���δ�)), �ý������α׷���(|0���� ����ϴ� ���α׷�)
					^ : ������ 0, �ٸ��� 1 ����				ex) 20(10100(2))^17(10001(2)) : 00101(2)=5
						��ǻ�ʹ� ������ �� xor�� ������ �̿� (1+1=0, �� �ڸ�����)

		System.out.printf("%d\n", 20&17);
		System.out.printf("%d\n", 20|17);
		System.out.printf("%d\n", 20^17);
		
		/*
		2. ���ǳ��������� (&&(and), ||(or))
		boolean ������ 2���� ������ �����ؼ� ����� boolean���� ����
			&& : �� �� true�� ���� true, �� �̿ܿ��� false
			|| : �� �� false�� ���� false, �� �̿ܿ��� true
			
			-> &&�� |���� �켱������ �����ϴ�. (���±��� ��� �����ڵ� �߿����� �켱���� ���� ����)
			&&�� ���� ������ ����� false�̸� ����� false�̹Ƿ� ������ ����� false�̸� �ڴ� Ȯ������ ����
			   ||�� ������ �������� true�̸� ����� true�̹Ƿ� ������ ����� true�̸� �ڸ� Ȯ������ �ʴ´�.
		*/
		
		System.out.printf("%B\n", true&&false);
		System.out.printf("%B\n", true||false);
		
		int x = 10;
		boolean result = x>5 && ++x <5; //���� true�� ������ �ڿ� ++x�� ���Ǽ� x���� 11�� ����
		System.out.printf("x:%d\n",x); 
		result = x>20 && ++ x>5;		//���� false�� ������ �ڿ� ++x�� �Ĵٵ� �Ⱥ��� x���� 11�� ����.
		System.out.printf("x:%d\n",x);
		
		
		int year = 2019;
				//year�� 2000 �̻����� Ȯ��
		result = year>=2000;
		System.out.printf("2000�̻�:%b\n",result);
				//year�� 4�� ������� Ȯ��
		result = year%4 ==0;		
		System.out.printf("4�� ���:%b\n",result);
				//year�� 4�� ����̰� 100�� ����� �ƴ� ��츦 Ȯ��
		result = year%4==0 && year%100!=0;
		System.out.printf("4�� ����̰� 100�ǹ���� �ƴ�:%b\n",result);
				//year�� (4�� ����̰� 100�� ����� �ƴ� ���) �Ǵ� 400�� ����� ��� Ȯ��
		result = year%400==0||year%4==0 && year%100!=0;
		System.out.printf("���⿩��:%b\n",result);
		
		
				// 1~100������ �����Ͱ� �ֽ��ϴ�.
				//3�� ����̰� 4�� ������� Ȯ��
				/* 1.3�� ����� Ȯ���ϰ� 4�� ����� Ȯ���ϴ� ���� ������
				   2.4�� ����� Ȯ���ϰ� 3�� ����� Ȯ���ϴ� ���� ������ �Ǵ�!!
				   && �Ҷ��� 2�� ����(ù ���͸����� 25���� �Ÿ��ϱ� �۾� �� 125��)
				   || �Ҷ��� 1�� ���� (�۾�Ƚ�� �� 167��)
				   
				 */

	}

}