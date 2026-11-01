package l;

import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collection;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1EW */
/* JADX INFO: loaded from: classes3.dex */
public final class C3028 extends C11994 {
    @Override // l.C11994, l.InterfaceC1409
    /* JADX INFO: renamed from: ۙ */
    public final void mo4924(InterfaceC9380 interfaceC9380, InterfaceC3609 interfaceC3609, C22577 c22577, C2820 c2820) {
        String str;
        String strM18159;
        InterfaceC3609 interfaceC3609Mo31753;
        if (!interfaceC3609.mo7644()) {
            throw new RuntimeException();
        }
        if (interfaceC3609.mo7647() == 0 || interfaceC3609.getValue().mo25193() != 16777216 || !interfaceC3609.getValue().mo25189()) {
            super.mo4924(interfaceC9380, interfaceC3609, c22577, c2820);
            return;
        }
        interfaceC9380.mo24062("attr");
        interfaceC9380.mo24061("name", interfaceC3609.mo7645());
        int value = interfaceC3609.getValue().getValue();
        InterfaceC12783 interfaceC12783Mo1530 = null;
        if (value != 65535) {
            ArrayList arrayList = new ArrayList();
            if ((value & 1) != 0) {
                arrayList.add(Name.REFER);
            }
            if ((value & 2) != 0) {
                arrayList.add("string");
            }
            if ((value & 4) != 0) {
                arrayList.add("integer");
            }
            if ((value & 8) != 0) {
                arrayList.add(ClassTransform.BOOLEAN);
            }
            if ((value & 16) != 0) {
                arrayList.add(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
            }
            if ((value & 32) != 0) {
                arrayList.add(ClassTransform.FLOAT);
            }
            if ((value & 64) != 0) {
                arrayList.add("dimension");
            }
            if ((value & 128) != 0) {
                arrayList.add("fraction");
            }
            if ((65536 & value) != 0) {
                str = "enum";
                arrayList.add("enum");
            } else {
                str = null;
            }
            if ((value & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                arrayList.add("flags");
                str = "flag";
            }
            interfaceC9380.mo24061("format", C6851.m18459((Collection) arrayList, '|'));
        } else {
            str = null;
        }
        C7054.m18906(interfaceC9380, interfaceC3609, c2820);
        int iMo7647 = interfaceC3609.mo7647() - 1;
        InterfaceC19133 type = interfaceC3609.mo10692().getType("id");
        int i = 0;
        if (type != null && type.mo1536() != 0) {
            interfaceC12783Mo1530 = type.mo1530(0);
        }
        int iMo19106 = interfaceC3609.mo10692().mo19106() << 24;
        if (type != null) {
            iMo19106 |= type.mo26942() << 16;
        }
        while (i < iMo7647) {
            i++;
            InterfaceC9961 value2 = interfaceC3609.getValue(i);
            if (str == null || (value2.mo25192() != 16 && value2.mo25192() != 17)) {
                C11994.m29876(interfaceC9380, value2, c22577);
            } else {
                if (interfaceC12783Mo1530 == null || (value2.mo25193() & (-65536)) != iMo19106 || (interfaceC3609Mo31753 = interfaceC12783Mo1530.mo31753(value2.mo25193() & 65535)) == null) {
                    strM18159 = C6730.m18159(value2.mo25193());
                } else {
                    strM18159 = interfaceC3609Mo31753.mo7645();
                }
                interfaceC9380.mo24062(str);
                interfaceC9380.mo24061("name", strM18159);
                interfaceC9380.mo24061(b.d, C7054.m18900(c22577, value2).toString());
                interfaceC9380.mo24060(str);
            }
        }
        interfaceC9380.mo24060("attr");
    }
}
