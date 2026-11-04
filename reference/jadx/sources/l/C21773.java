package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5GB */
/* JADX INFO: loaded from: classes.dex */
public final class C21773 implements Map.Entry {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7447 f69425;

    public C21773(C7447 c7447) {
        this.f69425 = c7447;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Integer num = (Integer) obj;
        this.f69425.f24504 = num.intValue();
        return num;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f69425;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Integer.valueOf(this.f69425.f24504);
    }
}
