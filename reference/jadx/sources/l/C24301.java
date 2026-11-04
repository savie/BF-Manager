package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes.dex */
public final class C24301 implements InterfaceC10939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18333 f78649;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4448 f78650;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f78651;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11071[] f78652;

    @Override // l.InterfaceC4974
    /* JADX INFO: renamed from: ۙ */
    public final C4448 mo5056(C4448 c4448, C20022 c20022) {
        return c4448;
    }

    public C24301(C4448 c4448, C18333 c18333, AbstractC11071[] abstractC11071Arr, ArrayList arrayList) {
        this.f78650 = c4448;
        this.f78649 = c18333;
        this.f78652 = abstractC11071Arr;
        this.f78651 = arrayList;
    }

    @Override // l.InterfaceC22128
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5057(C4448 c4448) {
        if (this.f78650 != c4448) {
            return c4448;
        }
        C20856 c20856 = new C20856(this.f78652, this.f78649.f59801);
        this.f78651.add(c20856);
        return c20856;
    }
}
