package l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.۠ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 84NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8336 implements TypeEvaluator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11783[] f27323;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C11783[] c11783Arr = (C11783[]) obj;
        C11783[] c11783Arr2 = (C11783[]) obj2;
        if (!C25210.m56208(c11783Arr, c11783Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!C25210.m56208(this.f27323, c11783Arr)) {
            this.f27323 = C25210.m56211(c11783Arr);
        }
        for (int i = 0; i < c11783Arr.length; i++) {
            this.f27323[i].m29610(c11783Arr[i], c11783Arr2[i], f);
        }
        return this.f27323;
    }
}
