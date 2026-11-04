package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import com.alipay.sdk.m.c0.d;

/* JADX INFO: renamed from: l.ۜۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6890 implements InterfaceC17972 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f22861;

    public C6890(C7941 c7941) {
        this.f22861 = c7941;
    }

    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ */
    public final void mo16590(Bundle bundle, String str) {
        this.f22861.m21622(str, bundle.getBoolean(d.A, false));
    }

    @Override // l.InterfaceC17972
    /* JADX INFO: renamed from: ۙ */
    public final void mo16589() {
        C7941 c7941 = this.f22861;
        if (c7941.f26401 != null) {
            c7941.f26401.onFailure(ResultCallback.ERROR_OPERATION_CANCELED);
            c7941.f26401 = null;
        }
    }
}
