package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11353 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f35757;

    public C11353(ActivityC23288 activityC23288) {
        this.f35757 = activityC23288;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f35757);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f35757.f75446.f51488.m35985(new C21246(), ActivityC18143.m42278());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC23288 activityC23288 = this.f35757;
        activityC23288.f75446.f51483 = activityC23288.f75446.f51488.m35993();
        if (activityC23288.f75446.f51483 == null) {
            activityC23288.f75446.f51483 = "Error";
            String strM35990 = activityC23288.f75446.f51488.m35990();
            if (!strM35990.contains(activityC23288.getString(R.string.MT_Protector)) && !strM35990.contains(activityC23288.getString(R.string.MT_Protector))) {
                C22673.m51154((CharSequence) strM35990);
                return;
            } else {
                activityC23288.m40400(strM35990, false);
                return;
            }
        }
        ActivityC4300.m13685(activityC23288, activityC23288.f75446.f51483, activityC23288.f75446.f51484, null, null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f35757.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
