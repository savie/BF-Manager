package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1928 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4875 f7296;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16746 f7297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f7298;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9186 f7299;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2758 f7300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17451 f7301;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6162 f7302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16195[] f7303;

    public ViewOnAttachStateChangeListenerC1928(C2758 c2758, C17451 c17451, C9186 c9186, C6162 c6162, C16746 c16746, Runnable runnable, C16195[] c16195Arr, C4875 c4875) {
        this.f7300 = c2758;
        this.f7301 = c17451;
        this.f7299 = c9186;
        this.f7302 = c6162;
        this.f7297 = c16746;
        this.f7298 = runnable;
        this.f7303 = c16195Arr;
        this.f7296 = c4875;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f7300.f10573.add(this.f7301);
        this.f7299.m44961((InterfaceC10597) this.f7302);
        C15586.m37241(this.f7297);
        ((RunnableC14630) this.f7298).run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C16195[] c16195Arr = this.f7303;
        C16195 c16195 = c16195Arr[0];
        if (c16195 != null) {
            c16195.m38293();
            c16195Arr[0] = null;
        }
        C4875 c4875 = this.f7296;
        AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341 = c4875.f17149;
        c4875.f17149 = null;
        if (abstractDialogInterfaceOnClickListenerC17341 != null) {
            abstractDialogInterfaceOnClickListenerC17341.m40364();
        }
        this.f7300.f10573.remove(this.f7301);
        this.f7299.m44963((InterfaceC10597) this.f7302);
        C15586.m37244(this.f7297);
        C16737.m39278().removeCallbacks(this.f7298);
    }
}
