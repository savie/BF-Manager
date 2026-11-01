package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1625 implements InterfaceC8825 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TreeMap f6523;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0357 f6524;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6525;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f6526;

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set mo5501() {
        Object[] objArr = {C3843.class, C0214.class, C19971.class};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        return C0561.unmodifiableSet(hashSet);
    }

    public C1625(String str, InterfaceC0357 interfaceC0357, TreeMap treeMap, StringBuilder sb) {
        this.f6525 = str;
        this.f6524 = interfaceC0357;
        this.f6523 = treeMap;
        this.f6526 = sb;
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5500(AbstractC19367 abstractC19367) {
        String string;
        StringBuilder sb;
        TreeMap treeMap;
        boolean z = abstractC19367 instanceof C0214;
        int i = 0;
        InterfaceC0357 interfaceC0357 = this.f6524;
        if (z || (abstractC19367 instanceof C19971)) {
            boolean z2 = !z || ((C0214) abstractC19367).f1390;
            if (z) {
                string = ((C0214) abstractC19367).f1391;
            } else {
                string = ((C19971) abstractC19367).f63936.toString();
            }
            String str = z ? "span" : "div";
            HashMap map = new HashMap();
            map.put(this.f6525, z2 ? "math" : "inline-math");
            interfaceC0357.mo2067().m34874(str, interfaceC0357.mo2066(abstractC19367, str, map), false);
            interfaceC0357.mo2067().m34871(string);
            interfaceC0357.mo2067().m34875("/".concat(str));
            return;
        }
        interfaceC0357.mo2067().m34872();
        String strM11169 = ((C3843) abstractC19367).m11169();
        List listM44394 = abstractC19367.m44394();
        int length = 0;
        while (true) {
            int size = listM44394.size();
            sb = this.f6526;
            treeMap = this.f6523;
            if (i >= size || length >= strM11169.length()) {
                break;
            }
            treeMap.put(Integer.valueOf(sb.length() + length), Integer.valueOf(((C0316) listM44394.get(i)).m1948()));
            int iIndexOf = strM11169.indexOf(10, length);
            length = iIndexOf < 0 ? strM11169.length() : iIndexOf + 1;
            i++;
        }
        interfaceC0357.mo2067().m34876(strM11169);
        treeMap.put(Integer.valueOf(sb.length()), -1);
        interfaceC0357.mo2067().m34872();
    }
}
