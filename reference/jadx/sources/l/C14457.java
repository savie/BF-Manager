package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public class C14457 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f45494;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45495;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6036 f45496;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45493 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15949 f45497 = null;

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15949 mo34922(int i, int[] iArr) {
        C18450.m42990(iArr.length, 0, i);
        return new C3271(0, i, this.f45495, iArr);
    }

    public C14457(InterfaceC6036 interfaceC6036, long j, int i) {
        this.f45496 = interfaceC6036;
        this.f45494 = j;
        if ((i & 4096) != 0) {
            this.f45495 = i | 256;
        } else {
            this.f45495 = i | 16704;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        InterfaceC15949 interfaceC15949 = this.f45497;
        if (interfaceC15949 != null) {
            boolean zTryAdvance = interfaceC15949.tryAdvance(intConsumer);
            if (!zTryAdvance) {
                this.f45497 = null;
            }
            return zTryAdvance;
        }
        InterfaceC6036 interfaceC6036 = this.f45496;
        if (!interfaceC6036.hasNext()) {
            return false;
        }
        this.f45494--;
        intConsumer.accept(interfaceC6036.nextInt());
        return true;
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        InterfaceC15949 interfaceC15949 = this.f45497;
        if (interfaceC15949 != null) {
            interfaceC15949.forEachRemaining(intConsumer);
            this.f45497 = null;
        }
        this.f45496.forEachRemaining(intConsumer);
        this.f45494 = 0L;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC15949 interfaceC15949 = this.f45497;
        if (interfaceC15949 != null) {
            return interfaceC15949.estimateSize();
        }
        if (!this.f45496.hasNext()) {
            return 0L;
        }
        long j = this.f45494;
        return j >= 0 ? j : C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f45495;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        InterfaceC6036 interfaceC6036 = this.f45496;
        if (!interfaceC6036.hasNext()) {
            return null;
        }
        long j = this.f45494;
        int iMin = j > 0 ? (int) Math.min(this.f45493, j) : this.f45493;
        int[] iArrCopyOf = new int[iMin];
        int i = 0;
        while (i < iMin && interfaceC6036.hasNext()) {
            iArrCopyOf[i] = interfaceC6036.nextInt();
            this.f45494--;
            i++;
        }
        if (iMin < this.f45493 && interfaceC6036.hasNext()) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, this.f45493);
            while (interfaceC6036.hasNext() && i < this.f45493) {
                iArrCopyOf[i] = interfaceC6036.nextInt();
                this.f45494--;
                i++;
            }
        }
        this.f45493 = Math.min(33554432, this.f45493 + 1024);
        InterfaceC15949 interfaceC15949Mo34922 = mo34922(i, iArrCopyOf);
        if (interfaceC6036.hasNext()) {
            return interfaceC15949Mo34922;
        }
        this.f45497 = interfaceC15949Mo34922;
        return ((C3271) interfaceC15949Mo34922).trySplit();
    }
}
