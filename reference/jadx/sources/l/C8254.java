package l;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8254 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f27144;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LocusId f27145;

    public C8254(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f27144 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f27145 = C2288.m7755(str);
                return;
            } else {
                this.f27145 = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22226() {
        return this.f27144;
    }

    public final int hashCode() {
        String str = this.f27144;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8254.class != obj.getClass()) {
            return false;
        }
        String str = ((C8254) obj).f27144;
        String str2 = this.f27144;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f27144.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LocusId m22227() {
        return this.f27145;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8254 m22225(LocusId locusId) {
        C11293.m28552(locusId, "locusId cannot be null");
        String strM7756 = C2288.m7756(locusId);
        if (TextUtils.isEmpty(strM7756)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new C8254(strM7756);
    }
}
