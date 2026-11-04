package l;

/* JADX INFO: renamed from: l.֡ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0216 extends AbstractC2671 {
    @Override // l.AbstractC2671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4691 mo1664(AbstractC15877 abstractC15877, byte[] bArr) {
        boolean z = bArr.length == 1;
        int length = bArr.length;
        if (z) {
            return new C18861(bArr, bArr[0] != 0);
        }
        throw new IllegalStateException(C13645.m33382(length, "Value of ASN1Boolean should have length 1, but was "));
    }
}
