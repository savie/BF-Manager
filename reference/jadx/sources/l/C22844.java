package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.᩸ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes.dex */
public final class C22844 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74213;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f74214;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f74215;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10909 f74216;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f74217;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74218;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f74219;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74220;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f74221;

    public C22844() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f74215 = cryptoInfo;
        this.f74216 = Build.VERSION.SDK_INT >= 24 ? new C10909(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51563(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f74212 = i;
        this.f74217 = iArr;
        this.f74214 = iArr2;
        this.f74219 = bArr;
        this.f74221 = bArr2;
        this.f74218 = i2;
        this.f74220 = i3;
        this.f74213 = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f74215;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Build.VERSION.SDK_INT >= 24) {
            C10909 c10909 = this.f74216;
            c10909.getClass();
            C10909.m27688(c10909, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo m51561() {
        return this.f74215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51562(int i) {
        if (i == 0) {
            return;
        }
        if (this.f74217 == null) {
            int[] iArr = new int[1];
            this.f74217 = iArr;
            this.f74215.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f74217;
        iArr2[0] = iArr2[0] + i;
    }
}
