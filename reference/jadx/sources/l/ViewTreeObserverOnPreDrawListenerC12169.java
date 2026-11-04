package l;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC12169 implements ViewTreeObserver.OnPreDrawListener, InterfaceC5252 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List f39134;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f39135;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f39136;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6204 f39137;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39138;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f39139;

    public ViewTreeObserverOnPreDrawListenerC12169(C3966 c3966, int i, String str, String str2, List list) {
        this.f39135 = c3966;
        this.f39137 = new C6204(c3966);
        this.f39138 = i;
        this.f39139 = str;
        this.f39136 = str2;
        this.f39134 = list == null ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        String str;
        C3966 c3966 = this.f39135;
        AbstractC7364 abstractC7364M23213 = c3966.f13564.m23213();
        if (abstractC7364M23213.m20191() != this.f39138 || !C17359.equals(abstractC7364M23213.m20218(), this.f39139)) {
            m30433();
            return true;
        }
        if (c3966.f13564.m23233().getLifecycle().mo23076().m8762(EnumC2619.RESUMED) && !c3966.f13564.m23193()) {
            List list = this.f39134;
            if (!list.isEmpty()) {
                m30433();
                c3966.f13564.m23177((Collection) list, true);
                return true;
            }
            List listM23215 = c3966.f13564.m23215();
            int i = 0;
            while (true) {
                int size = listM23215.size();
                str = this.f39136;
                if (i >= size) {
                    i = -1;
                    break;
                }
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM23215.get(i);
                if (!interfaceC2386.mo8106() && !interfaceC2386.isDirectory() && interfaceC2386.getPath().equals(str)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                m30433();
                return true;
            }
            if (!this.f39137.m17842(i)) {
                return false;
            }
            c3966.m12743(str);
            m30433();
        }
        return true;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            m30433();
        } else if (enumC9330 == EnumC9330.ON_RESUME) {
            this.f39135.f13559.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30433() {
        C3966 c3966 = this.f39135;
        c3966.f13559.getViewTreeObserver().removeOnPreDrawListener(this);
        c3966.f13564.m23233().getLifecycle().mo23078(this);
        if (c3966.f13574 == this) {
            c3966.f13574 = null;
        }
    }
}
