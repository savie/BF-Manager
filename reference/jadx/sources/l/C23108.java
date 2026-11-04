package l;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.᩸᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23108 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f74913;

    public C23108(SparseBooleanArray sparseBooleanArray) {
        this.f74913 = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52011(int i) {
        return this.f74913.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52012(int... iArr) {
        for (int i : iArr) {
            if (this.f74913.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52010() {
        return this.f74913.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52013(int i) {
        SparseBooleanArray sparseBooleanArray = this.f74913;
        C20782.m47561(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23108)) {
            return false;
        }
        C23108 c23108 = (C23108) obj;
        SparseBooleanArray sparseBooleanArray = c23108.f74913;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f74913;
        if (i < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                if (m52013(i2) != c23108.m52013(i2)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f74913;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + m52013(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
