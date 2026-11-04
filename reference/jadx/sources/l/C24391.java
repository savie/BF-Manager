package l;

/* JADX INFO: renamed from: l.᩺ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes.dex */
public final class C24391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC12456 f79116;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f79117;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f79118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79119;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f79120;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C15068 f79121;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15068 f79122;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12831 f79123;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f79124;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f79125;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15068 f79126;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f79127;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f79128;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f79129 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f79130;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f79131;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1645 f79132;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15068 f79133;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15068 f79134;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C15068 f79135;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f79136;

    public C24391(int i, int i2, boolean z, boolean z2) {
        this.f79120 = i;
        this.f79119 = i2;
        this.f79117 = z;
        this.f79124 = z2;
        this.f79126 = new C15068(i);
        this.f79121 = z ? null : new C15068(i);
        this.f79135 = z ? null : new C15068(i);
        this.f79118 = i2;
        this.f79134 = z2 ? new C15068(i) : null;
        this.f79132 = z ? new C1645(i) : null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54519(C12831 c12831) {
        C15068 c15068 = this.f79121;
        if (c15068 == null || this.f79119 == 0) {
            return;
        }
        if (c12831 == null) {
            c15068.m36326();
        } else {
            c15068.m36324(c12831);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12831 m54522(int i) {
        C15068 c15068 = this.f79121;
        if (c15068 == null) {
            throw new IllegalStateException("Not a window recorder");
        }
        m54521();
        c15068.m36325(this.f79126);
        c15068.m36323(0, i);
        c15068.m36322(0);
        c15068.m36322(i);
        return c15068.m36327();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m54520() {
        return this.f79118;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12831 m54528(int i) {
        m54521();
        int i2 = this.f79118;
        C15068 c15068 = this.f79135;
        c15068.m36323(i2, i);
        c15068.m36322(this.f79118);
        c15068.m36322(i);
        C12831 c12831M36327 = c15068.m36327();
        c15068.m36328(this.f79120);
        this.f79118 = i;
        return c12831M36327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54514(InterfaceC12456 interfaceC12456) {
        if (!this.f79124) {
            if (interfaceC12456 != null) {
                throw new IllegalStateException("End-search proofs are disabled");
            }
            return;
        }
        boolean z = this.f79125;
        if ((z || this.f79131) && interfaceC12456 != this.f79116) {
            throw new IllegalStateException("Cannot change syntax observation sink in the current state");
        }
        if (z || this.f79131 || interfaceC12456 == this.f79116) {
            return;
        }
        m54521();
        this.f79116 = interfaceC12456;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54516() {
        return this.f79119;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54527(C12831 c12831) {
        C17359.requireNonNull(c12831, "dependency");
        if (this.f79125 || this.f79131) {
            throw new IllegalStateException("Cannot resume a syntax checkpoint in the current state");
        }
        if (c12831.m31855() != this.f79120) {
            throw new IllegalArgumentException("Checkpoint dependency length differs");
        }
        this.f79126.m36324(c12831);
        C15068 c15068 = this.f79121;
        if (c15068 != null) {
            c15068.m36326();
        }
        C15068 c15069 = this.f79135;
        if (c15069 != null) {
            c15069.m36326();
        }
        C15068 c150610 = this.f79134;
        if (c150610 != null) {
            c150610.m36324(c12831);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54529() {
        if (this.f79125 || this.f79131) {
            throw new IllegalStateException("Cannot observe EOF in the current replay state");
        }
        this.f79126.m36321();
        C15068 c15068 = this.f79135;
        if (c15068 != null) {
            c15068.m36321();
        }
        C15068 c15069 = this.f79134;
        if (c15069 == null) {
            return;
        }
        InterfaceC12456 interfaceC12456 = this.f79116;
        if (interfaceC12456 == null) {
            c15069.m36321();
        } else {
            ((C14211) interfaceC12456).m34496();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54525(int i) {
        if (this.f79125 || this.f79131 || i < 0 || i > this.f79120) {
            throw new IllegalStateException("Cannot observe syntax input boundary");
        }
        this.f79126.m36322(i);
        C15068 c15068 = this.f79135;
        if (c15068 != null) {
            c15068.m36322(i);
        }
        C15068 c15069 = this.f79134;
        if (c15069 == null) {
            return;
        }
        InterfaceC12456 interfaceC12456 = this.f79116;
        if (interfaceC12456 == null) {
            c15069.m36322(i);
        } else {
            ((C14211) interfaceC12456).m34503(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54515(C12831 c12831) {
        if (this.f79125 || this.f79131 || c12831.m31855() != this.f79120) {
            throw new IllegalStateException("Cannot commit syntax end-search dependency");
        }
        C15068 c15068 = this.f79134;
        if (c15068 == null) {
            throw new IllegalStateException("End-search proofs are disabled");
        }
        c15068.m36324(c12831);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54518(int i, int i2, C12831 c12831) {
        int i3 = this.f79119;
        if (i >= i3 || i2 > i3) {
            throw new IllegalArgumentException("Reused dependency crosses replay entry");
        }
        m54508(i, i2, c12831);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54513(int i, boolean z) {
        if (z || i - this.f79119 >= 4096) {
            if (z) {
                i = this.f79120;
            }
            m54509(i, z);
            if (z) {
                m54507();
                this.f79125 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12831 m54510(int i, int i2, C12831 c12831) {
        int i3;
        if (this.f79125 || this.f79131 || i < this.f79119 || i2 < i || i2 >= (i3 = this.f79120)) {
            throw new IllegalArgumentException("Invalid syntax checkpoint dependency");
        }
        m54521();
        C15068 c15068 = this.f79122;
        if (c15068 == null) {
            this.f79122 = new C15068(i3);
        } else {
            c15068.m36328(i3);
        }
        C15068 c15069 = this.f79122;
        C15068 c150610 = this.f79134;
        if (c150610 == null) {
            c150610 = this.f79126;
        }
        c15069.m36325(c150610);
        if (c12831 != null) {
            this.f79122.m36324(c12831);
        }
        C15068 c150611 = this.f79122;
        c150611.m36323(this.f79119, i2);
        c150611.m36322(this.f79119);
        c150611.m36322(i2);
        return c150611.m36327();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54512(int i) {
        int i2;
        if (this.f79125 || this.f79131 || i < (i2 = this.f79119) || i >= this.f79120) {
            throw new IllegalArgumentException("Invalid syntax convergence entry");
        }
        if (i != i2) {
            m54509(i, false);
        }
        this.f79131 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12831 m54517(int i) {
        int i2;
        if (this.f79125 || this.f79131 || i <= this.f79119 || i > (i2 = this.f79120)) {
            throw new IllegalArgumentException("Invalid speculative dependency range");
        }
        m54521();
        int i3 = this.f79119;
        C15068 c15068 = this.f79126;
        c15068.m36323(i3, i);
        c15068.m36322(this.f79119);
        c15068.m36322(i);
        C12831 c12831M36327 = c15068.m36327();
        c15068.m36328(i2);
        C15068 c15069 = this.f79134;
        if (c15069 != null) {
            c15069.m36328(i2);
        }
        this.f79119 = i;
        return c12831M36327;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54526(int i, int i2, C12831 c12831) {
        int i3;
        if (this.f79125 || this.f79131 || i < this.f79119 || i2 <= i || i2 > (i3 = this.f79120) || c12831.m31855() != i3) {
            throw new IllegalArgumentException("Invalid confirmed syntax fragment");
        }
        if (i != this.f79119) {
            m54509(i, false);
        }
        m54508(i, i2, c12831);
        C15068 c15068 = this.f79121;
        if (c15068 != null) {
            c15068.m36324(c12831);
        }
        C15068 c15069 = this.f79135;
        if (c15069 != null) {
            c15069.m36324(c12831);
        }
        this.f79119 = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m54530(int i, int i2, C12831 c12831) {
        if (!this.f79131 || i < this.f79119) {
            throw new IllegalArgumentException("Reused dependency precedes convergence entry");
        }
        m54508(i, i2, c12831);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m54523() {
        if (!this.f79131 || this.f79125) {
            throw new IllegalStateException("Syntax suffix is not being reused");
        }
        m54507();
        this.f79125 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m54509(int i, boolean z) {
        m54521();
        int i2 = this.f79119;
        C15068 c15068 = this.f79126;
        c15068.m36323(i2, i);
        c15068.m36322(this.f79119);
        c15068.m36322(i);
        if (z) {
            c15068.m36321();
            C15068 c15069 = this.f79135;
            if (c15069 != null) {
                c15069.m36321();
            }
        }
        C15068 c150610 = this.f79121;
        if (c150610 != null) {
            c150610.m36325(c15068);
        }
        m54508(this.f79119, i, c15068.m36327());
        this.f79119 = i;
        int i3 = this.f79120;
        c15068.m36328(i3);
        C15068 c150611 = this.f79134;
        if (c150611 != null) {
            c150611.m36328(i3);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m54508(int i, int i2, C12831 c12831) {
        int i3;
        if (i2 < i || i2 > (i3 = this.f79120)) {
            throw new IllegalArgumentException("Invalid syntax dependency block");
        }
        if (this.f79117) {
            int i4 = i2 - i;
            if (i4 == 0 || i4 >= 4096) {
                m54507();
                this.f79132.m5927(i, c12831);
                return;
            }
            if (this.f79123 != null && this.f79136 == i) {
                if (!this.f79130) {
                    C15068 c15068 = this.f79133;
                    if (c15068 == null) {
                        this.f79133 = new C15068(i3);
                    } else {
                        c15068.m36328(i3);
                    }
                    this.f79133.m36324(this.f79123);
                    this.f79130 = true;
                }
                this.f79133.m36324(c12831);
                this.f79136 = i2;
                if (i2 - this.f79127 >= 4096) {
                    m54507();
                    return;
                }
                return;
            }
            m54507();
            this.f79127 = i;
            this.f79136 = i2;
            this.f79123 = c12831;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m54507() {
        C12831 c12831M36327 = this.f79123;
        if (c12831M36327 == null) {
            return;
        }
        C1645 c1645 = this.f79132;
        int i = this.f79127;
        if (this.f79130) {
            c12831M36327 = this.f79133.m36327();
        }
        c1645.m5927(i, c12831M36327);
        this.f79123 = null;
        this.f79130 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24766 m54524() {
        if (!this.f79117) {
            throw new IllegalStateException("Replay index retention is disabled");
        }
        if (!this.f79125) {
            throw new IllegalStateException("Replay dependencies are not complete");
        }
        C24766 c24766M5926 = this.f79132.m5926(EnumC19544.COMPLETE);
        this.f79132 = null;
        return c24766M5926;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54511() {
        this.f79132 = null;
        int i = this.f79120;
        C15068 c15068 = this.f79135;
        if (c15068 != null) {
            c15068.m36328(i);
        }
        this.f79129 = Integer.MAX_VALUE;
        this.f79128 = 0;
        this.f79126.m36328(i);
        C15068 c15069 = this.f79134;
        if (c15069 != null) {
            c15069.m36328(i);
        }
        this.f79123 = null;
        C15068 c150610 = this.f79133;
        if (c150610 != null) {
            c150610.m36328(i);
        }
        C15068 c150611 = this.f79122;
        if (c150611 != null) {
            c150611.m36328(i);
        }
        this.f79130 = false;
        this.f79131 = false;
        this.f79125 = false;
        this.f79116 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54506(C24391 c24391, int i, int i2) {
        if (i == i2) {
            c24391.m54525(i);
            return;
        }
        if (i < c24391.f79129) {
            c24391.f79129 = i;
        }
        if (i2 > c24391.f79128) {
            c24391.f79128 = i2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m54521() {
        int i = this.f79129;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        int i2 = this.f79128;
        this.f79129 = Integer.MAX_VALUE;
        this.f79128 = 0;
        this.f79126.m36323(i, i2);
        C15068 c15068 = this.f79135;
        if (c15068 != null) {
            c15068.m36323(i, i2);
        }
        C15068 c15069 = this.f79134;
        if (c15069 == null) {
            return;
        }
        InterfaceC12456 interfaceC12456 = this.f79116;
        if (interfaceC12456 == null) {
            c15069.m36323(i, i2);
        } else {
            ((C14211) interfaceC12456).m34498(i, i2);
        }
    }
}
