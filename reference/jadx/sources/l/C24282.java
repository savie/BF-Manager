package l;

/* JADX INFO: renamed from: l.᩺ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes.dex */
public final class C24282 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f78596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f78597;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return -Long.compare(this.f78597, ((C24282) obj).f78597);
    }

    public C24282(AbstractC22044 abstractC22044) {
        this.f78596 = abstractC22044;
        this.f78597 = abstractC22044.mo4285();
    }
}
