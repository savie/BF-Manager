package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֨ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBCG */
/* JADX INFO: loaded from: classes3.dex */
public final class C0919 extends AbstractC13354 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f3428;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f3429;

    public C0919(C10918 c10918) {
        super("class_defs", c10918, 4);
        this.f3429 = new TreeMap();
        this.f3428 = null;
    }

    @Override // l.AbstractC8681
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection mo3721() {
        ArrayList arrayList = this.f3428;
        return arrayList != null ? arrayList : this.f3429.values();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3719(C15000 c15000) {
        m23365();
        int size = this.f3429.size();
        int iM23364 = size == 0 ? 0 : m23364();
        if (c15000.m36116()) {
            c15000.m36111(4, "class_defs_size: ".concat(C5306.m15938(size)));
            c15000.m36111(4, "class_defs_off:  ".concat(C5306.m15938(iM23364)));
        }
        c15000.m36124(size);
        c15000.m36124(iM23364);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3718(C9867 c9867) {
        try {
            C5085 c5085M3933 = c9867.m25683().m3933();
            m23363();
            TreeMap treeMap = this.f3429;
            if (treeMap.get(c5085M3933) != null) {
                throw new IllegalArgumentException("already added: " + c5085M3933);
            }
            treeMap.put(c5085M3933, c9867);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }

    @Override // l.AbstractC13354
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3720() {
        TreeMap treeMap = this.f3429;
        int size = treeMap.size();
        this.f3428 = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iM3717 = 0;
        while (it.hasNext()) {
            iM3717 = m3717(iM3717, size - iM3717, (C5085) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m3717(int i, int i2, C5085 c5085) {
        C9867 c9867 = (C9867) this.f3429.get(c5085);
        if (c9867 == null || c9867.m38320()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + c5085);
        }
        int i3 = i2 - 1;
        C1028 c1028M25675 = c9867.m25675();
        if (c1028M25675 != null) {
            i = m3717(i, i3, c1028M25675.m3933());
        }
        InterfaceC11050 interfaceC11050M25684 = c9867.m25684();
        int size = interfaceC11050M25684.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = m3717(i, i3, interfaceC11050M25684.getType(i4));
        }
        c9867.m38319(i);
        this.f3428.add(c9867);
        return i + 1;
    }
}
