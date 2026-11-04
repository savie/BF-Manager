package l;

import android.os.Message;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۨ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12669 implements InterfaceC3234, InterfaceC6836, InterfaceC19189, InterfaceC24044, InterfaceC25138, InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40592;

    public /* synthetic */ C12669(int i) {
        this.f40592 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31436(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31437(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31438(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m31439(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m31441(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        return C2119.m7304();
    }

    @Override // l.InterfaceC6836
    /* JADX INFO: renamed from: ۙ */
    public void mo14768(Object obj, Message message) {
        ((C23582) obj).m52802();
    }

    @Override // l.InterfaceC19189
    /* JADX INFO: renamed from: ۙ */
    public boolean mo30502(byte[] bArr) {
        return Arrays.equals(bArr, C2581.f8285);
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        switch (this.f40592) {
            case 0:
                return C14684.m35306((InterfaceC4859) obj, true);
            default:
                ((Throwable) obj).getClass();
                return null;
        }
    }
}
