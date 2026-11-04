package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C12857 extends AbstractC0660 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f41166;

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C12857(C24046 c24046) {
        this.f41166 = c24046;
    }

    @Override // l.AbstractC0660, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC9367 iterator() {
        return new C12111(this.f41166);
    }

    @Override // l.AbstractC0660, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC15906 spliterator() {
        return new C6146(this.f41166);
    }

    @Override // l.AbstractC0660, l.InterfaceC10113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2884(InterfaceC0419 interfaceC0419) {
        C24046 c24046 = this.f41166;
        int[] iArr = c24046.f77781;
        float[] fArr = c24046.f77775;
        if (c24046.f77780) {
            interfaceC0419.mo2223(fArr[c24046.f77774]);
        }
        int i = c24046.f77774;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC0419.mo2223(fArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f41166.f77778;
    }

    @Override // l.InterfaceC17572
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6580(float f) {
        return this.f41166.m53600(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f41166.clear();
    }
}
