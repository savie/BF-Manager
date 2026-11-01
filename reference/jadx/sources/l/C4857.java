package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4857 extends C2740 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f17108;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f17109;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f17110;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17111;

    public C4857(C14031... c14031Arr) {
        int length = c14031Arr.length;
        this.f10532 = length;
        ArrayList arrayList = new ArrayList();
        this.f10534 = arrayList;
        arrayList.addAll(Arrays.asList(c14031Arr));
        this.f10535 = ((AbstractC11914) arrayList.get(length - 1)).m29720();
        this.f17111 = true;
    }

    public final C4857 clone() {
        ArrayList arrayList = this.f10534;
        int size = arrayList.size();
        C14031[] c14031Arr = new C14031[size];
        for (int i = 0; i < size; i++) {
            c14031Arr[i] = (C14031) ((AbstractC11914) arrayList.get(i)).clone();
        }
        return new C4857(c14031Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m13555(float f) {
        ArrayList arrayList = this.f10534;
        int i = this.f10532;
        if (i == 2) {
            if (this.f17111) {
                this.f17111 = false;
                this.f17108 = ((C14031) arrayList.get(0)).f46141;
                float f2 = ((C14031) arrayList.get(1)).f46141;
                this.f17110 = f2;
                this.f17109 = f2 - this.f17108;
            }
            Interpolator interpolator = this.f10535;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC20380 interfaceC20380 = this.f10533;
            if (interfaceC20380 == null) {
                return (f * this.f17109) + this.f17108;
            }
            return ((Number) interfaceC20380.mo4824(f, Float.valueOf(this.f17108), Float.valueOf(this.f17110))).floatValue();
        }
        if (f <= 0.0f) {
            C14031 c14031 = (C14031) arrayList.get(0);
            C14031 c14032 = (C14031) arrayList.get(1);
            float f3 = c14031.f46141;
            float f4 = c14032.f46141;
            float f5 = c14031.f40006;
            float f6 = c14032.f40006;
            Interpolator interpolatorM29720 = c14032.m29720();
            if (interpolatorM29720 != null) {
                f = interpolatorM29720.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC20380 interfaceC20381 = this.f10533;
            return interfaceC20381 == null ? C0280.m1792(f4, f3, f7, f3) : ((Number) interfaceC20381.mo4824(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            C14031 c14033 = (C14031) arrayList.get(i - 2);
            C14031 c14034 = (C14031) arrayList.get(i - 1);
            float f8 = c14033.f46141;
            float f9 = c14034.f46141;
            float f10 = c14033.f40006;
            float f11 = c14034.f40006;
            Interpolator interpolatorM29721 = c14034.m29720();
            if (interpolatorM29721 != null) {
                f = interpolatorM29721.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC20380 interfaceC20382 = this.f10533;
            return interfaceC20382 == null ? C0280.m1792(f9, f8, f12, f8) : ((Number) interfaceC20382.mo4824(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        C14031 c14035 = (C14031) arrayList.get(0);
        int i2 = 1;
        while (i2 < i) {
            C14031 c14036 = (C14031) arrayList.get(i2);
            if (f < c14036.f40006) {
                Interpolator interpolatorM29722 = c14036.m29720();
                if (interpolatorM29722 != null) {
                    f = interpolatorM29722.getInterpolation(f);
                }
                float f13 = c14035.f40006;
                float f14 = (f - f13) / (c14036.f40006 - f13);
                float f15 = c14035.f46141;
                float f16 = c14036.f46141;
                InterfaceC20380 interfaceC20383 = this.f10533;
                return interfaceC20383 == null ? C0280.m1792(f16, f15, f14, f15) : ((Number) interfaceC20383.mo4824(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c14035 = c14036;
        }
        return ((AbstractC11914) arrayList.get(i - 1)).mo29723().floatValue();
    }
}
