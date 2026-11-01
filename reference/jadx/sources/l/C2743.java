package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9QZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2743 implements InterfaceC14034 {
    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map mo8357(Object obj) {
        return (C3118) obj;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8354(Object obj) {
        ((C16525) obj).getClass();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map mo8351(Object obj) {
        return (C3118) obj;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo8358(Object obj) {
        return !((C3118) obj).m9390();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object mo8355(Object obj) {
        ((C3118) obj).m9392();
        return obj;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo8356(Object obj) {
        return C3118.m9383().m9391();
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo8352(Object obj, Object obj2) {
        C3118 c3118M9391 = (C3118) obj;
        C3118 c3118 = (C3118) obj2;
        if (!c3118.isEmpty()) {
            if (!c3118M9391.m9390()) {
                c3118M9391 = c3118M9391.m9391();
            }
            c3118M9391.m9389(c3118);
        }
        return c3118M9391;
    }

    @Override // l.InterfaceC14034
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8353(int i, Object obj, Object obj2) {
        C3118 c3118 = (C3118) obj;
        C16525 c16525 = (C16525) obj2;
        if (c3118.isEmpty()) {
            return;
        }
        Iterator it = c3118.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            c16525.getClass();
            AbstractC22044.m48973(i);
            throw null;
        }
    }
}
