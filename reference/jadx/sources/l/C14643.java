package l;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14643 implements InterfaceC10718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1770 f47911;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3261 f47912;

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo19443() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C6441.class}[0];
        C17359.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C4681.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
    }

    public C14643(InterfaceC1770 interfaceC1770) {
        this.f47911 = interfaceC1770;
        this.f47912 = interfaceC1770.mo6222();
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ۙ */
    public final void mo19442(AbstractC4534 abstractC4534) {
        if (abstractC4534 instanceof C6441) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", "checkbox");
            linkedHashMap.put("disabled", "");
            if (((C6441) abstractC4534).m18219()) {
                linkedHashMap.put("checked", "");
            }
            InterfaceC1770 interfaceC1770 = this.f47911;
            LinkedHashMap linkedHashMapMo6221 = interfaceC1770.mo6221(abstractC4534, "input", linkedHashMap);
            C3261 c3261 = this.f47912;
            c3261.m10649("input", linkedHashMapMo6221, false);
            c3261.m10652(" ");
            AbstractC4534 abstractC4534M14254 = abstractC4534.m14254();
            while (abstractC4534M14254 != null) {
                AbstractC4534 abstractC4534M14261 = abstractC4534M14254.m14261();
                interfaceC1770.mo6223(abstractC4534M14254);
                abstractC4534M14254 = abstractC4534M14261;
            }
        }
    }
}
