package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۫ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12178 extends AbstractC5274 {
    public final C5980 j;
    public final boolean k;

    public C12178(C5980 c5980, boolean z, AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        super(abstractC5752, interfaceC20693);
        this.k = z;
        this.j = c5980;
    }

    public C12178(C12178 c12178, InterfaceC20693 interfaceC20693) {
        super(c12178, interfaceC20693);
        this.k = c12178.k;
        this.j = c12178.j;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C12178(this, interfaceC20693);
    }

    @Override // l.AbstractC5274
    public final Object h() {
        return this.j.b;
    }

    @Override // l.AbstractC17269
    public final Object a() {
        AbstractC22686 abstractC22686 = this.a;
        InterfaceC7176 interfaceC7176 = (InterfaceC7176) this.j.d.get();
        abstractC22686.f0(this.b, interfaceC7176);
        Object obj = interfaceC7176.get();
        if (this.k) {
            if (obj != null) {
                AbstractC17269 abstractC17269 = this;
                while (abstractC17269 != null) {
                    AbstractC17269 abstractC172610 = (AbstractC17269) abstractC17269.getCompleter();
                    if (abstractC172610 != null && abstractC172610.d != abstractC17269) {
                        g();
                        return obj;
                    }
                    abstractC17269 = abstractC172610;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            C12178 c12178 = (C12178) this.d;
            C12178 c12179 = null;
            while (c12178 != c12179) {
                Object objI = c12178.i();
                if (objI != null && this.j.c.test(objI)) {
                    d(objI);
                    AbstractC17269 abstractC17269 = this;
                    while (abstractC17269 != null) {
                        AbstractC17269 abstractC172610 = (AbstractC17269) abstractC17269.getCompleter();
                        if (abstractC172610 != null && abstractC172610.d != abstractC17269) {
                            g();
                            break;
                        }
                        abstractC17269 = abstractC172610;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                    }
                    break;
                }
                c12179 = c12178;
                c12178 = (C12178) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
