package l;

import android.view.MenuItem;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21812 implements InterfaceC16369, InterfaceC21436 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69551;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69552;

    public /* synthetic */ C21812(Object obj, Object obj2) {
        this.f69551 = obj;
        this.f69552 = obj2;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C11369.m28676((C11369) this.f69551, (TextView) this.f69552, menuItem);
        return true;
    }

    @Override // l.InterfaceC16369
    /* JADX INFO: renamed from: ۙ */
    public String mo16748(C25368 c25368) {
        return ((C9771) this.f69551).m25469(c25368, (C16281) this.f69552);
    }
}
