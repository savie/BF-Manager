package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15588 extends AbstractC13075 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0064 f50703;

    public C15588(C0064 c0064) {
        this.f50703 = c0064;
    }

    @Override // l.AbstractC13075
    /* JADX INFO: renamed from: ܰ */
    public final Map mo11354() {
        return this.f50703;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C19821(this.f50703);
    }

    @Override // l.AbstractC13075, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f50703.f963.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // l.AbstractC13075, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C13638.requireNonNull(entry);
        AbstractC11830.m29503(this.f50703.f964, entry.getKey());
        return true;
    }
}
