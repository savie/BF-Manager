package l;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: renamed from: l.֨ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0842 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean f3486;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3455(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f3486;
        if (bool == null || !bool.booleanValue()) {
            return C22010.m48898(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
