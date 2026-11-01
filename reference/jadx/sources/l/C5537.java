package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5537 extends AbstractC21765 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f18985;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7675 f18986;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 f18987;

    public C5537(C7675 c7675, C21825 c21825) {
        this(c7675, c21825, EnumSet.noneOf(EnumC22471.class));
    }

    public C5537(C7675 c7675, C21825 c21825, EnumSet enumSet) {
        this.f18986 = c7675;
        this.f18987 = c21825;
        this.f18985 = enumSet;
    }

    public final String toString() {
        C7675 c7675 = this.f18986;
        C21825 c21825 = this.f18987;
        if (c21825 == null) {
            return "Exports[" + c7675 + "]";
        }
        return "Exports[" + c7675 + ":" + c21825 + "]";
    }

    @Override // l.InterfaceC14044
    /* JADX INFO: renamed from: ۙ */
    public final void mo4647(InterfaceC2753 interfaceC2753) {
        interfaceC2753.mo8400(this);
    }
}
