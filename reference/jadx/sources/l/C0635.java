package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֡ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XIRO */
/* JADX INFO: loaded from: classes3.dex */
public final class C0635 extends AbstractC11821 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f2484 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f2483 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m2801() {
        return this.f2483;
    }

    @Override // l.AbstractC11821
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2799(C2551 c2551, InterfaceC23435 interfaceC23435, InterfaceC18213 interfaceC18213) {
        C1381 c1381 = new C1381(interfaceC18213, interfaceC23435);
        if (interfaceC18213 instanceof C6831) {
            AbstractC21976 type = ((C6831) interfaceC18213).getType();
            if (type instanceof C8322) {
                C8322 c8322 = (C8322) type;
                m2800(c8322.m22420(), c1381);
                m2800(c8322.m22419(), c1381);
            }
        }
        int size = interfaceC23435.mo1986().size();
        for (int i = 0; i < size; i++) {
            m2800((C18959) interfaceC23435.mo1986().get(i), c1381);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2800(C18959 c18959, C1381 c1381) {
        if (c18959 == null) {
            return;
        }
        C6041 c6041M44027 = c18959.m44027();
        LinkedHashMap linkedHashMap = this.f2483;
        if (c6041M44027 != null && !c6041M44027.mo17865(EnumC1763.DONT_GENERATE)) {
            ((C9583) C11392.computeIfAbsent(linkedHashMap, c6041M44027.m17530(), new C18534())).m25023().add(c1381);
        }
        ArrayList<C6041> arrayList = this.f2484;
        arrayList.clear();
        c18959.mo14760((Collection) arrayList);
        for (C6041 c6041 : arrayList) {
            if (!c6041.mo17865(EnumC1763.DONT_GENERATE)) {
                ((C9583) C11392.computeIfAbsent(linkedHashMap, c6041.m17530(), new C18534())).m25025().add(c1381);
            }
        }
    }
}
