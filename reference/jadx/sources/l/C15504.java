package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15504 implements InterfaceC13988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50512 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21853 f50513;

    public C15504(C21853 c21853) {
        this.f50513 = c21853;
    }

    @Override // l.InterfaceC13988
    /* JADX INFO: renamed from: ۙ */
    public final void mo18588(C11871 c11871, C11871 c11872) {
        C23265 c23265 = new C23265();
        c23265.f75492 = new ArrayList();
        int i = this.f50512 + 1;
        this.f50512 = i;
        c23265.f75490 = i;
        c23265.f75488 = c11871;
        c23265.f75491 = c11872;
        C21853 c21853 = this.f50513;
        c21853.f70928.add(c11871);
        c21853.f70929[c11871.m29617()] = c23265;
    }
}
