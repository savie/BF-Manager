package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6869 implements InterfaceC21040, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f22817;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5135 f22818;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22819;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22820;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14171 f22821;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22822 = -1;

    @Override // java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14326.m34753(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo5320());
    }

    public C6869(C5135 c5135) {
        this.f22818 = c5135;
        this.f22817 = c5135.f17898;
        this.f22819 = c5135.f17896;
        this.f22820 = c5135.f17899;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22819 != 0;
    }

    @Override // l.InterfaceC21040
    /* JADX INFO: renamed from: ᩵᩷ */
    public final char mo5320() {
        int i;
        char c;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22819--;
        C5135 c5135 = this.f22818;
        char[] cArr = c5135.f17900;
        if (this.f22820) {
            this.f22820 = false;
            int i2 = c5135.f17898;
            this.f22822 = i2;
            return cArr[i2];
        }
        do {
            i = this.f22817 - 1;
            this.f22817 = i;
            if (i < 0) {
                this.f22822 = Integer.MIN_VALUE;
                return this.f22821.getChar((-i) - 1);
            }
            c = cArr[i];
        } while (c == 0);
        this.f22822 = i;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        char c;
        int i = this.f22822;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C5135 c5135 = this.f22818;
        int i2 = c5135.f17898;
        if (i == i2) {
            c5135.f17899 = false;
            c5135.f17900[i2] = 0;
        } else {
            int i3 = this.f22817;
            if (i3 >= 0) {
                char[] cArr = c5135.f17900;
                loop0: while (true) {
                    int i4 = (i + 1) & c5135.f17895;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM30015 = C11972.m30015((int) c);
                            int i5 = c5135.f17895;
                            int i6 = iM30015 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f22821 == null) {
                            this.f22821 = new C14171(2);
                        }
                        this.f22821.mo5933(cArr[i4]);
                    }
                    cArr[i] = c;
                    i = i4;
                }
                cArr[i] = 0;
            } else {
                c5135.mo4844(this.f22821.getChar((-i3) - 1));
                this.f22822 = -1;
                return;
            }
        }
        c5135.f17896--;
        this.f22822 = -1;
    }

    @Override // l.InterfaceC24073
    /* JADX INFO: renamed from: ᩷ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C5135 c5135 = this.f22818;
        char[] cArr = c5135.f17900;
        if (this.f22820) {
            this.f22820 = false;
            int i = c5135.f17898;
            this.f22822 = i;
            interfaceC12089.mo10258(cArr[i]);
            this.f22819--;
        }
        while (this.f22819 != 0) {
            int i2 = this.f22817 - 1;
            this.f22817 = i2;
            if (i2 < 0) {
                this.f22822 = Integer.MIN_VALUE;
                interfaceC12089.mo10258(this.f22821.getChar((-i2) - 1));
                this.f22819--;
            } else {
                char c = cArr[i2];
                if (c != 0) {
                    this.f22822 = i2;
                    interfaceC12089.mo10258(c);
                    this.f22819--;
                }
            }
        }
    }
}
