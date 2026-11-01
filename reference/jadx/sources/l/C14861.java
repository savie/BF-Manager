package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܳ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14861 extends AbstractC3382 {
    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final void mo3244(InterfaceC12061 interfaceC12061, AbstractC4332 abstractC4332, InterfaceC21022 interfaceC21022) {
        if (interfaceC21022.mo38114()) {
            InterfaceC10440 interfaceC10440Mo38112 = interfaceC21022.mo38112();
            boolean zEquals = "ol".equals(interfaceC10440Mo38112.name());
            boolean zEquals2 = "ul".equals(interfaceC10440Mo38112.name());
            if (zEquals || zEquals2) {
                C18410 c18410Mo29970 = interfaceC12061.mo29970();
                InterfaceC9239 interfaceC9239Mo29965 = interfaceC12061.mo29965();
                InterfaceC4774 interfaceC4774Mo19014 = c18410Mo29970.m42695().mo19014(C8078.class);
                int i = 0;
                InterfaceC10440 interfaceC10440Mo26356 = interfaceC10440Mo38112;
                while (true) {
                    interfaceC10440Mo26356 = interfaceC10440Mo26356.mo26356();
                    if (interfaceC10440Mo26356 == null) {
                        break;
                    } else if ("ul".equals(interfaceC10440Mo26356.name()) || "ol".equals(interfaceC10440Mo26356.name())) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC10440 interfaceC10440 : interfaceC10440Mo38112.mo26355()) {
                    AbstractC3382.m10034(interfaceC12061, abstractC4332, interfaceC10440);
                    final int[] iArr = {0};
                    if (zEquals) {
                        AbstractC16769.f53670.m34276(interfaceC12061.mo29965(), new InterfaceC0540() { // from class: l.᩻᩻ᩳ
                            @Override // l.InterfaceC0540
                            /* JADX INFO: renamed from: ۙ */
                            public final int mo2549() {
                                return iArr[0];
                            }
                        });
                    }
                    if (interfaceC4774Mo19014 != null && "li".equals(interfaceC10440.name())) {
                        if (zEquals) {
                            AbstractC16769.f53673.m34276(interfaceC9239Mo29965, EnumC20297.ORDERED);
                            C14178 c14178 = AbstractC16769.f53677;
                            iArr[0] = i2;
                            c14178.m34276(interfaceC9239Mo29965, Integer.valueOf(i2));
                            i2++;
                        } else {
                            AbstractC16769.f53673.m34276(interfaceC9239Mo29965, EnumC20297.BULLET);
                            AbstractC16769.f53672.m34276(interfaceC9239Mo29965, Integer.valueOf(i));
                        }
                        C2657.m8180(interfaceC12061.builder(), interfaceC4774Mo19014.mo6311(c18410Mo29970, interfaceC9239Mo29965), interfaceC10440.start(), interfaceC10440.end());
                    }
                }
            }
        }
    }

    @Override // l.AbstractC3382
    /* JADX INFO: renamed from: ۙ */
    public final Collection mo3243() {
        return Arrays.asList("ol", "ul");
    }
}
