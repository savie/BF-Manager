package l;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22172 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9824 f72526;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f72528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17542 f72529;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72530 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f72525 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f72527 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6502(float f, View view);

    public final String toString() {
        String string = this.f72528;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (C5238 c5238 : this.f72527) {
            StringBuilder sbM8976 = C3012.m8976(string, "[");
            sbM8976.append(c5238.f18162);
            sbM8976.append(" , ");
            sbM8976.append(decimalFormat.format(c5238.f18160));
            sbM8976.append("] ");
            string = sbM8976.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49193(String str) {
        this.f72528 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m49189(float f) {
        C17542 c17542 = this.f72529;
        AbstractC4136 abstractC4136 = c17542.f55753;
        if (abstractC4136 != null) {
            abstractC4136.mo4689(f, c17542.f55751);
        } else {
            double[] dArr = c17542.f55751;
            dArr[0] = c17542.f55757[0];
            dArr[1] = c17542.f55756[0];
        }
        return (float) ((c17542.f55755.m42424(f) * c17542.f55751[1]) + c17542.f55751[0]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m49194(float f) {
        C17542 c17542 = this.f72529;
        C18248 c18248 = c17542.f55755;
        AbstractC4136 abstractC4136 = c17542.f55753;
        if (abstractC4136 != null) {
            double d = f;
            abstractC4136.mo4693(d, c17542.f55758);
            c17542.f55753.mo4689(d, c17542.f55751);
        } else {
            double[] dArr = c17542.f55758;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d2 = f;
        double dM42424 = c18248.m42424(d2);
        double dM42429 = c18248.m42429(d2);
        double[] dArr2 = c17542.f55758;
        return (float) ((dM42429 * c17542.f55751[1]) + (dM42424 * dArr2[1]) + dArr2[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49192(int i, int i2, int i3, float f, float f2, float f3, C9824 c9824) {
        this.f72527.add(new C5238(i, f, f2, f3));
        if (i3 != -1) {
            this.f72525 = i3;
        }
        this.f72530 = i2;
        this.f72526 = c9824;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49191(int i, int i2, int i3, float f, float f2, float f3) {
        this.f72527.add(new C5238(i, f, f2, f3));
        if (i3 != -1) {
            this.f72525 = i3;
        }
        this.f72530 = i2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49190() {
        int i;
        ArrayList<C5238> arrayList = this.f72527;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C0608());
        double[] dArr = new double[size];
        char c = 1;
        char c2 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 2);
        int i2 = this.f72530;
        C17542 c17542 = new C17542();
        C18248 c18248 = new C18248();
        c17542.f55755 = c18248;
        new HashMap();
        c18248.m42428(i2);
        c17542.f55756 = new float[size];
        c17542.f55754 = new double[size];
        c17542.f55752 = new float[size];
        c17542.f55757 = new float[size];
        float[] fArr = new float[size];
        this.f72529 = c17542;
        int i3 = 0;
        for (C5238 c5238 : arrayList) {
            float f = c5238.f18163;
            dArr[i3] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i3];
            float f2 = c5238.f18160;
            dArr3[c2] = f2;
            float f3 = c5238.f18161;
            dArr3[c] = f3;
            C17542 c17543 = this.f72529;
            c17543.f55754[i3] = ((double) c5238.f18162) / 100.0d;
            c17543.f55752[i3] = f;
            c17543.f55757[i3] = f3;
            c17543.f55756[i3] = f2;
            i3++;
            c = 1;
            c2 = 0;
        }
        C17542 c17544 = this.f72529;
        float[] fArr2 = c17544.f55752;
        C18248 c18249 = c17544.f55755;
        double[] dArr4 = c17544.f55754;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, dArr4.length, 2);
        float[] fArr3 = c17544.f55756;
        c17544.f55751 = new double[fArr3.length + 1];
        c17544.f55758 = new double[fArr3.length + 1];
        if (dArr4[0] > 0.0d) {
            c18249.m42427(0.0d, fArr2[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            c18249.m42427(1.0d, fArr2[length]);
        }
        for (int i4 = 0; i4 < dArr5.length; i4++) {
            dArr5[i4][0] = c17544.f55757[i4];
            for (int i5 = 0; i5 < fArr3.length; i5++) {
                dArr5[i5][1] = fArr3[i5];
            }
            c18249.m42427(dArr4[i4], fArr2[i4]);
        }
        c18249.m42426();
        if (dArr4.length > 1) {
            i = 0;
            c17544.f55753 = AbstractC4136.m11763(0, dArr4, dArr5);
        } else {
            i = 0;
            c17544.f55753 = null;
        }
        AbstractC4136.m11763(i, dArr, dArr2);
    }
}
