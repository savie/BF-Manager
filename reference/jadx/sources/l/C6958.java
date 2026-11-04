package l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7SD */
/* JADX INFO: loaded from: classes3.dex */
public class C6958 extends AbstractCallableC12178 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4747 f22980;

    @Override // l.AbstractCallableC12178, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        call();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractCallableC12178 m19258(C4747 c4747) {
        AbstractCallableC12178 abstractCallableC12178 = (AbstractCallableC12178) c4747.m14642(AbstractCallableC12178.class);
        if (abstractCallableC12178 != null) {
            return abstractCallableC12178;
        }
        C6958 c6958 = new C6958();
        c6958.f22980 = c4747;
        C13015.m32421(c4747);
        c6958.f22980.m14644(AbstractCallableC12178.class, c6958);
        return c6958;
    }

    @Override // l.AbstractCallableC12178, java.util.concurrent.Callable
    public Boolean call() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19259(Set set) {
        InterfaceC19554 interfaceC19554 = (InterfaceC19554) this.f22980.m14642(InterfaceC19554.class);
        if (interfaceC19554 != null) {
            Iterator it = interfaceC19554.m45120().iterator();
            if (it.hasNext()) {
                InterfaceC22538 interfaceC22538 = (InterfaceC22538) it.next();
                List list = C1170.stream(interfaceC22538.m50777().entrySet()).map(new C15364(3)).toList();
                try {
                    InterfaceC6213 interfaceC6213 = (InterfaceC6213) interfaceC22538.m50778();
                    interfaceC6213.init();
                    throw null;
                } catch (RuntimeException e) {
                    throw new C17490(e);
                }
            }
        }
        LinkedHashSet<C14769> linkedHashSet = new LinkedHashSet(set);
        ServiceLoader<InterfaceC6213> serviceLoaderM43642 = C18808.m43616(this.f22980).m43642();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (InterfaceC6213 interfaceC6214 : serviceLoaderM43642) {
            interfaceC6214.getClass();
            for (C14769 c14769 : linkedHashSet) {
                if ("doclint-not-available".equals(c14769.f48335)) {
                    linkedHashSet.remove(c14769);
                    linkedHashSet2.remove(interfaceC6214);
                    try {
                        C14769 c147610 = c14769.f48336;
                        interfaceC6214.init();
                        throw null;
                    } catch (RuntimeException e2) {
                        throw new C17490(e2);
                    }
                }
            }
        }
        for (C14769 c147611 : linkedHashSet) {
            C7312 c7312M20023 = C7312.m20023(this.f22980);
            String str = (String) c147611.f48335;
            C11040 c11040 = C22843.f74058;
            c7312M20023.m34525(new C11040("compiler", "plugin.not.found", str));
        }
        Iterator it2 = linkedHashSet2.iterator();
        if (it2.hasNext()) {
            try {
                ((InterfaceC6213) it2.next()).init();
                throw null;
            } catch (RuntimeException e3) {
                throw new C17490(e3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19260(C14769 c14769) {
        if (c14769.isEmpty()) {
            return;
        }
        try {
            AbstractC2483 abstractC2483M8339 = AbstractC2483.m8339();
            abstractC2483M8339.init();
            throw null;
        } catch (IllegalStateException unused) {
            C7312.m20023(this.f22980).m34529(C13146.f42059);
        }
    }
}
