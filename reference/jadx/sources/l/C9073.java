package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9073 implements InterfaceC8825 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0357 f30936;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14470 f30937;

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ܰ */
    public final Set mo5501() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C18244.class}[0];
        C13638.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C0561.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
    }

    public C9073(InterfaceC0357 interfaceC0357) {
        this.f30936 = interfaceC0357;
        this.f30937 = interfaceC0357.mo2067();
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ۙ */
    public final void mo5500(AbstractC19367 abstractC19367) {
        Map map = Collections.EMPTY_MAP;
        InterfaceC0357 interfaceC0357 = this.f30936;
        LinkedHashMap linkedHashMapMo2066 = interfaceC0357.mo2066(abstractC19367, "del", map);
        C14470 c14470 = this.f30937;
        c14470.m34874("del", linkedHashMapMo2066, false);
        AbstractC19367 abstractC19367M44383 = abstractC19367.m44383();
        while (abstractC19367M44383 != null) {
            AbstractC19367 abstractC19367M44390 = abstractC19367M44383.m44390();
            interfaceC0357.mo2068(abstractC19367M44383);
            abstractC19367M44383 = abstractC19367M44390;
        }
        c14470.m34875("/del");
    }
}
