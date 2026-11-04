package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1W7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15789 extends C20265 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f51372;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f51373;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51374;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f51375;

    public C15789(C23249... c23249Arr) {
        int length = c23249Arr.length;
        this.f65074 = length;
        ArrayList arrayList = new ArrayList();
        this.f65072 = arrayList;
        arrayList.addAll(Arrays.asList(c23249Arr));
        this.f65073 = ((AbstractC3111) arrayList.get(length - 1)).m10179();
        this.f51374 = true;
    }

    public final C15789 clone() {
        ArrayList arrayList = this.f65072;
        int size = arrayList.size();
        C23249[] c23249Arr = new C23249[size];
        for (int i = 0; i < size; i++) {
            c23249Arr[i] = (C23249) ((AbstractC3111) arrayList.get(i)).clone();
        }
        return new C15789(c23249Arr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m37719(float f) {
        ArrayList arrayList = this.f65072;
        int i = this.f65074;
        if (i == 2) {
            if (this.f51374) {
                this.f51374 = false;
                this.f51373 = ((C23249) arrayList.get(0)).f75329;
                float f2 = ((C23249) arrayList.get(1)).f75329;
                this.f51372 = f2;
                this.f51375 = f2 - this.f51373;
            }
            Interpolator interpolator = this.f65073;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC21931 interfaceC21931 = this.f65071;
            if (interfaceC21931 == null) {
                return (f * this.f51375) + this.f51373;
            }
            return ((Number) interfaceC21931.mo6294(f, Float.valueOf(this.f51373), Float.valueOf(this.f51372))).floatValue();
        }
        if (f <= 0.0f) {
            C23249 c23249 = (C23249) arrayList.get(0);
            C23249 c232410 = (C23249) arrayList.get(1);
            float f3 = c23249.f75329;
            float f4 = c232410.f75329;
            float f5 = c23249.f10078;
            float f6 = c232410.f10078;
            Interpolator interpolatorM10179 = c232410.m10179();
            if (interpolatorM10179 != null) {
                f = interpolatorM10179.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC21931 interfaceC21932 = this.f65071;
            return interfaceC21932 == null ? C19967.m45884(f4, f3, f7, f3) : ((Number) interfaceC21932.mo6294(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            C23249 c232411 = (C23249) arrayList.get(i - 2);
            C23249 c232412 = (C23249) arrayList.get(i - 1);
            float f8 = c232411.f75329;
            float f9 = c232412.f75329;
            float f10 = c232411.f10078;
            float f11 = c232412.f10078;
            Interpolator interpolatorM101710 = c232412.m10179();
            if (interpolatorM101710 != null) {
                f = interpolatorM101710.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC21931 interfaceC21933 = this.f65071;
            return interfaceC21933 == null ? C19967.m45884(f9, f8, f12, f8) : ((Number) interfaceC21933.mo6294(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        C23249 c232413 = (C23249) arrayList.get(0);
        int i2 = 1;
        while (i2 < i) {
            C23249 c232414 = (C23249) arrayList.get(i2);
            if (f < c232414.f10078) {
                Interpolator interpolatorM101711 = c232414.m10179();
                if (interpolatorM101711 != null) {
                    f = interpolatorM101711.getInterpolation(f);
                }
                float f13 = c232413.f10078;
                float f14 = (f - f13) / (c232414.f10078 - f13);
                float f15 = c232413.f75329;
                float f16 = c232414.f75329;
                InterfaceC21931 interfaceC21934 = this.f65071;
                return interfaceC21934 == null ? C19967.m45884(f16, f15, f14, f15) : ((Number) interfaceC21934.mo6294(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c232413 = c232414;
        }
        return ((AbstractC3111) arrayList.get(i - 1)).mo10182().floatValue();
    }
}
