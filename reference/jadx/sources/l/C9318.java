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

/* JADX INFO: renamed from: l.ۢۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public class C9318 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f31593;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f31594;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31595;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17078 f31596;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f31597;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f31598;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f31599;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f31600;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f31601;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17078 f31602;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31603;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public float f31604;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public float f31605;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C4916 f31606;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public Stack f31607;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17078 f31608;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f31609;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31610;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f31611;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C10614 f31612;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31613;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public Stack f31614;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10729 f31615;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f31616;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31617;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f31618;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17078 f31619;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f31620;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0144 f31621;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f31622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17078 f31623;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31624;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public float f31625;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f31626;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f31627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f31628;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C14995 f31629;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31630;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31631;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f31632;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public float f31633;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31634;

    public C9318(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31599 = 0;
        this.f31613 = 0;
        this.f31609 = 0;
        this.f31605 = 5.0f;
        this.f31621 = new C0144();
        this.f31606 = new C4916();
        this.f31624 = new ArrayList();
        this.f31603 = new ArrayList();
        this.f31616 = 0;
        this.f31595 = true;
        this.f31614 = new Stack();
        this.f31607 = new Stack();
        m23898(context);
    }

    public C9318(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31599 = 0;
        this.f31613 = 0;
        this.f31609 = 0;
        this.f31605 = 5.0f;
        this.f31621 = new C0144();
        this.f31606 = new C4916();
        this.f31624 = new ArrayList();
        this.f31603 = new ArrayList();
        this.f31616 = 0;
        this.f31595 = true;
        this.f31614 = new Stack();
        this.f31607 = new Stack();
        m23898(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23898(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f31622 = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f31594 = i2;
        this.f31597 = i2;
        if (isInEditMode()) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.MT_Protector);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            drawable.draw(new Canvas(bitmapCreateBitmap));
            m23899(bitmapCreateBitmap);
            this.f31633 = 4.0f;
            this.f31604 = 4.0f;
            this.f31605 = 4.0f;
        }
        Paint.Style style = Paint.Style.FILL;
        C4916 c4916 = this.f31606;
        c4916.setStyle(style);
        c4916.setAntiAlias(false);
        c4916.setFilterBitmap(false);
        C10614 c10614 = new C10614(context, new GestureDetectorOnGestureListenerC14257(this, i));
        this.f31612 = c10614;
        c10614.m26791();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23926(C6527 c6527) {
        m23899(c6527.m17738());
        ArrayList arrayList = this.f31624;
        arrayList.clear();
        ArrayList arrayList2 = this.f31603;
        arrayList2.clear();
        this.f31623 = null;
        this.f31602 = null;
        C5789 c5789M17732 = c6527.m17732();
        if (c5789M17732 != null) {
            Rect rect = c5789M17732.f19677;
            ArrayList<C16373> arrayList3 = c5789M17732.f19674;
            ArrayList<C16373> arrayList4 = c5789M17732.f19676;
            for (C16373 c16373 : arrayList4) {
                arrayList.add(new C17078(c16373.f52692, c16373.f52691, false));
            }
            for (C16373 c16374 : arrayList3) {
                arrayList2.add(new C17078(c16374.f52692, c16374.f52691, true));
            }
            if (!rect.equals(C5789.m15959(arrayList4, arrayList3, this.f31632, this.f31601))) {
                this.f31623 = new C17078(rect.left, this.f31632 - rect.right, false);
                this.f31602 = new C17078(rect.top, this.f31601 - rect.bottom, true);
            }
        }
        C5116 c5116M17737 = c6527.m17737();
        if (c5116M17737 != null) {
            this.f31596 = new C17078(c5116M17737.f17821, this.f31632 - c5116M17737.f17820, false);
            this.f31608 = new C17078(c5116M17737.f17818, this.f31601 - c5116M17737.f17819, true);
        } else {
            this.f31596 = new C17078(0, this.f31632, false);
            this.f31608 = new C17078(0, this.f31601, true);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23899(Bitmap bitmap) {
        if (bitmap != null) {
            this.f31632 = bitmap.getWidth();
            this.f31601 = bitmap.getHeight();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.f31628 = bitmapDrawable;
            Paint paint = bitmapDrawable.getPaint();
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            if (getWidth() == 0) {
                this.f31630 = true;
            } else {
                this.f31605 = m23908();
            }
            m23909();
        } else {
            this.f31601 = 100;
            this.f31632 = 100;
            this.f31628 = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m23909() {
        if (this.f31628 == null) {
            return;
        }
        float fMax = Math.max(getWidth() / (this.f31632 + 2.0f), getHeight() / (this.f31601 + 2.0f));
        this.f31604 = fMax;
        if (fMax < 16.0f) {
            this.f31604 = 16.0f;
        }
        float fMin = Math.min(getWidth(), getHeight()) / 5;
        float fMin2 = Math.min(fMin / (this.f31632 + 2.0f), fMin / (this.f31601 + 2.0f));
        this.f31633 = fMin2;
        if (fMin2 > 0.3f) {
            this.f31633 = 0.3f;
        }
        float f = this.f31605;
        float f2 = this.f31604;
        if (f > f2) {
            this.f31605 = f2;
            return;
        }
        float f3 = this.f31633;
        if (f < f3) {
            this.f31605 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float m23908() {
        float fMin = Math.min((getWidth() - (this.f31597 * 6)) / (this.f31632 + 2.0f), (getHeight() - (this.f31597 * 6)) / (this.f31601 + 2.0f));
        if (fMin > 16.0f) {
            return 16.0f;
        }
        return fMin;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f31630) {
            this.f31630 = false;
            this.f31605 = m23908();
        }
        m23909();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iM30215;
        C17078 c17078;
        C17078 c17079;
        C17078 c170710;
        C17078 c170711;
        int i;
        float f;
        float x;
        if (this.f31628 != null) {
            C17078 c170712 = this.f31619;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f31627 = 0;
                this.f31611 = false;
                this.f31631 = false;
                if (c170712 != null) {
                    C12140 c12140 = new C12140(this.f31605, this.f31594);
                    if (c170712.f54497) {
                        iM30215 = c12140.m30215(c170712, (motionEvent.getY() + getScrollY()) - ((getHeight() - ((int) ((this.f31601 * this.f31605) + 0.5f))) / 2.0f));
                    } else {
                        iM30215 = c12140.m30215(c170712, (motionEvent.getX() + getScrollX()) - ((getWidth() - ((int) ((this.f31632 * this.f31605) + 0.5f))) / 2.0f));
                    }
                    if (iM30215 != 0) {
                        this.f31598 = motionEvent.getX();
                        this.f31600 = motionEvent.getY();
                        this.f31631 = true;
                        this.f31593 = true;
                        this.f31618 = iM30215 == -1;
                        this.f31620 = false;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f31631 = false;
                    this.f31627++;
                    if (!this.f31611) {
                        this.f31625 = m23896(motionEvent);
                        this.f31626 = this.f31605;
                        this.f31611 = true;
                        this.f31620 = false;
                        this.f31598 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f31600 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked == 6) {
                    this.f31627--;
                    return true;
                }
            } else {
                if (this.f31627 == 1 && this.f31611) {
                    float fM23896 = m23896(motionEvent);
                    if (!this.f31620) {
                        if (Math.abs(fM23896 - this.f31625) > this.f31622) {
                            this.f31620 = true;
                            this.f31612.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                    }
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    float f2 = width;
                    float scrollX = ((this.f31598 + getScrollX()) - f2) / this.f31605;
                    float f3 = height;
                    float scrollY = ((this.f31600 + getScrollY()) - f3) / this.f31605;
                    float f4 = (this.f31626 * fM23896) / this.f31625;
                    this.f31605 = f4;
                    float f5 = this.f31604;
                    if (f4 > f5) {
                        this.f31605 = f5;
                    } else {
                        float f6 = this.f31633;
                        if (f4 < f6) {
                            this.f31605 = f6;
                        }
                    }
                    float f7 = this.f31605;
                    scrollTo((int) (((scrollX * f7) - this.f31598) + f2), (int) (((scrollY * f7) - this.f31600) + f3));
                    invalidate();
                    return true;
                }
                if (c170712 != null) {
                    boolean z = c170712.f54497;
                    if (this.f31631) {
                        if (!this.f31620) {
                            int x2 = ((int) this.f31598) - ((int) motionEvent.getX());
                            int y = ((int) this.f31600) - ((int) motionEvent.getY());
                            int i2 = (y * y) + (x2 * x2);
                            int i3 = this.f31622;
                            if (i2 > i3 * i3) {
                                m23916();
                                this.f31620 = true;
                                this.f31612.m26793(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                if (this.f31618) {
                                    this.f31610 = c170712.f52692;
                                    this.f31617 = 0;
                                    this.f31634 = this.f31616 == 0 ? c170712.f52691 : c170712.f52691 - 1;
                                } else {
                                    this.f31610 = c170712.f52691;
                                    this.f31617 = this.f31616 == 0 ? c170712.f52692 : c170712.f52692 + 1;
                                    this.f31634 = z ? this.f31601 : this.f31632;
                                }
                            }
                        } else {
                            if (z) {
                                f = this.f31600;
                                x = motionEvent.getY();
                            } else {
                                f = this.f31598;
                                x = motionEvent.getX();
                            }
                            int i4 = this.f31610 - ((int) ((f - x) / this.f31605));
                            int i5 = this.f31634;
                            if (i4 > i5 || i4 < (i5 = this.f31617)) {
                                i4 = i5;
                            }
                            if (this.f31618) {
                                c170712.f52692 = i4;
                            } else {
                                c170712.f52691 = i4;
                            }
                            if (c170712.f52692 == c170712.f52691) {
                                if (this.f31593) {
                                    this.f31593 = false;
                                    performHapticFeedback(0);
                                }
                            } else if (!this.f31593) {
                                this.f31593 = true;
                            }
                            InterfaceC10729 interfaceC10729 = this.f31615;
                            if (interfaceC10729 != null) {
                                interfaceC10729.mo13608(c170712);
                            }
                            invalidate();
                        }
                    }
                }
            }
            if ((!this.f31611 && !this.f31631) || !this.f31620) {
                this.f31612.m26793(motionEvent);
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 1 || actionMasked2 == 3) {
                if (this.f31631 && c170712 != null) {
                    boolean z2 = c170712.f54497;
                    if (this.f31620) {
                        int i6 = this.f31616;
                        if (i6 == 0) {
                            int i7 = c170712.f52692;
                            int i8 = c170712.f52691;
                            ArrayList arrayList = this.f31624;
                            ArrayList arrayList2 = this.f31603;
                            if (i7 == i8) {
                                if (z2) {
                                    arrayList2.remove(c170712);
                                } else {
                                    arrayList.remove(c170712);
                                }
                                invalidate();
                                m23904((C16373) null);
                            } else {
                                if (z2) {
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    C17078 c170713 = (C17078) it.next();
                                    if (c170713 != c170712) {
                                        int i9 = c170712.f52692;
                                        int i10 = c170713.f52692;
                                        if (i9 <= i10 && i10 <= (i = c170712.f52691)) {
                                            c170712.f52691 = Math.max(i, c170713.f52691);
                                            it.remove();
                                        } else {
                                            int i11 = c170713.f52691;
                                            if (i9 <= i11 && i11 <= c170712.f52691) {
                                                c170712.f52692 = i10;
                                                it.remove();
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    invalidate();
                                    m23904(c170712);
                                }
                            }
                        } else if (i6 == 1) {
                            C17078 c170714 = this.f31623;
                            if (c170712 == c170714 && (c170711 = this.f31596) != null) {
                                int i12 = c170711.f52692;
                                int i13 = c170714.f52692;
                                if (i12 > i13) {
                                    c170711.f52692 = i13;
                                }
                                int i14 = c170711.f52691;
                                int i15 = c170714.f52691;
                                if (i14 < i15) {
                                    c170711.f52691 = i15;
                                }
                                invalidate();
                            } else {
                                C17078 c170715 = this.f31602;
                                if (c170712 == c170715 && (c170710 = this.f31608) != null) {
                                    int i16 = c170710.f52692;
                                    int i17 = c170715.f52692;
                                    if (i16 > i17) {
                                        c170710.f52692 = i17;
                                    }
                                    int i18 = c170710.f52691;
                                    int i19 = c170715.f52691;
                                    if (i18 < i19) {
                                        c170710.f52691 = i19;
                                    }
                                    invalidate();
                                }
                            }
                        } else if (i6 == 2) {
                            C17078 c170716 = this.f31596;
                            if (c170712 == c170716 && (c17079 = this.f31623) != null) {
                                int i20 = c170716.f52692;
                                int i21 = c17079.f52691;
                                if (i20 >= i21) {
                                    c17079.f52692 = i20;
                                    c17079.f52691 = i20 + 1;
                                } else {
                                    int i22 = c170716.f52691;
                                    int i23 = c17079.f52692;
                                    if (i22 <= i23) {
                                        c17079.f52691 = i22;
                                        c17079.f52692 = i22 - 1;
                                    } else {
                                        if (i20 > i23) {
                                            c17079.f52692 = i20;
                                        }
                                        if (i22 < i21) {
                                            c17079.f52691 = i22;
                                        }
                                    }
                                }
                                invalidate();
                            } else {
                                C17078 c170717 = this.f31608;
                                if (c170712 == c170717 && (c17078 = this.f31602) != null) {
                                    int i24 = c170717.f52692;
                                    int i25 = c17078.f52691;
                                    if (i24 >= i25) {
                                        c17078.f52692 = i24;
                                        c17078.f52691 = i24 + 1;
                                    } else {
                                        int i26 = c170717.f52691;
                                        int i27 = c17078.f52692;
                                        if (i26 <= i27) {
                                            c17078.f52691 = i26;
                                            c17078.f52692 = i26 - 1;
                                        } else {
                                            if (i24 > i27) {
                                                c17078.f52692 = i24;
                                            }
                                            if (i26 < i25) {
                                                c17078.f52691 = i26;
                                            }
                                        }
                                    }
                                    invalidate();
                                }
                            }
                        }
                        m23915();
                    }
                }
                this.f31627 = 0;
                this.f31611 = false;
                this.f31631 = false;
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
        C4916 c4916;
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
        C4916 c4917;
        int i11;
        C4916 c4918;
        int i12;
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = scrollX + width;
        int i14 = scrollY + height;
        float f = this.f31605;
        int i15 = (int) ((this.f31632 * f) + 0.5f);
        int i16 = (int) ((this.f31601 * f) + 0.5f);
        int iMax = Math.max((int) (0.5f + f), 1);
        int i17 = (width / 2) - (i15 / 2);
        int i18 = (height / 2) - (i16 / 2);
        int i19 = i17 + i15;
        int i20 = i18 + i16;
        C0144 c0144 = this.f31621;
        canvas.drawColor(c0144.f1191);
        int i21 = this.f31597;
        int i22 = ((i15 + iMax) + iMax) / i21;
        int i23 = ((i16 + iMax) + iMax) / i21;
        int[] iArr = c0144.f1194;
        C0144 c0145 = c0144;
        int i24 = 0;
        while (true) {
            c4916 = this.f31606;
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
                        c4918 = c4916;
                        i12 = i27;
                    } else {
                        c4916.setColor(iArr[(i24 + i29) % 2]);
                        c4918 = c4916;
                        i11 = i33;
                        i12 = i27;
                        canvas.drawRect(i26, i31, iMin, iMin2, c4918);
                    }
                    i29++;
                    i20 = i11;
                    c4916 = c4918;
                    iMin = iMin;
                    i27 = i12;
                    i23 = i30;
                    iArr = iArr;
                    i21 = i21;
                    i28 = i28;
                    c0145 = c0145;
                    i13 = i32;
                    i26 = i26;
                }
            }
            i24++;
            i19 = i28;
            i20 = i20;
            c0145 = c0145;
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
        C0144 c0146 = c0145;
        C4916 c4919 = c4916;
        int i37 = i19;
        BitmapDrawable bitmapDrawable = this.f31628;
        if (bitmapDrawable != null) {
            i = i36;
            bitmapDrawable.setBounds(i, i18, i37, i34);
            bitmapDrawable.draw(canvas);
        } else {
            i = i36;
        }
        int i38 = c0146.f1190;
        int i39 = c0146.f1192;
        int i40 = c0146.f1195;
        int i41 = this.f31616;
        boolean z = i41 == 0;
        boolean z2 = i41 == 1;
        boolean z3 = i41 == 2;
        boolean z4 = this.f31595;
        C17078 c17078 = this.f31619;
        for (C16373 c16373 : this.f31624) {
            boolean z5 = z4;
            float f2 = i;
            int i42 = i40;
            float f3 = (c16373.f52692 * f) + f2;
            float f4 = (c16373.f52691 * f) + f2;
            C4916 c49110 = c4919;
            c49110.setColor(-16777216);
            C0144 c0147 = c0146;
            float f5 = i18;
            int i43 = scrollX;
            C17078 c17079 = c17078;
            int i44 = i37;
            int i45 = i39;
            int i46 = i;
            int i47 = i38;
            canvas.drawRect(f3, i18 - iMax, f4, f5, c49110);
            if (z && z5) {
                c49110.setColor(i47);
                c4917 = c49110;
                canvas.drawRect(f3, f5, f4, i34, c49110);
                c4917.setColor(c17079 == c16373 ? i42 : i45);
                float f6 = scrollY;
                float f7 = i14;
                canvas.drawRect(f3, f6, f3 + 1.0f, f7, c4917);
                canvas.drawRect(f4 - 1.0f, f6, f4, f7, c4917);
            } else {
                c4917 = c49110;
            }
            i38 = i47;
            i37 = i44;
            z4 = z5;
            i40 = i42;
            i39 = i45;
            i = i46;
            c17078 = c17079;
            scrollX = i43;
            c4919 = c4917;
            c0146 = c0147;
        }
        boolean z6 = z4;
        int i48 = i40;
        int i49 = i39;
        int i50 = i;
        int i51 = scrollX;
        C17078 c170710 = c17078;
        int i52 = i38;
        int i53 = i37;
        C4916 c49111 = c4919;
        C0144 c0148 = c0146;
        Iterator it = this.f31603.iterator();
        while (it.hasNext()) {
            C16373 c16374 = (C16373) it.next();
            float f8 = i18;
            float f9 = (c16374.f52692 * f) + f8;
            float f10 = (c16374.f52691 * f) + f8;
            c49111.setColor(-16777216);
            float f11 = i50 - iMax;
            int i54 = i50;
            float f12 = i54;
            Iterator it2 = it;
            int i55 = i14;
            canvas.drawRect(f11, f9, f12, f10, c49111);
            if (z && z6) {
                c49111.setColor(i52);
                int i56 = i53;
                i10 = i56;
                canvas.drawRect(f12, f9, i56, f10, c49111);
                c49111.setColor(c170710 == c16374 ? i48 : i49);
                i9 = i51;
                float f13 = i9;
                int i57 = i35;
                float f14 = i57;
                i8 = i57;
                canvas.drawRect(f13, f9, f14, f9 + 1.0f, c49111);
                canvas.drawRect(f13, f10 - 1.0f, f14, f10, c49111);
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
                C17078 c170711 = this.f31623;
                if (c170711 != null) {
                    float f15 = i59;
                    float f16 = (c170711.f52692 * f) + f15;
                    float f17 = f15 + (c170711.f52691 * f);
                    float f18 = i18;
                    C17078 c170712 = this.f31602;
                    float f19 = (c170712.f52692 * f) + f18;
                    float f20 = (c170712.f52691 * f) + f18;
                    c49111.setColor(-16777216);
                    i2 = i64;
                    canvas.drawRect(f16, i34, f17, i34 + iMax, c49111);
                    canvas.drawRect(i62, f19, i62 + iMax, f20, c49111);
                    if (z2 && z6) {
                        c49111.setColor(i52);
                        canvas.drawRect(f16, f19, f17, f20, c49111);
                        c49111.setColor(c170710 == this.f31623 ? i48 : i49);
                        int i65 = i63;
                        float f21 = i65;
                        float f22 = f16 + 1.0f;
                        int i66 = i60;
                        float f23 = i66;
                        i3 = i52;
                        i60 = i66;
                        i4 = i65;
                        canvas.drawRect(f16, f21, f22, f23, c49111);
                        canvas.drawRect(f17 - 1.0f, f21, f17, f23, c49111);
                        c49111.setColor(c170710 == this.f31602 ? i48 : i49);
                        float f24 = i61;
                        int i67 = i58;
                        float f25 = i67;
                        i5 = i67;
                        canvas.drawRect(f24, f19, f25, f19 + 1.0f, c49111);
                        canvas.drawRect(f24, f20 - 1.0f, f25, f20, c49111);
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
                C17078 c170713 = this.f31596;
                if (c170713 != null) {
                    float f26 = i59;
                    float f27 = (c170713.f52692 * f) + f26;
                    float f28 = (c170713.f52691 * f) + f26;
                    float f29 = i18;
                    C17078 c170714 = this.f31608;
                    float f30 = (c170714.f52692 * f) + f29;
                    float f31 = (c170714.f52691 * f) + f29;
                    c49111.setColor(-65536);
                    float f32 = i34;
                    float f33 = i34 + iMax;
                    canvas.drawRect(f26, f32, f27, f33, c49111);
                    float f34 = i62;
                    canvas.drawRect(f28, f32, f34, f33, c49111);
                    float f35 = i62 + iMax;
                    canvas.drawRect(f34, f29, f35, f30, c49111);
                    canvas.drawRect(f34, f31, f35, f32, c49111);
                    if (z3 && z6) {
                        c49111.setColor(c0148.f1193);
                        canvas.drawRect(f26, f29, f34, f30, c49111);
                        canvas.drawRect(f26, f31, f34, f32, c49111);
                        canvas.drawRect(f26, f30, f27, f31, c49111);
                        canvas.drawRect(f28, f30, f34, f31, c49111);
                        c49111.setColor(c170710 == this.f31596 ? i48 : i49);
                        float f36 = i4;
                        int i68 = i60;
                        float f37 = i68;
                        i6 = i68;
                        canvas.drawRect(f27, f36, f27 + 1.0f, f37, c49111);
                        canvas.drawRect(f28 - 1.0f, f36, f28, f37, c49111);
                        c49111.setColor(c170710 == this.f31608 ? i48 : i49);
                        float f38 = i61;
                        float f39 = i5;
                        float f40 = f30 + 1.0f;
                        i7 = i5;
                        canvas.drawRect(f38, f30, f39, f40, c49111);
                        canvas.drawRect(f38, f31 - 1.0f, f39, f31, c49111);
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
    public static float m23896(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23927(InterfaceC10729 interfaceC10729) {
        this.f31615 = interfaceC10729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23904(C16373 c16373) {
        InterfaceC10729 interfaceC10729 = this.f31615;
        if (interfaceC10729 != null) {
            interfaceC10729.mo13611(c16373);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m23917() {
        InterfaceC10729 interfaceC10729 = this.f31615;
        if (interfaceC10729 != null) {
            interfaceC10729.mo13610(!this.f31614.isEmpty(), !this.f31607.isEmpty());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m23931() {
        return this.f31616;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23924(int i) {
        this.f31616 = i;
        this.f31595 = true;
        this.f31619 = null;
        m23904((C16373) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m23922() {
        return this.f31595;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23933(boolean z) {
        this.f31595 = z;
        invalidate();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m23934() {
        return !this.f31614.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m23938() {
        return !this.f31607.isEmpty();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m23939() {
        Stack stack = this.f31614;
        if (stack.isEmpty()) {
            return;
        }
        C14995 c14995 = (C14995) stack.pop();
        m23905(c14995.f48924);
        this.f31607.push(c14995);
        m23917();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23932() {
        Stack stack = this.f31607;
        if (stack.isEmpty()) {
            return;
        }
        C14995 c14995 = (C14995) stack.pop();
        m23905(c14995.f48923);
        this.f31614.push(c14995);
        m23917();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C22756 m23914() {
        C22756 c22756 = new C22756();
        c22756.f74107 = this.f31616;
        c22756.f74114 = this.f31613;
        ArrayList arrayList = this.f31624;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c22756.f74113.add(((C17078) it.next()).clone());
        }
        ArrayList arrayList2 = this.f31603;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c22756.f74109.add(((C17078) it2.next()).clone());
        }
        C17078 c17078 = this.f31623;
        c22756.f74112 = c17078 == null ? null : c17078.clone();
        C17078 c17079 = this.f31602;
        c22756.f74108 = c17079 == null ? null : c17079.clone();
        C17078 c170710 = this.f31596;
        c22756.f74111 = c170710 == null ? null : c170710.clone();
        C17078 c170711 = this.f31608;
        c22756.f74115 = c170711 != null ? c170711.clone() : null;
        C17078 c170712 = this.f31619;
        if (c170712 != null) {
            int i = this.f31616;
            if (i == 0) {
                int iIndexOf = arrayList.indexOf(c170712);
                if (iIndexOf == -1 && (iIndexOf = arrayList2.indexOf(this.f31619)) != -1) {
                    iIndexOf += arrayList.size();
                }
                c22756.f74110 = iIndexOf;
            } else {
                if (i == 1) {
                    if (c170712 == this.f31623) {
                        c22756.f74110 = 0;
                        return c22756;
                    }
                    if (c170712 == this.f31602) {
                        c22756.f74110 = 1;
                        return c22756;
                    }
                    c22756.f74110 = -1;
                    return c22756;
                }
                if (i == 2) {
                    if (c170712 == this.f31596) {
                        c22756.f74110 = 0;
                        return c22756;
                    }
                    if (c170712 == this.f31608) {
                        c22756.f74110 = 1;
                        return c22756;
                    }
                    c22756.f74110 = -1;
                    return c22756;
                }
            }
        }
        return c22756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23905(C22756 c22756) {
        ArrayList arrayList = this.f31624;
        arrayList.clear();
        ArrayList arrayList2 = this.f31603;
        arrayList2.clear();
        Iterator it = c22756.f74113.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17078) it.next()).clone());
        }
        Iterator it2 = c22756.f74109.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C17078) it2.next()).clone());
        }
        C17078 c17078 = c22756.f74112;
        this.f31623 = c17078 == null ? null : c17078.clone();
        C17078 c17079 = c22756.f74108;
        this.f31602 = c17079 == null ? null : c17079.clone();
        C17078 c170710 = c22756.f74111;
        this.f31596 = c170710 == null ? null : c170710.clone();
        C17078 c170711 = c22756.f74115;
        C17078 c17078Clone = c170711 == null ? null : c170711.clone();
        this.f31608 = c17078Clone;
        int i = c22756.f74110;
        if (i == -1) {
            this.f31619 = null;
        } else {
            int i2 = c22756.f74107;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            this.f31619 = this.f31596;
                        } else if (i == 1) {
                            this.f31619 = c17078Clone;
                        } else {
                            this.f31619 = null;
                        }
                    }
                } else if (i == 0) {
                    this.f31619 = this.f31623;
                } else if (i == 1) {
                    this.f31619 = this.f31602;
                } else {
                    this.f31619 = null;
                }
            } else if (i < arrayList.size()) {
                this.f31619 = (C17078) arrayList.get(i);
            } else {
                int size = i - arrayList.size();
                if (size < arrayList2.size()) {
                    this.f31619 = (C17078) arrayList2.get(size);
                } else {
                    this.f31619 = null;
                }
            }
        }
        int i3 = c22756.f74107;
        if (i3 != this.f31616) {
            this.f31616 = i3;
            InterfaceC10729 interfaceC10729 = this.f31615;
            if (interfaceC10729 != null) {
                interfaceC10729.mo13607(i3);
            }
        }
        int i4 = c22756.f74114;
        if (i4 != this.f31613) {
            this.f31613 = i4;
            InterfaceC10729 interfaceC107210 = this.f31615;
            if (interfaceC107210 != null) {
                interfaceC107210.mo13609(m23935());
            }
        }
        m23904(this.f31619);
        this.f31595 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23928(C11018 c11018) {
        c11018.writeInt(1901228945);
        c11018.writeInt(this.f31599);
        c11018.writeInt(this.f31609);
        m23914().m50420(c11018);
        Stack<C14995> stack = this.f31614;
        c11018.mo24508(stack.size());
        for (C14995 c14995 : stack) {
            c14995.f48924.m50420(c11018);
            c14995.f48923.m50420(c11018);
        }
        Stack<C14995> stack2 = this.f31607;
        c11018.mo24508(stack2.size());
        for (C14995 c14996 : stack2) {
            c14996.f48924.m50420(c11018);
            c14996.f48923.m50420(c11018);
        }
        c11018.writeInt(1901228945);
        c11018.writeInt(getScrollX());
        c11018.writeInt(getScrollY());
        c11018.m27778(this.f31605);
        c11018.m27784(this.f31595);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23929(C17367 c17367) {
        try {
            C20190.m45649((InterfaceC0433) c17367, 1901228945);
            this.f31599 = c17367.readInt();
            this.f31609 = c17367.readInt();
            C22756 c22756 = new C22756();
            c22756.m50421(c17367);
            m23905(c22756);
            int iM40462 = c17367.m40462();
            Stack stack = this.f31614;
            stack.clear();
            for (int i = 0; i < iM40462; i++) {
                C14995 c14995 = new C14995();
                C22756 c22757 = new C22756();
                c22757.m50421(c17367);
                c14995.f48924 = c22757;
                C22756 c22758 = new C22756();
                c22758.m50421(c17367);
                c14995.f48923 = c22758;
                stack.add(c14995);
            }
            int iM40463 = c17367.m40462();
            Stack stack2 = this.f31607;
            stack2.clear();
            for (int i2 = 0; i2 < iM40463; i2++) {
                C14995 c14996 = new C14995();
                C22756 c22759 = new C22756();
                c22759.m50421(c17367);
                c14996.f48924 = c22759;
                C22756 c227510 = new C22756();
                c227510.m50421(c17367);
                c14996.f48923 = c227510;
                stack2.add(c14996);
            }
            m23917();
            try {
                C20190.m45649((InterfaceC0433) c17367, 1901228945);
                scrollTo(c17367.readInt(), c17367.readInt());
                this.f31605 = c17367.m40450();
                this.f31630 = false;
                this.f31595 = c17367.m40461();
                invalidate();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m23916() {
        C14995 c14995 = new C14995();
        this.f31629 = c14995;
        c14995.f48924 = m23914();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m23915() {
        int i = this.f31599 + 1;
        this.f31599 = i;
        this.f31613 = i;
        InterfaceC10729 interfaceC10729 = this.f31615;
        if (interfaceC10729 != null) {
            interfaceC10729.mo13609(m23935());
        }
        C14995 c14995 = this.f31629;
        if (c14995 != null) {
            c14995.f48923 = m23914();
            this.f31614.push(this.f31629);
            this.f31607.clear();
            this.f31629 = null;
            m23917();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m23935() {
        return this.f31609 != this.f31613;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23937(boolean z) {
        int i;
        if (z) {
            int i2 = this.f31599 + 1;
            this.f31599 = i2;
            i = -i2;
        } else {
            i = this.f31613;
        }
        this.f31609 = i;
        InterfaceC10729 interfaceC10729 = this.f31615;
        if (interfaceC10729 != null) {
            interfaceC10729.mo13609(m23935());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23925(String str) {
        C11467 c11467M7013 = C2293.m7013(this.f31632, this.f31601, str);
        C17078 c17078 = this.f31623;
        C17078 c17079 = this.f31602;
        C17078 c170710 = this.f31596;
        C17078 c170711 = this.f31608;
        int i = this.f31632;
        int i2 = this.f31601;
        ArrayList arrayList = this.f31624;
        ArrayList arrayList2 = this.f31603;
        if (new C11467(arrayList, arrayList2, c17078, c17079, c170710, c170711, i, i2).m28652(c11467M7013)) {
            return;
        }
        m23916();
        arrayList.clear();
        for (C16373 c16373 : c11467M7013.f38607) {
            arrayList.add(new C17078(c16373.f52692, c16373.f52691, false));
        }
        arrayList2.clear();
        for (C16373 c16374 : c11467M7013.f38610) {
            arrayList2.add(new C17078(c16374.f52692, c16374.f52691, true));
        }
        C16373 c16375 = c11467M7013.f38606;
        if (c16375 == null) {
            this.f31602 = null;
            this.f31623 = null;
        } else {
            this.f31623 = new C17078(c16375.f52692, c16375.f52691, false);
            C16373 c16376 = c11467M7013.f38609;
            this.f31602 = new C17078(c16376.f52692, c16376.f52691, true);
        }
        C16373 c16377 = c11467M7013.f38608;
        this.f31596 = new C17078(c16377.f52692, c16377.f52691, false);
        C16373 c16378 = c11467M7013.f38605;
        this.f31608 = new C17078(c16378.f52692, c16378.f52691, true);
        this.f31619 = null;
        this.f31595 = true;
        m23915();
        m23904((C16373) null);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m23940() {
        return C2293.m7011(new C11467(this.f31624, this.f31603, this.f31623, this.f31602, this.f31596, this.f31608, this.f31632, this.f31601), this.f31632, this.f31601);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23920() {
        return this.f31623 != null;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m23941() {
        m23916();
        this.f31602 = null;
        this.f31623 = null;
        m23915();
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23923() {
        if (m23920()) {
            return;
        }
        m23916();
        C17078 c17078 = this.f31596;
        this.f31623 = c17078 != null ? c17078.clone() : new C17078(0, this.f31632, false);
        C17078 c17079 = this.f31608;
        this.f31602 = c17079 != null ? c17079.clone() : new C17078(0, this.f31601, true);
        m23915();
        invalidate();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23936(C6527 c6527) {
        C5789 c5789 = new C5789();
        ArrayList<C17078> arrayList = this.f31624;
        for (C17078 c17078 : arrayList) {
            c5789.f19676.add(new C16373(c17078.f52692, c17078.f52691));
        }
        ArrayList<C17078> arrayList2 = this.f31603;
        for (C17078 c17079 : arrayList2) {
            c5789.f19674.add(new C16373(c17079.f52692, c17079.f52691));
        }
        C17078 c170710 = this.f31623;
        if (c170710 != null) {
            Rect rect = c5789.f19677;
            rect.left = c170710.f52692;
            rect.right = this.f31632 - c170710.f52691;
            C17078 c170711 = this.f31602;
            rect.top = c170711.f52692;
            rect.bottom = this.f31601 - c170711.f52691;
        } else {
            c5789.f19677.set(C5789.m15959(arrayList, arrayList2, this.f31632, this.f31601));
        }
        c6527.m17735(c5789);
        if (this.f31596 != null) {
            C5116 c5116 = new C5116();
            C17078 c170712 = this.f31596;
            c5116.f17821 = c170712.f52692;
            c5116.f17820 = this.f31632 - c170712.f52691;
            C17078 c170713 = this.f31608;
            c5116.f17818 = c170713.f52692;
            c5116.f17819 = this.f31601 - c170713.f52691;
            c6527.m17734(c5116);
            return;
        }
        c6527.m17734((C5116) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23930(boolean z) {
        ArrayList arrayList = z ? this.f31603 : this.f31624;
        C17078 c17078 = new C17078(z);
        int i = z ? this.f31601 : this.f31632;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C17078 c17079 = (C17078) arrayList.get(0);
                int i3 = c17079.f52692;
                int i4 = c17079.f52691;
                if (i3 >= i - i4) {
                    i = i3 - 1;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C17078 c170710 = (C17078) arrayList.get(i5);
                    if (i5 == 0) {
                        arrayList2.add(new C1555(0, c170710.f52692 - 1));
                    } else if (i5 == size - 1) {
                        arrayList2.add(new C1555(c170710.f52691 + 1, i));
                    } else {
                        arrayList2.add(new C1555(((C17078) arrayList.get(i5 - 1)).f52691 + 1, c170710.f52692 - 1));
                    }
                }
                Collections.sort(arrayList2);
                C1555 c1555 = (C1555) arrayList2.get(0);
                i2 = c1555.f6286;
                i = c1555.f6285;
            }
        }
        int i6 = i - i2;
        if (i6 <= 0) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        int i7 = (int) (getContext().getResources().getDisplayMetrics().density * 16.0f);
        if (i6 > i7) {
            int i8 = (i6 - i7) / 2;
            i -= i8;
            i2 += i8;
        }
        c17078.f52692 = i2;
        c17078.f52691 = i;
        m23916();
        arrayList.add(c17078);
        Collections.sort(arrayList);
        m23915();
        invalidate();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m23921() {
        Stack stack = this.f31614;
        boolean zIsEmpty = stack.isEmpty();
        Stack stack2 = this.f31607;
        if (zIsEmpty && stack2.isEmpty()) {
            return;
        }
        stack.clear();
        stack2.clear();
        m23917();
    }
}
