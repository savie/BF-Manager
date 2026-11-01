package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩻᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes2.dex */
public final class C23993 extends AbstractC18036 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f77764;

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    public C23993(C3614 c3614) {
        this.f77764 = c3614;
    }

    @Override // l.AbstractC18036, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC10007 iterator() {
        return new C0792(this.f77764);
    }

    @Override // l.AbstractC18036, java.util.Collection, java.lang.Iterable, l.InterfaceC13535, l.InterfaceC10441, l.InterfaceC0624, l.InterfaceC16585, java.util.Set, l.InterfaceC22810
    public final InterfaceC11501 spliterator() {
        return new C12788(this.f77764);
    }

    @Override // l.AbstractC18036, l.InterfaceC19179
    /* JADX INFO: renamed from: ܰ */
    public final void mo6890(InterfaceC17767 interfaceC17767) {
        C3614 c3614 = this.f77764;
        int[] iArr = c3614.f13284;
        float[] fArr = c3614.f13289;
        if (c3614.f13290) {
            interfaceC17767.mo35707(fArr[c3614.f13287]);
        }
        int i = c3614.f13287;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC17767.mo35707(fArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f77764.f13294;
    }

    @Override // l.InterfaceC13535
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo5900(float f) {
        return this.f77764.m10712(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f77764.clear();
    }
}
