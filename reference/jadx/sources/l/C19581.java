package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ᩴۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19581 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16597 f63145;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Intent f63146;

    public C19581(ActivityC16597 activityC16597) {
        this.f63145 = activityC16597;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8199(this.f63145, 100);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ActivityC16597 activityC16597 = this.f63145;
        C15425 c15425 = new C15425(activityC16597.f53682.m49865());
        activityC16597.f53686.m4752(c15425);
        AbstractC22044 abstractC22044M49877 = C6382.f21565.m49877();
        abstractC22044M49877.m49849(c15425.m36954());
        Intent intent = new Intent(activityC16597, (Class<?>) ActivityC23311.class);
        this.f63146 = intent;
        intent.putExtra("title", activityC16597.f53683);
        this.f63146.setData(abstractC22044M49877.m49836());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f63145.startActivity(this.f63146);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f63145.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
