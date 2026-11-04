package l;

import android.widget.TextView;
import java.util.Comparator;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: renamed from: l.᩻ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24966 implements InterfaceC19795, InterfaceC5417, InterfaceC25138, InterfaceC10523, InterfaceC22615 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80854;

    public /* synthetic */ C24966(int i) {
        this.f80854 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55770(int i, int i2, int i3, int i4) {
        return (i3 - (i * i2)) * i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m55771(int i, int i2, String str) {
        return (C17359.hashCode(str) + i) * i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55772(Class cls, String str) {
        return str + cls;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55773(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new ConcurrentMapC17249();
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        switch (this.f80854) {
            case 5:
                return Integer.valueOf(((C16549) obj).f53565);
            default:
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return EnumC19743.COMPACTED;
                }
                if (l2.longValue() == -2) {
                    return EnumC19743.LOW_GAIN;
                }
                return l2.longValue() == -3 ? EnumC19743.BUDGET_EXHAUSTED : EnumC19743.SKIPPED;
        }
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.f80854) {
            case 3:
                interfaceC19992.getClass();
                break;
            default:
                interfaceC19992.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m55774(InterfaceC16760 interfaceC16760, Comparator comparator) {
        return comparator instanceof InterfaceC16760 ? interfaceC16760.mo29043((InterfaceC16760) comparator) : C2661.$default$thenComparing(interfaceC16760, comparator);
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
