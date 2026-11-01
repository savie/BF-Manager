package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IC7P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9964 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34067 = C6143.m17126(C3320.m9826("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34065 = C6143.m17126(C3320.m9826("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34060 = C6143.m17126(C3320.m9826("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34063 = C6143.m17126(C3320.m9826("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6143 f34068 = C6143.m17126(C3320.m9826("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C6143 f34066 = C6143.m17126(C3320.m9826("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34061 = C6143.m17126(C3320.m9826("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C6143 f34064 = C6143.m17126(C3320.m9826("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17432 f34062 = new C17432("accessFlags");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C17432 f34059 = new C17432("name");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C17432 f34069 = new C17432(b.d);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25232(C23535 c23535) {
        C23535 c23536 = new C23535(f34067, EnumC14363.SYSTEM);
        c23536.m51862(new C3072(f34069, new C3549(c23535)));
        c23536.mo9637();
        return c23536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25227(C6143 c6143) {
        C23535 c23535 = new C23535(f34065, EnumC14363.SYSTEM);
        c23535.m51862(new C3072(f34069, c6143));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25231(C20255 c20255) {
        C23535 c23535 = new C23535(f34060, EnumC14363.SYSTEM);
        c23535.m51862(new C3072(f34069, c20255));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25230(C17432 c17432, int i) {
        C23535 c23535 = new C23535(f34063, EnumC14363.SYSTEM);
        AbstractC9901 abstractC9901 = c17432;
        if (c17432 == null) {
            abstractC9901 = C8260.f28720;
        }
        c23535.m51862(new C3072(f34059, abstractC9901));
        c23535.m51862(new C3072(f34062, C21665.m48398(i)));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25228(C9672 c9672) {
        C13905 c13905M25226 = m25226((InterfaceC14093) c9672);
        C23535 c23535 = new C23535(f34068, EnumC14363.SYSTEM);
        c23535.m51862(new C3072(f34069, c13905M25226));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23535 m25229(C17432 c17432) {
        C23535 c23535 = new C23535(f34066, EnumC14363.SYSTEM);
        String string = c17432.getString();
        int length = string.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (string.charAt(i) == 'L') {
                while (i2 < length) {
                    char cCharAt = string.charAt(i2);
                    if (cCharAt == ';') {
                        i2++;
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i2++;
                }
            } else {
                while (i2 < length && string.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(string.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        C4731 c4731 = new C4731(size);
        for (int i3 = 0; i3 < size; i3++) {
            c4731.mo15257(i3, (AbstractC9901) new C17432((String) arrayList.get(i3)));
        }
        c4731.mo9637();
        c23535.m51862(new C3072(f34069, new C13905(c4731)));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23535 m25234(C17432 c17432) {
        C23535 c23535 = new C23535(f34061, EnumC14363.SYSTEM);
        c23535.m51862(new C3072(f34069, c17432));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23535 m25233(InterfaceC14093 interfaceC14093) {
        C13905 c13905M25226 = m25226(interfaceC14093);
        C23535 c23535 = new C23535(f34064, EnumC14363.SYSTEM);
        c23535.m51862(new C3072(f34069, c13905M25226));
        c23535.mo9637();
        return c23535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13905 m25226(InterfaceC14093 interfaceC14093) {
        int size = interfaceC14093.size();
        C4731 c4731 = new C4731(size);
        for (int i = 0; i < size; i++) {
            c4731.mo15257(i, (AbstractC9901) C6143.m17126(interfaceC14093.getType(i)));
        }
        c4731.mo9637();
        return new C13905(c4731);
    }
}
