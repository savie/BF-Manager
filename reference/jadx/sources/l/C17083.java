package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܿۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N4QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17083 extends AbstractC10442 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f54500;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f54501;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54502;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54503;

    public C17083(C17684 c17684, C18825 c18825) {
        this.f54501 = c17684;
        this.f54502 = c17684.m41204(c18825.m43449());
        int iM43449 = c18825.m43449();
        this.f54503 = iM43449;
        this.f54500 = c18825.m43447();
        m39868(c18825, iM43449);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39867(C18825 c18825) {
        c18825.m43452();
        m39868(c18825, c18825.m43449());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39868(C18825 c18825, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            c18825.m43452();
            AbstractC10872.m27240(c18825);
        }
    }

    @Override // l.InterfaceC20147
    public final String getType() {
        return this.f54502;
    }

    @Override // l.InterfaceC20147
    public final Set getElements() {
        return new C12145(this, this.f54501, this.f54500, this.f54503);
    }
}
