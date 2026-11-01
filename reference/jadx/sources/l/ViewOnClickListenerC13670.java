package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13670 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45089;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f45090;

    public /* synthetic */ ViewOnClickListenerC13670(AbstractActivityC12483 abstractActivityC12483, int i) {
        this.f45089 = i;
        this.f45090 = abstractActivityC12483;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45089) {
            case 0:
                new ViewOnClickListenerC19680(this.f45090);
                break;
            default:
                ActivityC4471.m12474((ActivityC4471) this.f45090);
                break;
        }
    }
}
