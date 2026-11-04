package l;

import android.media.browse.MediaBrowser;
import java.util.List;

/* JADX INFO: renamed from: l.֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public class C0049 extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18694 f900;

    public C0049(AbstractC18694 abstractC18694) {
        this.f900 = abstractC18694;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        C3778.m12254(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        this.f900.getClass();
    }
}
