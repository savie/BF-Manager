package l;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܰ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14863 {
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f48586;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f48587;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f48588;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f48589;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48584 = AtomicReferenceFieldUpdater.newUpdater(C14863.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f48583 = AtomicLongFieldUpdater.newUpdater(C14863.class, "_state$volatile");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C7406 f48585 = new C7406("REMOVE_FROZEN");

    public C14863(int i, boolean z) {
        this.f48588 = i;
        this.f48589 = z;
        int i2 = i - 1;
        this.f48587 = i2;
        this.f48586 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35805() {
        long j = f48583.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35807() {
        long j = f48583.get(this);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35804() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f48583;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35803(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f48583;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f48587;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f48589;
            AtomicReferenceArray atomicReferenceArray = this.f48586;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f48583.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & Mod.M30)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C14863 c14863M35808 = this;
                    while ((atomicLongFieldUpdater.get(c14863M35808) & 1152921504606846976L) != 0) {
                        c14863M35808 = c14863M35808.m35808();
                        AtomicReferenceArray atomicReferenceArray2 = c14863M35808.f48586;
                        int i4 = c14863M35808.f48587 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C4423) && ((C4423) obj2).f15865 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c14863M35808 = null;
                        }
                        if (c14863M35808 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f48588;
                if (i5 < 1024 || ((i2 - i) & Mod.M30) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m35806() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f48583;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f48585;
            }
            int i = (int) (j & 1073741823);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f48587;
            int i4 = i & i3;
            if ((i2 & i3) != i4) {
                AtomicReferenceArray atomicReferenceArray = this.f48586;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = this.f48589;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C4423)) {
                    long j2 = (i + 1) & Mod.M30;
                    if (f48583.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    if (z) {
                        C14863 c14863M35808 = this;
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(c14863M35808);
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c14863M35808 = c14863M35808.m35808();
                            } else {
                                if (f48583.compareAndSet(c14863M35808, j3, (j3 & (-1073741824)) | j2)) {
                                    c14863M35808.f48586.set(c14863M35808.f48587 & i5, null);
                                    c14863M35808 = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c14863M35808 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14863 m35808() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f48583;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48584;
            C14863 c14863 = (C14863) atomicReferenceFieldUpdater.get(this);
            if (c14863 != null) {
                return c14863;
            }
            C14863 c14864 = new C14863(this.f48588 * 2, this.f48589);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f48587;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c4423 = this.f48586.get(i4);
                if (c4423 == null) {
                    c4423 = new C4423(i);
                }
                c14864.f48586.set(c14864.f48587 & i, c4423);
                i++;
            }
            atomicLongFieldUpdater.set(c14864, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c14864) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
