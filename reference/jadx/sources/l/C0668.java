package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes2.dex */
public final class C0668 extends C8410 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11253 f2808;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18162 f2809;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15487 f2810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f2811;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8516 f2812;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668(C18162 c18162, C18162 c18163, C11253 c11253, InterfaceC15487 interfaceC15487, C8516 c8516) {
        super(c18162);
        this.f2809 = c18163;
        this.f2808 = c11253;
        this.f2810 = interfaceC15487;
        this.f2812 = c8516;
    }

    @Override // l.C8410
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11813 mo2996(String str, String str2, String[] strArr, int i) {
        C18162 c18162 = this.f2809;
        ArrayList arrayList = c18162.f58052;
        if (arrayList.size() >= 1000) {
            String str3 = this.f2811;
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != str.lastIndexOf(47)) {
                this.f2808.m26703(c18162, this.f2810, this.f2812);
                arrayList.clear();
                break;
            }
            for (int i2 = 0; i2 < iLastIndexOf; i2++) {
                if (str.charAt(i2) != str3.charAt(i2)) {
                    this.f2808.m26703(c18162, this.f2810, this.f2812);
                    arrayList.clear();
                    break;
                }
            }
        }
        this.f2811 = str;
        return super.mo2996(str, str2, strArr, i);
    }

    @Override // l.C8410
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2997() {
        C18162 c18162 = this.f2809;
        ArrayList arrayList = c18162.f58052;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f2808.m26703(c18162, this.f2810, this.f2812);
        arrayList.clear();
    }
}
