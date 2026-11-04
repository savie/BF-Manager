package l;

/* JADX INFO: renamed from: l.ۨ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12585 implements InterfaceC6620 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f40403;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f40404;

    public C12585(String str, int i) {
        this.f40403 = str;
        this.f40404 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31290() {
        return this.f40403;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31291() {
        return this.f40404;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12585.class != obj.getClass()) {
            return false;
        }
        C12585 c12585 = (C12585) obj;
        if (this.f40404 != c12585.f40404) {
            return false;
        }
        return this.f40403.equals(c12585.f40403);
    }

    public final int hashCode() {
        return (this.f40403.hashCode() * 31) + this.f40404;
    }
}
