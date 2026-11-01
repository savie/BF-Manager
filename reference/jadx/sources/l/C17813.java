package l;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17813 extends MediaController.Callback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f56443;

    public C17813(AbstractC7936 abstractC7936) {
        this.f56443 = new WeakReference(abstractC7936);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C1148.m4220(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((AbstractC7936) this.f56443.get()) != null) {
            C13581.m33198(mediaMetadata);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        if (((AbstractC7936) this.f56443.get()) != null) {
            C13850.m33690(list);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C1148.m4220(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((AbstractC7936) this.f56443.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = C18315.f58418;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }
}
