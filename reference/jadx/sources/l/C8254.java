package l;

/* JADX INFO: renamed from: l.۠ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: PA21 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8254 extends C16016 {
    public C8254(String str) {
        String strM1693 = C0252.m1693("\\\\", str);
        C12488 c12488 = new C12488();
        this.f51841 = strM1693;
        this.f51842 = 1;
        this.f51840 = c12488;
        this.f51844 = -1;
        this.f51843 = 0;
        this.f74953 = 0;
        this.f74952 = 3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22180[] m21645() {
        C12488 c12488 = (C12488) this.f51840;
        C18837[] c18837Arr = new C18837[c12488.f41661];
        for (int i = 0; i < c12488.f41661; i++) {
            c18837Arr[i] = new C18837(c12488.f41660[i]);
        }
        return c18837Arr;
    }
}
