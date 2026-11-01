package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.۫ܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12505 implements InterfaceC10388 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7565 f41810;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC0509[] f41811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41813;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Thread f41814;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41816;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16033[] f41818;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f41820;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16033 f41822;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f41812 = new Object();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f41815 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f41823 = new ArrayDeque();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f41819 = new ArrayDeque();

    /* JADX INFO: renamed from: ۖ */
    public abstract C16033 mo11();

    /* JADX INFO: renamed from: ۙ */
    public abstract C7565 mo12(Throwable th);

    /* JADX INFO: renamed from: ۙ */
    public abstract C7565 mo13(C16033 c16033, AbstractC0509 abstractC0509, boolean z);

    /* JADX INFO: renamed from: ۚ */
    public abstract AbstractC0509 mo15();

    public AbstractC12505(C16033[] c16033Arr, AbstractC0509[] abstractC0509Arr) {
        this.f41818 = c16033Arr;
        this.f41813 = c16033Arr.length;
        for (int i = 0; i < this.f41813; i++) {
            this.f41818[i] = mo11();
        }
        this.f41811 = abstractC0509Arr;
        this.f41816 = abstractC0509Arr.length;
        for (int i2 = 0; i2 < this.f41816; i2++) {
            this.f41811[i2] = mo15();
        }
        C16738 c16738 = new C16738(this);
        this.f41814 = c16738;
        c16738.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31059(int i) {
        int i2 = this.f41813;
        C16033[] c16033Arr = this.f41818;
        C2023.m6510(i2 == c16033Arr.length);
        for (C16033 c16033 : c16033Arr) {
            c16033.m38027(i);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m31062(long j) {
        boolean z;
        synchronized (this.f41812) {
            long j2 = this.f41815;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ܰ */
    public final void mo26288(long j) {
        synchronized (this.f41812) {
            C2023.m6510(this.f41813 == this.f41818.length || this.f41817);
            this.f41815 = j;
        }
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۨ */
    public final Object mo26287() {
        C16033 c16033;
        synchronized (this.f41812) {
            C7565 c7565 = this.f41810;
            if (c7565 == null) {
                C2023.m6510(this.f41822 == null);
                int i = this.f41813;
                if (i == 0) {
                    c16033 = null;
                } else {
                    C16033[] c16033Arr = this.f41818;
                    int i2 = i - 1;
                    this.f41813 = i2;
                    c16033 = c16033Arr[i2];
                }
                this.f41822 = c16033;
            } else {
                throw c7565;
            }
        }
        return c16033;
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo26286(C16033 c16033) {
        synchronized (this.f41812) {
            C7565 c7565 = this.f41810;
            if (c7565 == null) {
                C2023.m6507(c16033 == this.f41822);
                this.f41823.addLast(c16033);
                if (!this.f41823.isEmpty() && this.f41816 > 0) {
                    this.f41812.notify();
                }
                this.f41822 = null;
            } else {
                throw c7565;
            }
        }
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC0509 mo21899() {
        synchronized (this.f41812) {
            C7565 c7565 = this.f41810;
            if (c7565 == null) {
                if (this.f41819.isEmpty()) {
                    return null;
                }
                return (AbstractC0509) this.f41819.removeFirst();
            }
            throw c7565;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31060(AbstractC0509 abstractC0509) {
        synchronized (this.f41812) {
            abstractC0509.mo7();
            AbstractC0509[] abstractC0509Arr = this.f41811;
            int i = this.f41816;
            this.f41816 = i + 1;
            abstractC0509Arr[i] = abstractC0509;
            if (!this.f41823.isEmpty() && this.f41816 > 0) {
                this.f41812.notify();
            }
        }
    }

    @Override // l.InterfaceC10388
    public final void flush() {
        synchronized (this.f41812) {
            this.f41817 = true;
            this.f41820 = 0;
            C16033 c16033 = this.f41822;
            if (c16033 != null) {
                c16033.mo7();
                C16033[] c16033Arr = this.f41818;
                int i = this.f41813;
                this.f41813 = i + 1;
                c16033Arr[i] = c16033;
                this.f41822 = null;
            }
            while (!this.f41823.isEmpty()) {
                C16033 c16034 = (C16033) this.f41823.removeFirst();
                c16034.mo7();
                C16033[] c16033Arr2 = this.f41818;
                int i2 = this.f41813;
                this.f41813 = i2 + 1;
                c16033Arr2[i2] = c16034;
            }
            while (!this.f41819.isEmpty()) {
                ((AbstractC0509) this.f41819.removeFirst()).mo8();
            }
        }
    }

    @Override // l.InterfaceC10388
    /* JADX INFO: renamed from: ۙ */
    public void mo14() {
        synchronized (this.f41812) {
            this.f41821 = true;
            this.f41812.notify();
        }
        try {
            this.f41814.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31057(AbstractC12505 abstractC12505) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC12505.m31058());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m31058() {
        C7565 c7565Mo12;
        synchronized (this.f41812) {
            while (!this.f41821) {
                if (!this.f41823.isEmpty() && this.f41816 > 0) {
                    break;
                }
                this.f41812.wait();
            }
            if (this.f41821) {
                return false;
            }
            C16033 c16033 = (C16033) this.f41823.removeFirst();
            AbstractC0509[] abstractC0509Arr = this.f41811;
            int i = this.f41816 - 1;
            this.f41816 = i;
            AbstractC0509 abstractC0509 = abstractC0509Arr[i];
            boolean z = this.f41817;
            this.f41817 = false;
            if (c16033.m42265(4)) {
                abstractC0509.m42270(4);
            } else {
                abstractC0509.f2202 = c16033.f51910;
                if (c16033.m42265(134217728)) {
                    abstractC0509.m42270(134217728);
                }
                if (!m31062(c16033.f51910)) {
                    abstractC0509.f2203 = true;
                }
                try {
                    c7565Mo12 = mo13(c16033, abstractC0509, z);
                } catch (OutOfMemoryError e) {
                    c7565Mo12 = mo12((Throwable) e);
                } catch (RuntimeException e2) {
                    c7565Mo12 = mo12((Throwable) e2);
                }
                C7565 c7565 = c7565Mo12;
                if (c7565 != null) {
                    synchronized (this.f41812) {
                        this.f41810 = c7565;
                    }
                    return false;
                }
            }
            synchronized (this.f41812) {
                if (this.f41817) {
                    abstractC0509.mo8();
                } else if (abstractC0509.f2203) {
                    this.f41820++;
                    abstractC0509.mo8();
                } else {
                    abstractC0509.f2201 = this.f41820;
                    this.f41820 = 0;
                    this.f41819.addLast(abstractC0509);
                }
                c16033.mo7();
                C16033[] c16033Arr = this.f41818;
                int i2 = this.f41813;
                this.f41813 = i2 + 1;
                c16033Arr[i2] = c16033;
            }
            return true;
        }
    }
}
