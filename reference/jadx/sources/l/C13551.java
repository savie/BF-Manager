package l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.۬ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13551 extends C4777 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public AbstractC24915 f43038;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C15789 f43039;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f43040;

    public C13551(AbstractC17455 abstractC17455, float... fArr) {
        super(abstractC17455);
        mo14747(fArr);
        if (abstractC17455 instanceof AbstractC24915) {
            this.f43038 = (AbstractC24915) this.f16766;
        }
    }

    @Override // l.C4777
    /* JADX INFO: renamed from: ۙ */
    public final void mo14747(float... fArr) {
        super.mo14747(fArr);
        this.f43039 = this.f16763;
    }

    @Override // l.C4777
    /* JADX INFO: renamed from: ۙ */
    public final void mo14743(float f) {
        this.f43040 = this.f43039.m37719(f);
    }

    @Override // l.C4777
    /* JADX INFO: renamed from: ۙ */
    public final Float mo14742() {
        return Float.valueOf(this.f43040);
    }

    @Override // l.C4777
    public final Object clone() {
        C13551 c13551 = (C13551) super.clone();
        c13551.f43039 = c13551.f16763;
        return c13551;
    }

    @Override // l.C4777
    public final C4777 clone() {
        C13551 c13551 = (C13551) super.clone();
        c13551.f43039 = c13551.f16763;
        return c13551;
    }

    @Override // l.C4777
    /* JADX INFO: renamed from: ۙ */
    public final void mo14745(Object obj) {
        Object[] objArr = this.f16767;
        AbstractC24915 abstractC24915 = this.f43038;
        if (abstractC24915 != null) {
            abstractC24915.mo1285(obj, this.f43040);
            return;
        }
        AbstractC17455 abstractC17455 = this.f16766;
        if (abstractC17455 != null) {
            abstractC17455.mo39478(obj, Float.valueOf(this.f43040));
            return;
        }
        if (this.f16764 != null) {
            try {
                objArr[0] = Float.valueOf(this.f43040);
                this.f16764.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    @Override // l.C4777
    /* JADX INFO: renamed from: ۙ */
    public final void mo14744(Class cls) {
        if (this.f16766 != null) {
            return;
        }
        super.mo14744(cls);
    }
}
