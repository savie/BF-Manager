package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܺܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16908 extends AbstractC18753 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparator[] f55292;

    public C16908(AbstractC18753 abstractC18753, Comparator comparator) {
        this.f55292 = new Comparator[]{abstractC18753, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f55292;
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
        if (obj instanceof C16908) {
            return Arrays.equals(this.f55292, ((C16908) obj).f55292);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55292);
    }

    public final String toString() {
        return C8947.m23910(new StringBuilder("Ordering.compound("), Arrays.toString(this.f55292), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
