package l;

import com.alipay.sdk.m.y.l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V79X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3192 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10508(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045) throws IOException {
        C24975 c24975M55779 = C24975.m55779(abstractC22044.m49865());
        int iM55804 = c24975M55779.m55804();
        ArrayList<C23330> arrayList = new ArrayList(iM55804);
        for (int i = 0; i < iM55804; i++) {
            int iM55784 = c24975M55779.m55784(i);
            arrayList.add(new C23330(null, iM55784, c24975M55779.m55807(i), m10507(c24975M55779.m55809(iM55784))));
        }
        abstractC22045.mo49834();
        DataOutputStream dataOutputStream = new DataOutputStream(abstractC22045.m49869());
        try {
            dataOutputStream.writeInt(1296323657);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(arrayList.size());
            for (C23330 c23330 : arrayList) {
                String str = c23330.f75565;
                int i2 = c23330.f75566;
                dataOutputStream.writeUTF(str);
                int i3 = c23330.f75563;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    throw new IOException("Invalid class def offset");
                }
                if (i2 != 0) {
                    dataOutputStream.writeInt(i3 | Integer.MIN_VALUE);
                    dataOutputStream.writeInt(i2);
                } else {
                    dataOutputStream.writeInt(i3);
                }
            }
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10507(String str) {
        return (str == null || str.length() < 2 || str.charAt(0) != 'L' || C22313.m50373(1, str) != ';') ? str : C1402.m5124(1, 1, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m10509(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str : C14442.m34865("L", str, l.b);
    }
}
