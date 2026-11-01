package l;

/* JADX INFO: renamed from: l.ۙ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4910 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f17208;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20328 f17209;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC9663 f17210;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17211;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f17212;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0571 f17213;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20328 f17214;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f17215;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f17216;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20328 f17217;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20328 f17218;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f17219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12567 f17220;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f17221;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17222;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20328 f17223;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f17224;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17225;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17226 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20328 f17227;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17228;

    public C4910(int i, int i2, boolean z, boolean z2) {
        this.f17219 = i;
        this.f17211 = i2;
        this.f17215 = z;
        this.f17216 = z2;
        this.f17227 = new C20328(i);
        this.f17217 = z ? null : new C20328(i);
        this.f17214 = z ? null : new C20328(i);
        this.f17225 = i2;
        this.f17223 = z2 ? new C20328(i) : null;
        this.f17220 = z ? new C12567(i) : null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13663(C0571 c0571) {
        C20328 c20328 = this.f17217;
        if (c20328 == null || this.f17211 == 0) {
            return;
        }
        if (c0571 == null) {
            c20328.m45886();
        } else {
            c20328.m45884(c0571);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0571 m13658(int i) {
        C20328 c20328 = this.f17217;
        if (c20328 == null) {
            throw new IllegalStateException("Not a window recorder");
        }
        m13668();
        c20328.m45885(this.f17227);
        c20328.m45883(0, i);
        c20328.m45882(0);
        c20328.m45882(i);
        return c20328.m45887();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m13648() {
        return this.f17225;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0571 m13649(int i) {
        m13668();
        int i2 = this.f17225;
        C20328 c20328 = this.f17214;
        c20328.m45883(i2, i);
        c20328.m45882(this.f17225);
        c20328.m45882(i);
        C0571 c0571M45887 = c20328.m45887();
        c20328.m45888(this.f17219);
        this.f17225 = i;
        return c0571M45887;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13657(InterfaceC9663 interfaceC9663) {
        if (!this.f17216) {
            if (interfaceC9663 != null) {
                throw new IllegalStateException("End-search proofs are disabled");
            }
            return;
        }
        boolean z = this.f17208;
        if ((z || this.f17224) && interfaceC9663 != this.f17210) {
            throw new IllegalStateException("Cannot change syntax observation sink in the current state");
        }
        if (z || this.f17224 || interfaceC9663 == this.f17210) {
            return;
        }
        m13668();
        this.f17210 = interfaceC9663;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m13660() {
        return this.f17211;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13667(C0571 c0571) {
        C13638.requireNonNull(c0571, "dependency");
        if (this.f17208 || this.f17224) {
            throw new IllegalStateException("Cannot resume a syntax checkpoint in the current state");
        }
        if (c0571.m2681() != this.f17219) {
            throw new IllegalArgumentException("Checkpoint dependency length differs");
        }
        this.f17227.m45884(c0571);
        C20328 c20328 = this.f17217;
        if (c20328 != null) {
            c20328.m45886();
        }
        C20328 c20329 = this.f17214;
        if (c20329 != null) {
            c20329.m45886();
        }
        C20328 c203210 = this.f17223;
        if (c203210 != null) {
            c203210.m45884(c0571);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13650() {
        if (this.f17208 || this.f17224) {
            throw new IllegalStateException("Cannot observe EOF in the current replay state");
        }
        this.f17227.m45881();
        C20328 c20328 = this.f17214;
        if (c20328 != null) {
            c20328.m45881();
        }
        C20328 c20329 = this.f17223;
        if (c20329 == null) {
            return;
        }
        InterfaceC9663 interfaceC9663 = this.f17210;
        if (interfaceC9663 == null) {
            c20329.m45881();
        } else {
            ((C15059) interfaceC9663).m36086();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13665(int i) {
        if (this.f17208 || this.f17224 || i < 0 || i > this.f17219) {
            throw new IllegalStateException("Cannot observe syntax input boundary");
        }
        this.f17227.m45882(i);
        C20328 c20328 = this.f17214;
        if (c20328 != null) {
            c20328.m45882(i);
        }
        C20328 c20329 = this.f17223;
        if (c20329 == null) {
            return;
        }
        InterfaceC9663 interfaceC9663 = this.f17210;
        if (interfaceC9663 == null) {
            c20329.m45882(i);
        } else {
            ((C15059) interfaceC9663).m36093(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13656(C0571 c0571) {
        if (this.f17208 || this.f17224 || c0571.m2681() != this.f17219) {
            throw new IllegalStateException("Cannot commit syntax end-search dependency");
        }
        C20328 c20328 = this.f17223;
        if (c20328 == null) {
            throw new IllegalStateException("End-search proofs are disabled");
        }
        c20328.m45884(c0571);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13662(int i, int i2, C0571 c0571) {
        int i3 = this.f17211;
        if (i >= i3 || i2 > i3) {
            throw new IllegalArgumentException("Reused dependency crosses replay entry");
        }
        m13645(i, i2, c0571);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13655(int i, boolean z) {
        if (z || i - this.f17211 >= 4096) {
            if (z) {
                i = this.f17219;
            }
            m13647(i, z);
            if (z) {
                m13646();
                this.f17208 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0571 m13652(int i, int i2, C0571 c0571) {
        int i3;
        if (this.f17208 || this.f17224 || i < this.f17211 || i2 < i || i2 >= (i3 = this.f17219)) {
            throw new IllegalArgumentException("Invalid syntax checkpoint dependency");
        }
        m13668();
        C20328 c20328 = this.f17218;
        if (c20328 == null) {
            this.f17218 = new C20328(i3);
        } else {
            c20328.m45888(i3);
        }
        C20328 c20329 = this.f17218;
        C20328 c203210 = this.f17223;
        if (c203210 == null) {
            c203210 = this.f17227;
        }
        c20329.m45885(c203210);
        if (c0571 != null) {
            this.f17218.m45884(c0571);
        }
        C20328 c203211 = this.f17218;
        c203211.m45883(this.f17211, i2);
        c203211.m45882(this.f17211);
        c203211.m45882(i2);
        return c203211.m45887();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13654(int i) {
        int i2;
        if (this.f17208 || this.f17224 || i < (i2 = this.f17211) || i >= this.f17219) {
            throw new IllegalArgumentException("Invalid syntax convergence entry");
        }
        if (i != i2) {
            m13647(i, false);
        }
        this.f17224 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0571 m13661(int i) {
        int i2;
        if (this.f17208 || this.f17224 || i <= this.f17211 || i > (i2 = this.f17219)) {
            throw new IllegalArgumentException("Invalid speculative dependency range");
        }
        m13668();
        int i3 = this.f17211;
        C20328 c20328 = this.f17227;
        c20328.m45883(i3, i);
        c20328.m45882(this.f17211);
        c20328.m45882(i);
        C0571 c0571M45887 = c20328.m45887();
        c20328.m45888(i2);
        C20328 c20329 = this.f17223;
        if (c20329 != null) {
            c20329.m45888(i2);
        }
        this.f17211 = i;
        return c0571M45887;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13666(int i, int i2, C0571 c0571) {
        int i3;
        if (this.f17208 || this.f17224 || i < this.f17211 || i2 <= i || i2 > (i3 = this.f17219) || c0571.m2681() != i3) {
            throw new IllegalArgumentException("Invalid confirmed syntax fragment");
        }
        if (i != this.f17211) {
            m13647(i, false);
        }
        m13645(i, i2, c0571);
        C20328 c20328 = this.f17217;
        if (c20328 != null) {
            c20328.m45884(c0571);
        }
        C20328 c20329 = this.f17214;
        if (c20329 != null) {
            c20329.m45884(c0571);
        }
        this.f17211 = i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13651(int i, int i2, C0571 c0571) {
        if (!this.f17224 || i < this.f17211) {
            throw new IllegalArgumentException("Reused dependency precedes convergence entry");
        }
        m13645(i, i2, c0571);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13659() {
        if (!this.f17224 || this.f17208) {
            throw new IllegalStateException("Syntax suffix is not being reused");
        }
        m13646();
        this.f17208 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m13647(int i, boolean z) {
        m13668();
        int i2 = this.f17211;
        C20328 c20328 = this.f17227;
        c20328.m45883(i2, i);
        c20328.m45882(this.f17211);
        c20328.m45882(i);
        if (z) {
            c20328.m45881();
            C20328 c20329 = this.f17214;
            if (c20329 != null) {
                c20329.m45881();
            }
        }
        C20328 c203210 = this.f17217;
        if (c203210 != null) {
            c203210.m45885(c20328);
        }
        m13645(this.f17211, i, c20328.m45887());
        this.f17211 = i;
        int i3 = this.f17219;
        c20328.m45888(i3);
        C20328 c203211 = this.f17223;
        if (c203211 != null) {
            c203211.m45888(i3);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m13645(int i, int i2, C0571 c0571) {
        int i3;
        if (i2 < i || i2 > (i3 = this.f17219)) {
            throw new IllegalArgumentException("Invalid syntax dependency block");
        }
        if (this.f17215) {
            int i4 = i2 - i;
            if (i4 == 0 || i4 >= 4096) {
                m13646();
                this.f17220.m31286(i, c0571);
                return;
            }
            if (this.f17213 != null && this.f17228 == i) {
                if (!this.f17212) {
                    C20328 c20328 = this.f17209;
                    if (c20328 == null) {
                        this.f17209 = new C20328(i3);
                    } else {
                        c20328.m45888(i3);
                    }
                    this.f17209.m45884(this.f17213);
                    this.f17212 = true;
                }
                this.f17209.m45884(c0571);
                this.f17228 = i2;
                if (i2 - this.f17222 >= 4096) {
                    m13646();
                    return;
                }
                return;
            }
            m13646();
            this.f17222 = i;
            this.f17228 = i2;
            this.f17213 = c0571;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m13646() {
        C0571 c0571M45887 = this.f17213;
        if (c0571M45887 == null) {
            return;
        }
        C12567 c12567 = this.f17220;
        int i = this.f17222;
        if (this.f17212) {
            c0571M45887 = this.f17209.m45887();
        }
        c12567.m31286(i, c0571M45887);
        this.f17213 = null;
        this.f17212 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6216 m13664() {
        if (!this.f17215) {
            throw new IllegalStateException("Replay index retention is disabled");
        }
        if (!this.f17208) {
            throw new IllegalStateException("Replay dependencies are not complete");
        }
        C6216 c6216M31285 = this.f17220.m31285(EnumC16095.COMPLETE);
        this.f17220 = null;
        return c6216M31285;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13653() {
        this.f17220 = null;
        int i = this.f17219;
        C20328 c20328 = this.f17214;
        if (c20328 != null) {
            c20328.m45888(i);
        }
        this.f17226 = Integer.MAX_VALUE;
        this.f17221 = 0;
        this.f17227.m45888(i);
        C20328 c20329 = this.f17223;
        if (c20329 != null) {
            c20329.m45888(i);
        }
        this.f17213 = null;
        C20328 c203210 = this.f17209;
        if (c203210 != null) {
            c203210.m45888(i);
        }
        C20328 c203211 = this.f17218;
        if (c203211 != null) {
            c203211.m45888(i);
        }
        this.f17212 = false;
        this.f17224 = false;
        this.f17208 = false;
        this.f17210 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13644(C4910 c4910, int i, int i2) {
        if (i == i2) {
            c4910.m13665(i);
            return;
        }
        if (i < c4910.f17226) {
            c4910.f17226 = i;
        }
        if (i2 > c4910.f17221) {
            c4910.f17221 = i2;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13668() {
        int i = this.f17226;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = this.f17221;
        this.f17226 = Integer.MAX_VALUE;
        this.f17221 = 0;
        this.f17227.m45883(i, i2);
        C20328 c20328 = this.f17214;
        if (c20328 != null) {
            c20328.m45883(i, i2);
        }
        C20328 c20329 = this.f17223;
        if (c20329 == null) {
            return;
        }
        InterfaceC9663 interfaceC9663 = this.f17210;
        if (interfaceC9663 == null) {
            c20329.m45883(i, i2);
        } else {
            ((C15059) interfaceC9663).m36088(i, i2);
        }
    }
}
