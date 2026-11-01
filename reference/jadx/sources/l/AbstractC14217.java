package l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: renamed from: l.ܳ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataSetObservable f46613 = new DataSetObservable();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DataSetObserver f46614;

    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4241(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo34318() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo34320(Object obj) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo34321(C19383 c19383) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo4244(View view, Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo4245();

    /* JADX INFO: renamed from: ۙ */
    public Object mo4242(C19383 c19383, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4243(C19383 c19383, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34322() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f46614;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f46613.notifyChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34319(DataSetObserver dataSetObserver) {
        this.f46613.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34323(DataSetObserver dataSetObserver) {
        this.f46613.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34324(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f46614 = dataSetObserver;
        }
    }
}
