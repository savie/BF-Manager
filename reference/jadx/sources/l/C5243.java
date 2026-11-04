package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۙ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes2.dex */
public class C5243 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC6955 f18457;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f18458;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f18459;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f18460;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f18461;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Method f18462;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f18463;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20554 f18464;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Drawable f18465;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f18466;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f18467;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f18468;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final View f18469;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19533 f18470;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Class f18471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18472;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f18473;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f18474;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final View f18475;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean f18476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f18477;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12921 f18478;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final Handler f18479;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f18480;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Object f18481;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18482;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C11208 f18483;

    public C5243(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5243(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        Class<InterfaceC5054> cls;
        Object objNewProxyInstance;
        Method method;
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        super(context, attributeSet, i);
        ViewOnClickListenerC6955 viewOnClickListenerC6955 = new ViewOnClickListenerC6955(this);
        this.f18457 = viewOnClickListenerC6955;
        this.f18479 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f18464 = null;
            this.f18469 = null;
            this.f18475 = null;
            this.f18476 = false;
            this.f18468 = null;
            this.f18480 = null;
            this.f18483 = null;
            this.f18477 = null;
            this.f18463 = null;
            this.f18478 = null;
            this.f18473 = null;
            this.f18471 = null;
            this.f18462 = null;
            this.f18481 = null;
            ImageView imageView = new ImageView(context);
            if (Build.VERSION.SDK_INT >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.MT_Protector, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.MT_Protector, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.MT_Protector, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.MT_Protector));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C12445.f39999, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.MT_Protector);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(38, OpenAuthTask.Duplex);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f18482 = typedArrayObtainStyledAttributes.getBoolean(16, this.f18482);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i6 = i14;
                z3 = z11;
                i4 = i11;
                z = z8;
                i5 = i15;
                i8 = color;
                z6 = z9;
                i3 = i13;
                i10 = i12;
                i2 = integer;
                i9 = resourceId2;
                z5 = zHasValue;
                i7 = resourceId;
                z4 = z12;
                z2 = z10;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 0;
            i3 = 1;
            z = true;
            i4 = 1;
            i5 = OpenAuthTask.Duplex;
            z2 = true;
            z3 = true;
            z4 = true;
            i6 = 0;
            i7 = R.layout.MT_Protector;
            i8 = 0;
            z5 = false;
            i9 = 0;
            i10 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        C20554 c20554 = (C20554) findViewById(R.id.MT_Protector);
        this.f18464 = c20554;
        if (c20554 != null) {
            c20554.m47121(i6);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f18469 = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (c20554 != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f18475 = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = C5442.f19011;
                        this.f18475 = (View) C5442.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 == 4) {
                    try {
                        int i17 = C10879.f34428;
                        this.f18475 = (View) C10879.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        C8446.m22632(surfaceView);
                    }
                    this.f18475 = surfaceView;
                }
                this.f18475.setLayoutParams(layoutParams);
                this.f18475.setOnClickListener(viewOnClickListenerC6955);
                this.f18475.setClickable(false);
                c20554.addView(this.f18475, 0);
            }
            z7 = false;
            this.f18475.setLayoutParams(layoutParams);
            this.f18475.setOnClickListener(viewOnClickListenerC6955);
            this.f18475.setClickable(false);
            c20554.addView(this.f18475, 0);
        } else {
            this.f18475 = null;
            z7 = false;
        }
        this.f18476 = z7;
        this.f18473 = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f18468 = (ImageView) findViewById(R.id.MT_Protector);
        this.f18461 = i10;
        try {
            cls = InterfaceC5054.class;
            method = cls.getMethod("ۙ", InterfaceC8497.class);
            objNewProxyInstance = Proxy.newProxyInstance(InterfaceC8497.class.getClassLoader(), new Class[]{InterfaceC8497.class}, new InvocationHandler() { // from class: l.ۖۛ᩷
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    C5243.m15761(this.f7943, method2, objArr);
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f18471 = cls;
        this.f18462 = method;
        this.f18481 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f18480 = imageView2;
        this.f18472 = (!z || i4 == 0 || imageView2 == null) ? 0 : i4;
        if (i9 != 0) {
            this.f18465 = C7508.m20563(getContext(), i9);
        }
        C11208 c11208 = (C11208) findViewById(R.id.MT_Protector);
        this.f18483 = c11208;
        if (c11208 != null) {
            boolean zIsInEditMode = c11208.isInEditMode();
            C6384 c6384 = C6384.f21572;
            if (!zIsInEditMode && (captioningManager2 = (CaptioningManager) c11208.getContext().getSystemService("captioning")) != null && captioningManager2.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                c6384 = new C6384(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
            }
            c11208.m28245(c6384);
            float fontScale = 1.0f;
            if (!c11208.isInEditMode() && (captioningManager = (CaptioningManager) c11208.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                fontScale = captioningManager.getFontScale();
            }
            c11208.m28243(fontScale * 0.0533f);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f18477 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f18459 = i2;
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f18463 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C12921 c12921 = (C12921) findViewById(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        if (c12921 != null) {
            this.f18478 = c12921;
        } else if (viewFindViewById3 != null) {
            C12921 c12922 = new C12921(context, null, 0, attributeSet);
            this.f18478 = c12922;
            c12922.setId(R.id.MT_Protector);
            c12922.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c12922, iIndexOfChild);
        } else {
            this.f18478 = null;
        }
        C12921 c12923 = this.f18478;
        this.f18460 = c12923 != null ? i5 : 0;
        this.f18466 = z2;
        this.f18467 = z3;
        this.f18458 = z4;
        this.f18474 = z6 && c12923 != null;
        if (c12923 != null) {
            c12923.m32068();
            this.f18478.m32063(this.f18457);
        }
        if (z6) {
            setClickable(true);
        }
        m15783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15761(C5243 c5243, Method method, Object[] objArr) {
        if (method.getName().equals("onImageAvailable")) {
            c5243.f18479.post(new RunnableC24122(3, c5243, (Bitmap) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15789(InterfaceC19533 interfaceC19533) {
        C20782.m47568(Looper.myLooper() == Looper.getMainLooper());
        C20782.m47565(interfaceC19533 == null || interfaceC19533.mo23557() == Looper.getMainLooper());
        InterfaceC19533 interfaceC19534 = this.f18470;
        if (interfaceC19534 == interfaceC19533) {
            return;
        }
        Method method = this.f18462;
        Class cls = this.f18471;
        View view = this.f18475;
        ViewOnClickListenerC6955 viewOnClickListenerC6955 = this.f18457;
        if (interfaceC19534 != null) {
            interfaceC19534.mo23552(viewOnClickListenerC6955);
            if (interfaceC19534.mo21703(27)) {
                if (view instanceof TextureView) {
                    interfaceC19534.mo23576((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC19534.mo23575((SurfaceView) view);
                }
            }
            if (cls != null && cls.isAssignableFrom(interfaceC19534.getClass())) {
                try {
                    method.getClass();
                    method.invoke(interfaceC19534, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        C11208 c11208 = this.f18483;
        if (c11208 != null) {
            c11208.m28244((List) null);
        }
        this.f18470 = interfaceC19533;
        if (m15779()) {
            this.f18478.m32064(interfaceC19533);
        }
        m15772();
        TextView textView = this.f18463;
        if (textView != null) {
            InterfaceC19533 interfaceC19535 = this.f18470;
            if (interfaceC19535 != null) {
                interfaceC19535.mo23569();
            }
            textView.setVisibility(8);
        }
        m15782(true);
        if (interfaceC19533 != null) {
            AbstractC7971 abstractC7971 = (AbstractC7971) interfaceC19533;
            if (abstractC7971.mo21703(27)) {
                if (view instanceof TextureView) {
                    interfaceC19533.mo23548((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC19533.mo23547((SurfaceView) view);
                }
                if (!abstractC7971.mo21703(30) || interfaceC19533.mo23568().m30248()) {
                    m15776();
                }
            }
            if (c11208 != null && abstractC7971.mo21703(28)) {
                c11208.m28244(interfaceC19533.mo23581().f38157);
            }
            interfaceC19533.mo23577(viewOnClickListenerC6955);
            if (cls != null && cls.isAssignableFrom(interfaceC19533.getClass())) {
                try {
                    method.getClass();
                    Object obj = this.f18481;
                    obj.getClass();
                    method.invoke(interfaceC19533, obj);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
            m15767(false);
            return;
        }
        m15797();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f18475;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15788(int i) {
        C20554 c20554 = this.f18464;
        C20782.m47566(c20554);
        c20554.m47121(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15795() {
        C20554 c20554 = this.f18464;
        C20782.m47566(c20554);
        return c20554.m47119();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC19533 interfaceC19533 = this.f18470;
        if (interfaceC19533 != null && interfaceC19533.mo21703(16) && this.f18470.mo23542()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C12921 c12921 = this.f18478;
        if (z && m15779() && !c12921.m32075()) {
            m15767(true);
            return true;
        }
        if ((m15779() && c12921.m32066(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m15767(true);
            return true;
        }
        if (z && m15779()) {
            m15767(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m15794() {
        C12921 c12921 = this.f18478;
        return c12921 != null && c12921.m32075();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m15792() {
        boolean zM15786 = m15786();
        if (m15779()) {
            int i = zM15786 ? 0 : this.f18460;
            C12921 c12921 = this.f18478;
            c12921.m32062(i);
            c12921.m32060();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15797() {
        C12921 c12921 = this.f18478;
        if (c12921 != null) {
            c12921.m32073();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15793() {
        C12921 c12921 = this.f18478;
        C20782.m47566(c12921);
        c12921.m32067();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15796(boolean z) {
        C12921 c12921 = this.f18478;
        C20782.m47566(c12921);
        c12921.m32074(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15790(boolean z) {
        C12921 c12921 = this.f18478;
        C20782.m47566(c12921);
        c12921.m32065(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FrameLayout m15787() {
        return this.f18473;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11208 m15791() {
        return this.f18483;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m15774();
        return super.performClick();
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m15779() || this.f18470 == null) {
            return false;
        }
        m15767(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private boolean m15779() {
        if (!this.f18474) {
            return false;
        }
        C20782.m47566(this.f18478);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m15774() {
        if (!m15779() || this.f18470 == null) {
            return;
        }
        C12921 c12921 = this.f18478;
        if (!c12921.m32075()) {
            m15767(true);
        } else if (this.f18466) {
            c12921.m32073();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15767(boolean z) {
        if (!(m15769() && this.f18458) && m15779()) {
            C12921 c12921 = this.f18478;
            boolean z2 = c12921.m32075() && c12921.m32061() <= 0;
            boolean zM15786 = m15786();
            if ((z || z2 || zM15786) && m15779()) {
                c12921.m32062(zM15786 ? 0 : this.f18460);
                c12921.m32060();
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m15786() {
        InterfaceC19533 interfaceC19533 = this.f18470;
        if (interfaceC19533 == null) {
            return true;
        }
        int iMo23580 = interfaceC19533.mo23580();
        if (!this.f18467) {
            return false;
        }
        if (this.f18470.mo21703(17) && this.f18470.mo23565().m55264()) {
            return false;
        }
        if (iMo23580 != 1 && iMo23580 != 4) {
            InterfaceC19533 interfaceC19534 = this.f18470;
            interfaceC19534.getClass();
            if (interfaceC19534.mo23570()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m15769() {
        InterfaceC19533 interfaceC19533 = this.f18470;
        return interfaceC19533 != null && interfaceC19533.mo21703(16) && this.f18470.mo23542() && this.f18470.mo23570();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m15782(boolean z) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC19533 interfaceC19533 = this.f18470;
        boolean zM15762 = false;
        boolean z2 = (interfaceC19533 == null || !interfaceC19533.mo21703(30) || interfaceC19533.mo23568().m30249()) ? false : true;
        boolean z3 = this.f18482;
        ImageView imageView = this.f18480;
        View view = this.f18469;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m15756();
        }
        if (z2) {
            InterfaceC19533 interfaceC19534 = this.f18470;
            boolean z4 = interfaceC19534 != null && interfaceC19534.mo21703(30) && interfaceC19534.mo23568().m30250(2);
            boolean zM15765 = m15765();
            if (!z4 && !zM15765) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m15756();
            }
            ImageView imageView2 = this.f18468;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM15765 && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m15758();
                }
            } else if (z4 && !zM15765 && z5) {
                m15756();
            }
            if (!z4 && !zM15765 && this.f18472 != 0) {
                C20782.m47566(imageView);
                if (interfaceC19533 != null && interfaceC19533.mo21703(18) && (bArr = interfaceC19533.mo23571().f2698) != null) {
                    zM15762 = m15762(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM15762 || m15762(this.f18465)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m15762(Drawable drawable) {
        ImageView imageView = this.f18480;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f18472 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                C20554 c20554 = this.f18464;
                if (c20554 != null) {
                    c20554.m47120(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean m15765() {
        InterfaceC19533 interfaceC19533 = this.f18470;
        return interfaceC19533 != null && this.f18481 != null && interfaceC19533.mo21703(30) && interfaceC19533.mo23568().m30250(4);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m15758() {
        Drawable drawable;
        C20554 c20554;
        ImageView imageView = this.f18468;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f18461 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (c20554 = this.f18464) != null) {
            c20554.m47120(width);
        }
        imageView.setScaleType(scaleType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m15756() {
        ImageView imageView = this.f18468;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m15764(C5243 c5243) {
        ImageView imageView = c5243.f18468;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15760(C5243 c5243, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c5243.getResources(), bitmap);
        ImageView imageView = c5243.f18468;
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
            c5243.m15758();
        }
        InterfaceC19533 interfaceC19533 = c5243.f18470;
        if (interfaceC19533 != null && interfaceC19533.mo21703(30) && interfaceC19533.mo23568().m30250(2)) {
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            c5243.m15758();
        }
        View view = c5243.f18469;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m15772() {
        boolean z;
        View view = this.f18477;
        if (view != null) {
            InterfaceC19533 interfaceC19533 = this.f18470;
            if (interfaceC19533 == null || interfaceC19533.mo23580() != 2) {
                z = false;
            } else {
                z = true;
                int i = this.f18459;
                if (i != 2 && (i != 1 || !this.f18470.mo23570())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m15784(C5243 c5243) {
        TextView textView = c5243.f18463;
        if (textView != null) {
            InterfaceC19533 interfaceC19533 = c5243.f18470;
            if (interfaceC19533 != null) {
                interfaceC19533.mo23569();
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m15783() {
        C12921 c12921 = this.f18478;
        if (c12921 == null || !this.f18474) {
            setContentDescription(null);
        } else if (c12921.m32075()) {
            setContentDescription(this.f18466 ? getResources().getString(R.string.MT_Protector) : null);
        } else {
            setContentDescription(getResources().getString(R.string.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m15773(C5243 c5243) {
        if (c5243.m15769() && c5243.f18458) {
            c5243.m15797();
        } else {
            c5243.m15767(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m15776() {
        InterfaceC19533 interfaceC19533 = this.f18470;
        C18787 c18787Mo23541 = interfaceC19533 != null ? interfaceC19533.mo23541() : C18787.f61010;
        int i = c18787Mo23541.f61012;
        int i2 = c18787Mo23541.f61011;
        float f = this.f18476 ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * c18787Mo23541.f61013) / i2;
        C20554 c20554 = this.f18464;
        if (c20554 != null) {
            c20554.m47120(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
