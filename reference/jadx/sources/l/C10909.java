package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.ۤܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f34539;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo.Pattern f34540 = C22098.m50061();

    public C10909(MediaCodec.CryptoInfo cryptoInfo) {
        this.f34539 = cryptoInfo;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27688(C10909 c10909, int i, int i2) {
        c10909.f34540.set(i, i2);
        c10909.f34539.setPattern(c10909.f34540);
    }
}
