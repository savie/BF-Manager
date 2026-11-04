package l;

import com.alipay.sdk.m.p.a;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12545 implements Map.Entry {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f40310;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14782 f40311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40312;

    public C12545(C14782 c14782, int i) {
        C15243.m36590(c14782, "map");
        this.f40311 = c14782;
        this.f40312 = i;
        this.f40310 = c14782.f48371;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m31216();
        return this.f40311.f48369[this.f40312];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m31216();
        Object[] objArr = this.f40311.f48368;
        C15243.m36586(objArr);
        return objArr[this.f40312];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m31216();
        C14782 c14782 = this.f40311;
        c14782.m35607();
        Object[] objArrM35590 = C14782.m35590(c14782);
        int i = this.f40312;
        Object obj2 = objArrM35590[i];
        objArrM35590[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C15243.m36589(entry.getKey(), getKey()) && C15243.m36589(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append(a.h);
        sb.append(getValue());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m31216() {
        if (this.f40311.f48371 != this.f40310) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
