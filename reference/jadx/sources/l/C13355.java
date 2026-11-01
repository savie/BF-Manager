package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13355 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f44274;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f44275;

    public C13355(ActivityC15472 activityC15472, boolean z) {
        this.f44275 = activityC15472;
        this.f44274 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10247(this.f44275, R.string.MT_Protector, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        ActivityC15472 activityC15472 = this.f44275;
        C6527 c6527 = new C6527(activityC15472.f50412.m46727());
        activityC15472.f50419.m23936(c6527);
        activityC15472.f50407.m46698(new C1359(0, c6527));
        activityC15472.f50414 = false;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
        boolean z = this.f44274;
        ActivityC15472 activityC15472 = this.f44275;
        if (z) {
            activityC15472.finish();
        } else {
            activityC15472.f50419.m23937(false);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f44275.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
