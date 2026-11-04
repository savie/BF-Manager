package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21631 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f69069;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f69070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f69071;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f69072;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14171 f69073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69074 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3081(int i, Object obj);

    public AbstractC21631(C19393 c19393) {
        this.f69070 = c19393;
        this.f69069 = c19393.f62674;
        this.f69071 = c19393.f62670;
        this.f69072 = c19393.f62676;
    }

    public final boolean hasNext() {
        return this.f69071 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49168() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f69071--;
        boolean z = this.f69072;
        C19393 c19393 = this.f69070;
        if (z) {
            this.f69072 = false;
            int i2 = c19393.f62674;
            this.f69074 = i2;
            return i2;
        }
        char[] cArr = c19393.f62668;
        do {
            i = this.f69069 - 1;
            this.f69069 = i;
            if (i < 0) {
                this.f69074 = Integer.MIN_VALUE;
                char c = this.f69073.getChar((-i) - 1);
                int iM30015 = C11972.m30015((int) c);
                int i3 = c19393.f62678;
                while (true) {
                    int i4 = iM30015 & i3;
                    if (c == cArr[i4]) {
                        return i4;
                    }
                    iM30015 = i4 + 1;
                    i3 = c19393.f62678;
                }
            }
        } while (cArr[i] == 0);
        this.f69074 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f69072;
        C19393 c19393 = this.f69070;
        if (z) {
            this.f69072 = false;
            int i2 = c19393.f62674;
            this.f69074 = i2;
            mo3081(i2, obj);
            this.f69071--;
        }
        char[] cArr = c19393.f62668;
        while (this.f69071 != 0) {
            int i3 = this.f69069 - 1;
            this.f69069 = i3;
            if (i3 < 0) {
                this.f69074 = Integer.MIN_VALUE;
                char c = this.f69073.getChar((-i3) - 1);
                int iM30015 = C11972.m30015((int) c);
                int i4 = c19393.f62678;
                while (true) {
                    i = iM30015 & i4;
                    if (c == cArr[i]) {
                        break;
                    }
                    iM30015 = i + 1;
                    i4 = c19393.f62678;
                }
                mo3081(i, obj);
                this.f69071--;
            } else if (cArr[i3] != 0) {
                this.f69074 = i3;
                mo3081(i3, obj);
                this.f69071--;
            }
        }
    }

    public void remove() {
        char c;
        int i = this.f69074;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C19393 c19393 = this.f69070;
        int i2 = c19393.f62674;
        if (i == i2) {
            c19393.f62676 = false;
            c19393.f62673[i2] = null;
        } else {
            int i3 = this.f69069;
            if (i3 >= 0) {
                char[] cArr = c19393.f62668;
                Object[] objArr = c19393.f62673;
                loop0: while (true) {
                    int i4 = (i + 1) & c19393.f62678;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM30015 = C11972.m30015((int) c);
                            int i5 = c19393.f62678;
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
                        if (this.f69073 == null) {
                            this.f69073 = new C14171(2);
                        }
                        this.f69073.mo5933(cArr[i4]);
                    }
                    cArr[i] = c;
                    objArr[i] = objArr[i4];
                    i = i4;
                }
                cArr[i] = 0;
                objArr[i] = null;
            } else {
                c19393.mo11585(this.f69073.getChar((-i3) - 1));
                this.f69074 = -1;
                return;
            }
        }
        c19393.f62670--;
        this.f69074 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m49169(InterfaceC12089 interfaceC12089) {
        forEachRemaining((Object) interfaceC12089);
    }
}
