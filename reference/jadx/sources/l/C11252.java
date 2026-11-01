package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11252 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38047;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17601[] f38048;

    public C11252(C12063 c12063) {
        super(c12063);
        this.f38047 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11252 m28223(C12063 c12063) {
        ArrayList arrayList = new ArrayList(this.f38048.length);
        for (C17601 c17601 : this.f38048) {
            arrayList.add(c17601.m40923(c12063));
        }
        C17601[] c17601Arr = new C17601[arrayList.size()];
        arrayList.toArray(c17601Arr);
        C11252 c11252 = new C11252(c12063);
        c11252.f38047 = 0;
        c11252.f38048 = c17601Arr;
        return (C11252) c12063.f40357.m28060(c11252);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        this.f38048 = new C17601[c13825.m33642()];
        int i = 0;
        while (true) {
            C17601[] c17601Arr = this.f38048;
            if (i >= c17601Arr.length) {
                return;
            }
            c17601Arr[i] = (C17601) c6187.m17183(EnumC21004.TYPE_ANNOTATION_ITEM, c13825.m33642());
            i++;
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return (this.f38048.length * 4) + i + 4;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        Arrays.sort(this.f38048, new C6312());
        c4651.m12839(this.f38048.length);
        for (C17601 c17601 : this.f38048) {
            c4651.m12839(c17601.f30807);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return C9576.m24440(new StringBuilder("annotation_set_item @0x"), this.f30807);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C11252 c11252) {
        if (c11252 == null) {
            return 1;
        }
        int length = this.f38048.length - c11252.f38048.length;
        if (length == 0) {
            int i = 0;
            while (true) {
                C17601[] c17601Arr = this.f38048;
                if (i >= c17601Arr.length) {
                    break;
                }
                length = c17601Arr[i].compareTo(c11252.f38048[i]);
                if (length != 0) {
                    return length;
                }
                i++;
            }
        }
        return length;
    }

    public final int hashCode() {
        if (this.f38047 == 0) {
            this.f38047 = 0;
            for (C17601 c17601 : this.f38048) {
                this.f38047 = c17601.hashCode() + (this.f38047 * 31);
            }
        }
        return this.f38047;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11252.class.equals(obj.getClass()) && compareTo((C11252) obj) == 0;
    }
}
