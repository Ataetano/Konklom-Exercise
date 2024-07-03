public class konklom01{
	// function สำหรับโจทย์ 3 ข้อแรก 
	static void StarLadder(int n, String style){
		int spaceCriteria = n - 1;
		if (style == "left"){
			// ตรงนี้จงใจจะใช้ i = 1 เพื่อให้ j เพิ่มขึ้นเป็นขั้นบันไดได้อย่างถูกต้อง
			for (int i = 1; i < n + 1; i++){
				// Loop เพื่อสร้าง *
				for (int j = 0; j < i; j++){
					System.out.print("*");
				}
			System.out.print("\n");
			}
		} else if (style == "right"){
			// สร้าง spaceCriteria เพื่อเติมช่องว่างลงไปในบันได
			for (int i = 1; i < n + 1; i++){
				// Loop เพื่อสร้างช่องว่าง
				for (int j = 0; j < spaceCriteria; j++){
					System.out.print(" ");
				}
				// Loop เพื่อสร้าง *
				for (int k = 0; k < i; k++){
					System.out.print("*");
				}
			// ทำการลบช่องว่างออกไป 1 ช่อง เนื่องจากในลูปถัดไป * จะเพิ่มมาอีก 1 ตัว
			spaceCriteria -= 1;
			System.out.print("\n");
			}
		} else if (style == "center"){
			for (int i = 1; i < n + 1; i++){
				// Loop เพื่อสร้างช่องว่างทางซ้าย
				for (int j = 0; j < spaceCriteria; j++){
					System.out.print(" ");
				}
				// Loop เพื่อสร้าง *
				for (int k = 0; k < i*2 - 1; k++){
					System.out.print("*");
				}
				// Loop เพื่อสร้างช่องว่างทางขวา
				for (int l = 0; l < spaceCriteria - 1; l++){
					System.out.print(" ");
				}
			spaceCriteria -= 1;
			System.out.print("\n");
			}
		}
	}
	// function สำหรับโจทย์ข้อที่สี่ 
	static void theNumberPyramid(int n){
		int spaceCriteria = n - 1;
		int number = 1;
		for (int i = 1; i < n + 1; i++){
			// Loop เพื่อสร้างช่องว่างทางซ้าย
			for (int j = 0; j < spaceCriteria; j++){
				System.out.print(" ");
			}
			// Loop เพื่อสร้างพิระมิดเลข
			for (int k = 0; k < i*2 - 1; k++){
				if (k == 0){
					System.out.print(number);
				// กำหนดเหตุการณ์ที่จะเกิดขึ้นหลังจาก k > 0
				} else if (k > 0){
					// ถ้า k ยังไม่เลยไปจาก index ตรงกลาง
					if (k < i){
						number += 1;
						System.out.print(number);
					}
					// ถ้า k เลยไปจาก index ตรงกลางแล้ว
					else {
						number -= 1;
						System.out.print(number);
					}
				}
			}
			// Loop เพื่อสร้างช่องว่างทางขวา
			for (int l = 0; l < spaceCriteria - 1; l++){
				System.out.print(" ");
			}
		spaceCriteria -= 1;
		System.out.print("\n");
		}
	}
	public static void main(String[] args){
		int numberControl = 4;
		System.out.println("Left Star Ladder");
		StarLadder(numberControl, "left");
		System.out.println("--------------------------");
		System.out.println("Right Star Ladder");
		StarLadder(numberControl, "right");
		System.out.println("--------------------------");
		System.out.println("Center Star Ladder");
		StarLadder(numberControl, "center");
		System.out.println("--------------------------");
		System.out.println("Number Pyramid");
		theNumberPyramid(numberControl);
	}
}