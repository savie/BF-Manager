package l;

import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: renamed from: l.᩵᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20801 extends DexClassLoader {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseDexClassLoader f66609;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20801(String str, String str2, DexClassLoader dexClassLoader, BaseDexClassLoader baseDexClassLoader) {
        super(str, str2, null, dexClassLoader);
        int i = -2037763875;
        int i2 = C1519.f5300;
        int i3 = C2354.f7599;
        this.f66609 = baseDexClassLoader;
        int iM3169 = C0773.m3169("ۨ֨") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-14729)) ^ (-1229037165);
        int i5 = -2005104833;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i3) * (-23707)) >> 31));
            switch (i) {
                case -472119787:
                case 1013853840:
                    return;
                case -201694882:
                case 1708889421:
                    RunnableC1848.m6360();
                    break;
                case -59600009:
                case 726890991:
                    C3998.m12920();
                    if (!C3779.m12264()) {
                        iM3169 = (C0619.m2761("ܽ۫") ^ i2) * (-7);
                        i4 = ((iM3169 ^ i3) * 12935) ^ (-818764660);
                        i5 = -1639338129;
                    }
                    break;
                case 230627018:
                case 1459801280:
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("ܶ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24299) ^ 1683899712;
                        i5 = -565672923;
                    } else {
                        iM3169 = C0619.m2761("ۢۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14335)) ^ 1884742940;
                        i5 = -1408304330;
                        continue;
                    }
                    break;
                case 1164840901:
                case 2109936774:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("᩸۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25201) ^ (-767254949);
                        i5 = -172447814;
                    }
                    break;
                case 1373804687:
                case 1803448283:
                    C2354.m7983();
                    throw new RuntimeException();
                default:
                    RunnableC3055.m9933();
                    if (C2966.f9654 < 0) {
                        iM3169 = (i3 - C0773.m3169("ۗ֨")) * (-79);
                        i4 = ((iM3169 ^ i2) * 9777) ^ (-2080569464);
                        i5 = -1898796712;
                    }
                    break;
            }
            iM3169 = C0773.m3169("۠ܽ") ^ i2;
            i4 = ((iM3169 ^ i3) * (-487)) ^ 1207175158;
            i5 = -1275059271;
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f66609.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f66609.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f66609.getResources(str);
    }
}
