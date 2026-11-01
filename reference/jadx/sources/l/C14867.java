package l;

import android.media.browse.MediaBrowser;

/* JADX INFO: renamed from: l.ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14867 extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21216 f48573;

    public C14867(C21216 c21216) {
        this.f48573 = c21216;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C21216 c21216 = this.f48573;
        C7811 c7811 = c21216.f69119;
        if (c7811 != null) {
            c7811.m20503();
        }
        c21216.mo47687();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C21216 c21216 = this.f48573;
        C7811 c7811 = c21216.f69119;
        if (c7811 != null) {
            c7811.m20506();
        }
        c21216.mo47688();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f48573.mo47689();
    }
}
