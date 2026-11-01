package l;

import java.util.List;

/* JADX INFO: renamed from: l.۫ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12117 extends AbstractC18202 implements InterfaceC5766 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f40573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40574;

    public C12117(String str, List list) {
        this.f40573 = C1532.m5304(list);
        this.f40574 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12117 m30157(InterfaceC19441 interfaceC19441) {
        if (interfaceC19441 instanceof C12117) {
            return (C12117) interfaceC19441;
        }
        return new C12117(interfaceC19441.mo1995(), interfaceC19441.mo1999());
    }

    @Override // l.InterfaceC19441
    /* JADX INFO: renamed from: ᩳ */
    public final List mo1999() {
        return this.f40573;
    }

    @Override // l.InterfaceC19441
    /* JADX INFO: renamed from: ۖ */
    public final String mo1995() {
        return this.f40574;
    }
}
