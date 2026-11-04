package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20993 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f67115;

    public C20993(ArrayList arrayList) {
        this.f67115 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47982(C21943 c21943, C18959 c18959) {
        Iterator it = ((ArrayList) c21943.mo1986()).iterator();
        while (it.hasNext()) {
            if (((C18959) it.next()) == c18959) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47981(List list, C18959 c18959) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c18959) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47983(C18959 c18959) {
        return m47981(this.f67115, c18959);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f67115.iterator();
    }

    public final C18959 get(int i) {
        return (C18959) this.f67115.get(i);
    }

    public final int size() {
        return this.f67115.size();
    }
}
