package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes.dex */
public final class C24653 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f79802 = {12582912, 25165824, 50331648};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC12718 f79803;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6753 f79804;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC6753 f79805;

    static {
        C3769 c3769 = new C3769();
        C20923 c20923 = new C20923();
        f79804 = c20923;
        f79803 = c3769;
        f79805 = c20923;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m55007(InputStream inputStream) {
        InterfaceC12718 interfaceC12718 = f79803;
        C17359.requireNonNull(inputStream, "inputStream");
        return interfaceC12718.mo12237(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m55008(OutputStream outputStream, int i) {
        C17359.requireNonNull(outputStream, "outputStream");
        InterfaceC6753 interfaceC6753 = f79805;
        if (!interfaceC6753.mo18855(i)) {
            interfaceC6753 = f79804;
        }
        return interfaceC6753.mo18854(outputStream, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17682 m55009(int i) throws C4258 {
        C17682 c17682 = new C17682();
        c17682.m41354(i);
        if (i >= 7 && i <= 9) {
            c17682.m41351(f79802[i - 7]);
        }
        return c17682;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55011(C12225 c12225) {
        f79803 = c12225;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55010(InterfaceC6753 interfaceC6753) {
        f79805 = interfaceC6753;
    }
}
