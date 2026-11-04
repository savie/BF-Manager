package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6715 extends AbstractC1318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19393 f22342;

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C6715(C19393 c19393) {
        this.f22342 = c19393;
    }

    @Override // l.AbstractC4301, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC21040 iterator() {
        return new C12680(this.f22342);
    }

    @Override // l.AbstractC1318, l.AbstractC4301, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC16321 spliterator() {
        return new C24615(this.f22342);
    }

    @Override // l.AbstractC4301, l.InterfaceC3886
    /* JADX INFO: renamed from: ۙ */
    public final void mo5932(InterfaceC12089 interfaceC12089) {
        C19393 c19393 = this.f22342;
        char[] cArr = c19393.f62668;
        if (c19393.f62676) {
            interfaceC12089.mo10258(cArr[c19393.f62674]);
        }
        int i = c19393.f62674;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC12089.mo10258(c);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22342.f62670;
    }

    @Override // l.InterfaceC12835
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo5936(char c) {
        return this.f22342.mo19857(c);
    }

    @Override // l.AbstractC1318
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4844(char c) {
        C19393 c19393 = this.f22342;
        int i = c19393.f62670;
        c19393.mo11585(c);
        return c19393.f62670 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f22342.clear();
    }
}
