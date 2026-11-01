package l;

import java.util.List;
import java.util.Vector;

/* JADX INFO: renamed from: l.ܶᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15407 implements InterfaceC15241 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18934 f50226;

    public C15407(C18934 c18934) {
        this.f50226 = c18934;
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25907(Object obj) {
        return ((C14199) obj).m34299();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ܰ */
    public final String mo25908(Object obj) {
        return ((C14199) obj).m34298();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ */
    public final List mo25906(String str) {
        String strM28608 = AbstractC11462.m28608(str);
        C18934 c18934 = this.f50226;
        C4670 c4670M43614 = C18934.m43614(c18934);
        try {
            Vector<C14199> vectorM12926 = c4670M43614.m12926(strM28608);
            if (c18934.f61254 == null && vectorM12926.size() > 0) {
                C18934.m43613(c18934, c4670M43614, vectorM12926, strM28608);
            }
            for (C14199 c14199 : vectorM12926) {
                if (c14199.m34293().m13758()) {
                    String strM12932 = c4670M43614.m12932(C6730.m18162(strM28608, c14199.m34298()));
                    c14199.m34294(strM12932);
                    if (!strM12932.startsWith("/")) {
                        strM12932 = C6730.m18162(strM28608, strM12932);
                    }
                    try {
                        c14199.m34295(c4670M43614.m12938(strM12932));
                    } catch (C12019 e) {
                        int i = e.f40261;
                        if (i == 2) {
                            continue;
                        } else if (i != 10) {
                            throw e;
                        }
                    }
                }
            }
            C12563.m31270(c4670M43614);
            return vectorM12926;
        } catch (Throwable th) {
            C12563.m31270(c4670M43614);
            throw th;
        }
    }
}
