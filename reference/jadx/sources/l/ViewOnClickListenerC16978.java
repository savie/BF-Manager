package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16978 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55505;

    public /* synthetic */ ViewOnClickListenerC16978(int i, Object obj) {
        this.f55504 = i;
        this.f55505 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f55504;
        Object obj = this.f55505;
        switch (i) {
            case 0:
                int i2 = ActivityC4300.f15587;
                ((ActivityC4300) obj).finish();
                break;
            case 1:
                C2564.m8620((AbstractActivityC17204) obj);
                break;
            case 2:
                ((AbstractDialogInterfaceOnClickListenerC8552) obj).m22924((CharSequence) C22482.m50718(System.currentTimeMillis()));
                break;
            default:
                int i3 = ViewOnClickListenerC13408.f42716;
                ((ViewOnClickListenerC13408) obj).finish();
                break;
        }
    }
}
