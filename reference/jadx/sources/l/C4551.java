package l;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۙ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4551 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioTrack f16161;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13761 f16162 = new AudioRouting.OnRoutingChangedListener() { // from class: l.۬ۢۙ
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C4551.m14289(this.f43684, audioRouting);
        }
    };

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19246 f16163;

    /* JADX WARN: Type inference failed for: r3v1, types: [l.۬ۢۙ] */
    public C4551(AudioTrack audioTrack, C19246 c19246) {
        this.f16161 = audioTrack;
        this.f16163 = c19246;
        audioTrack.addOnRoutingChangedListener(this.f16162, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14290() {
        C13761 c13761 = this.f16162;
        c13761.getClass();
        this.f16161.removeOnRoutingChangedListener(c13761);
        this.f16162 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14289(C4551 c4551, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (c4551.f16162 == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        c4551.f16163.m44586(routedDevice);
    }
}
