package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩶֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes5.dex */
public final class C20937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f66985 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f66986 = new ArrayDeque();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14223 m47870() {
        C14223 c14223 = (C14223) this.f66986.removeFirst();
        this.f66985.push(c14223);
        return c14223;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14223 m47871() {
        return (C14223) this.f66986.peekFirst();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47869() {
        return this.f66986.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47868(int i, int i2, long j) {
        C14223 c14223;
        ArrayDeque arrayDeque = this.f66985;
        if (!arrayDeque.isEmpty()) {
            c14223 = (C14223) arrayDeque.pop();
        } else {
            c14223 = new C14223();
            c14223.f44944 = j;
            c14223.f44942 = i;
            c14223.f44943 = i2;
        }
        c14223.f44944 = j;
        c14223.f44942 = i;
        c14223.f44943 = i2;
        this.f66986.addLast(c14223);
    }
}
