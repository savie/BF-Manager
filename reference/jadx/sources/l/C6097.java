package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PU */
/* JADX INFO: loaded from: classes3.dex */
public class C6097 implements InterfaceC12062 {
    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map mo17603(Object obj) {
        return ((C23251) obj).m52271();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map mo17604(Object obj) {
        return ((C23251) obj).m52272();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo17601(Object obj) {
        return !((C23251) obj).m52270();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object mo17602(Object obj) {
        ((C23251) obj).m52269();
        return obj;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object mo17600(Object obj) {
        return C23251.m52268((C15045) obj);
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17599(Object obj) {
        ((C15045) obj).getClass();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo17597(Object obj, Object obj2) {
        C23251 c23251 = (C23251) obj;
        C23251 c23252 = (C23251) obj2;
        if (!c23251.m52270()) {
            c23251.m52274();
        }
        ((C17283) c23251.m52271()).putAll(C3113.m10189(c23252.m52272()));
        return c23251;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17598(int i, Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Map mapM52272 = ((C23251) obj).m52272();
        C15045 c15045 = (C15045) obj2;
        if (mapM52272.isEmpty()) {
            return;
        }
        Iterator it = mapM52272.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC14846.m35765(i);
            c15045.getClass();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
