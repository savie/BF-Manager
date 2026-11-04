package l;

import android.media.browse.MediaBrowser;

/* JADX INFO: renamed from: l.ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16456 extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17202 f53349;

    public C16456(C17202 c17202) {
        this.f53349 = c17202;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C17202 c17202 = this.f53349;
        C3032 c3032 = c17202.f56032;
        if (c3032 != null) {
            c3032.m9844();
        }
        c17202.mo11493();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C17202 c17202 = this.f53349;
        C3032 c3032 = c17202.f56032;
        if (c3032 != null) {
            c3032.m9842();
        }
        c17202.mo11495();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f53349.mo11496();
    }
}
