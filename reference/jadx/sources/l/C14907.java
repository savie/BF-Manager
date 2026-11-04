package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܰ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: VASI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f48693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48694;

    public C14907(C14907 c14907) {
        this(new int[0]);
        m35860(c14907);
    }

    public C14907(int... iArr) {
        this.f48693 = new ArrayList(iArr.length);
        for (int i : iArr) {
            m35858(i);
        }
    }

    static {
        C14907 c14907 = new C14907(new int[0]);
        c14907.m35859(0, 1114111);
        c14907.f48694 = true;
        new C14907(new int[0]).f48694 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35858(int i) {
        if (this.f48694) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m35859(i, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35859(int i, int i2) {
        C4467 c4467;
        int i3;
        C4467 c4467M14163 = C4467.m14163(i, i2);
        if (this.f48694) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c4467M14163.f15985 < c4467M14163.f15984) {
            return;
        }
        ArrayList arrayList = this.f48693;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                c4467 = (C4467) listIterator.next();
                if (!c4467M14163.equals(c4467)) {
                    i3 = c4467M14163.f15984;
                    int i4 = c4467.f15985;
                    if (i3 == i4 + 1) {
                        break;
                    }
                    int i5 = c4467M14163.f15985;
                    int i6 = c4467.f15984;
                    if (i5 == i6 - 1 || ((i3 >= i6 || i5 >= i6) && i3 <= i4)) {
                        break;
                    }
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(c4467M14163);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                arrayList.add(c4467M14163);
                return;
            }
        }
        C4467 c4467M14164 = C4467.m14163(Math.min(i3, c4467.f15984), Math.max(c4467M14163.f15985, c4467.f15985));
        listIterator.set(c4467M14164);
        while (listIterator.hasNext()) {
            C4467 c4468 = (C4467) listIterator.next();
            int i7 = c4467M14164.f15984;
            int i8 = c4468.f15985;
            if (i7 != i8 + 1) {
                int i9 = c4467M14164.f15985;
                int i10 = c4468.f15984;
                if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                    return;
                }
            }
            listIterator.remove();
            listIterator.previous();
            listIterator.set(C4467.m14163(Math.min(c4467M14164.f15984, c4468.f15984), Math.max(c4467M14164.f15985, c4468.f15985)));
            listIterator.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35860(C14907 c14907) {
        if (c14907 == null) {
            return;
        }
        ArrayList arrayList = c14907.f48693;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4467 c4467 = (C4467) arrayList.get(i);
            m35859(c4467.f15984, c4467.f15985);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14907 m35855(C14907 c14907, C14907 c14908) {
        int i = 0;
        if (c14907.m35863()) {
            return new C14907(new int[0]);
        }
        C14907 c14909 = new C14907(c14907);
        ArrayList arrayList = c14908.f48693;
        if (!c14908.m35863()) {
            int i2 = 0;
            while (i < c14909.f48693.size() && i2 < arrayList.size()) {
                C4467 c4467 = (C4467) c14909.f48693.get(i);
                C4467 c4468 = (C4467) arrayList.get(i2);
                int i3 = c4468.f15985;
                int i4 = c4467.f15984;
                if (i3 >= i4) {
                    int i5 = c4468.f15984;
                    int i6 = c4467.f15985;
                    if (i5 <= i6) {
                        C4467 c4469 = i5 > i4 ? new C4467(i4, i5 - 1) : null;
                        C4467 c44610 = i3 < i6 ? new C4467(i3 + 1, i6) : null;
                        if (c4469 != null) {
                            if (c44610 != null) {
                                c14909.f48693.set(i, c4469);
                                i++;
                                c14909.f48693.add(i, c44610);
                            } else {
                                c14909.f48693.set(i, c4469);
                            }
                        } else if (c44610 != null) {
                            c14909.f48693.set(i, c44610);
                        } else {
                            c14909.f48693.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c14909;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35864(int i) {
        ArrayList arrayList = this.f48693;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C4467 c4467 = (C4467) arrayList.get(i3);
            int i4 = c4467.f15984;
            if (c4467.f15985 < i) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35863() {
        ArrayList arrayList = this.f48693;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35856() {
        if (m35863()) {
            throw new RuntimeException("set is empty");
        }
        return ((C4467) this.f48693.get(0)).f15984;
    }

    public final int hashCode() {
        ArrayList<C4467> arrayList = this.f48693;
        int iM19447 = 0;
        for (C4467 c4467 : arrayList) {
            iM19447 = C7103.m19447(C7103.m19447(iM19447, c4467.f15984), c4467.f15985);
        }
        return C7103.m19444(iM19447, arrayList.size() * 2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14907)) {
            return false;
        }
        return this.f48693.equals(((C14907) obj).f48693);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f48693;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m35862() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4467 c4467 = (C4467) it.next();
            int i = c4467.f15984;
            int i2 = c4467.f15985;
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
        if (m35862() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35857(InterfaceC5037 interfaceC5037) {
        String strM50198;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f48693;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m35862() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4467 c4467 = (C4467) it.next();
            int i = c4467.f15984;
            int i2 = c4467.f15985;
            String strM50199 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM50199 = "<EOF>";
                } else if (i != -2) {
                    strM50199 = ((C22191) interfaceC5037).m50198(i);
                }
                sb.append(strM50199);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM50198 = "<EOF>";
                    } else {
                        strM50198 = i3 == -2 ? "<EPSILON>" : ((C22191) interfaceC5037).m50198(i3);
                    }
                    sb.append(strM50198);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m35862() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m35862() {
        ArrayList arrayList = this.f48693;
        int size = arrayList.size();
        if (size == 1) {
            C4467 c4467 = (C4467) arrayList.get(0);
            return (c4467.f15985 - c4467.f15984) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C4467 c4468 = (C4467) arrayList.get(i2);
            i += (c4468.f15985 - c4468.f15984) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35861() {
        if (this.f48694) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.f48693;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4467 c4467 = (C4467) arrayList.get(i);
            int i2 = c4467.f15984;
            int i3 = c4467.f15985;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                c4467.f15984 = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c4467.f15985 = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c4467.f15985 = -3;
                m35859(-1, i3);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m35865() {
        this.f48694 = true;
    }
}
