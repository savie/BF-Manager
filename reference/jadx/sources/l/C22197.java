package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes.dex */
public final class C22197 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f71523 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f71522 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50215(C11974 c11974) {
        HashMap map = this.f71522;
        if (map.containsKey(c11974)) {
            return;
        }
        ArrayList arrayList = this.f71523;
        map.put(c11974, Integer.valueOf(arrayList.size()));
        arrayList.add(c11974);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50212() {
        return this.f71523.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m50214(int i) {
        return (C11974) this.f71523.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50213(C11974 c11974) {
        Integer num = (Integer) this.f71522.get(c11974);
        C17359.requireNonNull(num);
        return num.intValue();
    }
}
