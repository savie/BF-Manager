package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۨ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11990 extends AbstractC14107 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f40184;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f40185;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC14107 f40186;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f40187;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f40188;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Collection f40189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40190;

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10596() {
        return getName().matches("\\bMODULE\\b");
    }

    public C11990(C20456 c20456, AbstractC14107 abstractC14107, String str, String str2, Collection collection, boolean z) {
        this.f40185 = c20456;
        this.f40186 = abstractC14107;
        this.f40184 = str;
        this.f40190 = str2;
        this.f40189 = collection;
        this.f40188 = z;
    }

    @Override // l.InterfaceC4290
    public final String getName() {
        return this.f40184;
    }

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10597() {
        return this.f40188;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        return C0561.unmodifiableCollection(this.f40189);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        this.f40186.mo4919(iterable, this.f40190);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4919(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f40184);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo29858() {
        return this.f40190;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        return C20456.m46266(this.f40185, this.f40189, interfaceC3800);
    }

    public final String toString() {
        return this.f40184;
    }
}
