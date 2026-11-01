package l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ۙۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4598 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15038 m12742(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport != 0) {
            C22799 c22799 = new C22799();
            boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            c22799.m50458();
            c22799.m50457(z2);
            c22799.m50459(z);
            return c22799.m50456();
        }
        return C15038.f49026;
    }
}
