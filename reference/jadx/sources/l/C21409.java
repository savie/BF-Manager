package l;

/* JADX INFO: renamed from: l.᩶ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88N4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21409 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f68206;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f68207;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f68207, ((C21409) obj).f68207);
    }

    public C21409(long j, byte[] bArr) {
        this.f68207 = j;
        this.f68206 = bArr;
    }
}
