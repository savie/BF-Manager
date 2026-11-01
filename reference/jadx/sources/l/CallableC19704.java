package l;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.᩵᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CallableC19704 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21114 f63259;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f63260;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16176 f63261;

    public /* synthetic */ CallableC19704(C21114 c21114, C16176 c16176, Bundle bundle) {
        this.f63259 = c21114;
        this.f63261 = c16176;
        this.f63260 = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C20409 c20409 = this.f63259.f68779;
        C18998 c18998 = c20409.f66141;
        Bundle bundle = c20409.f16884;
        C16176 c16176 = this.f63261;
        if (c18998 == c16176.f52252) {
            bundle.clear();
            bundle.putAll(this.f63260);
            c20409.f66145 = null;
            c16176.f52252.f61489.m44755(bundle);
            c20409.m13345();
        }
        return null;
    }
}
