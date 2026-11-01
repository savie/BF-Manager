package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.ܳ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public class C14788 extends MediaBrowserService {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2086 f48344;

    public C14788(C2086 c2086, Context context) {
        this.f48344 = c2086;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundleM40934;
        int i2;
        C17609 c17609;
        C1148.m4220(bundle);
        C2086 c2086 = this.f48344;
        AbstractServiceC21032 abstractServiceC21032 = c2086.f7712;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundleM40934 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            c2086.f7713 = new Messenger(abstractServiceC21032.f68501);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", c2086.f7713.getBinder());
            c2086.f7715.add(bundle3);
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
            bundleM40934 = bundle3;
        }
        C11260 c11260 = new C11260(abstractServiceC21032, str, i2, i, null);
        C17609 c17609M47409 = abstractServiceC21032.m47409();
        if (c17609M47409 == null) {
            c17609 = null;
        } else {
            if (c2086.f7713 != null) {
                abstractServiceC21032.f68500.add(c11260);
            }
            if (bundleM40934 == null) {
                bundleM40934 = c17609M47409.m40934();
            } else if (c17609M47409.m40934() != null) {
                bundleM40934.putAll(c17609M47409.m40934());
            }
            c17609 = new C17609(bundleM40934, c17609M47409.m40935());
        }
        if (c17609 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(c17609.f55957, c17609.f55956);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        this.f48344.f7712.m47411();
    }
}
