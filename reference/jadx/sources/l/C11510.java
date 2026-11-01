package l;

import android.os.Build;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11510 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11510 f38690;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 f38691;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f38692;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38693;

    static {
        C11510 c11510;
        if (Build.VERSION.SDK_INT < 33) {
            c11510 = new C11510(2, 10);
        } else {
            C6204 c6204 = new C6204();
            for (int i = 1; i <= 10; i++) {
                c6204.mo13308((Object) Integer.valueOf(C17983.m41854(i)));
            }
            c11510 = new C11510(2, c6204.mo14317());
        }
        f38690 = c11510;
    }

    public C11510(int i, Set set) {
        this.f38693 = i;
        AbstractC23844 abstractC23844CopyOf = AbstractC23844.copyOf((Collection) set);
        this.f38691 = abstractC23844CopyOf;
        AbstractC0477 it = abstractC23844CopyOf.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f38692 = iMax;
    }

    public C11510(int i, int i2) {
        this.f38693 = i;
        this.f38692 = i2;
        this.f38691 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28693(int i) {
        AbstractC23844 abstractC23844 = this.f38691;
        if (abstractC23844 == null) {
            return i <= this.f38692;
        }
        int iM41854 = C17983.m41854(i);
        if (iM41854 == 0) {
            return false;
        }
        return abstractC23844.contains(Integer.valueOf(iM41854));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28692(int i, C2708 c2708) {
        if (this.f38691 != null) {
            return this.f38692;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f38693;
        if (i2 >= 29) {
            return C4453.m12423(i3, i, c2708);
        }
        Object obj = C2336.f8270.get(Integer.valueOf(i3));
        return ((Integer) (obj != null ? obj : 0)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11510)) {
            return false;
        }
        C11510 c11510 = (C11510) obj;
        return this.f38693 == c11510.f38693 && this.f38692 == c11510.f38692 && C13638.equals(this.f38691, c11510.f38691);
    }

    public final int hashCode() {
        int i = ((this.f38693 * 31) + this.f38692) * 31;
        AbstractC23844 abstractC23844 = this.f38691;
        return i + (abstractC23844 == null ? 0 : abstractC23844.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f38693 + ", maxChannelCount=" + this.f38692 + ", channelMasks=" + this.f38691 + "]";
    }
}
