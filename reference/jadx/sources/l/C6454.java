package l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.ۜ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84NK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6454 implements TypeEvaluator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5486[] f21828;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C5486[] c5486Arr = (C5486[]) obj;
        C5486[] c5486Arr2 = (C5486[]) obj2;
        if (!C22420.m49739(c5486Arr, c5486Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!C22420.m49739(this.f21828, c5486Arr)) {
            this.f21828 = C22420.m49742(c5486Arr);
        }
        for (int i = 0; i < c5486Arr.length; i++) {
            this.f21828[i].m15153(c5486Arr[i], c5486Arr2[i], f);
        }
        return this.f21828;
    }
}
