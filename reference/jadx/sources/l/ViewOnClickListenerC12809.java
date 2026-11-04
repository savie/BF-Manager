package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC12809 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41040;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41041;

    public /* synthetic */ ViewOnClickListenerC12809(int i, Object obj) {
        this.f41040 = i;
        this.f41041 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f41040;
        Object obj = this.f41041;
        switch (i) {
            case 0:
                DialogInterfaceOnClickListenerC14300.m34712((DialogInterfaceOnClickListenerC14300) obj, view);
                break;
            default:
                int i2 = ActivityC16597.f53680;
                ((ActivityC16597) obj).getOnBackPressedDispatcher().m19401();
                break;
        }
    }
}
