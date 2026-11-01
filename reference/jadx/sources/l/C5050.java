package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5050 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f17617;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f17618 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f17619 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2227 m14064(String str) {
        HashMap map = this.f17619;
        C2227 c2227 = (C2227) map.get(str);
        if (c2227 != null) {
            return c2227;
        }
        C2227 c2228 = new C2227(str, -1);
        map.put(str, c2228);
        return c2228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2227 m14063(int i, String str) {
        if (i == 0) {
            return m14064(str);
        }
        String str2 = i + "-" + str;
        HashMap map = this.f17618;
        C2227 c2227 = (C2227) map.get(str2);
        if (c2227 != null) {
            return c2227;
        }
        C2227 c2228 = new C2227(str, i);
        map.put(str2, c2228);
        return c2228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17140 m14065(boolean z) {
        final ArrayList arrayList = new ArrayList();
        HashMap map = this.f17618;
        final C15070 c15070 = new C15070(map.size());
        C9030.stream(map.values()).sorted().forEach(new Consumer() { // from class: l.ܰ֫᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C2227 c2227 = (C2227) obj;
                arrayList.add(c2227);
                c15070.add(c2227.f8004);
            }
        });
        this.f17617 = c15070.mo3181();
        C9030.stream(this.f17619.values()).sorted().forEach(new Consumer() { // from class: l.ۨ֫᩺
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((C2227) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        });
        C17140 c17140 = new C17140();
        c17140.m40060(z);
        for (int i = 0; i < arrayList.size(); i++) {
            C2227 c2227 = (C2227) arrayList.get(i);
            c2227.f8005 = i;
            c17140.m40063(c2227.f8003);
        }
        return c17140;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m14066() {
        int[] iArr = this.f17617;
        if (iArr != null) {
            return iArr;
        }
        throw new IllegalStateException();
    }
}
