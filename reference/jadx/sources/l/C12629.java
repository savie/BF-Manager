package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12629 extends C1709 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f40535 = new ArrayList(5);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC6161 f40536;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f40537;

    public C12629(String str, EnumC6161 enumC6161) {
        this.f40537 = str;
        this.f40536 = enumC6161;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31395(C1709 c1709, String str, Object obj) {
        if (obj instanceof Object[]) {
            C1709 c1709Mo6075 = c1709.mo6075(str);
            if (c1709Mo6075 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m31395(c1709Mo6075, (String) null, obj2);
                }
                c1709Mo6075.mo6077();
                return;
            }
            return;
        }
        if (obj instanceof C12629) {
            C12629 c12629 = (C12629) obj;
            C1709 c1709Mo6076 = c1709.mo6076(str, c12629.f40537);
            if (c1709Mo6076 != null) {
                for (C20834 c20834 : c12629.f40535) {
                    m31395(c1709Mo6076, c20834.f66712, c20834.f66713);
                }
                c1709Mo6076.mo6077();
                return;
            }
            return;
        }
        if (obj instanceof C23315) {
            C23315 c23315 = (C23315) obj;
            c1709.mo6079(str, c23315.m52461(), c23315.m52460());
        } else {
            c1709.mo6078(obj, str);
        }
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6078(Object obj, String str) {
        this.f40535.add(new C20834(str, obj));
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final C1709 mo6076(String str, String str2) {
        C12629 c12629 = new C12629(str2, EnumC6161.RUNTIME);
        this.f40535.add(new C20834(str, c12629));
        return c12629;
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final C1709 mo6075(String str) {
        return new C16358(this, str);
    }

    @Override // l.C1709
    /* JADX INFO: renamed from: ۙ */
    public final void mo6079(String str, String str2, String str3) {
        this.f40535.add(new C20834(str, new C23315(str2, str3, str2)));
    }
}
