package l;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11920 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float fM14017 = C5031.m14017((View) obj);
        float fM14018 = C5031.m14017((View) obj2);
        if (fM14017 > fM14018) {
            return -1;
        }
        return fM14017 < fM14018 ? 1 : 0;
    }
}
