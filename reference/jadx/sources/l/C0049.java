package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f910 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f911 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m930(Bundle bundle) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f911;
            if (i >= arrayList.size()) {
                return;
            }
            if (C14611.m35086((Bundle) arrayList.get(i), bundle)) {
                return;
            }
            i++;
        }
    }
}
