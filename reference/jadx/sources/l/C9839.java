package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9839 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f31670;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885[] f31671;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f31672;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31673;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    public C9839(ArrayList arrayList, int i) {
        int size = arrayList.size();
        this.f31671 = new InterfaceC2885[size];
        this.f31672 = new int[size];
        this.f31670 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            C18790 c18790 = (C18790) arrayList.get(i2);
            this.f31671[i2] = c18790.f61019;
            this.f31672[i2] = c18790.f61020;
            this.f31670[i2] = c18790.f61018;
        }
        this.f31673 = i;
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        int i2 = this.f31673;
        while (i2 >= 0) {
            i2 = this.f31671[i2].mo1303(i) ? this.f31672[i2] : this.f31670[i2];
        }
        return i2 == -1;
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
