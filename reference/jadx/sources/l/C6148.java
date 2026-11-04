package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6148 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f20977;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3910 f20978;

    public C6148(ActivityC3910 activityC3910, boolean z) {
        this.f20978 = activityC3910;
        this.f20977 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC3910 activityC3910 = this.f20978;
        activityC3910.f13370.setVisibility(8);
        activityC3910.f13367.m10021(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f20978.f13366 = (List) C1170.stream(C0486.m2343(this.f20977)).filter(new C4725(1)).collect(C2025.toList());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC3910 activityC3910 = this.f20978;
        if (activityC3910.f13366.isEmpty()) {
            activityC3910.f13370.setText(R.string.MT_Protector);
        }
        activityC3910.f13368.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC3910 activityC3910 = this.f20978;
        activityC3910.f13370.setText(R.string.MT_Protector);
        activityC3910.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC3910 activityC3910 = this.f20978;
        activityC3910.f13367.m10021(false);
        if (activityC3910.f13366.isEmpty()) {
            activityC3910.f13370.setVisibility(0);
        }
    }
}
