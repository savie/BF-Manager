package l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D6RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6714 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle f22341 = new Bundle();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f22340 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18752(Bundle bundle, String... strArr) {
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
            Bundle bundle3 = this.f22341;
            if (i >= length) {
                bundle3.putAll(bundle2);
                return;
            }
            String str2 = strArr[i];
            bundle3.remove(str2);
            this.f22340.add(str2);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18751(Bundle bundle) {
        Iterator it = this.f22340.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        bundle.putAll(this.f22341);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18753(C6714 c6714) {
        Iterator it = c6714.f22340.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = this.f22341;
            if (!zHasNext) {
                bundle.putAll(c6714.f22341);
                return;
            } else {
                String str = (String) it.next();
                this.f22340.add(str);
                bundle.remove(str);
            }
        }
    }
}
