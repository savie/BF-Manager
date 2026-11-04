package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩹ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EY */
/* JADX INFO: loaded from: classes.dex */
public final class C23334 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75576;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16794 f75577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16794 f75578;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C16794 f75575 = C16794.m39651(":");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C16794 f75574 = C16794.m39651(":status");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C16794 f75572 = C16794.m39651(":method");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16794 f75571 = C16794.m39651(":path");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16794 f75570 = C16794.m39651(":scheme");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C16794 f75573 = C16794.m39651(":authority");

    public C23334(String str, String str2) {
        this(C16794.m39651(str), C16794.m39651(str2));
    }

    public C23334(C16794 c16794, String str) {
        this(c16794, C16794.m39651(str));
    }

    public C23334(C16794 c16794, C16794 c16795) {
        this.f75578 = c16794;
        this.f75577 = c16795;
        this.f75576 = c16795.mo23081() + c16794.mo23081() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23334) {
            C23334 c23334 = (C23334) obj;
            if (this.f75578.equals(c23334.f75578) && this.f75577.equals(c23334.f75577)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f75577.hashCode() + ((this.f75578.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strMo23092 = this.f75578.mo23092();
        String strMo23093 = this.f75577.mo23092();
        byte[] bArr = C19822.f63715;
        Locale locale = Locale.US;
        return C20196.m46451(strMo23092, ": ", strMo23093);
    }
}
