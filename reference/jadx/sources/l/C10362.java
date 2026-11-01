package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10362 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC8951 f35511;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f35512 = {12582912, 25165824, 50331648};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC19534 f35513;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC8951 f35514;

    static {
        C18828 c18828 = new C18828();
        C8245 c8245 = new C8245();
        f35514 = c8245;
        f35513 = c18828;
        f35511 = c8245;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m26260(InputStream inputStream) {
        InterfaceC19534 interfaceC19534 = f35513;
        C13638.requireNonNull(inputStream, "inputStream");
        return interfaceC19534.mo14059(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m26261(OutputStream outputStream, int i) {
        C13638.requireNonNull(outputStream, "outputStream");
        InterfaceC8951 interfaceC8951 = f35511;
        if (!interfaceC8951.mo21625(i)) {
            interfaceC8951 = f35514;
        }
        return interfaceC8951.mo21624(outputStream, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13839 m26262(int i) throws C6782 {
        C13839 c13839 = new C13839();
        c13839.m33667(i);
        if (i >= 7 && i <= 9) {
            c13839.m33664(f35512[i - 7]);
        }
        return c13839;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26263(C5038 c5038) {
        f35513 = c5038;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26264(InterfaceC8951 interfaceC8951) {
        f35511 = interfaceC8951;
    }
}
