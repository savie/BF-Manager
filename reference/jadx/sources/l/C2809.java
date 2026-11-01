package l;

import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2809 implements InterfaceC16300 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23356 f10678;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f10679;

    public C2809(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161, C23356 c23356) {
        this.f10679 = layoutInflaterFactory2C9161;
        this.f10678 = c23356;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8543(AbstractC12067 abstractC12067, Menu menu) {
        return this.f10678.m51472(abstractC12067, menu);
    }

    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8541(AbstractC12067 abstractC12067, Menu menu) {
        C5031.m14002(this.f10679.f31198);
        return this.f10678.mo8541(abstractC12067, menu);
    }

    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8542(AbstractC12067 abstractC12067, MenuItem menuItem) {
        return this.f10678.mo8542(abstractC12067, menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.۟ۚ] */
    @Override // l.InterfaceC16300
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8540(AbstractC12067 abstractC12067) {
        this.f10678.mo8540(abstractC12067);
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f10679;
        if (layoutInflaterFactory2C9161.f31162 != null) {
            layoutInflaterFactory2C9161.f31196.getDecorView().removeCallbacks(layoutInflaterFactory2C9161.f31157);
        }
        if (layoutInflaterFactory2C9161.f31181 != null) {
            C20554 c20554 = layoutInflaterFactory2C9161.f31169;
            if (c20554 != null) {
                c20554.m46322();
            }
            C20554 c20554M13980 = C5031.m13980(layoutInflaterFactory2C9161.f31181);
            c20554M13980.m46323(0.0f);
            layoutInflaterFactory2C9161.f31169 = c20554M13980;
            c20554M13980.m46326(new C11983(this));
        }
        ?? r0 = layoutInflaterFactory2C9161.f31164;
        if (r0 != 0) {
            r0.onSupportActionModeFinished(layoutInflaterFactory2C9161.f31158);
        }
        layoutInflaterFactory2C9161.f31158 = null;
        C5031.m14002(layoutInflaterFactory2C9161.f31198);
        layoutInflaterFactory2C9161.m23571();
    }
}
