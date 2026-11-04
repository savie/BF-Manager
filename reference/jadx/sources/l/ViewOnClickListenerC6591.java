package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6591 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22078;

    public /* synthetic */ ViewOnClickListenerC6591(int i, Object obj) {
        this.f22077 = i;
        this.f22078 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22077;
        Object obj = this.f22078;
        switch (i) {
            case 0:
                int i2 = ActivityC9572.f30971;
                ((ActivityC9572) obj).getOnBackPressedDispatcher().m19401();
                break;
            case 1:
                ((C1255) obj).toggle();
                break;
            case 2:
                ((AbstractViewOnClickListenerC23950) obj).m53476(view);
                break;
            default:
                C0107 c0107 = ActivityC3910.f13365;
                ((ActivityC3910) obj).finish();
                break;
        }
    }
}
