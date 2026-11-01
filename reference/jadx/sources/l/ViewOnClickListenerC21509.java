package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21509 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69882;

    public /* synthetic */ ViewOnClickListenerC21509(int i, Object obj) {
        this.f69881 = i;
        this.f69882 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f69881;
        Object obj = this.f69882;
        switch (i) {
            case 0:
                C20409.m46070((C20409) obj, view);
                break;
            case 1:
                ((AbstractC21013) obj).f68411.dismiss();
                break;
            default:
                int i2 = AbstractC20413.f66159;
                ((C20164) obj).m5825();
                break;
        }
    }
}
