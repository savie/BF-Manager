package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۫᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 85TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12663 extends AbstractC9011 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13929 f42274;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C20299[] f42275;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11252[] f42276;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18888[] f42277;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23952[] f42278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11252 f42279;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11252[] f42280;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20299[] f42281;

    public C12663(C12063 c12063) {
        super(c12063);
        this.f42274 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12663 m31464(C12063 c12063) {
        C18888[] c18888Arr;
        C11252[] c11252Arr;
        C20299[] c20299Arr;
        C11252[] c11252Arr2;
        C20299[] c20299Arr2;
        C23952[] c23952Arr;
        C18888[] c18888Arr2 = this.f42277;
        int i = 0;
        if (c18888Arr2 != null) {
            c18888Arr = new C18888[c18888Arr2.length];
            int length = c18888Arr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                c18888Arr[i3] = c18888Arr2[i2].m43562(c12063);
                i2++;
                i3++;
            }
        } else {
            c18888Arr = null;
        }
        C11252[] c11252Arr3 = this.f42280;
        if (c11252Arr3 != null) {
            c11252Arr = new C11252[c11252Arr3.length];
            int length2 = c11252Arr3.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                c11252Arr[i5] = c11252Arr3[i4].m28223(c12063);
                i4++;
                i5++;
            }
        } else {
            c11252Arr = null;
        }
        C20299[] c20299Arr3 = this.f42275;
        if (c20299Arr3 != null) {
            c20299Arr = new C20299[c20299Arr3.length];
            int length3 = c20299Arr3.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length3) {
                c20299Arr[i7] = c20299Arr3[i6].m45812(c12063);
                i6++;
                i7++;
            }
        } else {
            c20299Arr = null;
        }
        C11252[] c11252Arr4 = this.f42276;
        if (c11252Arr4 != null) {
            c11252Arr2 = new C11252[c11252Arr4.length];
            int length4 = c11252Arr4.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length4) {
                c11252Arr2[i9] = c11252Arr4[i8].m28223(c12063);
                i8++;
                i9++;
            }
        } else {
            c11252Arr2 = null;
        }
        C20299[] c20299Arr4 = this.f42281;
        if (c20299Arr4 != null) {
            c20299Arr2 = new C20299[c20299Arr4.length];
            int length5 = c20299Arr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length5) {
                c20299Arr2[i11] = c20299Arr4[i10].m45812(c12063);
                i10++;
                i11++;
            }
        } else {
            c20299Arr2 = null;
        }
        C23952[] c23952Arr2 = this.f42278;
        if (c23952Arr2 != null) {
            c23952Arr = new C23952[c23952Arr2.length];
            int length6 = c23952Arr2.length;
            int i12 = 0;
            while (i < length6) {
                c23952Arr[i12] = c23952Arr2[i].m52783(c12063);
                i++;
                i12++;
            }
        } else {
            c23952Arr = null;
        }
        C11252 c11252 = this.f42279;
        C11252 c11252M28223 = c11252 == null ? null : c11252.m28223(c12063);
        C12663 c12663 = new C12663(c12063);
        c12663.f42274 = null;
        c12663.f42279 = c11252M28223;
        c12663.f42277 = c18888Arr;
        c12663.f42280 = c11252Arr;
        c12663.f42275 = c20299Arr;
        c12663.f42276 = c11252Arr2;
        c12663.f42281 = c20299Arr2;
        c12663.f42278 = c23952Arr;
        return (C12663) c12063.f40350.m28060(c12663);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        C12063 c12063;
        this.f42279 = (C11252) c6187.m17187(EnumC21004.TYPE_ANNOTATION_SET_ITEM, c13825.m33642());
        int iM33642 = c13825.m33642();
        this.f42277 = new C18888[iM33642];
        this.f42280 = new C11252[iM33642];
        int iM33643 = c13825.m33642();
        this.f42275 = new C20299[iM33643];
        this.f42276 = new C11252[iM33643];
        int iM33644 = c13825.m33642();
        this.f42281 = new C20299[iM33644];
        this.f42278 = new C23952[iM33644];
        int i = 0;
        while (true) {
            int length = this.f42280.length;
            c12063 = this.f30808;
            if (i >= length) {
                break;
            }
            try {
                this.f42277[i] = (C18888) c12063.f40352.m44688(c13825.m33642());
                this.f42280[i] = (C11252) c6187.m17183(EnumC21004.TYPE_ANNOTATION_SET_ITEM, c13825.m33642());
                i++;
            } catch (Exception e) {
                throw C11708.m29248("Error occured while reading FieldAnnotation at index " + i, e);
            }
        }
        for (int i2 = 0; i2 < this.f42276.length; i2++) {
            try {
                this.f42275[i2] = (C20299) c12063.f40370.m44688(c13825.m33642());
                this.f42276[i2] = (C11252) c6187.m17183(EnumC21004.TYPE_ANNOTATION_SET_ITEM, c13825.m33642());
            } catch (Exception e2) {
                throw C11708.m29248("Error occured while reading MethodAnnotation at index " + i2, e2);
            }
        }
        for (int i3 = 0; i3 < this.f42278.length; i3++) {
            try {
                this.f42281[i3] = (C20299) c12063.f40370.m44688(c13825.m33642());
                this.f42278[i3] = (C23952) c6187.m17183(EnumC21004.TYPE_ANNOTATION_SET_REF_LIST, c13825.m33642());
            } catch (Exception e3) {
                throw C11708.m29248("Error occured while reading ParameterAnnotation at index " + i3, e3);
            }
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        int i2 = i + 16;
        C11252[] c11252Arr = this.f42280;
        int length = c11252Arr == null ? 0 : c11252Arr.length;
        C11252[] c11252Arr2 = this.f42276;
        int length2 = length + (c11252Arr2 == null ? 0 : c11252Arr2.length);
        C23952[] c23952Arr = this.f42278;
        return C0252.m1692(length2, c23952Arr != null ? c23952Arr.length : 0, 8, i2);
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        C11252 c11252 = this.f42279;
        c4651.m12839(c11252 == null ? 0 : c11252.f30807);
        C11252[] c11252Arr = this.f42280;
        c4651.m12839(c11252Arr == null ? 0 : c11252Arr.length);
        C11252[] c11252Arr2 = this.f42276;
        c4651.m12839(c11252Arr2 == null ? 0 : c11252Arr2.length);
        C23952[] c23952Arr = this.f42278;
        c4651.m12839(c23952Arr == null ? 0 : c23952Arr.length);
        if (this.f42280 != null) {
            for (int i = 0; i < this.f42280.length; i++) {
                c4651.m12839(this.f42277[i].f30809);
                c4651.m12839(this.f42280[i].f30807);
            }
        }
        if (this.f42276 != null) {
            for (int i2 = 0; i2 < this.f42276.length; i2++) {
                c4651.m12839(this.f42275[i2].f30809);
                c4651.m12839(this.f42276[i2].f30807);
            }
        }
        if (this.f42278 != null) {
            for (int i3 = 0; i3 < this.f42278.length; i3++) {
                c4651.m12839(this.f42281[i3].f30809);
                c4651.m12839(this.f42278[i3].f30807);
            }
        }
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        if (this.f42274 == null) {
            return C9576.m24440(new StringBuilder("annotation_directory_item @0x"), this.f30807);
        }
        return "annotation_directory_item @0x" + Integer.toHexString(this.f30807) + " (" + this.f42274.m33765() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C12663 c12663) {
        if (!m31462()) {
            if (c12663.m31462()) {
                return -1;
            }
            return this.f42274.f30807 - c12663.f42274.f30807;
        }
        if (c12663.m31462()) {
            return this.f42279.compareTo(c12663.f42279);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m31462() {
        if (this.f42279 == null) {
            return false;
        }
        C11252[] c11252Arr = this.f42280;
        if (c11252Arr != null && c11252Arr.length != 0) {
            return false;
        }
        C11252[] c11252Arr2 = this.f42276;
        if (c11252Arr2 != null && c11252Arr2.length != 0) {
            return false;
        }
        C23952[] c23952Arr = this.f42278;
        return c23952Arr == null || c23952Arr.length == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31465(C13929 c13929) {
        this.f42274 = c13929;
    }

    public final int hashCode() {
        if (!m31462()) {
            return super.hashCode();
        }
        return this.f42279.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12663.class.equals(obj.getClass()) && compareTo((C12663) obj) == 0;
    }
}
