package l;

/* JADX INFO: renamed from: l.᩺ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes.dex */
public final class C24399 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f79149;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f79150;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f79152;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f79153;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79154;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f79155;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f79156;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f79157;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f79158;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f79159;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f79161;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f79163;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f79164;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79165;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f79167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f79151 = 1.0f;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f79166 = 1.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f79160 = 1.0d;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f79162 = 1.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m54536(int i, double d, double d2, float f) {
        return (float) ((((double) i) * 0.5d) - (((d + d2) * ((double) f)) * 0.5d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54551(int i, int i2) {
        this.f79165 = Math.max(0, i);
        int iMax = Math.max(0, i2);
        this.f79154 = iMax;
        this.f79164 = Math.hypot(this.f79165, iMax);
        this.f79161 = 0.0f;
        this.f79160 = 1.0d;
        this.f79159 = 0.0d;
        m54533();
        m54545();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54570(int i, int i2) {
        double d;
        double d2;
        boolean z = false;
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        if (this.f79153 == iMax && this.f79156 == iMax2) {
            return;
        }
        if (m54573() && !m54558()) {
            z = true;
        }
        double d3 = ((double) this.f79166) / ((double) this.f79151);
        if (m54573()) {
            double d4 = (((double) this.f79153) * 0.5d) - ((double) this.f79150);
            double d5 = this.f79166;
            double d6 = d4 / d5;
            double d7 = ((((double) this.f79156) * 0.5d) - ((double) this.f79163)) / d5;
            double d8 = this.f79160;
            double d9 = this.f79159;
            d2 = ((d9 * d7) + (d8 * d6)) / ((double) this.f79165);
            d = ((d8 * d7) + ((-d9) * d6)) / ((double) this.f79154);
        } else {
            d = 0.5d;
            d2 = 0.5d;
        }
        this.f79153 = iMax;
        this.f79156 = iMax2;
        m54545();
        if (z && m54573()) {
            this.f79166 = m54534(d3 * ((double) this.f79151), m54574(), 8.0f);
            m54537(((double) this.f79165) * d2, ((double) this.f79154) * d, ((double) this.f79153) * 0.5d, 0.5d * ((double) this.f79156), true);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m54545() {
        m54541();
        this.f79166 = this.f79151;
        this.f79150 = m54573() ? m54536(this.f79153, this.f79149, this.f79157, this.f79166) : 0.0f;
        this.f79163 = m54573() ? m54536(this.f79156, this.f79155, this.f79152, this.f79166) : 0.0f;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m54560() {
        if (this.f79161 == 0.0f) {
            return;
        }
        if (m54573()) {
            float f = this.f79166;
            int i = this.f79153;
            int i2 = this.f79156;
            m54548(f, 0.0f, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
            return;
        }
        m54539(0.0f);
        m54545();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m54571() {
        return Math.round(this.f79161 / 90.0f) * 90.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54546() {
        if (m54573()) {
            float f = this.f79166;
            float fM54571 = m54571();
            int i = this.f79153;
            int i2 = this.f79156;
            m54548(f, fM54571, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m54573() {
        return this.f79165 > 0 && this.f79154 > 0 && this.f79153 > 0 && this.f79156 > 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m54558() {
        if (!m54573()) {
            return false;
        }
        float fAbs = Math.abs(this.f79166 - this.f79151);
        float f = this.f79151;
        return fAbs <= 1.0E-4f * f && Math.abs(this.f79150 - m54536(this.f79153, this.f79149, this.f79157, f)) <= 0.01f && Math.abs(this.f79163 - m54536(this.f79156, this.f79155, this.f79152, this.f79151)) <= 0.01f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m54556() {
        if (!m54573()) {
            return false;
        }
        double d = this.f79167;
        float f = this.f79166;
        return d * ((double) f) <= ((double) (((float) this.f79153) + 0.01f)) && this.f79158 * ((double) f) <= ((double) (((float) this.f79156) + 0.01f));
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m54555() {
        if (!m54573()) {
            return false;
        }
        double d = this.f79158;
        double d2 = this.f79167;
        return d >= 3.0d * d2 && (((double) this.f79153) / d2) * d >= ((double) this.f79156) * 2.0d;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m54572() {
        return this.f79166;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m54565() {
        return this.f79151;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m54574() {
        return Math.min(1.0f, this.f79151);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float m54562() {
        return this.f79161;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float m54544() {
        return this.f79150;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m54566() {
        return this.f79163;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m54554() {
        return this.f79165;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m54559() {
        return this.f79154;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6499 m54567() {
        if (!m54573()) {
            return null;
        }
        double d = (((double) this.f79153) * 0.5d) - ((double) this.f79150);
        double d2 = this.f79166;
        double d3 = d / d2;
        double d4 = ((((double) this.f79156) * 0.5d) - ((double) this.f79163)) / d2;
        int i = this.f79165;
        int i2 = this.f79154;
        double d5 = d2 / ((double) this.f79151);
        double d6 = this.f79160;
        double d7 = this.f79159;
        return new C6499(i, i2, d5, ((d7 * d4) + (d6 * d3)) / ((double) i), ((d6 * d4) + ((-d7) * d3)) / ((double) i2), this.f79161);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54552(C6499 c6499) {
        if (m54573() && c6499.m18351() && this.f79165 == c6499.f21830 && this.f79154 == c6499.f21826) {
            m54539(c6499.f21827);
            this.f79166 = m54534(c6499.f21828 * ((double) this.f79151), m54574(), 8.0f);
            m54537(c6499.f21825 * ((double) this.f79165), c6499.f21829 * ((double) this.f79154), ((double) this.f79153) * 0.5d, ((double) this.f79156) * 0.5d, true);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m54563() {
        return m54542(this.f79153, this.f79149, this.f79157);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m54543() {
        return m54535(this.f79153, this.f79149, this.f79157);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m54564() {
        return m54542(this.f79156, this.f79155, this.f79152);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m54557() {
        return m54535(this.f79156, this.f79155, this.f79152);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m54561() {
        if (!m54573()) {
            return this.f79151;
        }
        if (this.f79165 > 200 || this.f79154 > 200) {
            float f = this.f79151;
            if (f >= 1.5f) {
                if (this.f79166 < 0.9f * f) {
                    return f;
                }
                return 1.0f;
            }
        }
        float fMax = m54555() ? (float) (((double) this.f79153) / this.f79167) : Math.max(1.0f, this.f79151 * 2.5f);
        if (this.f79165 <= 200 && this.f79154 <= 200) {
            fMax = Math.max(fMax, (float) Math.min(((double) this.f79153) / this.f79167, ((double) this.f79156) / this.f79158));
        }
        float fMax2 = Math.max(this.f79151, Math.min(8.0f, fMax));
        return this.f79166 < 0.9f * fMax2 ? fMax2 : this.f79151;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54553(float f, float f2) {
        m54540("dx", f);
        m54540("dy", f2);
        if (!m54573()) {
            return false;
        }
        float f3 = this.f79150;
        float fM54563 = m54563();
        float fM54543 = m54543();
        if (f > 0.0f) {
            if (f3 < fM54543) {
                return true;
            }
        } else if (f < 0.0f && f3 > fM54563) {
            return true;
        }
        float f4 = this.f79163;
        float fM54564 = m54564();
        float fM54557 = m54557();
        if (f2 > 0.0f) {
            return f4 < fM54557;
        }
        return f2 < 0.0f && f4 > fM54564;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m54568(float f, float f2) {
        m54540("dx", f);
        m54540("dy", f2);
        if (!m54573()) {
            return f;
        }
        float f3 = this.f79150;
        double d = f3;
        double d2 = f;
        this.f79150 = m54534(d + d2, Math.min(f3, m54563()), Math.max(f3, m54543()));
        float f4 = this.f79163;
        this.f79163 = m54534(((double) f4) + ((double) f2), Math.min(f4, m54564()), Math.max(f4, m54557()));
        return (float) (d2 - (((double) this.f79150) - d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54550(float f, float f2, float f3, boolean z) {
        m54549(f, this.f79161, f2, f3, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54547(float f, float f2, float f3, float f4, float f5) {
        m54548(f, this.f79161, f2, f3, f4, f5, true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54569() {
        if (m54573()) {
            float f = this.f79166;
            float f2 = this.f79153 * 0.5f;
            float f3 = this.f79156 * 0.5f;
            m54547(f, f2, f3, f2, f3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private float m54542(int i, double d, double d2) {
        if (!m54573()) {
            return 0.0f;
        }
        float f = this.f79166;
        double d3 = i;
        return (d2 - d) * ((double) f) <= d3 ? m54536(i, d, d2, f) : (float) (d3 - (d2 * ((double) f)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m54535(int i, double d, double d2) {
        if (!m54573()) {
            return 0.0f;
        }
        float f = this.f79166;
        return (d2 - d) * ((double) f) <= ((double) i) ? m54536(i, d, d2, f) : (float) ((-d) * ((double) f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54537(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f79160;
        double d6 = this.f79159;
        double d7 = this.f79166;
        m54538(d3 - (((d5 * d) - (d6 * d2)) * d7), d4 - (((d5 * d2) + (d6 * d)) * d7), z);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m54541() {
        this.f79151 = m54573() ? (float) Math.min((this.f79165 > 200 || this.f79154 > 200) ? 8.0f : 1.0f, Math.min(((double) this.f79153) / this.f79167, ((double) this.f79156) / this.f79158)) : 1.0f;
        this.f79162 = m54573() ? (float) Math.min(1.0d, ((double) Math.min(this.f79153, this.f79156)) / this.f79164) : 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54539(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        if (f2 == this.f79161) {
            return;
        }
        if (f2 == 0.0f) {
            f2 = 0.0f;
        }
        this.f79161 = f2;
        if (f2 == 0.0f || f2 == -180.0f) {
            this.f79160 = f2 == 0.0f ? 1.0d : -1.0d;
            this.f79159 = 0.0d;
        } else if (f2 == 90.0f || f2 == -90.0f) {
            this.f79160 = 0.0d;
            this.f79159 = f2 == 90.0f ? 1.0d : -1.0d;
        } else {
            double radians = Math.toRadians(f2);
            this.f79160 = Math.cos(radians);
            this.f79159 = Math.sin(radians);
        }
        m54533();
        m54541();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m54533() {
        int i = this.f79165;
        double d = this.f79160;
        double d2 = ((double) i) * d;
        int i2 = this.f79154;
        double d3 = this.f79159;
        double d4 = ((double) (-i2)) * d3;
        double d5 = ((double) i) * d3;
        double d6 = ((double) i2) * d;
        this.f79149 = Math.min(0.0d, d2) + Math.min(0.0d, d4);
        this.f79157 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
        this.f79155 = Math.min(0.0d, d6) + Math.min(0.0d, d5);
        double dMax = Math.max(0.0d, d6) + Math.max(0.0d, d5);
        this.f79152 = dMax;
        this.f79167 = this.f79157 - this.f79149;
        this.f79158 = dMax - this.f79155;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54538(double d, double d2, boolean z) {
        float f = z ? 0.0f : this.f79153 * 0.5f;
        float f2 = z ? 0.0f : this.f79156 * 0.5f;
        this.f79150 = m54534(d, m54563() - f, m54543() + f);
        this.f79163 = m54534(d2, m54564() - f2, m54557() + f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m54534(double d, float f, float f2) {
        return (float) Math.max(f, Math.min(f2, d));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54548(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float fM54534;
        m54540("scale", f);
        if (f > 0.0f) {
            m54540("rotation", f2);
            m54540("oldFocusX", f3);
            m54540("oldFocusY", f4);
            m54540("newFocusX", f5);
            m54540("newFocusY", f6);
            if (m54573()) {
                double d = ((double) f3) - ((double) this.f79150);
                double d2 = this.f79166;
                double d3 = d / d2;
                double d4 = (((double) f4) - ((double) this.f79163)) / d2;
                double d5 = this.f79160;
                double d6 = this.f79159;
                double d7 = (d5 * d3) + (d6 * d4);
                double d8 = (d5 * d4) + ((-d6) * d3);
                m54539(f2);
                if (z) {
                    fM54534 = m54534(f, m54574(), 8.0f);
                } else {
                    fM54534 = m54534(f, this.f79162 * 0.5f, 12.0f);
                }
                this.f79166 = fM54534;
                m54537(d7, d8, f5, f6, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54549(float f, float f2, float f3, float f4, boolean z) {
        float fM54534;
        m54540("scale", f);
        if (f > 0.0f) {
            m54540("rotation", f2);
            m54540("x", f3);
            m54540("y", f4);
            if (m54573()) {
                m54539(f2);
                if (z) {
                    fM54534 = m54534(f, m54574(), 8.0f);
                } else {
                    fM54534 = m54534(f, this.f79162 * 0.5f, 12.0f);
                }
                this.f79166 = fM54534;
                m54538(f3, f4, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54540(String str, float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must be finite"));
        }
    }
}
