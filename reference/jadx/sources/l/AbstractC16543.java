package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16543 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53135 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12310 f53136;

    /* JADX INFO: renamed from: ۙ */
    public abstract C10899 mo1945(Long l2);

    public AbstractC16543(C12310 c12310) {
        this.f53136 = c12310;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38946() {
        return this.f53135;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38945() {
        C5294 c5294M12736;
        C2471[] c2471ArrM49353;
        C15319 c15319 = new C15319();
        while (true) {
            C14427 c14427M11257 = this.f53136.m11257(mo1945(c15319.getValue()), EnumC20071.ERROR_MORE_DATA, EnumC20071.ERROR_SUCCESS);
            AbstractC4588 abstractC4588M5737 = c14427M11257.m5737();
            if (abstractC4588M5737 != null && (c5294M12736 = abstractC4588M5737.m12736()) != null && (c2471ArrM49353 = c5294M12736.m49353()) != null) {
                for (C2471 c2471 : c2471ArrM49353) {
                    C11645 c11645 = (C11645) c2471;
                    C17248 c17248 = null;
                    if (c11645 != null) {
                        C1060 c1060M7577 = c11645.m7577();
                        String strM32255 = c1060M7577 == null ? null : c1060M7577.m32255();
                        int iM29099 = c11645.m29099();
                        C1060 c1060M29100 = c11645.m29100();
                        c17248 = new C17248(strM32255, iM29099, c1060M29100 != null ? c1060M29100.m32255() : null);
                    }
                    this.f53135.add(c17248);
                }
            }
            if (EnumC20071.ERROR_SUCCESS.m45438(c14427M11257.m46763())) {
                return;
            }
            Long lM5738 = c14427M11257.m5738();
            if (lM5738 == null) {
                throw new C21317("NetrShareEnum resume handle null.");
            }
            if (lM5738.longValue() == c15319.getValue().longValue()) {
                throw new C21317("NetrShareEnum resume handle not updated.");
            }
            c15319.m36683(lM5738);
        }
    }
}
