package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48937;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f48938;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48939;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48940;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19947 f48941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48942 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3571(int i, Object obj);

    public AbstractC15008(C7952 c7952) {
        this.f48938 = c7952;
        this.f48940 = c7952.f26126;
        this.f48939 = c7952.f26121;
        this.f48937 = c7952.f26122;
    }

    public final boolean hasNext() {
        return this.f48939 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35989() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48939--;
        boolean z = this.f48937;
        C7952 c7952 = this.f48938;
        if (z) {
            this.f48937 = false;
            int i2 = c7952.f26126;
            this.f48942 = i2;
            return i2;
        }
        char[] cArr = c7952.f26123;
        do {
            i = this.f48940 - 1;
            this.f48940 = i;
            if (i < 0) {
                this.f48942 = Integer.MIN_VALUE;
                char c = this.f48941.getChar((-i) - 1);
                int iM25125 = C9927.m25125((int) c);
                int i3 = c7952.f26124;
                while (true) {
                    int i4 = iM25125 & i3;
                    if (c == cArr[i4]) {
                        return i4;
                    }
                    iM25125 = i4 + 1;
                    i3 = c7952.f26124;
                }
            }
        } while (cArr[i] == 0);
        this.f48942 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f48937;
        C7952 c7952 = this.f48938;
        if (z) {
            this.f48937 = false;
            int i2 = c7952.f26126;
            this.f48942 = i2;
            mo3571(i2, obj);
            this.f48939--;
        }
        char[] cArr = c7952.f26123;
        while (this.f48939 != 0) {
            int i3 = this.f48940 - 1;
            this.f48940 = i3;
            if (i3 < 0) {
                this.f48942 = Integer.MIN_VALUE;
                char c = this.f48941.getChar((-i3) - 1);
                int iM25125 = C9927.m25125((int) c);
                int i4 = c7952.f26124;
                while (true) {
                    i = iM25125 & i4;
                    if (c == cArr[i]) {
                        break;
                    }
                    iM25125 = i + 1;
                    i4 = c7952.f26124;
                }
                mo3571(i, obj);
                this.f48939--;
            } else if (cArr[i3] != 0) {
                this.f48942 = i3;
                mo3571(i3, obj);
                this.f48939--;
            }
        }
    }

    public void remove() {
        char c;
        int i = this.f48942;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C7952 c7952 = this.f48938;
        int i2 = c7952.f26126;
        if (i == i2) {
            c7952.f26122 = false;
            c7952.f26116[i2] = null;
        } else {
            int i3 = this.f48940;
            if (i3 >= 0) {
                char[] cArr = c7952.f26123;
                Object[] objArr = c7952.f26116;
                loop0: while (true) {
                    int i4 = (i + 1) & c7952.f26124;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM25125 = C9927.m25125((int) c);
                            int i5 = c7952.f26124;
                            int i6 = iM25125 & i5;
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
                        if (this.f48941 == null) {
                            this.f48941 = new C19947(2);
                        }
                        this.f48941.mo2291(cArr[i4]);
                    }
                    cArr[i] = c;
                    objArr[i] = objArr[i4];
                    i = i4;
                }
                cArr[i] = 0;
                objArr[i] = null;
            } else {
                c7952.mo7436(this.f48941.getChar((-i3) - 1));
                this.f48942 = -1;
                return;
            }
        }
        c7952.f26121--;
        this.f48942 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m35990(InterfaceC1164 interfaceC1164) {
        forEachRemaining((Object) interfaceC1164);
    }
}
