package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۖۛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public class C2339 implements InterfaceC11138, InterfaceC6573 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8274 = AtomicReferenceFieldUpdater.newUpdater(C2339.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo7111() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo6332() {
        return true;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo4568(Object obj) {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo7121(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void mo7122() {
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean mo7124() {
        return false;
    }

    public C2339(boolean z) {
        this._state = z ? C5162.f17915 : C5162.f17917;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m7105(C2339 c2339, C13630 c13630, C21576 c21576, Object obj) {
        c2339.getClass();
        C21576 c21576M7102 = m7102((C4269) c21576);
        if (c21576M7102 != null) {
            while (c21576M7102.f70020.mo7113((1 & 1) == 0, (1 & 2) != 0, new C4456(c2339, c13630, c21576M7102, obj)) == C12924.f42947) {
                c21576M7102 = m7102((C4269) c21576M7102);
                if (c21576M7102 == null) {
                }
            }
            return;
        }
        c2339.mo4568(c2339.m7100(c13630, obj));
    }

    @Override // l.InterfaceC2629
    public final InterfaceC5452 getKey() {
        return C6198.f21082;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2629 mo4416(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        if (C13465.m32965(C6198.f21082, interfaceC5452)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4415(Object obj, InterfaceC8400 interfaceC8400) {
        return interfaceC8400.mo3208(obj, this);
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo4567(Object obj) {
        mo4568(obj);
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22386 mo4417(InterfaceC22386 interfaceC22386) {
        return C11803.m29482(this, interfaceC22386);
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22386 mo4418(InterfaceC5452 interfaceC5452) {
        return C11803.m29481(this, interfaceC5452);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m7103(InterfaceC0553 interfaceC0553, Object obj) {
        InterfaceC15227 interfaceC15227 = (InterfaceC15227) this._parentHandle;
        if (interfaceC15227 != null) {
            interfaceC15227.mo10025();
            this._parentHandle = C12924.f42947;
        }
        C8877 c8877 = null;
        C18754 c18754 = obj instanceof C18754 ? (C18754) obj : null;
        Throwable th = c18754 != null ? c18754.f60808 : null;
        if (interfaceC0553 instanceof AbstractC3375) {
            try {
                ((AbstractC3375) interfaceC0553).mo12440(th);
                return;
            } catch (Throwable th2) {
                mo7116(new C8877("Exception in completion handler " + interfaceC0553 + " for " + this, th2));
                return;
            }
        }
        C0928 c0928Mo2638 = interfaceC0553.mo2638();
        if (c0928Mo2638 != null) {
            for (C4269 c4269M12071 = (C4269) c0928Mo2638.m12065(); !C13465.m32965(c4269M12071, c0928Mo2638); c4269M12071 = c4269M12071.m12071()) {
                if (c4269M12071 instanceof AbstractC3375) {
                    AbstractC3375 abstractC3375 = (AbstractC3375) c4269M12071;
                    try {
                        abstractC3375.mo12440(th);
                    } catch (Throwable th3) {
                        if (c8877 == null) {
                            c8877 = new C8877("Exception in completion handler " + abstractC3375 + " for " + this, th3);
                            C7321 c7321 = C7321.f24318;
                        } else {
                            C13672.m33380(c8877, th3);
                        }
                    }
                }
            }
            if (c8877 != null) {
                mo7116(c8877);
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15227 m7110() {
        return (InterfaceC15227) this._parentHandle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7117(InterfaceC11138 interfaceC11138) {
        C12924 c12924 = C12924.f42947;
        if (interfaceC11138 == null) {
            this._parentHandle = c12924;
            return;
        }
        interfaceC11138.start();
        InterfaceC15227 interfaceC15227Mo7112 = interfaceC11138.mo7112(this);
        this._parentHandle = interfaceC15227Mo7112;
        if (m7119() instanceof InterfaceC0553) {
            return;
        }
        interfaceC15227Mo7112.mo10025();
        this._parentHandle = c12924;
    }

    @Override // l.InterfaceC11138
    public final boolean start() {
        while (true) {
            Object objM7119 = m7119();
            boolean z = objM7119 instanceof C15372;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8274;
            if (z) {
                if (((C15372) objM7119).mo2639()) {
                    return false;
                }
                C15372 c15372 = C5162.f17915;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM7119, c15372)) {
                        mo7122();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM7119);
            } else {
                if (!(objM7119 instanceof C20310)) {
                    return false;
                }
                C0928 c0928Mo2638 = ((C20310) objM7119).mo2638();
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM7119, c0928Mo2638)) {
                        mo7122();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM7119);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7115(AbstractC3375 abstractC3375) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objM7119 = m7119();
            if (!(objM7119 instanceof AbstractC3375)) {
                if (!(objM7119 instanceof InterfaceC0553) || ((InterfaceC0553) objM7119).mo2638() == null) {
                    return;
                }
                abstractC3375.m12073();
                return;
            }
            if (objM7119 != abstractC3375) {
                return;
            }
            C15372 c15372 = C5162.f17915;
            do {
                atomicReferenceFieldUpdater = f8274;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM7119, c15372)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM7119);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object m7123(Object obj) {
        Object objM7099;
        do {
            objM7099 = m7099(m7119(), obj);
            if (objM7099 == C5162.f17916) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C18754 c18754 = obj instanceof C18754 ? (C18754) obj : null;
                throw new IllegalStateException(str, c18754 != null ? c18754.f60808 : null);
            }
        } while (objM7099 == C5162.f17919);
        return objM7099;
    }

    @Override // l.InterfaceC11138
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo7120() {
        Object objM7119 = m7119();
        return (objM7119 instanceof InterfaceC0553) && ((InterfaceC0553) objM7119).mo2639();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m7100(C13630 c13630, Object obj) {
        Object obj2 = null;
        Throwable c23838 = null;
        C18754 c18754 = obj instanceof C18754 ? (C18754) obj : null;
        Throwable th = c18754 != null ? c18754.f60808 : null;
        synchronized (c13630) {
            c13630.m33336();
            ArrayList<Throwable> arrayListM33335 = c13630.m33335(th);
            if (!arrayListM33335.isEmpty()) {
                for (Object obj3 : arrayListM33335) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c23838 = (Throwable) obj2;
                if (c23838 == null) {
                    c23838 = (Throwable) arrayListM33335.get(0);
                }
            } else if (c13630.m33336()) {
                c23838 = new C23838(mo7111(), null, this);
            }
            if (c23838 != null && arrayListM33335.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM33335.size()));
                for (Throwable th2 : arrayListM33335) {
                    if (th2 != c23838 && th2 != c23838 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C13672.m33380(c23838, th2);
                    }
                }
            }
        }
        if (c23838 != null && c23838 != th) {
            obj = new C18754(c23838, false);
        }
        if (c23838 != null && (m7106(c23838) || mo7121(c23838))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((C18754) obj).m43305();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8274;
        Object c16782 = obj instanceof InterfaceC0553 ? new C16782((InterfaceC0553) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c13630, c16782) && atomicReferenceFieldUpdater.get(this) == c13630) {
        }
        m7103((InterfaceC0553) c13630, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final boolean m7106(Throwable th) {
        if (!mo7124()) {
            boolean z = th instanceof CancellationException;
            InterfaceC15227 interfaceC15227 = (InterfaceC15227) this._parentHandle;
            if (interfaceC15227 == null || interfaceC15227 == C12924.f42947) {
                return z;
            }
            return interfaceC15227.mo32009(th) || z;
        }
        return true;
    }

    @Override // l.InterfaceC11138
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CancellationException mo7109() {
        CancellationException cancellationException;
        Object objM7119 = m7119();
        if (!(objM7119 instanceof C13630)) {
            if (objM7119 instanceof InterfaceC0553) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM7119 instanceof C18754)) {
                return new C23838(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C18754) objM7119).f60808;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C23838(mo7111(), th, this) : cancellationException;
        }
        Throwable thM33332 = ((C13630) objM7119).m33332();
        if (thM33332 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM33332 instanceof CancellationException ? (CancellationException) thM33332 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo7111();
        }
        return new C23838(strConcat, thM33332, this);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ed A[EDGE_INSN: B:111:0x00ed->B:88:0x00ed BREAK  A[LOOP:0: B:13:0x0018->B:118:0x0018, LOOP_LABEL: LOOP:0: B:13:0x0018->B:118:0x0018], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea A[ADDED_TO_REGION] */
    @Override // l.InterfaceC11138
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23133 mo7113(boolean z, boolean z2, AbstractC3375 abstractC3375) {
        AbstractC3375 abstractC3376;
        Throwable thM33332;
        C11513 c11513;
        int iM12067;
        boolean z3;
        if (z) {
            AbstractC14666 c12549 = abstractC3375 instanceof AbstractC14666 ? (AbstractC14666) abstractC3375 : null;
            if (c12549 == null) {
                c12549 = new C12549(abstractC3375);
            }
            abstractC3376 = c12549;
        } else {
            abstractC3376 = abstractC3375;
        }
        abstractC3376.f12493 = this;
        loop0: while (true) {
            Object objM7119 = m7119();
            if (objM7119 instanceof C15372) {
                C15372 c15372 = (C15372) objM7119;
                if (c15372.mo2639()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8274;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objM7119, abstractC3376)) {
                        if (atomicReferenceFieldUpdater.get(this) != objM7119) {
                        }
                    }
                    break loop0;
                }
                C0928 c0928 = new C0928();
                Object c20310 = c15372.mo2639() ? c0928 : new C20310(c0928);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8274;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c15372, c20310) && atomicReferenceFieldUpdater2.get(this) == c15372) {
                }
            } else {
                if (!(objM7119 instanceof InterfaceC0553)) {
                    if (z2) {
                        C18754 c18754 = objM7119 instanceof C18754 ? (C18754) objM7119 : null;
                        abstractC3375.invoke(c18754 != null ? c18754.f60808 : null);
                    }
                    return C12924.f42947;
                }
                InterfaceC0553 interfaceC0553 = (InterfaceC0553) objM7119;
                C0928 c0928Mo2638 = interfaceC0553.mo2638();
                if (c0928Mo2638 != null) {
                    InterfaceC23133 interfaceC23133 = C12924.f42947;
                    if (!z || !(objM7119 instanceof C13630)) {
                        thM33332 = null;
                        if (thM33332 != null) {
                            c11513 = new C11513(abstractC3376, this, interfaceC0553);
                            do {
                                iM12067 = c0928Mo2638.m12066().m12067(abstractC3376, c0928Mo2638, c11513);
                                if (iM12067 != 1) {
                                    break loop0;
                                }
                            } while (iM12067 != 2);
                        } else {
                            if (z2) {
                                abstractC3375.invoke(thM33332);
                            }
                            return interfaceC23133;
                        }
                    } else {
                        synchronized (objM7119) {
                            thM33332 = ((C13630) objM7119).m33332();
                            if (thM33332 == null || ((abstractC3375 instanceof C21576) && !((C13630) objM7119).m33334())) {
                                C11513 c11514 = new C11513(abstractC3376, this, (InterfaceC0553) objM7119);
                                while (true) {
                                    int iM12068 = c0928Mo2638.m12066().m12067(abstractC3376, c0928Mo2638, c11514);
                                    if (iM12068 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (iM12068 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (thM33332 == null) {
                                        return abstractC3376;
                                    }
                                    interfaceC23133 = abstractC3376;
                                }
                            }
                            C7321 c7321 = C7321.f24318;
                        }
                        if (thM33332 != null) {
                            c11513 = new C11513(abstractC3376, this, interfaceC0553);
                            do {
                                iM12067 = c0928Mo2638.m12066().m12067(abstractC3376, c0928Mo2638, c11513);
                                if (iM12067 != 1) {
                                    break loop0;
                                    break loop0;
                                }
                            } while (iM12067 != 2);
                        } else {
                            if (z2) {
                                abstractC3375.invoke(thM33332);
                            }
                            return interfaceC23133;
                        }
                    }
                } else {
                    AbstractC3375 abstractC3377 = (AbstractC3375) objM7119;
                    abstractC3377.m12068(new C0928());
                    C4269 c4269M12071 = abstractC3377.m12071();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f8274;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, abstractC3377, c4269M12071) && atomicReferenceFieldUpdater3.get(this) == abstractC3377) {
                    }
                }
            }
        }
        return abstractC3376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m7104(C0928 c0928, Throwable th) {
        C8877 c8877 = null;
        for (C4269 c4269M12071 = (C4269) c0928.m12065(); !C13465.m32965(c4269M12071, c0928); c4269M12071 = c4269M12071.m12071()) {
            if (c4269M12071 instanceof AbstractC14666) {
                AbstractC3375 abstractC3375 = (AbstractC3375) c4269M12071;
                try {
                    abstractC3375.mo12440(th);
                } catch (Throwable th2) {
                    if (c8877 == null) {
                        c8877 = new C8877("Exception in completion handler " + abstractC3375 + " for " + this, th2);
                        C7321 c7321 = C7321.f24318;
                    } else {
                        C13672.m33380(c8877, th2);
                    }
                }
            }
        }
        if (c8877 != null) {
            mo7116(c8877);
        }
        m7106(th);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v15 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x0092, TRY_ENTER, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[Catch: all -> 0x0092, TryCatch #0 {, blocks: (B:25:0x0050, B:27:0x0059, B:30:0x0060, B:36:0x0077, B:34:0x006d, B:35:0x0071), top: B:82:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[EDGE_INSN: B:92:0x00ff->B:71:0x00ff BREAK  A[LOOP:1: B:21:0x0046->B:95:0x0046], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:2: B:56:0x00b6->B:99:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0044, please report this as an issue */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m7118(Object obj) {
        Throwable thM7098;
        Object objM7119;
        Throwable thM33332;
        C21203 c21203;
        InterfaceC0553 interfaceC0553;
        C0928 c0928M7101;
        C13630 c13630;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM7099 = C5162.f17916;
        if (this instanceof C1964) {
            do {
                Object objM71110 = m7119();
                if (!(objM71110 instanceof InterfaceC0553) || ((objM71110 instanceof C13630) && ((C13630) objM71110).m33334())) {
                    objM7099 = C5162.f17916;
                    break;
                }
                objM7099 = m7099(objM71110, new C18754(m7098(obj), false));
            } while (objM7099 == C5162.f17919);
            if (objM7099 != C5162.f17918) {
                if (objM7099 == C5162.f17916) {
                    thM7098 = null;
                    loop1: while (true) {
                        objM7119 = m7119();
                        if (objM7119 instanceof C13630) {
                            synchronized (objM7119) {
                                if (((C13630) objM7119).m33337()) {
                                    c21203 = C5162.f17914;
                                } else {
                                    boolean zM33336 = ((C13630) objM7119).m33336();
                                    if (obj == null || !zM33336) {
                                        if (thM7098 == null) {
                                            thM7098 = m7098(obj);
                                        }
                                        ((C13630) objM7119).m33333(thM7098);
                                    }
                                    thM33332 = zM33336 ? null : ((C13630) objM7119).m33332();
                                    if (thM33332 != null) {
                                        m7104(((C13630) objM7119).mo2638(), thM33332);
                                    }
                                    c21203 = C5162.f17916;
                                }
                            }
                        } else if (objM7119 instanceof InterfaceC0553) {
                            if (thM7098 == null) {
                                thM7098 = m7098(obj);
                            }
                            interfaceC0553 = (InterfaceC0553) objM7119;
                            if (interfaceC0553.mo2639()) {
                                c0928M7101 = m7101(interfaceC0553);
                                if (c0928M7101 == null) {
                                    continue;
                                } else {
                                    c13630 = new C13630(c0928M7101, thM7098);
                                    atomicReferenceFieldUpdater = f8274;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0553, c13630)) {
                                            m7104(c0928M7101, thM7098);
                                            c21203 = C5162.f17916;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0553) {
                                        }
                                    }
                                }
                            } else {
                                objM7099 = m7099(objM7119, new C18754(thM7098, false));
                                if (objM7099 != C5162.f17916) {
                                    throw new IllegalStateException(("Cannot happen in " + objM7119).toString());
                                }
                                if (objM7099 != C5162.f17919) {
                                    break;
                                }
                            }
                        } else {
                            c21203 = C5162.f17914;
                        }
                        objM7099 = c21203;
                        break;
                    }
                }
                if (objM7099 != C5162.f17916 && objM7099 != C5162.f17918) {
                    if (objM7099 == C5162.f17914) {
                        return false;
                    }
                    mo4568(objM7099);
                    return true;
                }
            }
        } else {
            if (objM7099 == C5162.f17916) {
                thM7098 = null;
                loop1: while (true) {
                    objM7119 = m7119();
                    if (objM7119 instanceof C13630) {
                        synchronized (objM7119) {
                            if (((C13630) objM7119).m33337()) {
                                c21203 = C5162.f17914;
                            } else {
                                boolean zM33337 = ((C13630) objM7119).m33336();
                                if (obj == null) {
                                    if (thM7098 == null) {
                                        thM7098 = m7098(obj);
                                    }
                                    ((C13630) objM7119).m33333(thM7098);
                                } else {
                                    if (thM7098 == null) {
                                        thM7098 = m7098(obj);
                                    }
                                    ((C13630) objM7119).m33333(thM7098);
                                }
                                if (zM33337) {
                                }
                                if (thM33332 != null) {
                                    m7104(((C13630) objM7119).mo2638(), thM33332);
                                }
                                c21203 = C5162.f17916;
                            }
                        }
                    } else if (objM7119 instanceof InterfaceC0553) {
                        if (thM7098 == null) {
                            thM7098 = m7098(obj);
                        }
                        interfaceC0553 = (InterfaceC0553) objM7119;
                        if (interfaceC0553.mo2639()) {
                            c0928M7101 = m7101(interfaceC0553);
                            if (c0928M7101 == null) {
                                continue;
                            } else {
                                c13630 = new C13630(c0928M7101, thM7098);
                                atomicReferenceFieldUpdater = f8274;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0553, c13630)) {
                                        m7104(c0928M7101, thM7098);
                                        c21203 = C5162.f17916;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0553) {
                                    }
                                }
                            }
                        } else {
                            objM7099 = m7099(objM7119, new C18754(thM7098, false));
                            if (objM7099 != C5162.f17916) {
                                throw new IllegalStateException(("Cannot happen in " + objM7119).toString());
                            }
                            if (objM7099 != C5162.f17919) {
                                break;
                                break;
                            }
                        }
                    } else {
                        c21203 = C5162.f17914;
                    }
                    objM7099 = c21203;
                    break;
                }
            }
            if (objM7099 != C5162.f17916) {
                if (objM7099 == C5162.f17914) {
                    return false;
                }
                mo4568(objM7099);
                return true;
            }
        }
        return true;
    }

    @Override // l.InterfaceC11138
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7114(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C23838(mo7111(), null, this);
        }
        m7118(cancellationException);
    }

    @Override // l.InterfaceC6573
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CancellationException mo7108() {
        Throwable thM33332;
        Object objM7119 = m7119();
        if (objM7119 instanceof C13630) {
            thM33332 = ((C13630) objM7119).m33332();
        } else if (objM7119 instanceof C18754) {
            thM33332 = ((C18754) objM7119).f60808;
        } else {
            if (objM7119 instanceof InterfaceC0553) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM7119).toString());
            }
            thM33332 = null;
        }
        CancellationException cancellationException = thM33332 instanceof CancellationException ? (CancellationException) thM33332 : null;
        return cancellationException == null ? new C23838("Parent job is ".concat(m7107(objM7119)), thM33332, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private final Throwable m7098(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C23838(mo7111(), null, this) : th;
        }
        if (obj != null) {
            return ((InterfaceC6573) obj).mo7108();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C0928 m7101(InterfaceC0553 interfaceC0553) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0928 c0928Mo2638 = interfaceC0553.mo2638();
        if (c0928Mo2638 != null) {
            return c0928Mo2638;
        }
        if (interfaceC0553 instanceof C15372) {
            return new C0928();
        }
        if (!(interfaceC0553 instanceof AbstractC3375)) {
            throw new IllegalStateException(("State should have list: " + interfaceC0553).toString());
        }
        AbstractC3375 abstractC3375 = (AbstractC3375) interfaceC0553;
        abstractC3375.m12068(new C0928());
        C4269 c4269M12071 = abstractC3375.m12071();
        do {
            atomicReferenceFieldUpdater = f8274;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3375, c4269M12071)) {
                return null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC3375);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m7099(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC0553)) {
            return C5162.f17916;
        }
        if (((obj instanceof C15372) || (obj instanceof AbstractC3375)) && !(obj instanceof C21576) && !(obj2 instanceof C18754)) {
            InterfaceC0553 interfaceC0553 = (InterfaceC0553) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8274;
            Object c16782 = obj2 instanceof InterfaceC0553 ? new C16782((InterfaceC0553) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0553, c16782)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0553) {
                    return C5162.f17919;
                }
            }
            m7103(interfaceC0553, obj2);
            return obj2;
        }
        InterfaceC0553 interfaceC0554 = (InterfaceC0553) obj;
        C0928 c0928M7101 = m7101(interfaceC0554);
        if (c0928M7101 == null) {
            return C5162.f17919;
        }
        C21576 c21576M7102 = null;
        C13630 c13630 = interfaceC0554 instanceof C13630 ? (C13630) interfaceC0554 : null;
        if (c13630 == null) {
            c13630 = new C13630(c0928M7101, null);
        }
        C13630 c13631 = c13630;
        synchronized (c13631) {
            if (c13631.m33334()) {
                return C5162.f17916;
            }
            c13631.m33331();
            if (c13631 != interfaceC0554) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8274;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0554, c13631)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0554) {
                        return C5162.f17919;
                    }
                }
            }
            boolean zM33336 = c13631.m33336();
            C18754 c18754 = obj2 instanceof C18754 ? (C18754) obj2 : null;
            if (c18754 != null) {
                c13631.m33333(c18754.f60808);
            }
            Throwable thM33332 = c13631.m33332();
            if (zM33336) {
                thM33332 = null;
            }
            C7321 c7321 = C7321.f24318;
            if (thM33332 != null) {
                m7104(c0928M7101, thM33332);
            }
            C21576 c21576 = interfaceC0554 instanceof C21576 ? (C21576) interfaceC0554 : null;
            if (c21576 == null) {
                C0928 c0928Mo2638 = interfaceC0554.mo2638();
                if (c0928Mo2638 != null) {
                    c21576M7102 = m7102((C4269) c0928Mo2638);
                }
            } else {
                c21576M7102 = c21576;
            }
            if (c21576M7102 != null) {
                while (c21576M7102.f70020.mo7113((1 & 1) == 0, (1 & 2) != 0, new C4456(this, c13631, c21576M7102, obj2)) == C12924.f42947) {
                    c21576M7102 = m7102((C4269) c21576M7102);
                    if (c21576M7102 == null) {
                    }
                }
                return C5162.f17918;
            }
            return m7100(c13631, obj2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21576 m7102(C4269 c4269) {
        while (c4269.mo12072()) {
            c4269 = c4269.m12066();
        }
        while (true) {
            c4269 = c4269.m12071();
            if (!c4269.mo12072()) {
                if (c4269 instanceof C21576) {
                    return (C21576) c4269;
                }
                if (c4269 instanceof C0928) {
                    return null;
                }
            }
        }
    }

    @Override // l.InterfaceC11138
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15227 mo7112(C2339 c2339) {
        return (InterfaceC15227) mo7113((1 & 1) == 0, (1 & 2) != 0, new C21576(c2339));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo7116(C8877 c8877) {
        throw c8877;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m7107(m7119()) + '}');
        sb.append('@');
        sb.append(C13961.m33816(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m7107(Object obj) {
        if (obj instanceof C13630) {
            C13630 c13630 = (C13630) obj;
            if (c13630.m33336()) {
                return "Cancelling";
            }
            return c13630.m33334() ? "Completing" : "Active";
        }
        if (obj instanceof InterfaceC0553) {
            return ((InterfaceC0553) obj).mo2639() ? "Active" : "New";
        }
        return obj instanceof C18754 ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object m7119() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC8504)) {
                return obj;
            }
            ((AbstractC8504) obj).mo22233(this);
        }
    }
}
