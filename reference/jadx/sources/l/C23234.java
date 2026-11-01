package l;

import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩺᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23234 implements InterfaceC20723, InterfaceC7359, InterfaceC11787 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75394;

    public /* synthetic */ C23234(int i) {
        this.f75394 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51269(Object obj, ArrayList arrayList, Object obj2, int i, int i2) {
        C13638.requireNonNull(obj);
        arrayList.add(obj2);
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51270(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51271(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.e(str, sb.toString());
    }

    @Override // l.InterfaceC11787
    /* JADX INFO: renamed from: ۙ */
    public boolean mo10336(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f75394) {
            case 2:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC15785 mo4000() {
        return new C15473();
    }
}
