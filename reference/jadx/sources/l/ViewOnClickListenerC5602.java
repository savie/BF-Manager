package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۚ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5602 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19206;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f19207;

    public /* synthetic */ ViewOnClickListenerC5602(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f19206 = i;
        this.f19207 = abstractActivityC12483;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19206) {
            case 0:
                ActivityC15481.m37051((ActivityC15481) this.f19207);
                break;
            default:
                ActivityC10957.m27539((ActivityC10957) this.f19207);
                break;
        }
    }
}
