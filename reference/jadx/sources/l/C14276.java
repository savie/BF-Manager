package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܰ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public class C14276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3836 f45106;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13921 f45107;

    public C14276() {
        C13921 c13921 = C11974.f38540;
        this.f45106 = new C3836(new C23974[0]);
        this.f45107 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34685(int i, int i2, C11974 c11974) {
        if (i2 < i) {
            throw new IllegalArgumentException();
        }
        if (i == i2) {
            return;
        }
        C3836 c3836 = this.f45106;
        if (c3836.isEmpty()) {
            c3836.add(new C23974(i, i2, c11974));
            return;
        }
        C23974 c23974 = (C23974) c3836.get(c3836.size() - 1);
        int i3 = c23974.f77589;
        if (i3 == i) {
            if (c23974.f77590.equals(c11974)) {
                c23974.f77589 = i2;
                return;
            } else {
                c3836.add(new C23974(i, i2, c11974));
                return;
            }
        }
        if (i < i3) {
            int size = c3836.size();
            int i4 = size - 1;
            C23974[] c23974Arr = (C23974[]) c3836.m25602();
            int i5 = 0;
            while (i5 <= i4) {
                int iM18182 = C6421.m18182(i4, i5, 2, i5);
                if (c23974Arr[iM18182].f77589 > i) {
                    i4 = iM18182 - 1;
                    size = iM18182;
                } else {
                    i5 = iM18182 + 1;
                }
            }
            if (size == c3836.size() || i2 <= ((C23974) c3836.get(size)).f77591) {
                c3836.add(size, new C23974(i, i2, c11974));
                return;
            }
            while (size < c3836.size()) {
                C23974 c23975 = (C23974) c3836.get(size);
                int i6 = c23975.f77591;
                if (i2 <= i6) {
                    c3836.add(size, new C23974(i, i2, c11974));
                    return;
                }
                int i7 = c23975.f77589;
                if (i < i7) {
                    C13921 c13921 = this.f45107;
                    if (i < i6) {
                        if (i2 < i7) {
                            Object obj = c23975.f77590;
                            c13921.getClass();
                            C11974 c11974M30038 = ((C11974) obj).m30038(c11974);
                            int i8 = c23975.f77591;
                            C23974 c23976 = new C23974(i, i8, c11974);
                            C23974 c23977 = new C23974(i8, i2, c11974M30038);
                            c23975.f77591 = i2;
                            c3836.m12375(size, c23976, c23977);
                            return;
                        }
                        if (i2 == i7) {
                            c3836.add(size, new C23974(i, i6, c11974));
                            Object obj2 = c23975.f77590;
                            c13921.getClass();
                            c23975.f77590 = ((C11974) obj2).m30038(c11974);
                            return;
                        }
                        c3836.add(size, new C23974(i, i6, c11974));
                        Object obj3 = c23975.f77590;
                        c13921.getClass();
                        c23975.f77590 = ((C11974) obj3).m30038(c11974);
                        i = c23975.f77589;
                    } else if (i == i6) {
                        if (i2 < i7) {
                            Object obj4 = c23975.f77590;
                            c13921.getClass();
                            c3836.add(size, new C23974(i, i2, ((C11974) obj4).m30038(c11974)));
                            c23975.f77591 = i2;
                            return;
                        }
                        if (i2 == i7) {
                            Object obj5 = c23975.f77590;
                            c13921.getClass();
                            c23975.f77590 = ((C11974) obj5).m30038(c11974);
                            return;
                        } else {
                            Object obj6 = c23975.f77590;
                            c13921.getClass();
                            c23975.f77590 = ((C11974) obj6).m30038(c11974);
                            i = c23975.f77589;
                        }
                    } else {
                        if (i2 < i7) {
                            Object obj7 = c23975.f77590;
                            c13921.getClass();
                            C11974 c11974M30039 = ((C11974) obj7).m30038(c11974);
                            C23974 c23978 = new C23974(c23975.f77591, i, c23975.f77590);
                            C23974 c23979 = new C23974(i, i2, c11974M30039);
                            c23975.f77591 = i2;
                            c3836.m12375(size, c23978, c23979);
                            return;
                        }
                        if (i2 == i7) {
                            c3836.add(size, new C23974(i6, i, c23975.f77590));
                            Object obj8 = c23975.f77590;
                            c13921.getClass();
                            c23975.f77590 = ((C11974) obj8).m30038(c11974);
                            c23975.f77591 = i;
                            return;
                        }
                        c3836.add(size, new C23974(i6, i, c23975.f77590));
                        Object obj9 = c23975.f77590;
                        c13921.getClass();
                        c23975.f77590 = ((C11974) obj9).m30038(c11974);
                        c23975.f77591 = i;
                        i = c23975.f77589;
                    }
                }
                size++;
            }
            c3836.add(new C23974(i, i2, c11974));
            return;
        }
        c3836.add(new C23974(i, i2, c11974));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34686() {
        C3836 c3836 = this.f45106;
        int size = c3836.size();
        int i = 1;
        if (size <= 1) {
            return;
        }
        C23974[] c23974Arr = (C23974[]) c3836.m25602();
        int i2 = 0;
        C23974 c23974 = c23974Arr[0];
        while (i < size) {
            C23974 c23975 = c23974Arr[i];
            if (c23974.f77589 == c23975.f77591 && C17359.equals(c23974.f77590, c23975.f77590)) {
                c23975.f77591 = c23974.f77591;
            } else {
                c23974Arr[i2] = c23974;
                i2++;
            }
            i++;
            c23974 = c23975;
        }
        int i3 = i2 + 1;
        c23974Arr[i2] = c23974;
        if (i3 < size) {
            c3836.m25608(i3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m34687() {
        return this.f45106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34684() {
        this.f45106.clear();
    }
}
