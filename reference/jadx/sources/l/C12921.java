package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.۫ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public class C12921 extends FrameLayout {

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public static final float[] f41310;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f41311;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19533 f41312;

    /* JADX INFO: renamed from: ֡᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15683 f41313;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Method f41314;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41315;

    /* JADX INFO: renamed from: ֨᩷, reason: not valid java name and contains not printable characters */
    public final RunnableC4773 f41316;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41317;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public final C25227 f41318;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9191 f41319;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41320;

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    public final C11328 f41321;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f41322;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final String f41323;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41324;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final String f41325;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long[] f41326;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f41327;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String f41328;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final View f41329;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C1634 f41330;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public final ImageView f41331;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f41332;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41333;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float f41334;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f41335;

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public int f41336;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f41337;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final String f41338;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Method f41339;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final String f41340;

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f41341;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Class f41342;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final String f41343;

    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public final C22810 f41344;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final View f41345;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public final View f41346;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final String f41347;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final PopupWindow f41348;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41349;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public final String f41350;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41351;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public final C7129 f41352;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Class f41353;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41354;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long[] f41355;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C9365 f41356;

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f41357;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Formatter f41358;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final Method f41359;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Method f41360;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public final ImageView f41361;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f41362;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41363;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f41364;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public int f41365;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19062 f41366;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f41367;

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final C21872 f41368;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC10111 f41369;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41370;

    /* JADX INFO: renamed from: ᩳ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41371;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f41372;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public boolean f41373;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41374;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f41375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f41376;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final View f41377;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public final String f41378;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f41379;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final Resources f41380;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f41381;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final TextView f41382;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f41383;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f41384;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41385;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f41386;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f41387;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public final int f41388;

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32063(InterfaceC15158 interfaceC15158) {
        interfaceC15158.getClass();
        this.f41341.add(interfaceC15158);
    }

    static {
        C21616.m49139("media3.ui");
        f41310 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C12921(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12921(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C12921(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws NoSuchMethodException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z8;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls;
        Method method5;
        boolean z9;
        TextView textView;
        super(context, attributeSet, i);
        Class<?> cls2 = Boolean.TYPE;
        this.f41363 = true;
        this.f41365 = OpenAuthTask.Duplex;
        this.f41327 = 0;
        this.f41336 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C12445.f40001, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.MT_Protector);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.MT_Protector);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.MT_Protector);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.MT_Protector);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.MT_Protector);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.MT_Protector);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.MT_Protector);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.MT_Protector);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.MT_Protector);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.MT_Protector);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.MT_Protector);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.MT_Protector);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.MT_Protector);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.MT_Protector);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.MT_Protector);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.MT_Protector);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.MT_Protector);
                this.f41365 = typedArrayObtainStyledAttributes.getInt(32, this.f41365);
                this.f41327 = typedArrayObtainStyledAttributes.getInt(19, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.f41371 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                this.f41336 = C7116.m19460(typedArrayObtainStyledAttributes.getInt(38, this.f41336), 16, 1000);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i10 = resourceId10;
                z = z17;
                i12 = resourceId3;
                i13 = resourceId4;
                i14 = resourceId5;
                i15 = resourceId6;
                i16 = resourceId7;
                i17 = resourceId8;
                i18 = resourceId9;
                z8 = z14;
                i2 = resourceId12;
                i8 = resourceId13;
                i3 = resourceId14;
                i4 = resourceId16;
                i9 = resourceId17;
                z2 = z10;
                z3 = z11;
                z4 = z12;
                z5 = z13;
                i7 = resourceId;
                z6 = z15;
                z7 = z16;
                i11 = resourceId2;
                i6 = resourceId11;
                i5 = resourceId15;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = R.drawable.MT_Protector;
            i3 = R.drawable.MT_Protector;
            i4 = R.drawable.MT_Protector;
            i5 = R.drawable.MT_Protector;
            i6 = R.drawable.MT_Protector;
            i7 = R.layout.MT_Protector;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
            i8 = R.drawable.MT_Protector;
            i9 = R.drawable.MT_Protector;
            i10 = R.drawable.MT_Protector;
            z6 = false;
            z7 = false;
            i11 = R.drawable.MT_Protector;
            i12 = R.drawable.MT_Protector;
            i13 = R.drawable.MT_Protector;
            i14 = R.drawable.MT_Protector;
            i15 = R.drawable.MT_Protector;
            i16 = R.drawable.MT_Protector;
            i17 = R.drawable.MT_Protector;
            i18 = R.drawable.MT_Protector;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(262144);
        this.f41369 = new ViewOnClickListenerC10111(this);
        this.f41341 = new CopyOnWriteArrayList();
        this.f41330 = new C1634();
        this.f41321 = new C11328();
        StringBuilder sb = new StringBuilder();
        this.f41372 = sb;
        boolean z18 = z;
        this.f41358 = new Formatter(sb, Locale.getDefault());
        this.f41355 = new long[0];
        this.f41367 = new boolean[0];
        this.f41326 = new long[0];
        this.f41379 = new boolean[0];
        this.f41316 = new RunnableC4773(1, this);
        try {
            Method method6 = InterfaceC5054.class.getMethod("ۤ", cls2);
            try {
                method2 = InterfaceC5054.class.getMethod("ܰ", null);
                method = method6;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = method6;
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f41353 = InterfaceC5054.class;
        this.f41359 = method;
        this.f41360 = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method4 = cls.getMethod("setScrubbingModeEnabled", cls2);
                method3 = null;
                try {
                    method5 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method5 = method3;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
                method4 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method3 = null;
            method4 = null;
            cls = null;
        }
        this.f41342 = cls;
        this.f41339 = method4;
        this.f41314 = method5;
        this.f41332 = (TextView) findViewById(R.id.MT_Protector);
        this.f41335 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f41331 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f41369);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41351 = imageView2;
        int i19 = 1;
        ViewOnClickListenerC15677 viewOnClickListenerC15677 = new ViewOnClickListenerC15677(i19, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC15677);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41383 = imageView3;
        ViewOnClickListenerC15677 viewOnClickListenerC15678 = new ViewOnClickListenerC15677(i19, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC15678);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f41329 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f41369);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f41377 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f41369);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f41376 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f41369);
        }
        InterfaceC15683 interfaceC15683 = (InterfaceC15683) findViewById(R.id.MT_Protector);
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        if (interfaceC15683 != null) {
            this.f41313 = interfaceC15683;
            textView = null;
            z9 = z18;
        } else if (viewFindViewById4 != null) {
            z9 = z18;
            C4146 c4146 = new C4146(context, null, 0, attributeSet2, R.style.MT_Protector);
            c4146.setId(R.id.MT_Protector);
            c4146.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c4146, iIndexOfChild);
            this.f41313 = c4146;
            textView = null;
        } else {
            z9 = z18;
            textView = null;
            this.f41313 = null;
        }
        InterfaceC15683 interfaceC15684 = this.f41313;
        if (interfaceC15684 != null) {
            interfaceC15684.mo13285(this.f41369);
        }
        Resources resources = context.getResources();
        this.f41380 = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41324 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f41369);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41370 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView5.setOnClickListener(this.f41369);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41374 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            imageView6.setOnClickListener(this.f41369);
        }
        Typeface typefaceM24394 = C9217.m24394(context, R.font.MT_Protector);
        ImageView imageView7 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f41346 = imageView7;
            this.f41382 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM24394);
            this.f41382 = textView2;
            this.f41346 = textView2;
        } else {
            this.f41382 = textView;
            this.f41346 = textView;
        }
        View view = this.f41346;
        if (view != null) {
            view.setOnClickListener(this.f41369);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            this.f41345 = imageView8;
            this.f41381 = null;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceM24394);
            this.f41381 = textView3;
            this.f41345 = textView3;
        } else {
            this.f41381 = null;
            this.f41345 = null;
        }
        View view2 = this.f41345;
        if (view2 != null) {
            view2.setOnClickListener(this.f41369);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41354 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f41369);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.MT_Protector);
        this.f41361 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f41369);
        }
        this.f41334 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f41311 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.MT_Protector);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            m32006((View) imageView11, false);
        }
        C9191 c9191 = new C9191(this);
        this.f41319 = c9191;
        c9191.m24346(z9);
        C7129 c7129 = new C7129(this, new String[]{resources.getString(R.string.MT_Protector), resources.getString(R.string.MT_Protector)}, new Drawable[]{resources.getDrawable(R.drawable.MT_Protector, context.getTheme()), resources.getDrawable(R.drawable.MT_Protector, context.getTheme())});
        this.f41352 = c7129;
        this.f41388 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
        C25227 c25227 = (C25227) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f41318 = c25227;
        c25227.setAdapter(c7129);
        c25227.setLayoutManager(new C0067(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) c25227, -2, -2, true);
        this.f41348 = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(this.f41369);
        this.f41322 = true;
        this.f41344 = new C22810(getResources());
        this.f41357 = resources.getDrawable(i5, context.getTheme());
        this.f41386 = resources.getDrawable(i4, context.getTheme());
        this.f41378 = resources.getString(R.string.MT_Protector);
        this.f41325 = resources.getString(R.string.MT_Protector);
        this.f41368 = new C21872(this);
        this.f41366 = new C19062(this);
        this.f41356 = new C9365(this, resources.getStringArray(R.array.MT_Protector), f41310);
        this.f41385 = resources.getDrawable(i11, context.getTheme());
        this.f41349 = resources.getDrawable(i12, context.getTheme());
        this.f41387 = resources.getDrawable(i17, context.getTheme());
        this.f41317 = resources.getDrawable(i18, context.getTheme());
        this.f41320 = resources.getDrawable(i10, context.getTheme());
        this.f41333 = resources.getDrawable(i6, context.getTheme());
        this.f41315 = resources.getDrawable(i2, context.getTheme());
        this.f41375 = resources.getDrawable(i8, context.getTheme());
        this.f41384 = resources.getDrawable(i3, context.getTheme());
        this.f41347 = resources.getString(R.string.MT_Protector);
        this.f41328 = resources.getString(R.string.MT_Protector);
        this.f41340 = resources.getString(R.string.MT_Protector);
        this.f41338 = resources.getString(R.string.MT_Protector);
        this.f41343 = resources.getString(R.string.MT_Protector);
        this.f41350 = resources.getString(R.string.MT_Protector);
        this.f41323 = resources.getString(R.string.MT_Protector);
        c9191.m24345(findViewById(R.id.MT_Protector), true);
        c9191.m24345(this.f41345, z3);
        c9191.m24345(this.f41346, z2);
        c9191.m24345(imageView5, z4);
        c9191.m24345(imageView6, z5);
        c9191.m24345(imageView10, z8);
        c9191.m24345(imageView, z6);
        c9191.m24345(imageView11, z7);
        c9191.m24345(imageView9, this.f41327 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֡ۨ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                C12921.m32010(this.f1963, view3, i20, i21, i22, i23, i24, i25, i26, i27);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32064(InterfaceC19533 interfaceC19533) {
        C20782.m47568(Looper.myLooper() == Looper.getMainLooper());
        C20782.m47565(interfaceC19533 == null || interfaceC19533.mo23557() == Looper.getMainLooper());
        InterfaceC19533 interfaceC19534 = this.f41312;
        if (interfaceC19534 == interfaceC19533) {
            return;
        }
        ViewOnClickListenerC10111 viewOnClickListenerC10111 = this.f41369;
        if (interfaceC19534 != null) {
            interfaceC19534.mo23552(viewOnClickListenerC10111);
        }
        this.f41312 = interfaceC19533;
        if (interfaceC19533 != null) {
            interfaceC19533.mo23577(viewOnClickListenerC10111);
        }
        m32069();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32074(boolean z) {
        this.f41319.m24345(this.f41346, z);
        m32059();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32065(boolean z) {
        this.f41319.m24345(this.f41345, z);
        m32059();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32061() {
        return this.f41365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32062(int i) {
        this.f41365 = i;
        C9191 c9191 = this.f41319;
        if (c9191.m24349()) {
            c9191.m24350();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m32067() {
        this.f41319.m24346(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32060() {
        this.f41319.m24348();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32073() {
        this.f41319.m24343();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m32068() {
        this.f41319.m24353();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m32075() {
        return this.f41319.m24349();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m32072() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32071() {
        for (InterfaceC15158 interfaceC15158 : this.f41341) {
            getVisibility();
            interfaceC15158.mo19256();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32069() {
        m32039();
        m32059();
        m32037();
        m32003();
        m32029();
        InterfaceC19533 interfaceC19533 = this.f41312;
        if (interfaceC19533 != null) {
            float f = interfaceC19533.mo23563().f24500;
            C9365 c9365 = this.f41356;
            c9365.m24678(f);
            String strM24677 = c9365.m24677();
            C7129 c7129 = this.f41352;
            c7129.m19527(0, strM24677);
            m32006(this.f41329, c7129.m19528());
        }
        m32047();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m32039() {
        ImageView imageView;
        boolean z;
        if (m32072() && this.f41362 && (imageView = this.f41324) != null) {
            boolean zM19491 = C7116.m19491(this.f41312, this.f41363);
            Drawable drawable = zM19491 ? this.f41385 : this.f41349;
            int i = zM19491 ? R.string.MT_Protector : R.string.MT_Protector;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f41380.getString(i));
            InterfaceC19533 interfaceC19533 = this.f41312;
            if (interfaceC19533 != null) {
                z = true;
                if (!interfaceC19533.mo21703(1) || (interfaceC19533.mo21703(17) && interfaceC19533.mo23565().m55264())) {
                    z = false;
                }
            } else {
                z = false;
            }
            m32006(imageView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m32059() {
        boolean zMo21703;
        boolean zMo21704;
        boolean zMo21705;
        boolean zMo21706;
        boolean zMo21707;
        if (m32072() && this.f41362) {
            InterfaceC19533 interfaceC19533 = this.f41312;
            if (interfaceC19533 != null) {
                zMo21704 = interfaceC19533.mo21703(5);
                zMo21705 = interfaceC19533.mo21703(7);
                zMo21706 = interfaceC19533.mo21703(11);
                zMo21707 = interfaceC19533.mo21703(12);
                zMo21703 = interfaceC19533.mo21703(9);
            } else {
                zMo21703 = false;
                zMo21704 = false;
                zMo21705 = false;
                zMo21706 = false;
                zMo21707 = false;
            }
            Resources resources = this.f41380;
            View view = this.f41346;
            if (zMo21706) {
                InterfaceC19533 interfaceC19534 = this.f41312;
                int iMo23567 = (int) ((interfaceC19534 != null ? interfaceC19534.mo23567() : 5000L) / 1000);
                TextView textView = this.f41382;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo23567));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo23567, Integer.valueOf(iMo23567)));
                }
            }
            View view2 = this.f41345;
            if (zMo21707) {
                InterfaceC19533 interfaceC19535 = this.f41312;
                int iMo23560 = (int) ((interfaceC19535 != null ? interfaceC19535.mo23560() : 15000L) / 1000);
                TextView textView2 = this.f41381;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo23560));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo23560, Integer.valueOf(iMo23560)));
                }
            }
            m32006(this.f41370, zMo21705);
            m32006(view, zMo21706);
            m32006(view2, zMo21707);
            m32006(this.f41374, zMo21703);
            InterfaceC15683 interfaceC15683 = this.f41313;
            if (interfaceC15683 != null) {
                interfaceC15683.setEnabled(zMo21704);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m32037() {
        ImageView imageView;
        if (m32072() && this.f41362 && (imageView = this.f41354) != null) {
            if (this.f41327 == 0) {
                m32006((View) imageView, false);
                return;
            }
            InterfaceC19533 interfaceC19533 = this.f41312;
            String str = this.f41340;
            Drawable drawable = this.f41320;
            if (interfaceC19533 == null || !interfaceC19533.mo21703(15)) {
                m32006((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m32006((View) imageView, true);
            int iMo23556 = interfaceC19533.mo23556();
            if (iMo23556 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo23556 == 1) {
                imageView.setImageDrawable(this.f41333);
                imageView.setContentDescription(this.f41338);
            } else {
                if (iMo23556 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f41315);
                imageView.setContentDescription(this.f41343);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m32003() {
        ImageView imageView;
        if (m32072() && this.f41362 && (imageView = this.f41361) != null) {
            InterfaceC19533 interfaceC19533 = this.f41312;
            if (!this.f41319.m24347(imageView)) {
                m32006((View) imageView, false);
                return;
            }
            String str = this.f41323;
            Drawable drawable = this.f41384;
            if (interfaceC19533 == null || !interfaceC19533.mo21703(14)) {
                m32006((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m32006((View) imageView, true);
            if (interfaceC19533.mo23555()) {
                drawable = this.f41375;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC19533.mo23555()) {
                str = this.f41350;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m32029() {
        C21872 c21872 = this.f41368;
        c21872.getClass();
        List list = Collections.EMPTY_LIST;
        c21872.f63262 = list;
        C19062 c19062 = this.f41366;
        c19062.getClass();
        c19062.f63262 = list;
        InterfaceC19533 interfaceC19533 = this.f41312;
        ImageView imageView = this.f41331;
        if (interfaceC19533 != null && interfaceC19533.mo21703(30) && this.f41312.mo21703(29)) {
            C12074 c12074Mo23568 = this.f41312.mo23568();
            c19062.m44166(m32005(c12074Mo23568, 1));
            if (this.f41319.m24347(imageView)) {
                c21872.m49565(m32005(c12074Mo23568, 3));
            } else {
                c21872.m49565(AbstractC1928.of());
            }
        }
        m32006(imageView, c21872.getItemCount() > 0);
        m32006(this.f41329, this.f41352.m19528());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1928 m32005(C12074 c12074, int i) {
        C22811 c22811 = new C22811();
        AbstractC1928 abstractC1928M30246 = c12074.m30246();
        for (int i2 = 0; i2 < abstractC1928M30246.size(); i2++) {
            C20279 c20279 = (C20279) abstractC1928M30246.get(i2);
            if (c20279.m46543() == i) {
                for (int i3 = 0; i3 < c20279.f65101; i3++) {
                    if (c20279.m46541(i3, false)) {
                        C15648 c15648M46539 = c20279.m46539(i3);
                        if ((c15648M46539.f50850 & 2) == 0) {
                            c22811.m19807(new C10683(c12074, i2, i3, this.f41344.m51440(c15648M46539)));
                        }
                    }
                }
            }
        }
        return c22811.m51441();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m32047() {
        AbstractC24755 abstractC24755Mo23565;
        long jM19474;
        int i;
        long j;
        int i2;
        boolean z;
        boolean z2;
        InterfaceC19533 interfaceC19533 = this.f41312;
        if (interfaceC19533 == null) {
            return;
        }
        long j2 = 0;
        this.f41337 = 0L;
        if (interfaceC19533.mo21703(17)) {
            abstractC24755Mo23565 = interfaceC19533.mo23565();
        } else {
            abstractC24755Mo23565 = AbstractC24755.f80138;
        }
        long j3 = -9223372036854775807L;
        boolean z3 = false;
        if (!abstractC24755Mo23565.m55264()) {
            int iMo23566 = interfaceC19533.mo23566();
            i = 0;
            int i3 = iMo23566;
            j = 0;
            while (i3 <= iMo23566) {
                if (i3 == iMo23566) {
                    this.f41337 = C7116.m19506(j);
                }
                C11328 c11328 = this.f41321;
                abstractC24755Mo23565.m55263(i3, c11328);
                if (c11328.f35696 == j3) {
                    break;
                }
                int i4 = c11328.f35697;
                while (i4 <= c11328.f35687) {
                    C1634 c1634 = this.f41330;
                    abstractC24755Mo23565.mo1591(i4, c1634, z3);
                    C24380 c24380 = c1634.f5655;
                    c24380.getClass();
                    int i5 = c24380.f79097;
                    int i6 = 0;
                    while (i6 < i5) {
                        c1634.m5787(i6);
                        long j4 = c1634.f5659;
                        if (j4 >= j2) {
                            long[] jArr = this.f41355;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f41355 = Arrays.copyOf(jArr, length);
                                this.f41367 = Arrays.copyOf(this.f41367, length);
                            }
                            this.f41355[i] = C7116.m19506(j4 + j);
                            boolean[] zArr = this.f41367;
                            C6480 c6480M54497 = c1634.f5655.m54497(i6);
                            int i7 = c6480M54497.f21782;
                            if (i7 != -1) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        i2 = iMo23566;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    i2 = iMo23566;
                                    int i9 = c6480M54497.f21785[i8];
                                    C6480 c6480 = c6480M54497;
                                    if (i9 == 0 || i9 == 1) {
                                        z2 = true;
                                        z = true;
                                        break;
                                    } else {
                                        i8++;
                                        iMo23566 = i2;
                                        c6480M54497 = c6480;
                                    }
                                }
                            } else {
                                z2 = true;
                                z = true;
                                i2 = iMo23566;
                            }
                            zArr[i] = z2 ^ z;
                            i++;
                        } else {
                            i2 = iMo23566;
                        }
                        i6++;
                        iMo23566 = i2;
                        j2 = 0;
                    }
                    i4++;
                    z3 = false;
                    j2 = 0;
                }
                j += c11328.f35696;
                i3++;
                z3 = false;
                iMo23566 = iMo23566;
                j2 = 0;
                j3 = -9223372036854775807L;
            }
        } else {
            if (interfaceC19533.mo21703(16)) {
                long jMo21701 = interfaceC19533.mo21701();
                if (jMo21701 != -9223372036854775807L) {
                    jM19474 = C7116.m19474(jMo21701);
                } else {
                    jM19474 = 0;
                }
            } else {
                jM19474 = 0;
            }
            i = 0;
            j = jM19474;
        }
        long jM19506 = C7116.m19506(j);
        TextView textView = this.f41332;
        if (textView != null) {
            textView.setText(C7116.m19480(this.f41372, this.f41358, jM19506));
        }
        InterfaceC15683 interfaceC15683 = this.f41313;
        if (interfaceC15683 != null) {
            interfaceC15683.mo13291(jM19506);
            long[] jArr2 = this.f41326;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.f41355;
            if (i10 > jArr3.length) {
                this.f41355 = Arrays.copyOf(jArr3, i10);
                this.f41367 = Arrays.copyOf(this.f41367, i10);
            }
            System.arraycopy(jArr2, 0, this.f41355, i, length2);
            System.arraycopy(this.f41379, 0, this.f41367, i, length2);
            interfaceC15683.mo13287(this.f41355, this.f41367, i10);
        }
        m32041();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m32041() {
        long jMo23558;
        long jMo23579;
        if (m32072() && this.f41362) {
            InterfaceC19533 interfaceC19533 = this.f41312;
            if (interfaceC19533 == null || !interfaceC19533.mo21703(16)) {
                jMo23558 = 0;
                jMo23579 = 0;
            } else {
                jMo23558 = interfaceC19533.mo23558() + this.f41337;
                jMo23579 = interfaceC19533.mo23579() + this.f41337;
            }
            TextView textView = this.f41335;
            if (textView != null && !this.f41373) {
                textView.setText(C7116.m19480(this.f41372, this.f41358, jMo23558));
            }
            InterfaceC15683 interfaceC15683 = this.f41313;
            if (interfaceC15683 != null) {
                interfaceC15683.mo13284(jMo23558);
                if (m32051(interfaceC19533)) {
                    jMo23579 = jMo23558;
                }
                interfaceC15683.mo13289(jMo23579);
            }
            RunnableC4773 runnableC4773 = this.f41316;
            removeCallbacks(runnableC4773);
            int iMo23580 = interfaceC19533 == null ? 1 : interfaceC19533.mo23580();
            if (interfaceC19533 != null && interfaceC19533.isPlaying()) {
                long jMin = Math.min(interfaceC15683 != null ? interfaceC15683.mo13283() : 1000L, 1000 - (jMo23558 % 1000));
                float f = interfaceC19533.mo23563().f24500;
                postDelayed(runnableC4773, C7116.m19476(f > 0.0f ? (long) (jMin / f) : 1000L, this.f41336, 1000L));
            } else {
                if (iMo23580 == 4 || iMo23580 == 1) {
                    return;
                }
                postDelayed(runnableC4773, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static void m32052(C12921 c12921) {
        C7129 c7129 = c12921.f41352;
        C9365 c9365 = c12921.f41356;
        InterfaceC19533 interfaceC19533 = c12921.f41312;
        if (interfaceC19533 == null) {
            return;
        }
        c9365.m24678(interfaceC19533.mo23563().f24500);
        c7129.m19527(0, c9365.m24677());
        c12921.m32006(c12921.f41329, c7129.m19528());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m32056() {
        C25227 c25227 = this.f41318;
        c25227.measure(0, 0);
        int width = getWidth();
        int i = this.f41388;
        int iMin = Math.min(c25227.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f41348;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), c25227.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32014(AbstractC12964 abstractC12964, View view) {
        this.f41318.setAdapter(abstractC12964);
        m32056();
        this.f41322 = false;
        PopupWindow popupWindow = this.f41348;
        popupWindow.dismiss();
        this.f41322 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f41388;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32008(C12921 c12921, float f) {
        InterfaceC19533 interfaceC19533 = c12921.f41312;
        if (interfaceC19533 == null || !interfaceC19533.mo21703(13)) {
            return;
        }
        InterfaceC19533 interfaceC19534 = c12921.f41312;
        interfaceC19534.mo23551(new C7445(f, interfaceC19534.mo23563().f24499));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m32070() {
        ImageView imageView = this.f41324;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32006(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f41334 : this.f41311);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32012(C12921 c12921, InterfaceC19533 interfaceC19533, long j) {
        if (interfaceC19533.mo21703(5)) {
            interfaceC19533.seekTo(j);
        }
        c12921.m32041();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32007(C12921 c12921) {
        String str = c12921.f41328;
        Drawable drawable = c12921.f41317;
        String str2 = c12921.f41347;
        Drawable drawable2 = c12921.f41387;
        boolean z = c12921.f41364;
        boolean z2 = !z;
        if (z == z2) {
            return;
        }
        c12921.f41364 = z2;
        ImageView imageView = c12921.f41351;
        if (imageView != null) {
            if (!z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = c12921.f41383;
        if (imageView2 == null) {
            return;
        }
        if (!z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32009(C12921 c12921, int i) {
        View view = c12921.f41329;
        if (i == 0) {
            C9365 c9365 = c12921.f41356;
            view.getClass();
            c12921.m32014(c9365, view);
        } else {
            if (i == 1) {
                C19062 c19062 = c12921.f41366;
                view.getClass();
                c12921.m32014(c19062, view);
                return;
            }
            c12921.f41348.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9191 c9191 = this.f41319;
        c9191.m24354();
        this.f41362 = true;
        if (c9191.m24349()) {
            c9191.m24350();
        }
        m32069();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9191 c9191 = this.f41319;
        c9191.m24352();
        this.f41362 = false;
        removeCallbacks(this.f41316);
        c9191.m24351();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m32066(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32066(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC19533 interfaceC19533 = this.f41312;
        if (interfaceC19533 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC19533.mo23580() != 4 && interfaceC19533.mo21703(12)) {
                    interfaceC19533.mo21696();
                }
            } else if (keyCode == 89 && interfaceC19533.mo21703(11)) {
                interfaceC19533.mo21704();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (!C7116.m19491(interfaceC19533, this.f41363)) {
                        if (interfaceC19533.mo21703(1)) {
                            interfaceC19533.pause();
                        }
                    } else {
                        C7116.m19490(interfaceC19533);
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            C7116.m19490(interfaceC19533);
                        } else if (keyCode == 127) {
                            String str = C7116.f23455;
                            if (interfaceC19533.mo21703(1)) {
                                interfaceC19533.pause();
                            }
                        }
                    } else if (interfaceC19533.mo21703(7)) {
                        interfaceC19533.mo21700();
                    }
                } else if (interfaceC19533.mo21703(9)) {
                    interfaceC19533.mo21692();
                }
            }
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f41319.m24344(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32010(C12921 c12921, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = c12921.f41388;
        PopupWindow popupWindow = c12921.f41348;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i10 == i11) && popupWindow.isShowing()) {
            c12921.m32056();
            popupWindow.update(view, (c12921.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m32050(C12921 c12921, InterfaceC19533 interfaceC19533) {
        Class cls;
        return (interfaceC19533 == null || (cls = c12921.f41353) == null || !cls.isAssignableFrom(interfaceC19533.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[Catch: InvocationTargetException -> 0x0014, IllegalAccessException -> 0x0016, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0016, InvocationTargetException -> 0x0014, blocks: (B:4:0x0004, B:6:0x0008, B:16:0x001c, B:19:0x0032, B:21:0x0036, B:26:0x0045), top: B:32:0x0004 }] */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m32051(InterfaceC19533 interfaceC19533) {
        boolean z;
        boolean z2;
        Object objInvoke;
        Class cls;
        if (interfaceC19533 != null) {
            try {
                Class cls2 = this.f41353;
                if (cls2 == null || !cls2.isAssignableFrom(interfaceC19533.getClass())) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (IllegalAccessException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        } else {
            z = false;
        }
        if (!z) {
            if (interfaceC19533 == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method = this.f41314;
                method.getClass();
                objInvoke = method.invoke(interfaceC19533, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        Method method2 = this.f41360;
        method2.getClass();
        Object objInvoke2 = method2.invoke(interfaceC19533, null);
        objInvoke2.getClass();
        if (!((Boolean) objInvoke2).booleanValue()) {
            if (interfaceC19533 == null && (cls = this.f41342) != null && cls.isAssignableFrom(interfaceC19533.getClass())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method3 = this.f41314;
                method3.getClass();
                objInvoke = method3.invoke(interfaceC19533, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32015(C12921 c12921, InterfaceC19533 interfaceC19533) {
        Class cls;
        return (interfaceC19533 == null || (cls = c12921.f41342) == null || !cls.isAssignableFrom(interfaceC19533.getClass())) ? false : true;
    }
}
