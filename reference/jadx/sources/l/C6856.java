package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۜۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6856 implements Map.Entry {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f22770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13567 f22771;

    public C6856(AbstractC13567 abstractC13567) {
        this.f22771 = abstractC13567;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f22770;
        return Integer.valueOf(this.f22771.mo3618(((Integer) obj).intValue(), obj2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22770;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f22771.mo3619(this.f22770));
    }
}
