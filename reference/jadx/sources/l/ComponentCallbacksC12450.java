package l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: renamed from: l.۫ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacksC12450 implements ComponentCallbacks {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f41514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17388 f41515;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C13465.m32966(configuration, "newConfig");
        C17388 c17388 = this.f41515;
        InterfaceC9359 interfaceC9359 = c17388.f55350;
        if (interfaceC9359 == null) {
            return;
        }
        Activity activity = this.f41514;
        ((C15978) interfaceC9359).m37957(activity, c17388.m40508(activity));
    }

    public ComponentCallbacksC12450(C17388 c17388, Activity activity) {
        this.f41515 = c17388;
        this.f41514 = activity;
    }
}
