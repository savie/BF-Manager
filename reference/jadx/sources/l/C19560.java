package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.᩵ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19560 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f62864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo.Pattern f62865 = C8271.m21688();

    public C19560(MediaCodec.CryptoInfo cryptoInfo) {
        this.f62864 = cryptoInfo;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44660(C19560 c19560, int i, int i2) {
        c19560.f62865.set(i, i2);
        c19560.f62864.setPattern(c19560.f62865);
    }
}
