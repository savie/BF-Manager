package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܺۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15712 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15712 f50998 = new C15712();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullBooleanAsFalse.f14811) != 0) {
                c13158.write("false");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        if (bool.booleanValue()) {
            c13158.write("true");
        } else {
            c13158.write("false");
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        if (iM8859 == 6) {
            c2974.m8850(16);
            return Boolean.TRUE;
        }
        if (iM8859 == 7) {
            c2974.m8850(16);
            return Boolean.FALSE;
        }
        if (iM8859 == 2) {
            int iM8836 = c2974.m8836();
            c2974.m8850(16);
            if (iM8836 == 1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        Object objM34396 = c14265.m34396((Object) null);
        if (objM34396 == null) {
            return null;
        }
        return C8219.m21525(objM34396);
    }
}
