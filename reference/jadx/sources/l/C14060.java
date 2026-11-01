package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import com.alipay.sdk.m.c0.d;

/* JADX INFO: renamed from: l.ܰ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14060 implements InterfaceC14394 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f46202;

    public C14060(C20409 c20409) {
        this.f46202 = c20409;
    }

    @Override // l.InterfaceC14394
    public final void onGetPath(Bundle bundle, String str) {
        this.f46202.m46133(str, bundle.getBoolean(d.A, false));
    }

    @Override // l.InterfaceC14394
    public final void onCanceled() {
        C20409 c20409 = this.f46202;
        if (c20409.f66128 != null) {
            c20409.f66128.onFailure(ResultCallback.ERROR_OPERATION_CANCELED);
            c20409.f66128 = null;
        }
    }
}
