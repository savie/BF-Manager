package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K56X */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18901 extends AbstractC22081 implements InterfaceC13851 {
    public String getSignature() {
        InterfaceC7886 interfaceC7886;
        InterfaceC13062 interfaceC13062;
        Iterator it = getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                interfaceC7886 = null;
                break;
            }
            interfaceC7886 = (InterfaceC7886) it.next();
        } while (!interfaceC7886.getType().equals("Ldalvik/annotation/Signature;"));
        if (interfaceC7886 != null) {
            Iterator it2 = interfaceC7886.getElements().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    interfaceC13062 = null;
                    break;
                }
                InterfaceC19073 interfaceC19073 = (InterfaceC19073) it2.next();
                if (interfaceC19073.getName().equals(b.d)) {
                    InterfaceC16791 value = interfaceC19073.getValue();
                    if (value.mo5414() == 28) {
                        interfaceC13062 = (InterfaceC13062) value;
                        break;
                    }
                }
            }
            if (interfaceC13062 != null) {
                StringBuilder sb = new StringBuilder();
                for (InterfaceC16791 interfaceC16791 : interfaceC13062.getValue()) {
                    if (interfaceC16791.mo5414() == 23) {
                        sb.append(((InterfaceC14553) interfaceC16791).getValue());
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }
}
