package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: AAYE */
/* JADX INFO: loaded from: classes2.dex */
public class C6386 {
    public volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC11326[] f21695;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11326 m17530() {
        InterfaceC11326 interfaceC11326M17532;
        synchronized (this) {
            interfaceC11326M17532 = this._size > 0 ? m17532(0) : null;
        }
        return interfaceC11326M17532;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11326 m17534() {
        InterfaceC11326 interfaceC11326M17531;
        synchronized (this) {
            interfaceC11326M17531 = m17531();
        }
        return interfaceC11326M17531;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17535(AbstractRunnableC18193 abstractRunnableC18193) {
        synchronized (this) {
            if (abstractRunnableC18193.m42312() != null) {
                m17532(abstractRunnableC18193.m42313());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m17536() {
        return this._size == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11326 m17531() {
        InterfaceC11326[] interfaceC11326Arr = this.f21695;
        if (interfaceC11326Arr != null) {
            return interfaceC11326Arr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[LOOP:0: B:9:0x0033->B:21:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[EDGE_INSN: B:24:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:9:0x0033->B:21:0x006e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[EDGE_INSN: B:25:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:9:0x0033->B:21:0x006e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11326 m17532(int i) {
        int i2;
        int i3;
        InterfaceC11326[] interfaceC11326Arr;
        int i4;
        InterfaceC11326 interfaceC11326;
        InterfaceC11326 interfaceC11327;
        InterfaceC11326 interfaceC11328;
        InterfaceC11326 interfaceC11329;
        InterfaceC11326[] interfaceC11326Arr2 = this.f21695;
        C13465.m32962(interfaceC11326Arr2);
        this._size--;
        if (i < this._size) {
            m17528(i, this._size);
            int i5 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC11326 interfaceC113210 = interfaceC11326Arr2[i];
                C13465.m32962(interfaceC113210);
                InterfaceC11326 interfaceC113211 = interfaceC11326Arr2[i5];
                C13465.m32962(interfaceC113211);
                if (((Comparable) interfaceC113210).compareTo(interfaceC113211) < 0) {
                    m17528(i, i5);
                    m17529(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= this._size) {
                            break;
                        }
                        interfaceC11326Arr = this.f21695;
                        C13465.m32962(interfaceC11326Arr);
                        i4 = i2 + 2;
                        if (i4 < this._size) {
                            interfaceC11328 = interfaceC11326Arr[i4];
                            C13465.m32962(interfaceC11328);
                            interfaceC11329 = interfaceC11326Arr[i3];
                            C13465.m32962(interfaceC11329);
                            if (((Comparable) interfaceC11328).compareTo(interfaceC11329) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        interfaceC11326 = interfaceC11326Arr[i];
                        C13465.m32962(interfaceC11326);
                        interfaceC11327 = interfaceC11326Arr[i4];
                        C13465.m32962(interfaceC11327);
                        if (((Comparable) interfaceC11326).compareTo(interfaceC11327) <= 0) {
                            break;
                        }
                        m17528(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= this._size) {
                        break;
                        break;
                    }
                    interfaceC11326Arr = this.f21695;
                    C13465.m32962(interfaceC11326Arr);
                    i4 = i2 + 2;
                    if (i4 < this._size) {
                        interfaceC11328 = interfaceC11326Arr[i4];
                        C13465.m32962(interfaceC11328);
                        interfaceC11329 = interfaceC11326Arr[i3];
                        C13465.m32962(interfaceC11329);
                        if (((Comparable) interfaceC11328).compareTo(interfaceC11329) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    interfaceC11326 = interfaceC11326Arr[i];
                    C13465.m32962(interfaceC11326);
                    interfaceC11327 = interfaceC11326Arr[i4];
                    C13465.m32962(interfaceC11327);
                    if (((Comparable) interfaceC11326).compareTo(interfaceC11327) <= 0) {
                        break;
                        break;
                    }
                    m17528(i, i4);
                    i = i4;
                }
            }
        }
        InterfaceC11326 interfaceC113212 = interfaceC11326Arr2[this._size];
        C13465.m32962(interfaceC113212);
        interfaceC113212.mo28391((C6386) null);
        interfaceC113212.mo28390(-1);
        interfaceC11326Arr2[this._size] = null;
        return interfaceC113212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17533(AbstractRunnableC18193 abstractRunnableC18193) {
        abstractRunnableC18193.mo28391(this);
        InterfaceC11326[] interfaceC11326Arr = this.f21695;
        if (interfaceC11326Arr == null) {
            interfaceC11326Arr = new InterfaceC11326[4];
            this.f21695 = interfaceC11326Arr;
        } else if (this._size >= interfaceC11326Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(interfaceC11326Arr, this._size * 2);
            C13465.m32967(objArrCopyOf, "copyOf(this, newSize)");
            interfaceC11326Arr = (InterfaceC11326[]) objArrCopyOf;
            this.f21695 = interfaceC11326Arr;
        }
        int i = this._size;
        this._size = i + 1;
        interfaceC11326Arr[i] = abstractRunnableC18193;
        abstractRunnableC18193.mo28390(i);
        m17529(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m17529(int i) {
        while (i > 0) {
            InterfaceC11326[] interfaceC11326Arr = this.f21695;
            C13465.m32962(interfaceC11326Arr);
            int i2 = (i - 1) / 2;
            InterfaceC11326 interfaceC11326 = interfaceC11326Arr[i2];
            C13465.m32962(interfaceC11326);
            InterfaceC11326 interfaceC11327 = interfaceC11326Arr[i];
            C13465.m32962(interfaceC11327);
            if (((Comparable) interfaceC11326).compareTo(interfaceC11327) <= 0) {
                return;
            }
            m17528(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m17528(int i, int i2) {
        InterfaceC11326[] interfaceC11326Arr = this.f21695;
        C13465.m32962(interfaceC11326Arr);
        InterfaceC11326 interfaceC11326 = interfaceC11326Arr[i2];
        C13465.m32962(interfaceC11326);
        InterfaceC11326 interfaceC11327 = interfaceC11326Arr[i];
        C13465.m32962(interfaceC11327);
        interfaceC11326Arr[i] = interfaceC11326;
        interfaceC11326Arr[i2] = interfaceC11327;
        interfaceC11326.mo28390(i);
        interfaceC11327.mo28390(i2);
    }
}
