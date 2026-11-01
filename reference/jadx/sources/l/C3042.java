package l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: renamed from: l.ۗۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3042 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15038 m9129(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            C22799 c22799 = new C22799();
            c22799.m50458();
            c22799.m50459(z);
            return c22799.m50456();
        }
        return C15038.f49026;
    }
}
