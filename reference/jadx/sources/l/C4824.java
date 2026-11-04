package l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R147 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19740 f16871;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f16872;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f16874;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19740 f16876;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5570 f16877;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Path f16878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f16879;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f16870 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f16875 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public RectF f16873 = new RectF();

    public C4824(C5570 c5570, C19740 c19740, C19740 c19741, int i) {
        this.f16877 = c5570;
        this.f16876 = c19740;
        this.f16871 = c19741;
        this.f16874 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14859(String str, String str2) {
        this.f16872 = str;
        this.f16879 = str2;
        Path pathM56212 = C25210.m56212(str2);
        this.f16878 = pathM56212;
        pathM56212.computeBounds(this.f16873, true);
        ArrayList<Path> arrayList = this.f16870;
        arrayList.clear();
        ArrayList arrayList2 = this.f16875;
        arrayList2.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C11783 c11783 : C25210.m56210(str)) {
            float[] fArrM29611 = c11783.m29611();
            char cM29612 = c11783.m29612();
            if (cM29612 == 'C') {
                for (int i = 0; i < fArrM29611.length; i += 6) {
                    Path path = new Path();
                    path.moveTo(f, f2);
                    int i2 = i + 4;
                    int i3 = i + 5;
                    path.cubicTo(fArrM29611[i], fArrM29611[i + 1], fArrM29611[i + 2], fArrM29611[i + 3], fArrM29611[i2], fArrM29611[i3]);
                    arrayList.add(path);
                    f = fArrM29611[i2];
                    f2 = fArrM29611[i3];
                }
            } else if (cM29612 == 'M') {
                if (fArrM29611.length != 2) {
                    throw new RuntimeException(str);
                }
                f = fArrM29611[0];
                f2 = fArrM29611[1];
            } else {
                throw new RuntimeException(str);
            }
        }
        for (Path path2 : arrayList) {
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            arrayList2.add(rectF);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14858(Canvas canvas, C10232 c10232, RectF rectF, float f) {
        float f2;
        int i = this.f16874;
        if (i == 1) {
            float f3 = C14035.f44475;
            c10232.setColor(C3296.m10871(-3597012, -65536));
        } else if (i == 2) {
            float f4 = C14035.f44475;
            c10232.setColor(C3296.m10871(-12683063, -14671696));
        } else if (i == 3) {
            float f5 = C14035.f44475;
            c10232.setColor(C3296.m10871(-5334989, -2047968));
        } else if (i != 4 && i == 5) {
            float f6 = C14035.f44475;
            c10232.setColor(C3296.m10871(-12550080, -11503536));
        } else {
            float f7 = C14035.f44475;
            c10232.setColor(C3296.m10871(-4144960, -15724528));
        }
        int i2 = this.f16877.f19353;
        if (i2 == -1) {
            f2 = 2.0f;
        } else if (i2 == this.f16876.f63550 || i2 == this.f16871.f63550) {
            f2 = 4.0f;
        } else {
            c10232.setAlpha(C3296.m10871(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 90));
            f2 = 2.0f;
        }
        float f8 = C14035.f44475;
        float f9 = f2 * f8 * f;
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        int i3 = 0;
        if (i == 3 || i == 5) {
            c10232.setPathEffect(new DashPathEffect(new float[]{8.0f * f8 * f, f8 * 6.0f * f}, 0.0f));
        }
        c10232.setStyle(Paint.Style.STROKE);
        c10232.setStrokeWidth(f9);
        while (true) {
            ArrayList arrayList = this.f16875;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((RectF) arrayList.get(i3)).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                ((Path) this.f16870.get(i3)).transform(matrix, path);
                canvas.drawPath(path, c10232);
            }
            i3++;
        }
        if (i == 3 || i == 5) {
            c10232.setPathEffect(null);
        }
        if (this.f16873.intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
            c10232.setStyle(Paint.Style.FILL);
            this.f16878.transform(matrix, path);
            canvas.drawPath(path, c10232);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4824.class != obj.getClass()) {
            return false;
        }
        C4824 c4824 = (C4824) obj;
        if (this.f16876.equals(c4824.f16876)) {
            return this.f16871.equals(c4824.f16871);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16876.f63550 * 31) + this.f16871.f63550;
    }

    public C4824(C5570 c5570, C20348 c20348) {
        this.f16877 = c5570;
        ArrayList arrayList = c5570.f19354;
        this.f16876 = (C19740) arrayList.get(c20348.readInt());
        this.f16871 = (C19740) arrayList.get(c20348.readInt());
        this.f16874 = c20348.readInt();
        if (c20348.readByte() != 0) {
            m14859(c20348.m46758(), c20348.m46758());
        }
    }
}
