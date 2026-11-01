package l;

/* JADX INFO: renamed from: l.ۖ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2730 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f10506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f10507;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return -Long.compare(this.f10507, ((C2730) obj).f10507);
    }

    public C2730(AbstractC20745 abstractC20745) {
        this.f10506 = abstractC20745;
        this.f10507 = abstractC20745.mo33964();
    }
}
