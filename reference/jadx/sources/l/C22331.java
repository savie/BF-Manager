package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes.dex */
public final class C22331 implements InterfaceC6500 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6500[] f72912;

    public C22331(InterfaceC6500... interfaceC6500Arr) {
        this.f72912 = interfaceC6500Arr;
    }

    @Override // l.InterfaceC6500
    public final InterfaceC8805 read(byte[] bArr) throws IOException {
        for (int i = 0; i < 4; i++) {
            InterfaceC6500 interfaceC6500 = this.f72912[i];
            if (interfaceC6500.mo14995(bArr)) {
                return (AbstractC7245) interfaceC6500.read(bArr);
            }
        }
        throw new IOException("Unknown packet format received.");
    }

    @Override // l.InterfaceC6500
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo14995(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (this.f72912[i].mo14995(bArr)) {
                return true;
            }
        }
        return false;
    }
}
