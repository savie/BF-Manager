package l;

/* JADX INFO: renamed from: l.ܿۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18028 implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC15175 f59026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f59027;

    public C18028(float f, EnumC15175 enumC15175) {
        this.f59027 = f;
        this.f59026 = enumC15175;
    }

    public C18028(float f) {
        this.f59027 = f;
        this.f59026 = EnumC15175.px;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m42033(C3989 c3989) {
        int iOrdinal = this.f59026.ordinal();
        float f = this.f59027;
        switch (iOrdinal) {
            case 1:
                return f * c3989.m12903();
            case 2:
                return f * c3989.m12906();
            case 3:
                return f * c3989.m12907();
            case 4:
                return (f * c3989.m12907()) / 2.54f;
            case 5:
                return (f * c3989.m12907()) / 25.4f;
            case 6:
                return (f * c3989.m12907()) / 72.0f;
            case 7:
                return (f * c3989.m12907()) / 6.0f;
            case 8:
                C1621 c1621M12905 = c3989.m12905();
                return c1621M12905 == null ? f : (f * c1621M12905.f5585) / 100.0f;
            default:
                return f;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m42032(C3989 c3989) {
        if (this.f59026 == EnumC15175.percent) {
            C1621 c1621M12905 = c3989.m12905();
            float f = this.f59027;
            return c1621M12905 == null ? f : (f * c1621M12905.f5582) / 100.0f;
        }
        return m42033(c3989);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m42029(C3989 c3989) {
        float fSqrt;
        if (this.f59026 == EnumC15175.percent) {
            C1621 c1621M12905 = c3989.m12905();
            float f = this.f59027;
            if (c1621M12905 == null) {
                return f;
            }
            float f2 = c1621M12905.f5585;
            float f3 = c1621M12905.f5582;
            if (f2 == f3) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((f3 * f3) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }
        return m42033(c3989);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m42030(C3989 c3989, float f) {
        if (this.f59026 == EnumC15175.percent) {
            return (this.f59027 * f) / 100.0f;
        }
        return m42033(c3989);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m42028(float f) {
        float f2;
        float f3;
        int iOrdinal = this.f59026.ordinal();
        float f4 = this.f59027;
        if (iOrdinal == 0) {
            return f4;
        }
        if (iOrdinal == 3) {
            return f4 * f;
        }
        if (iOrdinal == 4) {
            f2 = f4 * f;
            f3 = 2.54f;
        } else if (iOrdinal == 5) {
            f2 = f4 * f;
            f3 = 25.4f;
        } else if (iOrdinal == 6) {
            f2 = f4 * f;
            f3 = 72.0f;
        } else {
            if (iOrdinal != 7) {
                return f4;
            }
            f2 = f4 * f;
            f3 = 6.0f;
        }
        return f2 / f3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42034() {
        return this.f59027 == 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42031() {
        return this.f59027 < 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f59027) + this.f59026;
    }
}
