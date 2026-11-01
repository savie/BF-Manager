package l;

/* JADX INFO: renamed from: l.ܳ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14812 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f48427;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f48427.compareTo(((AbstractC14812) obj).f48427);
    }

    public AbstractC14812(String str) {
        this.f48427 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m35483(InterfaceC3800 interfaceC3800) {
        return interfaceC3800.resolve(this.f48427.replace("/", interfaceC3800.getFileSystem().getSeparator()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC14812) && this.f48427.equals(((AbstractC14812) obj).f48427);
    }

    public final int hashCode() {
        return this.f48427.hashCode();
    }

    public String toString() {
        return C22697.m50267(new StringBuilder("RelPath["), this.f48427, "]");
    }
}
