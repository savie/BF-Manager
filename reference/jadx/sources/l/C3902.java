package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IC7P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3902 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C1028 f13306 = C1028.m3931(C5085.m15362("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C1028 f13301 = C1028.m3931(C5085.m15362("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C1028 f13307 = C1028.m3931(C5085.m15362("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C1028 f13305 = C1028.m3931(C5085.m15362("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C1028 f13304 = C1028.m3931(C5085.m15362("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C1028 f13300 = C1028.m3931(C5085.m15362("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1028 f13298 = C1028.m3931(C5085.m15362("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1028 f13302 = C1028.m3931(C5085.m15362("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9976 f13299 = new C9976("accessFlags");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C9976 f13303 = new C9976("name");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C9976 f13308 = new C9976(b.d);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12544(C8791 c8791) {
        C8791 c8792 = new C8791(f13306, EnumC7300.SYSTEM);
        c8792.m23589(new C21692(f13308, new C4757(c8791)));
        c8792.mo15005();
        return c8792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12543(C1028 c1028) {
        C8791 c8791 = new C8791(f13301, EnumC7300.SYSTEM);
        c8791.m23589(new C21692(f13308, c1028));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12548(C18181 c18181) {
        C8791 c8791 = new C8791(f13307, EnumC7300.SYSTEM);
        c8791.m23589(new C21692(f13308, c18181));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12546(C9976 c9976, int i) {
        C8791 c8791 = new C8791(f13305, EnumC7300.SYSTEM);
        AbstractC13487 abstractC13487 = c9976;
        if (c9976 == null) {
            abstractC13487 = C20419.f65422;
        }
        c8791.m23589(new C21692(f13303, abstractC13487));
        c8791.m23589(new C21692(f13299, C15943.m37967(i)));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12547(C13705 c13705) {
        C10722 c10722M12549 = m12549((InterfaceC11050) c13705);
        C8791 c8791 = new C8791(f13304, EnumC7300.SYSTEM);
        c8791.m23589(new C21692(f13308, c10722M12549));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8791 m12545(C9976 c9976) {
        C8791 c8791 = new C8791(f13300, EnumC7300.SYSTEM);
        String string = c9976.getString();
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
        C21911 c21911 = new C21911(size);
        for (int i3 = 0; i3 < size; i3++) {
            c21911.mo31602(i3, (AbstractC13487) new C9976((String) arrayList.get(i3)));
        }
        c21911.mo15005();
        c8791.m23589(new C21692(f13308, new C10722(c21911)));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8791 m12550(C9976 c9976) {
        C8791 c8791 = new C8791(f13298, EnumC7300.SYSTEM);
        c8791.m23589(new C21692(f13308, c9976));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8791 m12551(InterfaceC11050 interfaceC11050) {
        C10722 c10722M12549 = m12549(interfaceC11050);
        C8791 c8791 = new C8791(f13302, EnumC7300.SYSTEM);
        c8791.m23589(new C21692(f13308, c10722M12549));
        c8791.mo15005();
        return c8791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10722 m12549(InterfaceC11050 interfaceC11050) {
        int size = interfaceC11050.size();
        C21911 c21911 = new C21911(size);
        for (int i = 0; i < size; i++) {
            c21911.mo31602(i, (AbstractC13487) C1028.m3931(interfaceC11050.getType(i)));
        }
        c21911.mo15005();
        return new C10722(c21911);
    }
}
