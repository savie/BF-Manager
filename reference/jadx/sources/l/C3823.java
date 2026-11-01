package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۘ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3823 implements Map.Entry {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Map.Entry f14168;

    public C3823() {
        throw null;
    }

    public C3823(Map.Entry entry) {
        this.f14168 = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14168.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C22875 c22875 = (C22875) this.f14168.getValue();
        if (c22875 == null) {
            return null;
        }
        return c22875.m50621();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22875 m11117() {
        return (C22875) this.f14168.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof InterfaceC23206)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((C22875) this.f14168.getValue()).m36206((InterfaceC23206) obj);
    }
}
