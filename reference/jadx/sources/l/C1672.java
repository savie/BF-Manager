package l;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֫۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672 extends AbstractC0415 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Map f6659;

    public C1672(Map map) {
        this.f6659 = map;
    }

    @Override // l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Object mo2173() {
        return this.f6659;
    }

    @Override // l.AbstractC0415, l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Map mo2173() {
        return this.f6659;
    }

    @Override // l.AbstractC0415, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Set keySet() {
        return C21209.m47670(super.keySet(), (InterfaceC19010) new C14374());
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Set entrySet() {
        return C21209.m47670(super.entrySet(), (InterfaceC19010) new C23546());
    }

    @Override // l.AbstractC0415, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // l.AbstractC0415, java.util.Map
    public final boolean containsValue(Object obj) {
        return m2172(obj);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && m2174(obj);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final int hashCode() {
        return m2171();
    }
}
