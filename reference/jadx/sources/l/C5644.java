package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5644 extends AbstractDialogInterfaceOnClickListenerC15220 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7135 f19507;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5644(ActivityC7135 activityC7135, ActivityC7135 activityC7136) {
        super(activityC7136);
        this.f19507 = activityC7135;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC15220
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo16630() {
        String strTrim = m36570().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C22673.m51152(R.string.MT_Protector);
            } else {
                this.f19507.f23582.m49721(i);
                m36564();
            }
        } catch (NumberFormatException unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
