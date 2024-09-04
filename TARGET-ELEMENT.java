package DSA;

public class search {
	public static void main(String[] args) {
		
	
	int[] arr= {1,2,3,4,5};
	int tar=4,i=0;
	boolean exist = false;
	for(i=0;i<arr.length;i++) {
		if(arr[i]==tar) {
			exist = true;
			break;
		}
		
	}
	if(exist) {
		System.out.println(" index:"+i+" have "+tar);
	}else {
		System.out.println(tar+" is not found");
	}
	}

}
