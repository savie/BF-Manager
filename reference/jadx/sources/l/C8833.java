package l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ۡۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8833 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10244 f30362;

    public C8833(C10244 c10244) {
        this.f30362 = c10244;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f30362.f34941.f24724) && this.f30362.f34941.f24719 != null && this.f30362.f34941.f24757) {
            this.f30362.f34941.f24719.mo2089();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f30362.f34941.f24724)) {
            this.f30362.f34941.f24722 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f30362.f34941.f24724) && this.f30362.f34941.f24719 != null && this.f30362.f34941.f24757) {
            this.f30362.f34941.f24719.mo2089();
        }
    }
}
