package l;

/* JADX INFO: renamed from: l.۟᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4S8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7724 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25545;

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo1773(C12283 c12283);

    /* JADX INFO: renamed from: ۚ */
    public void mo9290() {
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract double mo5599();

    public AbstractC7724(int i) {
        this.f25545 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20371() {
        return this.f25545;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(AbstractC7724 abstractC7724) {
        int iCompare = Integer.compare(this.f25545, abstractC7724.f25545);
        return iCompare == 0 ? Double.compare(mo5599(), abstractC7724.mo5599()) : iCompare;
    }
}
