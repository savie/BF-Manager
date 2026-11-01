package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۟ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7218 implements Map.Entry {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19213 f24046;

    public C7218(C19213 c19213) {
        this.f24046 = c19213;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Integer num = (Integer) obj;
        this.f24046.f62049 = num.intValue();
        return num;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24046;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f24046.f62049);
    }
}
