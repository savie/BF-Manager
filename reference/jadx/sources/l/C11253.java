package l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۧ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VI */
/* JADX INFO: loaded from: classes4.dex */
public class C11253 extends C10548 {
    @Override // l.C10548
    /* JADX INFO: renamed from: ۙ */
    public void mo26699(C8285 c8285, AbstractC20521 abstractC20521, C9137 c9137) {
        AbstractC20521 abstractC20521M12092 = C4292.m12092(abstractC20521);
        int i = c8285.f28775;
        C3097 c3097 = c8285.f28776;
        C14647 c14647 = new C14647(i, c3097.m9295(), c3097.m9292());
        try {
            super.mo26699(c8285, c14647, c9137);
            c14647.m35168(abstractC20521);
            if (abstractC20521M12092 != null) {
                try {
                    C4292.m12095(abstractC20521M12092);
                } catch (Exception e) {
                    c14647.f47900.clear();
                    c14647.f47898.clear();
                    StringWriter stringWriter = new StringWriter();
                    stringWriter.append((CharSequence) "d2j fail translate: ");
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String string = stringWriter.toString();
                    c14647.mo33790(187, "java/lang/RuntimeException");
                    c14647.mo35159(89);
                    c14647.mo8457(string);
                    c14647.m46308("java/lang/RuntimeException", 183, "<init>", "(Ljava/lang/String;)V");
                    c14647.mo35159(191);
                    C4292.m12094(abstractC20521M12092, c14647);
                }
            }
        } catch (Exception e2) {
            throw new C23560(e2, "Failed to convert code for %s", c3097);
        }
    }
}
