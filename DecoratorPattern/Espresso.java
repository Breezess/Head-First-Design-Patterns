package DecoratorPattern;

/*���ȣ���Espresso��չ��Beverage�࣬��ΪEspresso��һ������*/
public class Espresso extends Beverage {
	
	/*Ϊ��Ҫ�������ϵ�����������д��һ������������סdescriptionʵ�������̳���Beverage*/
	public Espresso() {
		description = "Espresso";
	}
	
	/*����Espresso�۸�*/
	public double cost() {
		return 1.99;
	}

}
