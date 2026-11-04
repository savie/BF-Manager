package l;

import android.widget.TextView;
import java.util.concurrent.ConcurrentSkipListMap;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8AM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20551 implements InterfaceC19795, InterfaceC10523, InterfaceC22615 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65793;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47117(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m47118(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new ConcurrentSkipListMap();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.f65793) {
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
