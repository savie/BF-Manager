package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩷ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC21881 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69734;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f69735;

    public /* synthetic */ ViewOnClickListenerC21881(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f69734 = i;
        this.f69735 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f69734) {
            case 0:
                ActivityC15913.m37930((ActivityC15913) this.f69735);
                break;
            default:
                ActivityC7135.m19646((ActivityC7135) this.f69735);
                break;
        }
    }
}
