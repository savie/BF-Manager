package l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6RX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19641 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f63066 = new Bundle();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f63065 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44756(Bundle bundle, String... strArr) {
        Bundle bundle2 = new Bundle(bundle);
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (String str : new HashSet(bundle2.keySet())) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            Bundle bundle3 = this.f63066;
            if (i >= length) {
                bundle3.putAll(bundle2);
                return;
            }
            String str2 = strArr[i];
            bundle3.remove(str2);
            this.f63065.add(str2);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44755(Bundle bundle) {
        Iterator it = this.f63065.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        bundle.putAll(this.f63066);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44757(C19641 c19641) {
        Iterator it = c19641.f63065.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = this.f63066;
            if (!zHasNext) {
                bundle.putAll(c19641.f63066);
                return;
            } else {
                String str = (String) it.next();
                this.f63065.add(str);
                bundle.remove(str);
            }
        }
    }
}
