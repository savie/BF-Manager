package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8122 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26798;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26799;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f26800;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10358 f26801;

    public C8122(View view, ActivityC10358 activityC10358, DialogInterfaceC8327 dialogInterfaceC8327, String str) {
        this.f26801 = activityC10358;
        this.f26798 = str;
        this.f26800 = dialogInterfaceC8327;
        this.f26799 = view;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f26801, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C13464 {
        ActivityC10358 activityC10358 = this.f26801;
        C13778 c13778M29289 = C11650.m29289(this.f26798, activityC10358.f32977.f62395);
        if (c13778M29289.m33676()) {
            return;
        }
        if (activityC10358.f32977.f62395) {
            throw new C13464(C1364.m5010(c13778M29289, R.string.MT_Protector));
        }
        throw new C13464(C1364.m5010(c13778M29289, R.string.MT_Protector));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C21576.m49069(new RunnableC25306(1, this), 1000L);
        this.f26800.dismiss();
        C11650.m29324();
        this.f26801.finish();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f26799.setEnabled(true);
        this.f26801.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
