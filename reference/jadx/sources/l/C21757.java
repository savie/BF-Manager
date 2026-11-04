package l;

/* JADX INFO: renamed from: l.᩷ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8DU */
/* JADX INFO: loaded from: classes.dex */
public final class C21757 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69395;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f69396;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15745 f69397;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4603[] f69398;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49315(int i) {
        C4603 c4603M49312 = m49312(i);
        if (c4603M49312 != null) {
            c4603M49312.f16329 = false;
            C21757 c21757 = c4603M49312.f16330;
            long j = c21757.f69396;
            c21757.f69396 = 1 + j;
            c4603M49312.f16331 = j;
        }
    }

    public C21757(InterfaceC21207[] interfaceC21207Arr) {
        int length = interfaceC21207Arr.length;
        this.f69395 = length;
        this.f69398 = new C4603[length];
        for (int i = 0; i < this.f69395; i++) {
            C4603[] c4603Arr = this.f69398;
            C4603 c4603 = new C4603(this);
            c4603Arr[i] = c4603;
            c4603.f16333 = interfaceC21207Arr[i];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19475 m49314() {
        if (this.f69397 == null) {
            AbstractC4053 abstractC4053 = (AbstractC4053) this.f69398[0].f16333;
            abstractC4053.getClass();
            this.f69397 = abstractC4053.m13045();
        }
        return this.f69397;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4603 m49312(int i) {
        for (C4603 c4603 : this.f69398) {
            if (c4603.f16332 == i) {
                return c4603;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4603 m49311(C21757 c21757, int i) {
        C4603 c4603M49312 = c21757.m49312(i);
        if (c4603M49312 == null) {
            C4603 c4603 = null;
            C4603 c4604 = null;
            for (C4603 c4605 : c21757.f69398) {
                if (c4605.f16333 == null) {
                    c4603M49312 = c4605;
                } else {
                    if (c4603 != null) {
                        if (!c4605.f16329 && c4605.f16331 < c4603.f16331) {
                            c4603 = c4605;
                        }
                    } else if (!c4605.f16329) {
                        c4603 = c4605;
                    } else if (c4604 == null || c4605.f16331 < c4604.f16331) {
                        c4604 = c4605;
                    }
                }
            }
            c4603M49312 = c4603 != null ? c4603 : c4604;
        }
        c4603M49312.f16332 = i;
        long j = c21757.f69396;
        c21757.f69396 = 1 + j;
        c4603M49312.f16331 = j;
        c4603M49312.f16329 = true;
        return c4603M49312;
    }
}
