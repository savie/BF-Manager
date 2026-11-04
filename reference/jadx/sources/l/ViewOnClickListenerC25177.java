package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩻ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6H8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC25177 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81369;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81370;

    public /* synthetic */ ViewOnClickListenerC25177(int i, Object obj) {
        this.f81369 = i;
        this.f81370 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f81369;
        Object obj = this.f81370;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                DialogInterfaceOnDismissListenerC20840.m47654((DialogInterfaceOnDismissListenerC20840) obj);
                break;
            case 2:
                ((RunnableC22149) obj).run();
                break;
            default:
                int i2 = AbstractActivityC2952.f9638;
                ((AbstractActivityC2952) obj).getOnBackPressedDispatcher().m19401();
                break;
        }
    }
}
