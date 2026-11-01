package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۚ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5593 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f19200;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Intent f19201;

    public C5593(ActivityC15472 activityC15472) {
        this.f19200 = activityC15472;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f19200, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC15472 activityC15472 = this.f19200;
        C6527 c6527 = new C6527(activityC15472.f50412.m46727());
        activityC15472.f50419.m23936(c6527);
        AbstractC20745 abstractC20745M46728 = C11904.f39939.m46728();
        abstractC20745M46728.m46703(c6527.m17739());
        Intent intent = new Intent(activityC15472, (Class<?>) ActivityC18293.class);
        this.f19201 = intent;
        intent.putExtra("title", activityC15472.f50413);
        this.f19201.setData(abstractC20745M46728.m46732());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f19200.startActivity(this.f19201);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f19200.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
