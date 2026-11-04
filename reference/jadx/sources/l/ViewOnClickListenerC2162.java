package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC2162 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7134;

    public /* synthetic */ ViewOnClickListenerC2162(int i, Object obj) {
        this.f7133 = i;
        this.f7134 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f7133;
        Object obj = this.f7134;
        switch (i) {
            case 0:
                ((ActivityC22957) obj).m51780();
                break;
            case 1:
                int i2 = ActivityC15090.f49247;
                ((ActivityC15090) obj).finish();
                break;
            case 2:
                C21447.m48792((C21447) obj);
                break;
            case 3:
                C3328.m10962((C3328) obj);
                break;
            case 4:
                int i3 = ActivityC10667.f33847;
                ((ActivityC10667) obj).finish();
                break;
            default:
                int i4 = ViewOnClickListenerC11499.f36169;
                ((ViewOnClickListenerC11499) obj).finish();
                break;
        }
    }
}
