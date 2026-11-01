package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ᩳ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QAY3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18381 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15747 f58625;

    static {
        Object next;
        String strM38431 = C16265.m38431("kotlinx.coroutines.fast.service.loader");
        if (strM38431 != null) {
            Boolean.parseBoolean(strM38431);
        }
        try {
            try {
                Iterator it = Arrays.asList(new C10102()).iterator();
                C13465.m32966(it, "<this>");
                Iterator it2 = C4061.m11591(new C2880(new C21701(it))).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        ((InterfaceC21909) next).getClass();
                        do {
                            ((InterfaceC21909) it2.next()).getClass();
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                InterfaceC21909 interfaceC21909 = (InterfaceC21909) next;
                if (interfaceC21909 != null) {
                    f58625 = interfaceC21909.mo25709();
                } else {
                    C19087.m43863(3, null);
                    throw null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            C19087.m43863(2, th2);
            throw null;
        }
    }
}
