package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3960 extends AbstractC13613 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f14717;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC3733 f14718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f14719;

    public C3960(AbstractC3733 abstractC3733, String str, int[] iArr) {
        str.getClass();
        this.f14718 = abstractC3733;
        this.f14717 = str;
        this.f14719 = iArr;
    }

    @Override // l.InterfaceC12078
    public final String getValue() {
        return this.f14717;
    }

    @Override // l.InterfaceC12078
    public final int[] getStyle() {
        return this.f14719;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final C15606[] mo11444() {
        int[] iArr = this.f14719;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length / 3;
        C15606[] c15606Arr = new C15606[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            c15606Arr[i] = new C15606(this.f14718.m10939(iArr[i2]), iArr[i2 + 1], iArr[i2 + 2] + 1);
        }
        return c15606Arr;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C15606[] mo11446() {
        int[] iArr = this.f14719;
        if (iArr == null || iArr.length % 3 != 0) {
            return null;
        }
        int length = iArr.length / 3;
        C15606[] c15606Arr = new C15606[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            try {
                c15606Arr[i] = new C15606(this.f14718.mo15779(iArr[i2]).getValue(), iArr[i2 + 1], iArr[i2 + 2] + 1);
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return m33291(c15606Arr);
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11445() {
        return this.f14719 != null;
    }

    @Override // l.AbstractC13613
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3960.class == obj.getClass()) {
            C3960 c3960 = (C3960) obj;
            if (this.f14717.equals(c3960.f14717) && Arrays.equals(this.f14719, c3960.f14719)) {
                return true;
            }
        }
        return false;
    }
}
