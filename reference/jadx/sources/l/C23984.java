package l;

/* JADX INFO: renamed from: l.᩻᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes.dex */
public final class C23984 extends AbstractC14812 {
    @Override // l.AbstractC14812, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f48427.compareTo(((AbstractC14812) obj).f48427);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23984 m52820(String str, EnumC11347 enumC11347) {
        return new C23984(str.toString().replace('.', '/') + enumC11347.f38286);
    }

    public C23984(String str) {
        super(str);
        if (str.endsWith("/")) {
            throw new IllegalArgumentException(str);
        }
    }

    public C23984(C11284 c11284, String str) {
        this(C22697.m50267(new StringBuilder(), c11284.f48427, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11284 m52821() {
        String str = this.f48427;
        return new C11284(str.substring(0, str.lastIndexOf(47) + 1));
    }

    @Override // l.AbstractC14812
    public final String toString() {
        return C22697.m50267(new StringBuilder("RelativeFile["), this.f48427, "]");
    }
}
