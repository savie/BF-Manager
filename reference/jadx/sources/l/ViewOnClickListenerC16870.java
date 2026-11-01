package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC16870 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53966;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53968;

    public /* synthetic */ ViewOnClickListenerC16870(int i, Object obj, Object obj2) {
        this.f53967 = i;
        this.f53968 = obj;
        this.f53966 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f53967) {
            case 0:
                C3589.m10657((DialogInterfaceC19356) this.f53968, (C22959) this.f53966);
                break;
            default:
                C17901.m41545((C17901) this.f53966, (C21696) this.f53968);
                break;
        }
    }
}
