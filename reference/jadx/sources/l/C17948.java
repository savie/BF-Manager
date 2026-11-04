package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17948 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58790 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f58791 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41886(Bundle bundle) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f58791;
            if (i >= arrayList.size()) {
                return;
            }
            if (C18856.m43748((Bundle) arrayList.get(i), bundle)) {
                return;
            }
            i++;
        }
    }
}
