package l;

/* JADX INFO: renamed from: l.᩺֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAH0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22665 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f73820;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C22665 f73817 = new C22665("tableDirectory");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C22665 f73819 = new C22665("name");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22665 f73818 = new C22665("OS/2");

    public C22665(String str) {
        this.f73820 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22665 m50198(String str) {
        return new C22665(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22665) {
            return this.f73820.equals(((C22665) obj).f73820);
        }
        return false;
    }

    public final int hashCode() {
        return this.f73820.hashCode();
    }

    public final String toString() {
        return this.f73820;
    }
}
