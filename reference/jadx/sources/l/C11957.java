package l;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 57Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11957 implements InterfaceC14415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3163 f38502;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC14415[] f38503 = f38500;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13477 f38501 = new C13477();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC14415[] f38500 = new InterfaceC14415[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11957 m29925(C4747 c4747) {
        C11957 c11957 = (C11957) c4747.m14643(f38501);
        return c11957 == null ? new C11957(c4747) : c11957;
    }

    public C11957(C4747 c4747) {
        c4747.m14646(f38501, this);
        if (((C13669) c4747.m14642(C13669.class)) == null) {
            new HashMap();
        }
        this.f38502 = C3163.m10345(c4747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29927() {
        return this.f38503 == f38500;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29928(C3975 c3975) {
        C3163 c3163 = this.f38502;
        InterfaceC23301 interfaceC23301M10346 = c3163.m10346(c3163.f10267);
        try {
            for (InterfaceC14415 interfaceC14415 : this.f38503) {
                ((C11957) interfaceC14415).m29928(c3975);
            }
            c3163.m10346(interfaceC23301M10346);
        } catch (Throwable th) {
            c3163.m10346(interfaceC23301M10346);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29926(C3975 c3975) {
        C3163 c3163 = this.f38502;
        InterfaceC23301 interfaceC23301M10346 = c3163.m10346(c3163.f10267);
        try {
            for (InterfaceC14415 interfaceC14415 : this.f38503) {
                ((C11957) interfaceC14415).m29926(c3975);
            }
            c3163.m10346(interfaceC23301M10346);
        } catch (Throwable th) {
            c3163.m10346(interfaceC23301M10346);
            throw th;
        }
    }

    public final String toString() {
        return Arrays.toString(this.f38503);
    }
}
