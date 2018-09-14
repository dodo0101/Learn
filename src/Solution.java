
import java.util.ArrayList;
import java.util.List;

/* 
��� - ������� ������ � ������������
*/

public class Solution {
    public static interface Alive {
        boolean containsBones();
    }

    public static class BodyPart implements Alive {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public boolean containsBones() {
            return true;
        }

        public String toString() {
            return containsBones() ? name + " �������� �����" : name + " �� �������� �����";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public boolean containsBones() {
            return super.containsBones() && !isArtificial;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();
    }

    private static void printlnAlives() {
        System.out.println(new BodyPart("����").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("������"));
        bodyParts.add(new BodyPart("����"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("������������", true));
        fingers.add(new Finger("�������", true));
        fingers.add(new Finger("����������", false));
        fingers.add(new Finger("�������", true));
        System.out.println(fingers.toString());
    }
}

