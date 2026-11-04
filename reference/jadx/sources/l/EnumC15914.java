package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15914 {
    SHORT(new C19967()),
    LONG(new j$$ExternalSyntheticOutline0()),
    VERBOSE(new C22313());


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20390 f51716;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m37948(EnumC19644 enumC19644, String str, String str2) {
        return str2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m37946(EnumC19644 enumC19644, String str, String str2) {
        return C20196.m46451(enumC19644.m45288(), ": ", str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m37945(EnumC19644 enumC19644, String str, String str2) {
        return enumC19644 == EnumC19644.INFO ? str2 : String.format("%-7s-%6s: %s", str, enumC19644.m45289(), str2);
    }

    EnumC15914(InterfaceC20390 interfaceC20390) {
        this.f51716 = interfaceC20390;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m37950(EnumC19644 enumC19644, String str, String str2, Object... objArr) {
        return (str2 == null || str == null) ? "" : this.f51716.apply(enumC19644, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m37949(String str, C23374 c23374) {
        return c23374.m52542() ? "" : this.f51716.apply(c23374.m52540(), str, c23374.m52541());
    }
}
