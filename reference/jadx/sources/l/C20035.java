package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20035 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f64163;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16507 f64164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f64165 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f64162 = -1;

    public C20035(AbstractC16507 abstractC16507) {
        this.f64164 = abstractC16507;
        this.f64163 = abstractC16507.mo36175() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64162 < this.f64163;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f64162++;
        this.f64165 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f64165) {
            throw new IllegalStateException();
        }
        this.f64164.mo36173(this.f64162);
        this.f64162--;
        this.f64163--;
        this.f64165 = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f64165) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f64164.mo36170(this.f64162, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f64165) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f64164.mo36170(this.f64162, 1);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f64165) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f64164.mo36171(this.f64162, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f64165) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f64162;
        AbstractC16507 abstractC16507 = this.f64164;
        Object objMo36170 = abstractC16507.mo36170(i, 0);
        if (key != objMo36170 && (key == null || !key.equals(objMo36170))) {
            return false;
        }
        Object value = entry.getValue();
        Object objMo36171 = abstractC16507.mo36170(this.f64162, 1);
        return value == objMo36171 || (value != null && value.equals(objMo36171));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f64165) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f64162;
        AbstractC16507 abstractC16507 = this.f64164;
        Object objMo36170 = abstractC16507.mo36170(i, 0);
        Object objMo36171 = abstractC16507.mo36170(this.f64162, 1);
        return (objMo36170 == null ? 0 : objMo36170.hashCode()) ^ (objMo36171 != null ? objMo36171.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
