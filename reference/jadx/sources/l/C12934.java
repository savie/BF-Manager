package l;

/* JADX INFO: renamed from: l.۬ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12934 extends AbstractC18203 {
    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9032 mo1600(AbstractC14676 abstractC14676, byte[] bArr) {
        boolean z = bArr.length == 1;
        int length = bArr.length;
        if (z) {
            return new C6583(bArr, bArr[0] != 0);
        }
        throw new IllegalStateException(C8479.m22141(length, "Value of ASN1Boolean should have length 1, but was "));
    }
}
