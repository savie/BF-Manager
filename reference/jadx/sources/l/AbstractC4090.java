package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K56X */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4090 extends AbstractC9031 implements InterfaceC19234 {
    @Override // l.InterfaceC19234, l.InterfaceC19940
    public String getSignature() {
        InterfaceC3710 interfaceC3710;
        InterfaceC0390 interfaceC0390;
        Iterator it = getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                interfaceC3710 = null;
                break;
            }
            interfaceC3710 = (InterfaceC3710) it.next();
        } while (!interfaceC3710.getType().equals("Ldalvik/annotation/Signature;"));
        if (interfaceC3710 != null) {
            Iterator it2 = interfaceC3710.getElements().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    interfaceC0390 = null;
                    break;
                }
                InterfaceC6533 interfaceC6533 = (InterfaceC6533) it2.next();
                if (interfaceC6533.getName().equals(b.d)) {
                    InterfaceC10975 value = interfaceC6533.getValue();
                    if (value.mo2656() == 28) {
                        interfaceC0390 = (InterfaceC0390) value;
                        break;
                    }
                }
            }
            if (interfaceC0390 != null) {
                StringBuilder sb = new StringBuilder();
                for (InterfaceC10975 interfaceC10975 : interfaceC0390.getValue()) {
                    if (interfaceC10975.mo2656() == 23) {
                        sb.append(((InterfaceC5060) interfaceC10975).getValue());
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }
}
