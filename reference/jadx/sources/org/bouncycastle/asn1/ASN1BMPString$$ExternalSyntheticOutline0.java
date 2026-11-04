package org.bouncycastle.asn1;

import android.widget.TextView;
import java.util.LinkedHashMap;
import l.InterfaceC10523;
import l.InterfaceC19795;
import l.InterfaceC19992;
import l.InterfaceC22615;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ASN1BMPString$$ExternalSyntheticOutline0 implements InterfaceC19795, InterfaceC10523, InterfaceC22615 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ASN1BMPString$$ExternalSyntheticOutline0(int i) {
        this.$r8$classId = i;
    }

    public static String m(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new LinkedHashMap();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.$r8$classId) {
            case 1:
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
