package l;

import android.text.TextUtils;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۚۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5541 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        C3303 c3303 = (C3303) obj;
        if (TextUtils.isEmpty(c3303.f10797)) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < c3303.f10797.length(); i2++) {
            if (c3303.f10797.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }
}
