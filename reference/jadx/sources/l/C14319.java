package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14319 implements InterfaceC7979 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7979[] f45187;

    public C14319(InterfaceC7979... interfaceC7979Arr) {
        this.f45187 = interfaceC7979Arr;
    }

    @Override // l.InterfaceC7979
    public final InterfaceC13988 read(byte[] bArr) throws IOException {
        for (int i = 0; i < 4; i++) {
            InterfaceC7979 interfaceC7979 = this.f45187[i];
            if (interfaceC7979.mo20545(bArr)) {
                return (AbstractC21779) interfaceC7979.read(bArr);
            }
        }
        throw new IOException("Unknown packet format received.");
    }

    @Override // l.InterfaceC7979
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20545(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (this.f45187[i].mo20545(bArr)) {
                return true;
            }
        }
        return false;
    }
}
