package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩷ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes.dex */
public final class C21822 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f69562;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4842 f69563;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14119 f69564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f69565;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    public C21822(ActivityC22568 activityC22568, C4842 c4842, C14119 c14119) {
        this.f69562 = activityC22568;
        this.f69563 = c4842;
        this.f69564 = c14119;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C14119 c14119 = this.f69564;
        try {
            this.f69563.m14874(c14119, c14119.m34293());
            c14119.close();
        } catch (Throwable th) {
            if (c14119 != null) {
                try {
                    c14119.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC22568 activityC22568 = this.f69562;
        if (activityC22568.isDestroyed() || activityC22568.isFinishing()) {
            return;
        }
        activityC22568.f72948.m42179();
        activityC22568.m50863();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        boolean z = this.f69564.f44643;
        this.f69565 = !z;
        if (z || this.f69562.isDestroyed() || this.f69562.isFinishing()) {
            return;
        }
        this.f69562.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f69564.close();
        ActivityC22568 activityC22568 = this.f69562;
        if (activityC22568.f72925 == this) {
            activityC22568.f72925 = null;
        }
        if (this.f69565 || activityC22568.isDestroyed() || activityC22568.isFinishing()) {
            return;
        }
        activityC22568.f72948.post(activityC22568.f72951);
    }
}
