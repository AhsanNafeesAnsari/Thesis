/*
 * import java.awt.Color; import java.awt.Graphics2D; import java.awt.Image;
 * import java.awt.Point; import java.awt.Toolkit; import java.awt.geom.Line2D;
 * import java.io.IOException; import java.util.HashMap; import
 * java.util.HashSet;
 * 
 * import javax.swing.table.DefaultTableModel;
 * 
 * 
 * public class Main extends javax.swing.JFrame{
 * 
 * private static boolean b = false, exists = false; private static int
 * NODE_SIZE = 40; private static Graphics2D buffer; private static int[][]
 * costs; private static Image img; private static HashMap<Integer, Point>
 * nodesLocation; private static HashMap<Integer, HashSet<Integer>> links;
 * private static HashMap<Integer, Point> loc; private static HashMap<Integer,
 * HashSet<Integer>> nodes;
 * 
 * private static HashMap<Integer, Integer> connections; private static int
 * selecedNode; private static double offset = 0.07 % 1; private double phi =
 * Math.toRadians(30); private int barb = 10; private static Integer id = 0;
 * private static int row = 0; private static int sourceNode = -1; private
 * static int destNode = -1; private DefaultTableModel costTableModel;
 * 
 * 
 * private void drawArrowHead(Graphics2D g2, int tipY, int tipX, int tailY, int
 * tailX, Color color) { g2.setPaint(color); double dy = tipY - tailY; double dx
 * = tipX - tailX; double theta = Math.atan2(dy, dx);
 * //System.out.println("theta " " + Math.toDegrees (theta)); double x, y, rho =
 * theta + phi; for(int j = 0; j < 2; j++) { x = tipX - barb * Math.cos(rho); y
 * = tipY - barb * Math.sin(rho); g2.draw(new Line2D.Double(tipX, tipY, x, y));
 * rho = theta - phi; } }
 * 
 * public MAIN() { initComponents(); selectedNode = -1;
 * setSize(Toolkit.getDefaultToolkit().getScreenSize()); img =
 * createImage(graph.getWidth() - 2, graph.getHeight() - 2); buffer =
 * (Graphics2D) img.getGraphics(); nodesLocation = new HashMap<>(); links = new
 * HashMap<>(); costTableModel = (DefaultTableModel) costTable.getModel(); }
 * 
 * public static void drawGraph() throws IOException{
 * 
 * }
 * 
 * public static void drawDottedLine(Graphics2D g, Point p1, Point p2, double
 * offset) { long total = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y
 * - p1.y); total = (long) Math.sqrt(total); for(long i = (long) (offset * 20);
 * i <= total; i += 20) { int x1 = (int) (p1.x + (p2.x - p1.x) * i / total); int
 * y1 = (int) (p1.y + (p2.y - p1.y) * i / total); int x2 = (int) (p1.x + (p2.x -
 * p1.x) * Math.min(i + 5, total) / total); int y2 = (int) (p1.y + (p2.y - p1.y)
 * * Math.min(i + 5, total) / total); g.drawLine(x1, y1, x2, y2); } }
 * 
 * private int selectedNode(int xcoordinate, int ycoordinate) { for(int i = 0; i
 * < nodesLocation.size(); i++) { Point thePoint = (Point)
 * nodesLocation.values().toArray()[i]; int deltaX = xcoordinate - (thePoint.x -
 * NODE_SIZE / 2);
 * 
 * int deltaY = ycoordinate - (thePoint.y - NODE_SIZE / 2); if(Math.sqrt(deltaX
 * * deltaX + deltaY * deltaY) <= NODE_SIZE + 6) { return (int)
 * nodesLocation.keySet().toArray()[i]; } } return -1; }
 * 
 * public static HashMap<Integer, HashSet<Integer>> getLinks(){ nodes =
 * (HashMap<Integer, HashSet<Integer>>) links.clone(); return nodes; }
 * 
 * public static int[][] getCosts(){ return costs; }
 * 
 * public static void drawPath() {
 * 
 * }
 * 
 * }
 */