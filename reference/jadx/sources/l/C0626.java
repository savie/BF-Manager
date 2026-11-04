package l;

import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collection;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֡ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1EW */
/* JADX INFO: loaded from: classes3.dex */
public final class C0626 extends C10320 {
    @Override // l.C10320, l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        String str;
        String strM28557;
        InterfaceC8697 interfaceC8697Mo9076;
        if (!interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        if (interfaceC8697.mo18154() == 0 || interfaceC8697.getValue().mo16637() != 16777216 || !interfaceC8697.getValue().mo16632()) {
            super.mo2774(interfaceC18525, interfaceC8697, c2863, c1372);
            return;
        }
        interfaceC18525.mo14234("attr");
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        int value = interfaceC8697.getValue().getValue();
        InterfaceC2731 interfaceC2731Mo4334 = null;
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
            interfaceC18525.mo14233("format", C24276.m54285((Collection) arrayList, '|'));
        } else {
            str = null;
        }
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        int iMo18154 = interfaceC8697.mo18154() - 1;
        InterfaceC15344 type = interfaceC8697.mo18153().getType("id");
        int i = 0;
        if (type != null && type.mo4331() != 0) {
            interfaceC2731Mo4334 = type.mo4334(0);
        }
        int iMo27607 = interfaceC8697.mo18153().mo27607() << 24;
        if (type != null) {
            iMo27607 |= type.mo35833() << 16;
        }
        while (i < iMo18154) {
            i++;
            InterfaceC5650 value2 = interfaceC8697.getValue(i);
            if (str == null || (value2.mo16635() != 16 && value2.mo16635() != 17)) {
                C10320.m26592(interfaceC18525, value2, c2863);
            } else {
                if (interfaceC2731Mo4334 == null || (value2.mo16637() & (-65536)) != iMo27607 || (interfaceC8697Mo9076 = interfaceC2731Mo4334.mo9076(value2.mo16637() & 65535)) == null) {
                    strM28557 = C11293.m28557(value2.mo16637());
                } else {
                    strM28557 = interfaceC8697Mo9076.mo18156();
                }
                interfaceC18525.mo14234(str);
                interfaceC18525.mo14233("name", strM28557);
                interfaceC18525.mo14233(b.d, C14049.m34210(c2863, value2).toString());
                interfaceC18525.mo14232(str);
            }
        }
        interfaceC18525.mo14232("attr");
    }
}
