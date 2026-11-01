package l;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7066 extends AbstractC12006 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C13784 f23720;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17055 f23721;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16715 f23722;

    @Override // l.AbstractC1421
    /* JADX INFO: renamed from: ۙ */
    public final String mo4983() {
        return "NewStringBytes";
    }

    public C7066(C5655 c5655, InterfaceC8706 interfaceC8706) {
        super(c5655, interfaceC8706);
        this.f23721 = new C17055("Ljava/lang/String;", "<init>", "V", Collections.singletonList("[B"));
        this.f23722 = new C16715(c5655);
        this.f40233 = EnumC14599.DIRECT;
        this.f40239 = false;
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ */
    public final List mo8585(C5655 c5655) {
        return Collections.singletonList(this.f23721);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo18934(C10124 c10124, C20700 c20700, C1897 c1897, int i) {
        C13784 c13784;
        int iM6186 = c1897.m6186();
        int iM6189 = c1897.m6189();
        C16715 c16715 = this.f23722;
        if (c16715.m39203(c20700, i, iM6189)) {
            List list = c20700.f67317;
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(iM6186));
            while (true) {
                if (i >= 0) {
                    AbstractC3384 abstractC3384 = (AbstractC3384) list.get(i);
                    if (C16467.m38735(abstractC3384)) {
                        if (abstractC3384.mo5435() == EnumC10297.f35226) {
                            if (hashSet.contains(Integer.valueOf(((InterfaceC4685) abstractC3384).mo1140())) && ((InterfaceC15914) ((InterfaceC13859) abstractC3384).getReference()).getType().equals("Ljava/lang/String;")) {
                                c13784 = (C13784) abstractC3384;
                                break;
                            }
                        } else {
                            if (!C16467.m38737(abstractC3384)) {
                                C17352.m40379(abstractC3384, false, new C4243(hashSet));
                            } else if (hashSet.contains(Integer.valueOf(((InterfaceC4685) abstractC3384).mo1140()))) {
                                hashSet.add(Integer.valueOf(((InterfaceC1157) abstractC3384).mo1144()));
                            }
                            if (hashSet.isEmpty() || !((AbstractCollection) abstractC3384.m10035().m36037()).isEmpty()) {
                            }
                        }
                        i--;
                    }
                }
                c13784 = null;
                break;
            }
            this.f23720 = c13784;
            if (c13784 == null) {
                C13638.toString(c10124);
                return null;
            }
            return new String(c16715.m39204());
        }
        C13638.toString(c10124);
        return null;
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18933(C9660 c9660) {
        return this.f23720.mo1140();
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18935(C20700 c20700, C19289 c19289, C1897 c1897, C9660 c9660) {
        int iM36038 = this.f23720.m10035().m36038();
        C10111 c10111 = c20700.f67315;
        c10111.m25738(iM36038, c19289);
        c10111.m25739(c1897.m6187());
        this.f23722.m39202(c20700);
    }
}
