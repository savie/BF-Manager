package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public class C4389 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f15817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21040 f15819;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15816 = 1024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC16321 f15820 = null;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17813.m41657(this, consumer);
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
        return C17813.m41658(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16321 mo13998(char[] cArr, int i) {
        C18450.m42990(cArr.length, 0, i);
        return new C3643(0, i, cArr, this.f15818);
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        InterfaceC16321 interfaceC16321 = this.f15820;
        if (interfaceC16321 != null) {
            interfaceC16321.forEachRemaining((Object) interfaceC12089);
            this.f15820 = null;
        }
        this.f15819.forEachRemaining(interfaceC12089);
        this.f15817 = 0L;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        InterfaceC16321 interfaceC16321 = this.f15820;
        if (interfaceC16321 != null) {
            boolean zTryAdvance = interfaceC16321.tryAdvance((Object) interfaceC12089);
            if (!zTryAdvance) {
                this.f15820 = null;
            }
            return zTryAdvance;
        }
        InterfaceC21040 interfaceC21040 = this.f15819;
        if (!interfaceC21040.hasNext()) {
            return false;
        }
        this.f15817--;
        interfaceC12089.mo10258(interfaceC21040.mo5320());
        return true;
    }

    public C4389(InterfaceC21040 interfaceC21040, long j, int i) {
        this.f15819 = interfaceC21040;
        this.f15817 = j;
        if ((i & 4096) != 0) {
            this.f15818 = i | 256;
        } else {
            this.f15818 = i | 16704;
        }
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        InterfaceC16321 interfaceC16321 = this.f15820;
        if (interfaceC16321 != null) {
            return interfaceC16321.estimateSize();
        }
        if (!this.f15819.hasNext()) {
            return 0L;
        }
        long j = this.f15817;
        return j >= 0 ? j : C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f15818;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC16321 trySplit() {
        InterfaceC21040 interfaceC21040 = this.f15819;
        if (!interfaceC21040.hasNext()) {
            return null;
        }
        long j = this.f15817;
        int iMin = j > 0 ? (int) Math.min(this.f15816, j) : this.f15816;
        char[] cArrCopyOf = new char[iMin];
        int i = 0;
        while (i < iMin && interfaceC21040.hasNext()) {
            cArrCopyOf[i] = interfaceC21040.mo5320();
            this.f15817--;
            i++;
        }
        if (iMin < this.f15816 && interfaceC21040.hasNext()) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, this.f15816);
            while (interfaceC21040.hasNext() && i < this.f15816) {
                cArrCopyOf[i] = interfaceC21040.mo5320();
                this.f15817--;
                i++;
            }
        }
        this.f15816 = Math.min(33554432, this.f15816 + 1024);
        InterfaceC16321 interfaceC16321Mo13998 = mo13998(cArrCopyOf, i);
        if (interfaceC21040.hasNext()) {
            return interfaceC16321Mo13998;
        }
        this.f15820 = interfaceC16321Mo13998;
        return ((C3643) interfaceC16321Mo13998).trySplit();
    }
}
