package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.security.cert.Extension;

/* JADX INFO: renamed from: l.ۗۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 76WC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3184 implements InterfaceC11955, InterfaceC20765, InterfaceC7359, InterfaceC3485, InterfaceC13379, InterfaceC5601, InterfaceC3740 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9602(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9603(String str, String str2, String str3, String str4) {
        return JSON.object().add(str, str2).add(str3, str4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Extension m9604(Object obj) {
        return (Extension) obj;
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        return C21696.m48443();
    }

    @Override // l.InterfaceC20765
    /* JADX INFO: renamed from: ۙ */
    public void mo8979(Object obj, C9060 c9060) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m9601(int i, String str) {
        return str.charAt(str.length() - i);
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return Integer.valueOf(((C0612) obj).f2653);
    }

    @Override // l.InterfaceC13379
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo9605() {
        System.loadLibrary("mt-radare2");
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new C0918();
    }

    @Override // l.InterfaceC5601
    /* JADX INFO: renamed from: ۙ */
    public int mo8451(int i, int i2) {
        return i2 == -12105913 ? C3224.m9662(C20368.f65975, i2, 0.85f) : i2;
    }
}
