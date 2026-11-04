package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩺᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes.dex */
public class C24561 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f79615 = AtomicReferenceFieldUpdater.newUpdater(C24561.class, Object.class, "_cur$volatile");
    public volatile /* synthetic */ Object _cur$volatile = new C14863(8, false);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54853() {
        return ((C14863) f79615.get(this)).m35807();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54850() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79615;
            C14863 c14863 = (C14863) atomicReferenceFieldUpdater.get(this);
            if (c14863.m35804()) {
                return;
            }
            C14863 c14863M35808 = c14863.m35808();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c14863, c14863M35808) && atomicReferenceFieldUpdater.get(this) == c14863) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54851(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79615;
            C14863 c14863 = (C14863) atomicReferenceFieldUpdater.get(this);
            int iM35803 = c14863.m35803(runnable);
            if (iM35803 == 0) {
                return true;
            }
            if (iM35803 == 1) {
                C14863 c14863M35808 = c14863.m35808();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c14863, c14863M35808) && atomicReferenceFieldUpdater.get(this) == c14863) {
                }
            } else if (iM35803 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m54852() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79615;
            C14863 c14863 = (C14863) atomicReferenceFieldUpdater.get(this);
            Object objM35806 = c14863.m35806();
            if (objM35806 != C14863.f48585) {
                return objM35806;
            }
            C14863 c14863M35808 = c14863.m35808();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c14863, c14863M35808) && atomicReferenceFieldUpdater.get(this) == c14863) {
            }
        }
    }
}
