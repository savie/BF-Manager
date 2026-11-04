package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3680 extends C1709 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f12655 = new ArrayList();

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6078(Object obj, String str) {
        this.f12655.add(obj);
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final C1709 mo6076(String str, String str2) {
        C12629 c12629 = new C12629(str2, EnumC6161.RUNTIME);
        this.f12655.add(c12629);
        return c12629;
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final C1709 mo6075(String str) {
        return new C23818(this);
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6079(String str, String str2, String str3) {
        this.f12655.add(new C23315(null, str3, str2));
    }
}
