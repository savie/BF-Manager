package l;

/* JADX INFO: renamed from: l.ۤ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10502 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC3135 f35990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f35991;

    public C10502(float f, EnumC3135 enumC3135) {
        this.f35991 = f;
        this.f35990 = enumC3135;
    }

    public C10502(float f) {
        this.f35991 = f;
        this.f35990 = EnumC3135.px;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m26658(C18699 c18699) {
        int iOrdinal = this.f35990.ordinal();
        float f = this.f35991;
        switch (iOrdinal) {
            case 1:
                return f * c18699.m43235();
            case 2:
                return f * c18699.m43238();
            case 3:
                return f * c18699.m43234();
            case 4:
                return (f * c18699.m43234()) / 2.54f;
            case 5:
                return (f * c18699.m43234()) / 25.4f;
            case 6:
                return (f * c18699.m43234()) / 72.0f;
            case 7:
                return (f * c18699.m43234()) / 6.0f;
            case 8:
                C5562 c5562M43237 = c18699.m43237();
                return c5562M43237 == null ? f : (f * c5562M43237.f19074) / 100.0f;
            default:
                return f;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m26656(C18699 c18699) {
        if (this.f35990 == EnumC3135.percent) {
            C5562 c5562M43237 = c18699.m43237();
            float f = this.f35991;
            return c5562M43237 == null ? f : (f * c5562M43237.f19075) / 100.0f;
        }
        return m26658(c18699);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m26653(C18699 c18699) {
        float fSqrt;
        if (this.f35990 == EnumC3135.percent) {
            C5562 c5562M43237 = c18699.m43237();
            float f = this.f35991;
            if (c5562M43237 == null) {
                return f;
            }
            float f2 = c5562M43237.f19074;
            float f3 = c5562M43237.f19075;
            if (f2 == f3) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((f3 * f3) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }
        return m26658(c18699);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m26654(C18699 c18699, float f) {
        if (this.f35990 == EnumC3135.percent) {
            return (this.f35991 * f) / 100.0f;
        }
        return m26658(c18699);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m26652(float f) {
        float f2;
        float f3;
        int iOrdinal = this.f35990.ordinal();
        float f4 = this.f35991;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m26657() {
        return this.f35991 == 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26655() {
        return this.f35991 < 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f35991) + this.f35990;
    }
}
