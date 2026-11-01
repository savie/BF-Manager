package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11805 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f39676;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5227 f39677;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashMap f39675 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashSet f39674 = new HashSet();

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        if (this.f39677 == null) {
            this.f39677 = new C5227(this.f39676.f76937.f14243);
        }
        return this.f39677;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        C23800 c23800 = this.f39676;
        HashMap map = this.f39675;
        AbstractC0618 abstractC0618 = c0309.f53222;
        HashSet hashSet = this.f39674;
        if (!hashSet.add(abstractC0618)) {
            return new C5227(c0309.f53222);
        }
        try {
            hashSet.add(c0309.f53222);
            C22492 c22492 = (C22492) c0309.f53222;
            C5227 c5227 = (C5227) map.get(c22492);
            if (c5227 == null) {
                c5227 = new C5227(c22492);
                Iterator it = c23800.m52439(c0309).iterator();
                while (it.hasNext()) {
                    c5227.m14413((AbstractC3110) ((AbstractC16579) it.next()).mo1928(this, (Object) null));
                }
                c5227.m14413((AbstractC3110) c23800.m52432(c0309).mo1928(this, (Object) null));
                c22492.mo49994();
                c5227.m14413(c22492.f73417);
                map.put(c22492, c5227);
            }
            return c5227;
        } finally {
            hashSet.remove(c0309.f53222);
        }
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        return (C5227) c22929.mo18112().mo1928(this, (Object) null);
    }

    public C11805(C23800 c23800) {
        this.f39676 = c23800;
    }
}
