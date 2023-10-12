package practice;

public class Ifblocks {
	
	public static void main(String[] args) {
main2();
main();
	}
static void main() {
	int a=2002;
	int b=22;
	int c=22;
	float d=0.2f;
	
	if ((a<=b && b<=c)|| c==a) {
		System.out.println(":::1st condition true bro:::");
	}
		else {
			if( a==b || b>=a) {
				System.out.println(":::Inside else block::: ");
			}else if(a>b && d == 1.0f) {
				System.out.println(" :::else if inside if block::: ");
			}else {
				if(d==0.2f) {
					System.out.println(":😅:else inside else block:😅:");
				}
			}
		}
		if(b==c) {
			System.out.println(":👻:are you stupid can't you see b and c both have same value 22 :👻:");
		}
	}
	static void main2() {
		
		int a=001;
		String name="peru";
		char z='2';
		
		switch (a) {
		case 1:
			System.out.println(":😳:oops zeros are ignored in 001:😳:");
		break;
		case 2:
			System.out.println(":🙃:looks like 00's are not ignored  :🙃:");
		break;
		}
		
		switch (name) {
		case "uday":
			System.out.println(":🤡:name is uday:🤡:");
		break;
		case "peru":
			System.out.println(":🫰: given name value is peru:🫰:");
		break;
		}
		switch (z) {
		case '1':
			System.out.println(":::char value is given 1 1st:::");
			break;
		case '2':
			System.out.println(":::char value is given 2 2nd:::");
			break;
		}
	}
	static void main3() {
		
		
	}
	
	
	
	
	
}

