package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19074 extends AbstractC3697 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61765;

    public C19074(C16618 c16618) {
        int iM39316 = c16618.m39316();
        this.f61765 = new ArrayList(iM39316);
        for (int i = 0; i < iM39316; i++) {
            this.f61765.add(new C10123(c16618.m39316(), c16618.m39316()));
        }
    }

    @Override // l.InterfaceC22804
    /* JADX INFO: renamed from: ֫ */
    public final int mo40124() {
        return this.f61765.size();
    }

    @Override // l.InterfaceC22804
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC19820 mo40127(int i) {
        return (InterfaceC19820) this.f61765.get(i);
    }
}
