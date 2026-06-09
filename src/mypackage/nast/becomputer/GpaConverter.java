package mypackage.nast.becomputer;

public class GpaConverter {
	public static double gradeToGpa(String grade) {
		switch (grade) {
            case "A" -> {
                return 4.0F;
            }
            case "A-" -> {
                return 3.7F;
            }
            case "B+" -> {
                return 3.3F;
            }
            case "B" -> {
                return 3.0F;
            }
            case "B-" -> {
                return 2.7F;
            }
            case "C+" -> {
                return 2.3F;
            }
            case "C" -> {
                return 2.0F;
            }
            case "C-" -> {
                return 1.7F;
            }
            case "D+" -> {
                return 1.3F;
            }
            case "D" -> {
                return 1.0F;
            }
            case "F" -> {
                return 0.0F;
            }
      		  }

		return 100F;
	}
}