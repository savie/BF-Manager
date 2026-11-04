package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19650 extends AbstractC14428 {
    public C19650(AbstractC21142 abstractC21142) {
        super(abstractC21142);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45299(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Server name must not be null");
        }
        if (!str.startsWith("\\\\")) {
            str = "\\\\".concat(str);
        }
        C24126 c24126 = new C24126();
        c24126.m12846(str);
        C10699 c10699 = new C10699(this, c24126);
        c10699.m51010();
        return c10699.m51011();
    }
}
