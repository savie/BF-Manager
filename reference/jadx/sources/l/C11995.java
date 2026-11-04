package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11995 extends C20222 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f38655;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f38656;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7521 f38657;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7521[] f38658;

    public C11995(C9757 c9757) {
        C14978 c14978M25432 = c9757.m25432();
        int iM37668 = c14978M25432.m37668();
        int iM36043 = c14978M25432.m36043();
        this.f38656 = iM36043;
        C7521 c7521 = new C7521(iM36043);
        this.f38657 = c7521;
        this.f38658 = new C7521[iM37668];
        this.f38655 = new HashMap(c14978M25432.m36045());
        c7521.mo15005();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30152(int i, C7521 c7521) {
        C7521[] c7521Arr = this.f38658;
        try {
            C7521 c7522 = c7521Arr[i];
            if (c7522 == null) {
                m46490();
                try {
                    c7521Arr[i] = c7521;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus label");
                }
            }
            C7521 c7521M20588 = c7522.m20588();
            if (c7522.size() != 0) {
                c7521M20588.m20587(c7521);
            } else {
                c7521M20588 = c7521.m20588();
            }
            if (c7522.equals(c7521M20588)) {
                return false;
            }
            c7521M20588.mo15005();
            m46490();
            try {
                c7521Arr[i] = c7521M20588;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus label");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7521 m30149(C22438 c22438) {
        try {
            C7521 c7521 = this.f38658[c22438.mo31292()];
            return c7521 != null ? c7521 : this.f38657;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30151(AbstractC17216 abstractC17216, C20946 c20946) {
        m46490();
        this.f38655.put(abstractC17216, c20946);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m30150(AbstractC17216 abstractC17216) {
        return (C20946) this.f38655.get(abstractC17216);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30153() {
        return this.f38655.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7521 m30148(int i) {
        try {
            C7521 c7521 = this.f38658[i];
            return c7521 != null ? c7521.m20588() : new C7521(this.f38656);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
