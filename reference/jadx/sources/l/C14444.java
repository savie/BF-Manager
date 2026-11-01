package l;

/* JADX INFO: renamed from: l.ܳۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14444 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f47364;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f47365;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f47366;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f47369;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f47370;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f47371;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f47372;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f47373;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f47374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f47375;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f47377;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f47379;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f47380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f47381;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f47382;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f47367 = 1.0f;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f47378 = 1.0f;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f47376 = 1.0d;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f47368 = 1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m34807(int i, double d, double d2, float f) {
        return (float) ((((double) i) * 0.5d) - (((d + d2) * ((double) f)) * 0.5d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34822(int i, int i2) {
        this.f47365 = Math.max(0, i);
        int iMax = Math.max(0, i2);
        this.f47373 = iMax;
        this.f47375 = Math.hypot(this.f47365, iMax);
        this.f47380 = 0.0f;
        this.f47376 = 1.0d;
        this.f47377 = 0.0d;
        m34813();
        m34842();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34835(int i, int i2) {
        double d;
        double d2;
        boolean z = false;
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        if (this.f47372 == iMax && this.f47371 == iMax2) {
            return;
        }
        if (m34827() && !m34829()) {
            z = true;
        }
        double d3 = ((double) this.f47378) / ((double) this.f47367);
        if (m34827()) {
            double d4 = (((double) this.f47372) * 0.5d) - ((double) this.f47370);
            double d5 = this.f47378;
            double d6 = d4 / d5;
            double d7 = ((((double) this.f47371) * 0.5d) - ((double) this.f47379)) / d5;
            double d8 = this.f47376;
            double d9 = this.f47377;
            d2 = ((d9 * d7) + (d8 * d6)) / ((double) this.f47365);
            d = ((d8 * d7) + ((-d9) * d6)) / ((double) this.f47373);
        } else {
            d = 0.5d;
            d2 = 0.5d;
        }
        this.f47372 = iMax;
        this.f47371 = iMax2;
        m34842();
        if (z && m34827()) {
            this.f47378 = m34805(d3 * ((double) this.f47367), m34845(), 8.0f);
            m34808(((double) this.f47365) * d2, ((double) this.f47373) * d, ((double) this.f47372) * 0.5d, 0.5d * ((double) this.f47371), true);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34842() {
        m34804();
        this.f47378 = this.f47367;
        this.f47370 = m34827() ? m34807(this.f47372, this.f47366, this.f47364, this.f47378) : 0.0f;
        this.f47379 = m34827() ? m34807(this.f47371, this.f47369, this.f47374, this.f47378) : 0.0f;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34837() {
        if (this.f47380 == 0.0f) {
            return;
        }
        if (m34827()) {
            float f = this.f47378;
            int i = this.f47372;
            int i2 = this.f47371;
            m34819(f, 0.0f, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
            return;
        }
        m34810(0.0f);
        m34842();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m34815() {
        return Math.round(this.f47380 / 90.0f) * 90.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34817() {
        if (m34827()) {
            float f = this.f47378;
            float fM34815 = m34815();
            int i = this.f47372;
            int i2 = this.f47371;
            m34819(f, fM34815, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m34827() {
        return this.f47365 > 0 && this.f47373 > 0 && this.f47372 > 0 && this.f47371 > 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m34829() {
        if (!m34827()) {
            return false;
        }
        float fAbs = Math.abs(this.f47378 - this.f47367);
        float f = this.f47367;
        return fAbs <= 1.0E-4f * f && Math.abs(this.f47370 - m34807(this.f47372, this.f47366, this.f47364, f)) <= 0.01f && Math.abs(this.f47379 - m34807(this.f47371, this.f47369, this.f47374, this.f47367)) <= 0.01f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m34831() {
        if (!m34827()) {
            return false;
        }
        double d = this.f47382;
        float f = this.f47378;
        return d * ((double) f) <= ((double) (((float) this.f47372) + 0.01f)) && this.f47381 * ((double) f) <= ((double) (((float) this.f47371) + 0.01f));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34830() {
        if (!m34827()) {
            return false;
        }
        double d = this.f47381;
        double d2 = this.f47382;
        return d >= 3.0d * d2 && (((double) this.f47372) / d2) * d >= ((double) this.f47371) * 2.0d;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m34839() {
        return this.f47378;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m34825() {
        return this.f47367;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float m34845() {
        return Math.min(1.0f, this.f47367);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m34838() {
        return this.f47380;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float m34828() {
        return this.f47370;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m34840() {
        return this.f47379;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m34832() {
        return this.f47365;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m34814() {
        return this.f47373;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23616 m34841() {
        if (!m34827()) {
            return null;
        }
        double d = (((double) this.f47372) * 0.5d) - ((double) this.f47370);
        double d2 = this.f47378;
        double d3 = d / d2;
        double d4 = ((((double) this.f47371) * 0.5d) - ((double) this.f47379)) / d2;
        int i = this.f47365;
        int i2 = this.f47373;
        double d5 = d2 / ((double) this.f47367);
        double d6 = this.f47376;
        double d7 = this.f47377;
        return new C23616(i, i2, d5, ((d7 * d4) + (d6 * d3)) / ((double) i), ((d6 * d4) + ((-d7) * d3)) / ((double) i2), this.f47380);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34823(C23616 c23616) {
        if (m34827() && c23616.m52087() && this.f47365 == c23616.f76519 && this.f47373 == c23616.f76522) {
            m34810(c23616.f76524);
            this.f47378 = m34805(c23616.f76521 * ((double) this.f47367), m34845(), 8.0f);
            m34808(c23616.f76520 * ((double) this.f47365), c23616.f76523 * ((double) this.f47373), ((double) this.f47372) * 0.5d, ((double) this.f47371) * 0.5d, true);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float m34836() {
        return m34812(this.f47372, this.f47366, this.f47364);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m34816() {
        return m34806(this.f47372, this.f47366, this.f47364);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m34843() {
        return m34812(this.f47371, this.f47369, this.f47374);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m34826() {
        return m34806(this.f47371, this.f47369, this.f47374);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m34844() {
        if (!m34827()) {
            return this.f47367;
        }
        if (this.f47365 > 200 || this.f47373 > 200) {
            float f = this.f47367;
            if (f >= 1.5f) {
                if (this.f47378 < 0.9f * f) {
                    return f;
                }
                return 1.0f;
            }
        }
        float fMax = m34830() ? (float) (((double) this.f47372) / this.f47382) : Math.max(1.0f, this.f47367 * 2.5f);
        if (this.f47365 <= 200 && this.f47373 <= 200) {
            fMax = Math.max(fMax, (float) Math.min(((double) this.f47372) / this.f47382, ((double) this.f47371) / this.f47381));
        }
        float fMax2 = Math.max(this.f47367, Math.min(8.0f, fMax));
        return this.f47378 < 0.9f * fMax2 ? fMax2 : this.f47367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34824(float f, float f2) {
        m34811("dx", f);
        m34811("dy", f2);
        if (!m34827()) {
            return false;
        }
        float f3 = this.f47370;
        float fM34836 = m34836();
        float fM34816 = m34816();
        if (f > 0.0f) {
            if (f3 < fM34816) {
                return true;
            }
        } else if (f < 0.0f && f3 > fM34836) {
            return true;
        }
        float f4 = this.f47379;
        float fM34843 = m34843();
        float fM34826 = m34826();
        if (f2 > 0.0f) {
            return f4 < fM34826;
        }
        return f2 < 0.0f && f4 > fM34843;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m34833(float f, float f2) {
        m34811("dx", f);
        m34811("dy", f2);
        if (!m34827()) {
            return f;
        }
        float f3 = this.f47370;
        double d = f3;
        double d2 = f;
        this.f47370 = m34805(d + d2, Math.min(f3, m34836()), Math.max(f3, m34816()));
        float f4 = this.f47379;
        this.f47379 = m34805(((double) f4) + ((double) f2), Math.min(f4, m34843()), Math.max(f4, m34826()));
        return (float) (d2 - (((double) this.f47370) - d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34821(float f, float f2, float f3, boolean z) {
        m34820(f, this.f47380, f2, f3, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34818(float f, float f2, float f3, float f4, float f5) {
        m34819(f, this.f47380, f2, f3, f4, f5, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34834() {
        if (m34827()) {
            float f = this.f47378;
            float f2 = this.f47372 * 0.5f;
            float f3 = this.f47371 * 0.5f;
            m34818(f, f2, f3, f2, f3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private float m34812(int i, double d, double d2) {
        if (!m34827()) {
            return 0.0f;
        }
        float f = this.f47378;
        double d3 = i;
        return (d2 - d) * ((double) f) <= d3 ? m34807(i, d, d2, f) : (float) (d3 - (d2 * ((double) f)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m34806(int i, double d, double d2) {
        if (!m34827()) {
            return 0.0f;
        }
        float f = this.f47378;
        return (d2 - d) * ((double) f) <= ((double) i) ? m34807(i, d, d2, f) : (float) ((-d) * ((double) f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34808(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f47376;
        double d6 = this.f47377;
        double d7 = this.f47378;
        m34809(d3 - (((d5 * d) - (d6 * d2)) * d7), d4 - (((d5 * d2) + (d6 * d)) * d7), z);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m34804() {
        this.f47367 = m34827() ? (float) Math.min((this.f47365 > 200 || this.f47373 > 200) ? 8.0f : 1.0f, Math.min(((double) this.f47372) / this.f47382, ((double) this.f47371) / this.f47381)) : 1.0f;
        this.f47368 = m34827() ? (float) Math.min(1.0d, ((double) Math.min(this.f47372, this.f47371)) / this.f47375) : 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34810(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        if (f2 == this.f47380) {
            return;
        }
        if (f2 == 0.0f) {
            f2 = 0.0f;
        }
        this.f47380 = f2;
        if (f2 == 0.0f || f2 == -180.0f) {
            this.f47376 = f2 == 0.0f ? 1.0d : -1.0d;
            this.f47377 = 0.0d;
        } else if (f2 == 90.0f || f2 == -90.0f) {
            this.f47376 = 0.0d;
            this.f47377 = f2 == 90.0f ? 1.0d : -1.0d;
        } else {
            double radians = Math.toRadians(f2);
            this.f47376 = Math.cos(radians);
            this.f47377 = Math.sin(radians);
        }
        m34813();
        m34804();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34813() {
        int i = this.f47365;
        double d = this.f47376;
        double d2 = ((double) i) * d;
        int i2 = this.f47373;
        double d3 = this.f47377;
        double d4 = ((double) (-i2)) * d3;
        double d5 = ((double) i) * d3;
        double d6 = ((double) i2) * d;
        this.f47366 = Math.min(0.0d, d2) + Math.min(0.0d, d4);
        this.f47364 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
        this.f47369 = Math.min(0.0d, d6) + Math.min(0.0d, d5);
        double dMax = Math.max(0.0d, d6) + Math.max(0.0d, d5);
        this.f47374 = dMax;
        this.f47382 = this.f47364 - this.f47366;
        this.f47381 = dMax - this.f47369;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34809(double d, double d2, boolean z) {
        float f = z ? 0.0f : this.f47372 * 0.5f;
        float f2 = z ? 0.0f : this.f47371 * 0.5f;
        this.f47370 = m34805(d, m34836() - f, m34816() + f);
        this.f47379 = m34805(d2, m34843() - f2, m34826() + f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m34805(double d, float f, float f2) {
        return (float) Math.max(f, Math.min(f2, d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34819(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float fM34805;
        m34811("scale", f);
        if (f > 0.0f) {
            m34811("rotation", f2);
            m34811("oldFocusX", f3);
            m34811("oldFocusY", f4);
            m34811("newFocusX", f5);
            m34811("newFocusY", f6);
            if (m34827()) {
                double d = ((double) f3) - ((double) this.f47370);
                double d2 = this.f47378;
                double d3 = d / d2;
                double d4 = (((double) f4) - ((double) this.f47379)) / d2;
                double d5 = this.f47376;
                double d6 = this.f47377;
                double d7 = (d5 * d3) + (d6 * d4);
                double d8 = (d5 * d4) + ((-d6) * d3);
                m34810(f2);
                if (z) {
                    fM34805 = m34805(f, m34845(), 8.0f);
                } else {
                    fM34805 = m34805(f, this.f47368 * 0.5f, 12.0f);
                }
                this.f47378 = fM34805;
                m34808(d7, d8, f5, f6, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34820(float f, float f2, float f3, float f4, boolean z) {
        float fM34805;
        m34811("scale", f);
        if (f > 0.0f) {
            m34811("rotation", f2);
            m34811("x", f3);
            m34811("y", f4);
            if (m34827()) {
                m34810(f2);
                if (z) {
                    fM34805 = m34805(f, m34845(), 8.0f);
                } else {
                    fM34805 = m34805(f, this.f47368 * 0.5f, 12.0f);
                }
                this.f47378 = fM34805;
                m34809(f3, f4, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34811(String str, float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must be finite"));
        }
    }
}
