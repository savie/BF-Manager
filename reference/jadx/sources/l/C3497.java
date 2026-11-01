package l;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ۗ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public class C3497 extends C14788 {
    public C3497(C4804 c4804, Context context) {
        super(c4804, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C9849 c9849 = new C9849(str, new C1276(result));
        c9849.m49804(2);
        c9849.m49807();
    }
}
