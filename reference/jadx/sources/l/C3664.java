package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.ۘۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3664 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f13408;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5076 f13409;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f13410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f13411;

    public C3664(C7648 c7648, C8605 c8605, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c7648, c8605, c7648.f25265, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C3664(C7648 c7648, Exception exc, boolean z, C5076 c5076) {
        this("Decoder init failed: " + c5076.f17691 + ", " + c7648, exc, c7648.f25265, z, c5076, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public C3664(String str, Throwable th, String str2, boolean z, C5076 c5076, String str3) {
        super(str, th);
        this.f13408 = str2;
        this.f13410 = z;
        this.f13409 = c5076;
        this.f13411 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3664 m10822(C3664 c3664) {
        return new C3664(c3664.getMessage(), c3664.getCause(), c3664.f13408, c3664.f13410, c3664.f13409, c3664.f13411);
    }
}
