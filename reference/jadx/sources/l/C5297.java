package l;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.ۚ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08N4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5297 implements InterfaceC1084 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack m15895(C15253 c15253, C18412 c18412, int i, Context context) {
        boolean z = c15253.f49876;
        int i2 = c15253.f49875;
        int i3 = c15253.f49878;
        int i4 = c15253.f49877;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m15894(c18412, z)).setAudioFormat(C7116.m19509(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(c15253.f49874).setSessionId(i);
            if (i5 >= 29) {
                sessionId.setOffloadedPlayback(c15253.f49879);
            }
            if (i5 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            return sessionId.build();
        }
        return new AudioTrack(m15894(c18412, z), C7116.m19509(i4, i3, i2), c15253.f49874, 1, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AudioAttributes m15894(C18412 c18412, boolean z) {
        if (!z) {
            return c18412.m42921().f68157;
        }
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
}
