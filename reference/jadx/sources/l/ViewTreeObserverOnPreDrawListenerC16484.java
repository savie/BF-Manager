package l;

import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC16484 implements ViewTreeObserver.OnPreDrawListener, InterfaceC5657 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12251 f52966;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f52967;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f52968;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f52969;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52970;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f52971;

    public ViewTreeObserverOnPreDrawListenerC16484(C5900 c5900, int i, String str, String str2, List list) {
        this.f52967 = c5900;
        this.f52966 = new C12251(c5900);
        this.f52970 = i;
        this.f52971 = str;
        this.f52968 = str2;
        this.f52969 = list == null ? Collections.EMPTY_LIST : new ArrayList(list);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        String str;
        C5900 c5900 = this.f52967;
        AbstractC11462 abstractC11462M28817 = c5900.f20125.m28817();
        if (abstractC11462M28817.m28617() != this.f52970 || !C13638.equals(abstractC11462M28817.m28629(), this.f52971)) {
            m38751();
            return true;
        }
        if (c5900.f20125.m28824().getLifecycle().mo9170().m24173(EnumC9414.RESUMED) && !c5900.f20125.m28800()) {
            List list = this.f52969;
            if (!list.isEmpty()) {
                m38751();
                c5900.f20125.m28778((Collection) list, true);
                return true;
            }
            List listM28829 = c5900.f20125.m28829();
            int i = 0;
            while (true) {
                int size = listM28829.size();
                str = this.f52968;
                if (i >= size) {
                    i = -1;
                    break;
                }
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM28829.get(i);
                if (!interfaceC2557.mo7980() && !interfaceC2557.isDirectory() && interfaceC2557.getPath().equals(str)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                m38751();
                return true;
            }
            if (!this.f52966.m30458(i)) {
                return false;
            }
            c5900.m16168(str);
            m38751();
        }
        return true;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            m38751();
        } else if (enumC1651 == EnumC1651.ON_RESUME) {
            this.f52967.f20120.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m38751() {
        C5900 c5900 = this.f52967;
        c5900.f20120.getViewTreeObserver().removeOnPreDrawListener(this);
        c5900.f20125.m28824().getLifecycle().mo9172(this);
        if (c5900.f20117 == this) {
            c5900.f20117 = null;
        }
    }
}
