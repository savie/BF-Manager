package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6105 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14307 f20836;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20837;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20838 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20839;

    public C6105(C14307 c14307) {
        this.f20836 = c14307;
        this.f20837 = c14307.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20838 < this.f20837;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20838++;
        this.f20839 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20839) {
            throw new IllegalStateException();
        }
        this.f20836.m24222(this.f20838);
        this.f20838--;
        this.f20837--;
        this.f20839 = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f20839) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f20836.m24220(this.f20838);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f20839) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f20836.m24221(this.f20838);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f20839) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f20836.m24219(this.f20838, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f20839) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f20838;
        C14307 c14307 = this.f20836;
        return C15243.m36589(key, c14307.m24220(i)) && C15243.m36589(entry.getValue(), c14307.m24221(this.f20838));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f20839) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f20838;
        C14307 c14307 = this.f20836;
        Object objM24220 = c14307.m24220(i);
        Object objM24221 = c14307.m24221(this.f20838);
        return (objM24220 == null ? 0 : objM24220.hashCode()) ^ (objM24221 != null ? objM24221.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
