package l;

/* JADX INFO: renamed from: l.᩶ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20306 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f65778;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f65779;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f65780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f65781;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return (int) (((C20306) obj).f65780 - this.f65780);
    }

    public C20306(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, String str, long j) {
        this.f65779 = abstractC20745;
        this.f65778 = abstractC20746;
        this.f65781 = str;
        this.f65780 = j;
    }
}
