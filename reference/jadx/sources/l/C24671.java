package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class C24671 implements InterfaceC11309 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12801 f79835;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23179 f79836;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10737 f79837;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f79838;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f79839;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f79840;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f79841;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1615 f79842;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f79843;

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo28581() {
    }

    public C24671(ViewOnClickListenerC23179 viewOnClickListenerC23179, boolean z, C12801 c12801, DialogInterfaceC8327 dialogInterfaceC8327, InterfaceC1615 interfaceC1615, C10737 c10737, String str, C9651 c9651, TextView textView) {
        this.f79836 = viewOnClickListenerC23179;
        this.f79838 = z;
        this.f79835 = c12801;
        this.f79843 = dialogInterfaceC8327;
        this.f79842 = interfaceC1615;
        this.f79837 = c10737;
        this.f79839 = str;
        this.f79840 = c9651;
        this.f79841 = textView;
    }

    @Override // l.InterfaceC11309
    public final void onSuccess() {
        boolean z = this.f79838;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f79843;
        if (!z || (this.f79835.m31748(dialogInterfaceC8327) && dialogInterfaceC8327.m22434())) {
            this.f79842.mo5707(this.f79837);
            dialogInterfaceC8327.dismiss();
            new C16465(this.f79836, this.f79840, this.f79839).m8197();
        }
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28582(Exception exc) {
        boolean z = this.f79838;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f79843;
        if (z && (!this.f79835.m31748(dialogInterfaceC8327) || !dialogInterfaceC8327.m22434())) {
            return true;
        }
        if (!(exc instanceof C20774)) {
            return false;
        }
        C16530.m39161(this.f79841, (C20774) exc);
        dialogInterfaceC8327.m22436().setEnabled(false);
        return true;
    }
}
