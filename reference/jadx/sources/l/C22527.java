package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes.dex */
public final class C22527 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73494;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15472 f73495;

    public C22527(ActivityC15472 activityC15472, boolean z) {
        this.f73495 = activityC15472;
        this.f73494 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10247(this.f73495, R.string.MT_Protector, 100);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        ActivityC15472 activityC15472 = this.f73495;
        C6527 c6527 = new C6527(activityC15472.f50412.m46727());
        activityC15472.f50419.m23936(c6527);
        AbstractC20745 abstractC20745 = activityC15472.f50407;
        byte[] bArrM17739 = c6527.m17739();
        abstractC20745.getClass();
        abstractC20745.m46698(new C21450(0, bArrM17739));
        activityC15472.f50414 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
        boolean z = this.f73494;
        ActivityC15472 activityC15472 = this.f73495;
        if (z) {
            activityC15472.finish();
        } else {
            activityC15472.f50419.m23937(false);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f73495.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
