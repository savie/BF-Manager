package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 05YL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3490 extends C23805 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f12798 = new ArrayList();

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10241(Object obj, String str) {
        this.f12798.add(obj);
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23805 mo10240(String str, String str2) {
        C13930 c13930 = new C13930(str2, EnumC11959.RUNTIME);
        this.f12798.add(c13930);
        return c13930;
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23805 mo10239(String str) {
        return new C9842(this);
    }

    @Override // l.C23805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10242(String str, String str2, String str3) {
        this.f12798.add(new C9449(null, str3, str2));
    }
}
