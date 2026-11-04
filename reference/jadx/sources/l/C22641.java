package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes.dex */
public class C22641 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f73546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f73547;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15224 f73548;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f73545 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC2546 f73549 = null;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC2546 mo45321(int i, Object[] objArr) {
        C18450.m42990(objArr.length, 0, i);
        return new C7021(0, i, this.f73547, objArr);
    }

    public C22641(InterfaceC15224 interfaceC15224, long j, int i) {
        this.f73548 = interfaceC15224;
        this.f73546 = j;
        if ((i & 4096) != 0) {
            this.f73547 = i;
        } else {
            this.f73547 = i | 16448;
        }
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC2546 interfaceC2546 = this.f73549;
        if (interfaceC2546 != null) {
            boolean zTryAdvance = interfaceC2546.tryAdvance(consumer);
            if (!zTryAdvance) {
                this.f73549 = null;
            }
            return zTryAdvance;
        }
        InterfaceC15224 interfaceC15224 = this.f73548;
        if (!interfaceC15224.hasNext()) {
            return false;
        }
        this.f73546--;
        consumer.accept(interfaceC15224.next());
        return true;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC2546 interfaceC2546 = this.f73549;
        if (interfaceC2546 != null) {
            interfaceC2546.forEachRemaining(consumer);
            this.f73549 = null;
        }
        C22581.forEachRemaining(this.f73548, consumer);
        this.f73546 = 0L;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC2546 interfaceC2546 = this.f73549;
        if (interfaceC2546 != null) {
            return interfaceC2546.estimateSize();
        }
        if (!this.f73548.hasNext()) {
            return 0L;
        }
        long j = this.f73546;
        return j >= 0 ? j : C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f73547;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC15224 interfaceC15224 = this.f73548;
        if (!interfaceC15224.hasNext()) {
            return null;
        }
        long j = this.f73546;
        int iMin = j > 0 ? (int) Math.min(this.f73545, j) : this.f73545;
        Object[] objArrCopyOf = new Object[iMin];
        int i = 0;
        while (i < iMin && interfaceC15224.hasNext()) {
            objArrCopyOf[i] = interfaceC15224.next();
            this.f73546--;
            i++;
        }
        if (iMin < this.f73545 && interfaceC15224.hasNext()) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, this.f73545);
            while (interfaceC15224.hasNext() && i < this.f73545) {
                objArrCopyOf[i] = interfaceC15224.next();
                this.f73546--;
                i++;
            }
        }
        this.f73545 = Math.min(33554432, this.f73545 + 1024);
        InterfaceC2546 interfaceC2546Mo45321 = mo45321(i, objArrCopyOf);
        if (interfaceC15224.hasNext()) {
            return interfaceC2546Mo45321;
        }
        this.f73549 = interfaceC2546Mo45321;
        return ((C7021) interfaceC2546Mo45321).trySplit();
    }
}
