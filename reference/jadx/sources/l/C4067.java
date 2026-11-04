package l;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: renamed from: l.ۘۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4067 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9549 m13140(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            C1347 c1347 = new C1347();
            c1347.m4980();
            c1347.m4981(z);
            return c1347.m4978();
        }
        return C9549.f30908;
    }
}
