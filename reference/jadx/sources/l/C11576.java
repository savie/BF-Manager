package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۨ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: EA2I */
/* JADX INFO: loaded from: classes4.dex */
public final class C11576 extends AbstractC17529 implements InterfaceC16824 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f38928;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public byte f38929;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f38930;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte f38931;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f38932;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f38933;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C11576(InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601, 14);
        this.f38929 = (byte) 3;
        C9895 c9895 = (C9895) interfaceC10601;
        this.f38930 = (Math.min(c9895.m25057(), c9895.m25070()) - 72) & (-8);
        this.f38928 = bArr;
    }

    @Override // l.InterfaceC16824
    /* JADX INFO: renamed from: ۙ */
    public final void mo3798(byte[] bArr) {
        this.f38928 = bArr;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final void m28878() {
        this.f38931 = (byte) 4;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m28877(int i) {
        this.f38933 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28876(String str) {
        this.f38932 = str;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C2402(interfaceC19067.mo29449(), this.f38929);
    }

    @Override // l.InterfaceC3314
    public final int size() {
        String str = this.f38932;
        return AbstractC12591.m31337((str != null ? str.length() * 2 : 0) + 96);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(33L, i, bArr);
        bArr[i + 2] = this.f38929;
        bArr[i + 3] = this.f38931;
        C4850.m13550(this.f38933, i + 4, bArr);
        System.arraycopy(this.f38928, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 26;
        C4850.m13550(this.f38930, i + 28, bArr);
        int length = i + 32;
        String str = this.f38932;
        if (str == null) {
            C4850.m13546(0L, i2, bArr);
            C4850.m13546(0L, i3, bArr);
        } else {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
            C4850.m13546(length - m31366(), i2, bArr);
            C4850.m13546(bytes.length, i3, bArr);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }
}
