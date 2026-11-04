package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16422 extends AbstractC18551 {
    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo26901() {
        return true;
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ۙ */
    public final void mo3178(C8614 c8614) {
        boolean zM18792 = C6728.m18792();
        ApplicationC17729.f58262.edit().putBoolean("show_hidden_file", !zM18792).apply();
        if (!zM18792) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
        C6331.m18054((String) null);
    }

    @Override // l.AbstractC18551
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo26900() {
        return C6728.m18792();
    }
}
