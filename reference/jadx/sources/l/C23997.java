package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9QZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23997 implements InterfaceC12062 {
    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩷ */
    public final Map mo17603(Object obj) {
        return (C3113) obj;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ */
    public final void mo17599(Object obj) {
        ((C12808) obj).getClass();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩸ */
    public final Map mo17604(Object obj) {
        return (C3113) obj;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo17601(Object obj) {
        return !((C3113) obj).m10191();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo17602(Object obj) {
        ((C3113) obj).m10193();
        return obj;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۤ */
    public final Object mo17600(Object obj) {
        return C3113.m10184().m10192();
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ */
    public final Object mo17597(Object obj, Object obj2) {
        C3113 c3113M10192 = (C3113) obj;
        C3113 c3113 = (C3113) obj2;
        if (!c3113.isEmpty()) {
            if (!c3113M10192.m10191()) {
                c3113M10192 = c3113M10192.m10192();
            }
            c3113M10192.m10190(c3113);
        }
        return c3113M10192;
    }

    @Override // l.InterfaceC12062
    /* JADX INFO: renamed from: ۙ */
    public final void mo17598(int i, Object obj, Object obj2) {
        C3113 c3113 = (C3113) obj;
        C12808 c12808 = (C12808) obj2;
        if (c3113.isEmpty()) {
            return;
        }
        Iterator it = c3113.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            c12808.getClass();
            AbstractC14846.m35765(i);
            throw null;
        }
    }
}
