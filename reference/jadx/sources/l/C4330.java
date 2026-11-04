package l;

import android.os.Build;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4330 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C4330 f15682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8639 f15683;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f15685;

    static {
        C4330 c4330;
        if (Build.VERSION.SDK_INT < 33) {
            c4330 = new C4330(2, 10);
        } else {
            C9384 c9384 = new C9384();
            for (int i = 1; i <= 10; i++) {
                c9384.mo24710((Object) Integer.valueOf(C7116.m19504(i)));
            }
            c4330 = new C4330(2, c9384.mo24709());
        }
        f15682 = c4330;
    }

    public C4330(int i, Set set) {
        this.f15685 = i;
        AbstractC8639 abstractC8639CopyOf = AbstractC8639.copyOf((Collection) set);
        this.f15683 = abstractC8639CopyOf;
        AbstractC4516 it = abstractC8639CopyOf.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f15684 = iMax;
    }

    public C4330(int i, int i2) {
        this.f15685 = i;
        this.f15684 = i2;
        this.f15683 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13825(int i) {
        AbstractC8639 abstractC8639 = this.f15683;
        if (abstractC8639 == null) {
            return i <= this.f15684;
        }
        int iM19504 = C7116.m19504(i);
        if (iM19504 == 0) {
            return false;
        }
        return abstractC8639.contains(Integer.valueOf(iM19504));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13824(int i, C18412 c18412) {
        if (this.f15683 != null) {
            return this.f15684;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f15685;
        if (i2 >= 29) {
            return C6568.m18486(i3, i, c18412);
        }
        Object obj = C14770.f48337.get(Integer.valueOf(i3));
        return ((Integer) (obj != null ? obj : 0)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4330)) {
            return false;
        }
        C4330 c4330 = (C4330) obj;
        return this.f15685 == c4330.f15685 && this.f15684 == c4330.f15684 && C17359.equals(this.f15683, c4330.f15683);
    }

    public final int hashCode() {
        int i = ((this.f15685 * 31) + this.f15684) * 31;
        AbstractC8639 abstractC8639 = this.f15683;
        return i + (abstractC8639 == null ? 0 : abstractC8639.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f15685 + ", maxChannelCount=" + this.f15684 + ", channelMasks=" + this.f15683 + "]";
    }
}
