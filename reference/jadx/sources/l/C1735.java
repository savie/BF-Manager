package l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: l.֫ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1735 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14437 f6850;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5076 f6851;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final MediaFormat f6852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7648 f6853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaCrypto f6854;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Surface f6855;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1735 m5749(C5076 c5076, MediaFormat mediaFormat, C7648 c7648, MediaCrypto mediaCrypto, C14437 c14437) {
        return new C1735(c5076, mediaFormat, c7648, null, mediaCrypto, c14437);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1735 m5750(C5076 c5076, MediaFormat mediaFormat, C7648 c7648, Surface surface, MediaCrypto mediaCrypto) {
        return new C1735(c5076, mediaFormat, c7648, surface, mediaCrypto, null);
    }

    public C1735(C5076 c5076, MediaFormat mediaFormat, C7648 c7648, Surface surface, MediaCrypto mediaCrypto, C14437 c14437) {
        this.f6851 = c5076;
        this.f6852 = mediaFormat;
        this.f6853 = c7648;
        this.f6855 = surface;
        this.f6854 = mediaCrypto;
        this.f6850 = c14437;
    }
}
