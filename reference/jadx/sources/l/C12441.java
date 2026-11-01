package l;

import android.widget.TextView;
import bin.mt.plus.R;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۫ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12441 implements InterfaceC11955, InterfaceC7359, InterfaceC15954, InterfaceC4509, InterfaceC2123 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41495;

    public /* synthetic */ C12441(int i) {
        this.f41495 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30911(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30912(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m30914(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30916(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ */
    public int mo1698(String str, boolean z) {
        C22959 c22959 = C9886.f33734;
        return 2;
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        switch (this.f41495) {
            case 4:
                C16115 c16115 = (C16115) obj;
                return c16115.f52097 + ": " + c16115.f52098;
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f41495) {
            case 5:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        switch (this.f41495) {
            case 8:
                textView.setText("0");
                break;
            default:
                textView.setText("0");
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 m30917(String str) {
        return C5553.m15313(str, new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30913(boolean z, boolean z2) {
        if (z && z2) {
            return C16737.m39264(R.string.MT_Protector, "V2 + V3");
        }
        if (z) {
            return C16737.m39264(R.string.MT_Protector, "V2");
        }
        if (z2) {
            return C16737.m39264(R.string.MT_Protector, "V3");
        }
        throw new RuntimeException();
    }
}
