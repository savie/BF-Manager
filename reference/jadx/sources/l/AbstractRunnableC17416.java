package l;

/* JADX INFO: renamed from: l.ܽۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC17416 implements Runnable, Comparable, InterfaceC11449, InterfaceC13043 {
    public volatile Object _heap;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f56617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40895(long j, C15924 c15924, RunnableC10703 runnableC10703) {
        synchronized (this) {
            if (this._heap == C20400.f65391) {
                return 2;
            }
            synchronized (c15924) {
                AbstractRunnableC17416 abstractRunnableC17416 = (AbstractRunnableC17416) c15924.m36642();
                if (AbstractC23384.m52548((AbstractC23384) runnableC10703)) {
                    return 1;
                }
                if (abstractRunnableC17416 == null) {
                    c15924.f51730 = j;
                } else {
                    long j2 = abstractRunnableC17416.f56618;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c15924.f51730 > 0) {
                        c15924.f51730 = j;
                    }
                }
                long j3 = this.f56618;
                long j4 = c15924.f51730;
                if (j3 - j4 < 0) {
                    this.f56618 = j4;
                }
                c15924.m36644(this);
                return 0;
            }
        }
    }

    @Override // l.InterfaceC11449
    /* JADX INFO: renamed from: ᩸ */
    public final void mo28808() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj == C20400.f65391) {
                return;
            }
            C15924 c15924 = obj instanceof C15924 ? (C15924) obj : null;
            if (c15924 != null) {
                c15924.m36646(this);
            }
            this._heap = C20400.f65391;
            C11471 c11471 = C11471.f36082;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f56618 - ((AbstractRunnableC17416) obj).f56618;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15280 m40896() {
        Object obj = this._heap;
        if (obj instanceof C15280) {
            return (C15280) obj;
        }
        return null;
    }

    @Override // l.InterfaceC13043
    /* JADX INFO: renamed from: ۙ */
    public final void mo32472(C15280 c15280) {
        if (this._heap == C20400.f65391) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c15280;
    }

    @Override // l.InterfaceC13043
    /* JADX INFO: renamed from: ۙ */
    public final void mo32471(int i) {
        this.f56617 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m40897() {
        return this.f56617;
    }

    public final String toString() {
        return "Delayed[nanos=" + this.f56618 + ']';
    }
}
