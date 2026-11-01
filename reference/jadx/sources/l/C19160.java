package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 09JC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19160 extends AbstractC9988 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f61887;

    public C19160() {
        super(EnumC7165.SMB2_ENCRYPTION_CAPABILITIES);
        this.f61887 = new ArrayList();
    }

    public C19160(List list) {
        super(EnumC7165.SMB2_ENCRYPTION_CAPABILITIES);
        this.f61887 = list;
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ۖ */
    public final int mo20768(C19240 c19240) {
        List list = this.f61887;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("Cannot serialize an empty or null cipherList");
        }
        c19240.m27396(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c19240.m27396((int) ((EnumC19532) it.next()).getValue());
        }
        return (list.size() * 2) + 2;
    }

    @Override // l.AbstractC9988
    /* JADX INFO: renamed from: ܰ */
    public final void mo20770(C19240 c19240) throws C17271 {
        int iM27375 = c19240.m27375();
        for (int i = 0; i < iM27375; i++) {
            this.f61887.add((EnumC19532) C20799.m46783(c19240.m27375(), EnumC19532.class, null));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m43969() {
        return this.f61887;
    }
}
