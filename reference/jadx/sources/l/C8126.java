package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8126 extends AbstractC3492 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f28448;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
    }

    public C8126(ActivityC5677 activityC5677) {
        this.f28448 = activityC5677;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f28448, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ActivityC5677 activityC5677 = this.f28448;
        if (activityC5677.f19365 != null) {
            activityC5677.f19365.m16572();
        }
        activityC5677.f19364.m17521();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        Bundle bundle = new Bundle();
        ActivityC5677 activityC5677 = this.f28448;
        activityC5677.onSaveInstanceState(bundle);
        Intent intent = new Intent(activityC5677, (Class<?>) ActivityC5677.class);
        intent.putExtra("bundle", bundle);
        activityC5677.startActivity(intent);
        super/*android.app.Activity*/.finish();
        activityC5677.overridePendingTransition(0, 0);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f28448.m31002(exc, (DialogInterface.OnDismissListener) null);
    }
}
