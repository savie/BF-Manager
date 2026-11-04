package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16990 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55525;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f55526;

    public /* synthetic */ ViewOnClickListenerC16990(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f55525 = i;
        this.f55526 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f55525;
        AbstractActivityC17204 abstractActivityC17204 = this.f55526;
        switch (i) {
            case 0:
                ActivityC3041.m9879((ActivityC3041) abstractActivityC17204);
                break;
            default:
                int i2 = ActivityC5440.f18993;
                ((ActivityC5440) abstractActivityC17204).getOnBackPressedDispatcher().m19401();
                break;
        }
    }
}
