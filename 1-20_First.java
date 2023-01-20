public class 1-20_First {
    int i = 2;
		int j = 1;
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.println(i+"단: "+i+"*"+j+"="+i*j);
			}
		}

		int i = 2;

		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + "단: " + i + "*" + j + "=" + i * j);
				j++;
			}
			i++;
		}

		int i = 2;
		while (i < 10) {
			int j = 0;
			while (j < 10) {
				j++;
				if (j == 5) {
//					break; // j가 오면 반복문 중지
//					continue; // j가 오면 반복문 점프
					return; // 함수 종료
				}

				System.out.println(i + "+" + j + "=" + (i + j));
			}
			i++;
		}
		
		for(;;) // 무한반복문
		{
			System.out.println("무한 반복중..");
		}
		while(true) {
			System.out.println("while 무한 반복중...");
		}
		do {
			System.out.println("무한 반복 준비");
		}while(true);

        // ------------------배열----------------------

        int[] arrayA = new int[5]; // 선언 후 객체 생성
		
		int[] arrayB = {10,20,30}; 

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = i;
			
		}
		for (int j = 0; j < arrayA.length; j++) {
			System.out.println(arrayA[j]);
		}
		for(int i =0; i<3;i++) {
			System.out.println(arrayB[i]);
		}
		
		System.out.println(arrayA); //배열의 주소값
		
		String[] arrayC = {"Object","Oriented","Programming"};
		
		for(int i = 0; i<arrayC.length;i++) {
			System.out.println();
		}
        int[][] matrix = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 } 
            };

    System.out.println(matrix[2][0]); // 9출력
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }
    int[][][] matrix2 = {
        {
            {1,2,3},
            {4,5,6},
        },
        
        {
            {7,8,9},
            {10,11,12}
        },
            
    };
    System.out.println("matrix2 :"+matrix2[1][0][0]);

}
