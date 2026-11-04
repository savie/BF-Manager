package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1517 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        C24550 c24550 = (C24550) abstractC11781;
        C14106 c14106M29564 = abstractC11781.m29564();
        c24550.f38069 = c14106M29564;
        c14106M29564.mo29590();
        c14106M29564.f44616.mo7481(abstractC11781);
        c24550.f79577 = abstractC11781.mo29575();
        c24550.f38072 = C21901.m49594(abstractC11781.mo29575());
        c24550.m54833();
    }
}
