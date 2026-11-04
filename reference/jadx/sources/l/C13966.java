package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09JC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13966 extends AbstractC22194 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f44292;

    public C13966() {
        super(EnumC11005.SMB2_ENCRYPTION_CAPABILITIES);
        this.f44292 = new ArrayList();
    }

    public C13966(List list) {
        super(EnumC11005.SMB2_ENCRYPTION_CAPABILITIES);
        this.f44292 = list;
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩸ */
    public final int mo19897(C7453 c7453) {
        List list = this.f44292;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("Cannot serialize an empty or null cipherList");
        }
        c7453.m56023(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c7453.m56023((int) ((EnumC14208) it.next()).getValue());
        }
        return (list.size() * 2) + 2;
    }

    @Override // l.AbstractC22194
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19896(C7453 c7453) throws C2013 {
        int iM56017 = c7453.m56017();
        for (int i = 0; i < iM56017; i++) {
            this.f44292.add((EnumC14208) C10961.m27793(c7453.m56017(), EnumC14208.class, null));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m34039() {
        return this.f44292;
    }
}
