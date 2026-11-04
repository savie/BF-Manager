package l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.ۛᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6568 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m18487(C18412 c18412) {
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        AbstractC4516 it = C14770.f48337.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= C7116.m19458(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c18412.m42921().f68157)) {
                c22811.m19807(num);
            }
        }
        c22811.m19807(2);
        return c22811.m51441();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18486(int i, int i2, C18412 c18412) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM19504 = C7116.m19504(i3);
            if (iM19504 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM19504).build(), c18412.m42921().f68157)) {
                return i3;
            }
        }
        return 0;
    }
}
