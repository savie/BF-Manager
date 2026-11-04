package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f47988;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f47989;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f47990;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC3539 f47991;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2564(int i, AbstractC11781 abstractC11781);

    public AbstractC14681(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, Set set) {
        this.f47989 = c11172;
        this.f47990 = abstractC19728;
        this.f47991 = enumC3539;
        this.f47988 = set;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo32705(EnumC4241 enumC4241) {
        if (this.f47988.contains(enumC4241)) {
            C11172 c11172 = this.f47989;
            int i = c11172.f35215;
            HashSet hashSet = c11172.f35193;
            C7312 c7312 = c11172.f35184;
            EnumC3539 enumC3539 = this.f47991;
            int i2 = enumC3539.f12156;
            if (i > i2 || (i == i2 && c11172.f35179 >= enumC3539.f12157)) {
                return true;
            }
            if (c11172.f35194) {
                AbstractC19728 abstractC19728 = this.f47990;
                if (!hashSet.contains(abstractC19728)) {
                    InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c11172.f35182);
                    try {
                        EnumC19876 enumC19876 = EnumC19876.CLASSFILE;
                        int i3 = enumC3539.f12156;
                        int i4 = enumC3539.f12157;
                        int i5 = c11172.f35215;
                        int i6 = c11172.f35179;
                        C25213 c25213 = C13146.f42046;
                        c7312.m34532(enumC19876, (InterfaceC5075) null, new C25213("compiler", "future.attr", abstractC19728, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                        c7312.m34530(interfaceC15976M34530);
                        hashSet.add(abstractC19728);
                    } catch (Throwable th) {
                        c7312.m34530(interfaceC15976M34530);
                        throw th;
                    }
                }
            }
        }
        return false;
    }
}
