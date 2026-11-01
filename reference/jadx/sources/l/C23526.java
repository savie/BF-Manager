package l;

/* JADX INFO: renamed from: l.᩻ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes.dex */
public final class C23526 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5886 f76168;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51828() {
        C5886 c5886 = this.f76168;
        if (c5886 != null) {
            c5886.f20077.m43751();
        }
        this.f76168 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51829() {
        C5886 c5886 = this.f76168;
        if (c5886 != null) {
            c5886.f20077.m43753();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C15495 m51830() {
        C5886 c5886;
        c5886 = this.f76168;
        return c5886 == null ? null : c5886.f20077.m43754();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10826 m51826(C1900 c1900, InterfaceC0507 interfaceC0507, C3329 c3329, long j, C19770 c19770) {
        C5886 c5886M51824;
        C23256 c23256M43749;
        C13638.requireNonNull(c1900, "program");
        C13638.requireNonNull(interfaceC0507, "textOwner");
        synchronized (this) {
            c5886M51824 = m51824(c1900, interfaceC0507);
            c23256M43749 = c5886M51824.f20077.m43749(c1900);
        }
        return new C10826(this, c5886M51824, c5886M51824.f20077.m43747(c23256M43749, c3329, j, (InterfaceC5614) c19770), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10826 m51827(C1900 c1900, InterfaceC0507 interfaceC0507, C3329 c3329, C15495 c15495, long j, C21033 c21033, C19770 c19770) throws Throwable {
        C23256 c23256M43750;
        C21033 c21034;
        C18316 c18316M43747;
        if (c15495 != null) {
            C13638.requireNonNull(c21033, "changes");
        }
        C13638.requireNonNull(c1900, "program");
        C13638.requireNonNull(interfaceC0507, "textOwner");
        synchronized (this) {
            try {
                try {
                    C5886 c5886M51824 = m51824(c1900, interfaceC0507);
                    try {
                        synchronized (c5886M51824.f20077) {
                            try {
                                C15495 c15495M43754 = c5886M51824.f20077.m43754();
                                boolean z = c15495M43754 != null && c15495M43754 == c15495;
                                if (!z) {
                                    c21034 = null;
                                    c23256M43750 = c5886M51824.f20077.m43749(c1900);
                                } else {
                                    int iM18860 = c15495M43754.m37089().m18860();
                                    long j2 = 0;
                                    long j3 = j2 + j2;
                                    if (j3 > iM18860) {
                                        throw new IllegalArgumentException("Syntax edit does not match the current base");
                                    }
                                    C21033 c21033M47414 = c21033 != null ? c21033 : C21033.m47414(iM18860, new C7628(0, (int) j3, 0));
                                    c23256M43750 = c5886M51824.f20077.m43750(c15495M43754, c21033M47414);
                                    c21034 = c21033M47414;
                                }
                                if (z && c21034.m47416() != c3329.length()) {
                                    throw new IllegalArgumentException("Syntax edit does not match the current base");
                                }
                                if (z) {
                                    c18316M43747 = c5886M51824.f20077.m43748(c23256M43750, c3329, j, c19770);
                                } else {
                                    c18316M43747 = c5886M51824.f20077.m43747(c23256M43750, c3329, j, (InterfaceC5614) c19770);
                                }
                                return new C10826(this, c5886M51824, c18316M43747, z);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5886 m51824(C1900 c1900, Object obj) {
        C5886 c5886 = this.f76168;
        if (c5886 != null && c5886.f20075 == c1900 && this.f76168.f20076 == obj) {
            return this.f76168;
        }
        C5886 c5887 = this.f76168;
        if (c5887 != null) {
            c5887.f20077.m43751();
        }
        C5886 c5888 = new C5886(c1900, obj);
        this.f76168 = c5888;
        return c5888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51825(C23526 c23526, C10826 c10826) {
        boolean z;
        synchronized (c23526) {
            if (c10826.f36863 == c23526 && c23526.f76168 == c10826.f36860) {
                if (!c10826.f36860.f20077.m43752(c10826.f36861)) {
                    return false;
                }
                synchronized (c23526) {
                    z = c23526.f76168 == c10826.f36860;
                }
                return z;
            }
            return false;
        }
    }
}
