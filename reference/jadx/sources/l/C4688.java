package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4F7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4688 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f16551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6595 f16552;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16553;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16554;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7954 f16555;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f16556;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2668 f16557;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f16558;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC19887 f16559;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f16560;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14600 f16561;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19076 f16562;

    public C4688(ArrayList arrayList, C19076 c19076, InterfaceC2668 interfaceC2668, C14600 c14600, int i, C7954 c7954, InterfaceC6595 interfaceC6595, AbstractC19887 abstractC19887, int i2, int i3, int i4) {
        this.f16553 = arrayList;
        this.f16561 = c14600;
        this.f16562 = c19076;
        this.f16557 = interfaceC2668;
        this.f16556 = i;
        this.f16555 = c7954;
        this.f16552 = interfaceC6595;
        this.f16559 = abstractC19887;
        this.f16554 = i2;
        this.f16551 = i3;
        this.f16558 = i4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14600 m14557() {
        return this.f16561;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m14561() {
        return this.f16554;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14559() {
        return this.f16551;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14552() {
        return this.f16558;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19076 m14556() {
        return this.f16562;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2668 m14560() {
        return this.f16557;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6595 m14553() {
        return this.f16552;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC19887 m14562() {
        return this.f16559;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7954 m14558() {
        return this.f16555;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m14554(C7954 c7954) {
        return m14555(c7954, this.f16562, this.f16557, this.f16561);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m14555(C7954 c7954, C19076 c19076, InterfaceC2668 interfaceC2668, C14600 c14600) {
        ArrayList arrayList = this.f16553;
        int size = arrayList.size();
        int i = this.f16556;
        if (i >= size) {
            throw new AssertionError();
        }
        this.f16560++;
        InterfaceC2668 interfaceC2669 = this.f16557;
        if (interfaceC2669 != null && !this.f16561.m35245(c7954.m21649())) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (interfaceC2669 != null && this.f16560 > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i2 = i + 1;
        C4688 c4688 = new C4688(arrayList, c19076, interfaceC2668, c14600, i2, c7954, this.f16552, this.f16559, this.f16554, this.f16551, this.f16558);
        InterfaceC17649 interfaceC17649 = (InterfaceC17649) arrayList.get(i);
        C9444 c9444Mo19233 = interfaceC17649.mo19233(c4688);
        if (interfaceC2668 != null && i2 < arrayList.size() && c4688.f16560 != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC17649 + " must call proceed() exactly once");
        }
        if (c9444Mo19233 == null) {
            throw new NullPointerException("interceptor " + interfaceC17649 + " returned null");
        }
        if (c9444Mo19233.m24818() != null) {
            return c9444Mo19233;
        }
        throw new IllegalStateException("interceptor " + interfaceC17649 + " returned a response with no body");
    }
}
