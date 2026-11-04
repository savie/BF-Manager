package l;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17553 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15380 f57048;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f57049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14064 f57052;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f57050 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57053 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f57051 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6509(float f, View view);

    public final String toString() {
        String string = this.f57049;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (C16807 c16807 : this.f57051) {
            StringBuilder sbM10405 = C3188.m10405(string, "[");
            sbM10405.append(c16807.f54233);
            sbM10405.append(" , ");
            sbM10405.append(decimalFormat.format(c16807.f54235));
            sbM10405.append("] ");
            string = sbM10405.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41211(String str) {
        this.f57049 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m41207(float f) {
        C14064 c14064 = this.f57052;
        AbstractC3624 abstractC3624 = c14064.f44518;
        if (abstractC3624 != null) {
            abstractC3624.mo11773(f, c14064.f44521);
        } else {
            double[] dArr = c14064.f44521;
            dArr[0] = c14064.f44524[0];
            dArr[1] = c14064.f44519[0];
        }
        return (float) ((c14064.f44520.m13876(f) * c14064.f44521[1]) + c14064.f44521[0]);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m41212(float f) {
        C14064 c14064 = this.f57052;
        C4370 c4370 = c14064.f44520;
        AbstractC3624 abstractC3624 = c14064.f44518;
        if (abstractC3624 != null) {
            double d = f;
            abstractC3624.mo11777(d, c14064.f44522);
            c14064.f44518.mo11773(d, c14064.f44521);
        } else {
            double[] dArr = c14064.f44522;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d2 = f;
        double dM13876 = c4370.m13876(d2);
        double dM13874 = c4370.m13874(d2);
        double[] dArr2 = c14064.f44522;
        return (float) ((dM13874 * c14064.f44521[1]) + (dM13876 * dArr2[1]) + dArr2[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41210(int i, int i2, int i3, float f, float f2, float f3, C15380 c15380) {
        this.f57051.add(new C16807(f, f2, f3, i));
        if (i3 != -1) {
            this.f57053 = i3;
        }
        this.f57050 = i2;
        this.f57048 = c15380;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41209(int i, int i2, int i3, float f, float f2, float f3) {
        this.f57051.add(new C16807(f, f2, f3, i));
        if (i3 != -1) {
            this.f57053 = i3;
        }
        this.f57050 = i2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41208() {
        int i;
        ArrayList<C16807> arrayList = this.f57051;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C2878());
        double[] dArr = new double[size];
        char c = 1;
        char c2 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 2);
        int i2 = this.f57050;
        C14064 c14064 = new C14064();
        C4370 c4370 = new C4370();
        c14064.f44520 = c4370;
        new HashMap();
        c4370.m13873(i2);
        c14064.f44519 = new float[size];
        c14064.f44523 = new double[size];
        c14064.f44525 = new float[size];
        c14064.f44524 = new float[size];
        float[] fArr = new float[size];
        this.f57052 = c14064;
        int i3 = 0;
        for (C16807 c16807 : arrayList) {
            float f = c16807.f54234;
            dArr[i3] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i3];
            float f2 = c16807.f54235;
            dArr3[c2] = f2;
            float f3 = c16807.f54232;
            dArr3[c] = f3;
            C14064 c14065 = this.f57052;
            c14065.f44523[i3] = ((double) c16807.f54233) / 100.0d;
            c14065.f44525[i3] = f;
            c14065.f44524[i3] = f3;
            c14065.f44519[i3] = f2;
            i3++;
            c = 1;
            c2 = 0;
        }
        C14064 c14066 = this.f57052;
        float[] fArr2 = c14066.f44525;
        C4370 c4371 = c14066.f44520;
        double[] dArr4 = c14066.f44523;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, dArr4.length, 2);
        float[] fArr3 = c14066.f44519;
        c14066.f44521 = new double[fArr3.length + 1];
        c14066.f44522 = new double[fArr3.length + 1];
        if (dArr4[0] > 0.0d) {
            c4371.m13872(0.0d, fArr2[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            c4371.m13872(1.0d, fArr2[length]);
        }
        for (int i4 = 0; i4 < dArr5.length; i4++) {
            dArr5[i4][0] = c14066.f44524[i4];
            for (int i5 = 0; i5 < fArr3.length; i5++) {
                dArr5[i5][1] = fArr3[i5];
            }
            c4371.m13872(dArr4[i4], fArr2[i4]);
        }
        c4371.m13871();
        if (dArr4.length > 1) {
            i = 0;
            c14066.f44518 = AbstractC3624.m11757(0, dArr4, dArr5);
        } else {
            i = 0;
            c14066.f44518 = null;
        }
        AbstractC3624.m11757(i, dArr, dArr2);
    }
}
