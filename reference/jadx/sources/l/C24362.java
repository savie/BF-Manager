package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AJZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24362 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f79031;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24362(C4224 c4224, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, -1);
        this.f79031 = c4224;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            m22951();
            return;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (i < 0) {
                throw new NumberFormatException();
            }
            C4224 c4224 = this.f79031;
            c4224.m29658().edit().putInt(c4224.m12557(), i).apply();
            m22951();
        } catch (NumberFormatException unused) {
            m22952(R.string.MT_Protector);
        }
    }
}
