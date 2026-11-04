package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C10698 extends AbstractViewOnLongClickListenerC5544 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21184 f33962;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f33963;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C1750 f33964;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final View f33965;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ View m27266(C10698 c10698) {
        return c10698.f33965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m27267(C10698 c10698, C21184 c21184) {
        c10698.f33962 = c21184;
    }

    public C10698(Main main, View view, C1750 c1750) {
        super(main, view);
        this.f33965 = view.findViewById(R.id.details);
        this.f33964 = c1750;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16457() {
        return this.f33963;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16458(AbstractC11800 abstractC11800) {
        C10698 c10698 = (C10698) abstractC11800;
        if (!c10698.f33963) {
            return false;
        }
        C1750.m6160(this.f33964, this, c10698);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC5544, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21184 c21184;
        C1750 c1750 = this.f33964;
        if (c1750.f27860.m24482() || (c21184 = this.f33962) == null || c21184.f67652.mo16304() == null) {
            return false;
        }
        InterfaceC12936 interfaceC12936 = this.f33962.f67652;
        C9271 c9271 = c1750.f27860;
        C17359.requireNonNull(c9271);
        C1750.m6158(this.f33964, this.f19263, interfaceC12936, false, (DialogInterfaceC8327) null, (Runnable) new RunnableC13815(3, c9271), (RunnableC1047) null);
        return true;
    }
}
