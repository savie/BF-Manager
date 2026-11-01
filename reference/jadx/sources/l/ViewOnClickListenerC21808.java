package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21808 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70621;

    public /* synthetic */ ViewOnClickListenerC21808(int i, Object obj) {
        this.f70620 = i;
        this.f70621 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f70620) {
            case 0:
                ((ActivityC3588) this.f70621).m10629();
                break;
            case 1:
                C4677.m12953((C4677) this.f70621);
                break;
            default:
                ActivityC10957.m27583((ActivityC10957) this.f70621, view);
                break;
        }
    }
}
