package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P3JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7704 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC18560 f25412;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7704 f25413;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19637 f25414;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7704 m20981(InterfaceC18560 interfaceC18560, C7926 c7926) {
        C7704 c7704 = new C7704(null, interfaceC18560);
        if (c7704.f25414 == c7926) {
            return c7704;
        }
        try {
            new C18145().m43809(c7704, c7926);
            return null;
        } catch (C0246 e) {
            return e.f1515;
        }
    }

    public C7704(C7704 c7704, InterfaceC19637 interfaceC19637) {
        if (interfaceC19637.mo2283() == EnumC22621.COMPILATION_UNIT) {
            this.f25412 = (InterfaceC18560) interfaceC19637;
            this.f25413 = null;
        } else {
            this.f25412 = c7704.f25412;
            this.f25413 = c7704;
        }
        this.f25414 = interfaceC19637;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18560 m20985() {
        return this.f25412;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19637 m20984() {
        return this.f25414;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21129(this);
    }
}
