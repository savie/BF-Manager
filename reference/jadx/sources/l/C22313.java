package l;

import android.os.Message;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22313 implements InterfaceC19795, InterfaceC16369, InterfaceC6836, InterfaceC5417, InterfaceC20390 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m50375(long j) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 16);
        }
        int i = 64;
        char[] cArr = new char[64];
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
        do {
            i--;
            cArr[i] = Character.forDigit(((int) j) & 15, 16);
            j >>>= iNumberOfTrailingZeros;
        } while (j != 0);
        return new String(cArr, i, 64 - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50377(String str, String str2) {
        C1896.m6517(str + str2);
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return ((Iterable) obj).iterator();
    }

    @Override // l.InterfaceC20390
    public String apply(EnumC19644 enumC19644, String str, String str2) {
        return EnumC15914.m37945(enumC19644, str, str2);
    }

    @Override // l.InterfaceC6836
    /* JADX INFO: renamed from: ۙ */
    public void mo14768(Object obj, Message message) {
        C11870.m29733((C11870) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m50373(int i, String str) {
        return str.charAt(str.length() - i);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC16369
    /* JADX INFO: renamed from: ۙ */
    public String mo16748(C25368 c25368) throws IOException {
        String str = c25368.f81911;
        if (str != null) {
            return str;
        }
        throw new IOException("HLS thumbnail cache key is missing");
    }
}
