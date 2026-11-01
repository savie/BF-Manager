package l;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16755 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53638;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LocusId f53639;

    public C16755(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f53638 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f53639 = C0526.m2425(str);
                return;
            } else {
                this.f53639 = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39319() {
        return this.f53638;
    }

    public final int hashCode() {
        String str = this.f53638;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16755.class != obj.getClass()) {
            return false;
        }
        String str = ((C16755) obj).f53638;
        String str2 = this.f53638;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f53638.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LocusId m39320() {
        return this.f53639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16755 m39318(LocusId locusId) {
        C9535.m24383(locusId, "locusId cannot be null");
        String strM2426 = C0526.m2426(locusId);
        if (TextUtils.isEmpty(strM2426)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new C16755(strM2426);
    }
}
