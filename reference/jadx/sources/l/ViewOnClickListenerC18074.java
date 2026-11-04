package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18074 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59158;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59159;

    public /* synthetic */ ViewOnClickListenerC18074(int i, Object obj) {
        this.f59158 = i;
        this.f59159 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f59158) {
            case 0:
                ((C25093) this.f59159).m55926(false);
                break;
            default:
                C18210.m42359((C18210) this.f59159);
                break;
        }
    }
}
