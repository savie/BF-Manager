package l;

import android.media.AudioTrack;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۖۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2481 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7611(AudioTrack audioTrack, C6570 c6570) {
        audioTrack.setPreferredDevice(c6570 == null ? null : c6570.f22122);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m7610(AudioTrack audioTrack, C6715 c6715) {
        if (c6715.f22631 == 0) {
            return C17983.m41826(c6715.f22640, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int iM45218 = C19923.m45218(c6715.f22636);
        C2023.m6510(iM45218 != -2147483647);
        return C17983.m41830(bufferSizeInFrames, 1000000L, iM45218, RoundingMode.DOWN);
    }
}
