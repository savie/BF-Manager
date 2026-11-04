package l;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C11999 extends AbstractC12218 implements InterfaceC0286 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f38671;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f38672;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f38674;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public GestureDetector f38676;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f38679;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC16474 f38680;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f38681;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f38683;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f38684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f38685;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f38687;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f38689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Rect f38690;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f38691;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C25227 f38692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f38695;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38697;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17220 f38698;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f38696 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float[] f38678 = new float[2];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC11800 f38677 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f38694 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38675 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f38673 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f38682 = new RunnableC14982(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public View f38686 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18931 f38688 = new C12745(this);

    @Override // l.InterfaceC0286
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1852(View view) {
    }

    public C11999(AbstractC16474 abstractC16474) {
        this.f38680 = abstractC16474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30166(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30173(C25227 c25227) {
        C25227 c25228 = this.f38692;
        if (c25228 == c25227) {
            return;
        }
        InterfaceC18931 interfaceC18931 = this.f38688;
        if (c25228 != null) {
            c25228.removeItemDecoration(this);
            this.f38692.removeOnItemTouchListener(interfaceC18931);
            this.f38692.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f38673;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C23188 c23188 = (C23188) arrayList.get(0);
                c23188.f75142.cancel();
                this.f38680.mo25773(this.f38692, c23188.f75150);
            }
            arrayList.clear();
            this.f38686 = null;
            VelocityTracker velocityTracker = this.f38679;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f38679 = null;
            }
            C17220 c17220 = this.f38698;
            if (c17220 != null) {
                c17220.m40440();
                this.f38698 = null;
            }
            if (this.f38676 != null) {
                this.f38676 = null;
            }
        }
        this.f38692 = c25227;
        if (c25227 != null) {
            Resources resources = c25227.getResources();
            this.f38671 = resources.getDimension(R.dimen.MT_Protector);
            this.f38687 = resources.getDimension(R.dimen.MT_Protector);
            this.f38693 = ViewConfiguration.get(this.f38692.getContext()).getScaledTouchSlop();
            this.f38692.addItemDecoration(this);
            this.f38692.addOnItemTouchListener(interfaceC18931);
            this.f38692.addOnChildAttachStateChangeListener(this);
            this.f38698 = new C17220(this);
            this.f38676 = new GestureDetector(this.f38692.getContext(), this.f38698);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30165(float[] fArr) {
        if ((this.f38697 & 12) != 0) {
            fArr[0] = (this.f38674 + this.f38685) - this.f38677.itemView.getLeft();
        } else {
            fArr[0] = this.f38677.itemView.getTranslationX();
        }
        if ((this.f38697 & 3) != 0) {
            fArr[1] = (this.f38684 + this.f38683) - this.f38677.itemView.getTop();
        } else {
            fArr[1] = this.f38677.itemView.getTranslationY();
        }
    }

    @Override // l.AbstractC12218
    public final void onDrawOver(Canvas canvas, C25227 c25227, C15529 c15529) {
        boolean z = false;
        if (this.f38677 != null) {
            float[] fArr = this.f38678;
            m30165(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC11800 abstractC11800 = this.f38677;
        this.f38680.getClass();
        ArrayList arrayList = this.f38673;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C23188 c23188 = (C23188) arrayList.get(i);
            int iSave = canvas.save();
            View view = c23188.f75150.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC11800 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C23188 c23189 = (C23188) arrayList.get(i2);
            boolean z2 = c23189.f75148;
            if (z2 && !c23189.f75149) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c25227.invalidate();
        }
    }

    @Override // l.AbstractC12218
    public final void onDraw(Canvas canvas, C25227 c25227, C15529 c15529) {
        float f;
        float f2;
        if (this.f38677 != null) {
            float[] fArr = this.f38678;
            m30165(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC11800 abstractC11800 = this.f38677;
        int i = this.f38675;
        AbstractC16474 abstractC16474 = this.f38680;
        abstractC16474.getClass();
        ArrayList arrayList = this.f38673;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C23188 c23188 = (C23188) arrayList.get(i2);
            c23188.m52112();
            int iSave = canvas.save();
            abstractC16474.mo27642(canvas, c25227, c23188.f75150, c23188.f75145, c23188.f75146, c23188.f75139, false);
            canvas.restoreToCount(iSave);
            i2++;
        }
        if (abstractC11800 != null) {
            int iSave2 = canvas.save();
            abstractC16474.mo27642(canvas, c25227, abstractC11800, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[PHI: r6
      0x0098: PHI (r6v12 int) = (r6v11 int), (r6v13 int) binds: [B:36:0x0096, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30171(AbstractC11800 abstractC11800, int i) {
        AbstractC16474 abstractC16474;
        boolean z;
        boolean z2;
        int i2;
        char c;
        float fSignum;
        float fSignum2;
        char c2;
        long jM10763;
        int iM30167;
        int iM39084;
        if (abstractC11800 == this.f38677 && i == this.f38675) {
            return;
        }
        this.f38691 = Long.MIN_VALUE;
        int i3 = this.f38675;
        m30172(abstractC11800, true);
        this.f38675 = i;
        if (i == 2) {
            if (abstractC11800 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f38686 = abstractC11800.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        AbstractC11800 abstractC11801 = this.f38677;
        AbstractC16474 abstractC16475 = this.f38680;
        if (abstractC11801 != null) {
            if (abstractC11801.itemView.getParent() == null) {
                z = false;
                m30176(abstractC11801.itemView);
                abstractC16474 = abstractC16475;
                abstractC16474.mo25773(this.f38692, abstractC11801);
                z2 = false;
            } else {
                if (i3 == 2 || this.f38675 == 2) {
                    i2 = 0;
                } else {
                    int iMo9678 = abstractC16475.mo9678(abstractC11801);
                    int iM39082 = (AbstractC16474.m39082(iMo9678, this.f38692.getLayoutDirection()) & 65280) >> 8;
                    if (iM39082 == 0) {
                        i2 = 0;
                    } else {
                        int i5 = (iMo9678 & 65280) >> 8;
                        if (Math.abs(this.f38685) > Math.abs(this.f38683)) {
                            iM30167 = m30168(abstractC11801, iM39082);
                            if (iM30167 <= 0) {
                                iM39084 = m30167(abstractC11801, iM39082);
                                if (iM39084 <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i5 & iM30167) == 0) {
                                iM39084 = AbstractC16474.m39084(iM30167, this.f38692.getLayoutDirection());
                            } else {
                                i2 = iM30167;
                            }
                            i2 = iM39084;
                        } else {
                            iM30167 = m30167(abstractC11801, iM39082);
                            if (iM30167 > 0) {
                                i2 = iM30167;
                            } else {
                                int iM30168 = m30168(abstractC11801, iM39082);
                                if (iM30168 <= 0) {
                                    i2 = 0;
                                } else if ((i5 & iM30168) == 0) {
                                    iM39084 = AbstractC16474.m39084(iM30168, this.f38692.getLayoutDirection());
                                    i2 = iM39084;
                                } else {
                                    i2 = iM30168;
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f38679;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f38679 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f38683) * this.f38692.getHeight();
                    fSignum2 = 0.0f;
                } else {
                    if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                        c = 0;
                        fSignum2 = Math.signum(this.f38685) * this.f38692.getWidth();
                    } else {
                        c = 0;
                        fSignum2 = 0.0f;
                    }
                    fSignum = 0.0f;
                }
                if (i3 == 2) {
                    c2 = '\b';
                } else {
                    c2 = i2 > 0 ? (char) 2 : (char) 4;
                }
                float[] fArr = this.f38678;
                m30165(fArr);
                char c3 = c2;
                C5288 c5288 = new C5288(this, abstractC11801, i3, fArr[c], fArr[1], fSignum2, fSignum, i2, abstractC11801);
                C25227 c25227 = this.f38692;
                abstractC16475.getClass();
                AbstractC3269 itemAnimator = c25227.getItemAnimator();
                if (itemAnimator == null) {
                    jM10763 = c3 == '\b' ? 200L : 250L;
                } else if (c3 == '\b') {
                    jM10763 = itemAnimator.m10764();
                } else {
                    jM10763 = itemAnimator.m10763();
                }
                ValueAnimator valueAnimator = c5288.f75142;
                valueAnimator.setDuration(jM10763);
                this.f38673.add(c5288);
                abstractC11801.setIsRecyclable(false);
                valueAnimator.start();
                abstractC16474 = abstractC16475;
                z2 = true;
                z = false;
            }
            this.f38677 = null;
        } else {
            abstractC16474 = abstractC16475;
            z = false;
            z2 = false;
        }
        if (abstractC11800 != null) {
            this.f38697 = (AbstractC16474.m39082(abstractC16474.mo9678(abstractC11800), this.f38692.getLayoutDirection()) & i4) >> (this.f38675 * 8);
            this.f38674 = abstractC11800.itemView.getLeft();
            this.f38684 = abstractC11800.itemView.getTop();
            this.f38677 = abstractC11800;
            if (i == 2) {
                abstractC11800.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.f38692.getParent();
        if (parent != null) {
            if (this.f38677 != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.f38692.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        abstractC16474.getClass();
        this.f38692.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30174() {
        int iM39085;
        int iM39086;
        if (this.f38677 == null) {
            this.f38691 = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f38691;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        AbstractC21169 layoutManager = this.f38692.getLayoutManager();
        if (this.f38690 == null) {
            this.f38690 = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f38677.itemView, this.f38690);
        if (layoutManager.canScrollHorizontally()) {
            int i = (int) (this.f38674 + this.f38685);
            int paddingLeft = (i - this.f38690.left) - this.f38692.getPaddingLeft();
            float f = this.f38685;
            if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((this.f38677.itemView.getWidth() + i) + this.f38690.right) - (this.f38692.getWidth() - this.f38692.getPaddingRight())) <= 0)) {
                iM39085 = 0;
            } else {
                iM39085 = paddingLeft;
            }
        } else {
            iM39085 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = (int) (this.f38684 + this.f38683);
            int paddingTop = (i2 - this.f38690.top) - this.f38692.getPaddingTop();
            float f2 = this.f38683;
            if ((f2 >= 0.0f || paddingTop >= 0) && (f2 <= 0.0f || (paddingTop = ((this.f38677.itemView.getHeight() + i2) + this.f38690.bottom) - (this.f38692.getHeight() - this.f38692.getPaddingBottom())) <= 0)) {
                iM39086 = 0;
            } else {
                iM39086 = paddingTop;
            }
        } else {
            iM39086 = 0;
        }
        if (iM39085 != 0) {
            C25227 c25227 = this.f38692;
            int width = this.f38677.itemView.getWidth();
            this.f38692.getWidth();
            iM39085 = this.f38680.m39085(c25227, width, iM39085, j2);
        }
        int i3 = iM39085;
        if (iM39086 != 0) {
            C25227 c25228 = this.f38692;
            int height = this.f38677.itemView.getHeight();
            this.f38692.getHeight();
            iM39086 = this.f38680.m39085(c25228, height, iM39086, j2);
        }
        if (i3 != 0 || iM39086 != 0) {
            if (this.f38691 == Long.MIN_VALUE) {
                this.f38691 = jCurrentTimeMillis;
            }
            this.f38692.scrollBy(i3, iM39086);
            return true;
        }
        this.f38691 = Long.MIN_VALUE;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30170(AbstractC11800 abstractC11800) {
        ArrayList arrayList;
        int i;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (!this.f38692.isLayoutRequested() && this.f38675 == 2) {
            AbstractC16474 abstractC16474 = this.f38680;
            abstractC16474.getClass();
            int i2 = (int) (this.f38674 + this.f38685);
            int i3 = (int) (this.f38684 + this.f38683);
            if (Math.abs(i3 - abstractC11800.itemView.getTop()) >= abstractC11800.itemView.getHeight() * 0.5f || Math.abs(i2 - abstractC11800.itemView.getLeft()) >= abstractC11800.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f38689;
                if (arrayList2 == null) {
                    this.f38689 = new ArrayList();
                    this.f38695 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f38695.clear();
                }
                int iRound = Math.round(this.f38674 + this.f38685);
                int iRound2 = Math.round(this.f38684 + this.f38683);
                int width = abstractC11800.itemView.getWidth() + iRound;
                int height = abstractC11800.itemView.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC21169 layoutManager = this.f38692.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != abstractC11800.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        AbstractC11800 childViewHolder = this.f38692.getChildViewHolder(childAt);
                        if (abstractC16474.mo39086(childViewHolder)) {
                            int iAbs5 = Math.abs(i4 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f38689.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f38695.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f38689.add(i9, childViewHolder);
                            this.f38695.add(i9, Integer.valueOf(i7));
                        }
                    }
                    i6++;
                    layoutManager = layoutManager;
                    iRound2 = iRound2;
                    iRound = iRound;
                }
                ArrayList arrayList3 = this.f38689;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = abstractC11800.itemView.getWidth() + i2;
                int height2 = abstractC11800.itemView.getHeight() + i3;
                int left2 = i2 - abstractC11800.itemView.getLeft();
                int top2 = i3 - abstractC11800.itemView.getTop();
                int size2 = arrayList3.size();
                AbstractC11800 abstractC11801 = null;
                int i11 = -1;
                int i12 = 0;
                while (i12 < size2) {
                    AbstractC11800 abstractC11802 = (AbstractC11800) arrayList3.get(i12);
                    if (left2 <= 0 || (right = abstractC11802.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (abstractC11802.itemView.getRight() > abstractC11800.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            i11 = iAbs4;
                            abstractC11801 = abstractC11802;
                        }
                    }
                    if (left2 < 0 && (left = abstractC11802.itemView.getLeft() - i2) > 0 && abstractC11802.itemView.getLeft() < abstractC11800.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        abstractC11801 = abstractC11802;
                    }
                    if (top2 < 0 && (top = abstractC11802.itemView.getTop() - i3) > 0 && abstractC11802.itemView.getTop() < abstractC11800.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        abstractC11801 = abstractC11802;
                    }
                    if (top2 > 0 && (bottom = abstractC11802.itemView.getBottom() - height2) < 0 && abstractC11802.itemView.getBottom() > abstractC11800.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        abstractC11801 = abstractC11802;
                    }
                    i12++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (abstractC11801 == null) {
                    this.f38689.clear();
                    this.f38695.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC11801.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC11800.getAbsoluteAdapterPosition();
                if (abstractC16474.mo9676(this.f38692, abstractC11800, abstractC11801)) {
                    this.f38680.mo25774(this.f38692, abstractC11800, absoluteAdapterPosition2, abstractC11801, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    @Override // l.InterfaceC0286
    /* JADX INFO: renamed from: ۙ */
    public final void mo1851(View view) {
        m30176(view);
        AbstractC11800 childViewHolder = this.f38692.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC11800 abstractC11800 = this.f38677;
        if (abstractC11800 != null && childViewHolder == abstractC11800) {
            m30171((AbstractC11800) null, 0);
            return;
        }
        m30172(childViewHolder, false);
        if (this.f38696.remove(childViewHolder.itemView)) {
            this.f38680.mo25773(this.f38692, childViewHolder);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30172(AbstractC11800 abstractC11800, boolean z) {
        C23188 c23188;
        ArrayList arrayList = this.f38673;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c23188 = (C23188) arrayList.get(size);
            }
        } while (c23188.f75150 != abstractC11800);
        c23188.f75147 |= z;
        if (!c23188.f75148) {
            c23188.f75142.cancel();
        }
        arrayList.remove(size);
    }

    @Override // l.AbstractC12218
    public final void getItemOffsets(Rect rect, View view, C25227 c25227, C15529 c15529) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30169(int i, int i2, MotionEvent motionEvent) {
        View viewM30175;
        if (this.f38677 == null && i == 2 && this.f38675 != 2) {
            AbstractC16474 abstractC16474 = this.f38680;
            if (abstractC16474.mo17827() && this.f38692.getScrollState() != 1) {
                AbstractC21169 layoutManager = this.f38692.getLayoutManager();
                int i3 = this.f38694;
                AbstractC11800 childViewHolder = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f38672;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f38681;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f38693;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM30175 = m30175(motionEvent)) != null))) {
                        childViewHolder = this.f38692.getChildViewHolder(viewM30175);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                int iM39082 = (AbstractC16474.m39082(abstractC16474.mo9678(childViewHolder), this.f38692.getLayoutDirection()) & 65280) >> 8;
                if (iM39082 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f38672;
                float f3 = y2 - this.f38681;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f38693;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iM39082 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iM39082 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iM39082 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iM39082 & 2) == 0) {
                            return;
                        }
                    }
                    this.f38683 = 0.0f;
                    this.f38685 = 0.0f;
                    this.f38694 = motionEvent.getPointerId(0);
                    m30171(childViewHolder, 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View m30175(MotionEvent motionEvent) {
        C23188 c23188;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC11800 abstractC11800 = this.f38677;
        if (abstractC11800 != null) {
            View view2 = abstractC11800.itemView;
            if (m30166(view2, x, y, this.f38674 + this.f38685, this.f38684 + this.f38683)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f38673;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c23188 = (C23188) arrayList.get(size);
                view = c23188.f75150.itemView;
            } else {
                return this.f38692.findChildViewUnder(x, y);
            }
        } while (!m30166(view, x, y, c23188.f75145, c23188.f75146));
        return view;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30178(AbstractC11800 abstractC11800) {
        if ((AbstractC16474.m39082(this.f38680.mo9678(abstractC11800), this.f38692.getLayoutDirection()) & 16711680) == 0 || abstractC11800.itemView.getParent() != this.f38692) {
            return;
        }
        VelocityTracker velocityTracker = this.f38679;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f38679 = VelocityTracker.obtain();
        this.f38683 = 0.0f;
        this.f38685 = 0.0f;
        m30171(abstractC11800, 2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30177(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f38672;
        this.f38685 = f;
        this.f38683 = y - this.f38681;
        if ((i & 4) == 0) {
            this.f38685 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f38685 = Math.min(0.0f, this.f38685);
        }
        if ((i & 1) == 0) {
            this.f38683 = Math.max(0.0f, this.f38683);
        }
        if ((i & 2) == 0) {
            this.f38683 = Math.min(0.0f, this.f38683);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m30168(AbstractC11800 abstractC11800, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f38685 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f38679;
        AbstractC16474 abstractC16474 = this.f38680;
        if (velocityTracker != null && this.f38694 > -1) {
            float f = this.f38687;
            abstractC16474.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f38679.getXVelocity(this.f38694);
            float yVelocity = this.f38679.getYVelocity(this.f38694);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f38671 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fMo27641 = abstractC16474.mo27641() * this.f38692.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f38685) <= fMo27641) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m30167(AbstractC11800 abstractC11800, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f38683 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f38679;
        AbstractC16474 abstractC16474 = this.f38680;
        if (velocityTracker != null && this.f38694 > -1) {
            float f = this.f38687;
            abstractC16474.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f38679.getXVelocity(this.f38694);
            float yVelocity = this.f38679.getYVelocity(this.f38694);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f38671 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fMo27641 = abstractC16474.mo27641() * this.f38692.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f38683) <= fMo27641) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30176(View view) {
        if (view == this.f38686) {
            this.f38686 = null;
        }
    }
}
