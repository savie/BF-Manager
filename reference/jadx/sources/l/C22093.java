package l;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: l.᩹ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22093 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3747 f71561;

    public C22093(C3747 c3747) {
        this.f71561 = c3747;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C3747 c3747 = this.f71561;
        c3747.m10972(C2336.m7089(c3747.f13581, this.f71561.f13583, this.f71561.f13585));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (C17983.m41842(this.f71561.f13585, audioDeviceInfoArr)) {
            this.f71561.f13585 = null;
        }
        C3747 c3747 = this.f71561;
        c3747.m10972(C2336.m7089(c3747.f13581, this.f71561.f13583, this.f71561.f13585));
    }
}
