package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩻ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7NA */
/* JADX INFO: loaded from: classes.dex */
public final class C25136 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22898 f81275;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f81276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22898 f81277;

    public C25136() {
        C22898 c22898M51629 = C22898.m51629(C16184.f52525);
        this.f81277 = c22898M51629;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f81276 = arrayDeque;
        this.f81275 = c22898M51629;
        arrayDeque.addLast(c22898M51629);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56043(AbstractC3506 abstractC3506) {
        this.f81276.addLast(C22898.m51629(abstractC3506));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56046() {
        ArrayDeque arrayDeque = this.f81276;
        ((C22898) arrayDeque.peekLast()).m51630((C22898) arrayDeque.removeLast());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56044(AbstractC11709 abstractC11709) {
        this.f81275.m51630(abstractC11709);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56045(C22152 c22152) {
        C22898 c22898 = (C22898) this.f81276.peekLast();
        this.f81275 = c22898;
        c22898.m51630(c22152);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11709 m56042() {
        return this.f81277;
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f81277, "base");
        c3179M46714.m10379(this.f81276, "stack");
        c3179M46714.m10379(this.f81275, "appendLevel");
        return c3179M46714.toString();
    }
}
