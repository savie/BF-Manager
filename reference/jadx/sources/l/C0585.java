package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0585 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20342 m2784(C11897 c11897) {
        synchronized (c11897) {
            String strM29678 = c11897.m29678();
            String strM29660 = c11897.m29660();
            int iM29676 = c11897.m29676();
            if (strM29678.equals(strM29660)) {
                return new C20342(strM29678, iM29676, false);
            }
            int i = iM29676 + 1;
            c11897.m29662(i);
            c11897.m29663(strM29678);
            return new C20342(strM29678, i, true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2786(C11897 c11897, C20342 c20342, C11072 c11072) {
        synchronized (c11897) {
            if (m2787(c11897, c20342)) {
                c11897.m29664(new WeakReference(c11072));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m2788(C11897 c11897, C20342 c20342) {
        boolean zM2787;
        synchronized (c11897) {
            zM2787 = m2787(c11897, c20342);
        }
        return zM2787;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11072 m2783(C11897 c11897, C20342 c20342, C0690 c0690, C14600 c14600) {
        synchronized (c11897) {
            if (!m2787(c11897, c20342)) {
                return null;
            }
            WeakReference weakReferenceM29674 = c11897.m29674();
            c11897.m29666(c0690, c14600);
            return weakReferenceM29674 != null ? (C11072) weakReferenceM29674.get() : null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2785(C11897 c11897, C20342 c20342) {
        synchronized (c11897) {
            if (m2787(c11897, c20342)) {
                c11897.m29663((String) null);
                c11897.m29664((WeakReference) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2787(C11897 c11897, C20342 c20342) {
        return c11897.m29676() == c20342.m45907() && c20342.m45905().equals(c11897.m29678()) && c20342.m45905().equals(c11897.m29660());
    }
}
