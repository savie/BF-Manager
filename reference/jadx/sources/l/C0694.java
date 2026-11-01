package l;

import java.util.Date;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.֡᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0694 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutItem m3081(InterfaceC16923 interfaceC16923, int i, OutItemFactory outItemFactory) {
        OutItem outItem = (OutItem) outItemFactory.createOutItem();
        C12690 c12690Mo17105 = interfaceC16923.mo17105(i);
        String str = c12690Mo17105.f42364;
        if (str.endsWith("/")) {
            outItem.setPropertyIsDir(Boolean.TRUE);
        } else {
            outItem.setDataSize(Long.valueOf(c12690Mo17105.f42363));
        }
        outItem.setPropertyLastModificationTime(new Date(c12690Mo17105.f42362));
        outItem.setPropertyPath(str);
        String str2 = c12690Mo17105.f42365;
        if (str2 != null) {
            outItem.setPropertySymLink(str2);
        }
        return outItem;
    }
}
