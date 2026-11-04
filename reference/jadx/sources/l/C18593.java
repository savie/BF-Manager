package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: l.ܿ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAY3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0459 f60391;

    static {
        Object next;
        String strM34276 = C14117.m34276("kotlinx.coroutines.fast.service.loader");
        if (strM34276 != null) {
            Boolean.parseBoolean(strM34276);
        }
        try {
            try {
                Iterator it = Arrays.asList(new C14628()).iterator();
                C15243.m36590(it, "<this>");
                Iterator it2 = C16539.m39176(new C22507(new C3115(it))).iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        ((InterfaceC21577) next).getClass();
                        do {
                            ((InterfaceC21577) it2.next()).getClass();
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                InterfaceC21577 interfaceC21577 = (InterfaceC21577) next;
                if (interfaceC21577 != null) {
                    f60391 = interfaceC21577.mo35266();
                } else {
                    C0694.m3001(3, null);
                    throw null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            C0694.m3001(2, th2);
            throw null;
        }
    }
}
