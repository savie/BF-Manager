package org.bouncycastle.asn1.bc;

import android.widget.TextView;
import java.util.TreeMap;
import l.InterfaceC10523;
import l.InterfaceC19795;
import l.InterfaceC19992;
import l.InterfaceC22615;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExternalValue$$ExternalSyntheticOutline0 implements InterfaceC19795, InterfaceC10523, InterfaceC22615 {
    public final /* synthetic */ int $r8$classId;

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static void m(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
    }

    public static byte[] m(ASN1Sequence aSN1Sequence, int i) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets();
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new TreeMap();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.$r8$classId) {
            case 2:
                interfaceC19992.getClass();
                break;
            default:
                interfaceC19992.getClass();
                break;
        }
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
