package l;

import com.alipay.sdk.m.u0.b;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6C6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13561 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f43057 = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m33270(Object obj) {
        C15243.m36590(obj, "key");
        return this.f43057.get(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m33271(Object obj, Object obj2) {
        C15243.m36590(obj, "key");
        C15243.m36590(obj2, b.d);
        return this.f43057.put(obj, obj2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m33273(Object obj) {
        C15243.m36590(obj, "key");
        return this.f43057.remove(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33274() {
        return this.f43057.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m33272() {
        Set setEntrySet = this.f43057.entrySet();
        C15243.m36591(setEntrySet, "map.entries");
        return setEntrySet;
    }
}
