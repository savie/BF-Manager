package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19700 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1423 f63249;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63250 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63251;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63252;

    public /* synthetic */ ViewOnClickListenerC19700(String str, Main main, String str2) {
        this.f63252 = str;
        this.f63249 = main;
        this.f63251 = str2;
    }

    public /* synthetic */ ViewOnClickListenerC19700(C5424 c5424, C13186 c13186, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f63252 = c5424;
        this.f63251 = c13186;
        this.f63249 = dialogInterfaceC19356;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f63250) {
            case 0:
                String str = (String) this.f63252;
                Main main = (Main) this.f63249;
                String str2 = (String) this.f63251;
                if (str != null) {
                    main.m31020(str);
                    z = true;
                } else {
                    z = false;
                }
                if (str2 != null) {
                    C16737.m39266(z ? -1 : R.string.MT_Protector, str2);
                }
                break;
            default:
                C13186.m32590((C5424) this.f63252, (C13186) this.f63251, (DialogInterfaceC19356) this.f63249);
                break;
        }
    }
}
