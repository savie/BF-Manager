package l;

import android.media.browse.MediaBrowser;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public class C16278 extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16983 f52444;

    public C16278(AbstractC16983 abstractC16983) {
        this.f52444 = abstractC16983;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        C20511.m46307(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f52444.getClass();
    }
}
