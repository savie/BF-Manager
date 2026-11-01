package l;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ᩳۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18004 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack f57594;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21532 f57595 = new AudioRouting.OnRoutingChangedListener() { // from class: l.᩸ۧۙ
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C18004.m41952(this.f69948, audioRouting);
        }
    };

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3747 f57596;

    /* JADX WARN: Type inference failed for: r3v1, types: [l.᩸ۧۙ] */
    public C18004(AudioTrack audioTrack, C3747 c3747) {
        this.f57594 = audioTrack;
        this.f57596 = c3747;
        audioTrack.addOnRoutingChangedListener(this.f57595, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41953() {
        C21532 c21532 = this.f57595;
        c21532.getClass();
        this.f57594.removeOnRoutingChangedListener(c21532);
        this.f57595 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41952(C18004 c18004, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (c18004.f57595 == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        c18004.f57596.m10974(routedDevice);
    }
}
