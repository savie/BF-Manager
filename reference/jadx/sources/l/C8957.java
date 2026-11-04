package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes3.dex */
public class C8957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 f29211;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC7466 f29212;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29213;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29214;

    public C8957(EnumC7466 enumC7466, int i, int i2, C14769 c14769) {
        this.f29212 = enumC7466;
        this.f29214 = i;
        this.f29213 = i2;
        this.f29211 = c14769;
        mo5352();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5352() {
        EnumC2991 enumC2991 = this.f29212.f24715;
        EnumC2991 enumC2992 = EnumC2991.DEFAULT;
        if (enumC2991 == enumC2992) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC2992);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC19728 mo23945() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String mo23943() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩴ */
    public int mo5353() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19399 m23944() {
        C14769 c14769M23941 = m23941(EnumC8212.JAVADOC);
        if (c14769M23941.isEmpty()) {
            return null;
        }
        return (InterfaceC19399) c14769M23941.f48335;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m23942() {
        Iterator it = m23941(EnumC8212.JAVADOC).iterator();
        while (it.hasNext()) {
            if (((InterfaceC19399) it.next()).isDeprecated()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m23941(EnumC8212 enumC8212) {
        C14769<InterfaceC19399> c14769 = this.f29211;
        if (c14769 == null) {
            return C14769.m35543();
        }
        C18499 c18499 = new C18499();
        for (InterfaceC19399 interfaceC19399 : c14769) {
            if (interfaceC19399.getStyle() == enumC8212) {
                c18499.m43089(interfaceC19399);
            }
        }
        return c18499.m43093();
    }
}
