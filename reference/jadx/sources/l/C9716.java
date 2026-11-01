package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9716 extends AbstractC9011 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1953[] f32710;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f32711;

    public C9716(C12063 c12063) {
        super(c12063);
        this.f32711 = 0;
    }

    public C9716(C12063 c12063, C1953[] c1953Arr) {
        super(c12063);
        this.f32711 = 0;
        this.f32710 = c1953Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9716 m24672(C12063 c12063, ArrayList arrayList) {
        C1953[] c1953Arr = new C1953[arrayList.size()];
        arrayList.toArray(c1953Arr);
        return (C9716) c12063.f40355.m28060(new C9716(c12063, c1953Arr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9716 m24675(C12063 c12063) {
        C1953[] c1953Arr;
        C1953[] c1953Arr2 = this.f32710;
        if (c1953Arr2 != null) {
            c1953Arr = new C1953[c1953Arr2.length];
            int i = 0;
            while (true) {
                C1953[] c1953Arr3 = this.f32710;
                if (i >= c1953Arr3.length) {
                    break;
                }
                c1953Arr[i] = C1953.m6312(c1953Arr3[i].m6314(), c12063);
                i++;
            }
        } else {
            c1953Arr = null;
        }
        return (C9716) c12063.f40355.m28060(new C9716(c12063, c1953Arr));
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        int iM33642 = c13825.m33642();
        this.f32710 = new C1953[iM33642];
        for (int i = 0; i < iM33642; i++) {
            this.f32710[i] = (C1953) this.f30808.f40367.m44688(c13825.m33638());
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return (this.f32710.length * 2) + i + 4;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        c4651.m12839(this.f32710.length);
        for (C1953 c1953 : this.f32710) {
            c4651.m12833(c1953.f30809);
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "type_list: " + m24674("");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C9716 c9716) {
        if (c9716 == null) {
            return 1;
        }
        int length = this.f32710.length;
        int length2 = c9716.f32710.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = this.f32710[i].compareTo(c9716.f32710[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24674(String str) {
        int length = 0;
        for (C1953 c1953 : this.f32710) {
            length = str.length() + c1953.m6314().length() + length;
        }
        StringBuilder sb = new StringBuilder(length);
        for (C1953 c1954 : this.f32710) {
            sb.append(c1954.m6314());
            sb.append(str);
        }
        if (this.f32710.length > 0) {
            sb.delete(sb.length() - str.length(), sb.length());
        }
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f32711 == 0) {
            int iHashCode = 1;
            for (C1953 c1953 : this.f32710) {
                iHashCode = (iHashCode * 31) + c1953.hashCode();
            }
            this.f32711 = iHashCode;
        }
        return this.f32711;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C9716.class.equals(obj.getClass())) {
            return false;
        }
        C9716 c9716 = (C9716) obj;
        if (this.f32710.length != c9716.f32710.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C1953[] c1953Arr = this.f32710;
            if (i >= c1953Arr.length) {
                return true;
            }
            if (c1953Arr[i] != c9716.f32710[i]) {
                return false;
            }
            i++;
        }
    }
}
