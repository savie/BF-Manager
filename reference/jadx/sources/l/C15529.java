package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15529 extends AbstractC18350 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50540;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f50541;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f50542;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50543;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f50544;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50545;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15529(String str, Field field, boolean z, Method method, AbstractC7186 abstractC7186, AbstractC7186 abstractC7187, boolean z2, boolean z3) {
        super(str, field);
        this.f50543 = z;
        this.f50541 = method;
        this.f50542 = abstractC7186;
        this.f50544 = abstractC7187;
        this.f50545 = z2;
        this.f50540 = z3;
    }

    @Override // l.AbstractC18350
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37114(C1145 c1145, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.f50543;
        Field field = this.f58534;
        Method method = this.f50541;
        if (z) {
            if (method == null) {
                C9179.m23614(obj, field);
            } else {
                C9179.m23614(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new C9573(C16523.m38890("Accessor ", C17023.m39790((AccessibleObject) method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c1145.m4204(this.f58535);
        this.f50542.mo1572(c1145, objInvoke);
    }

    @Override // l.AbstractC18350
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37115(C5379 c5379, int i, Object[] objArr) {
        Object objMo1571 = this.f50544.mo1571(c5379);
        if (objMo1571 == null && this.f50545) {
            throw new C13537("null is not allowed as value for record component '" + this.f58536 + "' of primitive type; at path " + c5379.m14919());
        }
        objArr[i] = objMo1571;
    }

    @Override // l.AbstractC18350
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37116(C5379 c5379, Object obj) throws IllegalAccessException {
        Object objMo1571 = this.f50544.mo1571(c5379);
        if (objMo1571 == null && this.f50545) {
            return;
        }
        boolean z = this.f50543;
        Field field = this.f58534;
        if (z) {
            C9179.m23614(obj, field);
        } else if (this.f50540) {
            throw new C9573(C0252.m1693("Cannot set value of 'static final' ", C17023.m39790((AccessibleObject) field, false)));
        }
        field.set(obj, objMo1571);
    }
}
