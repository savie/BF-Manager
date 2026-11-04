package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۛ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6641 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12606 m18577(C9622 c9622) {
        synchronized (c9622) {
            String strM25117 = c9622.m25117();
            String strM25126 = c9622.m25126();
            int iM25118 = c9622.m25118();
            if (strM25117.equals(strM25126)) {
                return new C12606(strM25117, iM25118, false);
            }
            int i = iM25118 + 1;
            c9622.m25105(i);
            c9622.m25106(strM25117);
            return new C12606(strM25117, i, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18579(C9622 c9622, C12606 c12606, C3034 c3034) {
        synchronized (c9622) {
            if (m18580(c9622, c12606)) {
                c9622.m25107(new WeakReference(c3034));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m18581(C9622 c9622, C12606 c12606) {
        boolean zM18580;
        synchronized (c9622) {
            zM18580 = m18580(c9622, c12606);
        }
        return zM18580;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3034 m18576(C9622 c9622, C12606 c12606, C20613 c20613, C11983 c11983) {
        synchronized (c9622) {
            if (!m18580(c9622, c12606)) {
                return null;
            }
            WeakReference weakReferenceM25123 = c9622.m25123();
            c9622.m25114(c20613, c11983);
            return weakReferenceM25123 != null ? (C3034) weakReferenceM25123.get() : null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18578(C9622 c9622, C12606 c12606) {
        synchronized (c9622) {
            if (m18580(c9622, c12606)) {
                c9622.m25106((String) null);
                c9622.m25107((WeakReference) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m18580(C9622 c9622, C12606 c12606) {
        return c9622.m25118() == c12606.m31320() && c12606.m31318().equals(c9622.m25117()) && c12606.m31318().equals(c9622.m25126());
    }
}
