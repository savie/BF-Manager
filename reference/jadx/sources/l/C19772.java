package l;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O7M7 */
/* JADX INFO: loaded from: classes5.dex */
public class C19772 implements InterfaceC13464 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f63526;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 f63527;

    public /* synthetic */ C19772(InterfaceC13464 interfaceC13464, InterfaceC0762 interfaceC0762) {
        this(interfaceC13464, (InterfaceC13464) interfaceC0762);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44965(C12343 c12343, InterfaceC13464 interfaceC13464, InterfaceC13464 interfaceC13465) {
        Object c19772;
        c12343.m30657(InterfaceC13464.class, (Object) null);
        if (interfaceC13465 instanceof InterfaceC0762) {
            c19772 = new C8483(interfaceC13464, (InterfaceC0762) interfaceC13465);
        } else {
            c19772 = new C19772(interfaceC13464, interfaceC13465);
        }
        c12343.m30657(InterfaceC13464.class, c19772);
    }

    public C19772(InterfaceC13464 interfaceC13464, InterfaceC13464 interfaceC13465) {
        this.f63527 = interfaceC13464;
        this.f63526 = interfaceC13465;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private InterfaceC13464 m44966(InterfaceC4290 interfaceC4290) {
        InterfaceC13464 interfaceC13464 = this.f63527;
        return interfaceC13464.mo32953(interfaceC4290) ? interfaceC13464 : this.f63526;
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۨ */
    public final ClassLoader mo32955(InterfaceC4290 interfaceC4290) {
        return m44966(interfaceC4290).mo32955(interfaceC4290);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo32947(InterfaceC4290 interfaceC4290, String str, Set set, boolean z) {
        return m44966(interfaceC4290).mo32947(interfaceC4290, str, set, z);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final String mo32948(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173) {
        return m44966(interfaceC4290).mo32948(interfaceC4290, interfaceC2173);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public boolean mo22150(InterfaceC3458 interfaceC3458, InterfaceC3458 interfaceC3459) {
        return this.f63526.mo22150(interfaceC3458, interfaceC3459);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10918(Iterator it, String str) {
        return this.f63526.mo10918(it, str);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32953(InterfaceC4290 interfaceC4290) {
        return this.f63527.mo32953(interfaceC4290) || this.f63526.mo32953(interfaceC4290);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2173 mo32950(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347) {
        return m44966(interfaceC4290).mo32950(interfaceC4290, str, enumC11347);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2173 mo32951(InterfaceC4290 interfaceC4290, String str, EnumC11347 enumC11347, InterfaceC3458 interfaceC3458) {
        return m44966(interfaceC4290).mo32951(interfaceC4290, str, enumC11347, interfaceC3458);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3458 mo32952(InterfaceC4290 interfaceC4290, String str) {
        return m44966(interfaceC4290).mo32952(interfaceC4290, str);
    }

    @Override // l.InterfaceC13464, java.io.Flushable
    public final void flush() {
        this.f63527.flush();
        this.f63526.flush();
    }

    @Override // l.InterfaceC13464, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63527.close();
        this.f63526.close();
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo32957(InterfaceC4290 interfaceC4290, String str) {
        return m44966(interfaceC4290).mo32957(interfaceC4290, str);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo32958(InterfaceC4290 interfaceC4290, InterfaceC2173 interfaceC2173) {
        return m44966(interfaceC4290).mo32958(interfaceC4290, interfaceC2173);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final ServiceLoader mo32949(InterfaceC4290 interfaceC4290, Class cls) {
        return m44966(interfaceC4290).mo32949(interfaceC4290, cls);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۖ */
    public final String mo32946(InterfaceC4290 interfaceC4290) {
        return m44966(interfaceC4290).mo32946(interfaceC4290);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ܰ */
    public final Iterable mo32956(InterfaceC4290 interfaceC4290) {
        return m44966(interfaceC4290).mo32956(interfaceC4290);
    }

    @Override // l.InterfaceC13464
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32954(InterfaceC4290 interfaceC4290, InterfaceC3458 interfaceC3458) {
        return m44966(interfaceC4290).mo32954(interfaceC4290, interfaceC3458);
    }

    @Override // l.InterfaceC4996
    /* JADX INFO: renamed from: ۙ */
    public final int mo10912(String str) {
        return this.f63526.mo10912(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13464 m44967() {
        return this.f63526;
    }
}
