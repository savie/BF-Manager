package l;

/* JADX INFO: renamed from: l.᩹۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C22138 extends C12966 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5204 m49098(InterfaceC4871 interfaceC4871) {
        return new C19316(interfaceC4871);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5204 m49097(EnumC3792 enumC3792, InterfaceC4871 interfaceC4871) {
        C13465.m32966(enumC3792, "mode");
        int i = C0970.f3801[enumC3792.ordinal()];
        if (i == 1) {
            return new C19316(interfaceC4871);
        }
        if (i == 2) {
            return new C8027(interfaceC4871);
        }
        if (i == 3) {
            return new C20727(interfaceC4871);
        }
        throw new C22844();
    }
}
