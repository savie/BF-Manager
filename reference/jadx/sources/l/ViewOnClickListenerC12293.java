package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۨۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12293 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39529;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f39530;

    public /* synthetic */ ViewOnClickListenerC12293(C1255 c1255, int i) {
        this.f39529 = i;
        this.f39530 = c1255;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39529) {
            case 0:
                this.f39530.toggle();
                break;
            default:
                this.f39530.toggle();
                break;
        }
    }
}
