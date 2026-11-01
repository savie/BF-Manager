package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PU */
/* JADX INFO: loaded from: classes4.dex */
public class C11917 implements InterfaceC14034 {
    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ܰ */
    public final Map mo8357(Object obj) {
        return ((C9470) obj).m24243();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۖ */
    public final Map mo8351(Object obj) {
        return ((C9470) obj).m24248();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo8358(Object obj) {
        return !((C9470) obj).m24247();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۚ */
    public final Object mo8355(Object obj) {
        ((C9470) obj).m24245();
        return obj;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۨ */
    public final Object mo8356(Object obj) {
        return C9470.m24241((C0296) obj);
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ */
    public final void mo8354(Object obj) {
        ((C0296) obj).getClass();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8352(Object obj, Object obj2) {
        C9470 c9470 = (C9470) obj;
        C9470 c9471 = (C9470) obj2;
        if (!c9470.m24247()) {
            c9470.m24244();
        }
        ((C14409) c9470.m24243()).putAll(C3118.m9388(c9471.m24248()));
        return c9470;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ */
    public final void mo8353(int i, Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Map mapM24248 = ((C9470) obj).m24248();
        C0296 c0296 = (C0296) obj2;
        if (mapM24248.isEmpty()) {
            return;
        }
        Iterator it = mapM24248.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC22044.m48973(i);
            c0296.getClass();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
