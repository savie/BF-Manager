package l;

/* JADX INFO: renamed from: l.۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13310 extends AbstractC4136 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f44183;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double[] f44184;

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ܰ */
    public final double mo4692(double d) {
        return 0.0d;
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ */
    public final void mo4689(double d, double[] dArr) {
        double[] dArr2 = this.f44184;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ */
    public final void mo4690(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f44184;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ */
    public final double mo4688(double d) {
        return this.f44184[0];
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ܰ */
    public final void mo4693(double d, double[] dArr) {
        for (int i = 0; i < this.f44184.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ */
    public final double[] mo4691() {
        return new double[]{this.f44183};
    }
}
