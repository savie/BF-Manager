package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.֨ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0997 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f3599;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0251 f3600;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f3601;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f3602;

    public C0997(C15648 c15648, C22822 c22822, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c15648, c22822, c15648.f50848, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C0997(C15648 c15648, Exception exc, boolean z, C0251 c0251) {
        this("Decoder init failed: " + c0251.f1533 + ", " + c15648, exc, c15648.f50848, z, c0251, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public C0997(String str, Throwable th, String str2, boolean z, C0251 c0251, String str3) {
        super(str, th);
        this.f3601 = str2;
        this.f3599 = z;
        this.f3600 = c0251;
        this.f3602 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0997 m3874(C0997 c0997) {
        return new C0997(c0997.getMessage(), c0997.getCause(), c0997.f3601, c0997.f3599, c0997.f3600, c0997.f3602);
    }
}
