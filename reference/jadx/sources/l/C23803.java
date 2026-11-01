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

/* JADX INFO: renamed from: l.᩻ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes.dex */
public final class C23803 extends AbstractC0414 implements InterfaceC14776, InterfaceC20275 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f76982;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Runnable f76983 = new RunnableC17452(this);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Handler f76984 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f76985;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f76986;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13344 f76987;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C4170 c4170 = (C4170) abstractC12554;
        C4751 c4751M52448 = m52448(i);
        c4170.m11812();
        c4751M52448.mo8452(c4170);
    }

    public C23803(C13344 c13344) {
        this.f76987 = c13344;
        c13344.m13149(this);
        this.f76985 = new ArrayList();
        this.f76986 = new ArrayList();
        this.f76982 = new ArrayList();
        setHasStableIds(c13344.m32846());
        m52451();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52451() {
        Iterator it = this.f76985.iterator();
        while (it.hasNext()) {
            ((C4751) it.next()).m13149((C23803) null);
        }
        ArrayList arrayList = new ArrayList(this.f76985.size());
        this.f76985 = arrayList;
        C13344 c13344 = this.f76987;
        m52446(arrayList, c13344);
        this.f76986 = m52445((AbstractC12514) c13344);
        notifyDataSetChanged();
        Iterator it2 = this.f76985.iterator();
        while (it2.hasNext()) {
            ((C4751) it2.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52446(ArrayList arrayList, AbstractC12514 abstractC12514) {
        abstractC12514.m31079();
        int iM31075 = abstractC12514.m31075();
        for (int i = 0; i < iM31075; i++) {
            C4751 c4751M31078 = abstractC12514.m31078(i);
            arrayList.add(c4751M31078);
            C11103 c11103 = new C11103(c4751M31078);
            ArrayList arrayList2 = this.f76982;
            if (!arrayList2.contains(c11103)) {
                arrayList2.add(c11103);
            }
            if (c4751M31078 instanceof AbstractC12514) {
                AbstractC12514 abstractC12515 = (AbstractC12514) c4751M31078;
                if (!(abstractC12515 instanceof C13344)) {
                    m52446(arrayList, abstractC12515);
                }
            }
            c4751M31078.m13149(this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m52445(AbstractC12514 abstractC12514) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iM31075 = abstractC12514.m31075();
        int i = 0;
        for (int i2 = 0; i2 < iM31075; i2++) {
            C4751 c4751M31078 = abstractC12514.m31078(i2);
            if (c4751M31078.m13164()) {
                if (!m52447(abstractC12514) || i < abstractC12514.m31076()) {
                    arrayList.add(c4751M31078);
                } else {
                    arrayList2.add(c4751M31078);
                }
                if (c4751M31078 instanceof AbstractC12514) {
                    AbstractC12514 abstractC12515 = (AbstractC12514) c4751M31078;
                    if (abstractC12515 instanceof C13344) {
                        continue;
                    } else {
                        if (m52447(abstractC12514) && m52447(abstractC12515)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (C4751 c4751 : m52445(abstractC12515)) {
                            if (!m52447(abstractC12514) || i < abstractC12514.m31076()) {
                                arrayList.add(c4751);
                            } else {
                                arrayList2.add(c4751);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m52447(abstractC12514) && i > abstractC12514.m31076()) {
            C15482 c15482 = new C15482(abstractC12514.m13133(), arrayList2, abstractC12514.mo13126());
            c15482.m13143((InterfaceC2074) new C6163(this, abstractC12514));
            arrayList.add(c15482);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m52447(AbstractC12514 abstractC12514) {
        return abstractC12514.m31076() != Integer.MAX_VALUE;
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f76986.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4751 m52448(int i) {
        if (i < 0 || i >= this.f76986.size()) {
            return null;
        }
        return (C4751) this.f76986.get(i);
    }

    @Override // l.AbstractC0414
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return m52448(i).mo13126();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52450(C4751 c4751) {
        int iIndexOf = this.f76986.indexOf(c4751);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, c4751);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52449() {
        Handler handler = this.f76984;
        Runnable runnable = this.f76983;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        C11103 c11103 = new C11103(m52448(i));
        ArrayList arrayList = this.f76982;
        int iIndexOf = arrayList.indexOf(c11103);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(c11103);
        return size;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C11103 c11103 = (C11103) this.f76982.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C6993.f23525);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C15945.m37904(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(c11103.f37689, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            int i2 = C5031.f17539;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = c11103.f37688;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C4170(viewInflate);
    }

    @Override // l.InterfaceC20275
    /* JADX INFO: renamed from: ۙ */
    public final int mo45772(String str) {
        int size = this.f76986.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((C4751) this.f76986.get(i)).m13157())) {
                return i;
            }
        }
        return -1;
    }
}
