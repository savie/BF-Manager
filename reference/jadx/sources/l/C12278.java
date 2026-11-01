package l;

import android.os.Message;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۫۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12278 implements InterfaceC7359, InterfaceC15954, InterfaceC8773 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41054;

    public /* synthetic */ C12278(int i) {
        this.f41054 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m30515(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m30516(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        return (Long) obj;
    }

    @Override // l.InterfaceC8773
    /* JADX INFO: renamed from: ۙ */
    public void mo5624(Object obj, Message message) {
        ((C18002) obj).m41926();
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        InterfaceC10430 interfaceC10430 = (InterfaceC10430) obj;
        switch (this.f41054) {
            case 1:
                interfaceC10430.getClass();
                break;
            default:
                interfaceC10430.getClass();
                break;
        }
    }
}
