package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10734 extends AbstractC7619 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f36580;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f36581;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f36582;

    public C10734(C17684 c17684, C18825 c18825) {
        this.f36581 = c17684;
        int iM43449 = c18825.m43449();
        this.f36582 = iM43449;
        this.f36580 = c18825.m43447();
        for (int i = 0; i < iM43449; i++) {
            AbstractC10872.m27240(c18825);
        }
    }

    @Override // l.InterfaceC0390
    public final List getValue() {
        return new C5794(this, this.f36581, this.f36580, this.f36582);
    }
}
