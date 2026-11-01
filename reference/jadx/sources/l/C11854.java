package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11854 implements InterfaceC7600 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7124[] f39770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1269 f39771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2184 f39772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f39773;

    @Override // l.InterfaceC9012
    /* JADX INFO: renamed from: ۙ */
    public final C2184 mo4153(C2184 c2184, C15592 c15592) {
        return c2184;
    }

    public C11854(C2184 c2184, C1269 c1269, AbstractC7124[] abstractC7124Arr, ArrayList arrayList) {
        this.f39772 = c2184;
        this.f39771 = c1269;
        this.f39770 = abstractC7124Arr;
        this.f39773 = arrayList;
    }

    @Override // l.InterfaceC10423
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo4154(C2184 c2184) {
        if (this.f39772 != c2184) {
            return c2184;
        }
        C3469 c3469 = new C3469(this.f39770, this.f39771.f5494);
        this.f39773.add(c3469);
        return c3469;
    }
}
