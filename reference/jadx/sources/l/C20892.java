package l;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20892 extends AbstractC19146 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f66876;

    public C20892(Map map) {
        this.f66876 = map;
    }

    @Override // l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo26313() {
        return this.f66876;
    }

    @Override // l.AbstractC19146, l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Map mo26313() {
        return this.f66876;
    }

    @Override // l.AbstractC19146, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Set keySet() {
        return C12324.m30739(super.keySet(), (InterfaceC6163) new C3738());
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Set entrySet() {
        return C12324.m30739(super.entrySet(), (InterfaceC6163) new C23876());
    }

    @Override // l.AbstractC19146, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // l.AbstractC19146, java.util.Map
    public final boolean containsValue(Object obj) {
        return m44381(obj);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && m44383(obj);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final int hashCode() {
        return m44382();
    }
}
