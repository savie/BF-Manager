package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֨ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C0930 extends AbstractC19315 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f3728;

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22843[] mo3681() {
        return new InterfaceC22843[]{EnumC7094.STUCK};
    }

    @Override // l.AbstractC6614
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection mo3679(InterfaceC22843 interfaceC22843) {
        if (interfaceC22843 == EnumC7094.STUCK) {
            return this.f3728;
        }
        throw new IllegalStateException();
    }

    @Override // l.AbstractC19315
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Iterable mo3680() {
        return this.f3728;
    }
}
