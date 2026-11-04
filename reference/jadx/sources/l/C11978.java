package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T8YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11978 extends AbstractC17376 {
    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final void mo12252(InterfaceC20029 interfaceC20029, AbstractC11528 abstractC11528, InterfaceC13864 interfaceC13864) {
        if (interfaceC13864.mo14577()) {
            InterfaceC8644 interfaceC8644Mo14574 = interfaceC13864.mo14574();
            boolean zEquals = "ol".equals(interfaceC8644Mo14574.name());
            boolean zEquals2 = "ul".equals(interfaceC8644Mo14574.name());
            if (zEquals || zEquals2) {
                C10420 c10420Mo7360 = interfaceC20029.mo7360();
                InterfaceC17045 interfaceC17045Mo7334 = interfaceC20029.mo7334();
                InterfaceC16299 interfaceC16299Mo15471 = c10420Mo7360.m26736().mo15471(C14007.class);
                int i = 0;
                InterfaceC8644 interfaceC8644Mo14576 = interfaceC8644Mo14574;
                while (true) {
                    interfaceC8644Mo14576 = interfaceC8644Mo14576.mo14576();
                    if (interfaceC8644Mo14576 == null) {
                        break;
                    } else if ("ul".equals(interfaceC8644Mo14576.name()) || "ol".equals(interfaceC8644Mo14576.name())) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC8644 interfaceC8644 : interfaceC8644Mo14574.mo14578()) {
                    AbstractC17376.m40819(interfaceC20029, abstractC11528, interfaceC8644);
                    final int[] iArr = {0};
                    if (zEquals) {
                        AbstractC22881.f74342.m29674(interfaceC20029.mo7334(), new InterfaceC10946() { // from class: l.֫᩻᩹
                            @Override // l.InterfaceC10946
                            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                            public final int mo7733() {
                                return iArr[0];
                            }
                        });
                    }
                    if (interfaceC16299Mo15471 != null && "li".equals(interfaceC8644.name())) {
                        if (zEquals) {
                            AbstractC22881.f74344.m29674(interfaceC17045Mo7334, EnumC22135.ORDERED);
                            C11824 c11824 = AbstractC22881.f74343;
                            iArr[0] = i2;
                            c11824.m29674(interfaceC17045Mo7334, Integer.valueOf(i2));
                            i2++;
                        } else {
                            AbstractC22881.f74344.m29674(interfaceC17045Mo7334, EnumC22135.BULLET);
                            AbstractC22881.f74339.m29674(interfaceC17045Mo7334, Integer.valueOf(i));
                        }
                        C20775.m47526(interfaceC20029.builder(), interfaceC16299Mo15471.mo6845(c10420Mo7360, interfaceC17045Mo7334), interfaceC8644.start(), interfaceC8644.end());
                    }
                }
            }
        }
    }

    @Override // l.AbstractC17376
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo12251() {
        return Arrays.asList("ol", "ul");
    }
}
