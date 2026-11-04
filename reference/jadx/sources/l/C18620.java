package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18620 extends AbstractC15023 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8179 f60546;

    public C18620(C8179 c8179) {
        this.f60546 = c8179;
    }

    @Override // l.AbstractC15023
    /* JADX INFO: renamed from: ᩷ */
    public final Map mo31670() {
        return this.f60546;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0721(this.f60546);
    }

    @Override // l.AbstractC15023, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f60546.f26975.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15023, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C17359.requireNonNull(entry);
        AbstractC20024.m46059(this.f60546.f26974, entry.getKey());
        return true;
    }
}
