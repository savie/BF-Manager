package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YIWY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f50877;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bundle f50878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set f50879;

    public C15655(C17147 c17147, Bundle bundle) {
        ArrayList arrayList = c17147.f55900;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C20131((C25353) it.next()));
        }
        this.f50877 = C4681.unmodifiableList(arrayList2);
        this.f50879 = C4681.unmodifiableSet(c17147.f55899);
        this.f50878 = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37411(double d) {
        this.f50878.putDouble("capture_to_parsed_ms", d);
    }
}
