package l;

import android.view.MenuItem;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩻ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23802 implements InterfaceC1118, InterfaceC21133 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76981;

    public /* synthetic */ C23802(Object obj, Object obj2) {
        this.f76980 = obj;
        this.f76981 = obj2;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C2758.m8408((C2758) this.f76980, (TextView) this.f76981, menuItem);
        return true;
    }

    @Override // l.InterfaceC1118
    /* JADX INFO: renamed from: ۙ */
    public String mo4141(C12257 c12257) {
        return ((C11601) this.f76980).m28922(c12257, (C1263) this.f76981);
    }
}
