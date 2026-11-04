package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23223 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8585 f75231;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f75232;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
    }

    public C23223(ActivityC0848 activityC0848, C20168 c20168) {
        this.f75232 = activityC0848;
        this.f75231 = c20168;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f75232.f3181.m29979(new C15763(this));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC0848 activityC0848 = this.f75232;
        if (activityC0848.f3193 || this.f75231.mo23076() == EnumC2619.DESTROYED) {
            return;
        }
        activityC0848.m40401(exc, (DialogInterface.OnDismissListener) null);
        C22673.m51160("编译器测试失败，请将该文件反馈给作者");
    }
}
