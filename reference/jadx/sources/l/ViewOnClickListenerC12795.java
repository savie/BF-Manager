package l;

import android.view.View;

/* JADX INFO: renamed from: l.۬֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12795 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f42621;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42623;

    public /* synthetic */ ViewOnClickListenerC12795(int i, AbstractActivityC12483 abstractActivityC12483, Object obj) {
        this.f42622 = i;
        this.f42623 = obj;
        this.f42621 = abstractActivityC12483;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42622) {
            case 0:
                C20556.m46345((C20556) this.f42623, this.f42621, view);
                break;
            default:
                C7282.m19430((C7282) this.f42623, this.f42621);
                break;
        }
    }
}
