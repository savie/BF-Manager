package l;

/* JADX INFO: renamed from: l.ۖۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2558 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20436 f8225;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f8226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8592(C2558 c2558, C24166 c24166) {
        c2558.getClass();
        c24166.m54135(c2558.f8225.f34104);
        c24166.m54135(c2558.f8226);
    }

    public C2558(C20436 c20436, int i) {
        this.f8225 = c20436;
        this.f8226 = i;
    }

    public C2558(C24738 c24738, C4028 c4028) {
        this.f8225 = (C20436) c24738.f80112.m49623(c4028.m12998());
        this.f8226 = c4028.m12998();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8591(C2558 c2558) {
        return C6929.m19213(c2558.f8226) + C6929.m19213(c2558.f8225.f34104);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8593() {
        return this.f8226;
    }

    public final int hashCode() {
        return (this.f8225.hashCode() * 31) + this.f8226;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2558.class.equals(obj.getClass())) {
            C2558 c2558 = (C2558) obj;
            if (this.f8225 == c2558.f8225 && this.f8226 == c2558.f8226) {
                return true;
            }
        }
        return false;
    }
}
