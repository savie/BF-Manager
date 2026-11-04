package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܶᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16274 extends AbstractC4014 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo38606(Map.Entry entry);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract /* bridge */ boolean mo38607(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo38606((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo38607((Map.Entry) obj);
        }
        return false;
    }
}
