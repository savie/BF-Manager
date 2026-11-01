package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19619 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62981;

    public /* synthetic */ ViewOnClickListenerC19619(int i, Object obj) {
        this.f62980 = i;
        this.f62981 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f62980;
        Object obj = this.f62981;
        switch (i) {
            case 0:
                int i2 = ActivityC0567.f2346;
                ((ActivityC0567) obj).finish();
                break;
            default:
                ((C17715) obj).m41260(view);
                break;
        }
    }
}
