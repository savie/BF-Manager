package l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.᩸֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes.dex */
public final class C22451 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19467 f72667;

    public C22451(C19467 c19467) {
        this.f72667 = c19467;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f72667.f62896.f48952) && this.f72667.f62896.f48935 != null && this.f72667.f62896.f48964) {
            this.f72667.f62896.f48935.mo6331();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f72667.f62896.f48952)) {
            this.f72667.f62896.f48948 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f72667.f62896.f48952) && this.f72667.f62896.f48935 != null && this.f72667.f62896.f48964) {
            this.f72667.f62896.f48935.mo6331();
        }
    }
}
