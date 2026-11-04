package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12490 extends AbstractC11154 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f40101;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f40102;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f40103;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f40104;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f40105;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f40106;

    public C12490() {
        throw null;
    }

    public C12490(InterfaceC2731 interfaceC2731, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList) {
        super(interfaceC2731, i);
        this.f40106 = interfaceC2731.mo9070(i);
        this.f40103 = z;
        this.f40105 = z2;
        this.f40104 = z3;
        this.f40101 = z4;
        this.f35130 = i2;
        this.f40102 = arrayList;
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue() {
        return (InterfaceC5650) this.f40102.get(0);
    }

    @Override // l.InterfaceC8697
    public final InterfaceC5650 getValue(int i) {
        return (InterfaceC5650) this.f40102.get(i);
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۤۙ */
    public final int mo18154() {
        return this.f40102.size();
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۬ۙ */
    public final String mo18156() {
        String str = this.f40106;
        return str == null ? "" : str;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo18155() {
        return this.f40103;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo18152() {
        return this.f40105;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo18157() {
        return this.f40104;
    }

    @Override // l.InterfaceC8697
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo18151() {
        return this.f40101;
    }

    @Override // l.AbstractC11154, l.InterfaceC8697
    public final Iterable values() {
        return this.f40102;
    }
}
