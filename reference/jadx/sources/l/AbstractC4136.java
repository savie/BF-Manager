package l;

/* JADX INFO: renamed from: l.ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4136 {
    /* JADX INFO: renamed from: ۙ */
    public abstract double mo4688(double d);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4689(double d, double[] dArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4690(double d, float[] fArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract double[] mo4691();

    /* JADX INFO: renamed from: ܰ */
    public abstract double mo4692(double d);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo4693(double d, double[] dArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4136 m11763(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C21776(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            C13310 c13310 = new C13310();
            c13310.f44183 = d;
            c13310.f44184 = dArr3;
            return c13310;
        }
        return new C15427(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4136 m11764(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C1314(iArr, dArr, dArr2);
    }
}
