package l;

/* JADX INFO: renamed from: l.ܰᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14008 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f46028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f46029;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f46029, ((C14008) obj).f46029);
    }

    public C14008(long j, byte[] bArr) {
        this.f46029 = j;
        this.f46028 = bArr;
    }
}
