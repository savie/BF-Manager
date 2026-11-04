package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۜۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6906 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22894;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3177 f22895;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f22896;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashSet f22897 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6906 f22898;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f22899;

    public C6906(String str) {
        this.f22896 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19159(C6906 c6906) {
        if (this.f22897 == null) {
            this.f22897 = new HashSet();
        }
        this.f22897.add(c6906);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6906.class != obj.getClass()) {
            return false;
        }
        String str = ((C6906) obj).f22896;
        String str2 = this.f22896;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f22896;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "" + this.f22896;
    }
}
