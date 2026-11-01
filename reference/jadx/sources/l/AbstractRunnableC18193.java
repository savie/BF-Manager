package l;

/* JADX INFO: renamed from: l.ᩳܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC18193 implements Runnable, Comparable, InterfaceC23133, InterfaceC11326 {
    public volatile Object _heap;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f58137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f58138;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m42311(long j, C18899 c18899, RunnableC11844 runnableC11844) {
        if (this._heap == C9022.f30823) {
            return 2;
        }
        synchronized (c18899) {
            AbstractRunnableC18193 abstractRunnableC18193 = (AbstractRunnableC18193) c18899.m17531();
            if (AbstractC8316.m21740((AbstractC8316) runnableC11844)) {
                return 1;
            }
            if (abstractRunnableC18193 == null) {
                c18899.f61181 = j;
            } else {
                long j2 = abstractRunnableC18193.f58138;
                if (j2 - j < 0) {
                    j = j2;
                }
                if (j - c18899.f61181 > 0) {
                    c18899.f61181 = j;
                }
            }
            long j3 = this.f58138;
            long j4 = c18899.f61181;
            if (j3 - j4 < 0) {
                this.f58138 = j4;
            }
            c18899.m17533(this);
            return 0;
        }
    }

    @Override // l.InterfaceC23133
    /* JADX INFO: renamed from: ۚ */
    public final synchronized void mo10025() {
        Object obj = this._heap;
        if (obj == C9022.f30823) {
            return;
        }
        C18899 c18899 = obj instanceof C18899 ? (C18899) obj : null;
        if (c18899 != null) {
            c18899.m17535(this);
        }
        this._heap = C9022.f30823;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f58138 - ((AbstractRunnableC18193) obj).f58138;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6386 m42312() {
        Object obj = this._heap;
        if (obj instanceof C6386) {
            return (C6386) obj;
        }
        return null;
    }

    @Override // l.InterfaceC11326
    /* JADX INFO: renamed from: ۙ */
    public final void mo28391(C6386 c6386) {
        if (this._heap == C9022.f30823) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c6386;
    }

    @Override // l.InterfaceC11326
    /* JADX INFO: renamed from: ۙ */
    public final void mo28390(int i) {
        this.f58137 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m42313() {
        return this.f58137;
    }

    public final String toString() {
        return "Delayed[nanos=" + this.f58138 + ']';
    }
}
