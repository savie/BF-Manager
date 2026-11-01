package l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13627 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C6570 m33330(AudioManager audioManager, C2708 c2708) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c2708.m8258().f39861);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new C6570(C11445.m28556(audioDevicesForAttributes.get(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2336 m33329(AudioManager audioManager, C2708 c2708) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c2708.m8258().f39861);
        HashMap map = new HashMap();
        map.put(2, new HashSet(C17039.m39820(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (C17983.m41853(format) || C2336.f8270.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(C17039.m39820(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(C17039.m39820(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        int i2 = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        for (Map.Entry entry : map.entrySet()) {
            c4793.m52163(new C11510(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C2336(0, c4793.m13309());
    }
}
