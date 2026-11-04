package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17997 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f58942;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f58946 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58944 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f58943 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f58945 = false;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13483(ArrayList arrayList, boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17997 m41958(ViewGroup viewGroup, AbstractC3191 abstractC3191) {
        return m41957(viewGroup, abstractC3191.m10486());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17997 m41957(ViewGroup viewGroup, InterfaceC0098 interfaceC0098) {
        Object tag = viewGroup.getTag(R.id.MT_Protector);
        if (tag instanceof AbstractC17997) {
            return (AbstractC17997) tag;
        }
        ((C22583) interfaceC0098).getClass();
        C4220 c4220 = new C4220(viewGroup);
        viewGroup.setTag(R.id.MT_Protector, c4220);
        return c4220;
    }

    public AbstractC17997(ViewGroup viewGroup) {
        this.f58942 = viewGroup;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewGroup m41965() {
        return this.f58942;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC3827 m41969(C9902 c9902) {
        C20981 c20981M41959 = m41959(c9902.m25719());
        C20981 c20981 = null;
        EnumC3827 enumC3827M47962 = c20981M41959 != null ? c20981M41959.m47962() : null;
        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
        for (C20981 c20982 : this.f58944) {
            if (c20982.m47964().equals(componentCallbacksC11612M25719) && !c20982.m47961()) {
                c20981 = c20982;
                break;
            }
        }
        return (c20981 == null || !(enumC3827M47962 == null || enumC3827M47962 == EnumC3827.NONE)) ? enumC3827M47962 : c20981.m47962();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20981 m41959(ComponentCallbacksC11612 componentCallbacksC11612) {
        for (C20981 c20981 : this.f58946) {
            if (c20981.m47964().equals(componentCallbacksC11612) && !c20981.m47961()) {
                return c20981;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41964(EnumC14267 enumC14267, C9902 c9902) {
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c9902.m25719());
        }
        m41960(enumC14267, EnumC3827.ADDING, c9902);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41966(C9902 c9902) {
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c9902.m25719());
        }
        m41960(EnumC14267.VISIBLE, EnumC3827.NONE, c9902);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41963(C9902 c9902) {
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c9902.m25719());
        }
        m41960(EnumC14267.GONE, EnumC3827.NONE, c9902);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41968(C9902 c9902) {
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c9902.m25719());
        }
        m41960(EnumC14267.REMOVED, EnumC3827.REMOVING, c9902);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41960(EnumC14267 enumC14267, EnumC3827 enumC3827, C9902 c9902) {
        synchronized (this.f58946) {
            C24947 c24947 = new C24947();
            C20981 c20981M41959 = m41959(c9902.m25719());
            if (c20981M41959 != null) {
                c20981M41959.m47957(enumC14267, enumC3827);
                return;
            }
            C6065 c6065 = new C6065(enumC14267, enumC3827, c9902, c24947);
            this.f58946.add(c6065);
            c6065.m47956(new RunnableC3081(this, c6065));
            c6065.m47956(new RunnableC20235(this, c6065));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m41970() {
        synchronized (this.f58946) {
            m41961();
            this.f58945 = false;
            int size = this.f58946.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C20981 c20981 = (C20981) this.f58946.get(size);
                EnumC14267 enumC14267M34600 = EnumC14267.m34600(c20981.m47964().mView);
                EnumC14267 enumC14267M47959 = c20981.m47959();
                EnumC14267 enumC14267 = EnumC14267.VISIBLE;
                if (enumC14267M47959 == enumC14267 && enumC14267M34600 != enumC14267) {
                    this.f58945 = c20981.m47964().isPostponed();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41962() {
        if (this.f58945) {
            return;
        }
        ViewGroup viewGroup = this.f58942;
        int i = C22666.f73603;
        if (!viewGroup.isAttachedToWindow()) {
            m41967();
            this.f58943 = false;
            return;
        }
        synchronized (this.f58946) {
            if (!this.f58946.isEmpty()) {
                ArrayList<C20981> arrayList = new ArrayList(this.f58944);
                this.f58944.clear();
                for (C20981 c20981 : arrayList) {
                    if (AbstractC3191.m10427(2)) {
                        C17359.toString(c20981);
                    }
                    c20981.m47955();
                    if (!c20981.m47960()) {
                        this.f58944.add(c20981);
                    }
                }
                m41961();
                ArrayList arrayList2 = new ArrayList(this.f58946);
                this.f58946.clear();
                this.f58944.addAll(arrayList2);
                AbstractC3191.m10427(2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C20981) it.next()).mo17571();
                }
                mo13483(arrayList2, this.f58943);
                this.f58943 = false;
                AbstractC3191.m10427(2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41967() {
        AbstractC3191.m10427(2);
        ViewGroup viewGroup = this.f58942;
        int i = C22666.f73603;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f58946) {
            m41961();
            Iterator it = this.f58946.iterator();
            while (it.hasNext()) {
                ((C20981) it.next()).mo17571();
            }
            for (C20981 c20981 : new ArrayList(this.f58944)) {
                if (AbstractC3191.m10427(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f58942);
                        sb.append(" is not attached to window. ");
                    }
                    C17359.toString(c20981);
                }
                c20981.m47955();
            }
            for (C20981 c20982 : new ArrayList(this.f58946)) {
                if (AbstractC3191.m10427(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f58942);
                        sb2.append(" is not attached to window. ");
                    }
                    C17359.toString(c20982);
                }
                c20982.m47955();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41961() {
        for (C20981 c20981 : this.f58946) {
            if (c20981.m47962() == EnumC3827.ADDING) {
                c20981.m47957(EnumC14267.m34599(c20981.m47964().requireView().getVisibility()), EnumC3827.NONE);
            }
        }
    }
}
