package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19720 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f63286;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63287;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashSet f63288 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3097 f63289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19720 f63290;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f63291;

    public C19720(String str) {
        this.f63291 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44843(C19720 c19720) {
        if (this.f63288 == null) {
            this.f63288 = new HashSet();
        }
        this.f63288.add(c19720);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19720.class != obj.getClass()) {
            return false;
        }
        String str = ((C19720) obj).f63291;
        String str2 = this.f63291;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f63291;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "" + this.f63291;
    }
}
