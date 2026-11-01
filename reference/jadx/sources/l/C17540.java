package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C17540 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55746;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13308 f55747;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17540(AbstractActivityC12483 abstractActivityC12483, C13308 c13308, int i) {
        super(abstractActivityC12483, -1);
        this.f55747 = c13308;
        this.f55746 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (strM40352.isEmpty() || strM40352.equals(this.f55747.m32807())) {
            m40364();
        } else if (C23186.m51200(strM40352)) {
            m40365(R.string.MT_Protector);
        } else {
            C23186.m51180(this.f55746, strM40352);
            m40364();
        }
    }
}
