package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8386 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27493;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27494;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11217 f27495;

    public /* synthetic */ ViewOnClickListenerC8386(int i, InterfaceC11217 interfaceC11217, Object obj) {
        this.f27493 = i;
        this.f27495 = interfaceC11217;
        this.f27494 = obj;
    }

    public /* synthetic */ ViewOnClickListenerC8386(InterfaceC1615 interfaceC1615, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f27493 = 2;
        this.f27494 = interfaceC1615;
        this.f27495 = dialogInterfaceC8327;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27493;
        Object obj = this.f27494;
        InterfaceC11217 interfaceC11217 = this.f27495;
        switch (i) {
            case 0:
                C3669.m11947((DialogInterfaceC8327) interfaceC11217, (C24720) obj);
                break;
            case 1:
                C5587.m16561((AbstractActivityC17204) interfaceC11217, (ArrayList) obj, null);
                break;
            case 2:
                InterfaceC1615 interfaceC1615 = (InterfaceC1615) obj;
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) interfaceC11217;
                if (!interfaceC1615.mo3999()) {
                    interfaceC1615.mo5709();
                    dialogInterfaceC8327.dismiss();
                    break;
                }
                break;
            default:
                ActivityC0848 activityC0848 = (ActivityC0848) interfaceC11217;
                int i2 = ActivityC0848.f3169;
                ActivityC4300.m13685(activityC0848, C24216.m54208((IOException) obj), activityC0848.getString(R.string.MT_Protector), null, null);
                break;
        }
    }
}
