package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11892 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f38314;

    public /* synthetic */ ViewOnClickListenerC11892(AbstractActivityC17204 abstractActivityC17204, int i) {
        this.f38313 = i;
        this.f38314 = abstractActivityC17204;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38313) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18644((ViewOnLayoutChangeListenerC6673) this.f38314);
                break;
            default:
                ActivityC7135.m19673((ActivityC7135) this.f38314);
                break;
        }
    }
}
