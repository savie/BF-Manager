package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAOV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10595 extends AbstractC12006 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C4907 f36243;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C17055 f36244;

    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "String.intern";
    }

    public C10595(C5655 c5655, InterfaceC8706 interfaceC8706) {
        super(c5655, interfaceC8706);
        this.f36244 = new C17055("Ljava/lang/String;", "intern", "Ljava/lang/String;", Collections.EMPTY_LIST);
        this.f36243 = new C4907(c5655);
        this.f40233 = EnumC14599.VIRTUAL;
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final List mo8585(C5655 c5655) {
        return Collections.singletonList(this.f36244);
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final String mo18934(C10124 c10124, C20700 c20700, C1897 c1897, int i) {
        int iM6186 = c1897.m6186();
        C4907 c4907 = this.f36243;
        if (c4907.m13642(c20700, i, iM6186)) {
            return c4907.m13640();
        }
        C13638.toString(c10124);
        return null;
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final void mo18935(C20700 c20700, C19289 c19289, C1897 c1897, C9660 c9660) {
        super.mo18935(c20700, c19289, c1897, c9660);
        this.f36243.m13641(c20700);
    }
}
