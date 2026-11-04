package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7633 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25183;

    public /* synthetic */ ViewOnClickListenerC7633(int i, Object obj) {
        this.f25182 = i;
        this.f25183 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25182;
        Object obj = this.f25183;
        switch (i) {
            case 0:
                C25093.m55940((C25093) obj);
                break;
            case 1:
                C4059.m13057((C4059) obj);
                break;
            case 2:
                boolean z = ActivityC9458.f30665;
                ((ActivityC9458) obj).finish();
                break;
            default:
                ((ActivityC0885) obj).m3614();
                break;
        }
    }
}
