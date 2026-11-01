package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C7180 extends AbstractC22702 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f23978 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6432 f23979;

    public C7180(InterfaceC6432 interfaceC6432, ArrayList arrayList) throws C12731 {
        this.f23979 = interfaceC6432;
        HashSet hashSet = new HashSet();
        for (InterfaceC17721 c8592 : interfaceC6432.mo17615()) {
            ArrayList arrayList2 = new ArrayList();
            if (hashSet.add(Integer.valueOf(c8592.mo19106()))) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C17763 c17763 = (C17763) it.next();
                    if (c17763.m41330() && (c17763.f56352 >>> 24) == c8592.mo19106()) {
                        arrayList2.add(c17763);
                    }
                }
            }
            ArrayList arrayList3 = this.f23978;
            if (!arrayList2.isEmpty()) {
                c8592 = new C8592(this, c8592, arrayList2);
            }
            arrayList3.add(c8592);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C17763 c17764 = (C17763) it2.next();
            if (c17764.m41330() && !hashSet.contains(Integer.valueOf(c17764.f56352 >>> 24))) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch package is missing.");
            }
        }
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֨ܰ */
    public final InterfaceC5727 mo5139() {
        return this.f23979.mo5139();
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۡ */
    public final int mo5141() {
        return this.f23978.size();
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC17721 mo5140(int i) {
        return (InterfaceC17721) this.f23978.get(i);
    }

    @Override // l.AbstractC22702, l.InterfaceC6432
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo17615() {
        return this.f23978;
    }
}
