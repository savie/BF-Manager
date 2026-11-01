package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20209 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16209(C17226 c17226) {
        if (this.f20209 == null) {
            this.f20209 = new ArrayList();
        }
        for (int i = 0; i < this.f20209.size(); i++) {
            if (((C17226) this.f20209.get(i)).f54891.f36988 > c17226.f54891.f36988) {
                this.f20209.add(i, c17226);
                return;
            }
        }
        this.f20209.add(c17226);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16208(C5937 c5937) {
        if (c5937.f20209 == null) {
            return;
        }
        if (this.f20209 == null) {
            this.f20209 = new ArrayList(c5937.f20209.size());
        }
        Iterator it = c5937.f20209.iterator();
        while (it.hasNext()) {
            m16209((C17226) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m16207() {
        return this.f20209;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16210() {
        ArrayList arrayList = this.f20209;
        return arrayList == null || arrayList.isEmpty();
    }

    public final String toString() {
        if (this.f20209 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f20209.iterator();
        while (it.hasNext()) {
            sb.append(((C17226) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
