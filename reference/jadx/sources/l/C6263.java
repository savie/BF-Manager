package l;

import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۛ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C6263 extends AbstractC23903 implements InterfaceC18276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21226;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f21227;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f21228;

    @Override // l.AbstractC23903, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public int mo1941() {
        return 9;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC1923 mo17325() {
        long j = this.f77447;
        if ((8589934592L & j) != 0) {
            if (m17331()) {
                return EnumC1923.EXCEPTION_PARAMETER;
            }
            return EnumC1923.PARAMETER;
        }
        if ((16384 & j) != 0) {
            return EnumC1923.ENUM_CONSTANT;
        }
        EnumC10477 enumC10477 = this.f77448.f77452;
        if (enumC10477 == EnumC10477.f35865 || enumC10477 == EnumC10477.f35866) {
            return EnumC1923.FIELD;
        }
        if (m17329()) {
            return EnumC1923.RESOURCE_VARIABLE;
        }
        if ((j & 576460752303423488L) != 0) {
            return EnumC1923.BINDING_VARIABLE;
        }
        return EnumC1923.LOCAL_VARIABLE;
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo17328() {
        return this.f77449;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۬ */
    public InterfaceC14625 mo2880() {
        return this.f77448;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC11242 mo2883() {
        return this.f77453;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۘ */
    public /* bridge */ /* synthetic */ C21825 mo2878() {
        return mo2878();
    }

    public C6263(long j, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        super(EnumC10477.f35878, j, abstractC11242, abstractC16579, abstractC23903);
        this.f21226 = -1;
        this.f21228 = -1;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6263 mo17330(AbstractC23903 abstractC23903) {
        C17552 c17552 = new C17552(this, this.f77447, this.f77453, this.f77449, abstractC23903, abstractC23903);
        c17552.f21226 = this.f21226;
        c17552.f21228 = this.f21228;
        c17552.f21227 = this.f21227;
        return c17552;
    }

    @Override // l.AbstractC23903
    public final String toString() {
        return this.f77453.toString();
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 mo17326(AbstractC16579 abstractC16579, C23800 c23800) {
        return new C6263(this.f77447, this.f77453, c23800.m52409(this, abstractC16579), this.f77448);
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        return abstractC7693.mo20326(this, obj);
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final Object m17324() {
        return C20104.m45465(m17332(), this.f77449);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17331() {
        return this.f21227 == EnumC1923.EXCEPTION_PARAMETER;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17329() {
        return this.f21227 == EnumC1923.RESOURCE_VARIABLE;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final Object m17332() {
        Object obj = this.f21227;
        if (obj == EnumC1923.EXCEPTION_PARAMETER || obj == EnumC1923.RESOURCE_VARIABLE) {
            return null;
        }
        if (obj instanceof Callable) {
            Callable callable = (Callable) obj;
            this.f21227 = null;
            try {
                this.f21227 = callable.call();
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return this.f21227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17327(Object obj) {
        C6171.m17173(this, !(obj instanceof C4603));
        this.f21227 = obj;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo24873(this, (Object) locale);
    }
}
