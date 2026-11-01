package l;

import bin.mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2521 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1110 f10005;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2521(C1110 c1110, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, -1);
        this.f10005 = c1110;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        C1110 c1110 = this.f10005;
        try {
            int iM4127 = C1110.m4127(m40352());
            c1110.m13140((Serializable) Integer.valueOf(iM4127));
            c1110.m42292().edit().putInt(c1110.m13157(), iM4127).apply();
            c1110.m4128(iM4127);
            m40364();
        } catch (ArithmeticException | IllegalArgumentException unused) {
            m40365(R.string.MT_Protector);
        }
    }
}
