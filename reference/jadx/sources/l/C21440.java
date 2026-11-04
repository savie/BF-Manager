package l;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.᩶ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C21440 extends C24424 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18456 f68393;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21440(C18456 c18456, Context context) {
        super(c18456, context);
        this.f68393 = c18456;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        C13363.m32945(bundle);
        C18456 c18456 = this.f68393;
        AbstractServiceC13191 abstractServiceC13191 = c18456.f60078;
        new C14726(c18456, str, new C19202(result), bundle).m21880(1);
        abstractServiceC13191.m32708();
    }
}
