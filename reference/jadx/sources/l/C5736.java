package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5736 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f19511;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23376 f19512;

    public C5736(ActivityC23376 activityC23376, boolean z) {
        this.f19512 = activityC23376;
        this.f19511 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC23376 activityC23376 = this.f19512;
        activityC23376.f75724.setVisibility(8);
        activityC23376.f75723.m16335(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f19512.f75726 = (List) C9030.stream(C9616.m24523(this.f19511)).filter(new C19665(4)).collect(C1890.toList());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC23376 activityC23376 = this.f19512;
        if (activityC23376.f75726.isEmpty()) {
            activityC23376.f75724.setText(R.string.MT_Protector);
        }
        activityC23376.f75727.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ActivityC23376 activityC23376 = this.f19512;
        activityC23376.f75724.setText(R.string.MT_Protector);
        activityC23376.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC23376 activityC23376 = this.f19512;
        activityC23376.f75723.m16335(false);
        if (activityC23376.f75726.isEmpty()) {
            activityC23376.f75724.setVisibility(0);
        }
    }
}
