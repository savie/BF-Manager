package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6895 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22870;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22871;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11217 f22872;

    public /* synthetic */ ViewOnClickListenerC6895(int i, InterfaceC11217 interfaceC11217, Object obj) {
        this.f22870 = i;
        this.f22872 = interfaceC11217;
        this.f22871 = obj;
    }

    public /* synthetic */ ViewOnClickListenerC6895(C13132 c13132, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f22870 = 1;
        this.f22871 = c13132;
        this.f22872 = dialogInterfaceC8327;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22870;
        Object obj = this.f22871;
        InterfaceC11217 interfaceC11217 = this.f22872;
        switch (i) {
            case 0:
                C3669.m11938((DialogInterfaceC8327) interfaceC11217, (C24720) obj);
                break;
            case 1:
                C13132.m32624((C13132) obj, (DialogInterfaceC8327) interfaceC11217);
                break;
            default:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) interfaceC11217;
                int i2 = AbstractActivityC17204.f56033;
                abstractActivityC17204.getClass();
                ActivityC4300.m13685(abstractActivityC17204, C24216.m54208((Throwable) obj), abstractActivityC17204.getString(R.string.MT_Protector), null, null);
                break;
        }
    }
}
