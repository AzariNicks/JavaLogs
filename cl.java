import java.util.*;

public class cl {


    public static String addYellow(String s) {
        String yellow = "\u001B[33m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addGreen(String s) {
        String yellow = "\u001B[32m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addRed(String s) {
        String yellow = "\u001B[31m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addBlue(String s) {
        String yellow = "\u001B[34m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addPurple(String s) {
        String yellow = "\u001B[35m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addCyan(String s) {
        String yellow = "\u001B[36m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static String addGrey(String s) {
        String yellow = "\u001B[37m";
        StringBuilder ourS = new StringBuilder();
        ourS.append(yellow);
        ourS.append(s);
        return ourS.toString();
    }

    public static void log() {
        System.out.println("Your Trying To Print Nothing Lol ");
    }

    public static void log(Object o) {
        Class<?> type = o.getClass();
        log( addPurple("The type of the object is: " ) + type.getName());
         if(o instanceof String[][]) {
             String[][] arr = (String[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }

         else if(o instanceof int[][]) {
             int[][] arr = (int[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof boolean[][]) {
             boolean[][] arr = (boolean[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof long[][]) {
             long[][] arr = (long[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof char[][]) {
             char[][] arr = (char[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof float[][]) {
             float[][] arr = (float[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof byte[][]) {
             byte[][] arr = (byte[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof short[][]) {
             short[][] arr = (short[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
         else if(o instanceof double[][]) {
             double[][] arr = (double[][]) o;
             for (int i = 0; i < arr.length; i++) {
                 log(arr[i]);
             }
         }
    }

    public static void log(String s) {
        System.out.println(s);
    }

    public static void log(char c) {
        System.out.println(c);
    }

    public static void log(boolean b) {
        System.out.println(b);
    }

    public static void log(int i) {
        System.out.println(i);
    }

    public static void log(long l) {
        System.out.println(l);
    }

    public static void log(float f) {
        System.out.println(f);
    }

    public static void log(byte b) {
        System.out.println(b);
    }

    public static void log(short s) {
        System.out.println(s);
    }

    public static void log(double d) {
        System.out.println(d);
    }
// Okay, okay for all the array's  we will add the blue color
    public static void log(String[] stringArray) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < stringArray.length) {
            if (i == stringArray.length - 1) {
                s.append("  ").append(stringArray[i]).append("   ]");
            } else {
                s.append("  ").append(stringArray[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(printThis);

    }
    public static void log(Integer[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
//        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(",");
            }
            i++;
        }
        String printThis = s.toString();
        System.out.println(addCyan(printThis));
    }
    public static void log(int[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
//        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(",");
            }
            i++;
        }
        String printThis = s.toString();
        System.out.println(addCyan(printThis));
    }
    public static void log(Character[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        System.out.println(addCyan(printThis));
    }
    public static void log(char[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        System.out.println(addCyan(printThis));
    }
    public static void log(long[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
          log(addCyan(printThis));
    }
    public static void log(Boolean[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(boolean[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(Long[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
       log(addCyan(printThis));
    }
    public static void log(Short[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(short[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(Byte[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(byte[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(Float[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(float[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static void log(double[] ints) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int i = 0;
        s.append("\n");
        while (i < ints.length) {
            if (i == ints.length - 1) {
                s.append("  ").append(ints[i]).append("   ]");
            } else {
                s.append("  ").append(ints[i]).append(", \n");
            }
            i++;
        }
        String printThis = s.toString();
        log(addCyan(printThis));
    }
    public static <K, V> void log(HashMap<K, V> map) {
        StringBuilder s = new StringBuilder();
        s.append("{\n");
        for (K key : map.keySet()) {
            s.append("  ").append(key).append("=").append(map.get(key)).append(",\n");
        }
        s.append("}");
        String printThis = s.toString();
        log(addYellow(printThis));
    }
    public static <K, V> void log(TreeMap<K, V> map) {
        StringBuilder s = new StringBuilder();
        s.append("{\n");
        for (K key : map.keySet()) {
            s.append("  ").append(key).append("=").append(map.get(key)).append(",\n");
        }
        s.append("}");
        String printThis = s.toString();
        log(addYellow(printThis));
    }
    public static <K> void log(ArrayList<K> arrayList){
        StringBuilder s = new StringBuilder();
        s.append("[\n");
        arrayList.forEach((ele)->{
            s.append("  ").append(ele.toString()).append(",\n");
        });
        s.append("] ");
        log(addRed(s.toString()));
    }
    public static <K> void log(LinkedList<K> listInQ) {
        StringBuilder s = new StringBuilder();
        s.append("[\n");
        listInQ.forEach((ele) ->{
            s.append("  ").append(ele.toString()).append(",\n");

        });
        s.append("] ");
        log(addRed(s.toString()));
    }
    public static <K> void log (HashSet<K> hashSet){
        StringBuilder s = new StringBuilder();
        s.append("[\n");
        hashSet.forEach((ele)->{
            s.append("  ").append(ele.toString()).append(",\n");
        });
        s.append("] ");
        log(addRed(s.toString()));
    }
    public static <K> void log (TreeSet<K> ts){
        StringBuilder s = new StringBuilder();
        s.append("[\n");
        ts.forEach((ele)->{
            s.append("  ").append(ele.toString()).append(",\n");
        });
        s.append("] ");
        log(addRed(s.toString()));
    }
    public static <K> void log (Stack<K> stack){
        StringBuilder s = new StringBuilder();
        s.append("[\n");
        Stack<K> copy = stack;
        while (!copy.empty()){
            s.append("  ").append(copy.pop().toString()).append(",\n");
        }
        s.append("] ");
        log(addRed(s.toString()));
    }











}
