package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5714 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19464;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19465;

    public /* synthetic */ ViewOnClickListenerC5714(int i, Object obj) {
        this.f19464 = i;
        this.f19465 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f19464;
        Object obj = this.f19465;
        switch (i) {
            case 0:
                C22418.m49727((C22418) obj);
                break;
            default:
                int i2 = ActivityC3541.f13037;
                ((ActivityC3541) obj).finish();
                break;
        }
    }
}
