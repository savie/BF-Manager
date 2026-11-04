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

/* JADX INFO: renamed from: l.ܿۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38GQ */
/* JADX INFO: loaded from: classes4.dex */
public class C18316 extends FrameLayout {

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59729 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final StringBuilder f59730;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f59731;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59732;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View f59733;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f59734;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC1444 f59735;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f59736;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f59737;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15683 f59738;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f59739;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Formatter f59740;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f59741;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final View f59742;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f59743;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f59744;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f59745;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f59746;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final View f59747;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f59748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f59749;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f59750;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f59751;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f59752;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f59753;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f59754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f59755;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC1784 f59756;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f59757;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String f59758;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f59759;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final View f59760;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final String f59761;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f59762;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f59763;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f59764;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59765;

    static {
        C21616.m49139("media3.ui");
    }

    public C18316(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18316(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59752 = OpenAuthTask.Duplex;
        this.f59751 = 0;
        this.f59764 = 200;
        this.f59743 = -9223372036854775807L;
        this.f59753 = true;
        this.f59732 = true;
        this.f59765 = true;
        this.f59745 = true;
        this.f59754 = false;
        int resourceId = R.layout.MT_Protector;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C12445.f39998, i, 0);
            try {
                this.f59752 = typedArrayObtainStyledAttributes.getInt(19, OpenAuthTask.Duplex);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.MT_Protector);
                this.f59751 = typedArrayObtainStyledAttributes.getInt(8, 0);
                this.f59753 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                this.f59732 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                this.f59765 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                this.f59745 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                this.f59754 = typedArrayObtainStyledAttributes.getBoolean(18, false);
                this.f59764 = C7116.m19460(typedArrayObtainStyledAttributes.getInt(20, this.f59764), 16, 1000);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f59750 = new CopyOnWriteArrayList();
        new C1634();
        new C11328();
        StringBuilder sb = new StringBuilder();
        this.f59730 = sb;
        this.f59740 = new Formatter(sb, Locale.getDefault());
        ViewOnClickListenerC14586 viewOnClickListenerC14586 = new ViewOnClickListenerC14586(this);
        int i2 = 1;
        this.f59735 = new RunnableC1444(i2, this);
        this.f59756 = new RunnableC1784(i2, this);
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        InterfaceC15683 interfaceC15683 = (InterfaceC15683) findViewById(R.id.MT_Protector);
        View viewFindViewById = findViewById(R.id.MT_Protector);
        if (interfaceC15683 != null) {
            this.f59738 = interfaceC15683;
        } else if (viewFindViewById != null) {
            C4146 c4146 = new C4146(context, null, 0, attributeSet, 0);
            c4146.setId(R.id.MT_Protector);
            c4146.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c4146, iIndexOfChild);
            this.f59738 = c4146;
        } else {
            this.f59738 = null;
        }
        this.f59739 = (TextView) findViewById(R.id.MT_Protector);
        InterfaceC15683 interfaceC15684 = this.f59738;
        if (interfaceC15684 != null) {
            interfaceC15684.mo13285(viewOnClickListenerC14586);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f59741 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f59733 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        this.f59748 = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById5 = findViewById(R.id.MT_Protector);
        this.f59742 = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById6 = findViewById(R.id.MT_Protector);
        this.f59747 = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById7 = findViewById(R.id.MT_Protector);
        this.f59755 = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC14586);
        }
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f59757 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC14586);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f59763 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC14586);
        }
        View viewFindViewById8 = findViewById(R.id.MT_Protector);
        this.f59760 = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setVisibility(8);
        }
        m42716(viewFindViewById8, false);
        Resources resources = context.getResources();
        resources.getInteger(R.integer.MT_Protector);
        this.f59749 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f59744 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f59762 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f59736 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f59746 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f59734 = resources.getDrawable(R.drawable.MT_Protector, context.getTheme());
        this.f59761 = resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        resources.getString(R.string.MT_Protector);
        this.f59758 = resources.getString(R.string.MT_Protector);
        this.f59759 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42732() {
        if (m42733()) {
            setVisibility(8);
            for (InterfaceC21300 interfaceC21300 : this.f59750) {
                getVisibility();
                interfaceC21300.m48535();
            }
            removeCallbacks(this.f59735);
            removeCallbacks(this.f59756);
            this.f59743 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42733() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m42722() {
        RunnableC1784 runnableC1784 = this.f59756;
        removeCallbacks(runnableC1784);
        int i = this.f59752;
        if (i > 0) {
            long j = i;
            this.f59743 = SystemClock.uptimeMillis() + j;
            if (this.f59731) {
                postDelayed(runnableC1784, j);
                return;
            }
            return;
        }
        this.f59743 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m42727() {
        boolean zIsAccessibilityFocused;
        if (m42733() && this.f59731) {
            String str = C7116.f23455;
            View view = this.f59741;
            boolean zIsFocused = false;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f59733;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m42731() {
        if (m42733() && this.f59731) {
            m42716(this.f59748, this.f59765);
            m42716(this.f59747, this.f59753);
            m42716(this.f59755, this.f59732);
            m42716(this.f59742, this.f59745);
            InterfaceC15683 interfaceC15683 = this.f59738;
            if (interfaceC15683 != null) {
                interfaceC15683.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m42723() {
        ImageView imageView;
        if (m42733() && this.f59731 && (imageView = this.f59757) != null) {
            if (this.f59751 == 0) {
                m42716((View) imageView, false);
                return;
            }
            m42716((View) imageView, true);
            imageView.setImageDrawable(this.f59744);
            imageView.setContentDescription(this.f59761);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m42719() {
        ImageView imageView;
        if (m42733() && this.f59731 && (imageView = this.f59763) != null) {
            if (!this.f59754) {
                m42716((View) imageView, false);
                return;
            }
            m42716((View) imageView, true);
            imageView.setImageDrawable(this.f59734);
            imageView.setContentDescription(this.f59758);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m42725() {
        if (m42733() && this.f59731) {
            boolean z = 0 != this.f59759;
            this.f59759 = 0L;
            TextView textView = this.f59739;
            if (textView != null && !this.f59737 && z) {
                textView.setText(C7116.m19480(this.f59730, this.f59740, 0L));
            }
            InterfaceC15683 interfaceC15683 = this.f59738;
            if (interfaceC15683 != null) {
                interfaceC15683.mo13284(0L);
                interfaceC15683.mo13289(0L);
            }
            removeCallbacks(this.f59735);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42716(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(false);
        view.setAlpha(this.f59749);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59731 = true;
        long j = this.f59743;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m42732();
            } else {
                postDelayed(this.f59756, jUptimeMillis);
            }
        } else if (m42733()) {
            m42722();
        }
        m42727();
        m42731();
        m42723();
        m42719();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59731 = false;
        removeCallbacks(this.f59735);
        removeCallbacks(this.f59756);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f59756);
        } else if (motionEvent.getAction() == 1) {
            m42722();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }
}
