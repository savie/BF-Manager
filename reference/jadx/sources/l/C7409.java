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

/* JADX INFO: renamed from: l.۟ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public class C7409 extends FrameLayout {

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public static final float[] f24608;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22226 f24609;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f24610;

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final C18698 f24611;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24612;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final C15171 f24613;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f24614;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final String f24615;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final TextView f24616;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final TextView f24617;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Class f24618;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24619;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24620;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final C17492 f24621;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long[] f24622;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f24623;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f24624;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f24625;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Class f24626;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final String f24627;

    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public final C15763 f24628;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final String f24629;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final PopupWindow f24630;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24631;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f24632;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24633;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final String f24634;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24635;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final String f24636;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f24637;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24638;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C20039 f24639;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f24640;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f24641;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24642;

    /* JADX INFO: renamed from: ۧܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC23440 f24643;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final View f24644;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public final View f24645;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f24646;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f24647;

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public int f24648;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final String f24649;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final View f24650;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean[] f24651;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final Resources f24652;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3797 f24653;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24654;

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    public final C0282 f24655;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f24656;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public boolean f24657;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f24658;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C3880 f24659;

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f24660;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f24661;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10161 f24662;

    /* JADX INFO: renamed from: ܽܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7326 f24663;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC1058 f24664;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24665;

    /* JADX INFO: renamed from: ܿܰ, reason: not valid java name and contains not printable characters */
    public boolean f24666;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Method f24667;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public final ImageView f24668;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24669;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f24670;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24671;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f24672;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f24673;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final View f24674;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public final String f24675;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView f24676;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final String f24677;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24678;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public int f24679;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Formatter f24680;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final Method f24681;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f24682;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public final int f24683;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f24684;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final String f24685;

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f24686;

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19826(InterfaceC10232 interfaceC10232) {
        interfaceC10232.getClass();
        this.f24686.add(interfaceC10232);
    }

    static {
        C11572.m28868("media3.ui");
        f24608 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C7409(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7409(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7409(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) throws NoSuchMethodException {
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
        this.f24657 = true;
        this.f24679 = OpenAuthTask.Duplex;
        this.f24623 = 0;
        this.f24648 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C1981.f7427, i, 0);
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
                this.f24679 = typedArrayObtainStyledAttributes.getInt(32, this.f24679);
                this.f24623 = typedArrayObtainStyledAttributes.getInt(19, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.f24666 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                this.f24648 = C17983.m41813(typedArrayObtainStyledAttributes.getInt(38, this.f24648), 16, 1000);
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
        this.f24664 = new ViewOnClickListenerC1058(this);
        this.f24686 = new CopyOnWriteArrayList();
        this.f24639 = new C20039();
        this.f24655 = new C0282();
        StringBuilder sb = new StringBuilder();
        this.f24624 = sb;
        boolean z18 = z;
        this.f24680 = new Formatter(sb, Locale.getDefault());
        this.f24658 = new long[0];
        this.f24610 = new boolean[0];
        this.f24622 = new long[0];
        this.f24651 = new boolean[0];
        this.f24643 = new RunnableC23440(1, this);
        try {
            Method method6 = InterfaceC17693.class.getMethod("ۨ", cls2);
            try {
                method2 = InterfaceC17693.class.getMethod("ܺ", null);
                method = method6;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = method6;
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.f24618 = InterfaceC17693.class;
        this.f24681 = method;
        this.f24667 = method2;
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
        this.f24626 = cls;
        this.f24684 = method4;
        this.f24641 = method5;
        this.f24637 = (TextView) findViewById(R.id.MT_Protector);
        this.f24647 = (TextView) findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector);
        this.f24640 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f24664);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24612 = imageView2;
        int i19 = 1;
        ViewOnClickListenerC22460 viewOnClickListenerC22460 = new ViewOnClickListenerC22460(i19, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC22460);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24669 = imageView3;
        ViewOnClickListenerC22460 viewOnClickListenerC22461 = new ViewOnClickListenerC22460(i19, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC22461);
        }
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f24650 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.f24664);
        }
        View viewFindViewById2 = findViewById(R.id.MT_Protector);
        this.f24674 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.f24664);
        }
        View viewFindViewById3 = findViewById(R.id.MT_Protector);
        this.f24673 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.f24664);
        }
        InterfaceC7326 interfaceC7326 = (InterfaceC7326) findViewById(R.id.MT_Protector);
        View viewFindViewById4 = findViewById(R.id.MT_Protector);
        if (interfaceC7326 != null) {
            this.f24663 = interfaceC7326;
            textView = null;
            z9 = z18;
        } else if (viewFindViewById4 != null) {
            z9 = z18;
            C3134 c3134 = new C3134(context, null, 0, attributeSet2, R.style.MT_Protector);
            c3134.setId(R.id.MT_Protector);
            c3134.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c3134, iIndexOfChild);
            this.f24663 = c3134;
            textView = null;
        } else {
            z9 = z18;
            textView = null;
            this.f24663 = null;
        }
        InterfaceC7326 interfaceC7327 = this.f24663;
        if (interfaceC7327 != null) {
            interfaceC7327.mo9502(this.f24664);
        }
        Resources resources = context.getResources();
        this.f24652 = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24676 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.f24664);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24665 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            imageView5.setOnClickListener(this.f24664);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24671 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            imageView6.setOnClickListener(this.f24664);
        }
        Typeface typefaceM39103 = C16631.m39103(context, R.font.MT_Protector);
        ImageView imageView7 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f24645 = imageView7;
            this.f24617 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM39103);
            this.f24617 = textView2;
            this.f24645 = textView2;
        } else {
            this.f24617 = textView;
            this.f24645 = textView;
        }
        View view = this.f24645;
        if (view != null) {
            view.setOnClickListener(this.f24664);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.MT_Protector);
        TextView textView3 = (TextView) findViewById(R.id.MT_Protector);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            this.f24644 = imageView8;
            this.f24616 = null;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceM39103);
            this.f24616 = textView3;
            this.f24644 = textView3;
        } else {
            this.f24616 = null;
            this.f24644 = null;
        }
        View view2 = this.f24644;
        if (view2 != null) {
            view2.setOnClickListener(this.f24664);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24619 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.f24664);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.MT_Protector);
        this.f24668 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.f24664);
        }
        this.f24646 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        this.f24661 = resources.getInteger(R.integer.MT_Protector) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.MT_Protector);
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i9, context.getTheme()));
            m19767((View) imageView11, false);
        }
        C3797 c3797 = new C3797(this);
        this.f24653 = c3797;
        c3797.m11076(z9);
        C15171 c15171 = new C15171(this, new String[]{resources.getString(R.string.MT_Protector), resources.getString(R.string.MT_Protector)}, new Drawable[]{resources.getDrawable(R.drawable.MT_Protector, context.getTheme()), resources.getDrawable(R.drawable.MT_Protector, context.getTheme())});
        this.f24613 = c15171;
        this.f24683 = resources.getDimensionPixelSize(R.dimen.MT_Protector);
        C17492 c17492 = (C17492) LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f24621 = c17492;
        c17492.setAdapter(c15171);
        c17492.setLayoutManager(new C13115(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) c17492, -2, -2, true);
        this.f24630 = popupWindow;
        if (Build.VERSION.SDK_INT < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(this.f24664);
        this.f24633 = true;
        this.f24628 = new C15763(getResources());
        this.f24660 = resources.getDrawable(i5, context.getTheme());
        this.f24632 = resources.getDrawable(i4, context.getTheme());
        this.f24675 = resources.getString(R.string.MT_Protector);
        this.f24677 = resources.getString(R.string.MT_Protector);
        this.f24611 = new C18698(this);
        this.f24609 = new C22226(this);
        this.f24659 = new C3880(this, resources.getStringArray(R.array.MT_Protector), f24608);
        this.f24631 = resources.getDrawable(i11, context.getTheme());
        this.f24635 = resources.getDrawable(i12, context.getTheme());
        this.f24682 = resources.getDrawable(i17, context.getTheme());
        this.f24620 = resources.getDrawable(i18, context.getTheme());
        this.f24654 = resources.getDrawable(i10, context.getTheme());
        this.f24638 = resources.getDrawable(i6, context.getTheme());
        this.f24642 = resources.getDrawable(i2, context.getTheme());
        this.f24672 = resources.getDrawable(i8, context.getTheme());
        this.f24670 = resources.getDrawable(i3, context.getTheme());
        this.f24629 = resources.getString(R.string.MT_Protector);
        this.f24649 = resources.getString(R.string.MT_Protector);
        this.f24685 = resources.getString(R.string.MT_Protector);
        this.f24615 = resources.getString(R.string.MT_Protector);
        this.f24627 = resources.getString(R.string.MT_Protector);
        this.f24636 = resources.getString(R.string.MT_Protector);
        this.f24634 = resources.getString(R.string.MT_Protector);
        c3797.m11075(findViewById(R.id.MT_Protector), true);
        c3797.m11075(this.f24644, z3);
        c3797.m11075(this.f24645, z2);
        c3797.m11075(imageView5, z4);
        c3797.m11075(imageView6, z5);
        c3797.m11075(imageView10, z8);
        c3797.m11075(imageView, z6);
        c3797.m11075(imageView11, z7);
        c3797.m11075(imageView9, this.f24623 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۖۤܰ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                C7409.m19772(this.f9826, view3, i20, i21, i22, i23, i24, i25, i26, i27);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19825(InterfaceC10161 interfaceC10161) {
        C2023.m6510(Looper.myLooper() == Looper.getMainLooper());
        C2023.m6507(interfaceC10161 == null || interfaceC10161.mo25830() == Looper.getMainLooper());
        InterfaceC10161 interfaceC10162 = this.f24662;
        if (interfaceC10162 == interfaceC10161) {
            return;
        }
        ViewOnClickListenerC1058 viewOnClickListenerC1058 = this.f24664;
        if (interfaceC10162 != null) {
            interfaceC10162.mo25818(viewOnClickListenerC1058);
        }
        this.f24662 = interfaceC10161;
        if (interfaceC10161 != null) {
            interfaceC10161.mo25839(viewOnClickListenerC1058);
        }
        m19830();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19834(boolean z) {
        this.f24653.m11075(this.f24645, z);
        m19818();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19827(boolean z) {
        this.f24653.m11075(this.f24644, z);
        m19818();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m19823() {
        return this.f24679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19824(int i) {
        this.f24679 = i;
        C3797 c3797 = this.f24653;
        if (c3797.m11079()) {
            c3797.m11071();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m19832() {
        this.f24653.m11076(false);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m19822() {
        this.f24653.m11080();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19833() {
        this.f24653.m11073();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19831() {
        this.f24653.m11081();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m19821() {
        return this.f24653.m11079();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m19829() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19835() {
        for (InterfaceC10232 interfaceC10232 : this.f24686) {
            getVisibility();
            interfaceC10232.mo26025();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m19830() {
        m19801();
        m19818();
        m19806();
        m19784();
        m19786();
        InterfaceC10161 interfaceC10161 = this.f24662;
        if (interfaceC10161 != null) {
            float f = interfaceC10161.mo25832().f69728;
            C3880 c3880 = this.f24659;
            c3880.m11255(f);
            String strM11254 = c3880.m11254();
            C15171 c15171 = this.f24613;
            c15171.m36395(0, strM11254);
            m19767(this.f24650, c15171.m36396());
        }
        m19810();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m19801() {
        ImageView imageView;
        boolean z;
        if (m19829() && this.f24656 && (imageView = this.f24676) != null) {
            boolean zM41845 = C17983.m41845(this.f24662, this.f24657);
            Drawable drawable = zM41845 ? this.f24631 : this.f24635;
            int i = zM41845 ? R.string.MT_Protector : R.string.MT_Protector;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f24652.getString(i));
            InterfaceC10161 interfaceC10161 = this.f24662;
            if (interfaceC10161 != null) {
                z = true;
                if (!interfaceC10161.mo25841(1) || (interfaceC10161.mo25841(17) && interfaceC10161.mo25828().m38828())) {
                    z = false;
                }
            } else {
                z = false;
            }
            m19767(imageView, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m19818() {
        boolean zMo25841;
        boolean zMo25842;
        boolean zMo25843;
        boolean zMo25844;
        boolean zMo25845;
        if (m19829() && this.f24656) {
            InterfaceC10161 interfaceC10161 = this.f24662;
            if (interfaceC10161 != null) {
                zMo25842 = interfaceC10161.mo25841(5);
                zMo25843 = interfaceC10161.mo25841(7);
                zMo25844 = interfaceC10161.mo25841(11);
                zMo25845 = interfaceC10161.mo25841(12);
                zMo25841 = interfaceC10161.mo25841(9);
            } else {
                zMo25841 = false;
                zMo25842 = false;
                zMo25843 = false;
                zMo25844 = false;
                zMo25845 = false;
            }
            Resources resources = this.f24652;
            View view = this.f24645;
            if (zMo25844) {
                InterfaceC10161 interfaceC10162 = this.f24662;
                int iMo25854 = (int) ((interfaceC10162 != null ? interfaceC10162.mo25854() : 5000L) / 1000);
                TextView textView = this.f24617;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo25854));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo25854, Integer.valueOf(iMo25854)));
                }
            }
            View view2 = this.f24644;
            if (zMo25845) {
                InterfaceC10161 interfaceC10163 = this.f24662;
                int iMo25807 = (int) ((interfaceC10163 != null ? interfaceC10163.mo25807() : 15000L) / 1000);
                TextView textView2 = this.f24616;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo25807));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.MT_Protector, iMo25807, Integer.valueOf(iMo25807)));
                }
            }
            m19767(this.f24665, zMo25843);
            m19767(view, zMo25844);
            m19767(view2, zMo25845);
            m19767(this.f24671, zMo25841);
            InterfaceC7326 interfaceC7326 = this.f24663;
            if (interfaceC7326 != null) {
                interfaceC7326.setEnabled(zMo25842);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m19806() {
        ImageView imageView;
        if (m19829() && this.f24656 && (imageView = this.f24619) != null) {
            if (this.f24623 == 0) {
                m19767((View) imageView, false);
                return;
            }
            InterfaceC10161 interfaceC10161 = this.f24662;
            String str = this.f24685;
            Drawable drawable = this.f24654;
            if (interfaceC10161 == null || !interfaceC10161.mo25841(15)) {
                m19767((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m19767((View) imageView, true);
            int iMo25835 = interfaceC10161.mo25835();
            if (iMo25835 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo25835 == 1) {
                imageView.setImageDrawable(this.f24638);
                imageView.setContentDescription(this.f24615);
            } else {
                if (iMo25835 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f24642);
                imageView.setContentDescription(this.f24627);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void m19784() {
        ImageView imageView;
        if (m19829() && this.f24656 && (imageView = this.f24668) != null) {
            InterfaceC10161 interfaceC10161 = this.f24662;
            if (!this.f24653.m11077(imageView)) {
                m19767((View) imageView, false);
                return;
            }
            String str = this.f24634;
            Drawable drawable = this.f24670;
            if (interfaceC10161 == null || !interfaceC10161.mo25841(14)) {
                m19767((View) imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m19767((View) imageView, true);
            if (interfaceC10161.mo25821()) {
                drawable = this.f24672;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC10161.mo25821()) {
                str = this.f24636;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void m19786() {
        C18698 c18698 = this.f24611;
        c18698.getClass();
        List list = Collections.EMPTY_LIST;
        c18698.f30337 = list;
        C22226 c22226 = this.f24609;
        c22226.getClass();
        c22226.f30337 = list;
        InterfaceC10161 interfaceC10161 = this.f24662;
        ImageView imageView = this.f24640;
        if (interfaceC10161 != null && interfaceC10161.mo25841(30) && this.f24662.mo25841(29)) {
            C9456 c9456Mo25847 = this.f24662.mo25847();
            c22226.m49350(m19766(c9456Mo25847, 1));
            if (this.f24653.m11077(imageView)) {
                c18698.m43181(m19766(c9456Mo25847, 3));
            } else {
                c18698.m43181(AbstractC22433.of());
            }
        }
        m19767(imageView, c18698.getItemCount() > 0);
        m19767(this.f24650, this.f24613.m36396());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22433 m19766(C9456 c9456, int i) {
        C4793 c4793 = new C4793();
        AbstractC22433 abstractC22433M24212 = c9456.m24212();
        for (int i2 = 0; i2 < abstractC22433M24212.size(); i2++) {
            C1693 c1693 = (C1693) abstractC22433M24212.get(i2);
            if (c1693.m5618() == i) {
                for (int i3 = 0; i3 < c1693.f6705; i3++) {
                    if (c1693.m5616(i3, false)) {
                        C7648 c7648M5614 = c1693.m5614(i3);
                        if ((c7648M5614.f25243 & 2) == 0) {
                            c4793.m52163(new C8115(c9456, i2, i3, this.f24628.m37507(c7648M5614)));
                        }
                    }
                }
            }
        }
        return c4793.m13309();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m19810() {
        AbstractC16511 abstractC16511Mo25828;
        long jM41827;
        int i;
        long j;
        int i2;
        boolean z;
        boolean z2;
        InterfaceC10161 interfaceC10161 = this.f24662;
        if (interfaceC10161 == null) {
            return;
        }
        long j2 = 0;
        this.f24614 = 0L;
        if (interfaceC10161.mo25841(17)) {
            abstractC16511Mo25828 = interfaceC10161.mo25828();
        } else {
            abstractC16511Mo25828 = AbstractC16511.f53035;
        }
        long j3 = -9223372036854775807L;
        boolean z3 = false;
        if (!abstractC16511Mo25828.m38828()) {
            int iMo25810 = interfaceC10161.mo25810();
            i = 0;
            int i3 = iMo25810;
            j = 0;
            while (i3 <= iMo25810) {
                if (i3 == iMo25810) {
                    this.f24614 = C17983.m41856(j);
                }
                C0282 c0282 = this.f24655;
                abstractC16511Mo25828.m38827(i3, c0282);
                if (c0282.f1588 == j3) {
                    break;
                }
                int i4 = c0282.f1580;
                while (i4 <= c0282.f1587) {
                    C20039 c20039 = this.f24639;
                    abstractC16511Mo25828.mo5920(i4, c20039, z3);
                    C3392 c3392 = c20039.f64170;
                    c3392.getClass();
                    int i5 = c3392.f12528;
                    int i6 = 0;
                    while (i6 < i5) {
                        c20039.m45386(i6);
                        long j4 = c20039.f64171;
                        if (j4 >= j2) {
                            long[] jArr = this.f24658;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f24658 = Arrays.copyOf(jArr, length);
                                this.f24610 = Arrays.copyOf(this.f24610, length);
                            }
                            this.f24658[i] = C17983.m41856(j4 + j);
                            boolean[] zArr = this.f24610;
                            C9744 c9744M10067 = c20039.f64170.m10067(i6);
                            int i7 = c9744M10067.f32786;
                            if (i7 != -1) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        i2 = iMo25810;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    i2 = iMo25810;
                                    int i9 = c9744M10067.f32790[i8];
                                    C9744 c9744 = c9744M10067;
                                    if (i9 == 0 || i9 == 1) {
                                        z2 = true;
                                        z = true;
                                        break;
                                    } else {
                                        i8++;
                                        iMo25810 = i2;
                                        c9744M10067 = c9744;
                                    }
                                }
                            } else {
                                z2 = true;
                                z = true;
                                i2 = iMo25810;
                            }
                            zArr[i] = z2 ^ z;
                            i++;
                        } else {
                            i2 = iMo25810;
                        }
                        i6++;
                        iMo25810 = i2;
                        j2 = 0;
                    }
                    i4++;
                    z3 = false;
                    j2 = 0;
                }
                j += c0282.f1588;
                i3++;
                z3 = false;
                iMo25810 = iMo25810;
                j2 = 0;
                j3 = -9223372036854775807L;
            }
        } else {
            if (interfaceC10161.mo25841(16)) {
                long jMo25846 = interfaceC10161.mo25846();
                if (jMo25846 != -9223372036854775807L) {
                    jM41827 = C17983.m41827(jMo25846);
                } else {
                    jM41827 = 0;
                }
            } else {
                jM41827 = 0;
            }
            i = 0;
            j = jM41827;
        }
        long jM41856 = C17983.m41856(j);
        TextView textView = this.f24637;
        if (textView != null) {
            textView.setText(C17983.m41833(this.f24624, this.f24680, jM41856));
        }
        InterfaceC7326 interfaceC7326 = this.f24663;
        if (interfaceC7326 != null) {
            interfaceC7326.mo9508(jM41856);
            long[] jArr2 = this.f24622;
            int length2 = jArr2.length;
            int i10 = i + length2;
            long[] jArr3 = this.f24658;
            if (i10 > jArr3.length) {
                this.f24658 = Arrays.copyOf(jArr3, i10);
                this.f24610 = Arrays.copyOf(this.f24610, i10);
            }
            System.arraycopy(jArr2, 0, this.f24658, i, length2);
            System.arraycopy(this.f24651, 0, this.f24610, i, length2);
            interfaceC7326.mo9504(this.f24658, this.f24610, i10);
        }
        m19814();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m19814() {
        long jMo25829;
        long jMo25842;
        if (m19829() && this.f24656) {
            InterfaceC10161 interfaceC10161 = this.f24662;
            if (interfaceC10161 == null || !interfaceC10161.mo25841(16)) {
                jMo25829 = 0;
                jMo25842 = 0;
            } else {
                jMo25829 = interfaceC10161.mo25829() + this.f24614;
                jMo25842 = interfaceC10161.mo25842() + this.f24614;
            }
            TextView textView = this.f24647;
            if (textView != null && !this.f24625) {
                textView.setText(C17983.m41833(this.f24624, this.f24680, jMo25829));
            }
            InterfaceC7326 interfaceC7326 = this.f24663;
            if (interfaceC7326 != null) {
                interfaceC7326.mo9501(jMo25829);
                if (m19797(interfaceC10161)) {
                    jMo25842 = jMo25829;
                }
                interfaceC7326.mo9506(jMo25842);
            }
            RunnableC23440 runnableC23440 = this.f24643;
            removeCallbacks(runnableC23440);
            int iMo25808 = interfaceC10161 == null ? 1 : interfaceC10161.mo25808();
            if (interfaceC10161 != null && interfaceC10161.isPlaying()) {
                long jMin = Math.min(interfaceC7326 != null ? interfaceC7326.mo9500() : 1000L, 1000 - (jMo25829 % 1000));
                float f = interfaceC10161.mo25832().f69728;
                postDelayed(runnableC23440, C17983.m41829(f > 0.0f ? (long) (jMin / f) : 1000L, this.f24648, 1000L));
            } else {
                if (iMo25808 == 4 || iMo25808 == 1) {
                    return;
                }
                postDelayed(runnableC23440, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static void m19798(C7409 c7409) {
        C15171 c15171 = c7409.f24613;
        C3880 c3880 = c7409.f24659;
        InterfaceC10161 interfaceC10161 = c7409.f24662;
        if (interfaceC10161 == null) {
            return;
        }
        c3880.m11255(interfaceC10161.mo25832().f69728);
        c15171.m36395(0, c3880.m11254());
        c7409.m19767(c7409.f24650, c15171.m36396());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19808() {
        C17492 c17492 = this.f24621;
        c17492.measure(0, 0);
        int width = getWidth();
        int i = this.f24683;
        int iMin = Math.min(c17492.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.f24630;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), c17492.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m19768(AbstractC0414 abstractC0414, View view) {
        this.f24621.setAdapter(abstractC0414);
        m19808();
        this.f24633 = false;
        PopupWindow popupWindow = this.f24630;
        popupWindow.dismiss();
        this.f24633 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.f24683;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19770(C7409 c7409, float f) {
        InterfaceC10161 interfaceC10161 = c7409.f24662;
        if (interfaceC10161 == null || !interfaceC10161.mo25841(13)) {
            return;
        }
        InterfaceC10161 interfaceC10162 = c7409.f24662;
        interfaceC10162.mo25819(new C21449(f, interfaceC10162.mo25832().f69727));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m19820() {
        ImageView imageView = this.f24676;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19767(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.f24646 : this.f24661);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19774(C7409 c7409, InterfaceC10161 interfaceC10161, long j) {
        if (interfaceC10161.mo25841(5)) {
            interfaceC10161.seekTo(j);
        }
        c7409.m19814();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19769(C7409 c7409) {
        String str = c7409.f24649;
        Drawable drawable = c7409.f24620;
        String str2 = c7409.f24629;
        Drawable drawable2 = c7409.f24682;
        boolean z = c7409.f24678;
        boolean z2 = !z;
        if (z == z2) {
            return;
        }
        c7409.f24678 = z2;
        ImageView imageView = c7409.f24612;
        if (imageView != null) {
            if (!z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = c7409.f24669;
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
    public static void m19771(C7409 c7409, int i) {
        View view = c7409.f24650;
        if (i == 0) {
            C3880 c3880 = c7409.f24659;
            view.getClass();
            c7409.m19768(c3880, view);
        } else {
            if (i == 1) {
                C22226 c22226 = c7409.f24609;
                view.getClass();
                c7409.m19768(c22226, view);
                return;
            }
            c7409.f24630.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3797 c3797 = this.f24653;
        c3797.m11072();
        this.f24656 = true;
        if (c3797.m11079()) {
            c3797.m11071();
        }
        m19830();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3797 c3797 = this.f24653;
        c3797.m11078();
        this.f24656 = false;
        removeCallbacks(this.f24643);
        c3797.m11082();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m19828(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19828(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC10161 interfaceC10161 = this.f24662;
        if (interfaceC10161 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC10161.mo25808() != 4 && interfaceC10161.mo25841(12)) {
                    interfaceC10161.mo25833();
                }
            } else if (keyCode == 89 && interfaceC10161.mo25841(11)) {
                interfaceC10161.mo25809();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (!C17983.m41845(interfaceC10161, this.f24657)) {
                        if (interfaceC10161.mo25841(1)) {
                            interfaceC10161.pause();
                        }
                    } else {
                        C17983.m41844(interfaceC10161);
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            C17983.m41844(interfaceC10161);
                        } else if (keyCode == 127) {
                            String str = C17983.f57504;
                            if (interfaceC10161.mo25841(1)) {
                                interfaceC10161.pause();
                            }
                        }
                    } else if (interfaceC10161.mo25841(7)) {
                        interfaceC10161.mo25844();
                    }
                } else if (interfaceC10161.mo25841(9)) {
                    interfaceC10161.mo25851();
                }
            }
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f24653.m11074(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19772(C7409 c7409, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = c7409.f24683;
        PopupWindow popupWindow = c7409.f24630;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i10 == i11) && popupWindow.isShowing()) {
            c7409.m19808();
            popupWindow.update(view, (c7409.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m19796(C7409 c7409, InterfaceC10161 interfaceC10161) {
        Class cls;
        return (interfaceC10161 == null || (cls = c7409.f24618) == null || !cls.isAssignableFrom(interfaceC10161.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045 A[Catch: InvocationTargetException -> 0x0014, IllegalAccessException -> 0x0016, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0016, InvocationTargetException -> 0x0014, blocks: (B:4:0x0004, B:6:0x0008, B:16:0x001c, B:19:0x0032, B:21:0x0036, B:26:0x0045), top: B:32:0x0004 }] */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m19797(InterfaceC10161 interfaceC10161) {
        boolean z;
        boolean z2;
        Object objInvoke;
        Class cls;
        if (interfaceC10161 != null) {
            try {
                Class cls2 = this.f24618;
                if (cls2 == null || !cls2.isAssignableFrom(interfaceC10161.getClass())) {
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
            if (interfaceC10161 == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method = this.f24641;
                method.getClass();
                objInvoke = method.invoke(interfaceC10161, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        Method method2 = this.f24667;
        method2.getClass();
        Object objInvoke2 = method2.invoke(interfaceC10161, null);
        objInvoke2.getClass();
        if (!((Boolean) objInvoke2).booleanValue()) {
            if (interfaceC10161 == null && (cls = this.f24626) != null && cls.isAssignableFrom(interfaceC10161.getClass())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Method method3 = this.f24641;
                method3.getClass();
                objInvoke = method3.invoke(interfaceC10161, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19776(C7409 c7409, InterfaceC10161 interfaceC10161) {
        Class cls;
        return (interfaceC10161 == null || (cls = c7409.f24626) == null || !cls.isAssignableFrom(interfaceC10161.getClass())) ? false : true;
    }
}
