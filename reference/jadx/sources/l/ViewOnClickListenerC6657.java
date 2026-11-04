package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6657 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22189;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22190;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22192;

    public /* synthetic */ ViewOnClickListenerC6657(Object obj, Object obj2, DialogInterfaceC8327 dialogInterfaceC8327, int i) {
        this.f22190 = i;
        this.f22192 = obj;
        this.f22191 = obj2;
        this.f22189 = dialogInterfaceC8327;
    }

    public /* synthetic */ ViewOnClickListenerC6657(String str, Main main, String str2) {
        this.f22190 = 1;
        this.f22191 = str;
        this.f22192 = main;
        this.f22189 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f22190) {
            case 0:
                C8893.m23789((C8893) this.f22192, (String) this.f22191, (DialogInterfaceC8327) this.f22189, view);
                break;
            case 1:
                String str = (String) this.f22191;
                Main main = (Main) this.f22192;
                String str2 = (String) this.f22189;
                if (str != null) {
                    main.m40420(str);
                    z = true;
                } else {
                    z = false;
                }
                if (str2 != null) {
                    C21576.m49061(z ? -1 : R.string.MT_Protector, str2);
                }
                break;
            default:
                C21799.m49446((C8964) this.f22192, (C21799) this.f22191, (DialogInterfaceC8327) this.f22189);
                break;
        }
    }
}
