package l;

/* JADX INFO: renamed from: l.۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8371 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f29039;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29040;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f29041;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f29042;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f29043;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f29044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21903() {
        this.f29040 = 0.0f;
        this.f29041 = 0.0f;
        this.f29039 = 0.0f;
        this.f29042 = 0.0f;
        this.f29043 = 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21905(AbstractC8102 abstractC8102, float f) {
        if (abstractC8102 != null) {
            this.f29040 = abstractC8102.m21320(f);
            this.f29044 = abstractC8102.m21316(f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21909(AbstractC8102 abstractC8102, AbstractC8102 abstractC8103, float f) {
        if (abstractC8102 != null) {
            this.f29039 = abstractC8102.m21320(f);
        }
        if (abstractC8103 != null) {
            this.f29041 = abstractC8103.m21320(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21906(AbstractC8102 abstractC8102, AbstractC8102 abstractC8103, float f) {
        if (abstractC8102 != null) {
            this.f29043 = abstractC8102.m21320(f);
        }
        if (abstractC8103 != null) {
            this.f29042 = abstractC8103.m21320(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21907(AbstractC22172 abstractC22172, float f) {
        if (abstractC22172 != null) {
            this.f29040 = abstractC22172.m49194(f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21910(AbstractC22172 abstractC22172, AbstractC22172 abstractC22173, float f) {
        if (abstractC22172 != null) {
            this.f29039 = abstractC22172.m49194(f);
        }
        if (abstractC22173 != null) {
            this.f29041 = abstractC22173.m49194(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21908(AbstractC22172 abstractC22172, AbstractC22172 abstractC22173, float f) {
        if (abstractC22172 == null && abstractC22173 == null) {
            return;
        }
        if (abstractC22172 == null) {
            this.f29043 = abstractC22172.m49194(f);
        }
        if (abstractC22173 == null) {
            this.f29042 = abstractC22173.m49194(f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21904(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f29039;
        float f8 = f4 + this.f29041;
        float f9 = (this.f29043 * f5) + f7;
        float f10 = (this.f29042 * f6) + f8;
        float radians = (float) Math.toRadians(this.f29044);
        float radians2 = (float) Math.toRadians(this.f29040);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
