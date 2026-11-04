package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۜۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7101 implements InterfaceC10718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1770 f23419;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f23421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TreeMap f23422;

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set mo19443() {
        Object[] objArr = {C19229.class, C18288.class, C21272.class};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        return C4681.unmodifiableSet(hashSet);
    }

    public C7101(String str, InterfaceC1770 interfaceC1770, TreeMap treeMap, StringBuilder sb) {
        this.f23420 = str;
        this.f23419 = interfaceC1770;
        this.f23422 = treeMap;
        this.f23421 = sb;
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19442(AbstractC4534 abstractC4534) {
        String string;
        StringBuilder sb;
        TreeMap treeMap;
        boolean z = abstractC4534 instanceof C18288;
        int i = 0;
        InterfaceC1770 interfaceC1770 = this.f23419;
        if (z || (abstractC4534 instanceof C21272)) {
            boolean z2 = !z || ((C18288) abstractC4534).f59637;
            if (z) {
                string = ((C18288) abstractC4534).f59636;
            } else {
                string = ((C21272) abstractC4534).f67834.toString();
            }
            String str = z ? "span" : "div";
            HashMap map = new HashMap();
            map.put(this.f23420, z2 ? "math" : "inline-math");
            interfaceC1770.mo6222().m10649(str, interfaceC1770.mo6221(abstractC4534, str, map), false);
            interfaceC1770.mo6222().m10652(string);
            interfaceC1770.mo6222().m10650("/".concat(str));
            return;
        }
        interfaceC1770.mo6222().m10647();
        String strM44559 = ((C19229) abstractC4534).m44559();
        List listM14263 = abstractC4534.m14263();
        int length = 0;
        while (true) {
            int size = listM14263.size();
            sb = this.f23421;
            treeMap = this.f23422;
            if (i >= size || length >= strM44559.length()) {
                break;
            }
            treeMap.put(Integer.valueOf(sb.length() + length), Integer.valueOf(((C5280) listM14263.get(i)).m15872()));
            int iIndexOf = strM44559.indexOf(10, length);
            length = iIndexOf < 0 ? strM44559.length() : iIndexOf + 1;
            i++;
        }
        interfaceC1770.mo6222().m10651(strM44559);
        treeMap.put(Integer.valueOf(sb.length()), -1);
        interfaceC1770.mo6222().m10647();
    }
}
