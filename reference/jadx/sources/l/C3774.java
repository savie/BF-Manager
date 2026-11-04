package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: XAOV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3774 extends AbstractC13819 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8752 f12948;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11965 f12949;

    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "String.intern";
    }

    public C3774(C22420 c22420, InterfaceC23517 interfaceC23517) {
        super(c22420, interfaceC23517);
        this.f12949 = new C11965("Ljava/lang/String;", "intern", "Ljava/lang/String;", Collections.EMPTY_LIST);
        this.f12948 = new C8752(c22420);
        this.f43809 = EnumC10243.VIRTUAL;
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo12249(C22420 c22420) {
        return Collections.singletonList(this.f12949);
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo12248(C5122 c5122, C12328 c12328, C1295 c1295, int i) {
        int iM4700 = c1295.m4700();
        C8752 c8752 = this.f12948;
        if (c8752.m23448(c12328, i, iM4700)) {
            return c8752.m23446();
        }
        C17359.toString(c5122);
        return null;
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12250(C12328 c12328, C16057 c16057, C1295 c1295, C9497 c9497) {
        super.mo12250(c12328, c16057, c1295, c9497);
        this.f12948.m23447(c12328);
    }
}
