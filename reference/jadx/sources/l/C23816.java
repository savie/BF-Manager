package l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R147 */
/* JADX INFO: loaded from: classes.dex */
public final class C23816 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f77009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3353 f77011;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11697 f77012;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f77013;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f77015;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Path f77016;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3353 f77017;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f77010 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f77008 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public RectF f77014 = new RectF();

    public C23816(C11697 c11697, C3353 c3353, C3353 c3354, int i) {
        this.f77012 = c11697;
        this.f77017 = c3353;
        this.f77011 = c3354;
        this.f77013 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52496(String str, String str2) {
        this.f77015 = str;
        this.f77009 = str2;
        Path pathM49743 = C22420.m49743(str2);
        this.f77016 = pathM49743;
        pathM49743.computeBounds(this.f77014, true);
        ArrayList<Path> arrayList = this.f77010;
        arrayList.clear();
        ArrayList arrayList2 = this.f77008;
        arrayList2.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C5486 c5486 : C22420.m49741(str)) {
            float[] fArrM15154 = c5486.m15154();
            char cM15155 = c5486.m15155();
            if (cM15155 == 'C') {
                for (int i = 0; i < fArrM15154.length; i += 6) {
                    Path path = new Path();
                    path.moveTo(f, f2);
                    int i2 = i + 4;
                    int i3 = i + 5;
                    path.cubicTo(fArrM15154[i], fArrM15154[i + 1], fArrM15154[i + 2], fArrM15154[i + 3], fArrM15154[i2], fArrM15154[i3]);
                    arrayList.add(path);
                    f = fArrM15154[i2];
                    f2 = fArrM15154[i3];
                }
            } else if (cM15155 == 'M') {
                if (fArrM15154.length != 2) {
                    throw new RuntimeException(str);
                }
                f = fArrM15154[0];
                f2 = fArrM15154[1];
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
    public final void m52495(Canvas canvas, C4916 c4916, RectF rectF, float f) {
        float f2;
        int i = this.f77013;
        if (i == 1) {
            float f3 = C11116.f37735;
            c4916.setColor(C20368.m45983(-3597012, -65536));
        } else if (i == 2) {
            float f4 = C11116.f37735;
            c4916.setColor(C20368.m45983(-12683063, -14671696));
        } else if (i == 3) {
            float f5 = C11116.f37735;
            c4916.setColor(C20368.m45983(-5334989, -2047968));
        } else if (i != 4 && i == 5) {
            float f6 = C11116.f37735;
            c4916.setColor(C20368.m45983(-12550080, -11503536));
        } else {
            float f7 = C11116.f37735;
            c4916.setColor(C20368.m45983(-4144960, -15724528));
        }
        int i2 = this.f77012.f39324;
        if (i2 == -1) {
            f2 = 2.0f;
        } else if (i2 == this.f77017.f12423 || i2 == this.f77011.f12423) {
            f2 = 4.0f;
        } else {
            c4916.setAlpha(C20368.m45983(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 90));
            f2 = 2.0f;
        }
        float f8 = C11116.f37735;
        float f9 = f2 * f8 * f;
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        int i3 = 0;
        if (i == 3 || i == 5) {
            c4916.setPathEffect(new DashPathEffect(new float[]{8.0f * f8 * f, f8 * 6.0f * f}, 0.0f));
        }
        c4916.setStyle(Paint.Style.STROKE);
        c4916.setStrokeWidth(f9);
        while (true) {
            ArrayList arrayList = this.f77008;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((RectF) arrayList.get(i3)).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                ((Path) this.f77010.get(i3)).transform(matrix, path);
                canvas.drawPath(path, c4916);
            }
            i3++;
        }
        if (i == 3 || i == 5) {
            c4916.setPathEffect(null);
        }
        if (this.f77014.intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
            c4916.setStyle(Paint.Style.FILL);
            this.f77016.transform(matrix, path);
            canvas.drawPath(path, c4916);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23816.class != obj.getClass()) {
            return false;
        }
        C23816 c23816 = (C23816) obj;
        if (this.f77017.equals(c23816.f77017)) {
            return this.f77011.equals(c23816.f77011);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f77017.f12423 * 31) + this.f77011.f12423;
    }

    public C23816(C11697 c11697, C17367 c17367) {
        this.f77012 = c11697;
        ArrayList arrayList = c11697.f39321;
        this.f77017 = (C3353) arrayList.get(c17367.readInt());
        this.f77011 = (C3353) arrayList.get(c17367.readInt());
        this.f77013 = c17367.readInt();
        if (c17367.readByte() != 0) {
            m52496(c17367.m40458(), c17367.m40458());
        }
    }
}
