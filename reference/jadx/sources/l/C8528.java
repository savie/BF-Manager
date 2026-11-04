package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8528 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f27862 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22842(C2562 c2562) {
        if (this.f27862 == null) {
            this.f27862 = new ArrayList();
        }
        for (int i = 0; i < this.f27862.size(); i++) {
            if (((C2562) this.f27862.get(i)).f8233.f23220 > c2562.f8233.f23220) {
                this.f27862.add(i, c2562);
                return;
            }
        }
        this.f27862.add(c2562);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22843(C8528 c8528) {
        if (c8528.f27862 == null) {
            return;
        }
        if (this.f27862 == null) {
            this.f27862 = new ArrayList(c8528.f27862.size());
        }
        Iterator it = c8528.f27862.iterator();
        while (it.hasNext()) {
            m22842((C2562) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m22841() {
        return this.f27862;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m22844() {
        ArrayList arrayList = this.f27862;
        return arrayList == null || arrayList.isEmpty();
    }

    public final String toString() {
        if (this.f27862 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f27862.iterator();
        while (it.hasNext()) {
            sb.append(((C2562) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
