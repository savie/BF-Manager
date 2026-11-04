package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܺ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17153 implements InterfaceC4255 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f55919 = new ArrayDeque();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11932 f55920;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f55921;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f55922;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f55923;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f55924;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f55925;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17374(C0526 c0526);

    /* JADX INFO: renamed from: ۫ */
    public abstract boolean mo17375();

    /* JADX INFO: renamed from: ᩸ */
    public abstract InterfaceC24393 mo17376();

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ */
    public final void mo39834(Object obj) {
        C0526 c0526 = (C0526) obj;
        C20782.m47565(c0526 == this.f55920);
        C11932 c11932 = (C11932) c0526;
        if (c11932.m33305()) {
            long j = this.f55922;
            this.f55922 = 1 + j;
            c11932.f38432 = j;
            this.f55921.add(c11932);
        } else {
            long j2 = c11932.f19652;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f55925;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f55922;
                    this.f55922 = 1 + j4;
                    c11932.f38432 = j4;
                    this.f55921.add(c11932);
                } else {
                    c11932.mo7();
                    this.f55919.add(c11932);
                }
            } else {
                long j5 = this.f55922;
                this.f55922 = 1 + j5;
                c11932.f38432 = j5;
                this.f55921.add(c11932);
            }
        }
        this.f55920 = null;
    }

    public AbstractC17153() {
        for (int i = 0; i < 10; i++) {
            this.f55919.add(new C11932(0));
        }
        this.f55924 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f55924.add(new C25359(new C2238(this)));
        }
        this.f55921 = new ArrayDeque();
        this.f55925 = -9223372036854775807L;
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ᩷ */
    public final void mo39839(long j) {
        this.f55925 = j;
    }

    @Override // l.InterfaceC4255
    /* JADX INFO: renamed from: ۙ */
    public void mo13583(long j) {
        this.f55923 = j;
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۤ */
    public final Object mo39837() {
        C20782.m47568(this.f55920 == null);
        ArrayDeque arrayDeque = this.f55919;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C11932 c11932 = (C11932) arrayDeque.pollFirst();
        this.f55920 = c11932;
        return c11932;
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ᩷ */
    public AbstractC7984 mo28187() {
        AbstractC7984 abstractC7984;
        ArrayDeque arrayDeque = this.f55924;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f55921;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C11932 c11932 = (C11932) arrayDeque2.peek();
            String str = C7116.f23455;
            if (c11932.f19652 > this.f55923) {
                return null;
            }
            C11932 c11933 = (C11932) arrayDeque2.poll();
            boolean zM33305 = c11933.m33305();
            ArrayDeque arrayDeque3 = this.f55919;
            if (zM33305) {
                abstractC7984 = (AbstractC7984) arrayDeque.pollFirst();
                abstractC7984.m33309(4);
            } else {
                mo17374((C0526) c11933);
                if (mo17375()) {
                    InterfaceC24393 interfaceC24393Mo17376 = mo17376();
                    abstractC7984 = (AbstractC7984) arrayDeque.pollFirst();
                    abstractC7984.m21770(c11933.f19652, interfaceC24393Mo17376, C25227.FOREVER_NS);
                } else {
                    c11933.mo7();
                    arrayDeque3.add(c11933);
                }
            }
            c11933.mo7();
            arrayDeque3.add(c11933);
            return abstractC7984;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40306(AbstractC7984 abstractC7984) {
        abstractC7984.mo7();
        this.f55924.add(abstractC7984);
    }

    @Override // l.InterfaceC19860
    public void flush() {
        ArrayDeque arrayDeque;
        this.f55922 = 0L;
        this.f55923 = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f55921;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f55919;
            if (zIsEmpty) {
                break;
            }
            C11932 c11932 = (C11932) arrayDeque2.poll();
            String str = C7116.f23455;
            c11932.mo7();
            arrayDeque.add(c11932);
        }
        C11932 c11933 = this.f55920;
        if (c11933 != null) {
            c11933.mo7();
            arrayDeque.add(c11933);
            this.f55920 = null;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC7984 m40308() {
        return (AbstractC7984) this.f55924.pollFirst();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m40307() {
        return this.f55923;
    }
}
