package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۖ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2736 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f10513;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f10514;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f10515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f10516;

    public C2736(int i, int i2, Object[] objArr) {
        this.f10514 = objArr;
        this.f10515 = i;
        this.f10516 = i2;
        int iMax = 1;
        int i3 = 0;
        for (Object obj : objArr) {
            if (obj instanceof int[]) {
                iMax = Math.max(iMax, ((int[]) obj).length);
            }
        }
        long j = ((long) iMax) * ((long) i2);
        if (i2 <= 64 && j <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            i3 = (int) ((j / 64) + 1);
        }
        this.f10513 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2736 m8344(C17244 c17244) {
        int i;
        int i2;
        C23595 c23595;
        C23595 c23596;
        C14732 c14732;
        C23595 c23597;
        C23595[] c23595Arr;
        int i3;
        C23595 c23598;
        C23595 c23599;
        C10189 c10189;
        int[] iArr;
        if (c17244 == null) {
            return null;
        }
        int i4 = c17244.f54944;
        if (c17244.getClass() != C17244.class || c17244.f54940 != -1 || (i = c17244.f54942) < 0 || c17244.f54941 < i || c17244.f76439 == null || i4 < 0 || (i2 = c17244.f54945) < 0 || i4 == i2 || (c23595 = c17244.f54943) == null || c23595.getClass() != C8778.class) {
            return null;
        }
        C8778 c8778 = (C8778) c17244.f54943;
        boolean z = c8778.f30196;
        int i5 = c8778.f30197;
        if (!z || i5 != i4 || (c23596 = c8778.f76439) == null || c23596.getClass() != C14732.class || (c23597 = (c14732 = (C14732) c8778.f76439).f48159) == null || c23597.getClass() != C2030.class || (c23595Arr = c14732.f48161) == null || (i3 = c14732.f48160) < 2 || i3 > c23595Arr.length || (c23599 = (c23598 = c14732.f48159).f76439) == null || c23599.getClass() != C10189.class || c8778.f30195 != (c10189 = (C10189) c23598.f76439) || !c10189.f34813 || c10189.f34815 != 0 || c10189.f34814 != i5 || c10189.f76439 != c17244) {
            return null;
        }
        Object[] objArr = new Object[c14732.f48160];
        for (int i6 = 0; i6 < c14732.f48160; i6++) {
            C23595 c235910 = c14732.f48161[i6];
            if (c235910 == null || c235910.f76439 != c23598) {
                return null;
            }
            if (c235910.getClass() == C0619.class) {
                InterfaceC13717 interfaceC13717 = ((C1015) c235910).f4704;
                if (interfaceC13717 == null) {
                    return null;
                }
                objArr[i6] = interfaceC13717;
            } else {
                if (c235910.getClass() != C6701.class || (iArr = ((C6701) c235910).f69912) == null || iArr.length == 0) {
                    return null;
                }
                for (int i7 : iArr) {
                    if (i7 < 0 || i7 > 65535) {
                        return null;
                    }
                }
                objArr[i6] = iArr.clone();
            }
        }
        return new C2736(c17244.f54942, c17244.f54941, objArr);
    }
}
