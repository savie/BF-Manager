package l;

import android.util.Pair;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩻ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24755 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC24755 f80138 = new C5363();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo16021();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1588(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo1589(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract C1634 mo1591(int i, C1634 c1634, boolean z);

    /* JADX INFO: renamed from: ۙ */
    public abstract C11328 mo1592(int i, C11328 c11328, long j);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo16022();

    static {
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m55264() {
        return mo16022() == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo15533(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo15543(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo15543(z) ? mo15534(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo15541(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo15534(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo15534(z) ? mo15543(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo15543(boolean z) {
        if (m55264()) {
            return -1;
        }
        return mo16022() - 1;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo15534(boolean z) {
        return m55264() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55263(int i, C11328 c11328) {
        mo1592(i, c11328, 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m55261(C11328 c11328, C1634 c1634, int i, long j) {
        Pair pairM55262 = m55262(c11328, c1634, i, j, 0L);
        pairM55262.getClass();
        return pairM55262;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m55262(C11328 c11328, C1634 c1634, int i, long j, long j2) {
        C20782.m47561(i, mo16022());
        mo1592(i, c11328, j2);
        if (j == -9223372036854775807L) {
            j = c11328.f35686;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c11328.f35697;
        mo1591(i2, c1634, false);
        while (i2 < c11328.f35687 && c1634.f5659 != j) {
            int i3 = i2 + 1;
            if (mo1591(i3, c1634, false).f5659 > j) {
                break;
            }
            i2 = i3;
        }
        mo1591(i2, c1634, true);
        long jMin = j - c1634.f5659;
        long j3 = c1634.f5660;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c1634.f5658;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: ۙ */
    public C1634 mo15535(Object obj, C1634 c1634) {
        return mo1591(mo1588(obj), c1634, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55260(int i, C1634 c1634, C11328 c11328, int i2, boolean z) {
        int i3 = mo1591(i, c1634, false).f5657;
        if (mo1592(i3, c11328, 0L).f35687 != i) {
            return i + 1;
        }
        int iMo15533 = mo15533(i3, i2, z);
        if (iMo15533 == -1) {
            return -1;
        }
        return mo1592(iMo15533, c11328, 0L).f35697;
    }

    public boolean equals(Object obj) {
        int iMo15543;
        if (this != obj) {
            if (obj instanceof AbstractC24755) {
                AbstractC24755 abstractC24755 = (AbstractC24755) obj;
                if (abstractC24755.mo16022() == mo16022() && abstractC24755.mo16021() == mo16021()) {
                    C11328 c11328 = new C11328();
                    C1634 c1634 = new C1634();
                    C11328 c11329 = new C11328();
                    C1634 c1635 = new C1634();
                    for (int i = 0; i < mo16022(); i++) {
                        if (mo1592(i, c11328, 0L).equals(abstractC24755.mo1592(i, c11329, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo16021(); i2++) {
                        if (mo1591(i2, c1634, true).equals(abstractC24755.mo1591(i2, c1635, true))) {
                        }
                    }
                    int iMo15534 = mo15534(true);
                    if (iMo15534 == abstractC24755.mo15534(true) && (iMo15543 = mo15543(true)) == abstractC24755.mo15543(true)) {
                        while (iMo15534 != iMo15543) {
                            int iMo15533 = mo15533(iMo15534, 0, true);
                            if (iMo15533 == abstractC24755.mo15533(iMo15534, 0, true)) {
                                iMo15534 = iMo15533;
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
        C11328 c11328 = new C11328();
        C1634 c1634 = new C1634();
        int iMo16022 = mo16022() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION;
        for (int i = 0; i < mo16022(); i++) {
            iMo16022 = (iMo16022 * 31) + mo1592(i, c11328, 0L).hashCode();
        }
        int iMo16021 = mo16021() + (iMo16022 * 31);
        for (int i2 = 0; i2 < mo16021(); i2++) {
            iMo16021 = (iMo16021 * 31) + mo1591(i2, c1634, true).hashCode();
        }
        int iMo15534 = mo15534(true);
        while (iMo15534 != -1) {
            iMo16021 = (iMo16021 * 31) + iMo15534;
            iMo15534 = mo15533(iMo15534, 0, true);
        }
        return iMo16021;
    }
}
