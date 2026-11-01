package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11304 implements InterfaceC4001 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38157;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f38158;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22347 f38159;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC9893 f38160;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f38161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f38162;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11392 f38163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13175 f38164;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f38165;

    @Override // l.InterfaceC4001
    public final /* synthetic */ void onCanceled() {
    }

    public C11304(ViewOnClickListenerC9893 viewOnClickListenerC9893, boolean z, C22347 c22347, DialogInterfaceC19356 dialogInterfaceC19356, InterfaceC13175 interfaceC13175, C11392 c11392, String str, C14558 c14558, TextView textView) {
        this.f38160 = viewOnClickListenerC9893;
        this.f38162 = z;
        this.f38159 = c22347;
        this.f38158 = dialogInterfaceC19356;
        this.f38164 = interfaceC13175;
        this.f38163 = c11392;
        this.f38157 = str;
        this.f38165 = c14558;
        this.f38161 = textView;
    }

    @Override // l.InterfaceC4001
    public final void onSuccess() {
        boolean z = this.f38162;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f38158;
        if (!z || (this.f38159.m49555(dialogInterfaceC19356) && dialogInterfaceC19356.m44375())) {
            this.f38164.mo6719(this.f38163);
            dialogInterfaceC19356.dismiss();
            new C24004(this.f38160, this.f38165, this.f38157).m10243();
        }
    }

    @Override // l.InterfaceC4001
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11496(Exception exc) {
        boolean z = this.f38162;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f38158;
        if (z && (!this.f38159.m49555(dialogInterfaceC19356) || !dialogInterfaceC19356.m44375())) {
            return true;
        }
        if (!(exc instanceof C15721)) {
            return false;
        }
        C23053.m50998(this.f38161, (C15721) exc);
        dialogInterfaceC19356.m44373().setEnabled(false);
        return true;
    }
}
