package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26A8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3589 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11645(C2161 c2161, InterfaceC16791 interfaceC16791) throws IOException {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 0) {
            byte value = ((InterfaceC1876) interfaceC16791).getValue();
            if (value < 0) {
                c2161.getClass();
                c2161.write("-0x", 0, 3);
                c2161.mo7441(-value);
                c2161.write(116);
                return;
            }
            c2161.getClass();
            c2161.write("0x", 0, 2);
            c2161.mo7441(value);
            c2161.write(116);
            return;
        }
        if (iMo5414 == 6) {
            long value2 = ((InterfaceC20521) interfaceC16791).getValue();
            if (value2 < 0) {
                c2161.getClass();
                c2161.write("-0x", 0, 3);
                c2161.mo7441(-value2);
                c2161.write(76);
                return;
            }
            c2161.getClass();
            c2161.write("0x", 0, 2);
            c2161.mo7441(value2);
            c2161.write(76);
            return;
        }
        if (iMo5414 == 2) {
            short value3 = ((InterfaceC4113) interfaceC16791).getValue();
            if (value3 < 0) {
                c2161.getClass();
                c2161.write("-0x", 0, 3);
                c2161.mo7441(-value3);
                c2161.write(115);
                return;
            }
            c2161.getClass();
            c2161.write("0x", 0, 2);
            c2161.mo7441(value3);
            c2161.write(115);
            return;
        }
        if (iMo5414 == 3) {
            char value4 = ((InterfaceC11570) interfaceC16791).getValue();
            c2161.write(39);
            C3652.m11835(c2161, value4);
            c2161.write(39);
            return;
        }
        if (iMo5414 == 4) {
            C1835.m6335(c2161, ((InterfaceC3367) interfaceC16791).getValue());
            return;
        }
        if (iMo5414 == 16) {
            c2161.write(Float.toString(((InterfaceC23505) interfaceC16791).getValue()));
            c2161.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            return;
        }
        if (iMo5414 == 17) {
            c2161.write(Double.toString(((InterfaceC24997) interfaceC16791).getValue()));
            return;
        }
        switch (iMo5414) {
            case 21:
                C14684.m35312(c2161, ((InterfaceC24251) interfaceC16791).getValue());
                return;
            case 22:
                C14684.m35310(c2161, ((InterfaceC6351) interfaceC16791).getValue());
                return;
            case 23:
                if (interfaceC16791 instanceof C12360) {
                    ((C12360) interfaceC16791).m30837(c2161);
                    return;
                }
                String value5 = ((InterfaceC14553) interfaceC16791).getValue();
                c2161.write(34);
                C3652.m11836(c2161, value5);
                c2161.write(34);
                return;
            case 24:
                c2161.write(((InterfaceC21267) interfaceC16791).getValue());
                return;
            case 25:
                InterfaceC16045 interfaceC16045 = (InterfaceC16045) interfaceC16791;
                C14684.m35311(c2161, interfaceC16045.getValue(), interfaceC16045.getValue().mo4500().equals(null));
                return;
            case 26:
                InterfaceC12316 interfaceC12316 = (InterfaceC12316) interfaceC16791;
                C14684.m35309(c2161, interfaceC12316.getValue(), interfaceC12316.getValue().mo6804().equals(null));
                return;
            case 27:
                InterfaceC17537 interfaceC17537 = (InterfaceC17537) interfaceC16791;
                boolean zEquals = interfaceC17537.getValue().mo4500().equals(null);
                c2161.getClass();
                c2161.write(".enum ", 0, 6);
                C14684.m35311(c2161, interfaceC17537.getValue(), zEquals);
                return;
            case 28:
                c2161.write(123);
                List<InterfaceC16791> value6 = ((InterfaceC13062) interfaceC16791).getValue();
                if (value6.size() == 0) {
                    c2161.write(q.h);
                    return;
                }
                c2161.write(10);
                c2161.m7439();
                boolean z = true;
                for (InterfaceC16791 interfaceC16792 : value6) {
                    if (!z) {
                        c2161.write(",\n", 0, 2);
                    }
                    m11645(c2161, interfaceC16792);
                    z = false;
                }
                c2161.m7435();
                c2161.write("\n}", 0, 2);
                return;
            case 29:
                InterfaceC15299 interfaceC15299 = (InterfaceC15299) interfaceC16791;
                c2161.getClass();
                c2161.write(".subannotation ", 0, 15);
                c2161.write(interfaceC15299.getType());
                c2161.write(10);
                AbstractC23727.m52996(c2161, interfaceC15299.getElements());
                c2161.write(".end subannotation", 0, 18);
                return;
            case 30:
                c2161.getClass();
                c2161.write("null", 0, 4);
                return;
            case 31:
                if (((InterfaceC5605) interfaceC16791).getValue()) {
                    c2161.getClass();
                    c2161.write("true", 0, 4);
                    return;
                } else {
                    c2161.getClass();
                    c2161.write("false", 0, 5);
                    return;
                }
            default:
                throw new IllegalArgumentException("Unknown encoded value type: " + interfaceC16791.mo5414());
        }
    }
}
