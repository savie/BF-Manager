package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13580 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f43131;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f43132;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43133;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43134;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5135 f43135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43136;

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
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        C5135 c5135 = this.f43135;
        char[] cArr = c5135.f17900;
        if (this.f43131) {
            this.f43131 = false;
            interfaceC12089.mo10258(cArr[c5135.f17898]);
            this.f43133++;
        }
        while (true) {
            int i = this.f43132;
            if (i >= this.f43134) {
                return;
            }
            char c = cArr[i];
            if (c != 0) {
                interfaceC12089.mo10258(c);
                this.f43133++;
            }
            this.f43132++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        boolean z = this.f43131;
        C5135 c5135 = this.f43135;
        if (z) {
            this.f43131 = false;
            this.f43133++;
            interfaceC12089.mo10258(c5135.f17900[c5135.f17898]);
            return true;
        }
        char[] cArr = c5135.f17900;
        while (true) {
            int i = this.f43132;
            if (i >= this.f43134) {
                return false;
            }
            char c = cArr[i];
            if (c != 0) {
                this.f43133++;
                this.f43132 = i + 1;
                interfaceC12089.mo10258(c);
                return true;
            }
            this.f43132 = i + 1;
        }
    }

    public C13580(C5135 c5135) {
        this.f43135 = c5135;
        this.f43132 = 0;
        this.f43134 = c5135.f17898;
        this.f43133 = 0;
        this.f43131 = c5135.f17899;
        this.f43136 = false;
    }

    public C13580(C5135 c5135, int i, int i2, boolean z) {
        this.f43135 = c5135;
        this.f43133 = 0;
        this.f43132 = i;
        this.f43134 = i2;
        this.f43131 = z;
        this.f43136 = true;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f43136 ? 257 : 321;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        boolean z = this.f43136;
        C5135 c5135 = this.f43135;
        if (!z) {
            return c5135.f17896 - this.f43133;
        }
        int i = c5135.f17896;
        long j = i - this.f43133;
        if (c5135.f17899) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c5135.f17898)) * ((double) (this.f43134 - this.f43132)))) + (this.f43131 ? 1L : 0L));
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final C13580 trySplit() {
        int i;
        int i2 = this.f43132;
        int i3 = this.f43134;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C13580 c13580 = new C13580(this.f43135, i2, i4, this.f43131);
        this.f43132 = i4;
        this.f43131 = false;
        this.f43136 = true;
        return c13580;
    }
}
