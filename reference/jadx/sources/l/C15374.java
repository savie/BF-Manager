package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes5.dex */
public class C15374 implements InterfaceC9211, InterfaceC16866 {
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50140 = AtomicReferenceFieldUpdater.newUpdater(C15374.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50139 = AtomicReferenceFieldUpdater.newUpdater(C15374.class, Object.class, "_parentHandle$volatile");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo36818() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo5177(Object obj) {
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo36825(Object obj) {
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo16697() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo19278() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo36828(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo5180() {
        return false;
    }

    public C15374(boolean z) {
        this._state$volatile = z ? C13137.f42028 : C13137.f42026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m36813(C15374 c15374, C22834 c22834, C3289 c3289, Object obj) {
        c15374.getClass();
        C3289 c3289M36811 = m36811((C6661) c3289);
        if (c3289M36811 != null) {
            while (C13686.m33476(c3289M36811.f10712, new C10899(c15374, c22834, c3289M36811, obj), 1) == C11645.f37670) {
                c3289M36811 = m36811((C6661) c3289M36811);
                if (c3289M36811 == null) {
                }
            }
            return;
        }
        c15374.mo5177(c15374.m36809(c22834, obj));
    }

    @Override // l.InterfaceC5571
    public final InterfaceC1842 getKey() {
        return C1009.f3674;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5571 mo5005(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        if (C15243.m36589(C1009.f3674, interfaceC1842)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5004(Object obj, InterfaceC23955 interfaceC23955) {
        return interfaceC23955.mo3124(obj, this);
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo5179(Object obj) {
        mo5177(obj);
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11536 mo5006(InterfaceC11536 interfaceC11536) {
        return C13028.m32453(this, interfaceC11536);
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC11536 mo5007(InterfaceC1842 interfaceC1842) {
        return C13028.m32452(this, interfaceC1842);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23427 m36817() {
        return (InterfaceC23427) f50139.get(this);
    }

    @Override // l.InterfaceC9211
    public final InterfaceC9211 getParent() {
        InterfaceC23427 interfaceC23427M36817 = m36817();
        if (interfaceC23427M36817 != null) {
            return interfaceC23427M36817.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36820(InterfaceC9211 interfaceC9211) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50139;
        C11645 c11645 = C11645.f37670;
        if (interfaceC9211 == null) {
            atomicReferenceFieldUpdater.set(this, c11645);
            return;
        }
        interfaceC9211.start();
        InterfaceC23427 interfaceC23427Mo24381 = interfaceC9211.mo24381(this);
        atomicReferenceFieldUpdater.set(this, interfaceC23427Mo24381);
        if (m36824() instanceof InterfaceC21146) {
            return;
        }
        interfaceC23427Mo24381.mo28808();
        atomicReferenceFieldUpdater.set(this, c11645);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m36824() {
        while (true) {
            Object obj = f50140.get(this);
            if (!(obj instanceof AbstractC8152)) {
                return obj;
            }
            ((AbstractC8152) obj).mo22059(this);
        }
    }

    @Override // l.InterfaceC9211
    public final boolean start() {
        while (true) {
            Object objM36824 = m36824();
            boolean z = objM36824 instanceof C24876;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50140;
            if (z) {
                if (((C24876) objM36824).mo6735()) {
                    return false;
                }
                C24876 c24876 = C13137.f42028;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM36824, c24876)) {
                        mo16697();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM36824);
            } else {
                if (!(objM36824 instanceof C14432)) {
                    return false;
                }
                C1951 c1951Mo6734 = ((C14432) objM36824).mo6734();
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objM36824, c1951Mo6734)) {
                        mo16697();
                        return true;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objM36824);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36822(AbstractC22088 abstractC22088) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objM36824 = m36824();
            if (!(objM36824 instanceof AbstractC22088)) {
                if (!(objM36824 instanceof InterfaceC21146) || ((InterfaceC21146) objM36824).mo6734() == null) {
                    return;
                }
                abstractC22088.m18597();
                return;
            }
            if (objM36824 != abstractC22088) {
                return;
            }
            C24876 c24876 = C13137.f42028;
            do {
                atomicReferenceFieldUpdater = f50140;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM36824, c24876)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM36824);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m36826(Object obj) {
        Object objM36808;
        do {
            objM36808 = m36808(m36824(), obj);
            if (objM36808 == C13137.f42022) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C12238 c12238 = obj instanceof C12238 ? (C12238) obj : null;
                throw new IllegalStateException(str, c12238 != null ? c12238.f39390 : null);
            }
        } while (objM36808 == C13137.f42027);
        return objM36808;
    }

    @Override // l.InterfaceC9211
    /* JADX INFO: renamed from: ۤ */
    public boolean mo24383() {
        Object objM36824 = m36824();
        return (objM36824 instanceof InterfaceC21146) && ((InterfaceC21146) objM36824).mo6735();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m36809(C22834 c22834, Object obj) {
        Object obj2 = null;
        Throwable c2500 = null;
        C12238 c12238 = obj instanceof C12238 ? (C12238) obj : null;
        Throwable th = c12238 != null ? c12238.f39390 : null;
        synchronized (c22834) {
            c22834.m51541();
            ArrayList<Throwable> arrayListM51540 = c22834.m51540(th);
            if (!arrayListM51540.isEmpty()) {
                for (Object obj3 : arrayListM51540) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c2500 = (Throwable) obj2;
                if (c2500 == null) {
                    c2500 = (Throwable) arrayListM51540.get(0);
                }
            } else if (c22834.m51541()) {
                c2500 = new C2500(mo36818(), null, this);
            }
            if (c2500 != null && arrayListM51540.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM51540.size()));
                for (Throwable th2 : arrayListM51540) {
                    if (th2 != c2500 && th2 != c2500 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C18856.m43744(c2500, th2);
                    }
                }
            }
        }
        if (c2500 != null && c2500 != th) {
            obj = new C12238(c2500, false);
        }
        if (c2500 != null && (m36816(c2500) || mo36828(c2500))) {
            C15243.m36587(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C12238) obj).m30571();
        }
        mo36825(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50140;
        Object c18162 = obj instanceof InterfaceC21146 ? new C18162((InterfaceC21146) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c22834, c18162) && atomicReferenceFieldUpdater.get(this) == c22834) {
        }
        m36814((InterfaceC21146) c22834, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m36814(InterfaceC21146 interfaceC21146, Object obj) {
        InterfaceC23427 interfaceC23427M36817 = m36817();
        if (interfaceC23427M36817 != null) {
            interfaceC23427M36817.mo28808();
            f50139.set(this, C11645.f37670);
        }
        C13377 c13377 = null;
        C12238 c12238 = obj instanceof C12238 ? (C12238) obj : null;
        Throwable th = c12238 != null ? c12238.f39390 : null;
        if (interfaceC21146 instanceof AbstractC22088) {
            try {
                ((AbstractC22088) interfaceC21146).mo1765(th);
                return;
            } catch (Throwable th2) {
                mo36821(new C13377("Exception in completion handler " + interfaceC21146 + " for " + this, th2));
                return;
            }
        }
        C1951 c1951Mo6734 = interfaceC21146.mo6734();
        if (c1951Mo6734 != null) {
            Object objM18601 = c1951Mo6734.m18601();
            C15243.m36587(objM18601, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C6661 c6661M18600 = (C6661) objM18601; !c6661M18600.equals(c1951Mo6734); c6661M18600 = c6661M18600.m18600()) {
                if (c6661M18600 instanceof AbstractC22088) {
                    AbstractC22088 abstractC22088 = (AbstractC22088) c6661M18600;
                    try {
                        abstractC22088.mo1765(th);
                    } catch (Throwable th3) {
                        if (c13377 != null) {
                            C18856.m43744(c13377, th3);
                        } else {
                            c13377 = new C13377("Exception in completion handler " + abstractC22088 + " for " + this, th3);
                            C11471 c11471 = C11471.f36082;
                        }
                    }
                }
            }
            if (c13377 != null) {
                mo36821(c13377);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m36812(C1951 c1951, Throwable th) {
        Object objM18601 = c1951.m18601();
        C15243.m36587(objM18601, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C13377 c13377 = null;
        for (C6661 c6661M18600 = (C6661) objM18601; !c6661M18600.equals(c1951); c6661M18600 = c6661M18600.m18600()) {
            if (c6661M18600 instanceof AbstractC8466) {
                AbstractC22088 abstractC22088 = (AbstractC22088) c6661M18600;
                try {
                    abstractC22088.mo1765(th);
                } catch (Throwable th2) {
                    if (c13377 == null) {
                        c13377 = new C13377("Exception in completion handler " + abstractC22088 + " for " + this, th2);
                        C11471 c11471 = C11471.f36082;
                    } else {
                        C18856.m43744(c13377, th2);
                    }
                }
            }
        }
        if (c13377 != null) {
            mo36821(c13377);
        }
        m36816(th);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final boolean m36816(Throwable th) {
        if (!mo5180()) {
            boolean z = th instanceof CancellationException;
            InterfaceC23427 interfaceC23427M36817 = m36817();
            if (interfaceC23427M36817 == null || interfaceC23427M36817 == C11645.f37670) {
                return z;
            }
            return interfaceC23427M36817.mo10833(th) || z;
        }
        return true;
    }

    @Override // l.InterfaceC9211
    /* JADX INFO: renamed from: ܳ */
    public final CancellationException mo24384() {
        CancellationException cancellationException;
        Object objM36824 = m36824();
        if (!(objM36824 instanceof C22834)) {
            if (objM36824 instanceof InterfaceC21146) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM36824 instanceof C12238)) {
                return new C2500(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C12238) objM36824).f39390;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C2500(mo36818(), th, this) : cancellationException;
        }
        Throwable thM51539 = ((C22834) objM36824).m51539();
        if (thM51539 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM51539 instanceof CancellationException ? (CancellationException) thM51539 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo36818();
        }
        return new C2500(strConcat, thM51539, this);
    }

    @Override // l.InterfaceC9211
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11449 mo24380(boolean z, boolean z2, InterfaceC3071 interfaceC3071) {
        return m36819(z, z2, new C0263(interfaceC3071));
    }

    /* JADX WARN: Code duplicated, block: B:116:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00fe A[EDGE_INSN: B:117:0x00fe->B:94:0x00fe BREAK  A[LOOP:0: B:19:0x0029->B:124:0x0029, LOOP_LABEL: LOOP:0: B:19:0x0029->B:124:0x0029], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11449 m36819(boolean z, boolean z2, InterfaceC7721 interfaceC7721) {
        AbstractC22088 c9957;
        Throwable thM51539;
        C19850 c19850;
        int iM18595;
        boolean z3;
        if (z) {
            c9957 = interfaceC7721 instanceof AbstractC8466 ? (AbstractC8466) interfaceC7721 : null;
            if (c9957 == null) {
                c9957 = new C18908(interfaceC7721);
            }
        } else {
            c9957 = interfaceC7721 instanceof AbstractC22088 ? (AbstractC22088) interfaceC7721 : null;
            if (c9957 == null) {
                c9957 = new C9957(interfaceC7721);
            }
        }
        AbstractC22088 abstractC22088 = c9957;
        abstractC22088.f71184 = this;
        loop0: while (true) {
            Object objM36824 = m36824();
            if (objM36824 instanceof C24876) {
                C24876 c24876 = (C24876) objM36824;
                if (c24876.mo6735()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50140;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objM36824, abstractC22088)) {
                        if (atomicReferenceFieldUpdater.get(this) != objM36824) {
                        }
                    }
                    break loop0;
                }
                C1951 c1951 = new C1951();
                InterfaceC21146 c14432 = c24876.mo6735() ? c1951 : new C14432(c1951);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f50140;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c24876, c14432) && atomicReferenceFieldUpdater2.get(this) == c24876) {
                }
            } else {
                if (!(objM36824 instanceof InterfaceC21146)) {
                    if (z2) {
                        C12238 c12238 = objM36824 instanceof C12238 ? (C12238) objM36824 : null;
                        interfaceC7721.mo1765(c12238 != null ? c12238.f39390 : null);
                    }
                    return C11645.f37670;
                }
                InterfaceC21146 interfaceC21146 = (InterfaceC21146) objM36824;
                C1951 c1951Mo6734 = interfaceC21146.mo6734();
                if (c1951Mo6734 != null) {
                    InterfaceC11449 interfaceC11449 = C11645.f37670;
                    if (!z || !(objM36824 instanceof C22834)) {
                        thM51539 = null;
                        if (thM51539 != null) {
                            c19850 = new C19850(abstractC22088, this, interfaceC21146);
                            do {
                                iM18595 = c1951Mo6734.m18599().m18595(abstractC22088, c1951Mo6734, c19850);
                                if (iM18595 != 1) {
                                    break loop0;
                                }
                            } while (iM18595 != 2);
                        } else {
                            if (z2) {
                                interfaceC7721.mo1765(thM51539);
                            }
                            return interfaceC11449;
                        }
                    } else {
                        synchronized (objM36824) {
                            thM51539 = ((C22834) objM36824).m51539();
                            if (thM51539 == null || ((interfaceC7721 instanceof C3289) && !((C22834) objM36824).m51538())) {
                                C19850 c19851 = new C19850(abstractC22088, this, (InterfaceC21146) objM36824);
                                while (true) {
                                    int iM18596 = c1951Mo6734.m18599().m18595(abstractC22088, c1951Mo6734, c19851);
                                    if (iM18596 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (iM18596 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (thM51539 == null) {
                                        return abstractC22088;
                                    }
                                    interfaceC11449 = abstractC22088;
                                }
                            }
                            C11471 c11471 = C11471.f36082;
                        }
                        if (thM51539 != null) {
                            c19850 = new C19850(abstractC22088, this, interfaceC21146);
                            do {
                                iM18595 = c1951Mo6734.m18599().m18595(abstractC22088, c1951Mo6734, c19850);
                                if (iM18595 != 1) {
                                    break loop0;
                                    break loop0;
                                }
                            } while (iM18595 != 2);
                        } else {
                            if (z2) {
                                interfaceC7721.mo1765(thM51539);
                            }
                            return interfaceC11449;
                        }
                    }
                } else {
                    AbstractC22088 abstractC22089 = (AbstractC22088) objM36824;
                    abstractC22089.m18596(new C1951());
                    C6661 c6661M18600 = abstractC22089.m18600();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f50140;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, abstractC22089, c6661M18600) && atomicReferenceFieldUpdater3.get(this) == abstractC22089) {
                    }
                }
            }
        }
        return abstractC22088;
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
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m36827(Object obj) {
        Throwable thM36815;
        Object objM36824;
        Throwable thM51539;
        C7406 c7406;
        InterfaceC21146 interfaceC21146;
        C1951 c1951M36810;
        C22834 c22834;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objM36808 = C13137.f42022;
        if (this instanceof C6975) {
            do {
                Object objM36825 = m36824();
                if (!(objM36825 instanceof InterfaceC21146) || ((objM36825 instanceof C22834) && ((C22834) objM36825).m51538())) {
                    objM36808 = C13137.f42022;
                    break;
                }
                objM36808 = m36808(objM36825, new C12238(m36815(obj), false));
            } while (objM36808 == C13137.f42027);
            if (objM36808 != C13137.f42023) {
                if (objM36808 == C13137.f42022) {
                    thM36815 = null;
                    loop1: while (true) {
                        objM36824 = m36824();
                        if (objM36824 instanceof C22834) {
                            synchronized (objM36824) {
                                if (((C22834) objM36824).m51537()) {
                                    c7406 = C13137.f42024;
                                } else {
                                    boolean zM51541 = ((C22834) objM36824).m51541();
                                    if (obj == null || !zM51541) {
                                        if (thM36815 == null) {
                                            thM36815 = m36815(obj);
                                        }
                                        ((C22834) objM36824).m51535(thM36815);
                                    }
                                    thM51539 = zM51541 ? null : ((C22834) objM36824).m51539();
                                    if (thM51539 != null) {
                                        m36812(((C22834) objM36824).mo6734(), thM51539);
                                    }
                                    c7406 = C13137.f42022;
                                }
                            }
                        } else if (objM36824 instanceof InterfaceC21146) {
                            if (thM36815 == null) {
                                thM36815 = m36815(obj);
                            }
                            interfaceC21146 = (InterfaceC21146) objM36824;
                            if (interfaceC21146.mo6735()) {
                                c1951M36810 = m36810(interfaceC21146);
                                if (c1951M36810 == null) {
                                    continue;
                                } else {
                                    c22834 = new C22834(c1951M36810, thM36815);
                                    atomicReferenceFieldUpdater = f50140;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21146, c22834)) {
                                            m36812(c1951M36810, thM36815);
                                            c7406 = C13137.f42022;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC21146) {
                                        }
                                    }
                                }
                            } else {
                                objM36808 = m36808(objM36824, new C12238(thM36815, false));
                                if (objM36808 != C13137.f42022) {
                                    throw new IllegalStateException(("Cannot happen in " + objM36824).toString());
                                }
                                if (objM36808 != C13137.f42027) {
                                    break;
                                }
                            }
                        } else {
                            c7406 = C13137.f42024;
                        }
                        objM36808 = c7406;
                        break;
                    }
                }
                if (objM36808 != C13137.f42022 && objM36808 != C13137.f42023) {
                    if (objM36808 == C13137.f42024) {
                        return false;
                    }
                    mo5177(objM36808);
                    return true;
                }
            }
        } else {
            if (objM36808 == C13137.f42022) {
                thM36815 = null;
                loop1: while (true) {
                    objM36824 = m36824();
                    if (objM36824 instanceof C22834) {
                        synchronized (objM36824) {
                            if (((C22834) objM36824).m51537()) {
                                c7406 = C13137.f42024;
                            } else {
                                boolean zM51542 = ((C22834) objM36824).m51541();
                                if (obj == null) {
                                    if (thM36815 == null) {
                                        thM36815 = m36815(obj);
                                    }
                                    ((C22834) objM36824).m51535(thM36815);
                                } else {
                                    if (thM36815 == null) {
                                        thM36815 = m36815(obj);
                                    }
                                    ((C22834) objM36824).m51535(thM36815);
                                }
                                if (zM51542) {
                                }
                                if (thM51539 != null) {
                                    m36812(((C22834) objM36824).mo6734(), thM51539);
                                }
                                c7406 = C13137.f42022;
                            }
                        }
                    } else if (objM36824 instanceof InterfaceC21146) {
                        if (thM36815 == null) {
                            thM36815 = m36815(obj);
                        }
                        interfaceC21146 = (InterfaceC21146) objM36824;
                        if (interfaceC21146.mo6735()) {
                            c1951M36810 = m36810(interfaceC21146);
                            if (c1951M36810 == null) {
                                continue;
                            } else {
                                c22834 = new C22834(c1951M36810, thM36815);
                                atomicReferenceFieldUpdater = f50140;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21146, c22834)) {
                                        m36812(c1951M36810, thM36815);
                                        c7406 = C13137.f42022;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC21146) {
                                    }
                                }
                            }
                        } else {
                            objM36808 = m36808(objM36824, new C12238(thM36815, false));
                            if (objM36808 != C13137.f42022) {
                                throw new IllegalStateException(("Cannot happen in " + objM36824).toString());
                            }
                            if (objM36808 != C13137.f42027) {
                                break;
                                break;
                            }
                        }
                    } else {
                        c7406 = C13137.f42024;
                    }
                    objM36808 = c7406;
                    break;
                }
            }
            if (objM36808 != C13137.f42022) {
                if (objM36808 == C13137.f42024) {
                    return false;
                }
                mo5177(objM36808);
                return true;
            }
        }
        return true;
    }

    @Override // l.InterfaceC9211
    /* JADX INFO: renamed from: ۙ */
    public final void mo24382(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2500(mo36818(), null, this);
        }
        m36827(cancellationException);
    }

    @Override // l.InterfaceC16866
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CancellationException mo36823() {
        Throwable thM51539;
        Object objM36824 = m36824();
        if (objM36824 instanceof C22834) {
            thM51539 = ((C22834) objM36824).m51539();
        } else if (objM36824 instanceof C12238) {
            thM51539 = ((C12238) objM36824).f39390;
        } else {
            if (objM36824 instanceof InterfaceC21146) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM36824).toString());
            }
            thM51539 = null;
        }
        CancellationException cancellationException = thM51539 instanceof CancellationException ? (CancellationException) thM51539 : null;
        return cancellationException == null ? new C2500("Parent job is ".concat(m36807(objM36824)), thM51539, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private final Throwable m36815(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2500(mo36818(), null, this) : th;
        }
        C15243.m36587(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC16866) obj).mo36823();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final C1951 m36810(InterfaceC21146 interfaceC21146) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1951 c1951Mo6734 = interfaceC21146.mo6734();
        if (c1951Mo6734 != null) {
            return c1951Mo6734;
        }
        if (interfaceC21146 instanceof C24876) {
            return new C1951();
        }
        if (!(interfaceC21146 instanceof AbstractC22088)) {
            throw new IllegalStateException(("State should have list: " + interfaceC21146).toString());
        }
        AbstractC22088 abstractC22088 = (AbstractC22088) interfaceC21146;
        abstractC22088.m18596(new C1951());
        C6661 c6661M18600 = abstractC22088.m18600();
        do {
            atomicReferenceFieldUpdater = f50140;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC22088, c6661M18600)) {
                return null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC22088);
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final Object m36808(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC21146)) {
            return C13137.f42022;
        }
        if (((obj instanceof C24876) || (obj instanceof AbstractC22088)) && !(obj instanceof C3289) && !(obj2 instanceof C12238)) {
            InterfaceC21146 interfaceC21146 = (InterfaceC21146) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50140;
            Object c18162 = obj2 instanceof InterfaceC21146 ? new C18162((InterfaceC21146) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC21146, c18162)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC21146) {
                    return C13137.f42027;
                }
            }
            mo36825(obj2);
            m36814(interfaceC21146, obj2);
            return obj2;
        }
        InterfaceC21146 interfaceC21147 = (InterfaceC21146) obj;
        C1951 c1951M36810 = m36810(interfaceC21147);
        if (c1951M36810 == null) {
            return C13137.f42027;
        }
        C3289 c3289M36811 = null;
        C22834 c22834 = interfaceC21147 instanceof C22834 ? (C22834) interfaceC21147 : null;
        if (c22834 == null) {
            c22834 = new C22834(c1951M36810, null);
        }
        C22834 c22835 = c22834;
        synchronized (c22835) {
            if (c22835.m51538()) {
                return C13137.f42022;
            }
            c22835.m51536();
            if (c22835 != interfaceC21147) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f50140;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC21147, c22835)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC21147) {
                        return C13137.f42027;
                    }
                }
            }
            boolean zM51541 = c22835.m51541();
            C12238 c12238 = obj2 instanceof C12238 ? (C12238) obj2 : null;
            if (c12238 != null) {
                c22835.m51535(c12238.f39390);
            }
            Throwable thM51539 = c22835.m51539();
            if (zM51541) {
                thM51539 = null;
            }
            C11471 c11471 = C11471.f36082;
            if (thM51539 != null) {
                m36812(c1951M36810, thM51539);
            }
            C3289 c3289 = interfaceC21147 instanceof C3289 ? (C3289) interfaceC21147 : null;
            if (c3289 == null) {
                C1951 c1951Mo6734 = interfaceC21147.mo6734();
                if (c1951Mo6734 != null) {
                    c3289M36811 = m36811((C6661) c1951Mo6734);
                }
            } else {
                c3289M36811 = c3289;
            }
            if (c3289M36811 != null) {
                while (C13686.m33476(c3289M36811.f10712, new C10899(this, c22835, c3289M36811, obj2), 1) == C11645.f37670) {
                    c3289M36811 = m36811((C6661) c3289M36811);
                    if (c3289M36811 == null) {
                    }
                }
                return C13137.f42023;
            }
            return m36809(c22835, obj2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3289 m36811(C6661 c6661) {
        while (c6661.mo18598()) {
            c6661 = c6661.m18599();
        }
        while (true) {
            c6661 = c6661.m18600();
            if (!c6661.mo18598()) {
                if (c6661 instanceof C3289) {
                    return (C3289) c6661;
                }
                if (c6661 instanceof C1951) {
                    return null;
                }
            }
        }
    }

    @Override // l.InterfaceC9211
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23427 mo24381(C15374 c15374) {
        return (InterfaceC23427) C13686.m33476(this, new C3289(c15374), 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo36821(C13377 c13377) {
        throw c13377;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m36807(m36824()) + '}');
        sb.append('@');
        sb.append(C21892.m49586(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36807(Object obj) {
        if (obj instanceof C22834) {
            C22834 c22834 = (C22834) obj;
            if (c22834.m51541()) {
                return "Cancelling";
            }
            return c22834.m51538() ? "Completing" : "Active";
        }
        if (obj instanceof InterfaceC21146) {
            return ((InterfaceC21146) obj).mo6735() ? "Active" : "New";
        }
        return obj instanceof C12238 ? "Cancelled" : "Completed";
    }
}
