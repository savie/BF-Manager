package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12231 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f39366;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20436[] f39367;

    public C12231(C24738 c24738) {
        super(c24738);
        this.f39366 = 0;
    }

    public C12231(C24738 c24738, C20436[] c20436Arr) {
        super(c24738);
        this.f39366 = 0;
        this.f39367 = c20436Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12231 m30516(C24738 c24738, ArrayList arrayList) {
        C20436[] c20436Arr = new C20436[arrayList.size()];
        arrayList.toArray(c20436Arr);
        return (C12231) c24738.f80102.m38079(new C12231(c24738, c20436Arr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12231 m30519(C24738 c24738) {
        C20436[] c20436Arr;
        C20436[] c20436Arr2 = this.f39367;
        if (c20436Arr2 != null) {
            c20436Arr = new C20436[c20436Arr2.length];
            int i = 0;
            while (true) {
                C20436[] c20436Arr3 = this.f39367;
                if (i >= c20436Arr3.length) {
                    break;
                }
                c20436Arr[i] = C20436.m46859(c20436Arr3[i].m46860(), c24738);
                i++;
            }
        } else {
            c20436Arr = null;
        }
        return (C12231) c24738.f80102.m38079(new C12231(c24738, c20436Arr));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        int iM12995 = c4028.m12995();
        this.f39367 = new C20436[iM12995];
        for (int i = 0; i < iM12995; i++) {
            this.f39367[i] = (C20436) this.f34102.f80112.m49623(c4028.m13002());
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return (this.f39367.length * 2) + i + 4;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f39367.length);
        for (C20436 c20436 : this.f39367) {
            c24166.m54139(c20436.f34104);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "type_list: " + m30518("");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C12231 c12231) {
        if (c12231 == null) {
            return 1;
        }
        int length = this.f39367.length;
        int length2 = c12231.f39367.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = this.f39367[i].compareTo(c12231.f39367[i]);
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
    public final String m30518(String str) {
        int length = 0;
        for (C20436 c20436 : this.f39367) {
            length = str.length() + c20436.m46860().length() + length;
        }
        StringBuilder sb = new StringBuilder(length);
        for (C20436 c20437 : this.f39367) {
            sb.append(c20437.m46860());
            sb.append(str);
        }
        if (this.f39367.length > 0) {
            sb.delete(sb.length() - str.length(), sb.length());
        }
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f39366 == 0) {
            int iHashCode = 1;
            for (C20436 c20436 : this.f39367) {
                iHashCode = (iHashCode * 31) + c20436.hashCode();
            }
            this.f39366 = iHashCode;
        }
        return this.f39366;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12231.class.equals(obj.getClass())) {
            return false;
        }
        C12231 c12231 = (C12231) obj;
        if (this.f39367.length != c12231.f39367.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C20436[] c20436Arr = this.f39367;
            if (i >= c20436Arr.length) {
                return true;
            }
            if (c20436Arr[i] != c12231.f39367[i]) {
                return false;
            }
            i++;
        }
    }
}
