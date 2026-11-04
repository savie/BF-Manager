package l;

/* JADX INFO: renamed from: l.ᩴۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PA21 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19807 extends C25029 {
    public C19807(String str) {
        String strM56409 = C25272.m56409("\\\\", str);
        C23537 c23537 = new C23537();
        this.f80987 = strM56409;
        this.f80985 = 1;
        this.f80990 = c23537;
        this.f80989 = -1;
        this.f80986 = 0;
        this.f44579 = 0;
        this.f44581 = 3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627[] m45580() {
        C23537 c23537 = (C23537) this.f80990;
        C22791[] c22791Arr = new C22791[c23537.f76041];
        for (int i = 0; i < c23537.f76041; i++) {
            c22791Arr[i] = new C22791(c23537.f76040[i]);
        }
        return c22791Arr;
    }
}
