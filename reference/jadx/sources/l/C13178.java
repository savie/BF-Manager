package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13178 extends C10194 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5721 f42109;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13178(C5721 c5721, C24404 c24404, InterfaceC7886 interfaceC7886) {
        super(c24404, interfaceC7886);
        this.f42109 = c5721;
    }

    @Override // l.C10194, l.InterfaceC7886
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC19073 interfaceC19073 = (InterfaceC19073) arrayList.get(i);
            if (interfaceC19073.getName().equals(b.d) && interfaceC19073.getValue().mo5414() == 28) {
                List value = ((InterfaceC13062) interfaceC19073.getValue()).getValue();
                ArrayList arrayList2 = new ArrayList(value.size());
                for (int i2 = 0; i2 < value.size(); i2++) {
                    String value2 = ((InterfaceC14553) ((InterfaceC16791) value.get(i2))).getValue();
                    if (value2.startsWith("L")) {
                        boolean zEndsWith = value2.endsWith(l.b);
                        C5721 c5721 = this.f42109;
                        if (zEndsWith) {
                            value2 = C5721.m16775(c5721, value2);
                        } else if (value2.endsWith("<")) {
                            String strM16775 = C5721.m16775(c5721, value2.substring(0, value2.length() - 1) + l.b);
                            value2 = strM16775.substring(0, strM16775.length() - 1) + "<";
                        } else if (i2 < value.size() - 1 && ((InterfaceC14553) value.get(i2 + 1)).getValue().startsWith("<")) {
                            value2 = C1402.m5124(1, 0, C5721.m16775(c5721, value2.concat(l.b)));
                        }
                    }
                    arrayList2.add(new C14055(value2));
                }
                arrayList.set(i, new C15415(interfaceC19073.getName(), new C19891(arrayList2)));
            }
        }
        return C5721.m16765(arrayList);
    }
}
