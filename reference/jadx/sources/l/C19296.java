package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19296 implements Map.Entry {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f62269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8713 f62270;

    public C19296(AbstractC8713 abstractC8713) {
        this.f62270 = abstractC8713;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f62269;
        return Integer.valueOf(this.f62270.mo1679(((Integer) obj).intValue(), obj2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f62269;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f62270.mo1680(this.f62269));
    }
}
