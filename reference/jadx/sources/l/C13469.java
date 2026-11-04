package l;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 41WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13469 extends AbstractC13819 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C24055 f42868;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11965 f42869;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14718 f42870;

    @Override // l.AbstractC23166
    /* JADX INFO: renamed from: ۙ */
    public final String mo7731() {
        return "NewStringBytes";
    }

    public C13469(C22420 c22420, InterfaceC23517 interfaceC23517) {
        super(c22420, interfaceC23517);
        this.f42869 = new C11965("Ljava/lang/String;", "<init>", "V", Collections.singletonList("[B"));
        this.f42870 = new C14718(c22420);
        this.f43809 = EnumC10243.DIRECT;
        this.f43806 = false;
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final List mo12249(C22420 c22420) {
        return Collections.singletonList(this.f42869);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final String mo12248(C5122 c5122, C12328 c12328, C1295 c1295, int i) {
        C24055 c24055;
        int iM4700 = c1295.m4700();
        int iM4698 = c1295.m4698();
        C14718 c14718 = this.f42870;
        if (c14718.m35413(c12328, i, iM4698)) {
            List list = c12328.f39608;
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(iM4700));
            while (true) {
                if (i >= 0) {
                    AbstractC12384 abstractC12384 = (AbstractC12384) list.get(i);
                    if (C14565.m35129(abstractC12384)) {
                        if (abstractC12384.mo30864() == EnumC22631.f73416) {
                            if (hashSet.contains(Integer.valueOf(((InterfaceC12142) abstractC12384).mo1542())) && ((InterfaceC19775) ((InterfaceC6177) abstractC12384).getReference()).getType().equals("Ljava/lang/String;")) {
                                c24055 = (C24055) abstractC12384;
                                break;
                            }
                        } else {
                            if (!C14565.m35131(abstractC12384)) {
                                C24869.m55395(abstractC12384, false, new C15706(hashSet));
                            } else if (hashSet.contains(Integer.valueOf(((InterfaceC12142) abstractC12384).mo1542()))) {
                                hashSet.add(Integer.valueOf(((InterfaceC18109) abstractC12384).mo1541()));
                            }
                            if (hashSet.isEmpty() || !((AbstractCollection) abstractC12384.m30863().m24747()).isEmpty()) {
                            }
                        }
                        i--;
                    }
                }
                c24055 = null;
                break;
            }
            this.f42868 = c24055;
            if (c24055 == null) {
                C17359.toString(c5122);
                return null;
            }
            return new String(c14718.m35414());
        }
        C17359.toString(c5122);
        return null;
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo33130(C9497 c9497) {
        return this.f42868.mo1542();
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public final void mo12250(C12328 c12328, C16057 c16057, C1295 c1295, C9497 c9497) {
        int iM24745 = this.f42868.m30863().m24745();
        C10628 c10628 = c12328.f39606;
        c10628.m27115(iM24745, c16057);
        c10628.m27116(c1295.m4694());
        this.f42870.m35412(c12328);
    }
}
