package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4643 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16429;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10608 f16430;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16431;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4643(C10608 c10608, ActivityC0848 activityC0848, int i, int i2) {
        super(activityC0848, -1);
        this.f16430 = c10608;
        this.f16431 = i;
        this.f16429 = i2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        try {
            int i = Integer.parseInt(m22914());
            if (i < this.f16431 || i > this.f16429) {
                m22952(R.string.MT_Protector);
            } else if (this.f16430.f33681.m41043(i, true, true)) {
                m22951();
            } else {
                m22952(R.string.MT_Protector);
            }
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
