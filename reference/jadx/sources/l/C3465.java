package l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3465 extends AbstractC12964 implements InterfaceC20314, InterfaceC1974 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f11998;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Runnable f11999 = new RunnableC17635(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f12000 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12001;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f12002;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10176 f12003;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C1228 c1228 = (C1228) abstractC11800;
        C3906 c3906M11420 = m11420(i);
        c1228.m4462();
        c3906M11420.mo12570(c1228);
    }

    public C3465(C10176 c10176) {
        this.f12003 = c10176;
        c10176.m12571(this);
        this.f11998 = new ArrayList();
        this.f12002 = new ArrayList();
        this.f12001 = new ArrayList();
        setHasStableIds(c10176.m26286());
        m11423();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11423() {
        Iterator it = this.f11998.iterator();
        while (it.hasNext()) {
            ((C3906) it.next()).m12571((C3465) null);
        }
        ArrayList arrayList = new ArrayList(this.f11998.size());
        this.f11998 = arrayList;
        C10176 c10176 = this.f12003;
        m11418(arrayList, c10176);
        this.f12002 = m11417((AbstractC16889) c10176);
        notifyDataSetChanged();
        Iterator it2 = this.f11998.iterator();
        while (it2.hasNext()) {
            ((C3906) it2.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11418(ArrayList arrayList, AbstractC16889 abstractC16889) {
        abstractC16889.m39846();
        int iM39845 = abstractC16889.m39845();
        for (int i = 0; i < iM39845; i++) {
            C3906 c3906M39849 = abstractC16889.m39849(i);
            arrayList.add(c3906M39849);
            C23603 c23603 = new C23603(c3906M39849);
            ArrayList arrayList2 = this.f12001;
            if (!arrayList2.contains(c23603)) {
                arrayList2.add(c23603);
            }
            if (c3906M39849 instanceof AbstractC16889) {
                AbstractC16889 abstractC168810 = (AbstractC16889) c3906M39849;
                if (!(abstractC168810 instanceof C10176)) {
                    m11418(arrayList, abstractC168810);
                }
            }
            c3906M39849.m12571(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m11417(AbstractC16889 abstractC16889) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM39845 = abstractC16889.m39845();
        int i = 0;
        for (int i2 = 0; i2 < iM39845; i2++) {
            C3906 c3906M39849 = abstractC16889.m39849(i2);
            if (c3906M39849.m12555()) {
                if (!m11419(abstractC16889) || i < abstractC16889.m39848()) {
                    arrayList.add(c3906M39849);
                } else {
                    arrayList2.add(c3906M39849);
                }
                if (c3906M39849 instanceof AbstractC16889) {
                    AbstractC16889 abstractC168810 = (AbstractC16889) c3906M39849;
                    if (abstractC168810 instanceof C10176) {
                        continue;
                    } else {
                        if (m11419(abstractC16889) && m11419(abstractC168810)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (C3906 c3906 : m11417(abstractC168810)) {
                            if (!m11419(abstractC16889) || i < abstractC16889.m39848()) {
                                arrayList.add(c3906);
                            } else {
                                arrayList2.add(c3906);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m11419(abstractC16889) && i > abstractC16889.m39848()) {
            C8971 c8971 = new C8971(abstractC16889.m12560(), arrayList2, abstractC16889.getId());
            c8971.m12573((InterfaceC12109) new C16143(this, abstractC16889));
            arrayList.add(c8971);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m11419(AbstractC16889 abstractC16889) {
        return abstractC16889.m39848() != Integer.MAX_VALUE;
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f12002.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3906 m11420(int i) {
        if (i < 0 || i >= this.f12002.size()) {
            return null;
        }
        return (C3906) this.f12002.get(i);
    }

    @Override // l.AbstractC12964
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return m11420(i).getId();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11422(C3906 c3906) {
        int iIndexOf = this.f12002.indexOf(c3906);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, c3906);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11421() {
        Handler handler = this.f12000;
        Runnable runnable = this.f11999;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        C23603 c23603 = new C23603(m11420(i));
        ArrayList arrayList = this.f12001;
        int iIndexOf = arrayList.indexOf(c23603);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c23603);
        return size;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23603 c23603 = (C23603) this.f12001.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C9430.f30588);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0385.m2186(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c23603.f76621, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            int i2 = C22666.f73603;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = c23603.f76620;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C1228(viewInflate);
    }

    @Override // l.InterfaceC1974
    /* JADX INFO: renamed from: ۙ */
    public final int mo6797(String str) {
        int size = this.f12002.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((C3906) this.f12002.get(i)).m12557())) {
                return i;
            }
        }
        return -1;
    }
}
