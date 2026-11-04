package l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.ۨᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12533 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31139(AudioManager audioManager, C10295 c10295) {
        AudioDeviceInfo[] devices;
        if (c10295 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c10295.f32872};
        }
        C9384 c9384 = new C9384();
        c9384.mo24712((Object[]) new Integer[]{8, 7});
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c9384.mo24712((Object[]) new Integer[]{26, 27});
        }
        if (i >= 33) {
            c9384.mo24710((Object) 30);
        }
        AbstractC8639 abstractC8639Mo24709 = c9384.mo24709();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC8639Mo24709.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
