package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۨۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11509 implements InterfaceC21921, InterfaceC21133, InterfaceC11754, InterfaceC1293, InterfaceC14394, InterfaceC0380 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38689;

    public /* synthetic */ C11509(int i, Object obj) {
        this.f38688 = i;
        this.f38689 = obj;
    }

    @Override // l.InterfaceC11754
    public C15844 onApplyWindowInsets(View view, C15844 c15844) {
        switch (this.f38688) {
            case 5:
                ActivityC15481.m37040((ActivityC15481) this.f38689, c15844);
                return c15844;
            default:
                return ((SearchView) this.f38689).lambda$setUpStatusBarSpacerInsetListener$5(view, c15844);
        }
    }

    @Override // l.InterfaceC14394
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC14394
    public void onGetPath(Bundle bundle, String str) {
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = (ViewOnClickListenerC3520) this.f38689;
        viewOnClickListenerC3520.m10355(new RunnableC7416(viewOnClickListenerC3520, str, bundle));
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f38688) {
            case 0:
                ((ActivityC5677) this.f38689).m15656(menuItem);
                break;
            default:
                C22342.m49525((C22342) this.f38689, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        AbstractC17902 abstractC17902;
        switch (this.f38688) {
            case 1:
                abstractC17902 = (C18196) this.f38689;
                break;
            case 2:
                abstractC17902 = (C18716) this.f38689;
                break;
            default:
                abstractC17902 = (C12814) this.f38689;
                break;
        }
        abstractC17902.mo21455(i);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        C20890.m46975((C20890) this.f38689);
    }
}
