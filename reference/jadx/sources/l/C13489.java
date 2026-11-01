package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13489 implements InterfaceC23988 {
    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6812(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        c18551.m42946(true);
        Iterator itM21773 = C8340.m21773(c8340, "item");
        while (itM21773.hasNext()) {
            C8340 c8341 = (C8340) itM21773.next();
            C18923 c18923M21786 = c8341.m21786("quantity");
            String strM43586 = c18923M21786.m43586();
            int iIndexOf = Arrays.asList(InterfaceC9961.f34034).indexOf(strM43586);
            if (iIndexOf == -1) {
                throw new C4811(C0252.m1693("Unknown quantity: ", strM43586), c18923M21786);
            }
            int i = iIndexOf + 16777220;
            if (c8341.m21789()) {
                String strM26418 = c8341.m21784().m26418();
                if (strM26418.startsWith("@")) {
                    C14816.m35487(c18551, c8341, c11288, true).m38685(i);
                } else if (strM26418.startsWith("?")) {
                    C14816.m35488(c18551, c11288, c8341).m38685(i);
                }
            }
            C14816.m35494(c18551, c11288, c8341).m38685(i);
        }
    }
}
