package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܳܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15403 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50216;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50217;

    public /* synthetic */ ViewOnClickListenerC15403(int i, Object obj) {
        this.f50216 = i;
        this.f50217 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f50216) {
            case 0:
                ActivityC7135.m19658((ActivityC7135) this.f50217, view);
                break;
            default:
                ((C8560) this.f50217).m22973("Cookie", (String) null);
                break;
        }
    }
}
