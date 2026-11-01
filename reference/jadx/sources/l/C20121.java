package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20121 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3062 f65340;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f65341;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    public C20121(ActivityC5677 activityC5677, C4245 c4245) {
        this.f65341 = activityC5677;
        this.f65340 = c4245;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f65341.f19360.m21586(new C15888(this));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ActivityC5677 activityC5677 = this.f65341;
        if (activityC5677.f19378 || this.f65340.mo9170() == EnumC9414.DESTROYED) {
            return;
        }
        activityC5677.m31002(exc, (DialogInterface.OnDismissListener) null);
        C15829.m37619("编译器测试失败，请将该文件反馈给作者");
    }
}
