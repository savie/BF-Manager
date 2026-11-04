package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6212 implements InterfaceC15906 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f21131;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21132;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9367 f21133;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21130 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15906 f21134 = null;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17398.m40861(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17398.m40862(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        InterfaceC15906 interfaceC15906 = this.f21134;
        if (interfaceC15906 != null) {
            ((C3228) interfaceC15906).forEachRemaining((Object) interfaceC0419);
            this.f21134 = null;
        }
        this.f21133.forEachRemaining(interfaceC0419);
        this.f21131 = 0L;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        InterfaceC15906 interfaceC15906 = this.f21134;
        if (interfaceC15906 != null) {
            boolean zTryAdvance = interfaceC15906.tryAdvance((Object) interfaceC0419);
            if (!zTryAdvance) {
                this.f21134 = null;
            }
            return zTryAdvance;
        }
        InterfaceC9367 interfaceC9367 = this.f21133;
        if (!interfaceC9367.hasNext()) {
            return false;
        }
        this.f21131--;
        interfaceC0419.mo2223(interfaceC9367.nextFloat());
        return true;
    }

    public C6212(InterfaceC9367 interfaceC9367, long j, int i) {
        this.f21133 = interfaceC9367;
        this.f21131 = j;
        this.f21132 = i | 16704;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC15906 interfaceC15906 = this.f21134;
        if (interfaceC15906 != null) {
            return interfaceC15906.estimateSize();
        }
        if (!this.f21133.hasNext()) {
            return 0L;
        }
        long j = this.f21131;
        return j >= 0 ? j : C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f21132;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15906 trySplit() {
        InterfaceC9367 interfaceC9367 = this.f21133;
        if (!interfaceC9367.hasNext()) {
            return null;
        }
        long j = this.f21131;
        int iMin = j > 0 ? (int) Math.min(this.f21130, j) : this.f21130;
        float[] fArrCopyOf = new float[iMin];
        int i = 0;
        while (i < iMin && interfaceC9367.hasNext()) {
            fArrCopyOf[i] = interfaceC9367.nextFloat();
            this.f21131--;
            i++;
        }
        if (iMin < this.f21130 && interfaceC9367.hasNext()) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, this.f21130);
            while (interfaceC9367.hasNext() && i < this.f21130) {
                fArrCopyOf[i] = interfaceC9367.nextFloat();
                this.f21131--;
                i++;
            }
        }
        this.f21130 = Math.min(33554432, this.f21130 + 1024);
        C18450.m42990(fArrCopyOf.length, 0, i);
        C3228 c3228 = new C3228(0, i, this.f21132, fArrCopyOf);
        if (interfaceC9367.hasNext()) {
            return c3228;
        }
        this.f21134 = c3228;
        return c3228.trySplit();
    }
}
