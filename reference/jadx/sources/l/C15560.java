package l;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܶ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15560 {
    public volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f50617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ AtomicReferenceArray f50618;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50619;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50620;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C21203 f50615 = new C21203("REMOVE_FROZEN");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50616 = AtomicReferenceFieldUpdater.newUpdater(C15560.class, Object.class, "_next");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f50614 = AtomicLongFieldUpdater.newUpdater(C15560.class, "_state");

    public C15560(int i, boolean z) {
        this.f50620 = i;
        this.f50617 = z;
        int i2 = i - 1;
        this.f50619 = i2;
        this.f50618 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37202() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m37203() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37200() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f50614.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37199(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f50619;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f50617 && this.f50618.get(i2 & i3) != null) {
                int i4 = this.f50620;
                if (i4 < 1024 || ((i2 - i) & Mod.M30) > (i4 >> 1)) {
                    return 1;
                }
            } else {
                if (f50614.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & Mod.M30)) << 30))) {
                    this.f50618.set(i2 & i3, obj);
                    C15560 c15560M37198 = this;
                    while ((c15560M37198._state & 1152921504606846976L) != 0) {
                        c15560M37198 = c15560M37198.m37198();
                        AtomicReferenceArray atomicReferenceArray = c15560M37198.f50618;
                        int i5 = c15560M37198.f50619 & i2;
                        Object obj2 = atomicReferenceArray.get(i5);
                        if ((obj2 instanceof C23321) && ((C23321) obj2).f75595 == i2) {
                            atomicReferenceArray.set(i5, obj);
                        } else {
                            c15560M37198 = null;
                        }
                        if (c15560M37198 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m37201() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f50615;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f50619;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                Object obj = this.f50618.get(i4);
                if (obj == null) {
                    if (this.f50617) {
                    }
                } else if (!(obj instanceof C23321)) {
                    long j2 = (i + 1) & Mod.M30;
                    if (f50614.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                        this.f50618.set(this.f50619 & i, null);
                        return obj;
                    }
                    if (this.f50617) {
                        C15560 c15560M37198 = this;
                        while (true) {
                            long j3 = c15560M37198._state;
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c15560M37198 = c15560M37198.m37198();
                            } else {
                                if (f50614.compareAndSet(c15560M37198, j3, (j3 & (-1073741824)) | j2)) {
                                    c15560M37198.f50618.set(c15560M37198.f50619 & i5, null);
                                    c15560M37198 = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c15560M37198 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15560 m37198() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f50614.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C15560 c15560 = (C15560) this._next;
            if (c15560 != null) {
                return c15560;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50616;
            C15560 c15561 = new C15560(this.f50620 * 2, this.f50617);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f50619;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c23321 = this.f50618.get(i4);
                if (c23321 == null) {
                    c23321 = new C23321(i);
                }
                c15561.f50618.set(c15561.f50619 & i, c23321);
                i++;
            }
            c15561._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c15561) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
