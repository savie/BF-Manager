package l;

/* JADX INFO: renamed from: l.᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 41BY */
/* JADX INFO: loaded from: classes.dex */
public final class C23762 extends AbstractC3624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f76997;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double[] f76998;

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ᩷ */
    public final double mo11776(double d) {
        return 0.0d;
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final void mo11773(double d, double[] dArr) {
        double[] dArr2 = this.f76998;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final void mo11774(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f76998;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final double mo11772(double d) {
        return this.f76998[0];
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11777(double d, double[] dArr) {
        for (int i = 0; i < this.f76998.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final double[] mo11775() {
        return new double[]{this.f76997};
    }
}
