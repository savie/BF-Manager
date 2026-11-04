package l;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24753 implements InterfaceC8409 {
    public final boolean a;
    public final AbstractC15470 b;
    public Supplier c;
    public InterfaceC8409 d;
    public InterfaceC15143 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC10249 h;
    public boolean i;

    public abstract void d();

    public abstract AbstractC24753 e(InterfaceC8409 interfaceC8409);

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public AbstractC24753(AbstractC15470 abstractC15470, Supplier supplier, boolean z) {
        this.b = abstractC15470;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    public AbstractC24753(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z) {
        this.b = abstractC15470;
        this.c = null;
        this.d = interfaceC8409;
        this.a = z;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (InterfaceC8409) this.c.get();
            this.c = null;
        }
    }

    public final boolean a() {
        AbstractC10249 abstractC10249 = this.h;
        if (abstractC10249 == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.c(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC10249.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // l.InterfaceC8409
    public InterfaceC8409 trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        InterfaceC8409 interfaceC8409TrySplit = this.d.trySplit();
        if (interfaceC8409TrySplit == null) {
            return null;
        }
        return e(interfaceC8409TrySplit);
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.f() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // l.InterfaceC8409
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC21614.SIZED.p(this.b.m)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        c();
        int i = this.b.m;
        int i2 = i & ((~i) >> 1) & EnumC21614.j & EnumC21614.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        if (C18105.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
