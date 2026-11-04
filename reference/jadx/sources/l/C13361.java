package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13361 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f42595;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f42596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4214 f42597;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2175 f42599;

    public C13361(C2175 c2175, EnumC13908 enumC13908, Predicate predicate) {
        this.f42595 = enumC13908;
        this.f42596 = predicate;
        this.f42599 = c2175;
        this.f42597 = c2175.f7155;
        this.f42598 = c2175.f7156;
        m32938();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C4214 c4214;
        if (this.f42598 != this.f42599.f7156 && (c4214 = this.f42597) != null && !c4214.f15399.mo7485(c4214.f15400)) {
            C4214 c4215 = this.f42597;
            if (c4215 != null) {
                this.f42597 = c4215.f15398;
            }
            m32938();
            this.f42598 = this.f42599.f7156;
        }
        return this.f42597 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4214 c4214 = this.f42597;
        AbstractC11781 abstractC11781 = c4214 == null ? null : c4214.f15400;
        if (c4214 != null) {
            this.f42597 = c4214.f15398;
        }
        m32938();
        return abstractC11781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32938() {
        Predicate predicate;
        C2175 c2175;
        while (true) {
            C4214 c4214 = this.f42597;
            predicate = this.f42596;
            if (c4214 == null || predicate == null || predicate.test(c4214.f15400)) {
                break;
            } else {
                this.f42597 = this.f42597.f15398;
            }
        }
        if (this.f42595 == EnumC13908.RECURSIVE) {
            while (this.f42597 == null && (c2175 = this.f42599.f7157) != null) {
                this.f42599 = c2175;
                this.f42597 = c2175.f7155;
                this.f42598 = c2175.f7156;
                while (true) {
                    C4214 c4215 = this.f42597;
                    if (c4215 == null || predicate == null || predicate.test(c4215.f15400)) {
                        break;
                    } else {
                        this.f42597 = this.f42597.f15398;
                    }
                }
            }
        }
    }
}
