package l;

import android.view.View;
import bin.mt.plus.Main;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.۬᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC14121 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44656;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44657 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f44658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44659;

    public /* synthetic */ ViewOnClickListenerC14121(Main main, DialogInterfaceC8327 dialogInterfaceC8327, InterfaceC4844 interfaceC4844) {
        this.f44659 = main;
        this.f44658 = dialogInterfaceC8327;
        this.f44656 = interfaceC4844;
    }

    public /* synthetic */ ViewOnClickListenerC14121(C23065 c23065, C12359 c12359, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f44659 = c23065;
        this.f44656 = c12359;
        this.f44658 = dialogInterfaceC8327;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44657) {
            case 0:
                Main main = (Main) this.f44659;
                InterfaceC4844 interfaceC4844 = (InterfaceC4844) this.f44656;
                if (C7508.m20559(main, UMUtils.SD_PERMISSION) != 0) {
                    main.mo37500(main.getPackageName());
                } else {
                    this.f44658.dismiss();
                    interfaceC4844.onSuccess();
                }
                break;
            default:
                C23065.m51981((C23065) this.f44659, (C12359) this.f44656, this.f44658);
                break;
        }
    }
}
