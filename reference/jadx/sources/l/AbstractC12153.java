package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f40672;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40671 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40673 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f40674 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40675 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo30228(ArrayList arrayList, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12153 m30220(ViewGroup viewGroup, AbstractC8894 abstractC8894) {
        return m30221(viewGroup, abstractC8894.m23069());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC12153 m30221(ViewGroup viewGroup, InterfaceC17091 interfaceC17091) {
        Object tag = viewGroup.getTag(R.id.MT_Protector);
        if (tag instanceof AbstractC12153) {
            return (AbstractC12153) tag;
        }
        ((C5365) interfaceC17091).getClass();
        C20453 c20453 = new C20453(viewGroup);
        viewGroup.setTag(R.id.MT_Protector, c20453);
        return c20453;
    }

    public AbstractC12153(ViewGroup viewGroup) {
        this.f40672 = viewGroup;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewGroup m30231() {
        return this.f40672;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC19914 m30225(C23711 c23711) {
        C16386 c16386M30222 = m30222(c23711.m52206());
        C16386 c16386 = null;
        EnumC19914 enumC19914M38576 = c16386M30222 != null ? c16386M30222.m38576() : null;
        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
        for (C16386 c16387 : this.f40673) {
            if (c16387.m38571().equals(componentCallbacksC22654M52206) && !c16387.m38581()) {
                c16386 = c16387;
                break;
            }
        }
        return (c16386 == null || !(enumC19914M38576 == null || enumC19914M38576 == EnumC19914.NONE)) ? enumC19914M38576 : c16386.m38576();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16386 m30222(ComponentCallbacksC22654 componentCallbacksC22654) {
        for (C16386 c16386 : this.f40671) {
            if (c16386.m38571().equals(componentCallbacksC22654) && !c16386.m38581()) {
                return c16386;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30229(EnumC0157 enumC0157, C23711 c23711) {
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c23711.m52206());
        }
        m30223(enumC0157, EnumC19914.ADDING, c23711);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30232(C23711 c23711) {
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c23711.m52206());
        }
        m30223(EnumC0157.VISIBLE, EnumC19914.NONE, c23711);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30230(C23711 c23711) {
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c23711.m52206());
        }
        m30223(EnumC0157.GONE, EnumC19914.NONE, c23711);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30234(C23711 c23711) {
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c23711.m52206());
        }
        m30223(EnumC0157.REMOVED, EnumC19914.REMOVING, c23711);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30223(EnumC0157 enumC0157, EnumC19914 enumC19914, C23711 c23711) {
        synchronized (this.f40671) {
            C0921 c0921 = new C0921();
            C16386 c16386M30222 = m30222(c23711.m52206());
            if (c16386M30222 != null) {
                c16386M30222.m38574(enumC0157, enumC19914);
                return;
            }
            C20619 c20619 = new C20619(enumC0157, enumC19914, c23711, c0921);
            this.f40671.add(c20619);
            c20619.m38573(new RunnableC8625(this, c20619));
            c20619.m38573(new RunnableC10036(this, c20619));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30226() {
        synchronized (this.f40671) {
            m30224();
            this.f40675 = false;
            int size = this.f40671.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C16386 c16386 = (C16386) this.f40671.get(size);
                EnumC0157 enumC0157M1254 = EnumC0157.m1254(c16386.m38571().mView);
                EnumC0157 enumC0157M38577 = c16386.m38577();
                EnumC0157 enumC0157 = EnumC0157.VISIBLE;
                if (enumC0157M38577 == enumC0157 && enumC0157M1254 != enumC0157) {
                    this.f40675 = c16386.m38571().isPostponed();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30227() {
        if (this.f40675) {
            return;
        }
        ViewGroup viewGroup = this.f40672;
        int i = C5031.f17539;
        if (!viewGroup.isAttachedToWindow()) {
            m30233();
            this.f40674 = false;
            return;
        }
        synchronized (this.f40671) {
            if (!this.f40671.isEmpty()) {
                ArrayList<C16386> arrayList = new ArrayList(this.f40673);
                this.f40673.clear();
                for (C16386 c16386 : arrayList) {
                    if (AbstractC8894.m23060(2)) {
                        C13638.toString(c16386);
                    }
                    c16386.m38572();
                    if (!c16386.m38570()) {
                        this.f40673.add(c16386);
                    }
                }
                m30224();
                ArrayList arrayList2 = new ArrayList(this.f40671);
                this.f40671.clear();
                this.f40673.addAll(arrayList2);
                AbstractC8894.m23060(2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C16386) it.next()).mo38578();
                }
                mo30228(arrayList2, this.f40674);
                this.f40674 = false;
                AbstractC8894.m23060(2);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30233() {
        AbstractC8894.m23060(2);
        ViewGroup viewGroup = this.f40672;
        int i = C5031.f17539;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f40671) {
            m30224();
            Iterator it = this.f40671.iterator();
            while (it.hasNext()) {
                ((C16386) it.next()).mo38578();
            }
            for (C16386 c16386 : new ArrayList(this.f40673)) {
                if (AbstractC8894.m23060(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f40672);
                        sb.append(" is not attached to window. ");
                    }
                    C13638.toString(c16386);
                }
                c16386.m38572();
            }
            for (C16386 c16387 : new ArrayList(this.f40671)) {
                if (AbstractC8894.m23060(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f40672);
                        sb2.append(" is not attached to window. ");
                    }
                    C13638.toString(c16387);
                }
                c16387.m38572();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m30224() {
        for (C16386 c16386 : this.f40671) {
            if (c16386.m38576() == EnumC19914.ADDING) {
                c16386.m38574(EnumC0157.m1253(c16386.m38571().requireView().getVisibility()), EnumC19914.NONE);
            }
        }
    }
}
