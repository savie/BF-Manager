package l;

/* JADX INFO: renamed from: l.ۗ۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 49A2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3231 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9682() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9685(InterfaceC15456 interfaceC15456, InterfaceC14771 interfaceC14771) {
        int i = C9583.f32302[ordinal()];
        if (i == 1) {
            try {
                C12032.m29931(C7321.f24318, C20149.m45561(C20149.m45562(interfaceC15456, interfaceC14771)));
                return;
            } catch (Throwable th) {
                interfaceC14771.mo2097(C18610.m43014(th));
                throw th;
            }
        }
        if (i == 2) {
            C13465.m32966(interfaceC15456, "<this>");
            C13465.m32966(interfaceC14771, "completion");
            C20149.m45561(C20149.m45562(interfaceC15456, interfaceC14771)).mo2097(C7321.f24318);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C22844();
            }
            return;
        }
        C13465.m32966(interfaceC14771, "completion");
        try {
            InterfaceC22386 context = interfaceC14771.getContext();
            Object objM41155 = C17675.m41155(context, null);
            try {
                C6408.m17553(1, interfaceC15456);
                Object objInvoke = interfaceC15456.invoke(interfaceC14771);
                C17675.m41154(context, objM41155);
                if (objInvoke != EnumC13214.COROUTINE_SUSPENDED) {
                    interfaceC14771.mo2097(objInvoke);
                }
            } catch (Throwable th2) {
                C17675.m41154(context, objM41155);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC14771.mo2097(C18610.m43014(th3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9684(InterfaceC8400 interfaceC8400, Object obj, InterfaceC14771 interfaceC14771) {
        int i = C9583.f32302[ordinal()];
        if (i == 1) {
            try {
                C12032.m29931(C7321.f24318, C20149.m45561(C20149.m45560(interfaceC8400, obj, interfaceC14771)));
                return;
            } catch (Throwable th) {
                interfaceC14771.mo2097(C18610.m43014(th));
                throw th;
            }
        }
        if (i == 2) {
            C13465.m32966(interfaceC8400, "<this>");
            C13465.m32966(interfaceC14771, "completion");
            C20149.m45561(C20149.m45560(interfaceC8400, obj, interfaceC14771)).mo2097(C7321.f24318);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C22844();
            }
            return;
        }
        C13465.m32966(interfaceC14771, "completion");
        try {
            InterfaceC22386 context = interfaceC14771.getContext();
            Object objM41155 = C17675.m41155(context, null);
            try {
                C6408.m17553(2, interfaceC8400);
                Object objMo3208 = interfaceC8400.mo3208(obj, interfaceC14771);
                C17675.m41154(context, objM41155);
                if (objMo3208 != EnumC13214.COROUTINE_SUSPENDED) {
                    interfaceC14771.mo2097(objMo3208);
                }
            } catch (Throwable th2) {
                C17675.m41154(context, objM41155);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC14771.mo2097(C18610.m43014(th3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9686() {
        return this == LAZY;
    }
}
