package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12780 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f40884;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
    }

    public C12780(ActivityC0848 activityC0848) {
        this.f40884 = activityC0848;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f40884, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC0848 activityC0848 = this.f40884;
        if (activityC0848.f3179 != null) {
            activityC0848.f3179.m46614();
        }
        activityC0848.f3178.m30724();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        Bundle bundle = new Bundle();
        ActivityC0848 activityC0848 = this.f40884;
        activityC0848.onSaveInstanceState(bundle);
        Intent intent = new Intent(activityC0848, (Class<?>) ActivityC0848.class);
        intent.putExtra("bundle", bundle);
        activityC0848.startActivity(intent);
        super/*android.app.Activity*/.finish();
        activityC0848.overridePendingTransition(0, 0);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f40884.m40401(exc, (DialogInterface.OnDismissListener) null);
    }
}
