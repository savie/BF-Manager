package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.۬۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13110 extends AbstractC13255 implements InterfaceC14771, InterfaceC8275 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43674 = AtomicIntegerFieldUpdater.newUpdater(C13110.class, "_decision");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43675 = AtomicReferenceFieldUpdater.newUpdater(C13110.class, Object.class, "_state");
    public volatile /* synthetic */ int _decision;
    public volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 f43676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f43677;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC23133 f43678;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32424(Object obj, InterfaceC15456 interfaceC15456) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC15456 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32442(InterfaceC15456 interfaceC15456) {
        m32423(Boolean.TRUE, this.f44023, interfaceC15456);
    }

    @Override // l.InterfaceC14771
    /* JADX INFO: renamed from: ۙ */
    public final void mo2097(Object obj) {
        Throwable thM41594 = C17904.m41594(obj);
        if (thM41594 != null) {
            obj = new C18754(thM41594, false);
        }
        m32423(obj, this.f44023, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m32426(InterfaceC15456 interfaceC15456, Throwable th) {
        try {
            interfaceC15456.invoke(th);
        } catch (Throwable th2) {
            C23694.m52151(new C8877("Exception in invokeOnCancellation handler for " + this, th2), this.f43677);
        }
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 mo32429() {
        return this.f43676;
    }

    public C13110(InterfaceC14771 interfaceC14771, int i) {
        super(i);
        this.f43676 = interfaceC14771;
        this.f43677 = interfaceC14771.getContext();
        this._decision = 0;
        this._state = C11699.f39325;
    }

    @Override // l.InterfaceC14771
    public final InterfaceC22386 getContext() {
        return this.f43677;
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo32437() {
        return this._state;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private final boolean m32420() {
        return this.f44023 == 2 && ((C14149) this.f43676).m34226();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m32427() {
        Object obj = this._state;
        if ((obj instanceof C18048) && ((C18048) obj).f57709 != null) {
            m32436();
            return false;
        }
        this._decision = 0;
        this._state = C11699.f39325;
        return true;
    }

    @Override // l.InterfaceC8275
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8275 mo21694() {
        InterfaceC14771 interfaceC14771 = this.f43676;
        if (interfaceC14771 instanceof InterfaceC8275) {
            return (InterfaceC8275) interfaceC14771;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32432(CancellationException cancellationException) {
        if (!m32420() ? false : ((C14149) this.f43676).m34225((Throwable) cancellationException)) {
            return;
        }
        m32431((Throwable) cancellationException);
        if (m32420()) {
            return;
        }
        m32436();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32433(AbstractC1114 abstractC1114, Throwable th) {
        try {
            abstractC1114.mo4130(th);
        } catch (Throwable th2) {
            C23694.m52151(new C8877("Exception in invokeOnCancellation handler for " + this, th2), this.f43677);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32435(InterfaceC15456 interfaceC15456, Throwable th) {
        try {
            interfaceC15456.invoke(th);
        } catch (Throwable th2) {
            C23694.m52151(new C8877("Exception in resume onCancellation handler for " + this, th2), this.f43677);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object m32443() {
        C14149 c14149;
        Throwable thM34224;
        Throwable thM34225;
        C6198 c6198 = C6198.f21082;
        boolean zM32420 = m32420();
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    if (zM32420) {
                        InterfaceC14771 interfaceC14771 = this.f43676;
                        c14149 = interfaceC14771 instanceof C14149 ? (C14149) interfaceC14771 : null;
                        if (c14149 != null && (thM34224 = c14149.m34224(this)) != null) {
                            m32436();
                            m32431(thM34224);
                        }
                    }
                    Object obj = this._state;
                    if (obj instanceof C18754) {
                        throw ((C18754) obj).f60808;
                    }
                    int i2 = this.f44023;
                    if (i2 == 1 || i2 == 2) {
                        InterfaceC22386 interfaceC22386 = this.f43677;
                        C6198 c6199 = InterfaceC11138.f37788;
                        InterfaceC11138 interfaceC11138 = (InterfaceC11138) interfaceC22386.mo4416(c6198);
                        if (interfaceC11138 != null && !interfaceC11138.mo7120()) {
                            CancellationException cancellationExceptionMo7109 = interfaceC11138.mo7109();
                            mo32430(obj, cancellationExceptionMo7109);
                            throw cancellationExceptionMo7109;
                        }
                    }
                    return mo32438(obj);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f43674.compareAndSet(this, 0, 1));
        if (this.f43678 == null) {
            InterfaceC22386 interfaceC22387 = this.f43677;
            C6198 c61910 = InterfaceC11138.f37788;
            InterfaceC11138 interfaceC11139 = (InterfaceC11138) interfaceC22387.mo4416(c6198);
            if (interfaceC11139 != null) {
                this.f43678 = interfaceC11139.mo7113((1 & 1) == 0, (1 & 2) != 0, new C22988(this));
            }
        }
        if (zM32420) {
            InterfaceC14771 interfaceC14772 = this.f43676;
            c14149 = interfaceC14772 instanceof C14149 ? (C14149) interfaceC14772 : null;
            if (c14149 != null && (thM34225 = c14149.m34224(this)) != null) {
                m32436();
                m32431(thM34225);
            }
        }
        return EnumC13214.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32434(InterfaceC15456 interfaceC15456) {
        AbstractC1114 abstractC1114 = (AbstractC1114) interfaceC15456;
        while (true) {
            Object obj = this._state;
            if (obj instanceof C11699) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43675;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1114)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof AbstractC1114) {
                m32424(obj, interfaceC15456);
                throw null;
            }
            if (obj instanceof C18754) {
                C18754 c18754 = (C18754) obj;
                if (!c18754.m43305()) {
                    m32424(obj, interfaceC15456);
                    throw null;
                }
                if (obj instanceof C6759) {
                    m32426(interfaceC15456, c18754.f60808);
                    return;
                }
                return;
            }
            if (!(obj instanceof C18048)) {
                if (abstractC1114 instanceof AbstractC2525) {
                    return;
                }
                C18048 c18048 = new C18048(obj, abstractC1114, (InterfaceC15456) null, (Throwable) null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43675;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c18048)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            C18048 c18049 = (C18048) obj;
            if (c18049.f57710 != null) {
                m32424(obj, interfaceC15456);
                throw null;
            }
            if (abstractC1114 instanceof AbstractC2525) {
                return;
            }
            Throwable th = c18049.f57707;
            if (th != null) {
                m32426(interfaceC15456, th);
                return;
            }
            C18048 c18048M42044 = C18048.m42044(c18049, abstractC1114, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f43675;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c18048M42044)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m32421(InterfaceC3750 interfaceC3750, Object obj, int i, InterfaceC15456 interfaceC15456) {
        if (obj instanceof C18754) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC15456 != null || ((interfaceC3750 instanceof AbstractC1114) && !(interfaceC3750 instanceof AbstractC2525))) {
            return new C18048(obj, interfaceC3750 instanceof AbstractC1114 ? (AbstractC1114) interfaceC3750 : null, interfaceC15456, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final C21203 m32425(Object obj, InterfaceC15456 interfaceC15456) {
        C21203 c21203 = C3936.f14652;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC3750)) {
                return null;
            }
            Object objM32421 = m32421((InterfaceC3750) obj2, obj, this.f44023, interfaceC15456);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43675;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM32421)) {
                    if (!m32420()) {
                        m32436();
                    }
                    return c21203;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m32436() {
        InterfaceC23133 interfaceC23133 = this.f43678;
        if (interfaceC23133 == null) {
            return;
        }
        interfaceC23133.mo10025();
        this.f43678 = C12924.f42947;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21203 m32440() {
        return m32425(Boolean.FALSE, (InterfaceC15456) null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21203 m32439(InterfaceC15456 interfaceC15456) {
        return m32425(Boolean.TRUE, interfaceC15456);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m32428() {
        m32422(this.f44023);
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object mo32438(Object obj) {
        return obj instanceof C18048 ? ((C18048) obj).f57708 : obj;
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Throwable mo32441(Object obj) {
        Throwable thMo32441 = super.mo32441(obj);
        if (thMo32441 != null) {
            return thMo32441;
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(C13961.m33817(this.f43676));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof InterfaceC3750) {
            str = "Active";
        } else {
            str = obj instanceof C6759 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C13961.m33816((Object) this));
        return sb.toString();
    }

    @Override // l.AbstractC13255
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32430(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC3750) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C18754) {
                return;
            }
            if (!(obj2 instanceof C18048)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43675;
                C18048 c18048 = new C18048(obj2, (AbstractC1114) null, (InterfaceC15456) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c18048)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C18048 c18049 = (C18048) obj2;
            if (c18049.f57707 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C18048 c18048M42044 = C18048.m42044(c18049, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43675;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c18048M42044)) {
                    AbstractC1114 abstractC1114 = c18049.f57710;
                    if (abstractC1114 != null) {
                        m32433(abstractC1114, (Throwable) cancellationException);
                    }
                    InterfaceC15456 interfaceC15456 = c18049.f57706;
                    if (interfaceC15456 != null) {
                        m32435(interfaceC15456, (Throwable) cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32431(Throwable th) {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof InterfaceC3750)) {
                return;
            }
            boolean z = obj instanceof AbstractC1114;
            C6759 c6759 = new C6759(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43675;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c6759)) {
                    AbstractC1114 abstractC1114 = z ? (AbstractC1114) obj : null;
                    if (abstractC1114 != null) {
                        m32433(abstractC1114, th);
                    }
                    if (!m32420()) {
                        m32436();
                    }
                    m32422(this.f44023);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m32422(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC14771 interfaceC14771 = this.f43676;
                boolean z = i == 4;
                if (!z && (interfaceC14771 instanceof C14149)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f44023;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        C14149 c14149 = (C14149) interfaceC14771;
                        AbstractC12405 abstractC12405 = c14149.f46445;
                        InterfaceC22386 context = c14149.f46446.getContext();
                        if (abstractC12405.mo30859()) {
                            abstractC12405.mo8623(context, this);
                            return;
                        }
                        AbstractC21721 abstractC21721M47939 = C21390.m47939();
                        if (abstractC21721M47939.m48461()) {
                            abstractC21721M47939.m48459((AbstractC13255) this);
                            return;
                        }
                        abstractC21721M47939.m48460(true);
                        try {
                            C4081.m11610(this, this.f43676, true);
                            do {
                            } while (abstractC21721M47939.m48465());
                        } catch (Throwable th) {
                            try {
                                m32737(th, (Throwable) null);
                            } finally {
                                abstractC21721M47939.m48463();
                            }
                        }
                        return;
                    }
                }
                C4081.m11610(this, interfaceC14771, z);
                return;
            }
        } while (!f43674.compareAndSet(this, 0, 2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m32423(Object obj, int i, InterfaceC15456 interfaceC15456) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC3750)) {
                if (obj2 instanceof C6759) {
                    C6759 c6759 = (C6759) obj2;
                    if (c6759.m18266()) {
                        if (interfaceC15456 != null) {
                            m32435(interfaceC15456, c6759.f60808);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM32421 = m32421((InterfaceC3750) obj2, obj, i, interfaceC15456);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43675;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM32421)) {
                    if (!m32420()) {
                        m32436();
                    }
                    m32422(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
