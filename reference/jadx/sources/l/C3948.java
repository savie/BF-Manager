package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948 extends C14534 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6771 f14680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948(C6771 c6771, C11992 c11992, InterfaceC3710 interfaceC3710) {
        super(c11992, interfaceC3710);
        this.f14680 = c6771;
    }

    @Override // l.C14534, l.InterfaceC3710
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC6533 interfaceC6533 = (InterfaceC6533) arrayList.get(i);
            if (interfaceC6533.getName().equals(b.d) && interfaceC6533.getValue().mo2656() == 28) {
                List value = ((InterfaceC0390) interfaceC6533.getValue()).getValue();
                ArrayList arrayList2 = new ArrayList(value.size());
                for (int i2 = 0; i2 < value.size(); i2++) {
                    String value2 = ((InterfaceC5060) ((InterfaceC10975) value.get(i2))).getValue();
                    if (value2.startsWith("L")) {
                        boolean zEndsWith = value2.endsWith(l.b);
                        C6771 c6771 = this.f14680;
                        if (zEndsWith) {
                            value2 = C6771.m18367(c6771, value2);
                        } else if (value2.endsWith("<")) {
                            String strM18367 = C6771.m18367(c6771, value2.substring(0, value2.length() - 1) + l.b);
                            value2 = strM18367.substring(0, strM18367.length() - 1) + "<";
                        } else if (i2 < value.size() - 1 && ((InterfaceC5060) value.get(i2 + 1)).getValue().startsWith("<")) {
                            value2 = C20630.m46498(1, 0, C6771.m18367(c6771, value2.concat(l.b)));
                        }
                    }
                    arrayList2.add(new C13828(value2));
                }
                arrayList.set(i, new C13122(interfaceC6533.getName(), new C1126(arrayList2)));
            }
        }
        return C6771.m18357(arrayList);
    }
}
