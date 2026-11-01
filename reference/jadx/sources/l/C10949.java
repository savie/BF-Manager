package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۧۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10949 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11613 f37233;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f37234;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f37235;

    public C10949(ActivityC5677 activityC5677, AbstractC20745 abstractC20745, C11613 c11613) {
        this.f37235 = activityC5677;
        this.f37234 = abstractC20745;
        this.f37233 = c11613;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f37235);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C8142 {
        ActivityC5677 activityC5677 = this.f37235;
        C6112.m17078(this.f37234, activityC5677.f19380.m33318());
        activityC5677.f19383 = true;
        activityC5677.m15619(false);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int iIndexOf;
        ActivityC5677 activityC5677 = this.f37235;
        AbstractC8894 abstractC8894M43943 = activityC5677.m43943();
        if (abstractC8894M43943.m23115() || (iIndexOf = activityC5677.f19367.indexOf(this.f37233)) == -1) {
            return;
        }
        C16324 c16324 = new C16324();
        AbstractC22611 abstractC22611 = (AbstractC22611) activityC5677.f19367.set(iIndexOf, c16324);
        AbstractC11447 abstractC11447M23118 = abstractC8894M43943.m23118();
        abstractC11447M23118.m28561(0, 0);
        abstractC11447M23118.mo8559(abstractC22611);
        abstractC11447M23118.m28566(c16324, "000000-0000-0000-0000-000000000001");
        abstractC11447M23118.mo8558();
        activityC5677.f19372.remove("000000-0000-0000-0000-000000000002");
        if (activityC5677.f19363 != null) {
            activityC5677.f19363.notifyItemChanged(iIndexOf);
        }
        C13626 c13626M15676 = activityC5677.m15676();
        abstractC22611.m50132(c13626M15676).m33323();
        C23464.m51710(abstractC22611.m50130(c13626M15676).m33318()).m30022((InterfaceC15954) new C6009());
        abstractC22611.m50124(c13626M15676).m33323();
        activityC5677.m15610();
        ActivityC5677.m15574(activityC5677);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f37235.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f37235.f19382 = false;
        m10251();
    }
}
