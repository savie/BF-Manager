package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܽᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16829 implements InterfaceC3401 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53864;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f53865;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53866 = new ArrayDeque();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f53867;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C20357 f53868;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f53869;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f53870;

    /* JADX INFO: renamed from: ֨ */
    public abstract boolean mo21896();

    /* JADX INFO: renamed from: ۖ */
    public abstract InterfaceC9753 mo21897();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo21898(C2717 c2717);

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ */
    public final void mo26286(Object obj) {
        C2717 c2717 = (C2717) obj;
        C2023.m6507(c2717 == this.f53868);
        C20357 c20357 = (C20357) c2717;
        if (c20357.m42264()) {
            long j = this.f53870;
            this.f53870 = 1 + j;
            c20357.f65931 = j;
            this.f53864.add(c20357);
        } else {
            long j2 = c20357.f51910;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f53865;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f53870;
                    this.f53870 = 1 + j4;
                    c20357.f65931 = j4;
                    this.f53864.add(c20357);
                } else {
                    c20357.mo7();
                    this.f53866.add(c20357);
                }
            } else {
                long j5 = this.f53870;
                this.f53870 = 1 + j5;
                c20357.f65931 = j5;
                this.f53864.add(c20357);
            }
        }
        this.f53868 = null;
    }

    public AbstractC16829() {
        for (int i = 0; i < 10; i++) {
            this.f53866.add(new C20357(0));
        }
        this.f53869 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f53869.add(new C0600(new C16124(this)));
        }
        this.f53864 = new ArrayDeque();
        this.f53865 = -9223372036854775807L;
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ܰ */
    public final void mo26288(long j) {
        this.f53865 = j;
    }

    @Override // l.InterfaceC3401
    /* JADX INFO: renamed from: ۙ */
    public void mo6405(long j) {
        this.f53867 = j;
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۨ */
    public final Object mo26287() {
        C2023.m6510(this.f53868 == null);
        ArrayDeque arrayDeque = this.f53866;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C20357 c20357 = (C20357) arrayDeque.pollFirst();
        this.f53868 = c20357;
        return c20357;
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ܰ */
    public AbstractC5540 mo21899() {
        AbstractC5540 abstractC5540;
        ArrayDeque arrayDeque = this.f53869;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f53864;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C20357 c20357 = (C20357) arrayDeque2.peek();
            String str = C17983.f57504;
            if (c20357.f51910 > this.f53867) {
                return null;
            }
            C20357 c20358 = (C20357) arrayDeque2.poll();
            boolean zM42264 = c20358.m42264();
            ArrayDeque arrayDeque3 = this.f53866;
            if (zM42264) {
                abstractC5540 = (AbstractC5540) arrayDeque.pollFirst();
                abstractC5540.m42270(4);
            } else {
                mo21898((C2717) c20358);
                if (mo21896()) {
                    InterfaceC9753 interfaceC9753Mo21897 = mo21897();
                    abstractC5540 = (AbstractC5540) arrayDeque.pollFirst();
                    abstractC5540.m15246(c20358.f51910, interfaceC9753Mo21897, C17492.FOREVER_NS);
                } else {
                    c20358.mo7();
                    arrayDeque3.add(c20358);
                }
            }
            c20358.mo7();
            arrayDeque3.add(c20358);
            return abstractC5540;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39473(AbstractC5540 abstractC5540) {
        abstractC5540.mo7();
        this.f53869.add(abstractC5540);
    }

    @Override // l.InterfaceC10388
    public void flush() {
        ArrayDeque arrayDeque;
        this.f53870 = 0L;
        this.f53867 = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f53864;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f53866;
            if (zIsEmpty) {
                break;
            }
            C20357 c20357 = (C20357) arrayDeque2.poll();
            String str = C17983.f57504;
            c20357.mo7();
            arrayDeque.add(c20357);
        }
        C20357 c20358 = this.f53868;
        if (c20358 != null) {
            c20358.mo7();
            arrayDeque.add(c20358);
            this.f53868 = null;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC5540 m39474() {
        return (AbstractC5540) this.f53869.pollFirst();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m39475() {
        return this.f53867;
    }
}
