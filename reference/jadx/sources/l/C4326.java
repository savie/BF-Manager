package l;

import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.ۙ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4326 implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int iM6822 = C2209.m6822((String) obj);
        if (iM6822 == 0) {
            return Integer.MAX_VALUE;
        }
        return iM6822;
    }
}
