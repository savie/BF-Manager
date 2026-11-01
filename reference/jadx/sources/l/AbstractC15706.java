package l;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܺۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15706 implements InterfaceC20693 {
    public final boolean a;
    public final AbstractC5752 b;
    public Supplier c;
    public InterfaceC20693 d;
    public InterfaceC19171 e;
    public BooleanSupplier f;
    public long g;
    public AbstractC8097 h;
    public boolean i;

    public abstract void d();

    public abstract AbstractC15706 e(InterfaceC20693 interfaceC20693);

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public AbstractC15706(AbstractC5752 abstractC5752, Supplier supplier, boolean z) {
        this.b = abstractC5752;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    public AbstractC15706(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z) {
        this.b = abstractC5752;
        this.c = null;
        this.d = interfaceC20693;
        this.a = z;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (InterfaceC20693) this.c.get();
            this.c = null;
        }
    }

    public final boolean a() {
        AbstractC8097 abstractC8097 = this.h;
        if (abstractC8097 == null) {
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
        boolean z = j < abstractC8097.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    @Override // l.InterfaceC20693
    public InterfaceC20693 trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        InterfaceC20693 interfaceC20693TrySplit = this.d.trySplit();
        if (interfaceC20693TrySplit == null) {
            return null;
        }
        return e(interfaceC20693TrySplit);
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

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // l.InterfaceC20693
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC2970.SIZED.s(this.b.m)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        c();
        int i = this.b.m;
        int i2 = i & ((~i) >> 1) & EnumC2970.j & EnumC2970.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        if (C21398.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }
}
