package l;

import java.io.DataInputStream;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7D2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12931 implements InterfaceC1745 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC18152 f41419;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f41420;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f41421;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC13676 f41422;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41423 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC3236 f41424;

    /* JADX INFO: renamed from: ᩷ */
    public void mo4166(long j, String str, Object... objArr) {
        throw new C11439();
    }

    @Override // l.InterfaceC1745
    /* JADX INFO: renamed from: ۙ */
    public void mo4159(long j, String str, Object... objArr) {
        throw new C11439();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32305() {
        return this.f41421;
    }

    public AbstractC12931(AbstractC15168 abstractC15168) {
        this.f41422 = abstractC15168.f49462;
        this.f41424 = abstractC15168.f49461;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo4165(String str, Object... objArr) {
        throw new C11439();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4161(InterfaceC18152 interfaceC18152) {
        this.f41419 = interfaceC18152;
        this.f41424.mo10584(interfaceC18152);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m32308() {
        this.f41421 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32296() {
        return this.f41423;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m32316() {
        this.f41423 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m32310() {
        String strM10585 = this.f41424.m10585();
        return strM10585.contains(".") ? strM10585.substring(0, strM10585.indexOf(46)) : strM10585;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m32314() {
        return this.f41424.m10585();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18152 m32307() {
        return this.f41419;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataInputStream m32297() {
        C17359.requireNonNull(this.f41419, "Input must be defined.");
        return this.f41419.mo30461(C15867.of(this));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32315(String str, Object... objArr) {
        if (this.f41421) {
            AbstractC22078 abstractC22078 = this.f41424.f10544;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC22078.mo15108(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32299(Supplier supplier) {
        if (this.f41421) {
            this.f41424.f10544.mo15108((String) supplier.get());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32304(String str, Object... objArr) {
        if (this.f41421) {
            AbstractC22078 abstractC22078 = this.f41424.f10544;
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            abstractC22078.mo15110(str);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4160(String str, Object... objArr) {
        this.f41424.mo10582(str, objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32298(Throwable th) {
        this.f41424.mo10583(th);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m32311(String str, Object... objArr) {
        return this.f41424.mo10586(str, objArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32313(Throwable th) {
        if (this.f41420) {
            this.f41424.f10544.mo15106(th);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13676 m32306() {
        return this.f41422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32300(C0999 c0999) {
        this.f41422 = c0999;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m32302() {
        return this.f41420;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32309() {
        this.f41420 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32301(C4924 c4924) {
        this.f41424.f10544 = c4924;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22078 m32303() {
        return this.f41424.f10544;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC3236 m32312() {
        return this.f41424;
    }
}
