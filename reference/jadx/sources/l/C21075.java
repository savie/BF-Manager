package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩶ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21075 implements InterfaceC11309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1615 f67335;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12801 f67336;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f67337;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f67338;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10737 f67339;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18837 f67340;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f67341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f67342;

    public C21075(boolean z, C12801 c12801, DialogInterfaceC8327 dialogInterfaceC8327, InterfaceC18837 interfaceC18837, InterfaceC1615 interfaceC1615, C10737 c10737, C9651 c9651, TextView textView) {
        this.f67341 = z;
        this.f67336 = c12801;
        this.f67337 = dialogInterfaceC8327;
        this.f67340 = interfaceC18837;
        this.f67335 = interfaceC1615;
        this.f67339 = c10737;
        this.f67338 = c9651;
        this.f67342 = textView;
    }

    @Override // l.InterfaceC11309
    public final void onSuccess() {
        boolean z = this.f67341;
        InterfaceC18837 interfaceC18837 = this.f67340;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f67337;
        if (z) {
            if (!this.f67336.m31748(dialogInterfaceC8327)) {
                return;
            }
            if (!dialogInterfaceC8327.m22434()) {
                interfaceC18837.mo1268();
                return;
            }
        }
        this.f67335.mo5707(this.f67339);
        dialogInterfaceC8327.dismiss();
        interfaceC18837.mo1269(this.f67338, false);
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28582(Exception exc) {
        boolean z = this.f67341;
        InterfaceC18837 interfaceC18837 = this.f67340;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f67337;
        if (z) {
            if (!this.f67336.m31748(dialogInterfaceC8327)) {
                return true;
            }
            if (!dialogInterfaceC8327.m22434()) {
                interfaceC18837.mo1268();
                return true;
            }
        }
        if (exc instanceof C20774) {
            C16530.m39161(this.f67342, (C20774) exc);
            dialogInterfaceC8327.m22436().setEnabled(false);
            return true;
        }
        return interfaceC18837.mo1270(exc);
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final void mo28581() {
        this.f67337.dismiss();
        this.f67340.mo1268();
    }
}
