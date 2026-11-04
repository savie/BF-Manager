package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5II */
/* JADX INFO: loaded from: classes4.dex */
public final class C10391 extends C6118 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f33037;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f33038;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26701(AbstractC19342 abstractC19342) {
        this.f33037.add(abstractC19342);
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ۤ */
    public final void mo17660(int i, C17347 c17347) {
        m26701(new C0697(c17347));
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ۙ */
    public final void mo17656(int i, String str) {
        if (this.f33038 == null) {
            this.f33038 = new ArrayList();
        }
        while (this.f33038.size() <= i) {
            this.f33038.add(null);
        }
        this.f33038.set(i, str);
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17661(int i, C17347 c17347) {
        C21580 c21580 = new C21580(c17347);
        c21580.f68940 = i;
        m26701(c21580);
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ۙ */
    public final void mo17658(int i, C17347 c17347, String str, String str2, String str3) {
        m26701(new C8155(c17347));
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ۙ */
    public final void mo17657(int i, C17347 c17347) {
        m26701(new C4426(c17347));
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17662(C17347 c17347) {
        m26701(new C18596(c17347));
    }

    @Override // l.C6118
    /* JADX INFO: renamed from: ۙ */
    public final void mo17659(C17347 c17347) {
        m26701(new C14866(c17347));
    }
}
