package l;

/* JADX INFO: renamed from: l.ۚܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5777 extends AbstractC11742 {
    @Override // l.AbstractC11742, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f37972.compareTo(((AbstractC11742) obj).f37972);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5777(String str) {
        if (str.length() != 0 && !str.endsWith("/")) {
            str = str.concat("/");
        }
        super(str);
    }

    @Override // l.AbstractC11742
    public final String toString() {
        return C8947.m23910(new StringBuilder("RelativeDirectory["), this.f37972, "]");
    }
}
