package l;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.᩺ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public class C24424 extends C20694 {
    public C24424(C4286 c4286, Context context) {
        super(c4286, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C6524 c6524 = new C6524(str, new C19202(result));
        c6524.m21880(2);
        c6524.m21882();
    }
}
