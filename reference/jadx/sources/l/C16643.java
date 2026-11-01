package l;

import android.database.Observable;

/* JADX INFO: renamed from: l.ܽ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16643 extends Observable {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39109() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39112() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12410) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39110() {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12410) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39108(int i, int i2, Object obj) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12410) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m39113(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12410) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39111(int i, int i2) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12410) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39107(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC12410) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }
}
