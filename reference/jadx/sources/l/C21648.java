package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩶᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes.dex */
public final class C21648 extends AbstractC0765 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f69103;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69104;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f69105;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69106;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69107;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f69108;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69109;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21648(String str, Field field, boolean z, Method method, AbstractC17567 abstractC17567, AbstractC17567 abstractC17568, boolean z2, boolean z3) {
        super(str, field);
        this.f69107 = z;
        this.f69108 = method;
        this.f69105 = abstractC17567;
        this.f69103 = abstractC17568;
        this.f69106 = z2;
        this.f69104 = z3;
    }

    @Override // l.AbstractC0765
    /* JADX INFO: renamed from: ۙ */
    public final void mo3141(C21362 c21362, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f69107;
        Field field = this.f2771;
        Method method = this.f69108;
        if (z && !this.f69109) {
            if (method == null) {
                C1511.m5366(obj, field);
            } else {
                C1511.m5366(obj, method);
            }
            this.f69109 = true;
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C8113(C14442.m34865("Accessor ", C1971.m6781((AccessibleObject) method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c21362.m48589(this.f2772);
        this.f69105.mo3723(c21362, objInvoke);
    }

    @Override // l.AbstractC0765
    /* JADX INFO: renamed from: ۙ */
    public final void mo3139(C4208 c4208, int i, Object[] objArr) {
        Object objMo3722 = this.f69103.mo3722(c4208);
        if (objMo3722 == null && this.f69106) {
            throw new C1401("null is not allowed as value for record component '" + this.f2773 + "' of primitive type; at path " + c4208.m13443());
        }
        objArr[i] = objMo3722;
    }

    @Override // l.AbstractC0765
    /* JADX INFO: renamed from: ۙ */
    public final void mo3140(C4208 c4208, Object obj) throws IllegalAccessException {
        Object objMo3722 = this.f69103.mo3722(c4208);
        if (objMo3722 == null && this.f69106) {
            return;
        }
        boolean z = this.f69107;
        Field field = this.f2771;
        if (z) {
            if (!this.f69109) {
                C1511.m5366(obj, field);
                this.f69109 = true;
            }
        } else if (this.f69104) {
            throw new C8113(C25272.m56409("Cannot set value of 'static final' ", C1971.m6781((AccessibleObject) field, false)));
        }
        field.set(obj, objMo3722);
    }
}
