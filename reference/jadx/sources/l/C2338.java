package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2338 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f8273;

    public C2338(int i) {
        byte[] bArr = new byte[i + 1];
        this.f8273 = bArr;
        Arrays.fill(bArr, (byte) 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7092(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) it.next();
            if (interfaceC19761.getType() == 44 || interfaceC19761.getType() == 40) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7094(int i) {
        return (this.f8273[i] & 1) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7096(int i) {
        return (this.f8273[i] & 2) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m7097(int i) {
        return (this.f8273[i] & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7095(C2338 c2338, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC19761 interfaceC19761 = (InterfaceC19761) it.next();
            C18567.m42975();
            if (interfaceC19761.getType() == 44 || interfaceC19761.getType() == 40) {
                int iMo22508 = interfaceC19761.mo22508();
                if (this.f8273[iMo22508] != c2338.f8273[iMo22508]) {
                    return false;
                }
            }
        }
        return true;
    }
}
