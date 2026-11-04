package l;

/* JADX INFO: renamed from: l.۠۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public class C8659 extends AbstractC21825 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC21825 f28268;

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21825 mo23311() {
        throw null;
    }

    @Override // l.InterfaceC6163
    @Deprecated
    public final boolean apply(Object obj) {
        return mo4420(((Character) obj).charValue());
    }

    public C8659(AbstractC21825 abstractC21825) {
        this.f28268 = abstractC21825;
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4420(char c) {
        return !this.f28268.mo4420(c);
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo23312(CharSequence charSequence) {
        return this.f28268.mo23313(charSequence);
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo23313(CharSequence charSequence) {
        return this.f28268.mo23312(charSequence);
    }

    @Override // l.AbstractC21825
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo23310(CharSequence charSequence) {
        return charSequence.length() - this.f28268.mo23310(charSequence);
    }

    public final String toString() {
        return this.f28268 + ".negate()";
    }
}
