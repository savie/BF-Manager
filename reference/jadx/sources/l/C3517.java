package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۗܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C3517 extends AbstractC23655 implements InterfaceC24928 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f12089;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC23655 f12090;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f12091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f12092;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f12093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Collection f12094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f12095;

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11523() {
        return getName().matches("\\bMODULE\\b");
    }

    public C3517(C22185 c22185, AbstractC23655 abstractC23655, String str, String str2, Collection collection, boolean z) {
        this.f12091 = c22185;
        this.f12090 = abstractC23655;
        this.f12093 = str;
        this.f12095 = str2;
        this.f12094 = collection;
        this.f12089 = z;
    }

    @Override // l.InterfaceC24928
    public final String getName() {
        return this.f12093;
    }

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo11525() {
        return this.f12089;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        return C4681.unmodifiableCollection(this.f12094);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        this.f12090.mo4670(iterable, this.f12095);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4670(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f12093);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo11524() {
        return this.f12095;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        return C22185.m50187(this.f12091, this.f12094, interfaceC24329);
    }

    public final String toString() {
        return this.f12093;
    }
}
