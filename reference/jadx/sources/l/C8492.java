package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8492 extends AbstractC1584 {
    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(C2832 c2832, Object obj) {
        return (Boolean) c2832.f9333.mo9324(this, (Object) null);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        if (c10510.mo18914()) {
            return Boolean.FALSE;
        }
        if (!c10510.mo9330()) {
            return Boolean.TRUE;
        }
        Iterator it = c10510.mo9323().iterator();
        while (it.hasNext()) {
            if (!((AbstractC22664) it.next()).mo27319()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1771(C17969 c17969, Object obj) {
        return Boolean.FALSE;
    }
}
