package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C7037 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f23219;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23220;

    public /* synthetic */ C7037(int i) {
        this();
    }

    public C7037() {
        this.f23219 = null;
        this.f23220 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19360() {
        this.f23220 += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f23219.iterator();
        while (it.hasNext()) {
            sb.append((C13748) it.next());
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f23220);
        sb.append(']');
        return sb.toString();
    }
}
