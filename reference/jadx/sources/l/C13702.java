package l;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F6M7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13702 implements InterfaceC8825 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0357 f45191;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14470 f45192;

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ܰ */
    public final Set mo5501() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{C9778.class}[0];
        C13638.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C0561.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
    }

    public C13702(InterfaceC0357 interfaceC0357) {
        this.f45191 = interfaceC0357;
        this.f45192 = interfaceC0357.mo2067();
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ۙ */
    public final void mo5500(AbstractC19367 abstractC19367) {
        if (abstractC19367 instanceof C9778) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", "checkbox");
            linkedHashMap.put("disabled", "");
            if (((C9778) abstractC19367).m24886()) {
                linkedHashMap.put("checked", "");
            }
            InterfaceC0357 interfaceC0357 = this.f45191;
            LinkedHashMap linkedHashMapMo2066 = interfaceC0357.mo2066(abstractC19367, "input", linkedHashMap);
            C14470 c14470 = this.f45192;
            c14470.m34874("input", linkedHashMapMo2066, false);
            c14470.m34871(" ");
            AbstractC19367 abstractC19367M44383 = abstractC19367.m44383();
            while (abstractC19367M44383 != null) {
                AbstractC19367 abstractC19367M44390 = abstractC19367M44383.m44390();
                interfaceC0357.mo2068(abstractC19367M44383);
                abstractC19367M44383 = abstractC19367M44390;
            }
        }
    }
}
