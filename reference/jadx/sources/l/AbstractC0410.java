package l;

import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7D2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0410 implements InterfaceC12406 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f1900;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC9584 f1901;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC10434 f1902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC1260 f1903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f1904 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1905;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo2164(long j, String str, Object... objArr) {
        throw new C17344();
    }

    @Override // l.InterfaceC12406
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2149(long j, String str, Object... objArr) {
        throw new C17344();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m2158() {
        return this.f1905;
    }

    public AbstractC0410(AbstractC20167 abstractC20167) {
        this.f1902 = abstractC20167.f65481;
        this.f1901 = abstractC20167.f65480;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo2157(String str, Object... objArr) {
        throw new C17344();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2153(InterfaceC1260 interfaceC1260) {
        this.f1903 = interfaceC1260;
        this.f1901.mo23027(interfaceC1260);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m2166() {
        this.f1905 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m2147() {
        return this.f1904;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m2169() {
        this.f1904 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m2145() {
        return this.f1901.m24459();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m2156() {
        String strM24459 = this.f1901.m24459();
        return strM24459.contains(".") ? strM24459.substring(0, strM24459.indexOf(46)) : strM24459;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1260 m2168() {
        return this.f1903;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataInputStream m2148() {
        C13638.requireNonNull(this.f1903, "Input must be defined.");
        return this.f1903.mo4569(C11521.of(this));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m2146(String str, Object... objArr) {
        if (this.f1905) {
            AbstractC21016 abstractC21016 = this.f1901.f32305;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC21016.mo20147(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2152(Supplier supplier) {
        if (this.f1905) {
            this.f1901.f32305.mo20147((String) supplier.get());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m2160(String str, Object... objArr) {
        if (this.f1905) {
            AbstractC21016 abstractC21016 = this.f1901.f32305;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC21016.mo20145(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2150(String str, Object... objArr) {
        this.f1901.mo24457(str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2151(Throwable th) {
        this.f1901.mo24458(th);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m2162(String str, Object... objArr) {
        return this.f1901.mo23029(str, objArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2165(Throwable th) {
        if (this.f1900) {
            this.f1901.f32305.mo20146(th);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC10434 m2144() {
        return this.f1902;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2155(C21722 c21722) {
        this.f1902 = c21722;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m2161() {
        return this.f1900;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m2167() {
        this.f1900 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2154(C7611 c7611) {
        this.f1901.f32305 = c7611;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC21016 m2159() {
        return this.f1901.f32305;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9584 m2163() {
        return this.f1901;
    }
}
