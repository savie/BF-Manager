package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩻᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes.dex */
public final class C25307 extends AbstractC12941 implements InterfaceC24217, InterfaceC4825 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f81751 = AtomicReferenceFieldUpdater.newUpdater(C25307.class, Object.class, "_reusableCancellableContinuation$volatile");
    public volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f81752;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC6317 f81753;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC18951 f81754;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f81755;

    @Override // l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        return this.f81753.getContext();
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4825 mo32326() {
        return this;
    }

    public C25307(AbstractC18951 abstractC18951, AbstractC6317 abstractC6317) {
        super(-1);
        this.f81754 = abstractC18951;
        this.f81753 = abstractC6317;
        this.f81752 = C14117.f44639;
        InterfaceC11536 context = abstractC6317.getContext();
        C7406 c7406 = C19756.f63579;
        Object objMo5004 = context.mo5004(0, C21994.f70949);
        C15243.m36586(objMo5004);
        this.f81755 = objMo5004;
    }

    @Override // l.InterfaceC24217
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24217 mo5178() {
        AbstractC6317 abstractC6317 = this.f81753;
        if (C1402.m5130(abstractC6317)) {
            return abstractC6317;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m56566() {
        return f81751.get(this) != null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m56565() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f81751;
        } while (atomicReferenceFieldUpdater.get(this) == C14117.f44638);
        Object obj = atomicReferenceFieldUpdater.get(this);
        C24919 c24919 = obj instanceof C24919 ? (C24919) obj : null;
        if (c24919 != null) {
            c24919.m55516();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24919 m56567() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81751;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7406 c7406 = C14117.f44638;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, c7406);
                return null;
            }
            if (obj instanceof C24919) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c7406)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return (C24919) obj;
            }
            if (obj != c7406 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m56563(C24919 c24919) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81751;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7406 c7406 = C14117.f44638;
            if (obj == c7406) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c7406, c24919)) {
                    if (atomicReferenceFieldUpdater.get(this) != c7406) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56564(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81751;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7406 c7406 = C14117.f44638;
            if (C15243.m36589(obj, c7406)) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c7406, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c7406) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return false;
        }
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۤ */
    public final Object mo32329() {
        Object obj = this.f81752;
        this.f81752 = C14117.f44639;
        return obj;
    }

    @Override // l.InterfaceC4825
    /* JADX INFO: renamed from: ۙ */
    public final void mo8188(Object obj) {
        AbstractC6317 abstractC6317 = this.f81753;
        InterfaceC11536 context = abstractC6317.getContext();
        Throwable thM51055 = C22660.m51055(obj);
        Object c12238 = thM51055 == null ? obj : new C12238(thM51055, false);
        AbstractC18951 abstractC18951 = this.f81754;
        if (abstractC18951.mo42813()) {
            this.f81752 = c12238;
            this.f41495 = 0;
            abstractC18951.mo11210(context, this);
            return;
        }
        AbstractC16670 abstractC16670M52769 = C23580.m52769();
        if (abstractC16670M52769.m39382()) {
            this.f81752 = c12238;
            this.f41495 = 0;
            abstractC16670M52769.m39383((AbstractC12941) this);
            return;
        }
        abstractC16670M52769.m39384(true);
        try {
            InterfaceC11536 context2 = abstractC6317.getContext();
            Object objM45511 = C19756.m45511(context2, this.f81755);
            try {
                abstractC6317.mo8188(obj);
                C11471 c11471 = C11471.f36082;
                C19756.m45510(context2, objM45511);
                while (abstractC16670M52769.m39387()) {
                }
            } catch (Throwable th) {
                C19756.m45510(context2, objM45511);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m32328(th2, (Throwable) null);
            } finally {
                abstractC16670M52769.m39386();
            }
        }
    }

    @Override // l.AbstractC12941
    /* JADX INFO: renamed from: ۙ */
    public final void mo32327(Object obj, CancellationException cancellationException) {
        if (obj instanceof C6273) {
            throw null;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f81754 + ", " + C21892.m49587((InterfaceC4825) this.f81753) + ']';
    }
}
