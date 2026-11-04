package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6IL */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC23663 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76743;

    public /* synthetic */ ViewOnClickListenerC23663(int i, Object obj) {
        this.f76742 = i;
        this.f76743 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f76742) {
            case 0:
                C21425.m48744((C21425) this.f76743);
                break;
            default:
                C16376.m38866((AbstractActivityC17204) this.f76743);
                break;
        }
    }
}
