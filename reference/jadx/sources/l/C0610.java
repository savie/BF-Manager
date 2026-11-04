package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610 extends C20222 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f2418;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f2419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7521 f2420;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7521[] f2421;

    public C0610(C24960 c24960) {
        ArrayList arrayListM55749 = c24960.m55749();
        int iM55737 = c24960.m55737();
        this.f2419 = iM55737;
        C7521 c7521 = new C7521(iM55737);
        this.f2420 = c7521;
        this.f2421 = new C7521[arrayListM55749.size()];
        this.f2418 = new HashMap();
        c7521.mo15005();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2729(int i, C7521 c7521) {
        C7521[] c7521Arr = this.f2421;
        try {
            C7521 c7522 = c7521Arr[i];
            if (c7522 == null) {
                m46490();
                try {
                    c7521Arr[i] = c7521;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus index");
                }
            }
            C7521 c7521M20588 = c7522.m20588();
            c7521M20588.m20587(c7521);
            if (c7522.equals(c7521M20588)) {
                return false;
            }
            c7521M20588.mo15005();
            m46490();
            try {
                c7521Arr[i] = c7521M20588;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus index");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2728(AbstractC5568 abstractC5568, C20946 c20946) {
        m46490();
        this.f2418.put(abstractC5568, c20946);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7521 m2727(int i) {
        try {
            C7521 c7521 = this.f2421[i];
            return c7521 != null ? c7521 : this.f2420;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7521 m2730(int i) {
        try {
            C7521 c7521 = this.f2421[i];
            return c7521 != null ? c7521.m20588() : new C7521(this.f2419);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }
}
