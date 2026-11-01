package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩺ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes.dex */
public final class C22789 extends AbstractC15028 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15070 f74172;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f74173;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f74174;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15070 f74175;

    public C22789(C15070 c15070, C15070 c15071, List list, List list2, InterfaceC13409 interfaceC13409, C16936 c16936) {
        super(list.size(), list2.size(), interfaceC13409, c16936);
        this.f74175 = c15070;
        this.f74172 = c15071;
        this.f74174 = list;
        this.f74173 = list2;
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ۙ */
    public final void mo17801(int i, int i2, int i3, int i4) {
        C20464 c20464M30310 = C12206.m30310(this.f74174, this.f74173, i, i3, i2, i4);
        int i5 = c20464M30310.f66401;
        int i6 = c20464M30310.f66400;
        List listSubList = this.f74174.subList(i5, i6);
        int i7 = c20464M30310.f66399;
        int i8 = c20464M30310.f66402;
        InterfaceC13409 interfaceC13409M4943 = C1413.m4943(listSubList, this.f74173.subList(i7, i8), this.f49001);
        C2824 c2824 = this.f48999;
        c2824.m15544(i, i3, i5, i7);
        for (C20464 c20464 : interfaceC13409M4943.mo11889()) {
            int i9 = c20464.f66401;
            c2824.m15540(i5 + i9, c20464.f66399 + i7, c20464.f66400 - i9);
        }
        c2824.m15544(i6, i8, i2, i4);
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ۙ */
    public final C16231 mo17800(int i) {
        int i2 = this.f74175.getInt(i);
        return new C16231(i2, i2 + 1);
    }

    @Override // l.AbstractC15028
    /* JADX INFO: renamed from: ܰ */
    public final C16231 mo17802(int i) {
        int i2 = this.f74172.getInt(i);
        return new C16231(i2, i2 + 1);
    }
}
