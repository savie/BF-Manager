package l;

import com.alipay.sdk.m.y.q;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܳ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 26A8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14387 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34621(C12283 c12283, InterfaceC10975 interfaceC10975) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 0) {
            byte value = ((InterfaceC12386) interfaceC10975).getValue();
            if (value < 0) {
                c12283.getClass();
                c12283.write("-0x", 0, 3);
                c12283.mo6726(-value);
                c12283.write(116);
                return;
            }
            c12283.getClass();
            c12283.write("0x", 0, 2);
            c12283.mo6726(value);
            c12283.write(116);
            return;
        }
        if (iMo2656 == 6) {
            long value2 = ((InterfaceC3212) interfaceC10975).getValue();
            if (value2 < 0) {
                c12283.getClass();
                c12283.write("-0x", 0, 3);
                c12283.mo6726(-value2);
                c12283.write(76);
                return;
            }
            c12283.getClass();
            c12283.write("0x", 0, 2);
            c12283.mo6726(value2);
            c12283.write(76);
            return;
        }
        if (iMo2656 == 2) {
            short value3 = ((InterfaceC2237) interfaceC10975).getValue();
            if (value3 < 0) {
                c12283.getClass();
                c12283.write("-0x", 0, 3);
                c12283.mo6726(-value3);
                c12283.write(115);
                return;
            }
            c12283.getClass();
            c12283.write("0x", 0, 2);
            c12283.mo6726(value3);
            c12283.write(115);
            return;
        }
        if (iMo2656 == 3) {
            char value4 = ((InterfaceC17324) interfaceC10975).getValue();
            c12283.write(39);
            C9461.m24218(c12283, value4);
            c12283.write(39);
            return;
        }
        if (iMo2656 == 4) {
            C0667.m2995(c12283, ((InterfaceC9564) interfaceC10975).getValue());
            return;
        }
        if (iMo2656 == 16) {
            c12283.write(Float.toString(((InterfaceC1801) interfaceC10975).getValue()));
            c12283.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            return;
        }
        if (iMo2656 == 17) {
            c12283.write(Double.toString(((InterfaceC6035) interfaceC10975).getValue()));
            return;
        }
        switch (iMo2656) {
            case 21:
                C22304.m49471(c12283, ((InterfaceC11411) interfaceC10975).getValue());
                return;
            case 22:
                C22304.m49468(c12283, ((InterfaceC13528) interfaceC10975).getValue());
                return;
            case 23:
                if (interfaceC10975 instanceof C4416) {
                    ((C4416) interfaceC10975).m12343(c12283);
                    return;
                }
                String value5 = ((InterfaceC5060) interfaceC10975).getValue();
                c12283.write(34);
                C9461.m24219(c12283, value5);
                c12283.write(34);
                return;
            case 24:
                c12283.write(((InterfaceC21994) interfaceC10975).getValue());
                return;
            case 25:
                InterfaceC14503 interfaceC14503 = (InterfaceC14503) interfaceC10975;
                C22304.m49470(c12283, interfaceC14503.getValue(), interfaceC14503.getValue().mo1183().equals(null));
                return;
            case 26:
                InterfaceC4354 interfaceC4354 = (InterfaceC4354) interfaceC10975;
                C22304.m49469(c12283, interfaceC4354.getValue(), interfaceC4354.getValue().mo9700().equals(null));
                return;
            case 27:
                InterfaceC23675 interfaceC23675 = (InterfaceC23675) interfaceC10975;
                boolean zEquals = interfaceC23675.getValue().mo1183().equals(null);
                c12283.getClass();
                c12283.write(".enum ", 0, 6);
                C22304.m49470(c12283, interfaceC23675.getValue(), zEquals);
                return;
            case 28:
                c12283.write(123);
                List<InterfaceC10975> value6 = ((InterfaceC0390) interfaceC10975).getValue();
                if (value6.size() == 0) {
                    c12283.write(q.h);
                    return;
                }
                c12283.write(10);
                c12283.m30527();
                boolean z = true;
                for (InterfaceC10975 interfaceC10976 : value6) {
                    if (!z) {
                        c12283.write(",\n", 0, 2);
                    }
                    m34621(c12283, interfaceC10976);
                    z = false;
                }
                c12283.m30526();
                c12283.write("\n}", 0, 2);
                return;
            case 29:
                InterfaceC20147 interfaceC20147 = (InterfaceC20147) interfaceC10975;
                c12283.getClass();
                c12283.write(".subannotation ", 0, 15);
                c12283.write(interfaceC20147.getType());
                c12283.write(10);
                AbstractC23559.m51921(c12283, interfaceC20147.getElements());
                c12283.write(".end subannotation", 0, 18);
                return;
            case 30:
                c12283.getClass();
                c12283.write("null", 0, 4);
                return;
            case 31:
                if (((InterfaceC16619) interfaceC10975).getValue()) {
                    c12283.getClass();
                    c12283.write("true", 0, 4);
                    return;
                } else {
                    c12283.getClass();
                    c12283.write("false", 0, 5);
                    return;
                }
            default:
                throw new IllegalArgumentException("Unknown encoded value type: " + interfaceC10975.mo2656());
        }
    }
}
