package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28II */
/* JADX INFO: loaded from: classes4.dex */
public final class C19300 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f62274 = new byte[10];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62275;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62276;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f62277;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f62278;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f62280;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44285() {
        this.f62280 = false;
        this.f62278 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44286(InterfaceC7222 interfaceC7222) {
        if (this.f62280) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f62274;
        interfaceC7222.mo19210(0, 10, bArr);
        interfaceC7222.mo19217();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & UTF8.S_ERR) == 186) {
                i = 40 << (7 & (bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4));
            }
        }
        if (i == 0) {
            return;
        }
        this.f62280 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44287(InterfaceC8011 interfaceC8011, long j, int i, int i2, int i3, C18594 c18594) {
        C2023.m6509("TrueHD chunk samples must be contiguous in the sample queue.", this.f62279 <= i2 + i3);
        if (this.f62280) {
            int i4 = this.f62278;
            int i5 = i4 + 1;
            this.f62278 = i5;
            if (i4 == 0) {
                this.f62277 = j;
                this.f62276 = i;
                this.f62275 = 0;
            }
            this.f62275 += i2;
            this.f62279 = i3;
            if (i5 >= 16) {
                m44288(interfaceC8011, c18594);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44288(InterfaceC8011 interfaceC8011, C18594 c18594) {
        if (this.f62278 > 0) {
            interfaceC8011.mo8114(this.f62277, this.f62276, this.f62275, this.f62279, c18594);
            this.f62278 = 0;
        }
    }
}
