package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۢ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D97F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10153 implements InterfaceC7171, InterfaceC6426 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24919 f32514;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9407 f32515;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f32516 = C8662.f28277;

    public C10153(C9407 c9407) {
        this.f32515 = c9407;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    @Override // l.InterfaceC7171
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19742(InterfaceC4825 interfaceC4825) throws Throwable {
        C24919 c24919M56567;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9407.f30537;
        C9407 c9407 = this.f32515;
        C10631 c10631 = (C10631) atomicReferenceFieldUpdater.get(c9407);
        while (!c9407.m24786()) {
            long andIncrement = C9407.f30534.getAndIncrement(c9407);
            long j = C8662.f28287;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c10631.f31168 != j2) {
                C10631 c10631M24763 = c9407.m24763(j2, c10631);
                if (c10631M24763 == null) {
                    continue;
                } else {
                    c10631 = c10631M24763;
                }
            }
            Object objM24762 = c9407.m24762(c10631, i, andIncrement, null);
            if (objM24762 == C8662.f28273) {
                throw new IllegalStateException("unreachable");
            }
            if (objM24762 != C8662.f28283) {
                if (objM24762 != C8662.f28284) {
                    c10631.m32963();
                    this.f32516 = objM24762;
                    return Boolean.TRUE;
                }
                InterfaceC4825 interfaceC4825M33718 = C13808.m33718(interfaceC4825);
                if (interfaceC4825M33718 instanceof C25307) {
                    c24919M56567 = ((C25307) interfaceC4825M33718).m56567();
                    if (c24919M56567 == null) {
                        c24919M56567 = new C24919(interfaceC4825M33718, 2);
                    } else {
                        if (!c24919M56567.m55507()) {
                            c24919M56567 = null;
                        }
                        if (c24919M56567 == null) {
                            c24919M56567 = new C24919(interfaceC4825M33718, 2);
                        }
                    }
                } else {
                    c24919M56567 = new C24919(interfaceC4825M33718, 1);
                }
                C24919 c24919 = c24919M56567;
                try {
                    this.f32514 = c24919;
                    Object objM24763 = c9407.m24762(c10631, i, andIncrement, this);
                    if (objM24763 != C8662.f28273) {
                        if (objM24763 == C8662.f28283) {
                            if (andIncrement < c9407.m24780()) {
                                c10631.m32963();
                            }
                            c10631 = (C10631) C9407.f30537.get(c9407);
                            while (true) {
                                if (c9407.m24786()) {
                                    C24919 c249110 = this.f32514;
                                    C15243.m36586(c249110);
                                    this.f32514 = null;
                                    this.f32516 = C8662.m23330();
                                    Throwable thM24778 = c9407.m24778();
                                    if (thM24778 == null) {
                                        c249110.mo8188(Boolean.FALSE);
                                    } else {
                                        c249110.mo8188(C19676.m45347(thM24778));
                                    }
                                } else {
                                    long andIncrement2 = C9407.f30534.getAndIncrement(c9407);
                                    long j3 = C8662.f28287;
                                    long j4 = andIncrement2 / j3;
                                    i = (int) (andIncrement2 % j3);
                                    if (c10631.f31168 != j4) {
                                        C10631 c10631M24764 = c9407.m24763(j4, c10631);
                                        if (c10631M24764 != null) {
                                            c10631 = c10631M24764;
                                        }
                                    }
                                    objM24763 = c9407.m24762(c10631, i, andIncrement2, this);
                                    if (objM24763 == C8662.f28273) {
                                        mo18187(c10631, i);
                                    } else if (objM24763 == C8662.f28283) {
                                        if (andIncrement2 < c9407.m24780()) {
                                            c10631.m32963();
                                        }
                                    } else {
                                        if (objM24763 == C8662.f28284) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c10631.m32963();
                                    }
                                }
                            }
                        } else {
                            c10631.m32963();
                        }
                        this.f32516 = objM24763;
                        this.f32514 = null;
                        c24919.m55511((InterfaceC3071) null);
                    } else {
                        mo18187(c10631, i);
                    }
                    Object objM55515 = c24919.m55515();
                    EnumC16757 enumC16757 = EnumC16757.COROUTINE_SUSPENDED;
                    return objM55515;
                } catch (Throwable th) {
                    c24919.m55513();
                    throw th;
                }
            }
            if (andIncrement < c9407.m24780()) {
                c10631.m32963();
            }
        }
        this.f32516 = C8662.m23330();
        Throwable thM24779 = c9407.m24778();
        if (thM24779 == null) {
            return Boolean.FALSE;
        }
        int i2 = C8897.f29076;
        throw thM24779;
    }

    @Override // l.InterfaceC6426
    /* JADX INFO: renamed from: ۙ */
    public final void mo18187(C10631 c10631, int i) {
        C24919 c24919 = this.f32514;
        if (c24919 != null) {
            c24919.mo18187(c10631, i);
        }
    }

    @Override // l.InterfaceC7171
    public final Object next() throws Throwable {
        Object obj = this.f32516;
        if (obj != C8662.f28277) {
            this.f32516 = C8662.f28277;
            if (obj != C8662.m23330()) {
                return obj;
            }
            int i = C9407.f30540;
            Throwable thM24778 = this.f32515.m24778();
            if (thM24778 == null) {
                thM24778 = new C22566("Channel was closed");
            }
            int i2 = C8897.f29076;
            throw thM24778;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26264(C14115 c14115) {
        C24919 c24919 = this.f32514;
        C15243.m36586(c24919);
        this.f32514 = null;
        this.f32516 = c14115;
        return C8662.m23318(c24919, Boolean.TRUE, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26263() {
        C24919 c24919 = this.f32514;
        C15243.m36586(c24919);
        this.f32514 = null;
        this.f32516 = C8662.m23330();
        Throwable thM24778 = this.f32515.m24778();
        if (thM24778 == null) {
            c24919.mo8188(Boolean.FALSE);
        } else {
            c24919.mo8188(C19676.m45347(thM24778));
        }
    }
}
