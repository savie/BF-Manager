package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17491 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55645;

    public /* synthetic */ ViewOnClickListenerC17491(int i, Object obj) {
        this.f55644 = i;
        this.f55645 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f55644) {
            case 0:
                ActivityC10957.m27646((ActivityC10957) this.f55645);
                break;
            default:
                ((C16766) this.f55645).m39331("Cookie", (String) null);
                break;
        }
    }
}
