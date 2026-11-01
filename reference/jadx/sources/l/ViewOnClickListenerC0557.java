package l;

import android.view.View;

/* JADX INFO: renamed from: l.֡ܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0557 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2334;

    public /* synthetic */ ViewOnClickListenerC0557(int i, Object obj) {
        this.f2333 = i;
        this.f2334 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2333) {
            case 0:
                ActivityC10957.m27697((ActivityC10957) this.f2334);
                break;
            default:
                C16766.m39326((C16766) this.f2334);
                break;
        }
    }
}
