package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8735 extends AbstractC6160 {
    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        if (c0309.mo12731()) {
            return Boolean.FALSE;
        }
        if (!c0309.mo1942()) {
            return Boolean.TRUE;
        }
        Iterator it = c0309.mo1943().iterator();
        while (it.hasNext()) {
            if (!((AbstractC16579) it.next()).mo2037()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6580(C8777 c8777, Object obj) {
        return (Boolean) c8777.f30194.mo1928(this, (Object) null);
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1769(C22929 c22929, Object obj) {
        return Boolean.FALSE;
    }
}
