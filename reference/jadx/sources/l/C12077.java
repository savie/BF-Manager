package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۫֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12077 implements InterfaceC10666, InterfaceC5726 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40421;

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5136() {
        return false;
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ */
    public final int mo23780() {
        return 1;
    }

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo5137() {
        return false;
    }

    @Override // l.InterfaceC5726
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo5138() {
        return true;
    }

    public C12077(byte[] bArr) throws C6782 {
        if (bArr.length != 1) {
            throw new C6782("Unsupported Delta filter properties");
        }
        this.f40421 = (bArr[0] & 255) + 1;
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo23781(InputStream inputStream, C17720 c17720) {
        return new C17015(inputStream, this.f40421);
    }
}
