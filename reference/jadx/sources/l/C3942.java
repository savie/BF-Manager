package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۘ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13LV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3942 extends AbstractC10959 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparator[] f14664;

    public C3942(AbstractC10959 abstractC10959, Comparator comparator) {
        this.f14664 = new Comparator[]{abstractC10959, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f14664;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3942) {
            return Arrays.equals(this.f14664, ((C3942) obj).f14664);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14664);
    }

    public final String toString() {
        return C22697.m50267(new StringBuilder("Ordering.compound("), Arrays.toString(this.f14664), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
