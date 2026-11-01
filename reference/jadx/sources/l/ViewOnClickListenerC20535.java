package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.᩷֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC20535 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66519;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66520;

    public /* synthetic */ ViewOnClickListenerC20535(int i, Object obj) {
        this.f66519 = i;
        this.f66520 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f66519;
        Object obj = this.f66520;
        switch (i) {
            case 0:
                ((ActivityC13125) obj).m32478();
                break;
            case 1:
                int i2 = ActivityC21135.f68820;
                ((ActivityC21135) obj).finish();
                break;
            case 2:
                C17998.m41903((C17998) obj, view);
                break;
            case 3:
                ((PopupWindow) obj).dismiss();
                break;
            default:
                int i3 = ActivityC19041.f61585;
                ((ActivityC19041) obj).finish();
                break;
        }
    }
}
