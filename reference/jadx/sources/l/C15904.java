package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public class C15904 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20842 f51503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0219 f51504;

    public C15904() {
        C0219 c0219 = C15682.f50913;
        this.f51503 = new C20842(new C7436[0]);
        this.f51504 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37811(int i, int i2, C15682 c15682) {
        if (i2 < i) {
            throw new IllegalArgumentException();
        }
        if (i == i2) {
            return;
        }
        C20842 c20842 = this.f51503;
        if (c20842.isEmpty()) {
            c20842.add(new C7436(i, i2, c15682));
            return;
        }
        C7436 c7436 = (C7436) c20842.get(c20842.size() - 1);
        int i3 = c7436.f24806;
        if (i3 == i) {
            if (c7436.f24807.equals(c15682)) {
                c7436.f24806 = i2;
                return;
            } else {
                c20842.add(new C7436(i, i2, c15682));
                return;
            }
        }
        if (i < i3) {
            int size = c20842.size();
            int i4 = size - 1;
            C7436[] c7436Arr = (C7436[]) c20842.m22019();
            int i5 = 0;
            while (i5 <= i4) {
                int iM9602 = C3184.m9602(i4, i5, 2, i5);
                if (c7436Arr[iM9602].f24806 > i) {
                    i4 = iM9602 - 1;
                    size = iM9602;
                } else {
                    i5 = iM9602 + 1;
                }
            }
            if (size == c20842.size() || i2 <= ((C7436) c20842.get(size)).f24808) {
                c20842.add(size, new C7436(i, i2, c15682));
                return;
            }
            while (size < c20842.size()) {
                C7436 c7437 = (C7436) c20842.get(size);
                int i6 = c7437.f24808;
                if (i2 <= i6) {
                    c20842.add(size, new C7436(i, i2, c15682));
                    return;
                }
                int i7 = c7437.f24806;
                if (i < i7) {
                    C0219 c0219 = this.f51504;
                    if (i < i6) {
                        if (i2 < i7) {
                            Object obj = c7437.f24807;
                            c0219.getClass();
                            C15682 c15682M37372 = ((C15682) obj).m37372(c15682);
                            int i8 = c7437.f24808;
                            C7436 c7438 = new C7436(i, i8, c15682);
                            C7436 c7439 = new C7436(i8, i2, c15682M37372);
                            c7437.f24808 = i2;
                            c20842.m46865(size, c7438, c7439);
                            return;
                        }
                        if (i2 == i7) {
                            c20842.add(size, new C7436(i, i6, c15682));
                            Object obj2 = c7437.f24807;
                            c0219.getClass();
                            c7437.f24807 = ((C15682) obj2).m37372(c15682);
                            return;
                        }
                        c20842.add(size, new C7436(i, i6, c15682));
                        Object obj3 = c7437.f24807;
                        c0219.getClass();
                        c7437.f24807 = ((C15682) obj3).m37372(c15682);
                        i = c7437.f24806;
                    } else if (i == i6) {
                        if (i2 < i7) {
                            Object obj4 = c7437.f24807;
                            c0219.getClass();
                            c20842.add(size, new C7436(i, i2, ((C15682) obj4).m37372(c15682)));
                            c7437.f24808 = i2;
                            return;
                        }
                        if (i2 == i7) {
                            Object obj5 = c7437.f24807;
                            c0219.getClass();
                            c7437.f24807 = ((C15682) obj5).m37372(c15682);
                            return;
                        } else {
                            Object obj6 = c7437.f24807;
                            c0219.getClass();
                            c7437.f24807 = ((C15682) obj6).m37372(c15682);
                            i = c7437.f24806;
                        }
                    } else {
                        if (i2 < i7) {
                            Object obj7 = c7437.f24807;
                            c0219.getClass();
                            C15682 c15682M37373 = ((C15682) obj7).m37372(c15682);
                            C7436 c74310 = new C7436(c7437.f24808, i, c7437.f24807);
                            C7436 c74311 = new C7436(i, i2, c15682M37373);
                            c7437.f24808 = i2;
                            c20842.m46865(size, c74310, c74311);
                            return;
                        }
                        if (i2 == i7) {
                            c20842.add(size, new C7436(i6, i, c7437.f24807));
                            Object obj8 = c7437.f24807;
                            c0219.getClass();
                            c7437.f24807 = ((C15682) obj8).m37372(c15682);
                            c7437.f24808 = i;
                            return;
                        }
                        c20842.add(size, new C7436(i6, i, c7437.f24807));
                        Object obj9 = c7437.f24807;
                        c0219.getClass();
                        c7437.f24807 = ((C15682) obj9).m37372(c15682);
                        c7437.f24808 = i;
                        i = c7437.f24806;
                    }
                }
                size++;
            }
            c20842.add(new C7436(i, i2, c15682));
            return;
        }
        c20842.add(new C7436(i, i2, c15682));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37812() {
        C20842 c20842 = this.f51503;
        int size = c20842.size();
        int i = 1;
        if (size <= 1) {
            return;
        }
        C7436[] c7436Arr = (C7436[]) c20842.m22019();
        int i2 = 0;
        C7436 c7436 = c7436Arr[0];
        while (i < size) {
            C7436 c7437 = c7436Arr[i];
            if (c7436.f24806 == c7437.f24808 && C13638.equals(c7436.f24807, c7437.f24807)) {
                c7437.f24808 = c7436.f24808;
            } else {
                c7436Arr[i2] = c7436;
                i2++;
            }
            i++;
            c7436 = c7437;
        }
        int i3 = i2 + 1;
        c7436Arr[i2] = c7436;
        if (i3 < size) {
            c20842.m22021(i3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m37813() {
        return this.f51503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37810() {
        this.f51503.clear();
    }
}
