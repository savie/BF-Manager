package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12049 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16987 f40321;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12049(C16987 c16987, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f40321 = c16987;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (!C14726.m35256(strTrim)) {
            m40365(R.string.MT_Protector);
            return;
        }
        C14726.m35258(strTrim);
        this.f40321.mo8453();
        m40364();
    }
}
