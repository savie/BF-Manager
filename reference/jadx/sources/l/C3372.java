package l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ۗܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3372 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10024(AudioManager audioManager, C6570 c6570) {
        AudioDeviceInfo[] devices;
        if (c6570 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c6570.f22122};
        }
        C6204 c6204 = new C6204();
        c6204.mo14320((Object[]) new Integer[]{8, 7});
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c6204.mo14320((Object[]) new Integer[]{26, 27});
        }
        if (i >= 33) {
            c6204.mo13308((Object) 30);
        }
        AbstractC23844 abstractC23844Mo14317 = c6204.mo14317();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC23844Mo14317.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
