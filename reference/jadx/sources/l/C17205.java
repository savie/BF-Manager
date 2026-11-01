package l;

/* JADX INFO: renamed from: l.ܿ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes5.dex */
public class C17205 extends AbstractC14384 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC14384 f54844;

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14384 mo27209() {
        throw null;
    }

    @Override // l.InterfaceC19010
    @Deprecated
    public final boolean apply(Object obj) {
        return mo1772(((Character) obj).charValue());
    }

    public C17205(AbstractC14384 abstractC14384) {
        this.f54844 = abstractC14384;
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1772(char c) {
        return !this.f54844.mo1772(c);
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo27210(CharSequence charSequence) {
        return this.f54844.mo27206(charSequence);
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo27206(CharSequence charSequence) {
        return this.f54844.mo27210(charSequence);
    }

    @Override // l.AbstractC14384
    /* JADX INFO: renamed from: ۙ */
    public final int mo27208(CharSequence charSequence) {
        return charSequence.length() - this.f54844.mo27208(charSequence);
    }

    public final String toString() {
        return this.f54844 + ".negate()";
    }
}
