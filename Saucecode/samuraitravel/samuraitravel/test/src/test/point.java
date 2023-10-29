package test;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class point {
	// 2つのベクトルの外積を計算するメソッド
	private static int crossProduct(Point A, Point B, Point C) {
		int x1 = B.x - A.x;
		int y1 = B.y - A.y;
		int x2 = C.x - A.x;
		int y2 = C.y - A.y;
		return x1 * y2 - x2 * y1;
	}

	// 線分ABと線分CDが交差するかどうかを判定するメソッド
	private static boolean doIntersect(Point A, Point B, Point C, Point D) {
		int cp1 = crossProduct(A, B, C);
		int cp2 = crossProduct(A, B, D);
		int cp3 = crossProduct(C, D, A);
		int cp4 = crossProduct(C, D, B);

		// 線分ABと線分CDが交差する条件
		if ((cp1 * cp2 < 0) && (cp3 * cp4 < 0)) {
			return true;
		}

		// 特殊なケース：線分ABが線分CDの一方の端点を含む場合
		if (cp1 == 0 && onSegment(A, B, C)) {
			return true;
		}

		if (cp2 == 0 && onSegment(A, B, D)) {
			return true;
		}

		if (cp3 == 0 && onSegment(C, D, A)) {
			return true;
		}

		if (cp4 == 0 && onSegment(C, D, B)) {
			return true;
		}

		return false;
	}

	// 点Pが線分AB上にあるかどうかを判定するメソッド
	private static boolean onSegment(Point A, Point B, Point P) {
		return (P.x >= Math.min(A.x, B.x) && P.x <= Math.max(A.x, B.x) &&
				P.y >= Math.min(A.y, B.y) && P.y <= Math.max(A.y, B.y));
	}

	public static void main(String[] args) {
		// 4つの点の座標を設定
		Point A = new Point(1, 1);
		Point B = new Point(10, 1);
		Point C = new Point(1, 2);
		Point D = new Point(10, 2);

		// 交差判定
		boolean isIntersect = doIntersect(A, B, C, D);

		if (isIntersect) {
			System.out.println("線分ABと線分CDは交差します。");
		} else {
			System.out.println("線分ABと線分CDは交差しません。");
		}
	}
}