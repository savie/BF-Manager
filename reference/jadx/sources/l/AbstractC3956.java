package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3956 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC11368 f14700;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f14701;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f14702;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f14703;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5135(int i, AbstractC23903 abstractC23903);

    public AbstractC3956(C0429 c0429, AbstractC11242 abstractC11242, EnumC11368 enumC11368, Set set) {
        this.f14702 = c0429;
        this.f14703 = abstractC11242;
        this.f14700 = enumC11368;
        this.f14701 = set;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo11442(EnumC13130 enumC13130) {
        if (this.f14701.contains(enumC13130)) {
            C0429 c0429 = this.f14702;
            int i = c0429.f1966;
            HashSet hashSet = c0429.f1965;
            C20414 c20414 = c0429.f1970;
            EnumC11368 enumC11368 = this.f14700;
            int i2 = enumC11368.f38348;
            if (i > i2 || (i == i2 && c0429.f1988 >= enumC11368.f38349)) {
                return true;
            }
            if (c0429.f1968) {
                AbstractC11242 abstractC11242 = this.f14703;
                if (!hashSet.contains(abstractC11242)) {
                    InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c0429.f1975);
                    try {
                        EnumC0597 enumC0597 = EnumC0597.CLASSFILE;
                        int i3 = enumC11368.f38348;
                        int i4 = enumC11368.f38349;
                        int i5 = c0429.f1966;
                        int i6 = c0429.f1988;
                        C14065 c14065 = C9768.f32836;
                        c20414.m48203(enumC0597, (InterfaceC12260) null, new C14065("compiler", "future.attr", abstractC11242, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                        c20414.m48202(interfaceC2173M48202);
                        hashSet.add(abstractC11242);
                    } catch (Throwable th) {
                        c20414.m48202(interfaceC2173M48202);
                        throw th;
                    }
                }
            }
        }
        return false;
    }
}
