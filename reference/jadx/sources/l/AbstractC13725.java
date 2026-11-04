package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.۬۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H89S */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13725 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f43577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo33543(C0302 c0302);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m33542() {
        return this.f43577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33541(C0302 c0302) throws C18201 {
        mo33543(c0302);
        c0302.m1882(EnumC18947.FOUR);
        this.f43577 = c0302.m1884();
        try {
            c0302.m1879();
            throw new C18201("At least one byte remained after reading the return code. Is this response aligned properly?");
        } catch (EOFException unused) {
        }
    }
}
