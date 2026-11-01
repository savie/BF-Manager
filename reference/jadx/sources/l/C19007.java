package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19007 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f61516;

    public C19007(ActivityC7718 activityC7718) {
        this.f61516 = activityC7718;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f61516);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f61516.f25533.f36085.m47108(new C6037(), ActivityC11632.m29003());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC7718 activityC7718 = this.f61516;
        activityC7718.f25533.f36083 = activityC7718.f25533.f36085.m47113();
        if (activityC7718.f25533.f36083 == null) {
            activityC7718.f25533.f36083 = "Error";
            String strM47114 = activityC7718.f25533.f36085.m47114();
            if (!strM47114.contains(activityC7718.getString(R.string.MT_Protector)) && !strM47114.contains(activityC7718.getString(R.string.MT_Protector))) {
                C15829.m37613((CharSequence) strM47114);
                return;
            } else {
                activityC7718.m31000(strM47114, false);
                return;
            }
        }
        ActivityC21135.m47562(activityC7718, activityC7718.f25533.f36083, activityC7718.f25533.f36082, null, null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f61516.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
