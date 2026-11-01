package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10658 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f36349;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f36350;

    public C10658(ActivityC13125 activityC13125, boolean z) {
        this.f36350 = activityC13125;
        this.f36349 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f36350, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C11018 c11018 = new C11018();
        ActivityC13125 activityC13125 = this.f36350;
        activityC13125.f43713.f5091.m50445();
        activityC13125.f43713.f5091.m50441(c11018, (C8516) null);
        AbstractC20745 abstractC20745 = activityC13125.f43713.f5087;
        abstractC20745.getClass();
        abstractC20745.m46698(new C15101(0, c11018));
        activityC13125.f43713.f5074 = false;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f36349) {
            this.f36350.finish();
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f36350.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
