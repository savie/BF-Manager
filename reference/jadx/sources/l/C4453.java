package l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.ۙۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4453 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m12424(C2708 c2708) {
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        AbstractC0477 it = C2336.f8270.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= C17983.m41811(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c2708.m8258().f39861)) {
                c4793.m52163(num);
            }
        }
        c4793.m52163(2);
        return c4793.m13309();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12423(int i, int i2, C2708 c2708) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM41854 = C17983.m41854(i3);
            if (iM41854 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM41854).build(), c2708.m8258().f39861)) {
                return i3;
            }
        }
        return 0;
    }
}
