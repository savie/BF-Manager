package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5209 extends AbstractC20105 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18375 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 f18376;

    public C5209(InterfaceC7206 interfaceC7206, ArrayList arrayList) throws C10186 {
        this.f18376 = interfaceC7206;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            boolean zM4578 = c1260.m4578();
            int i = c1260.f4547;
            if (zM4578 || c1260.m4580()) {
                int i2 = (i >>> 16) & 255;
                InterfaceC10869 interfaceC10869 = null;
                InterfaceC10869 interfaceC108610 = null;
                for (InterfaceC10869 interfaceC108611 : interfaceC7206.mo15672()) {
                    if (interfaceC108611.mo27607() == (i >>> 24)) {
                        interfaceC108610 = interfaceC108610 == null ? interfaceC108611 : interfaceC108610;
                        Iterator it2 = interfaceC108611.mo19822().iterator();
                        while (it2.hasNext()) {
                            if (((InterfaceC15344) it2.next()).mo35833() == i2) {
                                if (interfaceC10869 != null) {
                                    throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch type identity is ambiguous.");
                                }
                                interfaceC10869 = interfaceC108611;
                            }
                        }
                    }
                }
                interfaceC10869 = interfaceC10869 == null ? interfaceC108610 : interfaceC10869;
                if (interfaceC10869 == null) {
                    throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch package is missing.");
                }
                ArrayList arrayList2 = (ArrayList) map.get(interfaceC10869);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(interfaceC10869, arrayList2);
                }
                arrayList2.add(c1260);
            }
        }
        for (InterfaceC10869 c7226 : interfaceC7206.mo15672()) {
            ArrayList arrayList3 = (ArrayList) map.get(c7226);
            ArrayList arrayList4 = this.f18375;
            if (arrayList3 != null) {
                c7226 = new C7226(this, c7226, arrayList3);
            }
            arrayList4.add(c7226);
        }
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC3412 mo15675() {
        return this.f18376.mo15675();
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo15674() {
        return this.f18375.size();
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10869 mo15673(int i) {
        return (InterfaceC10869) this.f18375.get(i);
    }

    @Override // l.AbstractC20105, l.InterfaceC7206
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Iterable mo15672() {
        return this.f18375;
    }
}
