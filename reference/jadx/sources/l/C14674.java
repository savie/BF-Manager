package l;

import java.util.Date;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ܰܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14674 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutItem m35303(InterfaceC21388 interfaceC21388, int i, OutItemFactory outItemFactory) {
        OutItem outItem = (OutItem) outItemFactory.createOutItem();
        C18404 c18404Mo2402 = interfaceC21388.mo2402(i);
        String str = c18404Mo2402.f59962;
        if (str.endsWith("/")) {
            outItem.setPropertyIsDir(Boolean.TRUE);
        } else {
            outItem.setDataSize(Long.valueOf(c18404Mo2402.f59961));
        }
        outItem.setPropertyLastModificationTime(new Date(c18404Mo2402.f59964));
        outItem.setPropertyPath(str);
        String str2 = c18404Mo2402.f59963;
        if (str2 != null) {
            outItem.setPropertySymLink(str2);
        }
        return outItem;
    }
}
