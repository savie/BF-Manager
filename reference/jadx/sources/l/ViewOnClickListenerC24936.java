package l;

import android.view.View;
import android.widget.PopupWindow;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E142 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC24936 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80704;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f80705;

    public /* synthetic */ ViewOnClickListenerC24936(int i, Object obj) {
        this.f80704 = i;
        this.f80705 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f80704;
        Object obj = this.f80705;
        switch (i) {
            case 0:
                ((PopupWindow) obj).dismiss();
                break;
            case 1:
                C20956 c20956 = (C20956) obj;
                c20956.getClass();
                C20956.m47909(c20956, R.string.MT_Protector, null, null, 14);
                break;
            default:
                int i2 = AbstractC15118.f49330;
                ((C12765) obj).m31644();
                break;
        }
    }
}
