package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5FO */
/* JADX INFO: loaded from: classes.dex */
public final class C23952 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f77675;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11252[] f77676;

    public C23952(C12063 c12063) {
        super(c12063);
        this.f77675 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23952 m52783(C12063 c12063) {
        ArrayList arrayList = new ArrayList(this.f77676.length);
        for (C11252 c11252 : this.f77676) {
            if (c11252 != null) {
                arrayList.add(c11252.m28223(c12063));
            }
        }
        C11252[] c11252Arr = new C11252[arrayList.size()];
        arrayList.toArray(c11252Arr);
        C23952 c23952 = new C23952(c12063);
        c23952.f77675 = 0;
        c23952.f77676 = c11252Arr;
        return (C23952) c12063.f40360.m28060(c23952);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f77676 = new C11252[c13825.m33642()];
        int i = 0;
        while (true) {
            C11252[] c11252Arr = this.f77676;
            if (i >= c11252Arr.length) {
                return;
            }
            c11252Arr[i] = (C11252) c6187.m17187(EnumC21004.TYPE_ANNOTATION_SET_ITEM, c13825.m33642());
            i++;
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return (this.f77676.length * 4) + i + 4;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f77676.length);
        for (C11252 c11252 : this.f77676) {
            c4651.m12839(c11252.f30807);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return C9576.m24440(new StringBuilder("annotation_set_item @0x"), this.f30807);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23952 c23952) {
        int length = this.f77676.length - c23952.f77676.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            C11252[] c11252Arr = this.f77676;
            if (i >= c11252Arr.length) {
                return length;
            }
            length = c11252Arr[i].compareTo(c23952.f77676[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f77675 == 0) {
            this.f77675 = 0;
            for (C11252 c11252 : this.f77676) {
                this.f77675 = c11252.hashCode() + (this.f77675 * 31);
            }
        }
        return this.f77675;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C23952.class.equals(obj.getClass()) && compareTo((C23952) obj) == 0;
    }
}
