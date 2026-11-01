package l;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C4647 extends AbstractC3236 implements InterfaceC1264 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f16410;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f16411;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f16412;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f16413;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f16415;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f16416;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f16417;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f16418;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC11123 f16422;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10614 f16424;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f16426;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f16427;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f16428;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Rect f16429;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C17492 f16432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16433;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f16434;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f16436;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C23823 f16437;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16431 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f16423 = new float[2];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC12554 f16421 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16425 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16414 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f16419 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Runnable f16420 = new RunnableC20295(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f16430 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4086 f16435 = new C0538(this);

    @Override // l.InterfaceC1264
    /* JADX INFO: renamed from: ܰ */
    public final void mo4588(View view) {
    }

    public C4647(AbstractC11123 abstractC11123) {
        this.f16422 = abstractC11123;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12818(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12825(C17492 c17492) {
        C17492 c17493 = this.f16432;
        if (c17493 == c17492) {
            return;
        }
        InterfaceC4086 interfaceC4086 = this.f16435;
        if (c17493 != null) {
            c17493.removeItemDecoration(this);
            this.f16432.removeOnItemTouchListener(interfaceC4086);
            this.f16432.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f16419;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1949 c1949 = (C1949) arrayList.get(0);
                c1949.f7342.cancel();
                this.f16422.mo28055(this.f16432, c1949.f7349);
            }
            arrayList.clear();
            this.f16430 = null;
            VelocityTracker velocityTracker = this.f16416;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16416 = null;
            }
            C23823 c23823 = this.f16437;
            if (c23823 != null) {
                c23823.m52501();
                this.f16437 = null;
            }
            if (this.f16424 != null) {
                this.f16424 = null;
            }
        }
        this.f16432 = c17492;
        if (c17492 != null) {
            Resources resources = c17492.getResources();
            this.f16428 = resources.getDimension(R.dimen.MT_Protector);
            this.f16426 = resources.getDimension(R.dimen.MT_Protector);
            this.f16433 = ViewConfiguration.get(this.f16432.getContext()).getScaledTouchSlop();
            this.f16432.addItemDecoration(this);
            this.f16432.addOnItemTouchListener(interfaceC4086);
            this.f16432.addOnChildAttachStateChangeListener(this);
            this.f16437 = new C23823(this);
            this.f16424 = new C10614(this.f16432.getContext(), this.f16437);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12817(float[] fArr) {
        if ((this.f16418 & 12) != 0) {
            fArr[0] = (this.f16434 + this.f16436) - this.f16421.itemView.getLeft();
        } else {
            fArr[0] = this.f16421.itemView.getTranslationX();
        }
        if ((this.f16418 & 3) != 0) {
            fArr[1] = (this.f16427 + this.f16411) - this.f16421.itemView.getTop();
        } else {
            fArr[1] = this.f16421.itemView.getTranslationY();
        }
    }

    @Override // l.AbstractC3236
    public final void onDrawOver(Canvas canvas, C17492 c17492, C16082 c16082) {
        boolean z = false;
        if (this.f16421 != null) {
            float[] fArr = this.f16423;
            m12817(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC12554 abstractC12554 = this.f16421;
        this.f16422.getClass();
        ArrayList arrayList = this.f16419;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1949 c1949 = (C1949) arrayList.get(i);
            int iSave = canvas.save();
            View view = c1949.f7349.itemView;
            canvas.restoreToCount(iSave);
        }
        if (abstractC12554 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1949 c19410 = (C1949) arrayList.get(i2);
            boolean z2 = c19410.f7345;
            if (z2 && !c19410.f7338) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c17492.invalidate();
        }
    }

    @Override // l.AbstractC3236
    public final void onDraw(Canvas canvas, C17492 c17492, C16082 c16082) {
        float f;
        float f2;
        if (this.f16421 != null) {
            float[] fArr = this.f16423;
            m12817(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC12554 abstractC12554 = this.f16421;
        int i = this.f16414;
        AbstractC11123 abstractC11123 = this.f16422;
        abstractC11123.getClass();
        ArrayList arrayList = this.f16419;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C1949 c1949 = (C1949) arrayList.get(i2);
            c1949.m6309();
            int iSave = canvas.save();
            abstractC11123.mo28054(canvas, c17492, c1949.f7349, c1949.f7346, c1949.f7347, c1949.f7340, false);
            canvas.restoreToCount(iSave);
            i2++;
        }
        if (abstractC12554 != null) {
            int iSave2 = canvas.save();
            abstractC11123.mo28054(canvas, c17492, abstractC12554, f, f2, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009b A[PHI: r6
      0x009b: PHI (r6v13 int) = (r6v12 int), (r6v14 int) binds: [B:36:0x0099, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12823(AbstractC12554 abstractC12554, int i) {
        AbstractC11123 abstractC11123;
        boolean z;
        boolean z2;
        int i2;
        char c;
        float fSignum;
        float fSignum2;
        char c2;
        long jM5959;
        int iM12819;
        int iM28051;
        if (abstractC12554 == this.f16421 && i == this.f16414) {
            return;
        }
        this.f16415 = Long.MIN_VALUE;
        int i3 = this.f16414;
        m12824(abstractC12554, true);
        this.f16414 = i;
        if (i == 2) {
            if (abstractC12554 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f16430 = abstractC12554.itemView;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        AbstractC12554 abstractC12555 = this.f16421;
        AbstractC11123 abstractC11124 = this.f16422;
        if (abstractC12555 != null) {
            if (abstractC12555.itemView.getParent() != null) {
                if (i3 == 2 || this.f16414 == 2) {
                    i2 = 0;
                } else {
                    int iMo8538 = abstractC11124.mo8538(abstractC12555);
                    C17492 c17492 = this.f16432;
                    int i5 = C5031.f17539;
                    int iM28049 = (AbstractC11123.m28049(iMo8538, c17492.getLayoutDirection()) & 65280) >> 8;
                    if (iM28049 == 0) {
                        i2 = 0;
                    } else {
                        int i6 = (iMo8538 & 65280) >> 8;
                        if (Math.abs(this.f16436) > Math.abs(this.f16411)) {
                            iM12819 = m12820(abstractC12555, iM28049);
                            if (iM12819 <= 0) {
                                iM28051 = m12819(abstractC12555, iM28049);
                                if (iM28051 <= 0) {
                                    i2 = 0;
                                }
                            } else if ((i6 & iM12819) == 0) {
                                iM28051 = AbstractC11123.m28051(iM12819, this.f16432.getLayoutDirection());
                            } else {
                                i2 = iM12819;
                            }
                            i2 = iM28051;
                        } else {
                            iM12819 = m12819(abstractC12555, iM28049);
                            if (iM12819 > 0) {
                                i2 = iM12819;
                            } else {
                                int iM12820 = m12820(abstractC12555, iM28049);
                                if (iM12820 <= 0) {
                                    i2 = 0;
                                } else if ((i6 & iM12820) == 0) {
                                    iM28051 = AbstractC11123.m28051(iM12820, this.f16432.getLayoutDirection());
                                    i2 = iM28051;
                                } else {
                                    i2 = iM12820;
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f16416;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f16416 = null;
                }
                if (i2 == 1 || i2 == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f16411) * this.f16432.getHeight();
                    fSignum2 = 0.0f;
                } else {
                    if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                        c = 0;
                        fSignum2 = Math.signum(this.f16436) * this.f16432.getWidth();
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
                float[] fArr = this.f16423;
                m12817(fArr);
                char c3 = c2;
                C16767 c16767 = new C16767(this, abstractC12555, i3, fArr[c], fArr[1], fSignum2, fSignum, i2, abstractC12555);
                C17492 c17493 = this.f16432;
                abstractC11124.getClass();
                AbstractC1825 itemAnimator = c17493.getItemAnimator();
                if (itemAnimator == null) {
                    jM5959 = c3 == '\b' ? 200L : 250L;
                } else {
                    jM5959 = c3 == '\b' ? itemAnimator.m5959() : itemAnimator.m5966();
                }
                ValueAnimator valueAnimator = c16767.f7342;
                valueAnimator.setDuration(jM5959);
                this.f16419.add(c16767);
                abstractC12555.setIsRecyclable(false);
                valueAnimator.start();
                abstractC11123 = abstractC11124;
                z2 = true;
                z = false;
            } else {
                z = false;
                m12828(abstractC12555.itemView);
                abstractC11123 = abstractC11124;
                abstractC11123.mo28055(this.f16432, abstractC12555);
                z2 = false;
            }
            this.f16421 = null;
        } else {
            abstractC11123 = abstractC11124;
            z = false;
            z2 = false;
        }
        if (abstractC12554 != null) {
            C17492 c17494 = this.f16432;
            int iMo8539 = abstractC11123.mo8538(abstractC12554);
            int i7 = C5031.f17539;
            this.f16418 = (AbstractC11123.m28049(iMo8539, c17494.getLayoutDirection()) & i4) >> (this.f16414 * 8);
            this.f16434 = abstractC12554.itemView.getLeft();
            this.f16427 = abstractC12554.itemView.getTop();
            this.f16421 = abstractC12554;
            if (i == 2) {
                abstractC12554.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.f16432.getParent();
        if (parent != null) {
            if (this.f16421 != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.f16432.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        abstractC11123.getClass();
        this.f16432.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12826() {
        int iM28053;
        int iM28054;
        if (this.f16421 == null) {
            this.f16415 = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f16415;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        AbstractC5498 layoutManager = this.f16432.getLayoutManager();
        if (this.f16429 == null) {
            this.f16429 = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f16421.itemView, this.f16429);
        if (layoutManager.canScrollHorizontally()) {
            int i = (int) (this.f16434 + this.f16436);
            int paddingLeft = (i - this.f16429.left) - this.f16432.getPaddingLeft();
            float f = this.f16436;
            if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((this.f16421.itemView.getWidth() + i) + this.f16429.right) - (this.f16432.getWidth() - this.f16432.getPaddingRight())) <= 0)) {
                iM28053 = 0;
            } else {
                iM28053 = paddingLeft;
            }
        } else {
            iM28053 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = (int) (this.f16427 + this.f16411);
            int paddingTop = (i2 - this.f16429.top) - this.f16432.getPaddingTop();
            float f2 = this.f16411;
            if ((f2 >= 0.0f || paddingTop >= 0) && (f2 <= 0.0f || (paddingTop = ((this.f16421.itemView.getHeight() + i2) + this.f16429.bottom) - (this.f16432.getHeight() - this.f16432.getPaddingBottom())) <= 0)) {
                iM28054 = 0;
            } else {
                iM28054 = paddingTop;
            }
        } else {
            iM28054 = 0;
        }
        if (iM28053 != 0) {
            C17492 c17492 = this.f16432;
            int width = this.f16421.itemView.getWidth();
            this.f16432.getWidth();
            iM28053 = this.f16422.m28053(c17492, width, iM28053, j2);
        }
        int i3 = iM28053;
        if (iM28054 != 0) {
            C17492 c17493 = this.f16432;
            int height = this.f16421.itemView.getHeight();
            this.f16432.getHeight();
            iM28054 = this.f16422.m28053(c17493, height, iM28054, j2);
        }
        if (i3 != 0 || iM28054 != 0) {
            if (this.f16415 == Long.MIN_VALUE) {
                this.f16415 = jCurrentTimeMillis;
            }
            this.f16432.scrollBy(i3, iM28054);
            return true;
        }
        this.f16415 = Long.MIN_VALUE;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12822(AbstractC12554 abstractC12554) {
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
        if (!this.f16432.isLayoutRequested() && this.f16414 == 2) {
            AbstractC11123 abstractC11123 = this.f16422;
            abstractC11123.getClass();
            int i2 = (int) (this.f16434 + this.f16436);
            int i3 = (int) (this.f16427 + this.f16411);
            if (Math.abs(i3 - abstractC12554.itemView.getTop()) >= abstractC12554.itemView.getHeight() * 0.5f || Math.abs(i2 - abstractC12554.itemView.getLeft()) >= abstractC12554.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f16410;
                if (arrayList2 == null) {
                    this.f16410 = new ArrayList();
                    this.f16412 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f16412.clear();
                }
                int iRound = Math.round(this.f16434 + this.f16436);
                int iRound2 = Math.round(this.f16427 + this.f16411);
                int width = abstractC12554.itemView.getWidth() + iRound;
                int height = abstractC12554.itemView.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                AbstractC5498 layoutManager = this.f16432.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = layoutManager.getChildAt(i6);
                    if (childAt != abstractC12554.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                        AbstractC12554 childViewHolder = this.f16432.getChildViewHolder(childAt);
                        if (abstractC11123.mo28057(childViewHolder)) {
                            int iAbs5 = Math.abs(i4 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f16410.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f16412.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f16410.add(i9, childViewHolder);
                            this.f16412.add(i9, Integer.valueOf(i7));
                        }
                    }
                    i6++;
                    layoutManager = layoutManager;
                    iRound2 = iRound2;
                    iRound = iRound;
                }
                ArrayList arrayList3 = this.f16410;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = abstractC12554.itemView.getWidth() + i2;
                int height2 = abstractC12554.itemView.getHeight() + i3;
                int left2 = i2 - abstractC12554.itemView.getLeft();
                int top2 = i3 - abstractC12554.itemView.getTop();
                int size2 = arrayList3.size();
                AbstractC12554 abstractC12555 = null;
                int i11 = -1;
                int i12 = 0;
                while (i12 < size2) {
                    AbstractC12554 abstractC12556 = (AbstractC12554) arrayList3.get(i12);
                    if (left2 <= 0 || (right = abstractC12556.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (abstractC12556.itemView.getRight() > abstractC12554.itemView.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                            i11 = iAbs4;
                            abstractC12555 = abstractC12556;
                        }
                    }
                    if (left2 < 0 && (left = abstractC12556.itemView.getLeft() - i2) > 0 && abstractC12556.itemView.getLeft() < abstractC12554.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                        i11 = iAbs3;
                        abstractC12555 = abstractC12556;
                    }
                    if (top2 < 0 && (top = abstractC12556.itemView.getTop() - i3) > 0 && abstractC12556.itemView.getTop() < abstractC12554.itemView.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                        i11 = iAbs2;
                        abstractC12555 = abstractC12556;
                    }
                    if (top2 > 0 && (bottom = abstractC12556.itemView.getBottom() - height2) < 0 && abstractC12556.itemView.getBottom() > abstractC12554.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                        i11 = iAbs;
                        abstractC12555 = abstractC12556;
                    }
                    i12++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (abstractC12555 == null) {
                    this.f16410.clear();
                    this.f16412.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC12555.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC12554.getAbsoluteAdapterPosition();
                if (abstractC11123.mo8535(this.f16432, abstractC12554, abstractC12555)) {
                    this.f16422.mo28056(this.f16432, abstractC12554, absoluteAdapterPosition2, abstractC12555, absoluteAdapterPosition, i2, i3);
                }
            }
        }
    }

    @Override // l.InterfaceC1264
    /* JADX INFO: renamed from: ۙ */
    public final void mo4587(View view) {
        m12828(view);
        AbstractC12554 childViewHolder = this.f16432.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC12554 abstractC12554 = this.f16421;
        if (abstractC12554 != null && childViewHolder == abstractC12554) {
            m12823((AbstractC12554) null, 0);
            return;
        }
        m12824(childViewHolder, false);
        if (this.f16431.remove(childViewHolder.itemView)) {
            this.f16422.mo28055(this.f16432, childViewHolder);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12824(AbstractC12554 abstractC12554, boolean z) {
        C1949 c1949;
        ArrayList arrayList = this.f16419;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c1949 = (C1949) arrayList.get(size);
            }
        } while (c1949.f7349 != abstractC12554);
        c1949.f7341 |= z;
        if (!c1949.f7345) {
            c1949.f7342.cancel();
        }
        arrayList.remove(size);
    }

    @Override // l.AbstractC3236
    public final void getItemOffsets(Rect rect, View view, C17492 c17492, C16082 c16082) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12821(int i, int i2, MotionEvent motionEvent) {
        View viewM12827;
        if (this.f16421 == null && i == 2 && this.f16414 != 2) {
            AbstractC11123 abstractC11123 = this.f16422;
            if (abstractC11123.mo8539() && this.f16432.getScrollState() != 1) {
                AbstractC5498 layoutManager = this.f16432.getLayoutManager();
                int i3 = this.f16425;
                AbstractC12554 childViewHolder = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.f16413;
                    float y = motionEvent.getY(iFindPointerIndex) - this.f16417;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.f16433;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.canScrollHorizontally()) && ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM12827 = m12827(motionEvent)) != null))) {
                        childViewHolder = this.f16432.getChildViewHolder(viewM12827);
                    }
                }
                if (childViewHolder == null) {
                    return;
                }
                C17492 c17492 = this.f16432;
                int iMo8538 = abstractC11123.mo8538(childViewHolder);
                int i4 = C5031.f17539;
                int iM28049 = (AbstractC11123.m28049(iMo8538, c17492.getLayoutDirection()) & 65280) >> 8;
                if (iM28049 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f16413;
                float f3 = y2 - this.f16417;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.f16433;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iM28049 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iM28049 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iM28049 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iM28049 & 2) == 0) {
                            return;
                        }
                    }
                    this.f16411 = 0.0f;
                    this.f16436 = 0.0f;
                    this.f16425 = motionEvent.getPointerId(0);
                    m12823(childViewHolder, 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View m12827(MotionEvent motionEvent) {
        C1949 c1949;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC12554 abstractC12554 = this.f16421;
        if (abstractC12554 != null) {
            View view2 = abstractC12554.itemView;
            if (m12818(view2, x, y, this.f16434 + this.f16436, this.f16427 + this.f16411)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f16419;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c1949 = (C1949) arrayList.get(size);
                view = c1949.f7349.itemView;
            } else {
                return this.f16432.findChildViewUnder(x, y);
            }
        } while (!m12818(view, x, y, c1949.f7346, c1949.f7347));
        return view;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12830(AbstractC12554 abstractC12554) {
        C17492 c17492 = this.f16432;
        int iMo8538 = this.f16422.mo8538(abstractC12554);
        int i = C5031.f17539;
        if ((AbstractC11123.m28049(iMo8538, c17492.getLayoutDirection()) & 16711680) == 0 || abstractC12554.itemView.getParent() != this.f16432) {
            return;
        }
        VelocityTracker velocityTracker = this.f16416;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f16416 = VelocityTracker.obtain();
        this.f16411 = 0.0f;
        this.f16436 = 0.0f;
        m12823(abstractC12554, 2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12829(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f16413;
        this.f16436 = f;
        this.f16411 = y - this.f16417;
        if ((i & 4) == 0) {
            this.f16436 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f16436 = Math.min(0.0f, this.f16436);
        }
        if ((i & 1) == 0) {
            this.f16411 = Math.max(0.0f, this.f16411);
        }
        if ((i & 2) == 0) {
            this.f16411 = Math.min(0.0f, this.f16411);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m12820(AbstractC12554 abstractC12554, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f16436 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f16416;
        AbstractC11123 abstractC11123 = this.f16422;
        if (velocityTracker != null && this.f16425 > -1) {
            float f = this.f16426;
            abstractC11123.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f16416.getXVelocity(this.f16425);
            float yVelocity = this.f16416.getYVelocity(this.f16425);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f16428 && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fMo28052 = abstractC11123.mo28052() * this.f16432.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f16436) <= fMo28052) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m12819(AbstractC12554 abstractC12554, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f16411 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f16416;
        AbstractC11123 abstractC11123 = this.f16422;
        if (velocityTracker != null && this.f16425 > -1) {
            float f = this.f16426;
            abstractC11123.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f16416.getXVelocity(this.f16425);
            float yVelocity = this.f16416.getYVelocity(this.f16425);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f16428 && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fMo28052 = abstractC11123.mo28052() * this.f16432.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f16411) <= fMo28052) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m12828(View view) {
        if (view == this.f16430) {
            this.f16430 = null;
        }
    }
}
