package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.֨ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes2.dex */
public class C1300 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6521 f4643;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f4644;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f4645;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4646;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f4647;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f4648;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C10232 f4649;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f4650;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f4651;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0554 f4652;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f4653;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14723 f4654;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f4655;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public Stack f4656;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14723 f4657;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4658;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14723 f4659;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f4660;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C24179 f4661;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public float f4662;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public Stack f4663;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4664;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f4665;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14723 f4666;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f4667;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f4668;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f4669;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f4670;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f4671;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f4672;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f4673;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14723 f4674;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f4675;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f4676;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f4677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f4678;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C5731 f4679;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f4680;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f4681;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f4682;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f4683;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public float f4684;

    public C1300(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4647 = 0;
        this.f4655 = 0;
        this.f4653 = 0;
        this.f4683 = 5.0f;
        this.f4643 = new C6521();
        this.f4649 = new C10232();
        this.f4675 = new ArrayList();
        this.f4660 = new ArrayList();
        this.f4680 = 0;
        this.f4664 = true;
        this.f4656 = new Stack();
        this.f4663 = new Stack();
        m4712(context);
    }

    public C1300(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4647 = 0;
        this.f4655 = 0;
        this.f4653 = 0;
        this.f4683 = 5.0f;
        this.f4643 = new C6521();
        this.f4649 = new C10232();
        this.f4675 = new ArrayList();
        this.f4660 = new ArrayList();
        this.f4680 = 0;
        this.f4664 = true;
        this.f4656 = new Stack();
        this.f4663 = new Stack();
        m4712(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4712(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4644 = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f4673 = i2;
        this.f4681 = i2;
        if (isInEditMode()) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.MT_Protector);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            drawable.draw(new Canvas(bitmapCreateBitmap));
            m4713(bitmapCreateBitmap);
            this.f4684 = 4.0f;
            this.f4662 = 4.0f;
            this.f4683 = 4.0f;
        }
        Paint.Style style = Paint.Style.FILL;
        C10232 c10232 = this.f4649;
        c10232.setStyle(style);
        c10232.setAntiAlias(false);
        c10232.setFilterBitmap(false);
        C24179 c24179 = new C24179(context, new GestureDetectorOnGestureListenerC19199(this, i));
        this.f4661 = c24179;
        c24179.m54153();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4741(C15425 c15425) {
        m4713(c15425.m36951());
        ArrayList arrayList = this.f4675;
        arrayList.clear();
        ArrayList arrayList2 = this.f4660;
        arrayList2.clear();
        this.f4674 = null;
        this.f4659 = null;
        C18453 c18453M36955 = c15425.m36955();
        if (c18453M36955 != null) {
            Rect rect = c18453M36955.f60075;
            ArrayList<C24421> arrayList3 = c18453M36955.f60076;
            ArrayList<C24421> arrayList4 = c18453M36955.f60074;
            for (C24421 c24421 : arrayList4) {
                arrayList.add(new C14723(c24421.f79289, c24421.f79288, false));
            }
            for (C24421 c24422 : arrayList3) {
                arrayList2.add(new C14723(c24422.f79289, c24422.f79288, true));
            }
            if (!rect.equals(C18453.m42998(arrayList4, arrayList3, this.f4668, this.f4676))) {
                this.f4674 = new C14723(rect.left, this.f4668 - rect.right, false);
                this.f4659 = new C14723(rect.top, this.f4676 - rect.bottom, true);
            }
        }
        C22139 c22139M36953 = c15425.m36953();
        if (c22139M36953 != null) {
            this.f4657 = new C14723(c22139M36953.f71316, this.f4668 - c22139M36953.f71315, false);
            this.f4654 = new C14723(c22139M36953.f71317, this.f4676 - c22139M36953.f71314, true);
        } else {
            this.f4657 = new C14723(0, this.f4668, false);
            this.f4654 = new C14723(0, this.f4676, true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4713(Bitmap bitmap) {
        if (bitmap != null) {
            this.f4668 = bitmap.getWidth();
            this.f4676 = bitmap.getHeight();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.f4678 = bitmapDrawable;
            Paint paint = bitmapDrawable.getPaint();
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            if (getWidth() == 0) {
                this.f4650 = true;
            } else {
                this.f4683 = m4709();
            }
            m4723();
        } else {
            this.f4676 = 100;
            this.f4668 = 100;
            this.f4678 = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m4723() {
        if (this.f4678 == null) {
            return;
        }
        float fMax = Math.max(getWidth() / (this.f4668 + 2.0f), getHeight() / (this.f4676 + 2.0f));
        this.f4662 = fMax;
        if (fMax < 16.0f) {
            this.f4662 = 16.0f;
        }
        float fMin = Math.min(getWidth(), getHeight()) / 5;
        float fMin2 = Math.min(fMin / (this.f4668 + 2.0f), fMin / (this.f4676 + 2.0f));
        this.f4684 = fMin2;
        if (fMin2 > 0.3f) {
            this.f4684 = 0.3f;
        }
        float f = this.f4683;
        float f2 = this.f4662;
        if (f > f2) {
            this.f4683 = f2;
            return;
        }
        float f3 = this.f4684;
        if (f < f3) {
            this.f4683 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float m4709() {
        float fMin = Math.min((getWidth() - (this.f4681 * 6)) / (this.f4668 + 2.0f), (getHeight() - (this.f4681 * 6)) / (this.f4676 + 2.0f));
        if (fMin > 16.0f) {
            return 16.0f;
        }
        return fMin;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4650) {
            this.f4650 = false;
            this.f4683 = m4709();
        }
        m4723();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iM13662;
        C14723 c14723;
        C14723 c14724;
        C14723 c14725;
        C14723 c14726;
        int i;
        float f;
        float x;
        if (this.f4678 != null) {
            C14723 c14727 = this.f4666;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f4677 = 0;
                this.f4646 = false;
                this.f4671 = false;
                if (c14727 != null) {
                    C4283 c4283 = new C4283(this.f4683, this.f4673);
                    if (c14727.f48115) {
                        iM13662 = c4283.m13662(c14727, (motionEvent.getY() + getScrollY()) - ((getHeight() - ((int) ((this.f4676 * this.f4683) + 0.5f))) / 2.0f));
                    } else {
                        iM13662 = c4283.m13662(c14727, (motionEvent.getX() + getScrollX()) - ((getWidth() - ((int) ((this.f4668 * this.f4683) + 0.5f))) / 2.0f));
                    }
                    if (iM13662 != 0) {
                        this.f4665 = motionEvent.getX();
                        this.f4651 = motionEvent.getY();
                        this.f4671 = true;
                        this.f4672 = true;
                        this.f4670 = iM13662 == -1;
                        this.f4667 = false;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f4671 = false;
                    this.f4677++;
                    if (!this.f4646) {
                        this.f4669 = m4710(motionEvent);
                        this.f4682 = this.f4683;
                        this.f4646 = true;
                        this.f4667 = false;
                        this.f4665 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f4651 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked == 6) {
                    this.f4677--;
                    return true;
                }
            } else {
                if (this.f4677 == 1 && this.f4646) {
                    float fM4710 = m4710(motionEvent);
                    if (!this.f4667) {
                        if (Math.abs(fM4710 - this.f4669) > this.f4644) {
                            this.f4667 = true;
                            this.f4661.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                    }
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    float f2 = width;
                    float scrollX = ((this.f4665 + getScrollX()) - f2) / this.f4683;
                    float f3 = height;
                    float scrollY = ((this.f4651 + getScrollY()) - f3) / this.f4683;
                    float f4 = (this.f4682 * fM4710) / this.f4669;
                    this.f4683 = f4;
                    float f5 = this.f4662;
                    if (f4 > f5) {
                        this.f4683 = f5;
                    } else {
                        float f6 = this.f4684;
                        if (f4 < f6) {
                            this.f4683 = f6;
                        }
                    }
                    float f7 = this.f4683;
                    scrollTo((int) (((scrollX * f7) - this.f4665) + f2), (int) (((scrollY * f7) - this.f4651) + f3));
                    invalidate();
                    return true;
                }
                if (c14727 != null) {
                    boolean z = c14727.f48115;
                    if (this.f4671) {
                        if (!this.f4667) {
                            int x2 = ((int) this.f4665) - ((int) motionEvent.getX());
                            int y = ((int) this.f4651) - ((int) motionEvent.getY());
                            int i2 = (y * y) + (x2 * x2);
                            int i3 = this.f4644;
                            if (i2 > i3 * i3) {
                                m4730();
                                this.f4667 = true;
                                this.f4661.m54155(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                if (this.f4670) {
                                    this.f4645 = c14727.f79289;
                                    this.f4648 = 0;
                                    this.f4658 = this.f4680 == 0 ? c14727.f79288 : c14727.f79288 - 1;
                                } else {
                                    this.f4645 = c14727.f79288;
                                    this.f4648 = this.f4680 == 0 ? c14727.f79289 : c14727.f79289 + 1;
                                    this.f4658 = z ? this.f4676 : this.f4668;
                                }
                            }
                        } else {
                            if (z) {
                                f = this.f4651;
                                x = motionEvent.getY();
                            } else {
                                f = this.f4665;
                                x = motionEvent.getX();
                            }
                            int i4 = this.f4645 - ((int) ((f - x) / this.f4683));
                            int i5 = this.f4658;
                            if (i4 > i5 || i4 < (i5 = this.f4648)) {
                                i4 = i5;
                            }
                            if (this.f4670) {
                                c14727.f79289 = i4;
                            } else {
                                c14727.f79288 = i4;
                            }
                            if (c14727.f79289 == c14727.f79288) {
                                if (this.f4672) {
                                    this.f4672 = false;
                                    performHapticFeedback(0);
                                }
                            } else if (!this.f4672) {
                                this.f4672 = true;
                            }
                            InterfaceC0554 interfaceC0554 = this.f4652;
                            if (interfaceC0554 != null) {
                                interfaceC0554.mo2560(c14727);
                            }
                            invalidate();
                        }
                    }
                }
            }
            if ((!this.f4646 && !this.f4671) || !this.f4667) {
                this.f4661.m54155(motionEvent);
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 1 || actionMasked2 == 3) {
                if (this.f4671 && c14727 != null) {
                    boolean z2 = c14727.f48115;
                    if (this.f4667) {
                        int i6 = this.f4680;
                        if (i6 == 0) {
                            int i7 = c14727.f79289;
                            int i8 = c14727.f79288;
                            ArrayList arrayList = this.f4675;
                            ArrayList arrayList2 = this.f4660;
                            if (i7 == i8) {
                                if (z2) {
                                    arrayList2.remove(c14727);
                                } else {
                                    arrayList.remove(c14727);
                                }
                                invalidate();
                                m4719((C24421) null);
                            } else {
                                if (z2) {
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    C14723 c14728 = (C14723) it.next();
                                    if (c14728 != c14727) {
                                        int i9 = c14727.f79289;
                                        int i10 = c14728.f79289;
                                        if (i9 <= i10 && i10 <= (i = c14727.f79288)) {
                                            c14727.f79288 = Math.max(i, c14728.f79288);
                                            it.remove();
                                        } else {
                                            int i11 = c14728.f79288;
                                            if (i9 <= i11 && i11 <= c14727.f79288) {
                                                c14727.f79289 = i10;
                                                it.remove();
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    invalidate();
                                    m4719(c14727);
                                }
                            }
                        } else if (i6 == 1) {
                            C14723 c14729 = this.f4674;
                            if (c14727 == c14729 && (c14726 = this.f4657) != null) {
                                int i12 = c14726.f79289;
                                int i13 = c14729.f79289;
                                if (i12 > i13) {
                                    c14726.f79289 = i13;
                                }
                                int i14 = c14726.f79288;
                                int i15 = c14729.f79288;
                                if (i14 < i15) {
                                    c14726.f79288 = i15;
                                }
                                invalidate();
                            } else {
                                C14723 c147210 = this.f4659;
                                if (c14727 == c147210 && (c14725 = this.f4654) != null) {
                                    int i16 = c14725.f79289;
                                    int i17 = c147210.f79289;
                                    if (i16 > i17) {
                                        c14725.f79289 = i17;
                                    }
                                    int i18 = c14725.f79288;
                                    int i19 = c147210.f79288;
                                    if (i18 < i19) {
                                        c14725.f79288 = i19;
                                    }
                                    invalidate();
                                }
                            }
                        } else if (i6 == 2) {
                            C14723 c147211 = this.f4657;
                            if (c14727 == c147211 && (c14724 = this.f4674) != null) {
                                int i20 = c147211.f79289;
                                int i21 = c14724.f79288;
                                if (i20 >= i21) {
                                    c14724.f79289 = i20;
                                    c14724.f79288 = i20 + 1;
                                } else {
                                    int i22 = c147211.f79288;
                                    int i23 = c14724.f79289;
                                    if (i22 <= i23) {
                                        c14724.f79288 = i22;
                                        c14724.f79289 = i22 - 1;
                                    } else {
                                        if (i20 > i23) {
                                            c14724.f79289 = i20;
                                        }
                                        if (i22 < i21) {
                                            c14724.f79288 = i22;
                                        }
                                    }
                                }
                                invalidate();
                            } else {
                                C14723 c147212 = this.f4654;
                                if (c14727 == c147212 && (c14723 = this.f4659) != null) {
                                    int i24 = c147212.f79289;
                                    int i25 = c14723.f79288;
                                    if (i24 >= i25) {
                                        c14723.f79289 = i24;
                                        c14723.f79288 = i24 + 1;
                                    } else {
                                        int i26 = c147212.f79288;
                                        int i27 = c14723.f79289;
                                        if (i26 <= i27) {
                                            c14723.f79288 = i26;
                                            c14723.f79289 = i26 - 1;
                                        } else {
                                            if (i24 > i27) {
                                                c14723.f79289 = i24;
                                            }
                                            if (i26 < i25) {
                                                c14723.f79288 = i26;
                                            }
                                        }
                                    }
                                    invalidate();
                                }
                            }
                        }
                        m4733();
                    }
                }
                this.f4677 = 0;
                this.f4646 = false;
                this.f4671 = false;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0497 A[PHI: r7 r21 r29 r32 r34
      0x0497: PHI (r7v11 int) = (r7v8 int), (r7v8 int), (r7v8 int), (r7v13 int), (r7v15 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r21v4 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v7 int), (r21v8 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r29v4 int) = (r29v2 int), (r29v2 int), (r29v2 int), (r29v6 int), (r29v6 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r32v6 int) = (r32v3 int), (r32v3 int), (r32v3 int), (r32v3 int), (r32v7 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]
      0x0497: PHI (r34v1 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v2 int), (r34v3 int) binds: [B:82:0x03aa, B:84:0x040e, B:85:0x0410, B:79:0x038c, B:78:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C10232 c10232;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C10232 c10233;
        int i11;
        C10232 c10234;
        int i12;
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = scrollX + width;
        int i14 = scrollY + height;
        float f = this.f4683;
        int i15 = (int) ((this.f4668 * f) + 0.5f);
        int i16 = (int) ((this.f4676 * f) + 0.5f);
        int iMax = Math.max((int) (0.5f + f), 1);
        int i17 = (width / 2) - (i15 / 2);
        int i18 = (height / 2) - (i16 / 2);
        int i19 = i17 + i15;
        int i20 = i18 + i16;
        C6521 c6521 = this.f4643;
        canvas.drawColor(c6521.f21929);
        int i21 = this.f4681;
        int i22 = ((i15 + iMax) + iMax) / i21;
        int i23 = ((i16 + iMax) + iMax) / i21;
        int[] iArr = c6521.f21933;
        C6521 c6522 = c6521;
        int i24 = 0;
        while (true) {
            c10232 = this.f4649;
            if (i24 > i22) {
                break;
            }
            int i25 = i17;
            int i26 = (i24 * i21) + (i17 - iMax);
            int i27 = i22;
            int i28 = i19;
            int iMin = Math.min(i19 + iMax, i26 + i21);
            if (iMin > scrollX && i26 < i13) {
                int i29 = 0;
                while (i29 <= i23) {
                    int i30 = i23;
                    int i31 = (i29 * i21) + (i18 - iMax);
                    int i32 = i13;
                    int i33 = i20;
                    int iMin2 = Math.min(i20 + iMax, i31 + i21);
                    if (iMin2 <= scrollY || i31 >= i14) {
                        i11 = i33;
                        c10234 = c10232;
                        i12 = i27;
                    } else {
                        c10232.setColor(iArr[(i24 + i29) % 2]);
                        c10234 = c10232;
                        i11 = i33;
                        i12 = i27;
                        canvas.drawRect(i26, i31, iMin, iMin2, c10234);
                    }
                    i29++;
                    i20 = i11;
                    c10232 = c10234;
                    iMin = iMin;
                    i27 = i12;
                    i23 = i30;
                    iArr = iArr;
                    i21 = i21;
                    i28 = i28;
                    c6522 = c6522;
                    i13 = i32;
                    i26 = i26;
                }
            }
            i24++;
            i19 = i28;
            i20 = i20;
            c6522 = c6522;
            i17 = i25;
            i13 = i13;
            i22 = i27;
            i23 = i23;
            iArr = iArr;
            i21 = i21;
        }
        int i34 = i20;
        int i35 = i13;
        int i36 = i17;
        C6521 c6523 = c6522;
        C10232 c10235 = c10232;
        int i37 = i19;
        BitmapDrawable bitmapDrawable = this.f4678;
        if (bitmapDrawable != null) {
            i = i36;
            bitmapDrawable.setBounds(i, i18, i37, i34);
            bitmapDrawable.draw(canvas);
        } else {
            i = i36;
        }
        int i38 = c6523.f21934;
        int i39 = c6523.f21932;
        int i40 = c6523.f21931;
        int i41 = this.f4680;
        boolean z = i41 == 0;
        boolean z2 = i41 == 1;
        boolean z3 = i41 == 2;
        boolean z4 = this.f4664;
        C14723 c14723 = this.f4666;
        for (C24421 c24421 : this.f4675) {
            boolean z5 = z4;
            float f2 = i;
            int i42 = i40;
            float f3 = (c24421.f79289 * f) + f2;
            float f4 = (c24421.f79288 * f) + f2;
            C10232 c10236 = c10235;
            c10236.setColor(-16777216);
            C6521 c6524 = c6523;
            float f5 = i18;
            int i43 = scrollX;
            C14723 c14724 = c14723;
            int i44 = i37;
            int i45 = i39;
            int i46 = i;
            int i47 = i38;
            canvas.drawRect(f3, i18 - iMax, f4, f5, c10236);
            if (z && z5) {
                c10236.setColor(i47);
                c10233 = c10236;
                canvas.drawRect(f3, f5, f4, i34, c10236);
                c10233.setColor(c14724 == c24421 ? i42 : i45);
                float f6 = scrollY;
                float f7 = i14;
                canvas.drawRect(f3, f6, f3 + 1.0f, f7, c10233);
                canvas.drawRect(f4 - 1.0f, f6, f4, f7, c10233);
            } else {
                c10233 = c10236;
            }
            i38 = i47;
            i37 = i44;
            z4 = z5;
            i40 = i42;
            i39 = i45;
            i = i46;
            c14723 = c14724;
            scrollX = i43;
            c10235 = c10233;
            c6523 = c6524;
        }
        boolean z6 = z4;
        int i48 = i40;
        int i49 = i39;
        int i50 = i;
        int i51 = scrollX;
        C14723 c14725 = c14723;
        int i52 = i38;
        int i53 = i37;
        C10232 c10237 = c10235;
        C6521 c6525 = c6523;
        Iterator it = this.f4660.iterator();
        while (it.hasNext()) {
            C24421 c24422 = (C24421) it.next();
            float f8 = i18;
            float f9 = (c24422.f79289 * f) + f8;
            float f10 = (c24422.f79288 * f) + f8;
            c10237.setColor(-16777216);
            float f11 = i50 - iMax;
            int i54 = i50;
            float f12 = i54;
            Iterator it2 = it;
            int i55 = i14;
            canvas.drawRect(f11, f9, f12, f10, c10237);
            if (z && z6) {
                c10237.setColor(i52);
                int i56 = i53;
                i10 = i56;
                canvas.drawRect(f12, f9, i56, f10, c10237);
                c10237.setColor(c14725 == c24422 ? i48 : i49);
                i9 = i51;
                float f13 = i9;
                int i57 = i35;
                float f14 = i57;
                i8 = i57;
                canvas.drawRect(f13, f9, f14, f9 + 1.0f, c10237);
                canvas.drawRect(f13, f10 - 1.0f, f14, f10, c10237);
            } else {
                i8 = i35;
                i9 = i51;
                i10 = i53;
            }
            i51 = i9;
            i14 = i55;
            i35 = i8;
            i50 = i54;
            it = it2;
            i53 = i10;
            scrollY = scrollY;
        }
        int i58 = i35;
        int i59 = i50;
        int i60 = i14;
        int i61 = i51;
        int i62 = i53;
        int i63 = scrollY;
        boolean z7 = !z2;
        int i64 = 0;
        while (i64 < 2) {
            if (z7) {
                C14723 c14726 = this.f4674;
                if (c14726 != null) {
                    float f15 = i59;
                    float f16 = (c14726.f79289 * f) + f15;
                    float f17 = f15 + (c14726.f79288 * f);
                    float f18 = i18;
                    C14723 c14727 = this.f4659;
                    float f19 = (c14727.f79289 * f) + f18;
                    float f20 = (c14727.f79288 * f) + f18;
                    c10237.setColor(-16777216);
                    i2 = i64;
                    canvas.drawRect(f16, i34, f17, i34 + iMax, c10237);
                    canvas.drawRect(i62, f19, i62 + iMax, f20, c10237);
                    if (z2 && z6) {
                        c10237.setColor(i52);
                        canvas.drawRect(f16, f19, f17, f20, c10237);
                        c10237.setColor(c14725 == this.f4674 ? i48 : i49);
                        int i65 = i63;
                        float f21 = i65;
                        float f22 = f16 + 1.0f;
                        int i66 = i60;
                        float f23 = i66;
                        i3 = i52;
                        i60 = i66;
                        i4 = i65;
                        canvas.drawRect(f16, f21, f22, f23, c10237);
                        canvas.drawRect(f17 - 1.0f, f21, f17, f23, c10237);
                        c10237.setColor(c14725 == this.f4659 ? i48 : i49);
                        float f24 = i61;
                        int i67 = i58;
                        float f25 = i67;
                        i5 = i67;
                        canvas.drawRect(f24, f19, f25, f19 + 1.0f, c10237);
                        canvas.drawRect(f24, f20 - 1.0f, f25, f20, c10237);
                    } else {
                        i3 = i52;
                        i4 = i63;
                        i5 = i58;
                    }
                    i6 = i60;
                    i7 = i5;
                } else {
                    i2 = i64;
                    i3 = i52;
                    i4 = i63;
                    i6 = i60;
                    i7 = i58;
                }
            } else {
                i2 = i64;
                i3 = i52;
                i4 = i63;
                i5 = i58;
                C14723 c14728 = this.f4657;
                if (c14728 != null) {
                    float f26 = i59;
                    float f27 = (c14728.f79289 * f) + f26;
                    float f28 = (c14728.f79288 * f) + f26;
                    float f29 = i18;
                    C14723 c14729 = this.f4654;
                    float f30 = (c14729.f79289 * f) + f29;
                    float f31 = (c14729.f79288 * f) + f29;
                    c10237.setColor(-65536);
                    float f32 = i34;
                    float f33 = i34 + iMax;
                    canvas.drawRect(f26, f32, f27, f33, c10237);
                    float f34 = i62;
                    canvas.drawRect(f28, f32, f34, f33, c10237);
                    float f35 = i62 + iMax;
                    canvas.drawRect(f34, f29, f35, f30, c10237);
                    canvas.drawRect(f34, f31, f35, f32, c10237);
                    if (z3 && z6) {
                        c10237.setColor(c6525.f21930);
                        canvas.drawRect(f26, f29, f34, f30, c10237);
                        canvas.drawRect(f26, f31, f34, f32, c10237);
                        canvas.drawRect(f26, f30, f27, f31, c10237);
                        canvas.drawRect(f28, f30, f34, f31, c10237);
                        c10237.setColor(c14725 == this.f4657 ? i48 : i49);
                        float f36 = i4;
                        int i68 = i60;
                        float f37 = i68;
                        i6 = i68;
                        canvas.drawRect(f27, f36, f27 + 1.0f, f37, c10237);
                        canvas.drawRect(f28 - 1.0f, f36, f28, f37, c10237);
                        c10237.setColor(c14725 == this.f4654 ? i48 : i49);
                        float f38 = i61;
                        float f39 = i5;
                        float f40 = f30 + 1.0f;
                        i7 = i5;
                        canvas.drawRect(f38, f30, f39, f40, c10237);
                        canvas.drawRect(f38, f31 - 1.0f, f39, f31, c10237);
                    } else {
                        i6 = i60;
                        i7 = i5;
                    }
                } else {
                    i6 = i60;
                    i7 = i5;
                }
            }
            z7 = !z7;
            i64 = i2 + 1;
            i63 = i4;
            i52 = i3;
            i58 = i7;
            i60 = i6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m4710(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4739(InterfaceC0554 interfaceC0554) {
        this.f4652 = interfaceC0554;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m4719(C24421 c24421) {
        InterfaceC0554 interfaceC0554 = this.f4652;
        if (interfaceC0554 != null) {
            interfaceC0554.mo2563(c24421);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m4728() {
        InterfaceC0554 interfaceC0554 = this.f4652;
        if (interfaceC0554 != null) {
            interfaceC0554.mo2562(!this.f4656.isEmpty(), !this.f4663.isEmpty());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m4751() {
        return this.f4680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4737(int i) {
        this.f4680 = i;
        this.f4664 = true;
        this.f4666 = null;
        m4719((C24421) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4735() {
        return this.f4664;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4745(boolean z) {
        this.f4664 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4746() {
        return !this.f4656.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4754() {
        return !this.f4663.isEmpty();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m4750() {
        Stack stack = this.f4656;
        if (stack.isEmpty()) {
            return;
        }
        C5731 c5731 = (C5731) stack.pop();
        m4718(c5731.f19740);
        this.f4663.push(c5731);
        m4728();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4747() {
        Stack stack = this.f4663;
        if (stack.isEmpty()) {
            return;
        }
        C5731 c5731 = (C5731) stack.pop();
        m4718(c5731.f19739);
        this.f4656.push(c5731);
        m4728();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private C13188 m4726() {
        C13188 c13188 = new C13188();
        c13188.f42119 = this.f4680;
        c13188.f42122 = this.f4655;
        ArrayList arrayList = this.f4675;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c13188.f42117.add(((C14723) it.next()).clone());
        }
        ArrayList arrayList2 = this.f4660;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c13188.f42115.add(((C14723) it2.next()).clone());
        }
        C14723 c14723 = this.f4674;
        c13188.f42118 = c14723 == null ? null : c14723.clone();
        C14723 c14724 = this.f4659;
        c13188.f42123 = c14724 == null ? null : c14724.clone();
        C14723 c14725 = this.f4657;
        c13188.f42121 = c14725 == null ? null : c14725.clone();
        C14723 c14726 = this.f4654;
        c13188.f42120 = c14726 != null ? c14726.clone() : null;
        C14723 c14727 = this.f4666;
        if (c14727 != null) {
            int i = this.f4680;
            if (i == 0) {
                int iIndexOf = arrayList.indexOf(c14727);
                if (iIndexOf == -1 && (iIndexOf = arrayList2.indexOf(this.f4666)) != -1) {
                    iIndexOf += arrayList.size();
                }
                c13188.f42116 = iIndexOf;
            } else {
                if (i == 1) {
                    if (c14727 == this.f4674) {
                        c13188.f42116 = 0;
                        return c13188;
                    }
                    if (c14727 == this.f4659) {
                        c13188.f42116 = 1;
                        return c13188;
                    }
                    c13188.f42116 = -1;
                    return c13188;
                }
                if (i == 2) {
                    if (c14727 == this.f4657) {
                        c13188.f42116 = 0;
                        return c13188;
                    }
                    if (c14727 == this.f4654) {
                        c13188.f42116 = 1;
                        return c13188;
                    }
                    c13188.f42116 = -1;
                    return c13188;
                }
            }
        }
        return c13188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4718(C13188 c13188) {
        ArrayList arrayList = this.f4675;
        arrayList.clear();
        ArrayList arrayList2 = this.f4660;
        arrayList2.clear();
        Iterator it = c13188.f42117.iterator();
        while (it.hasNext()) {
            arrayList.add(((C14723) it.next()).clone());
        }
        Iterator it2 = c13188.f42115.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C14723) it2.next()).clone());
        }
        C14723 c14723 = c13188.f42118;
        this.f4674 = c14723 == null ? null : c14723.clone();
        C14723 c14724 = c13188.f42123;
        this.f4659 = c14724 == null ? null : c14724.clone();
        C14723 c14725 = c13188.f42121;
        this.f4657 = c14725 == null ? null : c14725.clone();
        C14723 c14726 = c13188.f42120;
        C14723 c14723Clone = c14726 == null ? null : c14726.clone();
        this.f4654 = c14723Clone;
        int i = c13188.f42116;
        if (i == -1) {
            this.f4666 = null;
        } else {
            int i2 = c13188.f42119;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            this.f4666 = this.f4657;
                        } else if (i == 1) {
                            this.f4666 = c14723Clone;
                        } else {
                            this.f4666 = null;
                        }
                    }
                } else if (i == 0) {
                    this.f4666 = this.f4674;
                } else if (i == 1) {
                    this.f4666 = this.f4659;
                } else {
                    this.f4666 = null;
                }
            } else if (i < arrayList.size()) {
                this.f4666 = (C14723) arrayList.get(i);
            } else {
                int size = i - arrayList.size();
                if (size < arrayList2.size()) {
                    this.f4666 = (C14723) arrayList2.get(size);
                } else {
                    this.f4666 = null;
                }
            }
        }
        int i3 = c13188.f42119;
        if (i3 != this.f4680) {
            this.f4680 = i3;
            InterfaceC0554 interfaceC0554 = this.f4652;
            if (interfaceC0554 != null) {
                interfaceC0554.mo2559(i3);
            }
        }
        int i4 = c13188.f42122;
        if (i4 != this.f4655) {
            this.f4655 = i4;
            InterfaceC0554 interfaceC0555 = this.f4652;
            if (interfaceC0555 != null) {
                interfaceC0555.mo2561(m4744());
            }
        }
        m4719(this.f4666);
        this.f4664 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4740(C6178 c6178) {
        c6178.writeInt(1901228945);
        c6178.writeInt(this.f4647);
        c6178.writeInt(this.f4653);
        m4726().m32703(c6178);
        Stack<C5731> stack = this.f4656;
        c6178.mo17812(stack.size());
        for (C5731 c5731 : stack) {
            c5731.f19740.m32703(c6178);
            c5731.f19739.m32703(c6178);
        }
        Stack<C5731> stack2 = this.f4663;
        c6178.mo17812(stack2.size());
        for (C5731 c5732 : stack2) {
            c5732.f19740.m32703(c6178);
            c5732.f19739.m32703(c6178);
        }
        c6178.writeInt(1901228945);
        c6178.writeInt(getScrollX());
        c6178.writeInt(getScrollY());
        c6178.m17781(this.f4683);
        c6178.m17789(this.f4664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4742(C20348 c20348) {
        try {
            C17364.m40795((InterfaceC15872) c20348, 1901228945);
            this.f4647 = c20348.readInt();
            this.f4653 = c20348.readInt();
            C13188 c13188 = new C13188();
            c13188.m32704(c20348);
            m4718(c13188);
            int iM46749 = c20348.m46749();
            Stack stack = this.f4656;
            stack.clear();
            for (int i = 0; i < iM46749; i++) {
                C5731 c5731 = new C5731();
                C13188 c13189 = new C13188();
                c13189.m32704(c20348);
                c5731.f19740 = c13189;
                C13188 c131810 = new C13188();
                c131810.m32704(c20348);
                c5731.f19739 = c131810;
                stack.add(c5731);
            }
            int iM467410 = c20348.m46749();
            Stack stack2 = this.f4663;
            stack2.clear();
            for (int i2 = 0; i2 < iM467410; i2++) {
                C5731 c5732 = new C5731();
                C13188 c131811 = new C13188();
                c131811.m32704(c20348);
                c5732.f19740 = c131811;
                C13188 c131812 = new C13188();
                c131812.m32704(c20348);
                c5732.f19739 = c131812;
                stack2.add(c5732);
            }
            m4728();
            try {
                C17364.m40795((InterfaceC15872) c20348, 1901228945);
                scrollTo(c20348.readInt(), c20348.readInt());
                this.f4683 = c20348.m46747();
                this.f4650 = false;
                this.f4664 = c20348.m46753();
                invalidate();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m4730() {
        C5731 c5731 = new C5731();
        this.f4679 = c5731;
        c5731.f19740 = m4726();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m4733() {
        int i = this.f4647 + 1;
        this.f4647 = i;
        this.f4655 = i;
        InterfaceC0554 interfaceC0554 = this.f4652;
        if (interfaceC0554 != null) {
            interfaceC0554.mo2561(m4744());
        }
        C5731 c5731 = this.f4679;
        if (c5731 != null) {
            c5731.f19739 = m4726();
            this.f4656.push(this.f4679);
            this.f4663.clear();
            this.f4679 = null;
            m4728();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m4744() {
        return this.f4653 != this.f4655;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4753(boolean z) {
        int i;
        if (z) {
            int i2 = this.f4647 + 1;
            this.f4647 = i2;
            i = -i2;
        } else {
            i = this.f4655;
        }
        this.f4653 = i;
        InterfaceC0554 interfaceC0554 = this.f4652;
        if (interfaceC0554 != null) {
            interfaceC0554.mo2561(m4744());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4738(String str) {
        C13977 c13977M15197 = C4985.m15197(this.f4668, this.f4676, str);
        C14723 c14723 = this.f4674;
        C14723 c14724 = this.f4659;
        C14723 c14725 = this.f4657;
        C14723 c14726 = this.f4654;
        int i = this.f4668;
        int i2 = this.f4676;
        ArrayList arrayList = this.f4675;
        ArrayList arrayList2 = this.f4660;
        if (new C13977(arrayList, arrayList2, c14723, c14724, c14725, c14726, i, i2).m34061(c13977M15197)) {
            return;
        }
        m4730();
        arrayList.clear();
        for (C24421 c24421 : c13977M15197.f44322) {
            arrayList.add(new C14723(c24421.f79289, c24421.f79288, false));
        }
        arrayList2.clear();
        for (C24421 c24422 : c13977M15197.f44321) {
            arrayList2.add(new C14723(c24422.f79289, c24422.f79288, true));
        }
        C24421 c24423 = c13977M15197.f44319;
        if (c24423 == null) {
            this.f4659 = null;
            this.f4674 = null;
        } else {
            this.f4674 = new C14723(c24423.f79289, c24423.f79288, false);
            C24421 c24424 = c13977M15197.f44323;
            this.f4659 = new C14723(c24424.f79289, c24424.f79288, true);
        }
        C24421 c24425 = c13977M15197.f44320;
        this.f4657 = new C14723(c24425.f79289, c24425.f79288, false);
        C24421 c24426 = c13977M15197.f44324;
        this.f4654 = new C14723(c24426.f79289, c24426.f79288, true);
        this.f4666 = null;
        this.f4664 = true;
        m4733();
        m4719((C24421) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m4749() {
        return C4985.m15195(new C13977(this.f4675, this.f4660, this.f4674, this.f4659, this.f4657, this.f4654, this.f4668, this.f4676), this.f4668, this.f4676);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m4748() {
        return this.f4674 != null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m4756() {
        m4730();
        this.f4659 = null;
        this.f4674 = null;
        m4733();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4736() {
        if (m4748()) {
            return;
        }
        m4730();
        C14723 c14723 = this.f4657;
        this.f4674 = c14723 != null ? c14723.clone() : new C14723(0, this.f4668, false);
        C14723 c14724 = this.f4654;
        this.f4659 = c14724 != null ? c14724.clone() : new C14723(0, this.f4676, true);
        m4733();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4752(C15425 c15425) {
        C18453 c18453 = new C18453();
        ArrayList<C14723> arrayList = this.f4675;
        for (C14723 c14723 : arrayList) {
            c18453.f60074.add(new C24421(c14723.f79289, c14723.f79288));
        }
        ArrayList<C14723> arrayList2 = this.f4660;
        for (C14723 c14724 : arrayList2) {
            c18453.f60076.add(new C24421(c14724.f79289, c14724.f79288));
        }
        C14723 c14725 = this.f4674;
        if (c14725 != null) {
            Rect rect = c18453.f60075;
            rect.left = c14725.f79289;
            rect.right = this.f4668 - c14725.f79288;
            C14723 c14726 = this.f4659;
            rect.top = c14726.f79289;
            rect.bottom = this.f4676 - c14726.f79288;
        } else {
            c18453.f60075.set(C18453.m42998(arrayList, arrayList2, this.f4668, this.f4676));
        }
        c15425.m36948(c18453);
        if (this.f4657 != null) {
            C22139 c22139 = new C22139();
            C14723 c14727 = this.f4657;
            c22139.f71316 = c14727.f79289;
            c22139.f71315 = this.f4668 - c14727.f79288;
            C14723 c14728 = this.f4654;
            c22139.f71317 = c14728.f79289;
            c22139.f71314 = this.f4676 - c14728.f79288;
            c15425.m36949(c22139);
            return;
        }
        c15425.m36949((C22139) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4743(boolean z) {
        ArrayList arrayList = z ? this.f4660 : this.f4675;
        C14723 c14723 = new C14723(z);
        int i = z ? this.f4676 : this.f4668;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C14723 c14724 = (C14723) arrayList.get(0);
                int i3 = c14724.f79289;
                int i4 = c14724.f79288;
                if (i3 >= i - i4) {
                    i = i3 - 1;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C14723 c14725 = (C14723) arrayList.get(i5);
                    if (i5 == 0) {
                        arrayList2.add(new C10248(0, c14725.f79289 - 1));
                    } else if (i5 == size - 1) {
                        arrayList2.add(new C10248(c14725.f79288 + 1, i));
                    } else {
                        arrayList2.add(new C10248(((C14723) arrayList.get(i5 - 1)).f79288 + 1, c14725.f79289 - 1));
                    }
                }
                Collections.sort(arrayList2);
                C10248 c10248 = (C10248) arrayList2.get(0);
                i2 = c10248.f32736;
                i = c10248.f32735;
            }
        }
        int i6 = i - i2;
        if (i6 <= 0) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        int i7 = (int) (getContext().getResources().getDisplayMetrics().density * 16.0f);
        if (i6 > i7) {
            int i8 = (i6 - i7) / 2;
            i -= i8;
            i2 += i8;
        }
        c14723.f79289 = i2;
        c14723.f79288 = i;
        m4730();
        arrayList.add(c14723);
        Collections.sort(arrayList);
        m4733();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4755() {
        Stack stack = this.f4656;
        boolean zIsEmpty = stack.isEmpty();
        Stack stack2 = this.f4663;
        if (zIsEmpty && stack2.isEmpty()) {
            return;
        }
        stack.clear();
        stack2.clear();
        m4728();
    }
}
