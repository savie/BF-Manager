package l;

/* JADX INFO: renamed from: l.۫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13159 implements InterfaceC2149 {
    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) throws C19061 {
        if (i2 < 24) {
            throw new C19061("Invalid resume key");
        }
        System.arraycopy(bArr, i, new byte[24], 0, 24);
        C0481.m2322(i + 24, bArr);
        return (i + 28) - i;
    }
}
