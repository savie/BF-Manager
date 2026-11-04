package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LX */
/* JADX INFO: loaded from: classes.dex */
public final class C22849 implements InterfaceC10718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1770 f74230;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3261 f74231;

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo19443() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C13592.class}[0];
        C17359.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C4681.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
    }

    public C22849(InterfaceC1770 interfaceC1770) {
        this.f74230 = interfaceC1770;
        this.f74231 = interfaceC1770.mo6222();
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ۙ */
    public final void mo19442(AbstractC4534 abstractC4534) {
        Map map = Collections.EMPTY_MAP;
        InterfaceC1770 interfaceC1770 = this.f74230;
        LinkedHashMap linkedHashMapMo6221 = interfaceC1770.mo6221(abstractC4534, "del", map);
        C3261 c3261 = this.f74231;
        c3261.m10649("del", linkedHashMapMo6221, false);
        AbstractC4534 abstractC4534M14254 = abstractC4534.m14254();
        while (abstractC4534M14254 != null) {
            AbstractC4534 abstractC4534M14261 = abstractC4534M14254.m14261();
            interfaceC1770.mo6223(abstractC4534M14254);
            abstractC4534M14254 = abstractC4534M14261;
        }
        c3261.m10650("/del");
    }
}
