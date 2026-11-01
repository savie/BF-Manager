package l;

import com.alipay.sdk.m.y.l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V79X */
/* JADX INFO: loaded from: classes4.dex */
public final class C21966 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48797(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746) throws IOException {
        C17684 c17684M41161 = C17684.m41161(abstractC20745.m46727());
        int iM41201 = c17684M41161.m41201();
        ArrayList<C5032> arrayList = new ArrayList(iM41201);
        for (int i = 0; i < iM41201; i++) {
            int iM41169 = c17684M41161.m41169(i);
            arrayList.add(new C5032(null, iM41169, c17684M41161.m41197(i), m48796(c17684M41161.m41195(iM41169))));
        }
        abstractC20746.mo46720();
        DataOutputStream dataOutputStream = new DataOutputStream(abstractC20746.m46708());
        try {
            dataOutputStream.writeInt(1296323657);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(arrayList.size());
            for (C5032 c5032 : arrayList) {
                String str = c5032.f17548;
                int i2 = c5032.f17545;
                dataOutputStream.writeUTF(str);
                int i3 = c5032.f17546;
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
    public static String m48796(String str) {
        return (str == null || str.length() < 2 || str.charAt(0) != 'L' || C3184.m9601(1, str) != ';') ? str : C20630.m46498(1, 1, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m48798(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str : C16523.m38890("L", str, l.b);
    }
}
