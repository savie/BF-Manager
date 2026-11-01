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

/* JADX INFO: renamed from: l.ᩴ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes4.dex */
public class C18615 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f59222;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10161 f59223;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable f59224;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f59225;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Class f59226;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f59227;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f59228;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Handler f59229;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f59230;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final View f59231;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f59232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f59233;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f59234;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23597 f59235;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Method f59236;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Object f59237;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f59238;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final View f59239;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f59240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC21437 f59241;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7409 f59242;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f59243;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f59244;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f59245;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f59246;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C19321 f59247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f59248;

    public C18615(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18615(Context context, AttributeSet attributeSet, int i) {
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
        Class<InterfaceC17693> cls;
        Object objNewProxyInstance;
        Method method;
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        super(context, attributeSet, i);
        ViewOnClickListenerC21437 viewOnClickListenerC21437 = new ViewOnClickListenerC21437(this);
        this.f59241 = viewOnClickListenerC21437;
        this.f59229 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f59235 = null;
            this.f59231 = null;
            this.f59239 = null;
            this.f59245 = false;
            this.f59234 = null;
            this.f59244 = null;
            this.f59247 = null;
            this.f59222 = null;
            this.f59232 = null;
            this.f59242 = null;
            this.f59246 = null;
            this.f59226 = null;
            this.f59236 = null;
            this.f59237 = null;
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
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1981.f7429, i, 0);
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
                this.f59225 = typedArrayObtainStyledAttributes.getBoolean(16, this.f59225);
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
        C23597 c23597 = (C23597) findViewById(R.id.MT_Protector);
        this.f59235 = c23597;
        if (c23597 != null) {
            c23597.m52026(i6);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f59231 = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (c23597 != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f59239 = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = C0435.f2014;
                        this.f59239 = (View) C0435.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 == 4) {
                    try {
                        int i17 = C20546.f66542;
                        this.f59239 = (View) C20546.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        C15088.m36163(surfaceView);
                    }
                    this.f59239 = surfaceView;
                }
                this.f59239.setLayoutParams(layoutParams);
                this.f59239.setOnClickListener(viewOnClickListenerC21437);
                this.f59239.setClickable(false);
                c23597.addView(this.f59239, 0);
            }
            z7 = false;
            this.f59239.setLayoutParams(layoutParams);
            this.f59239.setOnClickListener(viewOnClickListenerC21437);
            this.f59239.setClickable(false);
            c23597.addView(this.f59239, 0);
        } else {
            this.f59239 = null;
            z7 = false;
        }
        this.f59245 = z7;
        this.f59246 = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f59234 = (ImageView) findViewById(R.id.MT_Protector);
        this.f59228 = i10;
        try {
            cls = InterfaceC17693.class;
            method = cls.getMethod("ۙ", InterfaceC15142.class);
            objNewProxyInstance = Proxy.newProxyInstance(InterfaceC15142.class.getClassLoader(), new Class[]{InterfaceC15142.class}, new InvocationHandler() { // from class: l.ۜ۟ܰ
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    C18615.m43024(this.f22319, method2, objArr);
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f59226 = cls;
        this.f59236 = method;
        this.f59237 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f59244 = imageView2;
        this.f59240 = (!z || i4 == 0 || imageView2 == null) ? 0 : i4;
        if (i9 != 0) {
            this.f59224 = C10405.m26304(getContext(), i9);
        }
        C19321 c19321 = (C19321) findViewById(R.id.MT_Protector);
        this.f59247 = c19321;
        if (c19321 != null) {
            boolean zIsInEditMode = c19321.isInEditMode();
            C1723 c1723 = C1723.f6825;
            if (!zIsInEditMode && (captioningManager2 = (CaptioningManager) c19321.getContext().getSystemService("captioning")) != null && captioningManager2.isEnabled()) {
                CaptioningManager.CaptionStyle userStyle = captioningManager2.getUserStyle();
                c1723 = new C1723(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
            }
            c19321.m44304(c1723);
            float fontScale = 1.0f;
            if (!c19321.isInEditMode() && (captioningManager = (CaptioningManager) c19321.getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                fontScale = captioningManager.getFontScale();
            }
            c19321.m44302(fontScale * 0.0533f);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f59222 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f59227 = i2;
        TextView textView = (TextView) findViewById(R.id.MT_Protector);
        this.f59232 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C7409 c7409 = (C7409) findViewById(R.id.MT_Protector);
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        if (c7409 != null) {
            this.f59242 = c7409;
        } else if (viewFindViewById3 != null) {
            C7409 c74010 = new C7409(context, null, 0, attributeSet);
            this.f59242 = c74010;
            c74010.setId(R.id.MT_Protector);
            c74010.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c74010, iIndexOfChild);
        } else {
            this.f59242 = null;
        }
        C7409 c74011 = this.f59242;
        this.f59238 = c74011 != null ? i5 : 0;
        this.f59248 = z2;
        this.f59230 = z3;
        this.f59233 = z4;
        this.f59243 = z6 && c74011 != null;
        if (c74011 != null) {
            c74011.m19831();
            this.f59242.m19826(this.f59241);
        }
        if (z6) {
            setClickable(true);
        }
        m43041();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43024(C18615 c18615, Method method, Object[] objArr) {
        if (method.getName().equals("onImageAvailable")) {
            c18615.f59229.post(new RunnableC22849(0, c18615, (Bitmap) objArr[1]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43053(InterfaceC10161 interfaceC10161) {
        C2023.m6510(Looper.myLooper() == Looper.getMainLooper());
        C2023.m6507(interfaceC10161 == null || interfaceC10161.mo25830() == Looper.getMainLooper());
        InterfaceC10161 interfaceC10162 = this.f59223;
        if (interfaceC10162 == interfaceC10161) {
            return;
        }
        Method method = this.f59236;
        Class cls = this.f59226;
        View view = this.f59239;
        ViewOnClickListenerC21437 viewOnClickListenerC21437 = this.f59241;
        if (interfaceC10162 != null) {
            interfaceC10162.mo25818(viewOnClickListenerC21437);
            if (interfaceC10162.mo25841(27)) {
                if (view instanceof TextureView) {
                    interfaceC10162.mo25838((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC10162.mo25837((SurfaceView) view);
                }
            }
            if (cls != null && cls.isAssignableFrom(interfaceC10162.getClass())) {
                try {
                    method.getClass();
                    method.invoke(interfaceC10162, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        C19321 c19321 = this.f59247;
        if (c19321 != null) {
            c19321.m44303((List) null);
        }
        this.f59223 = interfaceC10161;
        if (m43043()) {
            this.f59242.m19825(interfaceC10161);
        }
        m43039();
        TextView textView = this.f59232;
        if (textView != null) {
            InterfaceC10161 interfaceC10163 = this.f59223;
            if (interfaceC10163 != null) {
                interfaceC10163.mo25852();
            }
            textView.setVisibility(8);
        }
        m43020(true);
        if (interfaceC10161 != null) {
            AbstractC22465 abstractC22465 = (AbstractC22465) interfaceC10161;
            if (abstractC22465.mo25841(27)) {
                if (view instanceof TextureView) {
                    interfaceC10161.mo25815((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC10161.mo25814((SurfaceView) view);
                }
                if (!abstractC22465.mo25841(30) || interfaceC10161.mo25847().m24214()) {
                    m43044();
                }
            }
            if (c19321 != null && abstractC22465.mo25841(28)) {
                c19321.m44303(interfaceC10161.mo25848().f53889);
            }
            interfaceC10161.mo25839(viewOnClickListenerC21437);
            if (cls != null && cls.isAssignableFrom(interfaceC10161.getClass())) {
                try {
                    method.getClass();
                    Object obj = this.f59237;
                    obj.getClass();
                    method.invoke(interfaceC10161, obj);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
            m43033(false);
            return;
        }
        m43050();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f59239;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43052(int i) {
        C23597 c23597 = this.f59235;
        C2023.m6508(c23597);
        c23597.m52026(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43057() {
        C23597 c23597 = this.f59235;
        C2023.m6508(c23597);
        return c23597.m52024();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC10161 interfaceC10161 = this.f59223;
        if (interfaceC10161 != null && interfaceC10161.mo25841(16) && this.f59223.mo25811()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C7409 c7409 = this.f59242;
        if (z && m43043() && !c7409.m19821()) {
            m43033(true);
            return true;
        }
        if ((m43043() && c7409.m19828(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m43033(true);
            return true;
        }
        if (z && m43043()) {
            m43033(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m43055() {
        C7409 c7409 = this.f59242;
        return c7409 != null && c7409.m19821();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m43049() {
        boolean zM43048 = m43048();
        if (m43043()) {
            int i = zM43048 ? 0 : this.f59238;
            C7409 c7409 = this.f59242;
            c7409.m19824(i);
            c7409.m19822();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43050() {
        C7409 c7409 = this.f59242;
        if (c7409 != null) {
            c7409.m19833();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m43059() {
        C7409 c7409 = this.f59242;
        C2023.m6508(c7409);
        c7409.m19832();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43058(boolean z) {
        C7409 c7409 = this.f59242;
        C2023.m6508(c7409);
        c7409.m19834(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43054(boolean z) {
        C7409 c7409 = this.f59242;
        C2023.m6508(c7409);
        c7409.m19827(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FrameLayout m43051() {
        return this.f59246;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19321 m43056() {
        return this.f59247;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m43037();
        return super.performClick();
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m43043() || this.f59223 == null) {
            return false;
        }
        m43033(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private boolean m43043() {
        if (!this.f59243) {
            return false;
        }
        C2023.m6508(this.f59242);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m43037() {
        if (!m43043() || this.f59223 == null) {
            return;
        }
        C7409 c7409 = this.f59242;
        if (!c7409.m19821()) {
            m43033(true);
        } else if (this.f59248) {
            c7409.m19833();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m43033(boolean z) {
        if (!(m43029() && this.f59233) && m43043()) {
            C7409 c7409 = this.f59242;
            boolean z2 = c7409.m19821() && c7409.m19823() <= 0;
            boolean zM43048 = m43048();
            if ((z || z2 || zM43048) && m43043()) {
                c7409.m19824(zM43048 ? 0 : this.f59238);
                c7409.m19822();
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m43048() {
        InterfaceC10161 interfaceC10161 = this.f59223;
        if (interfaceC10161 == null) {
            return true;
        }
        int iMo25808 = interfaceC10161.mo25808();
        if (!this.f59230) {
            return false;
        }
        if (this.f59223.mo25841(17) && this.f59223.mo25828().m38828()) {
            return false;
        }
        if (iMo25808 != 1 && iMo25808 != 4) {
            InterfaceC10161 interfaceC10162 = this.f59223;
            interfaceC10162.getClass();
            if (interfaceC10162.mo25806()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m43029() {
        InterfaceC10161 interfaceC10161 = this.f59223;
        return interfaceC10161 != null && interfaceC10161.mo25841(16) && this.f59223.mo25811() && this.f59223.mo25806();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m43020(boolean z) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC10161 interfaceC10161 = this.f59223;
        boolean zM43025 = false;
        boolean z2 = (interfaceC10161 == null || !interfaceC10161.mo25841(30) || interfaceC10161.mo25847().m24215()) ? false : true;
        boolean z3 = this.f59225;
        ImageView imageView = this.f59244;
        View view = this.f59231;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m43021();
        }
        if (z2) {
            InterfaceC10161 interfaceC10162 = this.f59223;
            boolean z4 = interfaceC10162 != null && interfaceC10162.mo25841(30) && interfaceC10162.mo25847().m24216(2);
            boolean zM43035 = m43035();
            if (!z4 && !zM43035) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m43021();
            }
            ImageView imageView2 = this.f59234;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM43035 && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m43030();
                }
            } else if (z4 && !zM43035 && z5) {
                m43021();
            }
            if (!z4 && !zM43035 && this.f59240 != 0) {
                C2023.m6508(imageView);
                if (interfaceC10161 != null && interfaceC10161.mo25841(18) && (bArr = interfaceC10161.mo25823().f18082) != null) {
                    zM43025 = m43025(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM43025 || m43025(this.f59224)) {
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
    private boolean m43025(Drawable drawable) {
        ImageView imageView = this.f59244;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f59240 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                C23597 c23597 = this.f59235;
                if (c23597 != null) {
                    c23597.m52025(width);
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
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m43035() {
        InterfaceC10161 interfaceC10161 = this.f59223;
        return interfaceC10161 != null && this.f59237 != null && interfaceC10161.mo25841(30) && interfaceC10161.mo25847().m24216(4);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m43030() {
        Drawable drawable;
        C23597 c23597;
        ImageView imageView = this.f59234;
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
        if (this.f59228 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (c23597 = this.f59235) != null) {
            c23597.m52025(width);
        }
        imageView.setScaleType(scaleType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m43021() {
        ImageView imageView = this.f59234;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m43034(C18615 c18615) {
        ImageView imageView = c18615.f59234;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43023(C18615 c18615, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c18615.getResources(), bitmap);
        ImageView imageView = c18615.f59234;
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
            c18615.m43030();
        }
        InterfaceC10161 interfaceC10161 = c18615.f59223;
        if (interfaceC10161 != null && interfaceC10161.mo25841(30) && interfaceC10161.mo25847().m24216(2)) {
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            c18615.m43030();
        }
        View view = c18615.f59231;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m43039() {
        boolean z;
        View view = this.f59222;
        if (view != null) {
            InterfaceC10161 interfaceC10161 = this.f59223;
            if (interfaceC10161 == null || interfaceC10161.mo25808() != 2) {
                z = false;
            } else {
                z = true;
                int i = this.f59227;
                if (i != 2 && (i != 1 || !this.f59223.mo25806())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m43042(C18615 c18615) {
        TextView textView = c18615.f59232;
        if (textView != null) {
            InterfaceC10161 interfaceC10161 = c18615.f59223;
            if (interfaceC10161 != null) {
                interfaceC10161.mo25852();
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m43041() {
        C7409 c7409 = this.f59242;
        if (c7409 == null || !this.f59243) {
            setContentDescription(null);
        } else if (c7409.m19821()) {
            setContentDescription(this.f59248 ? getResources().getString(R.string.MT_Protector) : null);
        } else {
            setContentDescription(getResources().getString(R.string.MT_Protector));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m43040(C18615 c18615) {
        if (c18615.m43029() && c18615.f59233) {
            c18615.m43050();
        } else {
            c18615.m43033(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m43044() {
        InterfaceC10161 interfaceC10161 = this.f59223;
        C13314 c13314Mo25831 = interfaceC10161 != null ? interfaceC10161.mo25831() : C13314.f44192;
        int i = c13314Mo25831.f44194;
        int i2 = c13314Mo25831.f44193;
        float f = this.f59245 ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * c13314Mo25831.f44195) / i2;
        C23597 c23597 = this.f59235;
        if (c23597 != null) {
            c23597.m52025(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
