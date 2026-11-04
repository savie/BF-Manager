package l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* JADX INFO: renamed from: l.ۘ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacksC4421 implements ComponentCallbacks {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f15862;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14861 f15863;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C15243.m36590(configuration, "newConfig");
        C14861 c14861 = this.f15863;
        InterfaceC9883 interfaceC9883 = c14861.f48579;
        if (interfaceC9883 == null) {
            return;
        }
        Activity activity = this.f15862;
        ((C20829) interfaceC9883).m47633(activity, c14861.m35801(activity));
    }

    public ComponentCallbacksC4421(C14861 c14861, Activity activity) {
        this.f15863 = c14861;
        this.f15862 = activity;
    }
}
