package l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7SD */
/* JADX INFO: loaded from: classes5.dex */
public class C21143 extends AbstractCallableC22555 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12343 f68864;

    @Override // l.AbstractCallableC22555, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        call();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractCallableC22555 m47577(C12343 c12343) {
        AbstractCallableC22555 abstractCallableC22555 = (AbstractCallableC22555) c12343.m30655(AbstractCallableC22555.class);
        if (abstractCallableC22555 != null) {
            return abstractCallableC22555;
        }
        C21143 c21143 = new C21143();
        c21143.f68864 = c12343;
        C14770.m35395(c12343);
        c21143.f68864.m30657(AbstractCallableC22555.class, c21143);
        return c21143;
    }

    @Override // l.AbstractCallableC22555, java.util.concurrent.Callable
    public Boolean call() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47578(Set set) {
        InterfaceC23858 interfaceC23858 = (InterfaceC23858) this.f68864.m30655(InterfaceC23858.class);
        if (interfaceC23858 != null) {
            Iterator it = interfaceC23858.m52582().iterator();
            if (it.hasNext()) {
                InterfaceC11158 interfaceC11158 = (InterfaceC11158) it.next();
                List list = C9030.stream(interfaceC11158.m28094().entrySet()).map(new C7710(5)).toList();
                try {
                    InterfaceC1387 interfaceC1387 = (InterfaceC1387) interfaceC11158.m28095();
                    interfaceC1387.init();
                    throw null;
                } catch (RuntimeException e) {
                    throw new C11802(e);
                }
            }
        }
        LinkedHashSet<C21825> linkedHashSet = new LinkedHashSet(set);
        ServiceLoader<InterfaceC1387> serviceLoaderM26571 = C10474.m26540(this.f68864).m26571();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (InterfaceC1387 interfaceC1388 : serviceLoaderM26571) {
            interfaceC1388.getClass();
            for (C21825 c21825 : linkedHashSet) {
                if ("doclint-not-available".equals(c21825.f70876)) {
                    linkedHashSet.remove(c21825);
                    linkedHashSet2.remove(interfaceC1388);
                    try {
                        C21825 c21826 = c21825.f70877;
                        interfaceC1388.init();
                        throw null;
                    } catch (RuntimeException e2) {
                        throw new C11802(e2);
                    }
                }
            }
        }
        for (C21825 c21827 : linkedHashSet) {
            C20414 c20414M46161 = C20414.m46161(this.f68864);
            String str = (String) c21827.f70876;
            C5909 c5909 = C23879.f77204;
            c20414M46161.m48197(new C5909("compiler", "plugin.not.found", str));
        }
        Iterator it2 = linkedHashSet2.iterator();
        if (it2.hasNext()) {
            try {
                ((InterfaceC1387) it2.next()).init();
                throw null;
            } catch (RuntimeException e3) {
                throw new C11802(e3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47579(C21825 c21825) {
        if (c21825.isEmpty()) {
            return;
        }
        try {
            AbstractC10561 abstractC10561M26714 = AbstractC10561.m26714();
            abstractC10561M26714.init();
            throw null;
        } catch (IllegalStateException unused) {
            C20414.m46161(this.f68864).m48201(C9768.f32837);
        }
    }
}
