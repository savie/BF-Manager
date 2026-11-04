package l;

import android.os.Message;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4791 implements InterfaceC19795, InterfaceC25138, InterfaceC6836, InterfaceC5417 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16788;

    public /* synthetic */ C4791(int i) {
        this.f16788 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14766(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        switch (this.f16788) {
            case 5:
                return (FutureC23690) obj;
            default:
                return ((Map.Entry) obj).getKey();
        }
    }

    @Override // l.InterfaceC6836
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo14768(Object obj, Message message) {
        C20733.m47421((C20733) obj);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14767(InterfaceC10756 interfaceC10756, InterfaceC10756 interfaceC10757) {
        if (interfaceC10756 == interfaceC10757) {
            return;
        }
        if (interfaceC10757 != null) {
            interfaceC10757.mo27412((C12994) null);
        }
        if (interfaceC10756 != null) {
            interfaceC10756.mo27415(null);
        }
    }
}
