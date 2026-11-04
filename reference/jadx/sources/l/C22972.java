package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G55Z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22972 implements InterfaceC19795, InterfaceC10523, InterfaceC22615 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m51847(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new ArrayList();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
