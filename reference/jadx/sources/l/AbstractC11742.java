package l;

/* JADX INFO: renamed from: l.ۧܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11742 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f37972;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f37972.compareTo(((AbstractC11742) obj).f37972);
    }

    public AbstractC11742(String str) {
        this.f37972 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m29493(InterfaceC24329 interfaceC24329) {
        return interfaceC24329.resolve(this.f37972.replace("/", interfaceC24329.getFileSystem().getSeparator()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11742) && this.f37972.equals(((AbstractC11742) obj).f37972);
    }

    public final int hashCode() {
        return this.f37972.hashCode();
    }

    public String toString() {
        return C8947.m23910(new StringBuilder("RelPath["), this.f37972, "]");
    }
}
