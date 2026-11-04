package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۨ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11991 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10083 f38641;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38636 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38642 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f38643 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38637 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f38645 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet f38640 = new HashSet();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f38638 = C5147.m15554();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC15720 f38644 = EnumC15720.NONE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38639 = 100;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38635 = 100;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23926 m30140() {
        return new C23926(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30141(Iterable iterable) {
        C17359.requireNonNull(iterable, "extensions must not be null");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC6881 interfaceC6881 = (InterfaceC6881) it.next();
            if (interfaceC6881 instanceof InterfaceC6026) {
                ((InterfaceC6026) interfaceC6881).mo13408(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30146(EnumC15720 enumC15720) {
        this.f38644 = enumC15720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30143(AbstractC2297 abstractC2297) {
        this.f38636.add(abstractC2297);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30142(InterfaceC0059 interfaceC0059) {
        this.f38642.add(interfaceC0059);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30145(C10914 c10914) {
        this.f38643.add(c10914);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30147(C18373 c18373) {
        this.f38645.add(c18373);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30144(C10083 c10083) {
        this.f38641 = c10083;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC3042 m30139(C11991 c11991) {
        C10083 c10083 = c11991.f38641;
        return c10083 != null ? c10083 : new C20196();
    }
}
