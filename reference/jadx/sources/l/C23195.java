package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: YITR */
/* JADX INFO: loaded from: classes2.dex */
public final class C23195 extends AbstractC16481 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f75163;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23195 m52118(long j, AbstractC1566 abstractC1566) {
        return new C23195(j, abstractC1566);
    }

    @Override // l.AbstractC0074
    /* JADX INFO: renamed from: ۙ */
    public final void mo1130(AbstractC1566 abstractC1566) {
        this.f976 = abstractC1566;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C23195 m52120(long j, AbstractC1566 abstractC1566) {
        if (j != 0 && !abstractC1566.mo5564() && !abstractC1566.mo5566(EnumC12006.LONG) && !abstractC1566.mo5566(EnumC12006.DOUBLE)) {
            if (j == 1) {
                abstractC1566 = AbstractC1566.f5415;
            } else if (j < 0) {
                abstractC1566 = AbstractC1566.f5423;
            } else {
                abstractC1566 = AbstractC1566.f5439;
            }
        }
        return new C23195(j, abstractC1566);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static C23195 m52119() {
        return new C23195(0L, AbstractC1566.f5436);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static C23195 m52121() {
        return new C23195(1L, AbstractC1566.f5436);
    }

    public C23195(long j, AbstractC1566 abstractC1566) {
        if (j != 0 && abstractC1566.mo5543()) {
            throw new C8597("Wrong literal type: " + abstractC1566 + " for value: " + j);
        }
        this.f75163 = j;
        this.f976 = abstractC1566;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final long m52122() {
        return this.f75163;
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۚۙ */
    public final boolean mo39117() {
        return this.f75163 == 0;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52125() {
        int i = C15735.f51174[this.f976.mo5558().ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52123() {
        boolean zM52125 = m52125();
        long j = this.f75163;
        if (zM52125) {
            return j < 0;
        }
        AbstractC1566 abstractC1566 = this.f976;
        if (abstractC1566 == AbstractC1566.f5440) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) j);
            return (fIntBitsToFloat >= 0.0f || Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) ? false : true;
        }
        if (abstractC1566 == AbstractC1566.f5424) {
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (dLongBitsToDouble < 0.0d && !Double.isInfinite(dLongBitsToDouble) && !Double.isNaN(dLongBitsToDouble)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C23195 m52124() {
        long jDoubleToLongBits;
        boolean zM52125 = m52125();
        long j = this.f75163;
        if (zM52125) {
            jDoubleToLongBits = -j;
        } else {
            AbstractC1566 abstractC1566 = this.f976;
            if (abstractC1566 == AbstractC1566.f5440) {
                jDoubleToLongBits = Float.floatToIntBits(-Float.intBitsToFloat((int) j));
            } else {
                if (abstractC1566 != AbstractC1566.f5424) {
                    return null;
                }
                jDoubleToLongBits = Double.doubleToLongBits(-Double.longBitsToDouble(j));
            }
        }
        return new C23195(jDoubleToLongBits, this.f976);
    }

    @Override // l.AbstractC16481
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC16481 mo17528() {
        C23195 c23195 = new C23195(this.f75163, this.f976);
        c23195.m39414(this);
        c23195.mo39114(this.f53443);
        return c23195;
    }

    public final int hashCode() {
        long j = this.f75163;
        return (this.f976.f5441 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23195.class == obj.getClass()) {
            C23195 c23195 = (C23195) obj;
            if (this.f75163 == c23195.f75163 && this.f976.equals(c23195.f976)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC16678
    /* JADX INFO: renamed from: ֨ */
    public final String mo17521() {
        return Long.toString(this.f75163);
    }

    public final String toString() {
        try {
            String strM36534 = C15186.m36534(this.f75163, this.f976, C12326.m30748(), true, false);
            if (this.f976.equals(AbstractC1566.f5436) && (strM36534.equals("true") || strM36534.equals("false"))) {
                return strM36534;
            }
            return MotionUtils.EASING_TYPE_FORMAT_START + strM36534 + ' ' + this.f976 + ')';
        } catch (C8597 unused) {
            return MotionUtils.EASING_TYPE_FORMAT_START + this.f75163 + ' ' + this.f976 + ')';
        }
    }
}
