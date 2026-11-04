package l;

/* JADX INFO: renamed from: l.ܰ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09EU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14954 implements InterfaceC7979 {
    @Override // l.InterfaceC7979
    public final InterfaceC13988 read(byte[] bArr) {
        return new C4514(bArr);
    }

    @Override // l.InterfaceC7979
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20545(byte[] bArr) {
        return bArr.length >= 4 && bArr[0] == -2 && bArr[1] == 83 && bArr[2] == 77 && bArr[3] == 66;
    }
}
