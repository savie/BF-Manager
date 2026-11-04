package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19179 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f62033;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f62032 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f62034 = new LinkedHashMap();

    public C19179(C22185 c22185) {
        this.f62033 = c22185;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44444(C3517 c3517) {
        this.f62032.put(c3517.f12095, c3517);
        Iterator it = c3517.f12094.iterator();
        while (it.hasNext()) {
            this.f62034.put(C22185.m50185((InterfaceC24329) it.next()), c3517);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44449(C3517 c3517) {
        LinkedHashMap linkedHashMap = this.f62034;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == c3517) {
                it.remove();
            }
        }
        Iterator it2 = c3517.f12094.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(C22185.m50185((InterfaceC24329) it2.next()), c3517);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3517 m44442(String str) {
        return (C3517) this.f62032.get(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3517 m44448(InterfaceC24329 interfaceC24329) {
        while (interfaceC24329 != null) {
            C3517 c3517 = (C3517) this.f62034.get(interfaceC24329);
            if (c3517 != null) {
                return c3517;
            }
            interfaceC24329 = interfaceC24329.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44443() {
        this.f62032.clear();
        this.f62034.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m44446() {
        return this.f62032.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44445(InterfaceC24329 interfaceC24329) {
        return C22185.m50187(this.f62033, this.f62034.keySet(), interfaceC24329);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set m44450() {
        return C4681.unmodifiableSet((Set) C1170.stream(this.f62032.values()).collect(C2025.toSet()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set m44447() {
        return C4681.unmodifiableSet((Set) C1170.stream(this.f62032.entrySet()).filter(new C0534()).map(new C7992()).collect(C2025.toSet()));
    }
}
