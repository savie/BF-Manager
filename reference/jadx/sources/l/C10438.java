package l;

/* JADX INFO: renamed from: l.ۢ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10438 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19389 f33165;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0744 f33166;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f33167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f33168;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f33169;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public synchronized void m26788(C19389 c19389) {
        c19389.f62646 = true;
        if (this.f33165 == c19389) {
            this.f33165 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26790() {
        long j = this.f33167 + 1;
        this.f33167 = j;
        this.f33168 = j;
        C19389 c19389 = this.f33165;
        if (c19389 != null) {
            c19389.f62646 = true;
            this.f33165 = null;
        }
        this.f33166 = null;
        this.f33169 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26792() {
        long j = this.f33167 + 1;
        this.f33167 = j;
        this.f33168 = j;
        C19389 c19389 = this.f33165;
        if (c19389 != null) {
            c19389.f62646 = true;
            this.f33165 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C0744 m26793() {
        return this.f33166;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19389 m26789(C20661 c20661, InterfaceC9629 interfaceC9629, C15508 c15508, long j, int i, int i2, C19959 c19959, C0744 c0744, C22528 c22528) {
        C14913 c14913M3076;
        C3727 c3727M3071;
        C21627 c21627;
        C22528 c22529;
        C21627 c21628;
        C18643 c18643;
        C17359.requireNonNull(c20661, "program");
        C17359.requireNonNull(interfaceC9629, "textOwner");
        int length = c15508.length();
        C17359.checkFromToIndex(i, i2, length);
        synchronized (this) {
            long j2 = this.f33167 + 1;
            this.f33167 = j2;
            C0744 c0745 = this.f33166;
            if (c0745 != null && this.f33169 == interfaceC9629 && c0745.f2715 == c20661 && this.f33166.f2712 == j && this.f33166.f2708 == length) {
                c14913M3076 = this.f33166.m3076();
                c3727M3071 = this.f33166.m3071();
                c21627 = this.f33166.f2717;
                C20925 c20925M12134 = i != i2 ? c3727M3071.m12134(c20661, i) : null;
                C3727 c3727 = c3727M3071;
                C20925 c20925 = c20925M12134;
                if (c14913M3076 != null && c0744 != null && this.f33166 == c0744 && this.f33169 == interfaceC9629 && c0744.f2715 == c20661 && c22528 != null && c22528.m50762() == c0744.f2708 && c22528.m50767() == length) {
                    c14913M3076 = c0744.m3076();
                    if (!c22528.m50760() && c20661.m47276() && c20661.m47283()) {
                        c21627 = c0744.f2717 == null ? new C21627(c0744.f2714, c0744.f2709, c22528) : c0744.f2717.m49142(c22528);
                    }
                    c22529 = c22528;
                } else {
                    c22529 = null;
                }
                C14913 c14913 = c14913M3076;
                if (c21627 != null || c21627.f69051.m35885(c21627.f69050)) {
                    c21628 = c21627;
                } else {
                    c21628 = null;
                }
                c18643 = new C18643(this, j2, c20661, interfaceC9629, j, length, i, i2, c14913, c3727, c20925, c22529, c21628);
            } else {
                c14913M3076 = null;
                c3727M3071 = null;
                c21627 = null;
            }
            C3727 c3728 = c3727M3071;
            C20925 c20926 = c20925M12134;
            if (c14913M3076 != null) {
                c22529 = null;
            } else {
                c22529 = null;
            }
            C14913 c14914 = c14913M3076;
            if (c21627 != null) {
                c21628 = c21627;
            } else {
                c21628 = c21627;
            }
            c18643 = new C18643(this, j2, c20661, interfaceC9629, j, length, i, i2, c14914, c3728, c20926, c22529, c21628);
        }
        return m26786(c18643, c15508, c19959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19389 m26786(C18643 c18643, C15508 c15508, C19959 c19959) {
        C18643.m43397(c18643, this);
        C19389 c19389 = new C19389(this, c18643, c15508, c19959);
        synchronized (this) {
            if (this.f33167 != c19389.f62643) {
                c19389.f62646 = true;
                return c19389;
            }
            C19389 c193810 = this.f33165;
            if (c193810 != null) {
                c193810.f62646 = true;
                this.f33165 = null;
            }
            if (this.f33166 != null && (this.f33169 != c19389.f62642 || this.f33166.f2715 != c19389.f62653)) {
                this.f33166 = null;
                this.f33169 = null;
            }
            this.f33168 = c19389.f62643;
            this.f33165 = c19389;
            return c19389;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26791(C19389 c19389) {
        C0744 c0744;
        C17359.requireNonNull(c19389, "work");
        if (c19389.f62638 != this || (c0744 = c19389.f62651) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c19389.m44837()) {
            m26788(c19389);
            return false;
        }
        synchronized (this) {
            if (this.f33165 == c19389 && this.f33168 == c19389.f62643 && !c19389.f62646) {
                this.f33166 = c0744;
                this.f33169 = c19389.f62642;
                this.f33165 = null;
                return true;
            }
            return false;
        }
    }
}
