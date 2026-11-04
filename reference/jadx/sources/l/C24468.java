package l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes.dex */
public final class C24468 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10295 m54719(AudioManager audioManager, C18412 c18412) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c18412.m42921().f68157);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new C10295(C10732.m27331((Object) audioDevicesForAttributes.get(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14770 m54718(AudioManager audioManager, C18412 c18412) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c18412.m42921().f68157);
        HashMap map = new HashMap();
        map.put(2, new HashSet(C18444.m42972(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (C7116.m19494(format) || C14770.f48337.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(C18444.m42972(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(C18444.m42972(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        int i2 = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        for (Map.Entry entry : map.entrySet()) {
            c22811.m19807(new C4330(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C14770(0, c22811.m51441());
    }
}
