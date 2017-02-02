
public class Test {

	
	public static void main(String[] args) {

		
		int[] nums = {3, 1, 3, 1, 3};
		int count = 0;
	    int pos = -2; // in case nums[0] == 3
	 
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == 3) {
	            count++;
	            if (i - pos == 1)System.out.print(false);
	            pos = i;
	        }
	    }
	 
	    System.out.print(count == 3); 
}
	/*
	for(int i =5; i<=32; i+= 5){
		
			System.out.println(i);
			*/
		/*
int num = 0;

for (int i = 0; i <=100 ; i++){
	if (i%2 != 0){
		num+=i;
	}System.out.println(num);
	
}
	}
}

/*
while(i<=100){
	if (i%2 != 0){
		num+=i;
	}i++;
}System.out.println(num);
}
}

/*


/*		int i = 0; int num = 0;
while (i<= 100){
	if(i%2==0){
		num+=i;
	}i++;
}System.out.print(num);
} int num = 0;
for (int i = 0; i<=100;i++){
if(i%2==0){
	num+=i;
}
}System.out.print(num);

}
int e = 0;
String str = "eeeeelephant is cooleeee";
for(int i = 0; i <= str.length()-1;i++){
	if(str.charAt(i)== 'e'){
		e++;
	}
}System.out.print(e);
}
}

*/
	}








