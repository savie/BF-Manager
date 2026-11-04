package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: l.᩵ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public class C20694 extends MediaBrowserService {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12489 f66324;

    public C20694(C12489 c12489, Context context) {
        this.f66324 = c12489;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundleM41475;
        int i2;
        C17710 c17710;
        C13363.m32945(bundle);
        C12489 c12489 = this.f66324;
        AbstractServiceC13191 abstractServiceC13191 = c12489.f40100;
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundleM41475 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            c12489.f40097 = new Messenger(abstractServiceC13191.f42130);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", c12489.f40097.getBinder());
            c12489.f40099.add(bundle3);
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
            bundleM41475 = bundle3;
        }
        C23678 c23678 = new C23678(abstractServiceC13191, str, i2, i, null);
        C17710 c17710M32706 = abstractServiceC13191.m32706();
        if (c17710M32706 == null) {
            c17710 = null;
        } else {
            if (c12489.f40097 != null) {
                abstractServiceC13191.f42126.add(c23678);
            }
            if (bundleM41475 == null) {
                bundleM41475 = c17710M32706.m41475();
            } else if (c17710M32706.m41475() != null) {
                bundleM41475.putAll(c17710M32706.m41475());
            }
            c17710 = new C17710(bundleM41475, c17710M32706.m41476());
        }
        if (c17710 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(c17710.f58194, c17710.f58193);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        this.f66324.f40100.m32708();
    }
}
