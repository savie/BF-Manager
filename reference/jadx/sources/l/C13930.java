package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13930 extends C23805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f45871 = new ArrayList(5);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC11959 f45872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f45873;

    public C13930(String str, EnumC11959 enumC11959) {
        this.f45873 = str;
        this.f45872 = enumC11959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33768(C23805 c23805, String str, Object obj) {
        if (obj instanceof Object[]) {
            C23805 c23805Mo10239 = c23805.mo10239(str);
            if (c23805Mo10239 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m33768(c23805Mo10239, (String) null, obj2);
                }
                c23805Mo10239.mo6599();
                return;
            }
            return;
        }
        if (obj instanceof C13930) {
            C13930 c13930 = (C13930) obj;
            C23805 c23805Mo10240 = c23805.mo10240(str, c13930.f45873);
            if (c23805Mo10240 != null) {
                for (C4756 c4756 : c13930.f45871) {
                    m33768(c23805Mo10240, c4756.f16752, c4756.f16753);
                }
                c23805Mo10240.mo6599();
                return;
            }
            return;
        }
        if (obj instanceof C9449) {
            C9449 c9449 = (C9449) obj;
            c23805.mo10242(str, c9449.m24203(), c9449.m24202());
        } else {
            c23805.mo10241(obj, str);
        }
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ */
    public final void mo10241(Object obj, String str) {
        this.f45871.add(new C4756(str, obj));
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ */
    public final C23805 mo10240(String str, String str2) {
        C13930 c13930 = new C13930(str2, EnumC11959.RUNTIME);
        this.f45871.add(new C4756(str, c13930));
        return c13930;
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ */
    public final C23805 mo10239(String str) {
        return new C2079(this, str);
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ */
    public final void mo10242(String str, String str2, String str3) {
        this.f45871.add(new C4756(str, new C9449(str2, str3, str2)));
    }
}
