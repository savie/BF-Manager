package l;

import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10824 extends DexClassLoader {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseDexClassLoader f36857;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10824(String str, String str2, DexClassLoader dexClassLoader, BaseDexClassLoader baseDexClassLoader) {
        super(str, str2, null, dexClassLoader);
        int i = -1105506337;
        int i2 = AbstractC0464.f2088;
        int i3 = C3722.f13525;
        this.f36857 = baseDexClassLoader;
        int iM45029 = (C19806.m45029("ۨۙ") ^ i3) * (-47);
        int i4 = ((iM45029 ^ i2) * (-6787)) ^ (-790100436);
        int i5 = -1577743865;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i2) * (-135)) >> 31));
            switch (i) {
                case -1575646347:
                case 1625245516:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1419.m4973();
                    iM45029 = (i2 - C19806.m45029("ۡ᩷")) * (-55);
                    i4 = ((iM45029 ^ i3) * (-6759)) ^ 127613417;
                    i5 = 1202444736;
                    break;
                case -1136174820:
                case 1887552124:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩺ۚ")) * (-15);
                        i4 = ((iM45029 ^ i3) * 23895) ^ (-1092791859);
                        i5 = 337920693;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7859)) ^ 1531842629;
                        i5 = 373979233;
                    }
                    break;
                case -968654430:
                case 526285508:
                    C1977.m6356();
                    if (C3660.m10791() == 0) {
                        iM45029 = C19806.m45029("۫ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11947)) ^ (-2007007190);
                        i5 = -1546694604;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۢ֨")) * 79;
                        i4 = ((iM45029 ^ i2) * 12899) ^ (-2040278116);
                        i5 = -308589117;
                    }
                    break;
                case -72533320:
                case 649759004:
                    C1066.m4023();
                    if (C1937.f7317 < 0) {
                        iM45029 = (i2 - C19806.m45029("ۡ᩷")) * (-55);
                        i4 = ((iM45029 ^ i3) * (-6759)) ^ 127613417;
                        i5 = 1202444736;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۢ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-11293)) ^ (-1322658787);
                        i5 = 1972410599;
                    }
                    break;
                case 859087131:
                case 1481990055:
                    return;
                case 1163263865:
                case 1534735803:
                    C0797.m3359();
                    C2788.m8472();
                    throw new RuntimeException();
                default:
                    C1398.m4895();
                    if (!RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("۫ܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11947)) ^ (-2007007190);
                        i5 = -1546694604;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۡ᩷")) * (-55);
                        i4 = ((iM45029 ^ i3) * (-6759)) ^ 127613417;
                        i5 = 1202444736;
                    }
                    break;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        return this.f36857.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public final InputStream getResourceAsStream(String str) {
        return this.f36857.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        return this.f36857.getResources(str);
    }
}
