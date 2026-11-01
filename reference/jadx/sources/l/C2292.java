package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f8169;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f8170;

    public C2292(C1493 c1493) {
        InterfaceC17721 interfaceC17721 = null;
        for (InterfaceC17721 interfaceC17722 : c1493.mo17615()) {
            if (interfaceC17722.getPackageName().equals("bin.mt.plus.TranslationData")) {
                interfaceC17721 = interfaceC17722;
            }
        }
        if (interfaceC17721 != null) {
            InterfaceC19133 type = interfaceC17721.getType(am.av);
            InterfaceC19133 type2 = interfaceC17721.getType("b");
            InterfaceC19133 type3 = interfaceC17721.getType(am.aF);
            if (type3 != null) {
                this.f8169 = new HashMap();
                for (InterfaceC12783 interfaceC12783 : type3.mo25271()) {
                    HashMap map = new HashMap();
                    this.f8169.put(interfaceC12783.mo31747().toString(), map);
                    for (int i = 0; i <= interfaceC12783.mo31751(); i++) {
                        if (interfaceC12783.mo31756(i)) {
                            try {
                                InterfaceC3609 interfaceC3609Mo31753 = interfaceC12783.mo31753(i);
                                C13638.requireNonNull(interfaceC3609Mo31753);
                                map.put(new C13583(interfaceC3609Mo31753.getParent(), interfaceC3609Mo31753.getValue().mo25193()), new C11466(interfaceC3609Mo31753.getValue(0).mo25187(), interfaceC3609Mo31753.getValue(1).mo25187()));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return;
            }
            if (type == null || type2 == null || type.mo1536() != type2.mo1536() || type.mo1519() != type2.mo1519()) {
                return;
            }
            this.f8170 = new HashMap();
            for (int i2 = 0; i2 < type.mo1536(); i2++) {
                InterfaceC12783 interfaceC12783Mo1530 = type.mo1530(i2);
                InterfaceC12783 interfaceC12783Mo1531 = type2.mo1530(i2);
                if (interfaceC12783Mo1530.mo31747().toString().equals(interfaceC12783Mo1531.mo31747().toString())) {
                    HashMap map2 = new HashMap();
                    this.f8170.put(interfaceC12783Mo1530.mo31747().toString(), map2);
                    for (int i3 = 0; i3 <= interfaceC12783Mo1530.mo31751(); i3++) {
                        if (interfaceC12783Mo1530.mo31756(i3) && interfaceC12783Mo1531.mo31756(i3)) {
                            try {
                                map2.put(interfaceC12783Mo1531.mo31753(i3).getValue().mo25187(), interfaceC12783Mo1530.mo31753(i3).getValue().mo25187());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4409 m7006(String str) {
        C4409 c4409 = new C4409();
        c4409.f15703 = null;
        c4409.f15704 = null;
        HashMap map = this.f8169;
        if (map != null) {
            c4409.f15703 = (Map) map.get(str);
            return c4409;
        }
        HashMap map2 = this.f8170;
        if (map2 != null) {
            c4409.f15704 = (Map) map2.get(str);
        }
        return c4409;
    }
}
