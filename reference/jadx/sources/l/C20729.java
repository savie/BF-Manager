package l;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20729 extends AbstractC23735 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator f66420;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f66421;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f66422;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f66423;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f66424;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f66425;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f66426;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f66427;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f66428;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f66429;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f66430;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f66431;

    public C20729() {
        this.f76930 = true;
        this.f66429 = new ArrayList();
        this.f66426 = new ArrayList();
        this.f66422 = new ArrayList();
        this.f66430 = new ArrayList();
        this.f66421 = new ArrayList();
        this.f66428 = new ArrayList();
        this.f66431 = new ArrayList();
        this.f66423 = new ArrayList();
        this.f66427 = new ArrayList();
        this.f66425 = new ArrayList();
        this.f66424 = new ArrayList();
    }

    @Override // l.AbstractC3269
    /* JADX INFO: renamed from: ۚ */
    public final void mo10759() {
        ArrayList<AbstractC11800> arrayList = this.f66429;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f66422;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f66430;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f66426;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (AbstractC11800 abstractC11800 : arrayList) {
            View view = abstractC11800.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f66425.add(abstractC11800);
            viewPropertyAnimatorAnimate.setDuration(m10763()).alpha(0.0f).setListener(new C11778(view, viewPropertyAnimatorAnimate, this, abstractC11800)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f66428.add(arrayList5);
            arrayList2.clear();
            RunnableC13270 runnableC13270 = new RunnableC13270(this, arrayList5);
            if (!zIsEmpty) {
                View view2 = ((C3575) arrayList5.get(0)).f12239.itemView;
                long jM10763 = m10763();
                int i = C22666.f73603;
                view2.postOnAnimationDelayed(runnableC13270, jM10763);
            } else {
                runnableC13270.run();
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f66431.add(arrayList6);
            arrayList3.clear();
            RunnableC5813 runnableC5813 = new RunnableC5813(this, arrayList6);
            if (!zIsEmpty) {
                View view3 = ((C23713) arrayList6.get(0)).f76846.itemView;
                long jM10764 = m10763();
                int i2 = C22666.f73603;
                view3.postOnAnimationDelayed(runnableC5813, jM10764);
            } else {
                runnableC5813.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f66421.add(arrayList7);
        arrayList4.clear();
        RunnableC2084 runnableC2084 = new RunnableC2084(this, arrayList7);
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            long jMax = Math.max(!zIsEmpty2 ? m10764() : 0L, zIsEmpty3 ? 0L : m10768()) + (!zIsEmpty ? m10763() : 0L);
            View view4 = ((AbstractC11800) arrayList7.get(0)).itemView;
            int i3 = C22666.f73603;
            view4.postOnAnimationDelayed(runnableC2084, jMax);
            return;
        }
        runnableC2084.run();
    }

    @Override // l.AbstractC23735
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo47416(AbstractC11800 abstractC11800) {
        m47412(abstractC11800);
        this.f66429.add(abstractC11800);
    }

    @Override // l.AbstractC23735
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo47417(AbstractC11800 abstractC11800) {
        m47412(abstractC11800);
        abstractC11800.itemView.setAlpha(0.0f);
        this.f66426.add(abstractC11800);
    }

    @Override // l.AbstractC23735
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo47413(AbstractC11800 abstractC11800, int i, int i2, int i3, int i4) {
        View view = abstractC11800.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC11800.itemView.getTranslationY());
        m47412(abstractC11800);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            C3575 c3575 = new C3575();
            c3575.f12239 = abstractC11800;
            c3575.f12238 = translationX;
            c3575.f12241 = translationY;
            c3575.f12242 = i3;
            c3575.f12240 = i4;
            this.f66422.add(c3575);
            return true;
        }
        m10755(abstractC11800);
        return false;
    }

    @Override // l.AbstractC23735
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo47414(AbstractC11800 abstractC11800, AbstractC11800 abstractC11801, int i, int i2, int i3, int i4) {
        if (abstractC11800 == abstractC11801) {
            return mo47413(abstractC11800, i, i2, i3, i4);
        }
        float translationX = abstractC11800.itemView.getTranslationX();
        float translationY = abstractC11800.itemView.getTranslationY();
        float alpha = abstractC11800.itemView.getAlpha();
        m47412(abstractC11800);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC11800.itemView.setTranslationX(translationX);
        abstractC11800.itemView.setTranslationY(translationY);
        abstractC11800.itemView.setAlpha(alpha);
        if (abstractC11801 != null) {
            m47412(abstractC11801);
            abstractC11801.itemView.setTranslationX(-i5);
            abstractC11801.itemView.setTranslationY(-i6);
            abstractC11801.itemView.setAlpha(0.0f);
        }
        C23713 c23713 = new C23713();
        c23713.f76846 = abstractC11800;
        c23713.f76842 = abstractC11801;
        c23713.f76841 = i;
        c23713.f76845 = i2;
        c23713.f76844 = i3;
        c23713.f76843 = i4;
        this.f66430.add(c23713);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47410(ArrayList arrayList, AbstractC11800 abstractC11800) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C23713 c23713 = (C23713) arrayList.get(size);
            if (m47411(c23713, abstractC11800) && c23713.f76846 == null && c23713.f76842 == null) {
                arrayList.remove(c23713);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47411(C23713 c23713, AbstractC11800 abstractC11800) {
        if (c23713.f76842 == abstractC11800) {
            c23713.f76842 = null;
        } else {
            if (c23713.f76846 != abstractC11800) {
                return false;
            }
            c23713.f76846 = null;
        }
        abstractC11800.itemView.setAlpha(1.0f);
        abstractC11800.itemView.setTranslationX(0.0f);
        abstractC11800.itemView.setTranslationY(0.0f);
        m10755(abstractC11800);
        return true;
    }

    @Override // l.AbstractC3269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10767(AbstractC11800 abstractC11800) {
        View view = abstractC11800.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f66422;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C3575) arrayList.get(size)).f12239 == abstractC11800) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m10755(abstractC11800);
                arrayList.remove(size);
            }
        }
        m47410(this.f66430, abstractC11800);
        if (this.f66429.remove(abstractC11800)) {
            view.setAlpha(1.0f);
            m10755(abstractC11800);
        }
        if (this.f66426.remove(abstractC11800)) {
            view.setAlpha(1.0f);
            m10755(abstractC11800);
        }
        ArrayList arrayList2 = this.f66431;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m47410(arrayList3, abstractC11800);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f66428;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((C3575) arrayList5.get(size4)).f12239 == abstractC11800) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m10755(abstractC11800);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f66421;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(abstractC11800)) {
                    view.setAlpha(1.0f);
                    m10755(abstractC11800);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f66425.remove(abstractC11800);
                this.f66423.remove(abstractC11800);
                this.f66424.remove(abstractC11800);
                this.f66427.remove(abstractC11800);
                m47415();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47412(AbstractC11800 abstractC11800) {
        if (f66420 == null) {
            f66420 = new ValueAnimator().getInterpolator();
        }
        abstractC11800.itemView.animate().setInterpolator(f66420);
        mo10767(abstractC11800);
    }

    @Override // l.AbstractC3269
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10762() {
        return (this.f66426.isEmpty() && this.f66430.isEmpty() && this.f66422.isEmpty() && this.f66429.isEmpty() && this.f66427.isEmpty() && this.f66425.isEmpty() && this.f66423.isEmpty() && this.f66424.isEmpty() && this.f66428.isEmpty() && this.f66421.isEmpty() && this.f66431.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47415() {
        if (mo10762()) {
            return;
        }
        m10753();
    }

    @Override // l.AbstractC3269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10765() {
        ArrayList arrayList = this.f66422;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3575 c3575 = (C3575) arrayList.get(size);
            View view = c3575.f12239.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m10755(c3575.f12239);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f66429;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m10755((AbstractC11800) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f66426;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC11800 abstractC11800 = (AbstractC11800) arrayList3.get(size3);
            abstractC11800.itemView.setAlpha(1.0f);
            m10755(abstractC11800);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f66430;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C23713 c23713 = (C23713) arrayList4.get(size4);
            AbstractC11800 abstractC11801 = c23713.f76846;
            if (abstractC11801 != null) {
                m47411(c23713, abstractC11801);
            }
            AbstractC11800 abstractC11802 = c23713.f76842;
            if (abstractC11802 != null) {
                m47411(c23713, abstractC11802);
            }
        }
        arrayList4.clear();
        if (!mo10762()) {
            return;
        }
        ArrayList arrayList5 = this.f66428;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C3575 c3576 = (C3575) arrayList6.get(size6);
                    View view2 = c3576.f12239.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m10755(c3576.f12239);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f66421;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    AbstractC11800 abstractC11803 = (AbstractC11800) arrayList8.get(size8);
                    abstractC11803.itemView.setAlpha(1.0f);
                    m10755(abstractC11803);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f66431;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C23713 c23714 = (C23713) arrayList10.get(size10);
                        AbstractC11800 abstractC11804 = c23714.f76846;
                        if (abstractC11804 != null) {
                            m47411(c23714, abstractC11804);
                        }
                        AbstractC11800 abstractC11805 = c23714.f76842;
                        if (abstractC11805 != null) {
                            m47411(c23714, abstractC11805);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            } else {
                m47409(this.f66425);
                m47409(this.f66427);
                m47409(this.f66423);
                m47409(this.f66424);
                m10753();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47409(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC11800) arrayList.get(size)).itemView.animate().cancel();
            }
        }
    }

    @Override // l.AbstractC3269
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10758(AbstractC11800 abstractC11800, List list) {
        return !list.isEmpty() || super.mo10758(abstractC11800, list);
    }
}
