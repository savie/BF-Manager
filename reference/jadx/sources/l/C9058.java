package l;

import android.view.MenuItem;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: l.ۡᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9058 implements InterfaceC7359, InterfaceC17390, InterfaceC7486, InterfaceC21133, InterfaceC21921, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30907;

    public /* synthetic */ C9058(Object obj) {
        this.f30907 = obj;
    }

    public /* synthetic */ C9058(InterfaceC10984 interfaceC10984, Type type) {
        this.f30907 = interfaceC10984;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C9138.m23461((C9138) this.f30907, menuItem);
        return true;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C7875) this.f30907).mo21455(i);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC19333) obj).mo2597((C0987) this.f30907);
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return ((InterfaceC10984) this.f30907).m27741();
    }

    @Override // l.InterfaceC7486
    /* JADX INFO: renamed from: ܰ */
    public void mo2142(Object obj, Throwable th) {
        ((C20346) this.f30907).m45914((Throwable) null);
    }
}
