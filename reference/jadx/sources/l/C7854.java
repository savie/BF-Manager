package l;

import android.view.View;

/* JADX INFO: renamed from: l.۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC19564(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class C7854 extends AbstractC20975 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25835;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25836;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f25837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7854(View view, InterfaceC14771 interfaceC14771) {
        super(interfaceC14771);
        this.f25835 = view;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 mo20747(Object obj, InterfaceC14771 interfaceC14771) {
        C7854 c7854 = new C7854(this.f25835, interfaceC14771);
        c7854.f25837 = obj;
        return c7854;
    }

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        return ((C7854) mo20747(obj, (InterfaceC14771) obj2)).mo11546(C7321.f24318);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo11546(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            l.۬ܺ۠ r0 = l.EnumC13214.COROUTINE_SUSPENDED
            int r1 = r5.f25836
            android.view.View r2 = r5.f25835
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            l.C18610.m43015(r6)
            goto L59
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f25837
            l.۬ܽ۠ r1 = (l.AbstractC13235) r1
            l.C18610.m43015(r6)
            goto L35
        L22:
            l.C18610.m43015(r6)
            java.lang.Object r6 = r5.f25837
            r1 = r6
            l.۬ܽ۠ r1 = (l.AbstractC13235) r1
            r5.f25837 = r1
            r5.f25836 = r4
            l.۬ܺ۠ r6 = r1.mo4441(r2, r5)
            if (r6 != r0) goto L35
            goto L58
        L35:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L59
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r5.f25837 = r6
            r5.f25836 = r3
            r1.getClass()
            l.ᩳܳ r6 = new l.ᩳܳ
            l.ᩳ֫ r3 = new l.ᩳ֫
            r3.<init>(r2)
            r6.<init>(r3)
            java.lang.Object r6 = r1.mo4440(r6, r5)
            if (r6 != r0) goto L54
            goto L56
        L54:
            l.۟۟۠ r6 = l.C7321.f24318
        L56:
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            l.۟۟۠ r6 = l.C7321.f24318
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7854.mo11546(java.lang.Object):java.lang.Object");
    }
}
