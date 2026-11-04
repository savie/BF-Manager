package l;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.᩻᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VI */
/* JADX INFO: loaded from: classes.dex */
public class C25310 extends C5172 {
    @Override // l.C5172
    /* JADX INFO: renamed from: ۙ */
    public void mo15602(C8900 c8900, AbstractC15037 abstractC15037, C13617 c13617) {
        AbstractC15037 abstractC15037M30587 = C12250.m30587(abstractC15037);
        int i = c8900.f29080;
        C3177 c3177 = c8900.f29084;
        C3279 c3279 = new C3279(i, c3177.m10374(), c3177.m10370());
        try {
            super.mo15602(c8900, c3279, c13617);
            c3279.m10803(abstractC15037);
            if (abstractC15037M30587 != null) {
                try {
                    C12250.m30590(abstractC15037M30587);
                } catch (Exception e) {
                    c3279.f10670.clear();
                    c3279.f10671.clear();
                    StringWriter stringWriter = new StringWriter();
                    stringWriter.append((CharSequence) "d2j fail translate: ");
                    e.printStackTrace(new PrintWriter(stringWriter));
                    String string = stringWriter.toString();
                    c3279.mo10808(187, "java/lang/RuntimeException");
                    c3279.mo10787(89);
                    c3279.mo10795(string);
                    c3279.m36198("java/lang/RuntimeException", 183, "<init>", "(Ljava/lang/String;)V");
                    c3279.mo10787(191);
                    C12250.m30589(abstractC15037M30587, c3279);
                }
            }
        } catch (Exception e2) {
            throw new C16601(e2, "Failed to convert code for %s", c3177);
        }
    }
}
