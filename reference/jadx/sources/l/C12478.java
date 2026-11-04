package l;

/* JADX INFO: renamed from: l.ۨܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes3.dex */
public final class C12478 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3529 f40072;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30979() {
        C3529 c3529 = this.f40072;
        if (c3529 != null) {
            c3529.f12122.m33989();
        }
        this.f40072 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30980() {
        C3529 c3529 = this.f40072;
        if (c3529 != null) {
            c3529.f12122.m33991();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C2761 m30981() {
        C3529 c3529;
        c3529 = this.f40072;
        return c3529 == null ? null : c3529.f12122.m33992();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20683 m30977(C20661 c20661, InterfaceC9629 interfaceC9629, C15508 c15508, long j, C19959 c19959) {
        C3529 c3529M30975;
        C9472 c9472M33988;
        C17359.requireNonNull(c20661, "program");
        C17359.requireNonNull(interfaceC9629, "textOwner");
        synchronized (this) {
            c3529M30975 = m30975(c20661, interfaceC9629);
            c9472M33988 = c3529M30975.f12122.m33988(c20661);
        }
        return new C20683(this, c3529M30975, c3529M30975.f12122.m33985(c9472M33988, c15508, j, (InterfaceC7509) c19959), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20683 m30978(C20661 c20661, InterfaceC9629 interfaceC9629, C15508 c15508, C2761 c2761, long j, C22528 c22528, C19959 c19959) throws Throwable {
        C9472 c9472M33987;
        C22528 c22529;
        C7236 c7236M33985;
        if (c2761 != null) {
            C17359.requireNonNull(c22528, "changes");
        }
        C17359.requireNonNull(c20661, "program");
        C17359.requireNonNull(interfaceC9629, "textOwner");
        synchronized (this) {
            try {
                try {
                    C3529 c3529M30975 = m30975(c20661, interfaceC9629);
                    try {
                        synchronized (c3529M30975.f12122) {
                            try {
                                C2761 c2761M33992 = c3529M30975.f12122.m33992();
                                boolean z = c2761M33992 != null && c2761M33992 == c2761;
                                if (!z) {
                                    c22529 = null;
                                    c9472M33987 = c3529M30975.f12122.m33988(c20661);
                                } else {
                                    int iM4628 = c2761M33992.m9131().m4628();
                                    long j2 = 0;
                                    long j3 = j2 + j2;
                                    if (j3 > iM4628) {
                                        throw new IllegalArgumentException("Syntax edit does not match the current base");
                                    }
                                    C22528 c22528M50752 = c22528 != null ? c22528 : C22528.m50752(iM4628, new C10593(0, (int) j3, 0));
                                    c9472M33987 = c3529M30975.f12122.m33987(c2761M33992, c22528M50752);
                                    c22529 = c22528M50752;
                                }
                                if (z && c22529.m50767() != c15508.length()) {
                                    throw new IllegalArgumentException("Syntax edit does not match the current base");
                                }
                                if (z) {
                                    c7236M33985 = c3529M30975.f12122.m33986(c9472M33987, c15508, j, c19959);
                                } else {
                                    c7236M33985 = c3529M30975.f12122.m33985(c9472M33987, c15508, j, (InterfaceC7509) c19959);
                                }
                                return new C20683(this, c3529M30975, c7236M33985, z);
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
    private C3529 m30975(C20661 c20661, Object obj) {
        C3529 c3529 = this.f40072;
        if (c3529 != null && c3529.f12120 == c20661 && this.f40072.f12121 == obj) {
            return this.f40072;
        }
        C3529 c35210 = this.f40072;
        if (c35210 != null) {
            c35210.f12122.m33989();
        }
        C3529 c35211 = new C3529(c20661, obj);
        this.f40072 = c35211;
        return c35211;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30976(C12478 c12478, C20683 c20683) {
        boolean z;
        synchronized (c12478) {
            if (c20683.f66311 == c12478 && c12478.f40072 == c20683.f66308) {
                if (!c20683.f66308.f12122.m33990(c20683.f66310)) {
                    return false;
                }
                synchronized (c12478) {
                    z = c12478.f40072 == c20683.f66308;
                }
                return z;
            }
            return false;
        }
    }
}
