package l;

import java.util.Queue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes3.dex */
public class C9126 extends AbstractC10537 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Predicate f31064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19003 f31065 = new C19003();

    public C9126(C20414 c20414, Predicate predicate) {
        this.f31064 = predicate;
        this.f36079 = c20414.f66167;
        c20414.f66167 = this;
    }

    @Override // l.AbstractC10537
    /* JADX INFO: renamed from: ۙ */
    public final void mo20357(C11948 c11948) {
        Predicate predicate;
        if (c11948.m29760(EnumC0264.NON_DEFERRABLE) || ((predicate = this.f31064) != null && !predicate.test(c11948))) {
            this.f36079.mo20357(c11948);
        } else {
            this.f31065.m43723(c11948);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Queue m23454() {
        return this.f31065;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23455(Predicate predicate) {
        while (true) {
            C11948 c11948 = (C11948) this.f31065.m43727();
            if (c11948 != null) {
                if (predicate.test(c11948)) {
                    this.f36079.mo20357(c11948);
                }
            } else {
                this.f31065 = null;
                return;
            }
        }
    }
}
