package l;

import android.media.AudioTrack;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.֡ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0338 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2072(AudioTrack audioTrack, C10295 c10295) {
        audioTrack.setPreferredDevice(c10295 == null ? null : c10295.f32872);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m2071(AudioTrack audioTrack, C2575 c2575) {
        if (c2575.f8263 == 0) {
            return C7116.m19473(c2575.f8274, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int iM15984 = C5332.m15984(c2575.f8265);
        C20782.m47568(iM15984 != -2147483647);
        return C7116.m19477(bufferSizeInFrames, 1000000L, iM15984, RoundingMode.DOWN);
    }
}
