Vim�UnDo� .� a�tFJQ�e��M���cv�@za��"B�x*   4   4	public static String print(String name, char[] s) {   	                           W>n    _�                            ����                                                                                                                                                                                                                                                                                                                                                             W>L     �   2   4          	};�   1   3          *		112, 117, 116, 41, 59, 10, 125, 10, 10, �   0   2          e		32, 32, 83, 121, 115, 116, 101, 109, 46, 111, 117, 116, 46, 112, 114, 105, 110, 116, 40, 105, 110, �   /   1          a		32, 80, 40, 83, 116, 114, 105, 110, 103, 32, 105, 110, 112, 117, 116, 41, 32, 123, 10, 32, 32, �   .   0          c		125, 10, 10, 112, 117, 98, 108, 105, 99, 32, 115, 116, 97, 116, 105, 99, 32, 118, 111, 105, 100, �   -   /          _		34, 59, 10, 9, 9, 114, 101, 116, 117, 114, 110, 32, 111, 117, 116, 112, 117, 116, 59, 10, 9, �   ,   .          ^		9, 9, 111, 117, 116, 112, 117, 116, 32, 43, 61, 32, 34, 92, 110, 92, 116, 125, 59, 92, 110, �   +   -          [		112, 117, 116, 32, 43, 61, 32, 34, 92, 110, 92, 116, 92, 116, 34, 59, 10, 9, 9, 125, 10, �   *   ,          U		32, 37, 32, 50, 49, 41, 32, 61, 61, 32, 50, 48, 41, 10, 9, 9, 9, 9, 111, 117, 116, �   )   +          W		91, 105, 93, 32, 43, 32, 34, 44, 32, 34, 59, 10, 9, 9, 9, 105, 102, 32, 40, 40, 105, �   (   *          ^		123, 10, 9, 9, 9, 111, 117, 116, 112, 117, 116, 32, 43, 61, 32, 40, 105, 110, 116, 41, 115, �   '   )          _		59, 32, 105, 32, 60, 32, 115, 46, 108, 101, 110, 103, 116, 104, 59, 32, 105, 43, 43, 41, 32, �   &   (          \		92, 116, 34, 59, 10, 9, 9, 102, 111, 114, 32, 40, 105, 110, 116, 32, 105, 32, 61, 32, 48, �   %   '          \		32, 34, 32, 43, 32, 110, 97, 109, 101, 32, 43, 32, 34, 32, 61, 32, 123, 92, 110, 92, 116, �   $   &          _		117, 116, 32, 61, 32, 34, 92, 116, 115, 116, 97, 116, 105, 99, 32, 99, 104, 97, 114, 91, 93, �   #   %          _		91, 93, 32, 115, 41, 32, 123, 10, 9, 9, 83, 116, 114, 105, 110, 103, 32, 111, 117, 116, 112, �   "   $          c		105, 110, 116, 40, 83, 116, 114, 105, 110, 103, 32, 110, 97, 109, 101, 44, 32, 99, 104, 97, 114, �   !   #          c		98, 108, 105, 99, 32, 115, 116, 97, 116, 105, 99, 32, 83, 116, 114, 105, 110, 103, 32, 112, 114, �       "          _		40, 115, 111, 117, 114, 99, 101, 67, 111, 100, 101, 41, 59, 10, 9, 125, 10, 10, 9, 112, 117, �      !          \		111, 117, 114, 99, 101, 67, 111, 100, 101, 32, 43, 61, 32, 34, 125, 34, 59, 10, 9, 9, 80, �                 \		32, 112, 114, 105, 110, 116, 40, 34, 115, 49, 34, 44, 32, 115, 49, 41, 59, 10, 9, 9, 115, �                ]		40, 115, 49, 41, 59, 10, 9, 9, 115, 111, 117, 114, 99, 101, 67, 111, 100, 101, 32, 43, 61, �                d		117, 114, 99, 101, 67, 111, 100, 101, 32, 61, 32, 110, 101, 119, 32, 83, 116, 114, 105, 110, 103, �                _		93, 32, 97, 114, 103, 115, 41, 32, 123, 10, 9, 9, 83, 116, 114, 105, 110, 103, 32, 115, 111, �                d		116, 105, 99, 32, 118, 111, 105, 100, 32, 109, 97, 105, 110, 40, 83, 116, 114, 105, 110, 103, 91, �                a		114, 99, 101, 67, 111, 100, 101, 32, 123, 10, 9, 112, 117, 98, 108, 105, 99, 32, 115, 116, 97, �                a		112, 117, 98, 108, 105, 99, 32, 99, 108, 97, 115, 115, 32, 80, 79, 110, 77, 121, 83, 111, 117, �                	static char[] s1 = {�                	}�                		return output;�                		output += "\n\t};\n";�                		}�                				output += "\n\t\t";�                			if ((i % 21) == 20)�                			output += (int)s[i] + ", ";�   
             &		for (int i = 0; i < s.length; i++) {�   	             ;		String output = "\tstatic char[] " + name + " = {\n\t\t";�      
          4	public static String print(String name, char[] s) {�                	}�                		P(sourceCode);�                		sourceCode += "}";�                 		sourceCode += print("s1", s1);�                %		String sourceCode = new String(s1);�                )	public static void main(String[] args) {5�_�                            ����                                                                                                                                                                                                                                                                                                                                                             W>T    �   2   4          	};�   1   3          *		112, 117, 116, 41, 59, 10, 125, 10, 10, �   0   2          e		32, 32, 83, 121, 115, 116, 101, 109, 46, 111, 117, 116, 46, 112, 114, 105, 110, 116, 40, 105, 110, �   /   1          a		32, 80, 40, 83, 116, 114, 105, 110, 103, 32, 105, 110, 112, 117, 116, 41, 32, 123, 10, 32, 32, �   .   0          c		125, 10, 10, 112, 117, 98, 108, 105, 99, 32, 115, 116, 97, 116, 105, 99, 32, 118, 111, 105, 100, �   -   /          _		34, 59, 10, 9, 9, 114, 101, 116, 117, 114, 110, 32, 111, 117, 116, 112, 117, 116, 59, 10, 9, �   ,   .          ^		9, 9, 111, 117, 116, 112, 117, 116, 32, 43, 61, 32, 34, 92, 110, 92, 116, 125, 59, 92, 110, �   +   -          [		112, 117, 116, 32, 43, 61, 32, 34, 92, 110, 92, 116, 92, 116, 34, 59, 10, 9, 9, 125, 10, �   *   ,          U		32, 37, 32, 50, 49, 41, 32, 61, 61, 32, 50, 48, 41, 10, 9, 9, 9, 9, 111, 117, 116, �   )   +          W		91, 105, 93, 32, 43, 32, 34, 44, 32, 34, 59, 10, 9, 9, 9, 105, 102, 32, 40, 40, 105, �   (   *          ^		123, 10, 9, 9, 9, 111, 117, 116, 112, 117, 116, 32, 43, 61, 32, 40, 105, 110, 116, 41, 115, �   '   )          _		59, 32, 105, 32, 60, 32, 115, 46, 108, 101, 110, 103, 116, 104, 59, 32, 105, 43, 43, 41, 32, �   &   (          \		92, 116, 34, 59, 10, 9, 9, 102, 111, 114, 32, 40, 105, 110, 116, 32, 105, 32, 61, 32, 48, �   %   '          \		32, 34, 32, 43, 32, 110, 97, 109, 101, 32, 43, 32, 34, 32, 61, 32, 123, 92, 110, 92, 116, �   $   &          _		117, 116, 32, 61, 32, 34, 92, 116, 115, 116, 97, 116, 105, 99, 32, 99, 104, 97, 114, 91, 93, �   #   %          _		91, 93, 32, 115, 41, 32, 123, 10, 9, 9, 83, 116, 114, 105, 110, 103, 32, 111, 117, 116, 112, �   "   $          c		105, 110, 116, 40, 83, 116, 114, 105, 110, 103, 32, 110, 97, 109, 101, 44, 32, 99, 104, 97, 114, �   !   #          c		98, 108, 105, 99, 32, 115, 116, 97, 116, 105, 99, 32, 83, 116, 114, 105, 110, 103, 32, 112, 114, �       "          _		40, 115, 111, 117, 114, 99, 101, 67, 111, 100, 101, 41, 59, 10, 9, 125, 10, 10, 9, 112, 117, �      !          \		111, 117, 114, 99, 101, 67, 111, 100, 101, 32, 43, 61, 32, 34, 125, 34, 59, 10, 9, 9, 80, �                 \		32, 112, 114, 105, 110, 116, 40, 34, 115, 49, 34, 44, 32, 115, 49, 41, 59, 10, 9, 9, 115, �                ]		40, 115, 49, 41, 59, 10, 9, 9, 115, 111, 117, 114, 99, 101, 67, 111, 100, 101, 32, 43, 61, �                d		117, 114, 99, 101, 67, 111, 100, 101, 32, 61, 32, 110, 101, 119, 32, 83, 116, 114, 105, 110, 103, �                _		93, 32, 97, 114, 103, 115, 41, 32, 123, 10, 9, 9, 83, 116, 114, 105, 110, 103, 32, 115, 111, �                d		116, 105, 99, 32, 118, 111, 105, 100, 32, 109, 97, 105, 110, 40, 83, 116, 114, 105, 110, 103, 91, �                a		114, 99, 101, 67, 111, 100, 101, 32, 123, 10, 9, 112, 117, 98, 108, 105, 99, 32, 115, 116, 97, �                a		112, 117, 98, 108, 105, 99, 32, 99, 108, 97, 115, 115, 32, 80, 79, 110, 77, 121, 83, 111, 117, �                	static char[] s1 = {�                	}�                		return output;�                		output += "\n\t};\n";�                		}�                				output += "\n\t\t";�                			if ((i % 21) == 20)�                			output += (int)s[i] + ", ";�   
             &		for (int i = 0; i < s.length; i++) {�   	             ;		String output = "\tstatic char[] " + name + " = {\n\t\t";�      
          4	public static String print(String name, char[] s) {�                	}�                		P(sourceCode);�                		sourceCode += "}";�                 		sourceCode += print("s1", s1);�                %		String sourceCode = new String(s1);�                )	public static void main(String[] args) {5�_�                             ����                                                                                                                                                                                                                                                                                                                                                V       W>m    �         4      $public static void P(String input) {       System.out.print(input);   }5�_�                     	        ����                                                                                                                                                                                                                                                                                                                                                             W>6     �      
   4      6  	public static String print(String name, char[] s) {5��