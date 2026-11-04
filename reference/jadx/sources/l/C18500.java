package l;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: l.ܿᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18500 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19246 f60189;

    public C18500(C19246 c19246) {
        this.f60189 = c19246;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C19246 c19246 = this.f60189;
        c19246.m44583(C14770.m35557(c19246.f62265, this.f60189.f62257, this.f60189.f62260));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (C7116.m19489(this.f60189.f62260, audioDeviceInfoArr)) {
            this.f60189.f62260 = null;
        }
        C19246 c19246 = this.f60189;
        c19246.m44583(C14770.m35557(c19246.f62265, this.f60189.f62257, this.f60189.f62260));
    }
}
