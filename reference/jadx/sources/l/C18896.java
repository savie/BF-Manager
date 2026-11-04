package l;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: renamed from: l.ᩳۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18896 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean f61313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43817(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f61313;
        if (bool == null || !bool.booleanValue()) {
            return C7709.m20986(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
