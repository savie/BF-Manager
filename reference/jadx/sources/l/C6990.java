package l;

import android.content.res.AssetManager;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.w.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۜ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6990 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f23053;

    public /* synthetic */ C6990(Object obj) {
        this.f23053 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WebResourceResponse m19299(String str) {
        String strSubstring = str.startsWith("/_mt_markdown_vendor_/") ? str.substring(22) : "";
        if (!strSubstring.equals("katex.min.css") && !strSubstring.equals("katex.min.js")) {
            return C0851.m3474(404, "Not Found");
        }
        try {
            return new WebResourceResponse(strSubstring.endsWith(".js") ? "application/javascript" : "text/css", a.D, 200, "OK", C10185.m26295(), ((AssetManager) this.f23053).open("preview/".concat(strSubstring)));
        } catch (IOException unused) {
            return C0851.m3474(404, "Not Found");
        }
    }

    public C6990() {
        this.f23053 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, cb.k, cb.f82047l, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 29, 30, bo.j, UTF8.S_CS3, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base32Encoder.DEFAULT_PADDING, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, UTF8.S_P4A, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, UTF8.S_P4B, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, KeyFactorySpi.x25519_type, KeyFactorySpi.x448_type, KeyFactorySpi.Ed25519_type, KeyFactorySpi.Ed448_type, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, GCMSIVBlockCipher.MASK, -127, bo.h, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -83, -82, -81, -80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -70, -69, PSSSigner.TRAILER_IMPLICIT, -67, -66, -65, -64, -63, -62, -61, -60, -59, -58, -57, -56, -55, -54, -53, -52, -51, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35, -34, -33, bo.k, GCMSIVBlockCipher.ADD, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21197 m19301(AbstractC15251 abstractC15251) {
        InterfaceC21197 interfaceC21197 = (InterfaceC21197) abstractC15251.mo17862((InterfaceC2157) C11457.f35998);
        return interfaceC21197 != null ? interfaceC21197 : m19302(abstractC15251.mo18926());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21197 m19302(C21965 c21965) {
        C1610 c1610 = (C1610) this.f23053;
        C2551 c2551M5668 = c1610.m5668(c21965);
        return c2551M5668 != null ? c2551M5668 : c1610.m5691().m49223(c21965);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m19298(byte b) {
        byte[] bArr = (byte[]) this.f23053;
        int i = 0;
        byte b2 = bArr[0];
        if (b != b2) {
            bArr[0] = b;
            while (b != b2) {
                i++;
                byte b3 = bArr[i];
                bArr[i] = b2;
                b2 = b3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList m19300(AbstractC1566 abstractC1566, C21965 c21965) {
        ArrayList arrayList = new ArrayList();
        m19296(abstractC1566, c21965, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte m19297(int i) {
        byte[] bArr = (byte[]) this.f23053;
        byte b = bArr[i];
        System.arraycopy(bArr, 0, bArr, 1, i);
        bArr[0] = b;
        return b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19296(AbstractC1566 abstractC1566, C21965 c21965, ArrayList arrayList) {
        C1610 c1610 = (C1610) this.f23053;
        if (abstractC1566 != null && abstractC1566.mo5543()) {
            boolean z = c21965.m49703() || c21965.m49706();
            C24927 c24927M5672 = c1610.m5672(abstractC1566);
            if (c24927M5672 != null) {
                for (C2551 c2551 : c24927M5672.getMethods()) {
                    if (c21965.m49704(c2551.mo8532())) {
                        arrayList.add(c2551);
                    }
                }
                if (!z) {
                    m19296(c24927M5672.m55553(), c21965, arrayList);
                    Iterator it = c24927M5672.m55564().iterator();
                    while (it.hasNext()) {
                        m19296((AbstractC1566) it.next(), c21965, arrayList);
                    }
                }
            } else {
                C7289 c7289M49222 = c1610.m5691().m49222(abstractC1566);
                if (c7289M49222 != null) {
                    for (C10492 c10492 : c7289M49222.m19960().values()) {
                        if (c21965.m49704(c10492.mo8532())) {
                            arrayList.add(c10492);
                        }
                    }
                    if (!z) {
                        for (AbstractC1566 abstractC1567 : c7289M49222.m19961()) {
                            m19296(abstractC1567, c21965, arrayList);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1345 m19295(C2551 c2551) {
        C16260 c16260 = (C16260) c2551.mo17862((InterfaceC2157) C11457.f36025);
        InterfaceC21197 interfaceC21197 = null;
        next = null;
        Object next = null;
        if (c16260 != null) {
            Set setM38593 = c16260.m38593();
            if (setM38593 != null && setM38593.size() == 1) {
                next = setM38593.iterator().next();
            }
            interfaceC21197 = (InterfaceC21197) next;
        }
        if (interfaceC21197 != null) {
            return interfaceC21197.mo8532().m49700();
        }
        C17006 c17006 = (C17006) c2551.mo17862((InterfaceC2157) C11457.f36030);
        if (c17006 != null) {
            return m19295(c17006.m40076());
        }
        return c2551.mo8532().m49700();
    }
}
