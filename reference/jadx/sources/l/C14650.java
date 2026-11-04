package l;

/* JADX INFO: renamed from: l.ܰܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TA0G */
/* JADX INFO: loaded from: classes5.dex */
public final class C14650 extends AbstractC12108 implements InterfaceC7128 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f47936;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f47937;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ᩻ */
    public final String mo12184() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12108, l.InterfaceC18315
    /* JADX INFO: renamed from: ۙ */
    public final void mo12767(InterfaceC21299 interfaceC21299) {
        if (mo12784()) {
            ((AbstractC3159) interfaceC21299).m10322(m10341());
        }
        super.mo12767(interfaceC21299);
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo12182() {
        return m10341() != -1;
    }

    @Override // l.InterfaceC7128
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo12183() {
        return (this.f47936 & 3) != 0 || (this.f47937 & 8) == 8;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 16) {
            throw new C19061("Structure size is not 16");
        }
        byte b = bArr[i + 2];
        this.f47936 = C0481.m2322(i + 4, bArr);
        this.f47937 = C0481.m2322(i + 8, bArr);
        C0481.m2322(i + 12, bArr);
        return (i + 16) - i;
    }
}
