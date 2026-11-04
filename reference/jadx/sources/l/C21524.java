package l;

/* JADX INFO: renamed from: l.᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BV */
/* JADX INFO: loaded from: classes.dex */
public final class C21524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f68765;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f68766;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f68767;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f68768;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f68769;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f68770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48936() {
        this.f68765 = 0.0f;
        this.f68768 = 0.0f;
        this.f68770 = 0.0f;
        this.f68766 = 0.0f;
        this.f68769 = 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48940(AbstractC21109 abstractC21109, float f) {
        if (abstractC21109 != null) {
            this.f68765 = abstractC21109.m48195(f);
            this.f68767 = abstractC21109.m48193(f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48943(AbstractC21109 abstractC21109, AbstractC21109 abstractC211010, float f) {
        if (abstractC21109 != null) {
            this.f68770 = abstractC21109.m48195(f);
        }
        if (abstractC211010 != null) {
            this.f68768 = abstractC211010.m48195(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48941(AbstractC21109 abstractC21109, AbstractC21109 abstractC211010, float f) {
        if (abstractC21109 != null) {
            this.f68769 = abstractC21109.m48195(f);
        }
        if (abstractC211010 != null) {
            this.f68766 = abstractC211010.m48195(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48938(AbstractC17553 abstractC17553, float f) {
        if (abstractC17553 != null) {
            this.f68765 = abstractC17553.m41212(f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48942(AbstractC17553 abstractC17553, AbstractC17553 abstractC17554, float f) {
        if (abstractC17553 != null) {
            this.f68770 = abstractC17553.m41212(f);
        }
        if (abstractC17554 != null) {
            this.f68768 = abstractC17554.m41212(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48939(AbstractC17553 abstractC17553, AbstractC17553 abstractC17554, float f) {
        if (abstractC17553 == null && abstractC17554 == null) {
            return;
        }
        if (abstractC17553 == null) {
            this.f68769 = abstractC17553.m41212(f);
        }
        if (abstractC17554 == null) {
            this.f68766 = abstractC17554.m41212(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48937(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f68770;
        float f8 = f4 + this.f68768;
        float f9 = (this.f68769 * f5) + f7;
        float f10 = (this.f68766 * f6) + f8;
        float radians = (float) Math.toRadians(this.f68767);
        float radians2 = (float) Math.toRadians(this.f68765);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
