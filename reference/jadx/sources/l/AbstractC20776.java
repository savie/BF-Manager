package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.᩷ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H89S */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20776 extends AbstractC10872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67578;

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo5740(C15132 c15132);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46763() {
        return this.f67578;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46764(C15132 c15132) throws C22893 {
        mo5740(c15132);
        c15132.m36284(EnumC17953.FOUR);
        this.f67578 = c15132.m36288();
        try {
            c15132.m36282();
            throw new C22893("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }
}
