package l;

import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩹֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 08IU */
/* JADX INFO: loaded from: classes.dex */
public final class C23232 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f75249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75250;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f75251;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f75252;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f75253;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f75254;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19378 f75255;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f75256;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f75257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f75258;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f75259;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15772 f75260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52209(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m52210(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public C23232(byte[] bArr, int i) {
        C14573 c14573 = new C14573(bArr, bArr.length);
        c14573.m35167(i * 8);
        this.f75254 = c14573.m35163(16);
        this.f75259 = c14573.m35163(16);
        this.f75251 = c14573.m35163(24);
        this.f75257 = c14573.m35163(24);
        int iM35163 = c14573.m35163(20);
        this.f75249 = iM35163;
        this.f75253 = m52210(iM35163);
        this.f75252 = c14573.m35163(3) + 1;
        int iM35164 = c14573.m35163(5) + 1;
        this.f75250 = iM35164;
        this.f75258 = m52209(iM35164);
        this.f75256 = c14573.m35157(36);
        this.f75260 = null;
        this.f75255 = null;
    }

    public C23232(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C15772 c15772, C19378 c19378) {
        this.f75254 = i;
        this.f75259 = i2;
        this.f75251 = i3;
        this.f75257 = i4;
        this.f75249 = i5;
        this.f75253 = m52210(i5);
        this.f75252 = i6;
        this.f75250 = i7;
        this.f75258 = m52209(i7);
        this.f75256 = j;
        this.f75260 = c15772;
        this.f75255 = c19378;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m52211() {
        long j = this.f75256;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f75249);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 m52212(byte[] bArr, C19378 c19378) {
        bArr[4] = GCMSIVBlockCipher.MASK;
        int i = this.f75257;
        if (i <= 0) {
            i = -1;
        }
        C19378 c19379 = this.f75255;
        if (c19379 != null) {
            c19378 = c19379.m44822(c19378);
        }
        C20124 c20124 = new C20124();
        c20124.m46315("audio/flac");
        c20124.m46318(i);
        c20124.m46329(this.f75252);
        c20124.m46332(this.f75249);
        String str = C7116.f23455;
        c20124.m46293(C7116.m19463(this.f75250, ByteOrder.LITTLE_ENDIAN));
        c20124.m46301(Collections.singletonList(bArr));
        c20124.m46303(c19378);
        return c20124.m46295();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23232 m52214(C15772 c15772) {
        return new C23232(this.f75254, this.f75259, this.f75251, this.f75257, this.f75249, this.f75252, this.f75250, this.f75256, c15772, this.f75255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23232 m52215(List list) {
        C19378 c19378M16596 = C5616.m16596(list);
        C19378 c19378 = this.f75255;
        if (c19378 != null) {
            c19378M16596 = c19378.m44822(c19378M16596);
        }
        C19378 c19379 = c19378M16596;
        return new C23232(this.f75254, this.f75259, this.f75251, this.f75257, this.f75249, this.f75252, this.f75250, this.f75256, this.f75260, c19379);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23232 m52213(List list) {
        C19378 c19378 = new C19378(list);
        C19378 c19379 = this.f75255;
        if (c19379 != null) {
            c19378 = c19379.m44822(c19378);
        }
        C19378 c193710 = c19378;
        return new C23232(this.f75254, this.f75259, this.f75251, this.f75257, this.f75249, this.f75252, this.f75250, this.f75256, this.f75260, c193710);
    }
}
