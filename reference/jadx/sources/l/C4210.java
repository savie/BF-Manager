package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۘܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4210 extends AbstractC20313 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public String f15380;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C4210(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, 3);
        this.f15380 = str;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C14650(interfaceC23032.mo2875());
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10313(AbstractC3159 abstractC3159) {
        abstractC3159.m10322(-1);
        return super.mo10313(abstractC3159);
    }

    @Override // l.InterfaceC21299
    public final int size() {
        return AbstractC3159.m10300((this.f15380.length() * 2) + 72);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(9L, i, bArr);
        C0481.m2319(0, i + 2, bArr);
        byte[] bytes = this.f15380.getBytes(StandardCharsets.UTF_16LE);
        C0481.m2319(bytes.length, i + 6, bArr);
        int i2 = i + 8;
        C0481.m2319(i2 - m10327(), i + 4, bArr);
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }
}
