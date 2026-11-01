package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 465J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4416 extends AbstractC6207 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17684 f15714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f15715;

    public C4416(C17684 c17684, C18825 c18825, int i) {
        this.f15714 = c17684;
        this.f15715 = c18825.m43431(i + 1);
    }

    @Override // l.InterfaceC5060
    public final String getValue() {
        return this.f15714.m41168(this.f15715);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12341() {
        return this.f15715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12342(C2093 c2093) {
        this.f15714.m41171(this.f15715, c2093, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12343(C12283 c12283) throws IOException {
        c12283.write(34);
        this.f15714.m41192(this.f15715, c12283, true);
        c12283.write(34);
    }
}
