package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes.dex */
public final class C22575 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f73004;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f73005;

    public C22575(C24296 c24296) {
        InterfaceC10869 interfaceC10869 = null;
        for (InterfaceC10869 interfaceC108610 : c24296.mo15672()) {
            if (interfaceC108610.getPackageName().equals("bin.mt.plus.TranslationData")) {
                interfaceC10869 = interfaceC108610;
            }
        }
        if (interfaceC10869 != null) {
            InterfaceC15344 type = interfaceC10869.getType(am.av);
            InterfaceC15344 type2 = interfaceC10869.getType("b");
            InterfaceC15344 type3 = interfaceC10869.getType(am.aF);
            if (type3 != null) {
                this.f73004 = new HashMap();
                for (InterfaceC2731 interfaceC2731 : type3.mo33925()) {
                    HashMap map = new HashMap();
                    this.f73004.put(interfaceC2731.mo9073().toString(), map);
                    for (int i = 0; i <= interfaceC2731.mo9069(); i++) {
                        if (interfaceC2731.mo9075(i)) {
                            try {
                                InterfaceC8697 interfaceC8697Mo9076 = interfaceC2731.mo9076(i);
                                C17359.requireNonNull(interfaceC8697Mo9076);
                                map.put(new C21829(interfaceC8697Mo9076.getParent(), interfaceC8697Mo9076.getValue().mo16637()), new C10640(interfaceC8697Mo9076.getValue(0).mo11710(), interfaceC8697Mo9076.getValue(1).mo11710()));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return;
            }
            if (type == null || type2 == null || type.mo4331() != type2.mo4331() || type.mo4328() != type2.mo4328()) {
                return;
            }
            this.f73005 = new HashMap();
            for (int i2 = 0; i2 < type.mo4331(); i2++) {
                InterfaceC2731 interfaceC2731Mo4334 = type.mo4334(i2);
                InterfaceC2731 interfaceC2731Mo4335 = type2.mo4334(i2);
                if (interfaceC2731Mo4334.mo9073().toString().equals(interfaceC2731Mo4335.mo9073().toString())) {
                    HashMap map2 = new HashMap();
                    this.f73005.put(interfaceC2731Mo4334.mo9073().toString(), map2);
                    for (int i3 = 0; i3 <= interfaceC2731Mo4334.mo9069(); i3++) {
                        if (interfaceC2731Mo4334.mo9075(i3) && interfaceC2731Mo4335.mo9075(i3)) {
                            try {
                                map2.put(interfaceC2731Mo4335.mo9076(i3).getValue().mo11710(), interfaceC2731Mo4334.mo9076(i3).getValue().mo11710());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4675 m50897(String str) {
        C4675 c4675 = new C4675();
        c4675.f16503 = null;
        c4675.f16504 = null;
        HashMap map = this.f73004;
        if (map != null) {
            c4675.f16503 = (Map) map.get(str);
            return c4675;
        }
        HashMap map2 = this.f73005;
        if (map2 != null) {
            c4675.f16504 = (Map) map2.get(str);
        }
        return c4675;
    }
}
