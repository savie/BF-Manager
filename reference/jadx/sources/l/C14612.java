package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f46019;

    public C14612(int i) {
        byte[] bArr = new byte[i + 1];
        this.f46019 = bArr;
        Arrays.fill(bArr, (byte) 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35252(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) it.next();
            if (interfaceC8743.getType() == 44 || interfaceC8743.getType() == 40) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35254(int i) {
        return (this.f46019[i] & 1) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35256(int i) {
        return (this.f46019[i] & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35257(int i) {
        return (this.f46019[i] & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35255(C14612 c14612, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) it.next();
            C7155.m19727();
            if (interfaceC8743.getType() == 44 || interfaceC8743.getType() == 40) {
                int iMo23442 = interfaceC8743.mo23442();
                if (this.f46019[iMo23442] != c14612.f46019[iMo23442]) {
                    return false;
                }
            }
        }
        return true;
    }
}
