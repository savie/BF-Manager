package l;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ۨᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11861 extends C3497 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2687 f39793;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11861(C2687 c2687, Context context) {
        super(c2687, context);
        this.f39793 = c2687;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        C1148.m4220(bundle);
        C2687 c2687 = this.f39793;
        AbstractServiceC21032 abstractServiceC21032 = c2687.f10373;
        new C13978(c2687, str, new C1276(result), bundle).m49804(1);
        abstractServiceC21032.m47411();
    }
}
