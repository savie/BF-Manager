package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩻ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC24974 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f80866;

    public /* synthetic */ ViewOnClickListenerC24974(int i, View view) {
        this.f80865 = i;
        this.f80866 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f80865;
        View view2 = this.f80866;
        switch (i) {
            case 0:
                ((C1255) view2).toggle();
                break;
            default:
                C7308 c7308 = (C7308) view2;
                int i2 = C7308.f24048;
                if (c7308.m20009().length() <= 0) {
                    c7308.m20012();
                } else {
                    c7308.m20006((String) null);
                    c7308.m20013(true);
                }
                break;
        }
    }
}
