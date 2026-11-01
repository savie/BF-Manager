package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۠ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8333 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f28862;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15967 f28863;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f28864;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f28865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28866;

    public RunnableC8333(C19622 c19622, C10450 c10450, String str, Bundle bundle, C15967 c15967) {
        this.f28864 = c19622;
        this.f28862 = c10450;
        this.f28866 = str;
        this.f28865 = bundle;
        this.f28863 = c15967;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11260 c11260 = (C11260) this.f28864.f62983.f68499.getOrDefault(this.f28862.f35674.getBinder(), null);
        Bundle bundle = this.f28865;
        if (c11260 == null) {
            C13638.toString(bundle);
            return;
        }
        String str = this.f28866;
        C12671 c12671 = new C12671(str, this.f28863);
        c12671.m49805();
        if (c12671.m49806()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
