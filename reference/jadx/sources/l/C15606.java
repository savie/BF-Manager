package l;

/* JADX INFO: renamed from: l.ܺ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15606 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50739;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f50740;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50741;

    public C15606(String str, int i, int i2) {
        str.getClass();
        this.f50740 = str;
        this.f50741 = i;
        this.f50739 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37273(int i) {
        int i2;
        int i3 = this.f50741;
        if (i3 >= 0 && (i2 = this.f50739) <= i && i3 <= i2) {
            String str = this.f50740;
            int iIndexOf = str.indexOf(59);
            if (iIndexOf == -1) {
                return C3504.m10306(str);
            }
            if (C3504.m10306(str.substring(0, iIndexOf))) {
                boolean z = true;
                while (z) {
                    int i4 = iIndexOf + 1;
                    int iIndexOf2 = str.indexOf(61, i4);
                    if (iIndexOf2 != -1) {
                        String strSubstring = str.substring(i4, iIndexOf2);
                        int iIndexOf3 = str.indexOf(59, iIndexOf2 + 1);
                        if (iIndexOf3 == -1) {
                            z = false;
                        }
                        if (C3504.m10306(strSubstring)) {
                            iIndexOf = iIndexOf3;
                        }
                    } else {
                        z = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15606.class == obj.getClass()) {
            C15606 c15606 = (C15606) obj;
            if (this.f50741 == c15606.f50741 && this.f50739 == c15606.f50739 && this.f50740.equals(c15606.f50740)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f50740.hashCode() * 31) + this.f50741) * 31) + this.f50739;
    }

    public final String toString() {
        return "Style{value='" + this.f50740 + "', start=" + this.f50741 + ", end=" + this.f50739 + '}';
    }
}
