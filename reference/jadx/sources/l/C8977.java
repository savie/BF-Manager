package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ۡܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8977 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f30735;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f30736;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f30737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30738;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f30739;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19560 f30740;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f30741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f30742;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30743;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30744;

    public C8977() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f30741 = cryptoInfo;
        this.f30740 = Build.VERSION.SDK_INT >= 24 ? new C19560(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23289(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f30737 = i;
        this.f30735 = iArr;
        this.f30742 = iArr2;
        this.f30739 = bArr;
        this.f30736 = bArr2;
        this.f30744 = i2;
        this.f30743 = i3;
        this.f30738 = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f30741;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Build.VERSION.SDK_INT >= 24) {
            C19560 c19560 = this.f30740;
            c19560.getClass();
            C19560.m44660(c19560, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo m23287() {
        return this.f30741;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23288(int i) {
        if (i == 0) {
            return;
        }
        if (this.f30735 == null) {
            int[] iArr = new int[1];
            this.f30735 = iArr;
            this.f30741.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f30735;
        iArr2[0] = iArr2[0] + i;
    }
}
