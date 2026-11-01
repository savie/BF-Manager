package l;

import android.util.Pair;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ܽ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16511 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC16511 f53035 = new C15806();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo19928();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo14959(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo14960(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract C0282 mo14810(int i, C0282 c0282, long j);

    /* JADX INFO: renamed from: ۙ */
    public abstract C20039 mo5920(int i, C20039 c20039, boolean z);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo19929();

    static {
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m38828() {
        return mo19929() == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo24006(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo24009(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo24009(z) ? mo24007(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo24008(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo24007(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo24007(z) ? mo24009(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo24009(boolean z) {
        if (m38828()) {
            return -1;
        }
        return mo19929() - 1;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo24007(boolean z) {
        return m38828() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38827(int i, C0282 c0282) {
        mo14810(i, c0282, 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m38824(C0282 c0282, C20039 c20039, int i, long j) {
        Pair pairM38825 = m38825(c0282, c20039, i, j, 0L);
        pairM38825.getClass();
        return pairM38825;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m38825(C0282 c0282, C20039 c20039, int i, long j, long j2) {
        C2023.m6503(i, mo19929());
        mo14810(i, c0282, j2);
        if (j == -9223372036854775807L) {
            j = c0282.f1582;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c0282.f1580;
        mo5920(i2, c20039, false);
        while (i2 < c0282.f1587 && c20039.f64171 != j) {
            int i3 = i2 + 1;
            if (mo5920(i3, c20039, false).f64171 > j) {
                break;
            }
            i2 = i3;
        }
        mo5920(i2, c20039, true);
        long jMin = j - c20039.f64171;
        long j3 = c20039.f64173;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c20039.f64174;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20039 mo38826(Object obj, C20039 c20039) {
        return mo5920(mo14959(obj), c20039, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38823(int i, C20039 c20039, C0282 c0282, int i2, boolean z) {
        int i3 = mo5920(i, c20039, false).f64168;
        if (mo14810(i3, c0282, 0L).f1587 != i) {
            return i + 1;
        }
        int iMo24006 = mo24006(i3, i2, z);
        if (iMo24006 == -1) {
            return -1;
        }
        return mo14810(iMo24006, c0282, 0L).f1580;
    }

    public boolean equals(Object obj) {
        int iMo24009;
        if (this != obj) {
            if (obj instanceof AbstractC16511) {
                AbstractC16511 abstractC16511 = (AbstractC16511) obj;
                if (abstractC16511.mo19929() == mo19929() && abstractC16511.mo19928() == mo19928()) {
                    C0282 c0282 = new C0282();
                    C20039 c20039 = new C20039();
                    C0282 c0283 = new C0282();
                    C20039 c200310 = new C20039();
                    for (int i = 0; i < mo19929(); i++) {
                        if (mo14810(i, c0282, 0L).equals(abstractC16511.mo14810(i, c0283, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo19928(); i2++) {
                        if (mo5920(i2, c20039, true).equals(abstractC16511.mo5920(i2, c200310, true))) {
                        }
                    }
                    int iMo24007 = mo24007(true);
                    if (iMo24007 == abstractC16511.mo24007(true) && (iMo24009 = mo24009(true)) == abstractC16511.mo24009(true)) {
                        while (iMo24007 != iMo24009) {
                            int iMo24006 = mo24006(iMo24007, 0, true);
                            if (iMo24006 == abstractC16511.mo24006(iMo24007, 0, true)) {
                                iMo24007 = iMo24006;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C0282 c0282 = new C0282();
        C20039 c20039 = new C20039();
        int iMo19929 = mo19929() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION;
        for (int i = 0; i < mo19929(); i++) {
            iMo19929 = (iMo19929 * 31) + mo14810(i, c0282, 0L).hashCode();
        }
        int iMo19928 = mo19928() + (iMo19929 * 31);
        for (int i2 = 0; i2 < mo19928(); i2++) {
            iMo19928 = (iMo19928 * 31) + mo5920(i2, c20039, true).hashCode();
        }
        int iMo24007 = mo24007(true);
        while (iMo24007 != -1) {
            iMo19928 = (iMo19928 * 31) + iMo24007;
            iMo24007 = mo24006(iMo24007, 0, true);
        }
        return iMo19928;
    }
}
