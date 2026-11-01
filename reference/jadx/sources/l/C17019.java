package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܿ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBCG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17019 extends AbstractC5106 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f54374;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f54375;

    public C17019(C4669 c4669) {
        super("class_defs", c4669, 4);
        this.f54375 = new TreeMap();
        this.f54374 = null;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        ArrayList arrayList = this.f54374;
        return arrayList != null ? arrayList : this.f54375.values();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39787(C2718 c2718) {
        m52243();
        int size = this.f54375.size();
        int iM52248 = size == 0 ? 0 : m52248();
        if (c2718.m8288()) {
            c2718.m8283(4, "class_defs_size: ".concat(C22475.m49978(size)));
            c2718.m8283(4, "class_defs_off:  ".concat(C22475.m49978(iM52248)));
        }
        c2718.m8289(size);
        c2718.m8289(iM52248);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39786(C12081 c12081) {
        try {
            C3320 c3320M17128 = c12081.m30064().m17128();
            m52249();
            TreeMap treeMap = this.f54375;
            if (treeMap.get(c3320M17128) != null) {
                throw new IllegalArgumentException("already added: " + c3320M17128);
            }
            treeMap.put(c3320M17128, c12081);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        TreeMap treeMap = this.f54375;
        int size = treeMap.size();
        this.f54374 = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iM39785 = 0;
        while (it.hasNext()) {
            iM39785 = m39785(iM39785, size - iM39785, (C3320) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39785(int i, int i2, C3320 c3320) {
        C12081 c12081 = (C12081) this.f54375.get(c3320);
        if (c12081 == null || c12081.m36531()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c3320);
        }
        int i3 = i2 - 1;
        C6143 c6143M30065 = c12081.m30065();
        if (c6143M30065 != null) {
            i = m39785(i, i3, c6143M30065.m17128());
        }
        InterfaceC14093 interfaceC14093M30067 = c12081.m30067();
        int size = interfaceC14093M30067.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m39785(i, i3, interfaceC14093M30067.getType(i4));
        }
        c12081.m36533(i);
        this.f54374.add(c12081);
        return i + 1;
    }
}
