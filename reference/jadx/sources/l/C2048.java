package l;

/* JADX INFO: renamed from: l.֫ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2048 extends AbstractC11742 {
    @Override // l.AbstractC11742, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37972.compareTo(((AbstractC11742) obj).f37972);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2048 m7058(String str, EnumC17468 enumC17468) {
        return new C2048(str.toString().replace('.', '/') + enumC17468.f56797);
    }

    public C2048(String str) {
        super(str);
        if (str.endsWith("/")) {
            throw new IllegalArgumentException(str);
        }
    }

    public C2048(C5777 c5777, String str) {
        this(C8947.m23910(new StringBuilder(), c5777.f37972, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5777 m7059() {
        String str = this.f37972;
        return new C5777(str.substring(0, str.lastIndexOf(47) + 1));
    }

    @Override // l.AbstractC11742
    public final String toString() {
        return C8947.m23910(new StringBuilder("RelativeFile["), this.f37972, "]");
    }
}
