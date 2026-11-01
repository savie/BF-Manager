package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2756 extends AbstractC23219 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18279 f10565;

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8403(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, boolean z) {
        C21825 c21825Mo1938;
        C21825 c21825Mo1939;
        C8378 c8378 = (C8378) abstractC8774;
        C8378 c8379 = (C8378) abstractC8775;
        if (z) {
            return;
        }
        if (c8378.f29098 != null) {
            if (c8379.f29098.f30087.m48595()) {
                c21825Mo1938 = ((AbstractC5930) c8379.f29098.f30087.get(0)).f30190.mo1938();
            } else {
                c21825Mo1938 = c8379.f29098.f30092.f30190.mo1938();
            }
            if (c8378.f29098.f30087.m48595()) {
                c21825Mo1939 = ((AbstractC5930) c8378.f29098.f30087.get(0)).f30190.mo1938();
            } else {
                c21825Mo1939 = c8378.f29098.f30092.f30190.mo1938();
            }
        } else {
            c21825Mo1938 = c8379.f30190.mo1938();
            c21825Mo1939 = c8378.f30190.mo1938();
        }
        Iterator it = c21825Mo1938.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C18279 c18279 = this.f10565;
            if (zHasNext) {
                if (!c18279.f58325.m52399((AbstractC16579) it.next(), (AbstractC16579) c21825Mo1939.f70876)) {
                    return;
                } else {
                    c21825Mo1939 = c21825Mo1939.f70877;
                }
            } else {
                c18279.f58321.m48204(c8378.f29095, C9768.f32843);
                return;
            }
        }
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8404(AbstractC8774 abstractC8774) {
        C8378 c8378 = (C8378) abstractC8774;
        if (!c8378.f29095.m22847(EnumC18651.f60493) || C3128.m9473(c8378)) {
            return false;
        }
        return c8378.f29098 == null || this.f10565.f58319;
    }

    @Override // l.AbstractC23219
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21825 mo8405(AbstractC8774 abstractC8774) {
        C8378 c8378 = (C8378) abstractC8774;
        if (c8378.f29095.m22847(EnumC18651.f60493)) {
            C8378 c8379 = (C8378) this.f10565.f58326.mo1921((AbstractC8774) c8378, (Object) null);
            ((C11596) c8379.f29095).f38962 = C21825.m48588();
            return C21825.of((Object) c8379);
        }
        return C21825.of((Object) c8378);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2756(C18279 c18279) {
        super(c18279, EnumC14047.DIAMOND, EnumC18651.f60531);
        this.f10565 = c18279;
    }
}
