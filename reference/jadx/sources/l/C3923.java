package l;

/* JADX INFO: renamed from: l.ۘۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8897 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3923 extends AbstractC6746 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f14628;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f14630;

    public C3923(long j, int i, byte[] bArr) {
        this.f14628 = bArr;
        this.f22723 = j;
        this.f14629 = 0;
        this.f14630 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m11385() {
        return this.f14630 > 0;
    }

    @Override // l.AbstractC6746
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo11384(byte[] bArr) {
        int length = bArr.length;
        int i = this.f14630;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.f14628, this.f14629, bArr, 0, length);
        this.f14629 += length;
        this.f14630 -= length;
        return length;
    }

    @Override // l.AbstractC6746
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11383() {
        return this.f14630;
    }
}
