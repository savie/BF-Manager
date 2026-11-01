package l;

/* JADX INFO: renamed from: l.ܶ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1953 f48641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48642;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35581(C14885 c14885, C4651 c4651) {
        c14885.getClass();
        c4651.m12842(c14885.f48641.f30809);
        c4651.m12842(c14885.f48642);
    }

    public C14885(C1953 c1953, int i) {
        this.f48641 = c1953;
        this.f48642 = i;
    }

    public C14885(C12063 c12063, C13825 c13825) {
        this.f48641 = (C1953) c12063.f40367.m44688(c13825.m33647());
        this.f48642 = c13825.m33647();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35580(C14885 c14885) {
        return C13530.m33072(c14885.f48642) + C13530.m33072(c14885.f48641.f30809);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35582() {
        return this.f48642;
    }

    public final int hashCode() {
        return (this.f48641.hashCode() * 31) + this.f48642;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14885.class.equals(obj.getClass())) {
            C14885 c14885 = (C14885) obj;
            if (this.f48641 == c14885.f48641 && this.f48642 == c14885.f48642) {
                return true;
            }
        }
        return false;
    }
}
