package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5372 extends AbstractC15647 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18564;

    public C5372(C23718 c23718) {
        int iM52225 = c23718.m52225();
        this.f18564 = new ArrayList(iM52225);
        for (int i = 0; i < iM52225; i++) {
            this.f18564.add(new C22306(c23718.m52225(), c23718.m52225()));
        }
    }

    @Override // l.InterfaceC18427
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo14889() {
        return this.f18564.size();
    }

    @Override // l.InterfaceC18427
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7844 mo14890(int i) {
        return (InterfaceC7844) this.f18564.get(i);
    }
}
