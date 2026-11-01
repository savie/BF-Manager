package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2488 extends AbstractDialogInterfaceOnClickListenerC4973 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10957 f9889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488(ActivityC10957 activityC10957, ActivityC10957 activityC10958) {
        super(activityC10958);
        this.f9889 = activityC10957;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4973
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo7624() {
        String strTrim = m13800().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C15829.m37611(R.string.MT_Protector);
            } else {
                this.f9889.f37358.m26834(i);
                m13796();
            }
        } catch (NumberFormatException unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }
}
