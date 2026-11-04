package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0326 implements Map.Entry {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map.Entry f1793;

    public C0326() {
        throw null;
    }

    public C0326(Map.Entry entry) {
        this.f1793 = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1793.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C18971 c18971 = (C18971) this.f1793.getValue();
        if (c18971 == null) {
            return null;
        }
        return c18971.m44067();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18971 m2020() {
        return (C18971) this.f1793.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC18775)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((C18971) this.f1793.getValue()).m25872((InterfaceC18775) obj);
    }
}
