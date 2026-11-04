package l;

import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1G9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11680 implements InterfaceC6461 {
    @Override // l.InterfaceC6461
    /* JADX INFO: renamed from: ۙ */
    public final void mo2387(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int i;
        int i2 = 1;
        c13304.m32860(true);
        C5737 c5737M6854 = c2008.m6854("format");
        if (c5737M6854 == null) {
            i = 65535;
        } else if (c5737M6854.m16798().isEmpty()) {
            i = 0;
        } else {
            int i3 = 0;
            for (String str : c5737M6854.m16798().split("\\|")) {
                str.getClass();
                switch (str) {
                    case "fraction":
                        i3 |= 128;
                        break;
                    case "dimension":
                        i3 |= 64;
                        break;
                    case "reference":
                        i3 |= 1;
                        break;
                    case "string":
                        i3 |= 2;
                        break;
                    case "enum":
                        i3 |= 65536;
                        break;
                    case "boolean":
                        i3 |= 8;
                        break;
                    case "color":
                        i3 |= 16;
                        break;
                    case "flags":
                        i3 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                        break;
                    case "float":
                        i3 |= 32;
                        break;
                    case "integer":
                        i3 |= 4;
                        break;
                }
            }
            if ((i3 & 65536) != 0 && (i3 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                throw new C10254("Cannot define flag and enum at the same time", c5737M6854);
            }
            i = i3;
        }
        c13304.m32848(i, 16, 16777216);
        C6593 c6593 = (C6593) c12426.m30899("idTypeNameMap-" + c13304.m32857().mo27607(), new C9059(i2, c13304));
        C23747 c23747M56365 = c13304.m32857().m56365();
        int iMo27607 = c23747M56365 != null ? (c23747M56365.m53029().mo27607() << 24) | (c23747M56365.mo35833() << 16) : 0;
        C5765 c5765 = new C5765();
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            C2008 c2009 = (C2008) itM6847.next();
            String strM6853 = c2009.m6853();
            if (strM6853.equals("flag") || strM6853.equals("enum")) {
                C5737 c5737M6863 = c2009.m6863("name");
                C5737 c5737M6864 = c2009.m6863(b.d);
                String strM16798 = c5737M6863.m16798();
                String strM16799 = c5737M6864.m16798();
                Integer numM38329 = C16155.m38329(strM16798);
                if (numM38329 == null) {
                    numM38329 = c6593 == null ? null : (Integer) c6593.get(strM16798);
                    if (numM38329 != null) {
                        numM38329 = Integer.valueOf(numM38329.intValue() | iMo27607);
                    }
                }
                if (numM38329 == null) {
                    throw new C10254("Unknown name: ".concat(strM16798), c5737M6863);
                }
                if (C11730.m29458(strM16799, c5765)) {
                    c13304.m32848(c5765.f19813, c5765.f19814, numM38329.intValue());
                } else {
                    throw new C10254("Value must be integer", c5737M6864);
                }
            } else {
                C16155.m38330(c13304, c12426, c2009).m11711(C16155.m38328(c2009, c5765));
            }
        }
    }
}
