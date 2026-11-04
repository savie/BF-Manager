package l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: l.ۨۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12183 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0251 f39165;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 f39166;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Surface f39167;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final MediaFormat f39168;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaCrypto f39169;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20388 f39170;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12183 m30455(C0251 c0251, MediaFormat mediaFormat, C15648 c15648, MediaCrypto mediaCrypto, C20388 c20388) {
        return new C12183(c0251, mediaFormat, c15648, null, mediaCrypto, c20388);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12183 m30456(C0251 c0251, MediaFormat mediaFormat, C15648 c15648, Surface surface, MediaCrypto mediaCrypto) {
        return new C12183(c0251, mediaFormat, c15648, surface, mediaCrypto, null);
    }

    public C12183(C0251 c0251, MediaFormat mediaFormat, C15648 c15648, Surface surface, MediaCrypto mediaCrypto, C20388 c20388) {
        this.f39165 = c0251;
        this.f39168 = mediaFormat;
        this.f39166 = c15648;
        this.f39167 = surface;
        this.f39169 = mediaCrypto;
        this.f39170 = c20388;
    }
}
