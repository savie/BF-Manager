package l;

/* JADX INFO: renamed from: l.ۧ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11284 extends AbstractC14812 {
    @Override // l.AbstractC14812, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f48427.compareTo(((AbstractC14812) obj).f48427);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11284(String str) {
        if (str.length() != 0 && !str.endsWith("/")) {
            str = str.concat("/");
        }
        super(str);
    }

    @Override // l.AbstractC14812
    public final String toString() {
        return C22697.m50267(new StringBuilder("RelativeDirectory["), this.f48427, "]");
    }
}
