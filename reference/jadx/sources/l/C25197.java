package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6LO */
/* JADX INFO: loaded from: classes.dex */
public final class C25197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81433 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f81434 = new HashMap(32);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56173(InterfaceC10718 interfaceC10718) {
        this.f81433.add(interfaceC10718);
        Iterator it = interfaceC10718.mo19443().iterator();
        while (it.hasNext()) {
            C11392.putIfAbsent(this.f81434, (Class) it.next(), interfaceC10718);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m56174(AbstractC4534 abstractC4534) {
        InterfaceC10718 interfaceC10718 = (InterfaceC10718) this.f81434.get(abstractC4534.getClass());
        if (interfaceC10718 != null) {
            interfaceC10718.mo19442(abstractC4534);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56175(AbstractC4534 abstractC4534) {
        C4937.forEach(this.f81433, new C5535(abstractC4534));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56172(AbstractC4534 abstractC4534) {
        C4937.forEach(this.f81433, new C1806(abstractC4534));
    }
}
