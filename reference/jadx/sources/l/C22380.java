package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6RC */
/* JADX INFO: loaded from: classes.dex */
public final class C22380 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f73070;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2063 f73071;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f73072;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f73073;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f73074;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3329 f73075;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f73076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1979 f73077;

    static {
        ApplicationC6132.m17119(162);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native void m49637(AbstractC12648 abstractC12648);

    public C22380(CharSequence charSequence, C3329 c3329, String str, C2063 c2063, int i, List list) {
        this.f73072 = charSequence;
        this.f73075 = c3329;
        this.f73070 = str;
        this.f73071 = c2063;
        this.f73073 = i;
        this.f73076 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22380 m49632(InterfaceC2916 interfaceC2916, String str, C2063 c2063) {
        return m49631(interfaceC2916, str, c2063, -1, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22380 m49633(C14393 c14393, String str, C2063 c2063) {
        C22380 c22380M49631 = m49631(c14393.f47162, str, c2063, -1, null);
        C9742 c9742 = c14393.f47155;
        if (c9742 == null || c9742.m24720() <= 1) {
            return c22380M49631;
        }
        try {
            c22380M49631.f73077 = c14393.f47155.m24712(c14393.f47153, c22380M49631.f73072, c14393.f47165.f5556);
            return c22380M49631;
        } catch (Error | RuntimeException e) {
            c22380M49631.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49636() {
        m49634();
        C1979 c1979 = this.f73077;
        if (c1979 != null) {
            c1979.m6393();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22380 m49631(CharSequence charSequence, String str, C2063 c2063, int i, ArrayList arrayList) {
        List listUnmodifiableList;
        C2063 c2063M6569 = c2063.m6569();
        C3329 c3329Mo2398 = null;
        if (arrayList == null) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C13638.requireNonNull(obj);
                arrayList2.add(obj);
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList2);
        }
        if (listUnmodifiableList != null && (i < 0 || i >= listUnmodifiableList.size())) {
            throw new IllegalArgumentException("Invalid saving page index");
        }
        try {
            c3329Mo2398 = charSequence instanceof InterfaceC0507 ? ((InterfaceC0507) charSequence).mo2398() : null;
            return new C22380(c3329Mo2398 == null ? charSequence : c3329Mo2398, c3329Mo2398, str, c2063M6569, i, listUnmodifiableList);
        } catch (Error | RuntimeException e) {
            if (c3329Mo2398 != null) {
                c3329Mo2398.close();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49638(AbstractC20745 abstractC20745) {
        m49634();
        C1979 c1979 = this.f73077;
        C2063 c2063 = this.f73071;
        String str = this.f73070;
        if (c1979 == null) {
            C10386.m26285(abstractC20745, this.f73072, str, c2063.f7652);
        } else {
            C10386.m26284(abstractC20745, str, c2063.f7652, c1979);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9388 m49635(int i) throws C4945 {
        m49634();
        C9388 c9388 = new C9388();
        C1979 c1979 = this.f73077;
        CharSequence charSequence = this.f73072;
        if (c1979 == null) {
            c9388.m24083(i, charSequence);
            return c9388;
        }
        for (int i2 = 0; i2 < this.f73077.f7421.m24720(); i2++) {
            if (i2 == this.f73077.m6390()) {
                c9388.m24083(i, charSequence);
            } else {
                C3329 c3329M6391 = this.f73077.m6391(i2);
                try {
                    c9388.m24083(-1, c3329M6391);
                    c3329M6391.close();
                } catch (Throwable th) {
                    try {
                        c3329M6391.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return c9388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49639(C2063 c2063) {
        C2063 c2064 = this.f73071;
        Map map = c2064.f7649;
        if (c2063 != null) {
            Map map2 = c2063.f7649;
            if (c2064.f7648 == c2063.f7648 && c2064.f7652 == c2063.f7652 && c2064.f7651 == c2063.f7651 && c2064.f7654 == c2063.f7654 && c2064.f7653 == c2063.f7653 && C13638.equals(c2064.f7650, c2063.f7650)) {
                if (map == null || map2 == null) {
                    if (map == map2) {
                        return true;
                    }
                } else if (map.keySet().equals(map2.keySet())) {
                    for (Map.Entry entry : map.entrySet()) {
                        C11413 c11413 = (C11413) entry.getValue();
                        C11413 c11414 = (C11413) map2.get(entry.getKey());
                        int i = c11413.f38427;
                        C21996[] c21996Arr = c11413.f38429;
                        int i2 = c11414.f38427;
                        C21996[] c21996Arr2 = c11414.f38429;
                        if (i == i2 && c11413.f38428 == c11414.f38428 && C13638.equals(c11413.f38431, c11414.f38431) && c21996Arr.length == c21996Arr2.length) {
                            for (int i3 = 0; i3 < c21996Arr.length; i3++) {
                                C21996 c21996 = c21996Arr[i3];
                                C21996 c21997 = c21996Arr2[i3];
                                if (c21996.f71329 == c21997.f71329 && c21996.f71328 == c21997.f71328 && C13638.equals(c21996.f71327, c21997.f71327)) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m49634() {
        if (this.f73074) {
            throw new IllegalStateException("Saving request is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f73074) {
            return;
        }
        this.f73074 = true;
        try {
            C3329 c3329 = this.f73075;
            if (c3329 != null) {
                c3329.close();
            }
        } finally {
            C1979 c1979 = this.f73077;
            if (c1979 != null) {
                c1979.close();
            }
        }
    }
}
