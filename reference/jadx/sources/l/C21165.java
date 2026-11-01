package l;

import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1G9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21165 implements InterfaceC23988 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [l.۟᩹ۨ] */
    @Override // l.InterfaceC23988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6812(final C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int i;
        c18551.m42946(true);
        C18923 c18923M21780 = c8340.m21780("format");
        if (c18923M21780 == null) {
            i = 65535;
        } else if (c18923M21780.m43586().isEmpty()) {
            i = 0;
        } else {
            int i2 = 0;
            for (String str : c18923M21780.m43586().split("\\|")) {
                str.getClass();
                switch (str) {
                    case "fraction":
                        i2 |= 128;
                        break;
                    case "dimension":
                        i2 |= 64;
                        break;
                    case "reference":
                        i2 |= 1;
                        break;
                    case "string":
                        i2 |= 2;
                        break;
                    case "enum":
                        i2 |= 65536;
                        break;
                    case "boolean":
                        i2 |= 8;
                        break;
                    case "color":
                        i2 |= 16;
                        break;
                    case "flags":
                        i2 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                        break;
                    case "float":
                        i2 |= 32;
                        break;
                    case "integer":
                        i2 |= 4;
                        break;
                }
            }
            if ((i2 & 65536) != 0 && (i2 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                throw new C4811("Cannot define flag and enum at the same time", c18923M21780);
            }
            i = i2;
        }
        c18551.m42936(i, 16, 16777216);
        C5851 c5851 = (C5851) c11288.m28266("idTypeNameMap-" + c18551.m42934().mo19106(), (C7760) new Function() { // from class: l.۟᩹ۨ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C0206 c0206M19394 = c18551.m42934().m19394();
                if (c0206M19394 == null) {
                    return null;
                }
                return c0206M19394.m1535();
            }
        });
        C0206 c0206M19394 = c18551.m42934().m19394();
        int iMo19106 = c0206M19394 != null ? (c0206M19394.m1543().mo19106() << 24) | (c0206M19394.mo26942() << 16) : 0;
        C12812 c12812 = new C12812();
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            C8340 c8341 = (C8340) itM21772.next();
            String strM21779 = c8341.m21779();
            if (strM21779.equals("flag") || strM21779.equals("enum")) {
                C18923 c18923M21786 = c8341.m21786("name");
                C18923 c18923M21787 = c8341.m21786(b.d);
                String strM43586 = c18923M21786.m43586();
                String strM43587 = c18923M21787.m43586();
                Integer numM39626 = C16932.m39626(strM43586);
                if (numM39626 == null) {
                    numM39626 = c5851 == null ? null : (Integer) c5851.get(strM43586);
                    if (numM39626 != null) {
                        numM39626 = Integer.valueOf(numM39626.intValue() | iMo19106);
                    }
                }
                if (numM39626 == null) {
                    throw new C4811("Unknown name: ".concat(strM43586), c18923M21786);
                }
                if (C6461.m17653(strM43587, c12812)) {
                    c18551.m42936(c12812.f42662, c12812.f42661, numM39626.intValue());
                } else {
                    throw new C4811("Value must be integer", c18923M21787);
                }
            } else {
                C16932.m39627(c18551, c11288, c8341).m38685(C16932.m39625(c8341, c12812));
            }
        }
    }
}
