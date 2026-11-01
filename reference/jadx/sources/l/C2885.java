package l;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2885 extends AbstractC14671 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator f10872;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f10873;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f10874;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f10875;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f10876;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f10877;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f10878;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f10879;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f10880;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f10881;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f10882;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f10883;

    public C2885() {
        this.f47964 = true;
        this.f10881 = new ArrayList();
        this.f10879 = new ArrayList();
        this.f10875 = new ArrayList();
        this.f10880 = new ArrayList();
        this.f10873 = new ArrayList();
        this.f10882 = new ArrayList();
        this.f10883 = new ArrayList();
        this.f10877 = new ArrayList();
        this.f10878 = new ArrayList();
        this.f10876 = new ArrayList();
        this.f10874 = new ArrayList();
    }

    @Override // l.AbstractC1825
    /* JADX INFO: renamed from: ۬ */
    public final void mo5962() {
        ArrayList<AbstractC12554> arrayList = this.f10881;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f10875;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f10880;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f10879;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (AbstractC12554 abstractC12554 : arrayList) {
            View view = abstractC12554.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f10876.add(abstractC12554);
            viewPropertyAnimatorAnimate.setDuration(m5966()).alpha(0.0f).setListener(new C16997(view, viewPropertyAnimatorAnimate, this, abstractC12554)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f10882.add(arrayList5);
            arrayList2.clear();
            RunnableC0063 runnableC0063 = new RunnableC0063(this, arrayList5);
            if (!zIsEmpty) {
                View view2 = ((C9237) arrayList5.get(0)).f31395.itemView;
                long jM5966 = m5966();
                int i = C5031.f17539;
                view2.postOnAnimationDelayed(runnableC0063, jM5966);
            } else {
                runnableC0063.run();
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f10883.add(arrayList6);
            arrayList3.clear();
            RunnableC16292 runnableC16292 = new RunnableC16292(this, arrayList6);
            if (!zIsEmpty) {
                View view3 = ((C1474) arrayList6.get(0)).f5998.itemView;
                long jM5967 = m5966();
                int i2 = C5031.f17539;
                view3.postOnAnimationDelayed(runnableC16292, jM5967);
            } else {
                runnableC16292.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f10873.add(arrayList7);
        arrayList4.clear();
        RunnableC12059 runnableC12059 = new RunnableC12059(this, arrayList7);
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            long jMax = Math.max(!zIsEmpty2 ? m5959() : 0L, zIsEmpty3 ? 0L : m5951()) + (!zIsEmpty ? m5966() : 0L);
            View view4 = ((AbstractC12554) arrayList7.get(0)).itemView;
            int i3 = C5031.f17539;
            view4.postOnAnimationDelayed(runnableC12059, jMax);
            return;
        }
        runnableC12059.run();
    }

    @Override // l.AbstractC14671
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo8684(AbstractC12554 abstractC12554) {
        m8680(abstractC12554);
        this.f10881.add(abstractC12554);
    }

    @Override // l.AbstractC14671
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo8681(AbstractC12554 abstractC12554) {
        m8680(abstractC12554);
        abstractC12554.itemView.setAlpha(0.0f);
        this.f10879.add(abstractC12554);
    }

    @Override // l.AbstractC14671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8682(AbstractC12554 abstractC12554, int i, int i2, int i3, int i4) {
        View view = abstractC12554.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC12554.itemView.getTranslationY());
        m8680(abstractC12554);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            C9237 c9237 = new C9237();
            c9237.f31395 = abstractC12554;
            c9237.f31393 = translationX;
            c9237.f31396 = translationY;
            c9237.f31392 = i3;
            c9237.f31394 = i4;
            this.f10875.add(c9237);
            return true;
        }
        m5955(abstractC12554);
        return false;
    }

    @Override // l.AbstractC14671
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8683(AbstractC12554 abstractC12554, AbstractC12554 abstractC12555, int i, int i2, int i3, int i4) {
        if (abstractC12554 == abstractC12555) {
            return mo8682(abstractC12554, i, i2, i3, i4);
        }
        float translationX = abstractC12554.itemView.getTranslationX();
        float translationY = abstractC12554.itemView.getTranslationY();
        float alpha = abstractC12554.itemView.getAlpha();
        m8680(abstractC12554);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC12554.itemView.setTranslationX(translationX);
        abstractC12554.itemView.setTranslationY(translationY);
        abstractC12554.itemView.setAlpha(alpha);
        if (abstractC12555 != null) {
            m8680(abstractC12555);
            abstractC12555.itemView.setTranslationX(-i5);
            abstractC12555.itemView.setTranslationY(-i6);
            abstractC12555.itemView.setAlpha(0.0f);
        }
        C1474 c1474 = new C1474();
        c1474.f5998 = abstractC12554;
        c1474.f6001 = abstractC12555;
        c1474.f5999 = i;
        c1474.f6002 = i2;
        c1474.f6000 = i3;
        c1474.f6003 = i4;
        this.f10880.add(c1474);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8678(ArrayList arrayList, AbstractC12554 abstractC12554) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C1474 c1474 = (C1474) arrayList.get(size);
            if (m8679(c1474, abstractC12554) && c1474.f5998 == null && c1474.f6001 == null) {
                arrayList.remove(c1474);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8679(C1474 c1474, AbstractC12554 abstractC12554) {
        if (c1474.f6001 == abstractC12554) {
            c1474.f6001 = null;
        } else {
            if (c1474.f5998 != abstractC12554) {
                return false;
            }
            c1474.f5998 = null;
        }
        abstractC12554.itemView.setAlpha(1.0f);
        abstractC12554.itemView.setTranslationX(0.0f);
        abstractC12554.itemView.setTranslationY(0.0f);
        m5955(abstractC12554);
        return true;
    }

    @Override // l.AbstractC1825
    /* JADX INFO: renamed from: ܰ */
    public final void mo5965(AbstractC12554 abstractC12554) {
        View view = abstractC12554.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f10875;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C9237) arrayList.get(size)).f31395 == abstractC12554) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5955(abstractC12554);
                arrayList.remove(size);
            }
        }
        m8678(this.f10880, abstractC12554);
        if (this.f10881.remove(abstractC12554)) {
            view.setAlpha(1.0f);
            m5955(abstractC12554);
        }
        if (this.f10879.remove(abstractC12554)) {
            view.setAlpha(1.0f);
            m5955(abstractC12554);
        }
        ArrayList arrayList2 = this.f10883;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m8678(arrayList3, abstractC12554);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f10882;
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
                if (((C9237) arrayList5.get(size4)).f31395 == abstractC12554) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5955(abstractC12554);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f10873;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(abstractC12554)) {
                    view.setAlpha(1.0f);
                    m5955(abstractC12554);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f10876.remove(abstractC12554);
                this.f10877.remove(abstractC12554);
                this.f10874.remove(abstractC12554);
                this.f10878.remove(abstractC12554);
                m8685();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m8680(AbstractC12554 abstractC12554) {
        if (f10872 == null) {
            f10872 = new ValueAnimator().getInterpolator();
        }
        abstractC12554.itemView.animate().setInterpolator(f10872);
        mo5965(abstractC12554);
    }

    @Override // l.AbstractC1825
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo5950() {
        return (this.f10879.isEmpty() && this.f10880.isEmpty() && this.f10875.isEmpty() && this.f10881.isEmpty() && this.f10878.isEmpty() && this.f10876.isEmpty() && this.f10877.isEmpty() && this.f10874.isEmpty() && this.f10882.isEmpty() && this.f10873.isEmpty() && this.f10883.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m8685() {
        if (mo5950()) {
            return;
        }
        m5953();
    }

    @Override // l.AbstractC1825
    /* JADX INFO: renamed from: ܰ */
    public final void mo5963() {
        ArrayList arrayList = this.f10875;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C9237 c9237 = (C9237) arrayList.get(size);
            View view = c9237.f31395.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5955(c9237.f31395);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f10881;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m5955((AbstractC12554) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f10879;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC12554 abstractC12554 = (AbstractC12554) arrayList3.get(size3);
            abstractC12554.itemView.setAlpha(1.0f);
            m5955(abstractC12554);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f10880;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C1474 c1474 = (C1474) arrayList4.get(size4);
            AbstractC12554 abstractC12555 = c1474.f5998;
            if (abstractC12555 != null) {
                m8679(c1474, abstractC12555);
            }
            AbstractC12554 abstractC12556 = c1474.f6001;
            if (abstractC12556 != null) {
                m8679(c1474, abstractC12556);
            }
        }
        arrayList4.clear();
        if (!mo5950()) {
            return;
        }
        ArrayList arrayList5 = this.f10882;
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
                    C9237 c9238 = (C9237) arrayList6.get(size6);
                    View view2 = c9238.f31395.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5955(c9238.f31395);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f10873;
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
                    AbstractC12554 abstractC12557 = (AbstractC12554) arrayList8.get(size8);
                    abstractC12557.itemView.setAlpha(1.0f);
                    m5955(abstractC12557);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f10883;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C1474 c1475 = (C1474) arrayList10.get(size10);
                        AbstractC12554 abstractC12558 = c1475.f5998;
                        if (abstractC12558 != null) {
                            m8679(c1475, abstractC12558);
                        }
                        AbstractC12554 abstractC12559 = c1475.f6001;
                        if (abstractC12559 != null) {
                            m8679(c1475, abstractC12559);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            } else {
                m8677(this.f10876);
                m8677(this.f10878);
                m8677(this.f10877);
                m8677(this.f10874);
                m5953();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8677(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC12554) arrayList.get(size)).itemView.animate().cancel();
            }
        }
    }

    @Override // l.AbstractC1825
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5957(AbstractC12554 abstractC12554, List list) {
        return !list.isEmpty() || super.mo5957(abstractC12554, list);
    }
}
