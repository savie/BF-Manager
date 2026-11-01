package l;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12045 extends C16278 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16983 f40312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12045(AbstractC16983 abstractC16983) {
        super(abstractC16983);
        this.f40312 = abstractC16983;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list, Bundle bundle) {
        C1148.m4220(bundle);
        C20511.m46307(list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str, Bundle bundle) {
        C1148.m4220(bundle);
        this.f40312.getClass();
    }
}
