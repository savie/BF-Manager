package l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ܳۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAYE */
/* JADX INFO: loaded from: classes4.dex */
public class C15280 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49940 = AtomicIntegerFieldUpdater.newUpdater(C15280.class, "_size$volatile");
    public volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13043[] f49941;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13043 m36645() {
        InterfaceC13043 interfaceC13043M36642;
        synchronized (this) {
            interfaceC13043M36642 = m36642();
        }
        return interfaceC13043M36642;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36646(AbstractRunnableC17416 abstractRunnableC17416) {
        synchronized (this) {
            if (abstractRunnableC17416.m40896() != null) {
                m36643(abstractRunnableC17416.m40897());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13043 m36648() {
        InterfaceC13043 interfaceC13043M36643;
        synchronized (this) {
            interfaceC13043M36643 = f49940.get(this) > 0 ? m36643(0) : null;
        }
        return interfaceC13043M36643;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36647() {
        return f49940.get(this) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13043 m36642() {
        InterfaceC13043[] interfaceC13043Arr = this.f49941;
        if (interfaceC13043Arr != null) {
            return interfaceC13043Arr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:9:0x003c->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[EDGE_INSN: B:24:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:9:0x003c->B:21:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13043 m36643(int i) {
        int i2;
        int i3;
        InterfaceC13043[] interfaceC13043Arr;
        int i4;
        InterfaceC13043 interfaceC13043;
        InterfaceC13043 interfaceC13044;
        InterfaceC13043 interfaceC13045;
        InterfaceC13043 interfaceC13046;
        InterfaceC13043[] interfaceC13043Arr2 = this.f49941;
        C15243.m36586(interfaceC13043Arr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f49940;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m36640(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC13043 interfaceC13047 = interfaceC13043Arr2[i];
                C15243.m36586(interfaceC13047);
                InterfaceC13043 interfaceC13048 = interfaceC13043Arr2[i5];
                C15243.m36586(interfaceC13048);
                if (((Comparable) interfaceC13047).compareTo(interfaceC13048) < 0) {
                    m36640(i, i5);
                    m36641(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        interfaceC13043Arr = this.f49941;
                        C15243.m36586(interfaceC13043Arr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            interfaceC13045 = interfaceC13043Arr[i4];
                            C15243.m36586(interfaceC13045);
                            interfaceC13046 = interfaceC13043Arr[i3];
                            C15243.m36586(interfaceC13046);
                            if (((Comparable) interfaceC13045).compareTo(interfaceC13046) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        interfaceC13043 = interfaceC13043Arr[i];
                        C15243.m36586(interfaceC13043);
                        interfaceC13044 = interfaceC13043Arr[i4];
                        C15243.m36586(interfaceC13044);
                        if (((Comparable) interfaceC13043).compareTo(interfaceC13044) <= 0) {
                            break;
                        }
                        m36640(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    interfaceC13043Arr = this.f49941;
                    C15243.m36586(interfaceC13043Arr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        interfaceC13045 = interfaceC13043Arr[i4];
                        C15243.m36586(interfaceC13045);
                        interfaceC13046 = interfaceC13043Arr[i3];
                        C15243.m36586(interfaceC13046);
                        if (((Comparable) interfaceC13045).compareTo(interfaceC13046) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    interfaceC13043 = interfaceC13043Arr[i];
                    C15243.m36586(interfaceC13043);
                    interfaceC13044 = interfaceC13043Arr[i4];
                    C15243.m36586(interfaceC13044);
                    if (((Comparable) interfaceC13043).compareTo(interfaceC13044) <= 0) {
                        break;
                        break;
                    }
                    m36640(i, i4);
                    i = i4;
                }
            }
        }
        InterfaceC13043 interfaceC13049 = interfaceC13043Arr2[atomicIntegerFieldUpdater.get(this)];
        C15243.m36586(interfaceC13049);
        interfaceC13049.mo32472((C15280) null);
        interfaceC13049.mo32471(-1);
        interfaceC13043Arr2[atomicIntegerFieldUpdater.get(this)] = null;
        return interfaceC13049;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36644(AbstractRunnableC17416 abstractRunnableC17416) {
        abstractRunnableC17416.mo32472(this);
        InterfaceC13043[] interfaceC13043Arr = this.f49941;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f49940;
        if (interfaceC13043Arr == null) {
            interfaceC13043Arr = new InterfaceC13043[4];
            this.f49941 = interfaceC13043Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= interfaceC13043Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(interfaceC13043Arr, atomicIntegerFieldUpdater.get(this) * 2);
            C15243.m36591(objArrCopyOf, "copyOf(...)");
            interfaceC13043Arr = (InterfaceC13043[]) objArrCopyOf;
            this.f49941 = interfaceC13043Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        interfaceC13043Arr[i] = abstractRunnableC17416;
        abstractRunnableC17416.mo32471(i);
        m36641(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m36641(int i) {
        while (i > 0) {
            InterfaceC13043[] interfaceC13043Arr = this.f49941;
            C15243.m36586(interfaceC13043Arr);
            int i2 = (i - 1) / 2;
            InterfaceC13043 interfaceC13043 = interfaceC13043Arr[i2];
            C15243.m36586(interfaceC13043);
            InterfaceC13043 interfaceC13044 = interfaceC13043Arr[i];
            C15243.m36586(interfaceC13044);
            if (((Comparable) interfaceC13043).compareTo(interfaceC13044) <= 0) {
                return;
            }
            m36640(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m36640(int i, int i2) {
        InterfaceC13043[] interfaceC13043Arr = this.f49941;
        C15243.m36586(interfaceC13043Arr);
        InterfaceC13043 interfaceC13043 = interfaceC13043Arr[i2];
        C15243.m36586(interfaceC13043);
        InterfaceC13043 interfaceC13044 = interfaceC13043Arr[i];
        C15243.m36586(interfaceC13044);
        interfaceC13043Arr[i] = interfaceC13043;
        interfaceC13043Arr[i2] = interfaceC13044;
        interfaceC13043.mo32471(i);
        interfaceC13044.mo32471(i2);
    }
}
