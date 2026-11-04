package l;

/* JADX INFO: renamed from: l.᩻۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C25042 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f81014;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f81015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f81016;

    public C25042(String str, int i, int i2) {
        str.getClass();
        this.f81015 = str;
        this.f81016 = i;
        this.f81014 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55862(int i) {
        int i2;
        int i3 = this.f81016;
        if (i3 >= 0 && (i2 = this.f81014) <= i && i3 <= i2) {
            String str = this.f81015;
            int iIndexOf = str.indexOf(59);
            if (iIndexOf == -1) {
                return C19205.m44487(str);
            }
            if (C19205.m44487(str.substring(0, iIndexOf))) {
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
                        if (C19205.m44487(strSubstring)) {
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
        if (obj != null && C25042.class == obj.getClass()) {
            C25042 c25042 = (C25042) obj;
            if (this.f81016 == c25042.f81016 && this.f81014 == c25042.f81014 && this.f81015.equals(c25042.f81015)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f81015.hashCode() * 31) + this.f81016) * 31) + this.f81014;
    }

    public final String toString() {
        return "Style{value='" + this.f81015 + "', start=" + this.f81016 + ", end=" + this.f81014 + '}';
    }
}
