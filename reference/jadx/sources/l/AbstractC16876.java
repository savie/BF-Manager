package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ܺܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16876 implements InterfaceC19860 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55200;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f55201;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f55202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15384 f55204;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5690 f55205;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f55206;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f55208;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Thread f55209;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5690[] f55210;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC11655[] f55211;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f55199 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f55203 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f55212 = new ArrayDeque();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f55207 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ */
    public abstract C15384 mo10(Throwable th);

    /* JADX INFO: renamed from: ۙ */
    public abstract C15384 mo11(C5690 c5690, AbstractC11655 abstractC11655, boolean z);

    /* JADX INFO: renamed from: ᩴ */
    public abstract AbstractC11655 mo16();

    /* JADX INFO: renamed from: ᩸ */
    public abstract C5690 mo17();

    public AbstractC16876(C5690[] c5690Arr, AbstractC11655[] abstractC11655Arr) {
        this.f55210 = c5690Arr;
        this.f55200 = c5690Arr.length;
        for (int i = 0; i < this.f55200; i++) {
            this.f55210[i] = mo17();
        }
        this.f55211 = abstractC11655Arr;
        this.f55202 = abstractC11655Arr.length;
        for (int i2 = 0; i2 < this.f55202; i2++) {
            this.f55211[i2] = mo16();
        }
        C25082 c25082 = new C25082(this);
        this.f55209 = c25082;
        c25082.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39833(int i) {
        int i2 = this.f55200;
        C5690[] c5690Arr = this.f55210;
        C20782.m47568(i2 == c5690Arr.length);
        for (C5690 c5690 : c5690Arr) {
            c5690.m16711(i);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m39838(long j) {
        boolean z;
        synchronized (this.f55199) {
            long j2 = this.f55203;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo39839(long j) {
        synchronized (this.f55199) {
            C20782.m47568(this.f55200 == this.f55210.length || this.f55201);
            this.f55203 = j;
        }
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object mo39837() {
        C5690 c5690;
        synchronized (this.f55199) {
            C15384 c15384 = this.f55204;
            if (c15384 == null) {
                C20782.m47568(this.f55205 == null);
                int i = this.f55200;
                if (i == 0) {
                    c5690 = null;
                } else {
                    C5690[] c5690Arr = this.f55210;
                    int i2 = i - 1;
                    this.f55200 = i2;
                    c5690 = c5690Arr[i2];
                }
                this.f55205 = c5690;
            } else {
                throw c15384;
            }
        }
        return c5690;
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo39834(C5690 c5690) {
        synchronized (this.f55199) {
            C15384 c15384 = this.f55204;
            if (c15384 == null) {
                C20782.m47565(c5690 == this.f55205);
                this.f55212.addLast(c5690);
                if (!this.f55212.isEmpty() && this.f55202 > 0) {
                    this.f55199.notify();
                }
                this.f55205 = null;
            } else {
                throw c15384;
            }
        }
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC11655 mo28187() {
        synchronized (this.f55199) {
            C15384 c15384 = this.f55204;
            if (c15384 == null) {
                if (this.f55207.isEmpty()) {
                    return null;
                }
                return (AbstractC11655) this.f55207.removeFirst();
            }
            throw c15384;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39836(AbstractC11655 abstractC11655) {
        synchronized (this.f55199) {
            abstractC11655.mo7();
            AbstractC11655[] abstractC11655Arr = this.f55211;
            int i = this.f55202;
            this.f55202 = i + 1;
            abstractC11655Arr[i] = abstractC11655;
            if (!this.f55212.isEmpty() && this.f55202 > 0) {
                this.f55199.notify();
            }
        }
    }

    @Override // l.InterfaceC19860
    public final void flush() {
        synchronized (this.f55199) {
            this.f55201 = true;
            this.f55206 = 0;
            C5690 c5690 = this.f55205;
            if (c5690 != null) {
                c5690.mo7();
                C5690[] c5690Arr = this.f55210;
                int i = this.f55200;
                this.f55200 = i + 1;
                c5690Arr[i] = c5690;
                this.f55205 = null;
            }
            while (!this.f55212.isEmpty()) {
                C5690 c5691 = (C5690) this.f55212.removeFirst();
                c5691.mo7();
                C5690[] c5690Arr2 = this.f55210;
                int i2 = this.f55200;
                this.f55200 = i2 + 1;
                c5690Arr2[i2] = c5691;
            }
            while (!this.f55207.isEmpty()) {
                ((AbstractC11655) this.f55207.removeFirst()).mo8();
            }
        }
    }

    @Override // l.InterfaceC19860
    /* JADX INFO: renamed from: ۙ */
    public void mo12() {
        synchronized (this.f55199) {
            this.f55208 = true;
            this.f55199.notify();
        }
        try {
            this.f55209.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39831(AbstractC16876 abstractC16876) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC16876.m39832());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m39832() {
        C15384 c15384Mo10;
        synchronized (this.f55199) {
            while (!this.f55208) {
                if (!this.f55212.isEmpty() && this.f55202 > 0) {
                    break;
                }
                this.f55199.wait();
            }
            if (this.f55208) {
                return false;
            }
            C5690 c5690 = (C5690) this.f55212.removeFirst();
            AbstractC11655[] abstractC11655Arr = this.f55211;
            int i = this.f55202 - 1;
            this.f55202 = i;
            AbstractC11655 abstractC11655 = abstractC11655Arr[i];
            boolean z = this.f55201;
            this.f55201 = false;
            if (c5690.m33310(4)) {
                abstractC11655.m33309(4);
            } else {
                abstractC11655.f37777 = c5690.f19652;
                if (c5690.m33310(134217728)) {
                    abstractC11655.m33309(134217728);
                }
                if (!m39838(c5690.f19652)) {
                    abstractC11655.f37779 = true;
                }
                try {
                    c15384Mo10 = mo11(c5690, abstractC11655, z);
                } catch (OutOfMemoryError e) {
                    c15384Mo10 = mo10((Throwable) e);
                } catch (RuntimeException e2) {
                    c15384Mo10 = mo10((Throwable) e2);
                }
                C15384 c15384 = c15384Mo10;
                if (c15384 != null) {
                    synchronized (this.f55199) {
                        this.f55204 = c15384;
                    }
                    return false;
                }
            }
            synchronized (this.f55199) {
                if (this.f55201) {
                    abstractC11655.mo8();
                } else if (abstractC11655.f37779) {
                    this.f55206++;
                    abstractC11655.mo8();
                } else {
                    abstractC11655.f37778 = this.f55206;
                    this.f55206 = 0;
                    this.f55207.addLast(abstractC11655);
                }
                c5690.mo7();
                C5690[] c5690Arr = this.f55210;
                int i2 = this.f55200;
                this.f55200 = i2 + 1;
                c5690Arr[i2] = c5690;
            }
            return true;
        }
    }
}
