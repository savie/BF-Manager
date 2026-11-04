package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15612 extends C8571 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9888 f50729;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3374 f50730;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9645 f50731;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f50732;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25310 f50733;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15612(C9645 c9645, C9645 c9646, C25310 c25310, InterfaceC9888 interfaceC9888, C3374 c3374) {
        super(c9645);
        this.f50731 = c9646;
        this.f50733 = c25310;
        this.f50729 = interfaceC9888;
        this.f50730 = c3374;
    }

    @Override // l.C8571
    /* JADX INFO: renamed from: ۙ */
    public final C6664 mo23021(String str, String str2, String[] strArr, int i) {
        C9645 c9645 = this.f50731;
        ArrayList arrayList = c9645.f31177;
        if (arrayList.size() >= 1000) {
            String str3 = this.f50732;
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != str.lastIndexOf(47)) {
                this.f50733.m15604(c9645, this.f50729, this.f50730);
                arrayList.clear();
                break;
            }
            for (int i2 = 0; i2 < iLastIndexOf; i2++) {
                if (str.charAt(i2) != str3.charAt(i2)) {
                    this.f50733.m15604(c9645, this.f50729, this.f50730);
                    arrayList.clear();
                    break;
                }
            }
        }
        this.f50732 = str;
        return super.mo23021(str, str2, strArr, i);
    }

    @Override // l.C8571
    /* JADX INFO: renamed from: ۙ */
    public final void mo23022() {
        C9645 c9645 = this.f50731;
        ArrayList arrayList = c9645.f31177;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f50733.m15604(c9645, this.f50729, this.f50730);
        arrayList.clear();
    }
}
