package l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩷᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21085 extends C16147 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C4857 f68688;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2034 f68689;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f68690;

    public C21085(AbstractC3445 abstractC3445, float... fArr) {
        super(abstractC3445);
        mo38226(fArr);
        if (abstractC3445 instanceof AbstractC2034) {
            this.f68689 = (AbstractC2034) this.f52189;
        }
    }

    @Override // l.C16147
    /* JADX INFO: renamed from: ۙ */
    public final void mo38226(float... fArr) {
        super.mo38226(fArr);
        this.f68688 = this.f52192;
    }

    @Override // l.C16147
    /* JADX INFO: renamed from: ۙ */
    public final void mo38222(float f) {
        this.f68690 = this.f68688.m13555(f);
    }

    @Override // l.C16147
    /* JADX INFO: renamed from: ۙ */
    public final Float mo38221() {
        return Float.valueOf(this.f68690);
    }

    @Override // l.C16147
    public final Object clone() {
        C21085 c21085 = (C21085) super.clone();
        c21085.f68688 = c21085.f52192;
        return c21085;
    }

    @Override // l.C16147
    public final C16147 clone() {
        C21085 c21085 = (C21085) super.clone();
        c21085.f68688 = c21085.f52192;
        return c21085;
    }

    @Override // l.C16147
    /* JADX INFO: renamed from: ۙ */
    public final void mo38224(Object obj) {
        Object[] objArr = this.f52195;
        AbstractC2034 abstractC2034 = this.f68689;
        if (abstractC2034 != null) {
            abstractC2034.mo6531(obj, this.f68690);
            return;
        }
        AbstractC3445 abstractC3445 = this.f52189;
        if (abstractC3445 != null) {
            abstractC3445.mo6532(obj, Float.valueOf(this.f68690));
            return;
        }
        if (this.f52188 != null) {
            try {
                objArr[0] = Float.valueOf(this.f68690);
                this.f52188.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    @Override // l.C16147
    /* JADX INFO: renamed from: ۙ */
    public final void mo38223(Class cls) {
        if (this.f52189 != null) {
            return;
        }
        super.mo38223(cls);
    }
}
