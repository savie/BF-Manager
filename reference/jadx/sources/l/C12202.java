package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 255M */
/* JADX INFO: loaded from: classes4.dex */
public final class C12202 extends AbstractC13613 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15606[] f40804;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f40805;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17140 f40808;

    public C12202(C17140 c17140, String str, C15606[] c15606Arr, boolean z) {
        this.f40806 = -1;
        str.getClass();
        this.f40808 = c17140;
        this.f40805 = str;
        this.f40804 = c15606Arr;
        if (c15606Arr == null || !z) {
            return;
        }
        for (C15606 c15606 : c15606Arr) {
            c17140.m40055(c15606.f50740);
        }
    }

    public C12202(C17140 c17140, String str) {
        this(c17140, str, null, false);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m30302() {
        int i = this.f40806;
        C17140 c17140 = this.f40808;
        if (i != -1 && c17140.getItem(i) == this) {
            return this.f40806;
        }
        int iM40057 = c17140.m40057(this);
        this.f40806 = iM40057;
        return iM40057;
    }

    @Override // l.InterfaceC12078
    public final String getValue() {
        return this.f40805;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30301(String str) {
        C15606[] c15606Arr = this.f40804;
        C17140 c17140 = this.f40808;
        if (c15606Arr == null) {
            if (this.f40805.equals(str)) {
                return;
            }
            c17140.f54674.remove(this.f40805);
            this.f40805 = str;
            c17140.f54674.put(str, this);
            return;
        }
        c17140.f54675.remove(this);
        this.f40805 = str;
        this.f40804 = null;
        c17140.f54674.put(str, this);
    }

    @Override // l.InterfaceC12078
    public final int[] getStyle() {
        if (!mo11445()) {
            return null;
        }
        C15606[] c15606ArrM38458 = C16311.m38458(m33291(this.f40804));
        int[] iArr = new int[c15606ArrM38458.length * 3];
        for (int i = 0; i < c15606ArrM38458.length; i++) {
            C15606 c15606 = c15606ArrM38458[i];
            int i2 = i * 3;
            iArr[i2] = this.f40808.m40062(c15606.f50740);
            iArr[i2 + 1] = c15606.f50741;
            iArr[i2 + 2] = c15606.f50739 - 1;
        }
        return iArr;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֡ۙ */
    public final C15606[] mo11444() {
        C15606[] c15606Arr = this.f40804;
        return c15606Arr != null ? (C15606[]) c15606Arr.clone() : c15606Arr;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ۢۙ */
    public final C15606[] mo11446() {
        return m33291(this.f40804);
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֫ۙ */
    public final boolean mo11445() {
        C15606[] c15606Arr = this.f40804;
        return c15606Arr != null && c15606Arr.length > 0;
    }

    @Override // l.AbstractC13613
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12202.class == obj.getClass()) {
            C12202 c12202 = (C12202) obj;
            if (Arrays.equals(this.f40804, c12202.f40804) && this.f40805.equals(c12202.f40805)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC13613
    public final int hashCode() {
        return this.f40805.hashCode();
    }
}
