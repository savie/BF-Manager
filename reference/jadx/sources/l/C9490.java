package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۢۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9490 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17148 f32104;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32098 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32099 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32103 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f32102 = new ArrayList();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f32105 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet f32095 = new HashSet();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f32101 = C8057.m21192();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public EnumC23601 f32096 = EnumC23601.NONE;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f32100 = 100;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f32097 = 100;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4590 m24309() {
        return new C4590(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24310(Iterable iterable) {
        C13638.requireNonNull(iterable, "extensions must not be null");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC21772 interfaceC21772 = (InterfaceC21772) it.next();
            if (interfaceC21772 instanceof InterfaceC3138) {
                ((InterfaceC3138) interfaceC21772).mo9510(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24316(EnumC23601 enumC23601) {
        this.f32096 = enumC23601;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24312(AbstractC15175 abstractC15175) {
        this.f32098.add(abstractC15175);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24315(InterfaceC22230 interfaceC22230) {
        this.f32099.add(interfaceC22230);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24314(C19656 c19656) {
        this.f32103.add(c19656);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24311(C2411 c2411) {
        this.f32105.add(c2411);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24313(C17148 c17148) {
        this.f32104 = c17148;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static InterfaceC1727 m24308(C9490 c9490) {
        C17148 c17148 = c9490.f32104;
        return c17148 != null ? c17148 : new C0252(9);
    }
}
