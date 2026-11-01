package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9463 implements InterfaceC13717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f32015;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f32016;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13717[] f32017;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f32018;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    public C9463(ArrayList arrayList, int i) {
        int size = arrayList.size();
        this.f32017 = new InterfaceC13717[size];
        this.f32018 = new int[size];
        this.f32016 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            C1700 c1700 = (C1700) arrayList.get(i2);
            this.f32017[i2] = c1700.f6723;
            this.f32018[i2] = c1700.f6724;
            this.f32016[i2] = c1700.f6722;
        }
        this.f32015 = i;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        int i2 = this.f32015;
        while (i2 >= 0) {
            i2 = this.f32017[i2].mo1813(i) ? this.f32018[i2] : this.f32016[i2];
        }
        return i2 == -1;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
