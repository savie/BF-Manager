package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes.dex */
public final class C22884 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f74348 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7265 f74349 = new C7265(6);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22884 f74350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9086 f74351;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f74352;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TypedValue f74353;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f74354;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2375 f74355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f74356 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC22138 f74357;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized Drawable m51608(Context context, long j) {
        C18783 c18783 = (C18783) this.f74356.get(context);
        if (c18783 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c18783.m43573(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM19065 = C6850.m19065(j, c18783.f61002, c18783.f61001);
            if (iM19065 >= 0 && c18783.f60999[iM19065] != C9832.f31648) {
                c18783.f60999[iM19065] = C9832.f31648;
                c18783.f61000 = true;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m51610(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C18783 c18783 = (C18783) this.f74356.get(context);
            if (c18783 == null) {
                c18783 = new C18783();
                this.f74356.put(context, c18783);
            }
            c18783.m43576(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51618(Context context) {
        C18783 c18783 = (C18783) this.f74356.get(context);
        if (c18783 != null) {
            c18783.m43574();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51619(InterfaceC22138 interfaceC22138) {
        this.f74357 = interfaceC22138;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m51620(Context context, int i) {
        ColorStateList colorStateList;
        C2375 c2375;
        WeakHashMap weakHashMap = this.f74354;
        ColorStateList colorStateListM8754 = null;
        colorStateList = (weakHashMap == null || (c2375 = (C2375) weakHashMap.get(context)) == null) ? null : (ColorStateList) C8341.m22446(c2375, i);
        if (colorStateList == null) {
            InterfaceC22138 interfaceC22138 = this.f74357;
            if (interfaceC22138 != null) {
                colorStateListM8754 = ((C2615) interfaceC22138).m8754(context, i);
            }
            if (colorStateListM8754 != null) {
                if (this.f74354 == null) {
                    this.f74354 = new WeakHashMap();
                }
                C2375 c2376 = (C2375) this.f74354.get(context);
                if (c2376 == null) {
                    c2376 = new C2375();
                    this.f74354.put(context, c2376);
                }
                c2376.m8076(i, colorStateListM8754);
            }
            colorStateList = colorStateListM8754;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m51607(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C7265 c7265 = f74349;
        c7265.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c7265.m3588(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C22884 m51609() {
        if (f74350 == null) {
            C22884 c22884 = new C22884();
            f74350 = c22884;
            m51613(c22884);
        }
        return f74350;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51613(C22884 c22884) {
        if (Build.VERSION.SDK_INT < 24) {
            c22884.m51612("vector", new C10949());
            c22884.m51612("animated-vector", new C8756());
            c22884.m51612("animated-selector", new C2790());
            c22884.m51612("drawable", new C13976());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m51616(Context context, int i) {
        return m51617(context, i, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private Drawable m51614(Context context, int i) {
        if (this.f74353 == null) {
            this.f74353 = new TypedValue();
        }
        TypedValue typedValue = this.f74353;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM51608 = m51608(context, j);
        if (drawableM51608 != null) {
            return drawableM51608;
        }
        InterfaceC22138 interfaceC22138 = this.f74357;
        LayerDrawable layerDrawableM8755 = interfaceC22138 == null ? null : ((C2615) interfaceC22138).m8755(this, context, i);
        if (layerDrawableM8755 != null) {
            layerDrawableM8755.setChangingConfigurations(typedValue.changingConfigurations);
            m51610(context, j, layerDrawableM8755);
        }
        return layerDrawableM8755;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private Drawable m51615(Context context, int i) {
        int next;
        C9086 c9086 = this.f74351;
        if (c9086 == null || c9086.isEmpty()) {
            return null;
        }
        C2375 c2375 = this.f74355;
        if (c2375 != null) {
            String str = (String) C8341.m22446(c2375, i);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f74351.get(str) == null) {
                return null;
            }
        } else {
            this.f74355 = new C2375();
        }
        if (this.f74353 == null) {
            this.f74353 = new TypedValue();
        }
        TypedValue typedValue = this.f74353;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM51608 = m51608(context, j);
        if (drawableM51608 != null) {
            return drawableM51608;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f74355.m8076(i, name);
                InterfaceC4984 interfaceC4984 = (InterfaceC4984) this.f74351.get(name);
                if (interfaceC4984 != null) {
                    drawableM51608 = interfaceC4984.mo9257(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM51608 != null) {
                    drawableM51608.setChangingConfigurations(typedValue.changingConfigurations);
                    m51610(context, j, drawableM51608);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableM51608 == null) {
            this.f74355.m8076(i, "appcompat_skip_skip");
        }
        return drawableM51608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51612(String str, InterfaceC4984 interfaceC4984) {
        if (this.f74351 == null) {
            this.f74351 = new C9086();
        }
        this.f74351.put(str, interfaceC4984);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51611(Drawable drawable, C7221 c7221, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c7221.f23816;
            if (z || c7221.f23818) {
                PorterDuffColorFilter porterDuffColorFilterM51607 = null;
                ColorStateList colorStateList = z ? c7221.f23817 : null;
                PorterDuff.Mode mode = c7221.f23818 ? c7221.f23819 : f74348;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterM51607 = m51607(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterM51607);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m51617(Context context, int i, boolean z) {
        Drawable drawableM51615;
        boolean z2 = false;
        if (!this.f74352) {
            this.f74352 = true;
            Drawable drawableM51616 = m51616(context, R.drawable.MT_Protector);
            if (drawableM51616 == null || (!(drawableM51616 instanceof C24920) && !"android.graphics.drawable.VectorDrawable".equals(drawableM51616.getClass().getName()))) {
                this.f74352 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableM51615 = m51615(context, i);
        if (drawableM51615 == null) {
            drawableM51615 = m51614(context, i);
        }
        if (drawableM51615 == null) {
            drawableM51615 = C7508.m20563(context, i);
        }
        if (drawableM51615 != null) {
            ColorStateList colorStateListM51620 = m51620(context, i);
            PorterDuff.Mode mode = null;
            if (colorStateListM51620 != null) {
                drawableM51615 = C0597.m2697(drawableM51615.mutate());
                C0597.m2690(drawableM51615, colorStateListM51620);
                if (this.f74357 != null && i == R.drawable.MT_Protector) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    C0597.m2693(drawableM51615, mode);
                }
            } else {
                InterfaceC22138 interfaceC22138 = this.f74357;
                if (interfaceC22138 == null || !((C2615) interfaceC22138).m8756(context, i, drawableM51615)) {
                    InterfaceC22138 interfaceC22139 = this.f74357;
                    if (interfaceC22139 != null && ((C2615) interfaceC22139).m8757(context, i, drawableM51615)) {
                        z2 = true;
                    }
                    if (!z2 && z) {
                        drawableM51615 = null;
                    }
                }
            }
        }
        if (drawableM51615 != null) {
            C21414.m48721(drawableM51615);
        }
        return drawableM51615;
    }
}
