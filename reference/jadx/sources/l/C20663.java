package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20663 {
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47290(InterfaceC24393 interfaceC24393, C9474 c9474, InterfaceC8103 interfaceC8103) {
        int iMo21768;
        boolean z;
        long j = c9474.f30699;
        if (j == -9223372036854775807L) {
            iMo21768 = 0;
        } else {
            iMo21768 = interfaceC24393.mo21768(j);
            if (iMo21768 == -1) {
                iMo21768 = interfaceC24393.mo21767();
            }
            if (iMo21768 > 0 && interfaceC24393.mo21769(iMo21768 - 1) == j) {
                iMo21768--;
            }
        }
        if (j == -9223372036854775807L || iMo21768 >= interfaceC24393.mo21767()) {
            z = false;
        } else {
            List listMo21771 = interfaceC24393.mo21771(j);
            long jMo21769 = interfaceC24393.mo21769(iMo21768);
            if (listMo21771.isEmpty()) {
                z = false;
            } else {
                long j2 = c9474.f30699;
                if (j2 < jMo21769) {
                    interfaceC8103.accept(new C16187(j2, jMo21769 - j2, listMo21771));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo21768; i < interfaceC24393.mo21767(); i++) {
            m47289(interfaceC24393, i, interfaceC8103);
        }
        if (c9474.f30698) {
            if (z) {
                iMo21768--;
            }
            for (int i2 = 0; i2 < iMo21768; i2++) {
                m47289(interfaceC24393, i2, interfaceC8103);
            }
            if (z) {
                interfaceC8103.accept(new C16187(interfaceC24393.mo21769(iMo21768), j - interfaceC24393.mo21769(iMo21768), interfaceC24393.mo21771(j)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47289(InterfaceC24393 interfaceC24393, int i, InterfaceC8103 interfaceC8103) {
        long jMo21769 = interfaceC24393.mo21769(i);
        List listMo21771 = interfaceC24393.mo21771(jMo21769);
        if (listMo21771.isEmpty()) {
            return;
        }
        if (i == interfaceC24393.mo21767() - 1) {
            throw new IllegalStateException();
        }
        long jMo217610 = interfaceC24393.mo21769(i + 1) - interfaceC24393.mo21769(i);
        if (jMo217610 > 0) {
            interfaceC8103.accept(new C16187(jMo21769, jMo217610, listMo21771));
        }
    }
}
