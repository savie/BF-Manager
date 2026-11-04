package l;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15402 implements InterfaceC19067 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8625 f50214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C24354 f50215;

    public C15402(LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354, C8625 c8625) {
        this.f50215 = layoutInflaterFactory2C24354;
        this.f50214 = c8625;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36882(AbstractC10116 abstractC10116, Menu menu) {
        return this.f50214.m23253(abstractC10116, menu);
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23250(AbstractC10116 abstractC10116, Menu menu) {
        C22666.m51079(this.f50215.f79012);
        return this.f50214.mo23250(abstractC10116, menu);
    }

    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23251(AbstractC10116 abstractC10116, MenuItem menuItem) {
        return this.f50214.mo23251(abstractC10116, menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.ܰᩴ] */
    @Override // l.InterfaceC19067
    /* JADX INFO: renamed from: ۙ */
    public final void mo23249(AbstractC10116 abstractC10116) {
        this.f50214.mo23249(abstractC10116);
        LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354 = this.f50215;
        if (layoutInflaterFactory2C24354.f78999 != null) {
            layoutInflaterFactory2C24354.f79006.getDecorView().removeCallbacks(layoutInflaterFactory2C24354.f78993);
        }
        if (layoutInflaterFactory2C24354.f78980 != null) {
            C24158 c24158 = layoutInflaterFactory2C24354.f78984;
            if (c24158 != null) {
                c24158.m54119();
            }
            C24158 c24158M51085 = C22666.m51085(layoutInflaterFactory2C24354.f78980);
            c24158M51085.m54120(0.0f);
            layoutInflaterFactory2C24354.f78984 = c24158M51085;
            c24158M51085.m54123(new C19878(this));
        }
        ?? r0 = layoutInflaterFactory2C24354.f79017;
        if (r0 != 0) {
            r0.onSupportActionModeFinished(layoutInflaterFactory2C24354.f78985);
        }
        layoutInflaterFactory2C24354.f78985 = null;
        C22666.m51079(layoutInflaterFactory2C24354.f79012);
        layoutInflaterFactory2C24354.m54407();
    }
}
