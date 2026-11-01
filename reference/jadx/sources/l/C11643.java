package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۨۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GQ */
/* JADX INFO: loaded from: classes3.dex */
public class C11643 extends FrameLayout {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39120 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f39121;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final View f39122;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f39123;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f39124;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f39125;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f39126;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f39127;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f39128;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f39129;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f39130;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f39131;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f39132;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f39133;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f39134;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7326 f39135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39136;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f39137;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Formatter f39138;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39139;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final String f39140;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f39141;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f39142;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float f39143;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f39144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f39145;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RunnableC17894 f39146;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f39147;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f39148;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String f39149;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f39150;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final View f39151;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC8979 f39152;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39153;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f39154;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39155;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final View f39156;

    static {
        C11572.m28868("media3.ui");
    }

    public C11643(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C11643(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39147 = OpenAuthTask.Duplex;
        this.f39154 = 0;
        this.f39131 = 200;
        this.f39129 = -9223372036854775807L;
        this.f39142 = true;
        this.f39126 = true;
        this.f39155 = true;
        this.f39130 = true;
        this.f39153 = false;
        int resourceId = R.layout.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1981.f7430, i, 0);
            try {
                this.f39147 = typedArrayObtainStyledAttributes.getInt(19, OpenAuthTask.Duplex);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.MT_Protector);
                this.f39154 = typedArrayObtainStyledAttributes.getInt(8, 0);
                this.f39142 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                this.f39126 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                this.f39155 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                this.f39130 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                this.f39153 = typedArrayObtainStyledAttributes.getBoolean(18, false);
                this.f39131 = C17983.m41813(typedArrayObtainStyledAttributes.getInt(20, this.f39131), 16, 1000);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f39144 = new CopyOnWriteArrayList();
        new C20039();
        new C0282();
        StringBuilder sb = new StringBuilder();
        this.f39145 = sb;
        this.f39138 = new Formatter(sb, Locale.getDefault());
        ViewOnClickListenerC4586 viewOnClickListenerC4586 = new ViewOnClickListenerC4586(this);
        this.f39152 = new RunnableC8979(1, this);
        this.f39146 = new RunnableC17894(1, this);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC7326 interfaceC7326 = (InterfaceC7326) findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        if (interfaceC7326 != null) {
            this.f39135 = interfaceC7326;
        } else if (viewFindViewById != null) {
            C3134 c3134 = new C3134(context, null, 0, attributeSet, 0);
            c3134.setId(R.id.MT_Protector);
            c3134.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c3134, iIndexOfChild);
            this.f39135 = c3134;
        } else {
            this.f39135 = null;
        }
        this.f39134 = (TextView) findViewById(R.id.MT_Protector);
        InterfaceC7326 interfaceC7327 = this.f39135;
        if (interfaceC7327 != null) {
            interfaceC7327.mo9502(viewOnClickListenerC4586);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f39123 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f39141 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        this.f39125 = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById5 = findViewById(R.id.MT_Protector);
        this.f39156 = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById6 = findViewById(R.id.MT_Protector);
        this.f39122 = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById7 = findViewById(R.id.MT_Protector);
        this.f39121 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC4586);
        }
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f39128 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC4586);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f39148 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC4586);
        }
        View viewFindViewById8 = findViewById(R.id.MT_Protector);
        this.f39151 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setVisibility(8);
        }
        m29065(viewFindViewById8, false);
        Resources resources = context.getResources();
        resources.getInteger(R.integer.MT_Protector);
        this.f39143 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f39137 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f39124 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f39127 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f39133 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f39132 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f39140 = resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        this.f39149 = resources.getString(R.string.MT_Protector);
        this.f39150 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29077() {
        if (m29078()) {
            setVisibility(8);
            for (InterfaceC13760 interfaceC13760 : this.f39144) {
                getVisibility();
                interfaceC13760.m33526();
            }
            removeCallbacks(this.f39152);
            removeCallbacks(this.f39146);
            this.f39129 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29078() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m29071() {
        RunnableC17894 runnableC17894 = this.f39146;
        removeCallbacks(runnableC17894);
        int i = this.f39147;
        if (i > 0) {
            long j = i;
            this.f39129 = SystemClock.uptimeMillis() + j;
            if (this.f39136) {
                postDelayed(runnableC17894, j);
                return;
            }
            return;
        }
        this.f39129 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m29068() {
        boolean zIsAccessibilityFocused;
        if (m29078() && this.f39136) {
            String str = C17983.f57504;
            View view = this.f39123;
            boolean zIsFocused = false;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f39141;
            if (view2 != null) {
                zIsFocused = view2.isFocused();
                zIsAccessibilityFocused = view2.isAccessibilityFocused();
                view2.setVisibility(8);
            } else {
                zIsAccessibilityFocused = false;
            }
            if (zIsFocused && view != null) {
                view.requestFocus();
            }
            if (!zIsAccessibilityFocused || view == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m29063() {
        if (m29078() && this.f39136) {
            m29065(this.f39125, this.f39155);
            m29065(this.f39122, this.f39142);
            m29065(this.f39121, this.f39126);
            m29065(this.f39156, this.f39130);
            InterfaceC7326 interfaceC7326 = this.f39135;
            if (interfaceC7326 != null) {
                interfaceC7326.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m29060() {
        ImageView imageView;
        if (m29078() && this.f39136 && (imageView = this.f39128) != null) {
            if (this.f39154 == 0) {
                m29065((View) imageView, false);
                return;
            }
            m29065((View) imageView, true);
            imageView.setImageDrawable(this.f39137);
            imageView.setContentDescription(this.f39140);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void m29072() {
        ImageView imageView;
        if (m29078() && this.f39136 && (imageView = this.f39148) != null) {
            if (!this.f39153) {
                m29065((View) imageView, false);
                return;
            }
            m29065((View) imageView, true);
            imageView.setImageDrawable(this.f39132);
            imageView.setContentDescription(this.f39149);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m29075() {
        if (m29078() && this.f39136) {
            boolean z = 0 != this.f39150;
            this.f39150 = 0L;
            TextView textView = this.f39134;
            if (textView != null && !this.f39139 && z) {
                textView.setText(C17983.m41833(this.f39145, this.f39138, 0L));
            }
            InterfaceC7326 interfaceC7326 = this.f39135;
            if (interfaceC7326 != null) {
                interfaceC7326.mo9501(0L);
                interfaceC7326.mo9506(0L);
            }
            removeCallbacks(this.f39152);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29065(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(false);
        view.setAlpha(this.f39143);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39136 = true;
        long j = this.f39129;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m29077();
            } else {
                postDelayed(this.f39146, jUptimeMillis);
            }
        } else if (m29078()) {
            m29071();
        }
        m29068();
        m29063();
        m29060();
        m29072();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39136 = false;
        removeCallbacks(this.f39152);
        removeCallbacks(this.f39146);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f39146);
        } else if (motionEvent.getAction() == 1) {
            m29071();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }
}
