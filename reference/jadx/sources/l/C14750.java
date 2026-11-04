package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C14750 extends EnumC15717 {
    public /* synthetic */ C14750() {
        this("InTableText", 9);
    }

    public C14750(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.f2843 == EnumC9750.Character) {
            C3785 c3785 = (C3785) abstractC0802;
            if (c3785.m12293().equals(EnumC15717.f51068)) {
                c4310.m13755(this);
                return false;
            }
            ((ArrayList) c4310.m13780()).add(c3785.m12293());
            return true;
        }
        if (((ArrayList) c4310.m13780()).size() > 0) {
            for (String str : (ArrayList) c4310.m13780()) {
                if (!EnumC15717.m37585(str)) {
                    c4310.m13755(this);
                    if (C0669.m2903(c4310.m20060().m37100(), C17209.f56085)) {
                        c4310.m13766(true);
                        C3785 c3786 = new C3785();
                        c3786.m12294(str);
                        c4310.m13749(c3786, EnumC15717.f51053);
                        c4310.m13766(false);
                    } else {
                        C3785 c3787 = new C3785();
                        c3787.m12294(str);
                        c4310.m13749(c3787, EnumC15717.f51053);
                    }
                } else {
                    C3785 c3788 = new C3785();
                    c3788.m12294(str);
                    c4310.m13750(c3788);
                }
            }
            c4310.m13743();
        }
        c4310.m13765(c4310.m13788());
        return c4310.mo13758(abstractC0802);
    }
}
