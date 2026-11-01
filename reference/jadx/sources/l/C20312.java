package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20312 extends HashMap {
    public static final long serialVersionUID = 1812267524140424433L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C16576 f65795 = new C16576();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20312 m45852(C12343 c12343) {
        C16576 c16576 = f65795;
        C20312 c20312 = (C20312) c12343.m30656(c16576);
        if (c20312 != null) {
            return c20312;
        }
        C20312 c20313 = new C20312();
        c12343.m30659(c16576, c20313);
        return c20313;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45853(C4603 c4603, EnumC16079 enumC16079) {
        EnumC16079 enumC160710 = (EnumC16079) get(c4603);
        return (enumC160710 == null || enumC16079.m38107(enumC160710)) ? false : true;
    }
}
