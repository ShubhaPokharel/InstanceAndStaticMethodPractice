class MethodPractice{
	void wish(String name){
		System.out.println("Good Morning...."+ name);
	}
	void add(long num1, long num2){
		long res;
		res = num1 + num2;
		System.out.println("Addition of two numbers...."+res);
	}
	static void heightCheck(double height){
		if(height >= 5){
		System.out.println("your height is greater than 5 or is 5");
		}
		else{
			System.out.println("Your height is less than 5");
		}
	}
	public static void main(String[] args){
		MethodPractice m = new MethodPractice();
		m.wish("aruna");
		m.wish("Subha");
		m.wish("susil");
        System.out.println("*********************");
		m.add(40478, 95248);
		m.add(79429742, 17845184209220L);
		m.add(93, 95248);
		System.out.println("*********************");
		MethodPractice.heightCheck(5.9);
		MethodPractice.heightCheck(11.6);
		MethodPractice.heightCheck(1.0);
		MethodPractice.heightCheck(4.999);

	}
}