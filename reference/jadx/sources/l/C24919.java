package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes.dex */
public final class C24919 extends AbstractC12941 implements InterfaceC11492, InterfaceC24217, InterfaceC6426 {
    public volatile /* synthetic */ int _decisionAndIndex$volatile;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f80646;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC4825 f80647;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f80645 = AtomicIntegerFieldUpdater.newUpdater(C24919.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80643 = AtomicReferenceFieldUpdater.newUpdater(C24919.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80644 = AtomicReferenceFieldUpdater.newUpdater(C24919.class, Object.class, "_parentHandle$volatile");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m55503(AbstractC9642 abstractC9642, Throwable th) {
        InterfaceC11536 interfaceC11536 = this.f80646;
        int i = f80645.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC9642.mo25152(i, interfaceC11536);
        } catch (Throwable th2) {
            C9254.m24437(new C13377("Exception in invokeOnCancellation handler for " + this, th2), interfaceC11536);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55504(C10631 c10631, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c10631 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55511(InterfaceC3071 interfaceC3071) {
        m55502(Boolean.TRUE, this.f41495, interfaceC3071);
    }

    @Override // l.InterfaceC4825
    /* JADX INFO: renamed from: ۙ */
    public final void mo8188(Object obj) {
        Throwable thM51055 = C22660.m51055(obj);
        if (thM51055 != null) {
            obj = new C12238(thM51055, false);
        }
        m55502(obj, this.f41495, null);
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4825 mo32326() {
        return this.f80647;
    }

    public C24919(InterfaceC4825 interfaceC4825, int i) {
        super(i);
        this.f80647 = interfaceC4825;
        this.f80646 = interfaceC4825.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C15221.f49683;
    }

    @Override // l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        return this.f80646;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m55516() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80644;
        InterfaceC11449 interfaceC11449 = (InterfaceC11449) atomicReferenceFieldUpdater.get(this);
        if (interfaceC11449 == null) {
            return;
        }
        interfaceC11449.mo28808();
        atomicReferenceFieldUpdater.set(this, C11645.f37670);
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۤ */
    public final Object mo32329() {
        return f80643.get(this);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m55514() {
        InterfaceC11449 interfaceC11449M55505 = m55505();
        if (interfaceC11449M55505 == null || (f80643.get(this) instanceof InterfaceC25072)) {
            return;
        }
        interfaceC11449M55505.mo28808();
        f80644.set(this, C11645.f37670);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private final boolean m55506() {
        if (this.f41495 != 2) {
            return false;
        }
        InterfaceC4825 interfaceC4825 = this.f80647;
        C15243.m36587((Object) interfaceC4825, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C25307) interfaceC4825).m56566();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m55507() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C20443) && ((C20443) obj).f65477 != null) {
            m55516();
            return false;
        }
        f80645.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C15221.f49683);
        return true;
    }

    @Override // l.InterfaceC24217
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24217 mo5178() {
        InterfaceC4825 interfaceC4825 = this.f80647;
        if (interfaceC4825 instanceof InterfaceC24217) {
            return (InterfaceC24217) interfaceC4825;
        }
        return null;
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۙ */
    public final void mo32327(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC25072) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C12238) {
                return;
            }
            if (!(obj2 instanceof C20443)) {
                C20443 c20443 = new C20443(obj2, (InterfaceC1798) null, (InterfaceC3071) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c20443)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C20443 c20444 = (C20443) obj2;
            if (c20444.f65476 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C20443 c20445 = new C20443(c20444.f65478, (15 & 2) != 0 ? c20444.f65479 : null, c20444.f65480, c20444.f65477, (15 & 16) != 0 ? c20444.f65476 : cancellationException);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c20445)) {
                    InterfaceC1798 interfaceC1798 = c20444.f65479;
                    if (interfaceC1798 != null) {
                        m55510(interfaceC1798, (Throwable) cancellationException);
                    }
                    InterfaceC3071 interfaceC3071 = c20444.f65480;
                    if (interfaceC3071 != null) {
                        m55512(interfaceC3071, (Throwable) cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55509(CancellationException cancellationException) {
        boolean zM56564;
        if (m55506()) {
            InterfaceC4825 interfaceC4825 = this.f80647;
            C15243.m36587((Object) interfaceC4825, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            zM56564 = ((C25307) interfaceC4825).m56564((Throwable) cancellationException);
        } else {
            zM56564 = false;
        }
        if (zM56564) {
            return;
        }
        m55508((Throwable) cancellationException);
        if (m55506()) {
            return;
        }
        m55516();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55508(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC25072)) {
                return;
            }
            C17459 c17459 = new C17459(this, th, (obj instanceof InterfaceC1798) || (obj instanceof AbstractC9642));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c17459)) {
                    InterfaceC25072 interfaceC25072 = (InterfaceC25072) obj;
                    if (interfaceC25072 instanceof InterfaceC1798) {
                        m55510((InterfaceC1798) obj, th);
                    } else if (interfaceC25072 instanceof AbstractC9642) {
                        m55503((AbstractC9642) obj, th);
                    }
                    if (!m55506()) {
                        m55516();
                    }
                    m55501(this.f41495);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55510(InterfaceC1798 interfaceC1798, Throwable th) {
        try {
            interfaceC1798.mo6276();
        } catch (Throwable th2) {
            C9254.m24437(new C13377("Exception in invokeOnCancellation handler for " + this, th2), this.f80646);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55512(InterfaceC3071 interfaceC3071, Throwable th) {
        try {
            interfaceC3071.invoke(th);
        } catch (Throwable th2) {
            C9254.m24437(new C13377("Exception in resume onCancellation handler for " + this, th2), this.f80646);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m55501(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f80645;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC4825 interfaceC4825 = this.f80647;
                if (!z && (interfaceC4825 instanceof C25307)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f41495;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C25307 c25307 = (C25307) interfaceC4825;
                        AbstractC18951 abstractC18951 = c25307.f81754;
                        InterfaceC11536 context = c25307.f81753.getContext();
                        if (abstractC18951.mo42813()) {
                            abstractC18951.mo11210(context, this);
                            return;
                        }
                        AbstractC16670 abstractC16670M52769 = C23580.m52769();
                        if (abstractC16670M52769.m39382()) {
                            abstractC16670M52769.m39383((AbstractC12941) this);
                            return;
                        }
                        abstractC16670M52769.m39384(true);
                        try {
                            C5484.m16312(this, interfaceC4825, true);
                            do {
                            } while (abstractC16670M52769.m39387());
                        } catch (Throwable th) {
                            try {
                                m32328(th, (Throwable) null);
                            } finally {
                                abstractC16670M52769.m39386();
                            }
                        }
                        return;
                    }
                }
                C5484.m16312(this, interfaceC4825, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, (536870911 & i2) + 1073741824));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m55515() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zM55506 = m55506();
        do {
            atomicIntegerFieldUpdater = f80645;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM55506) {
                    m55513();
                }
                Object obj = f80643.get(this);
                if (obj instanceof C12238) {
                    throw ((C12238) obj).f39390;
                }
                int i3 = this.f41495;
                if (i3 == 1 || i3 == 2) {
                    C1009 c1009 = InterfaceC9211.f30029;
                    InterfaceC9211 interfaceC9211 = (InterfaceC9211) this.f80646.mo5005(C1009.f3674);
                    if (interfaceC9211 != null && !interfaceC9211.mo24383()) {
                        CancellationException cancellationExceptionMo24384 = interfaceC9211.mo24384();
                        mo32327(obj, cancellationExceptionMo24384);
                        throw cancellationExceptionMo24384;
                    }
                }
                return mo32330(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, (536870911 & i) + 536870912));
        if (((InterfaceC11449) f80644.get(this)) == null) {
            m55505();
        }
        if (zM55506) {
            m55513();
        }
        return EnumC16757.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final InterfaceC11449 m55505() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1009 c1009 = InterfaceC9211.f30029;
        InterfaceC9211 interfaceC9211 = (InterfaceC9211) this.f80646.mo5005(C1009.f3674);
        if (interfaceC9211 == null) {
            return null;
        }
        InterfaceC11449 interfaceC11449M33476 = C13686.m33476(interfaceC9211, new C15967(this), 2);
        do {
            atomicReferenceFieldUpdater = f80644;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC11449M33476)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC11449M33476;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m55513() {
        Throwable thM56563;
        InterfaceC4825 interfaceC4825 = this.f80647;
        C25307 c25307 = interfaceC4825 instanceof C25307 ? (C25307) interfaceC4825 : null;
        if (c25307 == null || (thM56563 = c25307.m56563(this)) == null) {
            return;
        }
        m55516();
        m55508(thM56563);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC6426
    /* JADX INFO: renamed from: ۙ */
    public final void mo18187(C10631 c10631, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f80645;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C15221) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10631)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC1798 ? true : obj instanceof AbstractC9642) {
                m55504(c10631, obj);
                throw null;
            }
            if (!(obj instanceof C12238)) {
                if (!(obj instanceof C20443) || ((C20443) obj).f65479 == null) {
                    return;
                }
                m55504(c10631, obj);
                throw null;
            }
            C12238 c12238 = (C12238) obj;
            if (!c12238.m30571()) {
                m55504(c10631, obj);
                throw null;
            }
            if (obj instanceof C17459) {
                Throwable th = c12238.f39390;
                if (c10631 instanceof InterfaceC1798) {
                    m55510((InterfaceC1798) c10631, th);
                    return;
                } else {
                    m55503((AbstractC9642) c10631, th);
                    return;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m55500(InterfaceC25072 interfaceC25072, Object obj, int i, InterfaceC3071 interfaceC3071) {
        if (obj instanceof C12238) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC3071 != null || (interfaceC25072 instanceof InterfaceC1798)) {
            return new C20443(obj, interfaceC25072 instanceof InterfaceC1798 ? (InterfaceC1798) interfaceC25072 : null, interfaceC3071, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m55502(Object obj, int i, InterfaceC3071 interfaceC3071) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC25072)) {
                if (obj2 instanceof C17459) {
                    C17459 c17459 = (C17459) obj2;
                    if (c17459.m40960()) {
                        if (interfaceC3071 != null) {
                            m55512(interfaceC3071, c17459.f39390);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM55500 = m55500((InterfaceC25072) obj2, obj, i, interfaceC3071);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM55500)) {
                    if (!m55506()) {
                        m55516();
                    }
                    m55501(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // l.InterfaceC11492
    /* JADX INFO: renamed from: ۙ */
    public final C7406 mo28886(Object obj, InterfaceC3071 interfaceC3071) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80643;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC25072)) {
                return null;
            }
            Object objM55500 = m55500((InterfaceC25072) obj2, obj, this.f41495, interfaceC3071);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM55500)) {
                    boolean zM55506 = m55506();
                    C7406 c7406 = C16713.f53991;
                    if (!zM55506) {
                        m55516();
                    }
                    return c7406;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // l.InterfaceC11492
    /* JADX INFO: renamed from: ᩸ */
    public final void mo28887() {
        m55501(this.f41495);
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۤ */
    public final Object mo32330(Object obj) {
        return obj instanceof C20443 ? ((C20443) obj).f65478 : obj;
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ᩷ */
    public final Throwable mo32331(Object obj) {
        Throwable thMo32331 = super.mo32331(obj);
        if (thMo32331 != null) {
            return thMo32331;
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(C21892.m49587(this.f80647));
        sb.append("){");
        Object obj = f80643.get(this);
        if (obj instanceof InterfaceC25072) {
            str = "Active";
        } else {
            str = obj instanceof C17459 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C21892.m49586((Object) this));
        return sb.toString();
    }
}
