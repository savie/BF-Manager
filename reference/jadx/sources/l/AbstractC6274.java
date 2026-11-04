package l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: renamed from: l.ۛ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataSetObservable f21304 = new DataSetObservable();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DataSetObserver f21305;

    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo2996(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17942() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17944(Object obj) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17945(C15179 c15179) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo2999(View view, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo3000();

    /* JADX INFO: renamed from: ۙ */
    public Object mo2997(C15179 c15179, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2998(C15179 c15179, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17946() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f21305;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f21304.notifyChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17943(DataSetObserver dataSetObserver) {
        this.f21304.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17947(DataSetObserver dataSetObserver) {
        this.f21304.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17948(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f21305 = dataSetObserver;
        }
    }
}
