package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩳۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA2I */
/* JADX INFO: loaded from: classes5.dex */
public final class C18821 extends AbstractC20313 implements InterfaceC23297 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f61162;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f61163;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte f61164;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f61165;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte f61166;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f61167;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C18821(InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878, 14);
        this.f61164 = (byte) 3;
        C14826 c14826 = (C14826) interfaceC5878;
        this.f61163 = (Math.min(c14826.m35703(), c14826.m35728()) - 72) & (-8);
        this.f61162 = bArr;
    }

    @Override // l.InterfaceC23297
    /* JADX INFO: renamed from: ۙ */
    public final void mo3727(byte[] bArr) {
        this.f61162 = bArr;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m43681() {
        this.f61166 = (byte) 4;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m43682(int i) {
        this.f61167 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43683(String str) {
        this.f61165 = str;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C9870(interfaceC23032.mo2875(), this.f61164);
    }

    @Override // l.InterfaceC21299
    public final int size() {
        String str = this.f61165;
        return AbstractC3159.m10300((str != null ? str.length() * 2 : 0) + 96);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(33L, i, bArr);
        bArr[i + 2] = this.f61164;
        bArr[i + 3] = this.f61166;
        C0481.m2323(this.f61167, i + 4, bArr);
        System.arraycopy(this.f61162, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 26;
        C0481.m2323(this.f61163, i + 28, bArr);
        int length = i + 32;
        String str = this.f61165;
        if (str == null) {
            C0481.m2319(0L, i2, bArr);
            C0481.m2319(0L, i3, bArr);
        } else {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
            C0481.m2319(length - m10327(), i2, bArr);
            C0481.m2319(bytes.length, i3, bArr);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }
}
