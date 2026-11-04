package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f64126;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f64127 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f64128 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22919 m45861(String str) {
        HashMap map = this.f64128;
        C22919 c22919 = (C22919) map.get(str);
        if (c22919 != null) {
            return c22919;
        }
        C22919 c229110 = new C22919(str, -1);
        map.put(str, c229110);
        return c229110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22919 m45860(int i, String str) {
        if (i == 0) {
            return m45861(str);
        }
        String str2 = i + "-" + str;
        HashMap map = this.f64127;
        C22919 c22919 = (C22919) map.get(str2);
        if (c22919 != null) {
            return c22919;
        }
        C22919 c229110 = new C22919(str, i);
        map.put(str2, c229110);
        return c229110;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12558 m45859(boolean z) {
        final ArrayList arrayList = new ArrayList();
        HashMap map = this.f64127;
        final C14763 c14763 = new C14763(map.size());
        C1170.stream(map.values()).sorted().forEach(new Consumer() { // from class: l.ۤܺܺ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C22919 c22919 = (C22919) obj;
                arrayList.add(c22919);
                c14763.add(c22919.f74484);
            }
        });
        this.f64126 = c14763.mo2687();
        C1170.stream(this.f64128.values()).sorted().forEach(new C16517(1, arrayList));
        C12558 c12558 = new C12558();
        c12558.m31250(z);
        for (int i = 0; i < arrayList.size(); i++) {
            C22919 c22919 = (C22919) arrayList.get(i);
            c22919.f74486 = i;
            c12558.m31255(c22919.f74485);
        }
        return c12558;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m45862() {
        int[] iArr = this.f64126;
        if (iArr != null) {
            return iArr;
        }
        throw new IllegalStateException();
    }
}
