package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܶ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: CBKJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15468 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f50400;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50401;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f50402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f50403;

    public C15468(C19121 c19121, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (f3 == 0.0f || f4 == 0.0f) {
            return;
        }
        boolean z = f6 != 0.0f;
        boolean z2 = f7 != 0.0f;
        double d = f5;
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = (f - f8) / 2.0f;
        double d3 = (f2 - f9) / 2.0f;
        double d4 = (dSin * d3) + (dCos * d2);
        double d5 = (d3 * dCos) + ((-dSin) * d2);
        double d6 = f3 * f3;
        double d7 = f4 * f4;
        double d8 = d5 * d5 * d6;
        double d9 = (d6 * d7) - d8;
        double d10 = d7 * d4 * d4;
        double d11 = (d9 - d10) / (d8 + d10);
        double dSqrt = Math.sqrt(d11 < 0.0d ? 0.0d : d11);
        dSqrt = z == z2 ? -dSqrt : dSqrt;
        double d12 = f3;
        double d13 = dSqrt * d12 * d5;
        double d14 = f4;
        double d15 = d13 / d14;
        double d16 = (((-dSqrt) * d14) * d4) / d12;
        C7126 c7126 = new C7126(((dCos * d15) - (dSin * d16)) + ((double) ((f + f8) / 2.0f)), (dCos * d16) + (dSin * d15) + ((double) ((f2 + f9) / 2.0f)));
        C7126 c7127 = new C7126(d12, 0.0d);
        C7126 c7128 = new C7126(0.0d, d14);
        C7126 c7126M36995 = m36995(c7127, d);
        C7126 c7126M36996 = m36995(c7128, d);
        c7126M36995.f23829 += c7126.f23829;
        c7126M36995.f23830 += c7126.f23830;
        c7126M36996.f23829 += c7126.f23829;
        c7126M36996.f23830 += c7126.f23830;
        double dHypot = ((double) (f3 * f4)) / Math.hypot(d14 * Math.cos(0.7853981633974483d), Math.sin(0.7853981633974483d) * d12);
        C7126 c7126M36997 = m36995(new C7126(Math.cos(0.7853981633974483d) * dHypot, Math.sin(0.7853981633974483d) * dHypot), d);
        c7126M36997.f23829 += c7126.f23829;
        c7126M36997.f23830 += c7126.f23830;
        C7126 c7129 = (C7126) c19121.m43922(c7126M36997);
        C7126 c71210 = (C7126) c19121.m43922(c7126M36995);
        C7126 c71211 = (C7126) c19121.m43922(c7126M36996);
        C7126 c71212 = (C7126) c19121.m43922(c7126);
        double d17 = c71212.f23829;
        double d18 = c71212.f23830;
        double d19 = c7129.f23829;
        double d20 = d19 - d17;
        double d21 = c7129.f23830;
        double d22 = d21 - d18;
        double d23 = c71210.f23829;
        double d24 = d23 - d17;
        double d25 = c71210.f23830;
        double d26 = d25 - d18;
        double d27 = c71211.f23829;
        double d28 = d27 - d17;
        double d29 = c71211.f23830;
        double d30 = d29 - d18;
        double d31 = c7126M36995.f23829;
        double d32 = c7126M36997.f23829;
        double d33 = c7126M36995.f23830;
        double d34 = c7126M36997.f23830;
        this.f50401 = (((d29 - d21) * (d23 - d19)) - ((d25 - d21) * (d27 - d19))) * (((c7126M36996.f23830 - d34) * (d31 - d32)) - ((d33 - d34) * (c7126M36996.f23829 - d32))) < 0.0d;
        double d35 = d20 * d20;
        double d36 = d20 * d22;
        double d37 = d22 * d22;
        double d38 = d24 * d24;
        double d39 = d24 * d26;
        double d40 = d26 * d26;
        double d41 = d28 * d28;
        double d42 = d28 * d30;
        double d43 = d30 * d30;
        double d44 = d36 * d40;
        double d45 = d37 * d38;
        double d46 = d35 * d40;
        double d47 = d36 * d38;
        double d48 = d35 * d39;
        double d49 = -(((d47 * d43) + ((d46 * d42) + ((((d37 * d39) * d41) - (d44 * d41)) - (d45 * d42)))) - (d48 * d43));
        if (d49 != 0.0d) {
            double dM41305 = C17745.m41305(d39, d43, (((d37 * d42) + (((-d37) * d39) + d44)) - (d40 * d42)) - (d36 * d43), d49);
            double d50 = (((d35 * d43) + ((d40 * d41) + ((d45 - d46) - (d37 * d41)))) - (d43 * d38)) / d49;
            double d51 = (((d35 * d42) + ((d39 * d41) + ((d47 - d48) - (d36 * d41)))) - (d38 * d42)) / (-d49);
            double d52 = dM41305 - d51;
            if (d52 == 0.0d) {
                float fHypot = (float) Math.hypot(d24, d26);
                this.f50402 = fHypot;
                this.f50403 = fHypot;
                this.f50400 = 0.0f;
                return;
            }
            double dAtan = Math.atan(d50 / d52);
            double d53 = dAtan / 2.0d;
            if (Math.sin(dAtan) == 0.0d) {
                this.f50402 = (float) Math.sqrt(1.0d / d51);
                this.f50403 = (float) Math.sqrt(1.0d / dM41305);
                this.f50400 = 0.0f;
                return;
            }
            double d54 = dM41305 + d51;
            double dSin2 = ((d50 / Math.sin(dAtan)) + d54) / 2.0d;
            double d55 = d54 - dSin2;
            if (dSin2 != 0.0d && d55 != 0.0d) {
                this.f50402 = (float) Math.sqrt(1.0d / dSin2);
                this.f50403 = (float) Math.sqrt(1.0d / d55);
                this.f50400 = (float) Math.toDegrees(d53 + 1.5707963267948966d);
                return;
            }
        }
        Logger.getLogger("EllipseSolver").log(Level.WARNING, "Early return in the ellipse transformation computation!");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m36999() {
        return this.f50403;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m36998() {
        return this.f50402;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m36996() {
        return this.f50400;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36997() {
        return this.f50401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7126 m36995(C7126 c7126, double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = c7126.f23829;
        double d3 = c7126.f23830;
        return new C7126((d2 * dCos) - (d3 * dSin), (d3 * dCos) + (d2 * dSin));
    }
}
