import java.util.Scanner;

public class Mr_Thomas extends Exception {

	public static void main(String[] args) {
		String exe = null;
		do {
			exe = "A";
			int j = 1, i = 1, t = 0;
			int no = 0;
			Scanner sr = null;
			while (no == (int) no) {
				System.out.println("Enter number of subjects");
				sr = new Scanner(System.in);
				try {
					no = sr.nextInt();
				} catch (Exception ex) {
					System.out
							.println("input exception please enter integer value");
					continue;
				}
				break;
			}
			int Marks[] = new int[no];
			while (j <= no) {
				while (i <= no) {
					Scanner src = new Scanner(System.in);
					int x = 0;
					System.out.println("Enter marks for subject " + i);
					try {
						x = src.nextInt();
					} catch (Exception e) {
						System.out
								.println("input exception please enter integer value");
						break;
					}

					if (x > 100 || x < 0) {
						System.out
								.println("please enter marks between 1 to 100");
						break;

					} else {
						Marks[i - 1] = x;
						t = t + Marks[i - 1];
						i = i + 1;
					}

				}

				if (i > no) {
					float average = t / no;
					if (average < 40) {
						System.out
								.println("This student is in the POOR Category!! The precentage is "
										+ average);
					} else if (average >= 40 && average < 60) {
						System.out
								.println("This student is in the AVERAGE Category!! The precentage is "
										+ average);
					} else if (average >= 60 && average < 80) {
						System.out
								.println("This student is in the GOOD Category!! The precentage is "
										+ average);
					} else if (average >= 80 && average < 90) {
						System.out
								.println("This student is in the VERY GOOD Category!! The precentage is "
										+ average);
					} else if (average >= 90) {
						System.out
								.println("This student is in the EXCELLENT Category!! The precentage is "
										+ average);
					}
					i = 1;
					t = 0;
					System.out.println("Enter E for Exit. C to continue");
					exe = sr.next();
					if (exe.equalsIgnoreCase("e")) {
						System.exit(0);

					}
				}
				if (exe.equalsIgnoreCase("c")) {
					break;
				}

			}
		} while (exe.equalsIgnoreCase("c"));
	}

}
