package l;

/* JADX INFO: renamed from: l.۠ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes4.dex */
public final class C8592 extends C3655 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f28084;

    @Override // l.C3655, l.InterfaceC23180
    /* JADX INFO: renamed from: ۙ */
    public final void mo11851(C20942 c20942, AbstractC4534 abstractC4534) {
        if (abstractC4534 instanceof C5695) {
            int i = this.f28084 + 1;
            this.f28084 = i;
            if (i > 100000) {
                throw new C5259();
            }
        }
        super.mo11851(c20942, abstractC4534);
    }
}
