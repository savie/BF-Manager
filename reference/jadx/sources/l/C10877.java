package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f36987;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36988;

    public /* synthetic */ C10877(int i) {
        this();
    }

    public C10877() {
        this.f36987 = null;
        this.f36988 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27246() {
        this.f36988 += 1000;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f36987.iterator();
        while (it.hasNext()) {
            sb.append((C23577) it.next());
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f36988);
        sb.append(']');
        return sb.toString();
    }
}
