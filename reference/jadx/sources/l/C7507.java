package l;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C7507 extends C0049 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18694 f24812;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7507(AbstractC18694 abstractC18694) {
        super(abstractC18694);
        this.f24812 = abstractC18694;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        C13363.m32945(bundle);
        C3778.m12254(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        C13363.m32945(bundle);
        this.f24812.getClass();
    }
}
