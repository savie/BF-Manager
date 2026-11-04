package l;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۧ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11849 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float fM51114 = C22666.m51114((View) obj);
        float fM51115 = C22666.m51114((View) obj2);
        if (fM51114 > fM51115) {
            return -1;
        }
        return fM51114 < fM51115 ? 1 : 0;
    }
}
