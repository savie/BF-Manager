package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12286 extends AbstractC1100 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f39493;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f39494 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashSet f39495 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C24352 f39496;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        if (this.f39496 == null) {
            this.f39496 = new C24352(this.f39493.f79947.f48321);
        }
        return this.f39496;
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        C24705 c24705 = this.f39493;
        HashMap map = this.f39494;
        AbstractC22970 abstractC22970 = c10510.f73596;
        HashSet hashSet = this.f39495;
        if (!hashSet.add(abstractC22970)) {
            return new C24352(c10510.f73596);
        }
        try {
            hashSet.add(c10510.f73596);
            C24550 c24550 = (C24550) c10510.f73596;
            C24352 c24352 = (C24352) map.get(c24550);
            if (c24352 == null) {
                c24352 = new C24352(c24550);
                Iterator it = c24705.m55144(c10510).iterator();
                while (it.hasNext()) {
                    c24352.m54393((AbstractC16344) ((AbstractC22664) it.next()).mo9324(this, (Object) null));
                }
                c24352.m54393((AbstractC16344) c24705.m55137(c10510).mo9324(this, (Object) null));
                c24550.mo29590();
                c24352.m54393(c24550.f79576);
                map.put(c24550, c24352);
            }
            return c24352;
        } finally {
            hashSet.remove(c10510.f73596);
        }
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        return (C24352) c17969.mo19992().mo9324(this, (Object) null);
    }

    public C12286(C24705 c24705) {
        this.f39493 = c24705;
    }
}
