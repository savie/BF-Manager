package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.֨ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VASI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0875 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f3564;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3565;

    public C0875(C0875 c0875) {
        this(new int[0]);
        m3504(c0875);
    }

    public C0875(int... iArr) {
        this.f3564 = new ArrayList(iArr.length);
        for (int i : iArr) {
            m3502(i);
        }
    }

    static {
        C0875 c0875 = new C0875(new int[0]);
        c0875.m3503(0, 1114111);
        c0875.f3565 = true;
        new C0875(new int[0]).f3565 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3502(int i) {
        if (this.f3565) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m3503(i, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3503(int i, int i2) {
        C22043 c22043;
        int i3;
        C22043 c22043M48958 = C22043.m48958(i, i2);
        if (this.f3565) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c22043M48958.f71444 < c22043M48958.f71443) {
            return;
        }
        ArrayList arrayList = this.f3564;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                c22043 = (C22043) listIterator.next();
                if (!c22043M48958.equals(c22043)) {
                    i3 = c22043M48958.f71443;
                    int i4 = c22043.f71444;
                    if (i3 == i4 + 1) {
                        break;
                    }
                    int i5 = c22043M48958.f71444;
                    int i6 = c22043.f71443;
                    if (i5 == i6 - 1 || ((i3 >= i6 || i5 >= i6) && i3 <= i4)) {
                        break;
                    }
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(c22043M48958);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                arrayList.add(c22043M48958);
                return;
            }
        }
        C22043 c22043M48959 = C22043.m48958(Math.min(i3, c22043.f71443), Math.max(c22043M48958.f71444, c22043.f71444));
        listIterator.set(c22043M48959);
        while (listIterator.hasNext()) {
            C22043 c22044 = (C22043) listIterator.next();
            int i7 = c22043M48959.f71443;
            int i8 = c22044.f71444;
            if (i7 != i8 + 1) {
                int i9 = c22043M48959.f71444;
                int i10 = c22044.f71443;
                if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                    return;
                }
            }
            listIterator.remove();
            listIterator.previous();
            listIterator.set(C22043.m48958(Math.min(c22043M48959.f71443, c22044.f71443), Math.max(c22043M48959.f71444, c22044.f71444)));
            listIterator.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3504(C0875 c0875) {
        if (c0875 == null) {
            return;
        }
        ArrayList arrayList = c0875.f3564;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C22043 c22043 = (C22043) arrayList.get(i);
            m3503(c22043.f71443, c22043.f71444);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0875 m3498(C0875 c0875, C0875 c0876) {
        int i = 0;
        if (c0875.m3507()) {
            return new C0875(new int[0]);
        }
        C0875 c0877 = new C0875(c0875);
        ArrayList arrayList = c0876.f3564;
        if (!c0876.m3507()) {
            int i2 = 0;
            while (i < c0877.f3564.size() && i2 < arrayList.size()) {
                C22043 c22043 = (C22043) c0877.f3564.get(i);
                C22043 c22044 = (C22043) arrayList.get(i2);
                int i3 = c22044.f71444;
                int i4 = c22043.f71443;
                if (i3 >= i4) {
                    int i5 = c22044.f71443;
                    int i6 = c22043.f71444;
                    if (i5 <= i6) {
                        C22043 c22045 = i5 > i4 ? new C22043(i4, i5 - 1) : null;
                        C22043 c22046 = i3 < i6 ? new C22043(i3 + 1, i6) : null;
                        if (c22045 != null) {
                            if (c22046 != null) {
                                c0877.f3564.set(i, c22045);
                                i++;
                                c0877.f3564.add(i, c22046);
                            } else {
                                c0877.f3564.set(i, c22045);
                            }
                        } else if (c22046 != null) {
                            c0877.f3564.set(i, c22046);
                        } else {
                            c0877.f3564.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c0877;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m3508(int i) {
        ArrayList arrayList = this.f3564;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C22043 c22043 = (C22043) arrayList.get(i3);
            int i4 = c22043.f71443;
            if (c22043.f71444 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m3507() {
        ArrayList arrayList = this.f3564;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3500() {
        if (m3507()) {
            throw new RuntimeException("set is empty");
        }
        return ((C22043) this.f3564.get(0)).f71443;
    }

    public final int hashCode() {
        ArrayList<C22043> arrayList = this.f3564;
        int iM13217 = 0;
        for (C22043 c22043 : arrayList) {
            iM13217 = C4758.m13217(C4758.m13217(iM13217, c22043.f71443), c22043.f71444);
        }
        return C4758.m13213(iM13217, arrayList.size() * 2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0875)) {
            return false;
        }
        return this.f3564.equals(((C0875) obj).f3564);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f3564;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m3505() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22043 c22043 = (C22043) it.next();
            int i = c22043.f71443;
            int i2 = c22043.f71444;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m3505() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3501(InterfaceC7766 interfaceC7766) {
        String strM47629;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f3564;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m3505() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C22043 c22043 = (C22043) it.next();
            int i = c22043.f71443;
            int i2 = c22043.f71444;
            String strM476210 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM476210 = "<EOF>";
                } else if (i != -2) {
                    strM476210 = ((C21171) interfaceC7766).m47629(i);
                }
                sb.append(strM476210);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM47629 = "<EOF>";
                    } else {
                        strM47629 = i3 == -2 ? "<EPSILON>" : ((C21171) interfaceC7766).m47629(i3);
                    }
                    sb.append(strM47629);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m3505() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m3505() {
        ArrayList arrayList = this.f3564;
        int size = arrayList.size();
        if (size == 1) {
            C22043 c22043 = (C22043) arrayList.get(0);
            return (c22043.f71444 - c22043.f71443) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C22043 c22044 = (C22043) arrayList.get(i2);
            i += (c22044.f71444 - c22044.f71443) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3506() {
        if (this.f3565) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.f3564;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C22043 c22043 = (C22043) arrayList.get(i);
            int i2 = c22043.f71443;
            int i3 = c22043.f71444;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                c22043.f71443 = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c22043.f71444 = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c22043.f71444 = -3;
                m3503(-1, i3);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m3499() {
        this.f3565 = true;
    }
}
