package l;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ܰ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAWI */
/* JADX INFO: loaded from: classes5.dex */
public final class C14911 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14911 f48696 = new C14911();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullBooleanAsFalse.f5702) != 0) {
                c5372.write("false");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        if (bool.booleanValue()) {
            c5372.write("true");
        } else {
            c5372.write("false");
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        if (iM33938 == 6) {
            c13945.m33973(16);
            return Boolean.TRUE;
        }
        if (iM33938 == 7) {
            c13945.m33973(16);
            return Boolean.FALSE;
        }
        if (iM33938 == 2) {
            int iM33968 = c13945.m33968();
            c13945.m33973(16);
            if (iM33968 == 1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        Object objM9106 = c2759.m9106((Object) null);
        if (objM9106 == null) {
            return null;
        }
        return C3134.m10229(objM9106);
    }
}
