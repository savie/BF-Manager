package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.math.ec.custom.sec.SecT239Field;

/* JADX INFO: renamed from: l.ۡ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D97F */
/* JADX INFO: loaded from: classes4.dex */
public class C9407 implements InterfaceC5412 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30540 = 0;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30542;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f30536 = AtomicLongFieldUpdater.newUpdater(C9407.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f30534 = AtomicLongFieldUpdater.newUpdater(C9407.class, "receivers$volatile");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f30541 = AtomicLongFieldUpdater.newUpdater(C9407.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f30538 = AtomicLongFieldUpdater.newUpdater(C9407.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30533 = AtomicReferenceFieldUpdater.newUpdater(C9407.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30537 = AtomicReferenceFieldUpdater.newUpdater(C9407.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30539 = AtomicReferenceFieldUpdater.newUpdater(C9407.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30535 = AtomicReferenceFieldUpdater.newUpdater(C9407.class, Object.class, "_closeCause$volatile");

    static {
        AtomicReferenceFieldUpdater.newUpdater(C9407.class, Object.class, "closeHandler$volatile");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean mo24782() {
        return false;
    }

    public C9407(int i) {
        this.f30542 = i;
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        int i2 = C8662.f28287;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : C25227.FOREVER_NS : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f30541.get(this);
        C10631 c10631 = new C10631(0L, null, this, 3);
        this.sendSegment$volatile = c10631;
        this.receiveSegment$volatile = c10631;
        if (m24777()) {
            c10631 = C8662.f28288;
            C15243.m36587((Object) c10631, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c10631;
        this._closeCause$volatile = C8662.f28272;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m24780() {
        return f30536.get(this) & SecT239Field.M60;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final boolean m24771(long j) {
        return j < f30541.get(this) || j < f30534.get(this) + ((long) this.f30542);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private final boolean m24777() {
        long j = f30541.get(this);
        return j == 0 || j == C25227.FOREVER_NS;
    }

    @Override // l.InterfaceC5412
    /* JADX INFO: renamed from: ۙ */
    public Object mo16138(C14115 c14115) {
        C10631 c10631;
        C10631 c10632;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30536;
        long j = atomicLongFieldUpdater.get(this);
        boolean zM24767 = m24767(j, false);
        long j2 = SecT239Field.M60;
        if (zM24767 ? false : !m24771(j & SecT239Field.M60)) {
            return C21820.f69560;
        }
        Object obj = C8662.f28278;
        C10631 c10633 = (C10631) f30533.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zM24768 = m24767(andIncrement, false);
            int i = C8662.f28287;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (c10633.f31168 != j5) {
                C10631 c10631M24774 = m24774(this, j5, c10633);
                if (c10631M24774 != null) {
                    c10631 = c10631M24774;
                } else if (zM24768) {
                    return new C13882(m24784());
                }
                j2 = SecT239Field.M60;
            } else {
                c10631 = c10633;
            }
            C10631 c10634 = c10631;
            int iM24759 = m24759(this, c10631, i2, c14115, j3, obj, zM24768);
            if (iM24759 == 0) {
                c10634.m32963();
                return C11471.f36082;
            }
            if (iM24759 == 1) {
                return C11471.f36082;
            }
            if (iM24759 == 2) {
                if (zM24768) {
                    c10634.m25154();
                    return new C13882(m24784());
                }
                InterfaceC6426 interfaceC6426 = obj instanceof InterfaceC6426 ? (InterfaceC6426) obj : null;
                if (interfaceC6426 != null) {
                    c10632 = c10634;
                    interfaceC6426.mo18187(c10632, i2 + i);
                } else {
                    c10632 = c10634;
                }
                c10632.m25154();
                return C21820.f69560;
            }
            if (iM24759 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM24759 == 4) {
                if (j3 < f30534.get(this)) {
                    c10634.m32963();
                }
                return new C13882(m24784());
            }
            if (iM24759 == 5) {
                c10634.m32963();
            }
            c10633 = c10634;
            j2 = SecT239Field.M60;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m24783(C14115 c14115) {
        C10631 c10631;
        C10631 c10632;
        Object obj = C8662.f28274;
        C10631 c10633 = (C10631) f30533.get(this);
        while (true) {
            long andIncrement = f30536.getAndIncrement(this);
            long j = andIncrement & SecT239Field.M60;
            boolean zM24767 = m24767(andIncrement, false);
            int i = C8662.f28287;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c10633.f31168 != j3) {
                C10631 c10631M24774 = m24774(this, j3, c10633);
                if (c10631M24774 != null) {
                    c10631 = c10631M24774;
                } else if (zM24767) {
                    return new C13882(m24784());
                }
            } else {
                c10631 = c10633;
            }
            C10631 c10634 = c10631;
            int iM24759 = m24759(this, c10631, i2, c14115, j, obj, zM24767);
            if (iM24759 == 0) {
                c10634.m32963();
                return C11471.f36082;
            }
            if (iM24759 == 1) {
                return C11471.f36082;
            }
            if (iM24759 == 2) {
                if (zM24767) {
                    c10634.m25154();
                    return new C13882(m24784());
                }
                InterfaceC6426 interfaceC6426 = obj instanceof InterfaceC6426 ? (InterfaceC6426) obj : null;
                if (interfaceC6426 != null) {
                    c10632 = c10634;
                    interfaceC6426.mo18187(c10632, i2 + i);
                } else {
                    c10632 = c10634;
                }
                m24779((c10632.f31168 * j2) + ((long) i2));
                return C11471.f36082;
            }
            if (iM24759 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM24759 == 4) {
                if (j < f30534.get(this)) {
                    c10634.m32963();
                }
                return new C13882(m24784());
            }
            if (iM24759 == 5) {
                c10634.m32963();
            }
            c10633 = c10634;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m24759(C9407 c9407, C10631 c10631, int i, C14115 c14115, long j, Object obj, boolean z) {
        c10631.m27121(i, c14115);
        if (z) {
            return c9407.m24760(c10631, i, c14115, j, obj, z);
        }
        Object objM27124 = c10631.m27124(i);
        if (objM27124 == null) {
            if (c9407.m24771(j)) {
                if (c10631.m27123(i, null, C8662.f28274)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (c10631.m27123(i, null, obj)) {
                    return 2;
                }
            }
        } else if (objM27124 instanceof InterfaceC6426) {
            c10631.m27119(i);
            if (c9407.m24769(objM27124, c14115)) {
                c10631.m27120(i, (Object) C8662.f28276);
                return 0;
            }
            if (c10631.m27118(i, C8662.f28279) == C8662.f28279) {
                return 5;
            }
            c10631.m27122(i, true);
            return 5;
        }
        return c9407.m24760(c10631, i, c14115, j, obj, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m24760(C10631 c10631, int i, C14115 c14115, long j, Object obj, boolean z) {
        while (true) {
            Object objM27124 = c10631.m27124(i);
            if (objM27124 != null) {
                if (objM27124 != C8662.f28275) {
                    if (objM27124 != C8662.f28279) {
                        if (objM27124 == C8662.f28281) {
                            c10631.m27119(i);
                            return 5;
                        }
                        if (objM27124 == C8662.m23330()) {
                            c10631.m27119(i);
                            m24758();
                            return 4;
                        }
                        c10631.m27119(i);
                        if (objM27124 instanceof C1683) {
                            objM27124 = ((C1683) objM27124).f5789;
                        }
                        if (m24769(objM27124, c14115)) {
                            c10631.m27120(i, (Object) C8662.f28276);
                            return 0;
                        }
                        if (c10631.m27118(i, C8662.f28279) != C8662.f28279) {
                            c10631.m27122(i, true);
                        }
                        return 5;
                    }
                    c10631.m27119(i);
                    return 5;
                }
                if (c10631.m27123(i, objM27124, C8662.f28274)) {
                    break;
                }
            } else if (!m24771(j) || z) {
                if (z) {
                    if (c10631.m27123(i, null, C8662.f28278)) {
                        c10631.m27122(i, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (c10631.m27123(i, null, obj)) {
                        return 2;
                    }
                }
            } else if (c10631.m27123(i, null, C8662.f28274)) {
                break;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final boolean m24769(Object obj, C14115 c14115) {
        if (obj instanceof InterfaceC19010) {
            return ((InterfaceC19010) obj).mo21307(this, c14115);
        }
        if (obj instanceof C12869) {
            C8662.m23318(null, C21820.m49471(c14115), null);
            throw null;
        }
        if (obj instanceof C10153) {
            return ((C10153) obj).m26264(c14115);
        }
        if (obj instanceof InterfaceC11492) {
            return C8662.m23318((InterfaceC11492) obj, c14115, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24779(long j) {
        C10631 c10631 = (C10631) f30537.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f30534;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f30542) + j2, f30541.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = C8662.f28287;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c10631.f31168 != j4) {
                    C10631 c10631M24763 = m24763(j4, c10631);
                    if (c10631M24763 != null) {
                        c10631 = c10631M24763;
                    }
                }
                if (m24762(c10631, i, j2, null) != C8662.f28283) {
                    c10631.m32963();
                } else if (j2 < m24780()) {
                    c10631.m32963();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m24762(C10631 c10631, int i, long j, Object obj) {
        Object objM27124 = c10631.m27124(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30536;
        if (objM27124 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & SecT239Field.M60)) {
                if (obj == null) {
                    return C8662.f28284;
                }
                if (c10631.m27123(i, objM27124, obj)) {
                    m24772();
                    return C8662.f28273;
                }
            }
        } else if (objM27124 == C8662.f28274 && c10631.m27123(i, objM27124, C8662.f28276)) {
            m24772();
            return c10631.m27127(i);
        }
        while (true) {
            Object objM27125 = c10631.m27124(i);
            if (objM27125 == null || objM27125 == C8662.f28275) {
                if (j < (atomicLongFieldUpdater.get(this) & SecT239Field.M60)) {
                    if (c10631.m27123(i, objM27125, C8662.f28281)) {
                        m24772();
                        return C8662.f28283;
                    }
                } else {
                    if (obj == null) {
                        return C8662.f28284;
                    }
                    if (c10631.m27123(i, objM27125, obj)) {
                        m24772();
                        return C8662.f28273;
                    }
                }
            } else if (objM27125 == C8662.f28274) {
                if (c10631.m27123(i, objM27125, C8662.f28276)) {
                    m24772();
                    return c10631.m27127(i);
                }
            } else {
                if (objM27125 != C8662.f28278 && objM27125 != C8662.f28281) {
                    if (objM27125 != C8662.m23330()) {
                        if (objM27125 != C8662.f28282 && c10631.m27123(i, objM27125, C8662.f28280)) {
                            boolean z = objM27125 instanceof C1683;
                            if (z) {
                                objM27125 = ((C1683) objM27125).f5789;
                            }
                            if (m24768(objM27125, c10631, i)) {
                                c10631.m27120(i, (Object) C8662.f28276);
                                m24772();
                                return c10631.m27127(i);
                            }
                            c10631.m27120(i, (Object) C8662.f28278);
                            c10631.m27122(i, false);
                            if (z) {
                                m24772();
                            }
                            return C8662.f28283;
                        }
                    } else {
                        m24772();
                        return C8662.f28283;
                    }
                }
                return C8662.f28283;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final boolean m24768(Object obj, C10631 c10631, int i) {
        if (obj instanceof InterfaceC11492) {
            return C8662.m23317((InterfaceC11492) obj, C11471.f36082);
        }
        if (obj instanceof InterfaceC19010) {
            C11471 c11471 = C11471.f36082;
            EnumC1111 enumC1111M21306 = ((C7823) obj).m21306(this);
            if (enumC1111M21306 == EnumC1111.REREGISTER) {
                c10631.m27119(i);
            }
            return enumC1111M21306 == EnumC1111.SUCCESSFUL;
        }
        if (obj instanceof C1205) {
            C8662.m23317(null, Boolean.TRUE);
            throw null;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m24772() {
        Object objM9578;
        if (m24777()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30539;
        C10631 c10631 = (C10631) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f30541.getAndIncrement(this);
            long j = andIncrement / ((long) C8662.f28287);
            if (m24780() <= andIncrement) {
                if (c10631.f31168 < j && c10631.m32960() != null) {
                    m24775(j, c10631);
                }
                m24766(this);
                return;
            }
            if (c10631.f31168 != j) {
                C2696 c2696 = C2696.f8574;
                while (true) {
                    objM9578 = C2931.m9578(c10631, j, c2696);
                    if (!C2931.m9582(objM9578)) {
                        AbstractC9642 abstractC9642M9580 = C2931.m9580(objM9578);
                        while (true) {
                            AbstractC9642 abstractC9642 = (AbstractC9642) atomicReferenceFieldUpdater.get(this);
                            if (abstractC9642.f31168 >= abstractC9642M9580.f31168) {
                                break;
                            }
                            if (!abstractC9642M9580.m25156()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC9642, abstractC9642M9580)) {
                                    if (!abstractC9642.m25153()) {
                                        break;
                                    }
                                    abstractC9642.m32961();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC9642);
                            if (abstractC9642M9580.m25153()) {
                                abstractC9642M9580.m32961();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C10631 c10632 = null;
                if (C2931.m9582(objM9578)) {
                    m24758();
                    m24775(j, c10631);
                    m24766(this);
                } else {
                    C10631 c10633 = (C10631) C2931.m9580(objM9578);
                    long j2 = c10633.f31168;
                    if (j2 > j) {
                        long j3 = j2 * ((long) C8662.f28287);
                        if (f30541.compareAndSet(this, andIncrement + 1, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f30538;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & SkeinEngine.UbiTweak.T1_FIRST) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & SkeinEngine.UbiTweak.T1_FIRST) != 0) {
                                }
                            }
                        } else {
                            m24766(this);
                        }
                    } else {
                        c10632 = c10633;
                    }
                }
                if (c10632 == null) {
                    continue;
                } else {
                    c10631 = c10632;
                }
            }
            int i = (int) (andIncrement % ((long) C8662.f28287));
            Object objM27124 = c10631.m27124(i);
            boolean z = objM27124 instanceof InterfaceC6426;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f30534;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c10631.m27123(i, objM27124, C8662.f28282)) {
                while (true) {
                    Object objM27125 = c10631.m27124(i);
                    if (objM27125 instanceof InterfaceC6426) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c10631.m27123(i, objM27125, new C1683((InterfaceC6426) objM27125))) {
                                m24766(this);
                                return;
                            }
                        } else if (c10631.m27123(i, objM27125, C8662.f28282)) {
                            if (!m24768(objM27125, c10631, i)) {
                                c10631.m27120(i, (Object) C8662.f28278);
                                c10631.m27122(i, false);
                                break;
                            } else {
                                c10631.m27120(i, (Object) C8662.f28274);
                                m24766(this);
                                return;
                            }
                        }
                    } else {
                        if (objM27125 == C8662.f28278) {
                            break;
                        }
                        if (objM27125 == null) {
                            if (c10631.m27123(i, objM27125, C8662.f28275)) {
                                m24766(this);
                                return;
                            }
                        } else if (objM27125 == C8662.f28274 || objM27125 == C8662.f28281 || objM27125 == C8662.f28276 || objM27125 == C8662.f28279 || objM27125 == C8662.m23330()) {
                            m24766(this);
                            return;
                        } else if (objM27125 != C8662.f28280) {
                            throw new IllegalStateException(("Unexpected cell state: " + objM27125).toString());
                        }
                    }
                }
                m24766(this);
            } else if (m24768(objM27124, c10631, i)) {
                c10631.m27120(i, (Object) C8662.f28274);
                m24766(this);
                return;
            } else {
                c10631.m27120(i, (Object) C8662.f28278);
                c10631.m27122(i, false);
                m24766(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24766(C9407 c9407) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30538;
        if ((atomicLongFieldUpdater.addAndGet(c9407, 1L) & SkeinEngine.UbiTweak.T1_FIRST) != 0) {
            while ((atomicLongFieldUpdater.get(c9407) & SkeinEngine.UbiTweak.T1_FIRST) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24785(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (m24777()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f30541;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = C8662.f28286;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f30538;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, (j2 & 4611686018427387903L) + SkeinEngine.UbiTweak.T1_FIRST));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & SkeinEngine.UbiTweak.T1_FIRST) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + SkeinEngine.UbiTweak.T1_FIRST);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7171 m24781() {
        return new C10153(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m24778() {
        return (Throwable) f30535.get(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Throwable m24784() {
        Throwable thM24778 = m24778();
        return thM24778 == null ? new C19582("Channel was closed") : thM24778;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final C10631 m24776(long j) {
        long j2;
        Object obj = f30539.get(this);
        C10631 c10631 = (C10631) f30533.get(this);
        if (c10631.f31168 > ((C10631) obj).f31168) {
            obj = c10631;
        }
        C10631 c10632 = (C10631) f30537.get(this);
        if (c10632.f31168 > ((C10631) obj).f31168) {
            obj = c10632;
        }
        C10631 c10633 = (C10631) C2931.m9581((AbstractC13372) obj);
        if (mo24782()) {
            C10631 c10634 = c10633;
            loop0: while (true) {
                int i = C8662.f28287 - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (c10634.f31168 * ((long) C8662.f28287)) + ((long) i);
                        if (j2 >= f30534.get(this)) {
                            while (true) {
                                Object objM27124 = c10634.m27124(i);
                                if (objM27124 != null && objM27124 != C8662.f28275) {
                                    if (objM27124 != C8662.f28274) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (c10634.m27123(i, objM27124, C8662.m23330())) {
                                    c10634.m25154();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        c10634 = (C10631) c10634.m32964();
                        if (c10634 == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                m24779(j2);
            }
        }
        Object objM40262 = null;
        loop3: for (C10631 c10635 = c10633; c10635 != null; c10635 = (C10631) c10635.m32964()) {
            for (int i2 = C8662.f28287 - 1; -1 < i2; i2--) {
                if ((c10635.f31168 * ((long) C8662.f28287)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM27125 = c10635.m27124(i2);
                    if (objM27125 != null && objM27125 != C8662.f28275) {
                        if (!(objM27125 instanceof C1683)) {
                            if (!(objM27125 instanceof InterfaceC6426)) {
                                break;
                            }
                            if (c10635.m27123(i2, objM27125, C8662.m23330())) {
                                objM40262 = C17101.m40262(objM40262, objM27125);
                                c10635.m27122(i2, true);
                                break;
                            }
                        } else {
                            if (c10635.m27123(i2, objM27125, C8662.m23330())) {
                                objM40262 = C17101.m40262(objM40262, ((C1683) objM27125).f5789);
                                c10635.m27122(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c10635.m27123(i2, objM27125, C8662.m23330())) {
                            c10635.m25154();
                            break;
                        }
                    }
                }
            }
        }
        if (objM40262 != null) {
            if (!(objM40262 instanceof ArrayList)) {
                m24765((InterfaceC6426) objM40262, true);
                return c10633;
            }
            ArrayList arrayList = (ArrayList) objM40262;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m24765((InterfaceC6426) arrayList.get(size), true);
            }
        }
        return c10633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m24765(InterfaceC6426 interfaceC6426, boolean z) {
        Throwable thM24784;
        if (interfaceC6426 instanceof C1205) {
            throw null;
        }
        if (interfaceC6426 instanceof InterfaceC11492) {
            InterfaceC4825 interfaceC4825 = (InterfaceC4825) interfaceC6426;
            if (z) {
                thM24784 = m24778();
                if (thM24784 == null) {
                    thM24784 = new C22566("Channel was closed");
                }
            } else {
                thM24784 = m24784();
            }
            interfaceC4825.mo8188(C19676.m45347(thM24784));
            return;
        }
        if (interfaceC6426 instanceof C12869) {
            m24778();
            throw null;
        }
        if (interfaceC6426 instanceof C10153) {
            ((C10153) interfaceC6426).m26263();
        } else if (interfaceC6426 instanceof InterfaceC19010) {
            ((InterfaceC19010) interfaceC6426).mo21307(this, C8662.m23330());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC6426).toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m24758() {
        m24767(f30536.get(this), false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m24786() {
        return m24767(f30536.get(this), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final boolean m24767(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f30534;
            if (i == 2) {
                m24776(j & SecT239Field.M60);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30537;
                        C10631 c10631M24763 = (C10631) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (m24780() <= j2) {
                            break;
                        }
                        long j3 = C8662.f28287;
                        long j4 = j2 / j3;
                        if (c10631M24763.f31168 != j4 && (c10631M24763 = m24763(j4, c10631M24763)) == null) {
                            if (((C10631) atomicReferenceFieldUpdater.get(this)).f31168 < j4) {
                                break;
                            }
                        } else {
                            c10631M24763.m32963();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object objM27124 = c10631M24763.m27124(i2);
                                if (objM27124 != null && objM27124 != C8662.f28275) {
                                    if (objM27124 != C8662.f28274 && (objM27124 == C8662.f28278 || objM27124 == C8662.m23330() || objM27124 == C8662.f28276 || objM27124 == C8662.f28281 || (objM27124 != C8662.f28282 && (objM27124 == C8662.f28280 || j2 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (c10631M24763.m27123(i2, objM27124, C8662.f28281)) {
                                    m24772();
                                    break;
                                }
                            }
                            f30534.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(C13645.m33382(i, "unexpected close status: ").toString());
                }
                C10631 c10631M24776 = m24776(j & SecT239Field.M60);
                Object objM40262 = null;
                loop0: do {
                    for (int i3 = C8662.f28287 - 1; -1 < i3; i3--) {
                        long j5 = (c10631M24776.f31168 * ((long) C8662.f28287)) + ((long) i3);
                        while (true) {
                            Object objM27125 = c10631M24776.m27124(i3);
                            if (objM27125 == C8662.f28276) {
                                break loop0;
                            }
                            if (objM27125 != C8662.f28274) {
                                if (objM27125 != C8662.f28275 && objM27125 != null) {
                                    if (!(objM27125 instanceof InterfaceC6426) && !(objM27125 instanceof C1683)) {
                                        if (objM27125 == C8662.f28282 || objM27125 == C8662.f28280) {
                                            break loop0;
                                        }
                                        if (objM27125 != C8662.f28282) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC6426 interfaceC6426 = objM27125 instanceof C1683 ? ((C1683) objM27125).f5789 : (InterfaceC6426) objM27125;
                                        if (c10631M24776.m27123(i3, objM27125, C8662.m23330())) {
                                            objM40262 = C17101.m40262(objM40262, interfaceC6426);
                                            c10631M24776.m27119(i3);
                                            c10631M24776.m25154();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c10631M24776.m27123(i3, objM27125, C8662.m23330())) {
                                        c10631M24776.m25154();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c10631M24776.m27123(i3, objM27125, C8662.m23330())) {
                                    c10631M24776.m27119(i3);
                                    c10631M24776.m25154();
                                    break;
                                }
                            }
                        }
                    }
                    c10631M24776 = (C10631) c10631M24776.m32964();
                } while (c10631M24776 != null);
                if (objM40262 != null) {
                    if (objM40262 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM40262;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m24765((InterfaceC6426) arrayList.get(size), false);
                        }
                    } else {
                        m24765((InterfaceC6426) objM40262, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C10631 m24774(C9407 c9407, long j, C10631 c10631) {
        Object objM9578;
        long j2;
        long j3;
        int i;
        int i2 = C8662.f28287;
        C2696 c2696 = C2696.f8574;
        loop0: while (true) {
            objM9578 = C2931.m9578(c10631, j, c2696);
            if (!C2931.m9582(objM9578)) {
                AbstractC9642 abstractC9642M9580 = C2931.m9580(objM9578);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30533;
                    AbstractC9642 abstractC9642 = (AbstractC9642) atomicReferenceFieldUpdater.get(c9407);
                    if (abstractC9642.f31168 >= abstractC9642M9580.f31168) {
                        break loop0;
                    }
                    if (!abstractC9642M9580.m25156()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c9407, abstractC9642, abstractC9642M9580)) {
                            if (!abstractC9642.m25153()) {
                                break loop0;
                            }
                            abstractC9642.m32961();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c9407) == abstractC9642);
                    if (abstractC9642M9580.m25153()) {
                        abstractC9642M9580.m32961();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM9582 = C2931.m9582(objM9578);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f30534;
        if (zM9582) {
            c9407.m24758();
            if (c10631.f31168 * ((long) C8662.f28287) < atomicLongFieldUpdater.get(c9407)) {
                c10631.m32963();
                return null;
            }
        } else {
            C10631 c10632 = (C10631) C2931.m9580(objM9578);
            long j4 = c10632.f31168;
            if (j4 <= j) {
                return c10632;
            }
            long j5 = ((long) C8662.f28287) * j4;
            do {
                j2 = f30536.get(c9407);
                j3 = SecT239Field.M60 & j2;
                if (j3 >= j5) {
                    break;
                }
                i = (int) (j2 >> 60);
                int i3 = C8662.f28287;
            } while (!f30536.compareAndSet(c9407, j2, (((long) i) << 60) + j3));
            if (j4 * ((long) C8662.f28287) < atomicLongFieldUpdater.get(c9407)) {
                c10632.m32963();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10631 m24763(long j, C10631 c10631) {
        Object objM9578;
        long j2;
        int i = C8662.f28287;
        C2696 c2696 = C2696.f8574;
        loop0: while (true) {
            objM9578 = C2931.m9578(c10631, j, c2696);
            if (!C2931.m9582(objM9578)) {
                AbstractC9642 abstractC9642M9580 = C2931.m9580(objM9578);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30537;
                    AbstractC9642 abstractC9642 = (AbstractC9642) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9642.f31168 >= abstractC9642M9580.f31168) {
                        break loop0;
                    }
                    if (!abstractC9642M9580.m25156()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC9642, abstractC9642M9580)) {
                            if (!abstractC9642.m25153()) {
                                break loop0;
                            }
                            abstractC9642.m32961();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC9642);
                    if (abstractC9642M9580.m25153()) {
                        abstractC9642M9580.m32961();
                    }
                }
            } else {
                break;
            }
        }
        if (C2931.m9582(objM9578)) {
            m24758();
            if (c10631.f31168 * ((long) C8662.f28287) < m24780()) {
                c10631.m32963();
                return null;
            }
        } else {
            C10631 c10632 = (C10631) C2931.m9580(objM9578);
            long j3 = c10632.f31168;
            if (!m24777() && j <= f30541.get(this) / ((long) C8662.f28287)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30539;
                    AbstractC9642 abstractC9643 = (AbstractC9642) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC9643.f31168 >= j3 || !c10632.m25156()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC9643, c10632)) {
                            if (!abstractC9643.m25153()) {
                                break loop3;
                            }
                            abstractC9643.m32961();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == abstractC9643);
                    if (c10632.m25153()) {
                        c10632.m32961();
                    }
                }
            }
            if (j3 <= j) {
                return c10632;
            }
            long j4 = ((long) C8662.f28287) * j3;
            do {
                j2 = f30534.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!f30534.compareAndSet(this, j2, j4));
            if (j3 * ((long) C8662.f28287) < m24780()) {
                c10632.m32963();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m24775(long j, C10631 c10631) {
        C10631 c10632;
        C10631 c10633;
        while (c10631.f31168 < j && (c10633 = (C10631) c10631.m32960()) != null) {
            c10631 = c10633;
        }
        while (true) {
            if (!c10631.mo25155() || (c10632 = (C10631) c10631.m32960()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30539;
                    AbstractC9642 abstractC9642 = (AbstractC9642) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9642.f31168 >= c10631.f31168) {
                        return;
                    }
                    if (!c10631.m25156()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC9642, c10631)) {
                            if (abstractC9642.m25153()) {
                                abstractC9642.m32961();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC9642);
                    if (c10631.m25153()) {
                        c10631.m32961();
                    }
                }
            } else {
                c10631 = c10632;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f30536.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f30542 + ',');
        sb.append("data=[");
        List listM21088 = C7743.m21088((Object[]) new C10631[]{f30537.get(this), f30533.get(this), f30539.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM21088) {
            if (((C10631) obj) != C8662.f28288) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C10631) next).f31168;
            do {
                Object next2 = it.next();
                long j2 = ((C10631) next2).f31168;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C10631 c10631 = (C10631) next;
        long j3 = f30534.get(this);
        long jM24780 = m24780();
        loop2: do {
            int i2 = C8662.f28287;
            for (int i3 = 0; i3 < i2; i3++) {
                long j4 = (c10631.f31168 * ((long) C8662.f28287)) + ((long) i3);
                if (j4 >= jM24780 && j4 >= j3) {
                    break loop2;
                }
                Object objM27124 = c10631.m27124(i3);
                Object objM27126 = c10631.m27126(i3);
                if (objM27124 instanceof InterfaceC11492) {
                    string = (j4 >= j3 || j4 < jM24780) ? (j4 >= jM24780 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objM27124 instanceof InterfaceC19010) {
                    string = (j4 >= j3 || j4 < jM24780) ? (j4 >= jM24780 || j4 < j3) ? "select" : "onSend" : "onReceive";
                } else if (objM27124 instanceof C12869) {
                    string = "receiveCatching";
                } else if (objM27124 instanceof C1205) {
                    string = "sendBroadcast";
                } else if (objM27124 instanceof C1683) {
                    string = "EB(" + objM27124 + ')';
                } else if (C15243.m36589(objM27124, C8662.f28280) ? true : C15243.m36589(objM27124, C8662.f28282)) {
                    string = "resuming_sender";
                } else {
                    if (!(objM27124 == null ? true : objM27124.equals(C8662.f28275) ? true : C15243.m36589(objM27124, C8662.f28276) ? true : C15243.m36589(objM27124, C8662.f28281) ? true : C15243.m36589(objM27124, C8662.f28279) ? true : C15243.m36589(objM27124, C8662.f28278) ? true : C15243.m36589(objM27124, C8662.m23330()))) {
                        string = objM27124.toString();
                    }
                }
                if (objM27126 != null) {
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_START + string + ',' + objM27126 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            c10631 = (C10631) c10631.m32960();
        } while (c10631 != null);
        if (C0878.m3571(sb) == ',') {
            C15243.m36591(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }
}
