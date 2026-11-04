package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۜۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f22772;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f22773;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22774;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f22775;

    public C6857(int i, int i2, Object[] objArr) {
        this.f22772 = objArr;
        this.f22773 = i;
        this.f22774 = i2;
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
        this.f22775 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6857 m19090(C14576 c14576) {
        int i;
        int i2;
        C0407 c0407;
        C0407 c0408;
        C8106 c8106;
        C0407 c0409;
        C0407[] c0407Arr;
        int i3;
        C0407 c04010;
        C0407 c04011;
        C16068 c16068;
        int[] iArr;
        if (c14576 == null) {
            return null;
        }
        int i4 = c14576.f45933;
        if (c14576.getClass() != C14576.class || c14576.f45930 != -1 || (i = c14576.f45932) < 0 || c14576.f45934 < i || c14576.f1952 == null || i4 < 0 || (i2 = c14576.f45931) < 0 || i4 == i2 || (c0407 = c14576.f45929) == null || c0407.getClass() != C17560.class) {
            return null;
        }
        C17560 c17560 = (C17560) c14576.f45929;
        boolean z = c17560.f57061;
        int i5 = c17560.f57062;
        if (!z || i5 != i4 || (c0408 = c17560.f1952) == null || c0408.getClass() != C8106.class || (c0409 = (c8106 = (C8106) c17560.f1952).f26771) == null || c0409.getClass() != C19293.class || (c0407Arr = c8106.f26768) == null || (i3 = c8106.f26769) < 2 || i3 > c0407Arr.length || (c04011 = (c04010 = c8106.f26771).f1952) == null || c04011.getClass() != C16068.class || c17560.f57063 != (c16068 = (C16068) c04010.f1952) || !c16068.f52070 || c16068.f52069 != 0 || c16068.f52068 != i5 || c16068.f1952 != c14576) {
            return null;
        }
        Object[] objArr = new Object[c8106.f26769];
        for (int i6 = 0; i6 < c8106.f26769; i6++) {
            C0407 c04012 = c8106.f26768[i6];
            if (c04012 == null || c04012.f1952 != c04010) {
                return null;
            }
            if (c04012.getClass() == C6615.class) {
                InterfaceC2885 interfaceC2885 = ((C22036) c04012).f71066;
                if (interfaceC2885 == null) {
                    return null;
                }
                objArr[i6] = interfaceC2885;
            } else {
                if (c04012.getClass() != C19624.class || (iArr = ((C19624) c04012).f19048) == null || iArr.length == 0) {
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
        return new C6857(c14576.f45932, c14576.f45934, objArr);
    }
}
