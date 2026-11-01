package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ᩴۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7NA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12847 f58930;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f58931;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12847 f58932;

    public C18491() {
        C12847 c12847M31865 = C12847.m31865(C8614.f29736);
        this.f58932 = c12847M31865;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f58931 = arrayDeque;
        this.f58930 = c12847M31865;
        arrayDeque.addLast(c12847M31865);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42885(AbstractC7202 abstractC7202) {
        this.f58931.addLast(C12847.m31865(abstractC7202));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42888() {
        ArrayDeque arrayDeque = this.f58931;
        ((C12847) arrayDeque.peekLast()).m31866((C12847) arrayDeque.removeLast());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42886(AbstractC17785 abstractC17785) {
        this.f58930.m31866(abstractC17785);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42887(C22019 c22019) {
        C12847 c12847 = (C12847) this.f58931.peekLast();
        this.f58930 = c12847;
        c12847.m31866(c22019);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17785 m42884() {
        return this.f58932;
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f58932, "base");
        c23244M37072.m51284(this.f58931, "stack");
        c23244M37072.m51284(this.f58930, "appendLevel");
        return c23244M37072.toString();
    }
}
