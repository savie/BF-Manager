package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3098 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9843 f11687;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3098(AbstractActivityC12483 abstractActivityC12483, C9843 c9843) {
        super(abstractActivityC12483, -1);
        this.f11687 = c9843;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (!strTrim.isEmpty()) {
            C9843 c9843 = this.f11687;
            String str = c9843.f33626;
            int i = c9843.f33625;
            if (!strTrim.equals(str)) {
                if (C4757.m13203(i, strTrim)) {
                    m40365(R.string.MT_Protector);
                    return;
                } else {
                    C4757.m13211(i, strTrim);
                    m40364();
                    return;
                }
            }
        }
        m40364();
    }
}
