package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8MK */
/* JADX INFO: loaded from: classes.dex */
public final class C23864 {
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52591(InterfaceC9753 interfaceC9753, C4128 c4128, InterfaceC1008 interfaceC1008) {
        int iMo15244;
        boolean z;
        long j = c4128.f15127;
        if (j == -9223372036854775807L) {
            iMo15244 = 0;
        } else {
            iMo15244 = interfaceC9753.mo15244(j);
            if (iMo15244 == -1) {
                iMo15244 = interfaceC9753.mo15243();
            }
            if (iMo15244 > 0 && interfaceC9753.mo15245(iMo15244 - 1) == j) {
                iMo15244--;
            }
        }
        if (j == -9223372036854775807L || iMo15244 >= interfaceC9753.mo15243()) {
            z = false;
        } else {
            List listMo15247 = interfaceC9753.mo15247(j);
            long jMo15245 = interfaceC9753.mo15245(iMo15244);
            if (listMo15247.isEmpty()) {
                z = false;
            } else {
                long j2 = c4128.f15127;
                if (j2 < jMo15245) {
                    interfaceC1008.accept(new C17513(j2, jMo15245 - j2, listMo15247));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iMo15244; i < interfaceC9753.mo15243(); i++) {
            m52590(interfaceC9753, i, interfaceC1008);
        }
        if (c4128.f15126) {
            if (z) {
                iMo15244--;
            }
            for (int i2 = 0; i2 < iMo15244; i2++) {
                m52590(interfaceC9753, i2, interfaceC1008);
            }
            if (z) {
                interfaceC1008.accept(new C17513(interfaceC9753.mo15245(iMo15244), j - interfaceC9753.mo15245(iMo15244), interfaceC9753.mo15247(j)));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52590(InterfaceC9753 interfaceC9753, int i, InterfaceC1008 interfaceC1008) {
        long jMo15245 = interfaceC9753.mo15245(i);
        List listMo15247 = interfaceC9753.mo15247(jMo15245);
        if (listMo15247.isEmpty()) {
            return;
        }
        if (i == interfaceC9753.mo15243() - 1) {
            throw new IllegalStateException();
        }
        long jMo15246 = interfaceC9753.mo15245(i + 1) - interfaceC9753.mo15245(i);
        if (jMo15246 > 0) {
            interfaceC1008.accept(new C17513(jMo15245, jMo15246, listMo15247));
        }
    }
}
