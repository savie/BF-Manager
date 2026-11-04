package l;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N6J6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10177 implements AutoCloseable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f32574 = {R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final MenuItem f32575;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public RunnableC2019 f32576;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f32577;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16390 f32578;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC19128 f32579;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f32580;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final MenuItem f32581;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9898 f32582;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32583;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f32584;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC16611 f32585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final MenuItem f32586;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, l.ᩳܰ᩸] */
    public C10177(C16390 c16390, Menu menu) {
        ?? r0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ᩳܰ᩸
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f61903.m26289();
            }
        };
        this.f32579 = r0;
        this.f32578 = c16390;
        this.f32582 = (C9898) menu;
        this.f32586 = menu.findItem(R.id.MT_Protector);
        this.f32575 = menu.findItem(R.id.MT_Protector);
        this.f32581 = menu.findItem(R.id.MT_Protector);
        this.f32585 = (ViewOnClickListenerC16611) LayoutInflater.from(c16390.getContext()).inflate(R.layout.MT_Protector, (ViewGroup) c16390, false);
        c16390.getViewTreeObserver().addOnGlobalLayoutListener(r0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26291(int i, boolean z, boolean z2) {
        int i2;
        if (this.f32583) {
            return;
        }
        this.f32584 = z;
        this.f32577 = z2;
        if (this.f32580 != i) {
            this.f32580 = i;
            if (i != 0) {
                if (i == R.id.MT_Protector || i == R.id.MT_Protector) {
                    i2 = R.drawable.MT_Protector;
                } else {
                    i2 = i == R.id.MT_Protector ? R.drawable.MT_Protector : R.drawable.MT_Protector;
                }
                this.f32581.setIcon(i2);
            }
        }
        m26289();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26292(RunnableC2019 runnableC2019) {
        this.f32576 = runnableC2019;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m26289() {
        C9898 c9898;
        MenuItem menuItem;
        MenuItem menuItem2;
        if (this.f32583) {
            return;
        }
        C16390 c16390 = this.f32578;
        int width = (c16390.getWidth() - c16390.getPaddingLeft()) - c16390.getPaddingRight();
        ImageButton imageButtonM18917 = C6784.m18917(c16390);
        int iMax = width - Math.max(c16390.getCurrentContentInsetStart(), (imageButtonM18917 == null || imageButtonM18917.getVisibility() == 8) ? 0 : imageButtonM18917.getMeasuredWidth() + m26288(imageButtonM18917));
        C17531 c17531M18915 = C6784.m18915(c16390);
        if (c17531M18915 != null) {
            iMax -= c17531M18915.getPaddingRight() + (c17531M18915.getPaddingLeft() + m26288(c17531M18915));
        }
        int i = 0;
        int iM26287 = 0;
        while (true) {
            c9898 = this.f32582;
            int size = c9898.size();
            menuItem = this.f32586;
            menuItem2 = this.f32581;
            if (i >= size) {
                break;
            }
            C8407 c8407 = (C8407) c9898.getItem(i);
            if (c8407 != menuItem && c8407 != menuItem2 && c8407.isVisible() && c8407.mo6060()) {
                iM26287 += m26287(c8407);
            }
            i++;
        }
        boolean z = iMax >= c16390.getCurrentContentInsetEnd();
        int i2 = iMax - iM26287;
        int iM26288 = m26287(menuItem);
        boolean z2 = this.f32584;
        boolean z3 = z2 && z && i2 >= iM26288;
        if (z3) {
            i2 -= iM26288;
        }
        boolean z4 = this.f32580 != 0 && z && (!z2 || z3) && i2 >= m26287(menuItem2);
        c9898.stopDispatchingItemsChanged();
        try {
            if (menuItem.isVisible() != z3) {
                menuItem.setVisible(z3);
            }
            MenuItem menuItem3 = this.f32575;
            boolean z5 = this.f32584 && !z3;
            if (menuItem3.isVisible() != z5) {
                menuItem3.setVisible(z5);
            }
            if (menuItem2.isVisible() != z4) {
                menuItem2.setVisible(z4);
            }
            boolean z6 = this.f32577;
            if (menuItem2.isEnabled() != z6) {
                menuItem2.setEnabled(z6);
            }
            int[] iArr = f32574;
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = iArr[i3];
                MenuItem menuItemFindItem = c9898.findItem(i4);
                boolean z7 = i4 == this.f32580 && !z4;
                if (menuItemFindItem.isVisible() != z7) {
                    menuItemFindItem.setVisible(z7);
                }
                boolean z8 = this.f32577;
                if (menuItemFindItem.isEnabled() != z8) {
                    menuItemFindItem.setEnabled(z8);
                }
            }
        } finally {
            c9898.startDispatchingItemsChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26287(MenuItem menuItem) {
        ViewOnClickListenerC16611 viewOnClickListenerC16611 = this.f32585;
        viewOnClickListenerC16611.initialize((C8407) menuItem, 0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        viewOnClickListenerC16611.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return viewOnClickListenerC16611.getMeasuredWidth() + m26288(viewOnClickListenerC16611);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26288(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f32583) {
            return;
        }
        this.f32583 = true;
        this.f32578.getViewTreeObserver().removeOnGlobalLayoutListener(this.f32579);
        RunnableC2019 runnableC2019 = this.f32576;
        if (runnableC2019 != null) {
            runnableC2019.run();
            this.f32576 = null;
        }
    }
}
