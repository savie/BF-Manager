package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4079(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class C23412 extends AbstractC0350 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f75790;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f75791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f75792;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23412(View view, InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        this.f75792 = view;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4825 mo23811(Object obj, InterfaceC4825 interfaceC4825) {
        C23412 c23412 = new C23412(this.f75792, interfaceC4825);
        c23412.f75790 = obj;
        return c23412;
    }

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        return ((C23412) mo23811(obj, (InterfaceC4825) obj2)).mo10983(C11471.f36082);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10983(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            l.ܺۢ᩵ r0 = l.EnumC16757.COROUTINE_SUSPENDED
            int r1 = r5.f75791
            android.view.View r2 = r5.f75792
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            l.C19676.m45348(r6)
            goto L59
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f75790
            l.᩻ۖ᩵ r1 = (l.AbstractC24745) r1
            l.C19676.m45348(r6)
            goto L35
        L22:
            l.C19676.m45348(r6)
            java.lang.Object r6 = r5.f75790
            r1 = r6
            l.᩻ۖ᩵ r1 = (l.AbstractC24745) r1
            r5.f75790 = r1
            r5.f75791 = r4
            l.ܺۢ᩵ r6 = r1.mo28601(r2, r5)
            if (r6 != r0) goto L35
            goto L58
        L35:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L59
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r5.f75790 = r6
            r5.f75791 = r3
            r1.getClass()
            l.᩹ۖ r6 = new l.᩹ۖ
            l.ܽ۠ r3 = new l.ܽ۠
            r3.<init>(r2)
            r6.<init>(r3)
            java.lang.Object r6 = r1.mo28600(r6, r5)
            if (r6 != r0) goto L54
            goto L56
        L54:
            l.ۧ۟᩵ r6 = l.C11471.f36082
        L56:
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            l.ۧ۟᩵ r6 = l.C11471.f36082
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23412.mo10983(java.lang.Object):java.lang.Object");
    }
}
