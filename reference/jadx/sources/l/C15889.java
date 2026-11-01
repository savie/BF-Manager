package l;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.ܺۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08N4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15889 implements InterfaceC13066 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack m37802(C10099 c10099, C2708 c2708, int i, Context context) {
        boolean z = c10099.f34487;
        int i2 = c10099.f34485;
        int i3 = c10099.f34486;
        int i4 = c10099.f34484;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m37801(c2708, z)).setAudioFormat(C17983.m41859(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(c10099.f34483).setSessionId(i);
            if (i5 >= 29) {
                sessionId.setOffloadedPlayback(c10099.f34482);
            }
            if (i5 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            return sessionId.build();
        }
        return new AudioTrack(m37801(c2708, z), C17983.m41859(i4, i3, i2), c10099.f34483, 1, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AudioAttributes m37801(C2708 c2708, boolean z) {
        if (!z) {
            return c2708.m8258().f39861;
        }
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
}
