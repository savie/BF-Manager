package l;

import android.text.TextUtils;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.۫۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12280 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C3106 c3106 = (C3106) obj;
        if (TextUtils.isEmpty(c3106.f11713)) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < c3106.f11713.length(); i2++) {
            if (c3106.f11713.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }
}
