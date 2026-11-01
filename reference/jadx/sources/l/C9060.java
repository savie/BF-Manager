package l;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.ۡᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f30910;

    public C9060(SparseBooleanArray sparseBooleanArray) {
        this.f30910 = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23394(int i) {
        return this.f30910.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23395(int... iArr) {
        for (int i : iArr) {
            if (this.f30910.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23393() {
        return this.f30910.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m23396(int i) {
        SparseBooleanArray sparseBooleanArray = this.f30910;
        C2023.m6503(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9060)) {
            return false;
        }
        C9060 c9060 = (C9060) obj;
        SparseBooleanArray sparseBooleanArray = c9060.f30910;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f30910;
        if (i < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                if (m23396(i2) != c9060.m23396(i2)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f30910;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + m23396(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
