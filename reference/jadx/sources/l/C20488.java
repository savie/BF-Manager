package l;

import android.app.Activity;

/* JADX INFO: renamed from: l.᩵ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4079(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
public final class C20488 extends AbstractC7808 implements InterfaceC23955 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f65627;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12283 f65628;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20488(C12283 c12283, Activity activity, InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        this.f65628 = c12283;
        this.f65627 = activity;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4825 mo23811(Object obj, InterfaceC4825 interfaceC4825) {
        return new C20488(this.f65628, this.f65627, interfaceC4825);
    }

    @Override // l.InterfaceC23955
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3124(Object obj, Object obj2) {
        return ((C20488) mo23811(obj, (InterfaceC4825) obj2)).mo10983(C11471.f36082);
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10983(Object obj) throws Throwable {
        EnumC16757 enumC16757 = EnumC16757.COROUTINE_SUSPENDED;
        int i = this.f65629;
        if (i == 0) {
            C19676.m45348(obj);
            C12283 c12283 = this.f65628;
            InterfaceC23312 interfaceC23312M46705 = C20328.m46705(new C3334(((C7404) c12283.f39484).m20319(this.f65627), c12283));
            C17504 c17504 = new C17504(c12283);
            this.f65629 = 1;
            if (interfaceC23312M46705.mo10984(c17504, this) == enumC16757) {
                return enumC16757;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C19676.m45348(obj);
        }
        return C11471.f36082;
    }
}
