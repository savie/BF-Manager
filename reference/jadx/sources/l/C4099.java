package l;

/* JADX INFO: renamed from: l.ۘᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes2.dex */
public final class C4099 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f15019;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13273 f15020;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f15021;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22445 f15022;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f15023;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized void m11636(C13273 c13273) {
        c13273.f44077 = true;
        if (this.f15020 == c13273) {
            this.f15020 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11638() {
        long j = this.f15021 + 1;
        this.f15021 = j;
        this.f15023 = j;
        C13273 c13273 = this.f15020;
        if (c13273 != null) {
            c13273.f44077 = true;
            this.f15020 = null;
        }
        this.f15022 = null;
        this.f15019 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11640() {
        long j = this.f15021 + 1;
        this.f15021 = j;
        this.f15023 = j;
        C13273 c13273 = this.f15020;
        if (c13273 != null) {
            c13273.f44077 = true;
            this.f15020 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C22445 m11641() {
        return this.f15022;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13273 m11637(C1900 c1900, InterfaceC0507 interfaceC0507, C3329 c3329, long j, int i, int i2, C19770 c19770, C22445 c22445, C21033 c21033) {
        C11862 c11862M49818;
        C14789 c14789M49817;
        C2688 c2688;
        C21033 c21034;
        C2688 c2689;
        C5511 c5511;
        C13638.requireNonNull(c1900, "program");
        C13638.requireNonNull(interfaceC0507, "textOwner");
        int length = c3329.length();
        C13638.checkFromToIndex(i, i2, length);
        synchronized (this) {
            long j2 = this.f15021 + 1;
            this.f15021 = j2;
            C22445 c22446 = this.f15022;
            if (c22446 != null && this.f15019 == interfaceC0507 && c22446.f73243 == c1900 && this.f15022.f73244 == j && this.f15022.f73241 == length) {
                c11862M49818 = this.f15022.m49818();
                c14789M49817 = this.f15022.m49817();
                c2688 = this.f15022.f73240;
                C10743 c10743M35427 = i != i2 ? c14789M49817.m35427(c1900, i) : null;
                C14789 c14789 = c14789M49817;
                C10743 c10743 = c10743M35427;
                if (c11862M49818 != null && c22445 != null && this.f15022 == c22445 && this.f15019 == interfaceC0507 && c22445.f73243 == c1900 && c21033 != null && c21033.m47422() == c22445.f73241 && c21033.m47416() == length) {
                    c11862M49818 = c22445.m49818();
                    if (!c21033.m47425() && c1900.m6198() && c1900.m6196()) {
                        c2688 = c22445.f73240 == null ? new C2688(c22445.f73248, c22445.f73242, c21033) : c22445.f73240.m8222(c21033);
                    }
                    c21034 = c21033;
                } else {
                    c21034 = null;
                }
                C11862 c11862 = c11862M49818;
                if (c2688 != null || c2688.f10375.m29569(c2688.f10374)) {
                    c2689 = c2688;
                } else {
                    c2689 = null;
                }
                c5511 = new C5511(this, j2, c1900, interfaceC0507, j, length, i, i2, c11862, c14789, c10743, c21034, c2689);
            } else {
                c11862M49818 = null;
                c14789M49817 = null;
                c2688 = null;
            }
            C14789 c147810 = c14789M49817;
            C10743 c10744 = c10743M35427;
            if (c11862M49818 != null) {
                c21034 = null;
            } else {
                c21034 = null;
            }
            C11862 c11863 = c11862M49818;
            if (c2688 != null) {
                c2689 = c2688;
            } else {
                c2689 = c2688;
            }
            c5511 = new C5511(this, j2, c1900, interfaceC0507, j, length, i, i2, c11863, c147810, c10744, c21034, c2689);
        }
        return m11634(c5511, c3329, c19770);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13273 m11634(C5511 c5511, C3329 c3329, C19770 c19770) {
        C5511.m15203(c5511, this);
        C13273 c13273 = new C13273(this, c5511, c3329, c19770);
        synchronized (this) {
            if (this.f15021 != c13273.f44065) {
                c13273.f44077 = true;
                return c13273;
            }
            C13273 c13274 = this.f15020;
            if (c13274 != null) {
                c13274.f44077 = true;
                this.f15020 = null;
            }
            if (this.f15022 != null && (this.f15019 != c13273.f44072 || this.f15022.f73243 != c13273.f44083)) {
                this.f15022 = null;
                this.f15019 = null;
            }
            this.f15023 = c13273.f44065;
            this.f15020 = c13273;
            return c13273;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11639(C13273 c13273) {
        C22445 c22445;
        C13638.requireNonNull(c13273, "work");
        if (c13273.f44075 != this || (c22445 = c13273.f44066) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c13273.m32751()) {
            m11636(c13273);
            return false;
        }
        synchronized (this) {
            if (this.f15020 == c13273 && this.f15023 == c13273.f44065 && !c13273.f44077) {
                this.f15022 = c22445;
                this.f15019 = c13273.f44072;
                this.f15020 = null;
                return true;
            }
            return false;
        }
    }
}
