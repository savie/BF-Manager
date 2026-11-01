package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12310 extends AbstractC3882 {
    public C12310(AbstractC6705 abstractC6705) {
        super(abstractC6705);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30572(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Server name must not be null");
        }
        if (!str.startsWith("\\\\")) {
            str = "\\\\".concat(str);
        }
        C1060 c1060 = new C1060();
        c1060.m32256(str);
        C0314 c0314 = new C0314(this, c1060);
        c0314.m38945();
        return c0314.m38946();
    }
}
