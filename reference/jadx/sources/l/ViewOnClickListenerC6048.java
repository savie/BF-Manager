package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7B1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6048 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20538;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20539;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20540;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20541;

    public /* synthetic */ ViewOnClickListenerC6048(Object obj, Object obj2, Object obj3, int i) {
        this.f20539 = i;
        this.f20541 = obj;
        this.f20538 = obj2;
        this.f20540 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20539) {
            case 0:
                C13955.m33810((C13955) this.f20541, (C3992) this.f20538, (DialogInterfaceC19356) this.f20540);
                break;
            default:
                C17566.m40843((C17566) this.f20541, (AbstractActivityC12483) this.f20538, (C14745) this.f20540);
                break;
        }
    }
}
