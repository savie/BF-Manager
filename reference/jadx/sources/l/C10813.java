package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.ۧۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC19564(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
public final class C10813 extends AbstractC16037 implements InterfaceC8400 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23513 f36835;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f36836;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f36837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10813(C23513 c23513, Activity activity, InterfaceC14771 interfaceC14771) {
        super(interfaceC14771);
        this.f36835 = c23513;
        this.f36836 = activity;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC14771 mo20747(Object obj, InterfaceC14771 interfaceC14771) {
        return new C10813(this.f36835, this.f36836, interfaceC14771);
    }

    @Override // l.InterfaceC8400
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3208(Object obj, Object obj2) {
        return ((C10813) mo20747(obj, (InterfaceC14771) obj2)).mo11546(C7321.f24318);
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final Object mo11546(Object obj) throws Throwable {
        EnumC13214 enumC13214 = EnumC13214.COROUTINE_SUSPENDED;
        int i = this.f36837;
        if (i == 0) {
            C18610.m43015(obj);
            C23513 c23513 = this.f36835;
            InterfaceC18713 interfaceC18713M44463 = C19419.m44463(new C5873(((C2508) c23513.f76104).m7642(this.f36836), c23513));
            C16457 c16457 = new C16457(c23513);
            this.f36837 = 1;
            if (interfaceC18713M44463.mo16086(c16457, this) == enumC13214) {
                return enumC13214;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18610.m43015(obj);
        }
        return C7321.f24318;
    }
}
