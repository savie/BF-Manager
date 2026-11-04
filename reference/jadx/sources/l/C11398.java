package l;

import android.view.MenuItem;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11398 implements InterfaceC0230, InterfaceC18990, InterfaceC21436, InterfaceC16369, InterfaceC18006, InterfaceC0073 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35861;

    public /* synthetic */ C11398(int i, Object obj) {
        this.f35860 = i;
        this.f35861 = obj;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f35860) {
            case 5:
                C14492.m35004((C14492) this.f35861, menuItem);
                return true;
            default:
                return ActivityC7135.m19590((ActivityC7135) this.f35861, menuItem);
        }
    }

    @Override // l.InterfaceC16369
    /* JADX INFO: renamed from: ۙ */
    public String mo16748(C25368 c25368) {
        return (String) this.f35861;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo1127() {
    }

    @Override // l.InterfaceC0230
    /* JADX INFO: renamed from: ۙ */
    public void mo1704(long j, C21287 c21287) {
        C7679.m20917(j, c21287, ((C16231) this.f35861).f52747);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        switch (this.f35860) {
            case 8:
                C2009.m6867((C2009) this.f35861);
                break;
            default:
                ((C18372) this.f35861).m42858((C21532) obj, false);
                break;
        }
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public void mo1128(String str) {
        ActivityC3041.m9880((ActivityC3041) this.f35861, str);
    }

    @Override // l.InterfaceC18990
    /* JADX INFO: renamed from: ᩷ */
    public void mo11476(String str) {
        switch (this.f35860) {
            case 3:
                ((AtomicReference) this.f35861).set(str);
                break;
            default:
                ((C22941) this.f35861).m51730(str);
                break;
        }
    }
}
