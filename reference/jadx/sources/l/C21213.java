package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U8WA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21213 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48371(boolean z, List list, InterfaceC1181 interfaceC1181) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8966 interfaceC8966 = (InterfaceC8966) it.next();
            int iMo9797 = interfaceC8966.mo9797(z);
            int iMo9799 = interfaceC8966.mo9799(z);
            if (iMo9797 != iMo9799 || iMo9797 != interfaceC1181.length()) {
                int iLastIndexOf = interfaceC1181.lastIndexOf('\n', 0, iMo9797) + 1;
                if (iLastIndexOf != iMo9797) {
                    interfaceC8966.mo9806(iLastIndexOf, z);
                    m48372(z, interfaceC8966, iMo9797 - iLastIndexOf);
                }
                if (interfaceC8966.mo20529(z) != interfaceC8966.mo20530(z)) {
                    int iIndexOf = interfaceC1181.indexOf('\n', iMo9799 - 1, interfaceC1181.length());
                    iLastIndexOf = iIndexOf == -1 ? interfaceC1181.length() : iIndexOf + 1;
                }
                if (iMo9799 != iLastIndexOf) {
                    interfaceC8966.mo9808(iLastIndexOf, z);
                }
            }
        }
        Iterator it2 = list.iterator();
        InterfaceC8966 interfaceC8967 = null;
        while (it2.hasNext()) {
            InterfaceC8966 interfaceC8968 = (InterfaceC8966) it2.next();
            if (interfaceC8967 != null && interfaceC8967.mo9799(z) >= interfaceC8968.mo9797(z)) {
                int i = 0;
                while (i < 2) {
                    boolean z2 = i == 0;
                    int iMo9798 = interfaceC8967.mo9797(z2);
                    int iMo97910 = interfaceC8968.mo9797(z2);
                    if (iMo9798 < iMo97910) {
                        interfaceC8968.mo9806(iMo9798, z2);
                        m48372(z2, interfaceC8968, iMo97910 - iMo9798);
                    }
                    int iMo97911 = interfaceC8967.mo9799(z2);
                    int iMo97912 = interfaceC8968.mo9799(z2);
                    if (iMo97911 < iMo97912) {
                        interfaceC8967.mo9808(iMo97912, z2);
                    }
                    int iMo20530 = interfaceC8967.mo20530(z2);
                    int iMo20531 = interfaceC8968.mo20530(z2);
                    if (iMo20530 < iMo20531) {
                        interfaceC8967.mo20520(iMo20531, z2);
                    }
                    i++;
                }
                List listMo20527 = interfaceC8967.mo20527();
                List listMo20528 = interfaceC8968.mo20527();
                if (listMo20528 != null) {
                    if (listMo20527 == null) {
                        listMo20527 = new ArrayList();
                    }
                    listMo20527.addAll(listMo20528);
                }
                interfaceC8967.mo20521(listMo20527);
                it2.remove();
            } else {
                interfaceC8967 = interfaceC8968;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48372(boolean z, InterfaceC8966 interfaceC8966, int i) {
        List<InterfaceC9711> listMo20527 = interfaceC8966.mo20527();
        if (listMo20527 != null) {
            for (InterfaceC9711 interfaceC9711 : listMo20527) {
                if (z) {
                    interfaceC9711.mo9804(interfaceC9711.mo9807() + i);
                    interfaceC9711.mo9800(interfaceC9711.mo9796() + i);
                } else {
                    interfaceC9711.mo9802(interfaceC9711.mo9803() + i);
                    interfaceC9711.mo9805(interfaceC9711.mo9801() + i);
                }
            }
        }
    }
}
