package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܰ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14149 extends AbstractC13255 implements InterfaceC8275, InterfaceC14771 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f46444 = AtomicReferenceFieldUpdater.newUpdater(C14149.class, Object.class, "_reusableCancellableContinuation");
    public volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC12405 f46445;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC18858 f46446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f46447;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f46448;

    @Override // l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        return this.f46446.getContext();
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14771 mo32429() {
        return this;
    }

    public C14149(AbstractC12405 abstractC12405, AbstractC18858 abstractC18858) {
        super(-1);
        this.f46445 = abstractC12405;
        this.f46446 = abstractC18858;
        this.f46447 = C12032.f40295;
        this.f46448 = C17675.m41153(abstractC18858.getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // l.InterfaceC8275
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8275 mo21694() {
        AbstractC18858 abstractC18858 = this.f46446;
        if (C6009.m16315(abstractC18858)) {
            return abstractC18858;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34227() {
        Object obj = this._reusableCancellableContinuation;
        C13110 c13110 = obj instanceof C13110 ? (C13110) obj : null;
        if (c13110 != null) {
            c13110.m32436();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m34226() {
        return this._reusableCancellableContinuation != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13110 m34223() {
        C21203 c21203 = C12032.f40294;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = c21203;
                return null;
            }
            if (obj instanceof C13110) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46444;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c21203)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return (C13110) obj;
            }
            if (obj != c21203 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۨ */
    public final Object mo32437() {
        Object obj = this.f46447;
        this.f46447 = C12032.f40295;
        return obj;
    }

    @Override // l.InterfaceC14771
    /* JADX INFO: renamed from: ۙ */
    public final void mo2097(Object obj) {
        AbstractC18858 abstractC18858 = this.f46446;
        InterfaceC22386 context = abstractC18858.getContext();
        Throwable thM41594 = C17904.m41594(obj);
        Object c18754 = thM41594 == null ? obj : new C18754(thM41594, false);
        AbstractC12405 abstractC12405 = this.f46445;
        if (abstractC12405.mo30859()) {
            this.f46447 = c18754;
            this.f44023 = 0;
            abstractC12405.mo8623(context, this);
            return;
        }
        AbstractC21721 abstractC21721M47939 = C21390.m47939();
        if (abstractC21721M47939.m48461()) {
            this.f46447 = c18754;
            this.f44023 = 0;
            abstractC21721M47939.m48459((AbstractC13255) this);
            return;
        }
        abstractC21721M47939.m48460(true);
        try {
            InterfaceC22386 context2 = abstractC18858.getContext();
            Object objM41155 = C17675.m41155(context2, this.f46448);
            try {
                abstractC18858.mo2097(obj);
                C7321 c7321 = C7321.f24318;
                C17675.m41154(context2, objM41155);
                while (abstractC21721M47939.m48465()) {
                }
            } catch (Throwable th) {
                C17675.m41154(context2, objM41155);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m32737(th2, (Throwable) null);
            } finally {
                abstractC21721M47939.m48463();
            }
        }
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۙ */
    public final void mo32430(Object obj, CancellationException cancellationException) {
        if (obj instanceof C8171) {
            throw null;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f46445 + ", " + C13961.m33817((InterfaceC14771) this.f46446) + ']';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m34224(C13110 c13110) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C21203 c21203 = C12032.f40294;
            if (obj == c21203) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46444;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c21203, c13110)) {
                    if (atomicReferenceFieldUpdater.get(this) != c21203) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46444;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34225(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C21203 c21203 = C12032.f40294;
            if (C13465.m32965(obj, c21203)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46444;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c21203, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c21203) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f46444;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                }
            }
            return false;
        }
    }
}
