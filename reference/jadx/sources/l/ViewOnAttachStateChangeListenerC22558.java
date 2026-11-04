package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC22558 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7160 f72906;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f72907;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17930 f72908;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2685 f72909;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11369 f72910;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12861 f72911;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13871 f72912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18452[] f72913;

    public ViewOnAttachStateChangeListenerC22558(C11369 c11369, C7160 c7160, C17930 c17930, C13871 c13871, C2685 c2685, Runnable runnable, C18452[] c18452Arr, C12861 c12861) {
        this.f72910 = c11369;
        this.f72906 = c7160;
        this.f72908 = c17930;
        this.f72912 = c13871;
        this.f72909 = c2685;
        this.f72907 = runnable;
        this.f72913 = c18452Arr;
        this.f72911 = c12861;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f72910.f35785.add(this.f72906);
        this.f72908.m40351((InterfaceC16438) this.f72912);
        C1432.m5168(this.f72909);
        ((RunnableC10623) this.f72907).run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C18452[] c18452Arr = this.f72913;
        C18452 c18452 = c18452Arr[0];
        if (c18452 != null) {
            c18452.m42991();
            c18452Arr[0] = null;
        }
        C12861 c12861 = this.f72911;
        AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552 = c12861.f41170;
        c12861.f41170 = null;
        if (abstractDialogInterfaceOnClickListenerC8552 != null) {
            abstractDialogInterfaceOnClickListenerC8552.m22951();
        }
        this.f72910.f35785.remove(this.f72906);
        this.f72908.m40354((InterfaceC16438) this.f72912);
        C1432.m5171(this.f72909);
        C21576.m49077().removeCallbacks(this.f72907);
    }
}
