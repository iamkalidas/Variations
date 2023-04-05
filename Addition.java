package HefShine;

public class Addition {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {6,4,3}};
        int[][] b = {{1,2,3}, {4,5,6}, {6,4,3}};
        int[][] c = new int[a.length][b[0].length];
        add(a,b,c);
    }
    public static void add(int[][] a, int[][] b, int[][] c) {
        addLoopI(a,b,c,0);
        printi(c,0);
    }

    private static void printi(int[][] c, int i) {
        if(i<c.length){
            printj(c,i,0);
            System.out.println();
            printi(c,++i);
        }
    }

    private static void printj(int[][] c, int i, int i1) {
        if(i1<c.length)
        {
            System.out.print(c[i][i1]+" ");
            printj(c,i,++i1);
        }
    }

    private static void addLoopI(int[][] a, int[][] b, int[][] c, int i) {
        if(i<c.length)
        {
            addLoopj(a,b,c,i,0);
            addLoopI(a,b,c,++i);
        }
    }

    private static void addLoopj(int[][] a, int[][] b, int[][] c, int i, int i1) {
        if(i1<a.length)
        {
            c[i][i1]=a[i][i1]+b[i][i1];
            addLoopj(a,b,c,i,++i1);
        }
    }
}
