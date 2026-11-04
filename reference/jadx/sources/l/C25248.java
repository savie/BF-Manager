package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OITV */
/* JADX INFO: loaded from: classes.dex */
public final class C25248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f81572;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3618 f81573;

    public C25248(C2551 c2551, C3618 c3618) {
        this.f81572 = c2551;
        this.f81573 = c3618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56390() {
        C3618 c3618;
        C12050 c12050;
        C21943 c21943M52192;
        C2551 c2551 = this.f81572;
        if (c2551.m8560()) {
            return;
        }
        List listMo17861 = c2551.mo17861(C11457.f36027);
        Iterator it = listMo17861.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3618 = this.f81573;
            if (!zHasNext) {
                break;
            }
            C12971 c12971 = (C12971) it.next();
            ArrayList<C21943> arrayList = new ArrayList(c12971.m32376());
            HashSet<C21943> hashSet = new HashSet();
            for (C19684 c19684 : c12971.m32377()) {
                C21943 c21943M45368 = c19684.m45368();
                if (c21943M45368 != null) {
                    arrayList.add(c21943M45368);
                    hashSet.add(C23231.m52192(c21943M45368));
                } else {
                    c2551.m31133("No exception handler block: " + c19684);
                }
            }
            HashSet hashSet2 = new HashSet();
            for (C21943 c21943 : hashSet) {
                for (C21943 c21944 : arrayList) {
                    if (!c21944.mo17865(EnumC1763.REMOVE)) {
                        List listM49646 = c21943.m49646();
                        if (listM49646.isEmpty()) {
                            c2551.m31133("No successors for splitter: " + c21943);
                        } else {
                            C21943 c21945 = (C21943) listM49646.get(0);
                            C21943 c21943M52187 = C23231.m52187(c2551, c21945, c21944);
                            if (c21943M52187 != null && c21943M52187 != c21945 && c21943M52187 != c21944) {
                                hashSet2.add(c21943M52187);
                            }
                        }
                    }
                }
            }
            for (C19684 c19685 : c12971.m32377()) {
                C21943 c21943M45369 = c19685.m45368();
                if (c21943M45369 != null) {
                    C12567 c12567M11735 = c3618.m11735();
                    c12567M11735.m31275();
                    if (!c19685.m45376()) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            c12567M11735.m31277((C21943) it2.next());
                        }
                        c21943M52192 = c21943M45369;
                    } else {
                        c21943M52192 = C23231.m52192(c21943M45369);
                    }
                    if (!c21943M52192.mo17865(EnumC1763.REMOVE)) {
                        ArrayList<C21943> arrayList2 = new ArrayList();
                        C21943 c21943M52164 = C23231.m52164(c2551, c19685);
                        if (c21943M52164 != null) {
                            arrayList2.add(c21943M52164);
                        } else {
                            arrayList2.addAll(C23231.m52151(c2551, c21943M52192.m49638()));
                        }
                        boolean z = c2551.m8548(c21943M45369) != null;
                        for (C21943 c21946 : arrayList2) {
                            if (!z || C23231.m52193(c21943M45369, c21946)) {
                                if (C20531.m47080(c21946, (InterfaceC6281) c2551.m8515())) {
                                    c12567M11735.m31277(c21946);
                                }
                            }
                        }
                        c19685.m45360(c3618.m11737(c21943M45369));
                        C10733 c10733 = (C10733) c21943M45369.mo17862((InterfaceC2157) C11457.f36036);
                        if (c10733 == null) {
                            c2551.m31136("Missing exception handler attribute for start block: " + c21943M45369);
                        } else {
                            ((AbstractC16678) c19685.m45364()).mo17864(c10733);
                        }
                    }
                }
            }
        }
        HashSet hashSet3 = new HashSet();
        C20531.m47069(c2551.m8515(), hashSet3);
        HashSet<InterfaceC23435> hashSet4 = new HashSet();
        Iterator it3 = listMo17861.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C12971) it3.next()).m32377().iterator();
            while (it4.hasNext()) {
                InterfaceC18213 interfaceC18213M45364 = ((C19684) it4.next()).m45364();
                if (interfaceC18213M45364 != null) {
                    InterfaceC23435 interfaceC23435M47074 = C20531.m47074(interfaceC18213M45364);
                    if (interfaceC23435M47074 instanceof C21943) {
                        hashSet4.addAll(((C21943) interfaceC23435M47074).m49646());
                    }
                    C20531.m47069(interfaceC18213M45364, hashSet3);
                }
            }
        }
        hashSet4.removeAll(hashSet3);
        if (hashSet4.isEmpty()) {
            c12050 = null;
        } else {
            C12567 c12567M11736 = c3618.m11735();
            C12050 c12051 = new C12050(c2551.m8515());
            for (InterfaceC23435 interfaceC23435 : hashSet4) {
                if (interfaceC23435 instanceof C21943) {
                    c12567M11736.m31275();
                    c12567M11736.m31276(c12051);
                    c12051.m30228((InterfaceC6281) c3618.m11737((C21943) interfaceC23435));
                }
            }
            c12050 = c12051;
        }
        if (c12050 != null) {
            c2551.m8515().m30228((InterfaceC6281) c12050);
        }
    }
}
