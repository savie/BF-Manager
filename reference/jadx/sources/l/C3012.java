package l;

import android.os.Message;
import android.os.storage.StorageVolume;
import java.security.Key;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3012 implements InterfaceC20765, InterfaceC7359, InterfaceC15954, InterfaceC8773 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ StorageVolume m8973(Object obj) {
        return (StorageVolume) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8975(Key key, StringBuilder sb, String str) {
        sb.append(key.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8976(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        return (FutureC12075) obj;
    }

    @Override // l.InterfaceC8773
    /* JADX INFO: renamed from: ۙ */
    public void mo5624(Object obj, Message message) {
        C7935.m20950((C7935) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m8974(int i, List list) {
        return list.get(list.size() - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m8977(InterfaceC4692 interfaceC4692, Comparator comparator) {
        return comparator instanceof InterfaceC4692 ? interfaceC4692.mo13000((InterfaceC4692) comparator) : C7618.$default$thenComparing(interfaceC4692, comparator);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC20765
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo8979(Object obj, C9060 c9060) {
        ((InterfaceC19333) obj).mo2600(new C8044(c9060));
    }
}
