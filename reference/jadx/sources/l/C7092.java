package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۜ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes2.dex */
public class C7092 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23771 = AtomicReferenceFieldUpdater.newUpdater(C7092.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new C15560(8, false);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m18965() {
        return ((C15560) this._cur).m37203();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18962() {
        while (true) {
            C15560 c15560 = (C15560) this._cur;
            if (c15560.m37200()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23771;
            C15560 c15560M37198 = c15560.m37198();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15560, c15560M37198) && atomicReferenceFieldUpdater.get(this) == c15560) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18963(Runnable runnable) {
        while (true) {
            C15560 c15560 = (C15560) this._cur;
            int iM37199 = c15560.m37199(runnable);
            if (iM37199 == 0) {
                return true;
            }
            if (iM37199 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23771;
                C15560 c15560M37198 = c15560.m37198();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c15560, c15560M37198) && atomicReferenceFieldUpdater.get(this) == c15560) {
                }
            } else if (iM37199 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m18964() {
        while (true) {
            C15560 c15560 = (C15560) this._cur;
            Object objM37201 = c15560.m37201();
            if (objM37201 != C15560.f50615) {
                return objM37201;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23771;
            C15560 c15560M37198 = c15560.m37198();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15560, c15560M37198) && atomicReferenceFieldUpdater.get(this) == c15560) {
            }
        }
    }
}
