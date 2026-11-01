package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18358 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58562 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f58561 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42614(C15682 c15682) {
        HashMap map = this.f58561;
        if (map.containsKey(c15682)) {
            return;
        }
        ArrayList arrayList = this.f58562;
        map.put(c15682, Integer.valueOf(arrayList.size()));
        arrayList.add(c15682);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42611() {
        return this.f58562.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m42613(int i) {
        return (C15682) this.f58562.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42612(C15682 c15682) {
        Integer num = (Integer) this.f58561.get(c15682);
        C13638.requireNonNull(num);
        return num.intValue();
    }
}
