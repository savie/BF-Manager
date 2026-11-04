package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4Q2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21398 f64678;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10209 f64679;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11921 f64680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12667 f64681;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3718 f64682;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23856 f64683;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15650 f64684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC25348 f64685;

    public AbstractC20126(C10209 c10209, InterfaceC3718 interfaceC3718, C14816 c14816, C9092 c9092, C5868 c5868, C17054 c17054, C11087 c11087, InterfaceC21398 interfaceC21398) {
        this.f64679 = c10209;
        this.f64682 = interfaceC3718;
        this.f64681 = c14816;
        this.f64684 = c9092;
        this.f64685 = c5868;
        this.f64683 = c17054;
        this.f64680 = c11087;
        this.f64678 = interfaceC21398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46351(C21530 c21530, Set set) {
        C10209 c10209 = this.f64679;
        c10209.m26347(29, 0);
        C10209.m26339(c10209, ((C14816) this.f64681).mo5275(c21530));
        C10209.m26339(c10209, set.size());
        AbstractC14956 abstractC14956ListIterator = AbstractC1928.m6613(AbstractC18753.m43551(AbstractC18155.f59356), set).listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) abstractC14956ListIterator.next();
            InterfaceC3718 interfaceC3718 = this.f64682;
            InterfaceC21398 interfaceC21398 = this.f64678;
            C10209.m26339(c10209, interfaceC3718.mo5275(interfaceC21398.mo48653(interfaceC19073)));
            C5210 c5210 = (C5210) this;
            c5210.f18377.mo23716(c5210, interfaceC21398.mo48650(interfaceC19073));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46345(List list) {
        C10209 c10209 = this.f64679;
        c10209.m26347(28, 0);
        C10209.m26339(c10209, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5210 c5210 = (C5210) this;
            c5210.f18377.mo23716(c5210, it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46353(boolean z) {
        this.f64679.m26347(31, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46339(byte b) {
        this.f64679.m26345(0, b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46340(char c) {
        this.f64679.m26349(3, c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46341(double d) {
        this.f64679.m26342(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46347(C2381 c2381) {
        this.f64679.m26349(27, ((C9092) this.f64684).mo5275(c2381));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46355(C2381 c2381) {
        this.f64679.m26349(25, ((C9092) this.f64684).mo5275(c2381));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46342(float f) {
        this.f64679.m26343(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46343(int i) {
        this.f64679.m26345(4, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46344(long j) {
        this.f64679.m26350(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46349(C11833 c11833) {
        this.f64679.m26349(26, ((C5868) this.f64685).mo5275(c11833));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46338() {
        this.f64679.write(30);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46354(int i) {
        this.f64679.m26345(2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46348(C3630 c3630) {
        this.f64679.m26349(23, this.f64682.mo5275(c3630));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46350(C21530 c21530) {
        this.f64679.m26349(24, ((C14816) this.f64681).mo5275(c21530));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46346(C2139 c2139) {
        this.f64679.m26349(21, ((C17054) this.f64683).mo5275(c2139));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46352(C23022 c23022) {
        this.f64679.m26349(22, ((C11087) this.f64680).mo5275(c23022));
    }
}
