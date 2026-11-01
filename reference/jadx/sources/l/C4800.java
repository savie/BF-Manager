package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes2.dex */
public final class C4800 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C4800 f16864;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TypedValue f16866;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC9845 f16867;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12274 f16868;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C17212 f16869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f16870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f16871 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public WeakHashMap f16872;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f16863 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C23956 f16865 = new C23956(6);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized Drawable m13322(Context context, long j) {
        C8746 c8746 = (C8746) this.f16871.get(context);
        if (c8746 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c8746.m22709(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c8746.m22710(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m13324(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C8746 c8746 = (C8746) this.f16871.get(context);
            if (c8746 == null) {
                c8746 = new C8746();
                this.f16871.put(context, c8746);
            }
            c8746.m22706(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m13331(Context context) {
        C8746 c8746 = (C8746) this.f16871.get(context);
        if (c8746 != null) {
            c8746.m22704();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m13332(InterfaceC9845 interfaceC9845) {
        this.f16867 = interfaceC9845;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m13333(Context context, int i) {
        ColorStateList colorStateList;
        C17212 c17212;
        WeakHashMap weakHashMap = this.f16872;
        ColorStateList colorStateListM27131 = null;
        colorStateList = (weakHashMap == null || (c17212 = (C17212) weakHashMap.get(context)) == null) ? null : (ColorStateList) c17212.m40144(i, (Integer) null);
        if (colorStateList == null) {
            InterfaceC9845 interfaceC9845 = this.f16867;
            if (interfaceC9845 != null) {
                colorStateListM27131 = ((C10821) interfaceC9845).m27131(context, i);
            }
            if (colorStateListM27131 != null) {
                if (this.f16872 == null) {
                    this.f16872 = new WeakHashMap();
                }
                C17212 c17213 = (C17212) this.f16872.get(context);
                if (c17213 == null) {
                    c17213 = new C17212();
                    this.f16872.put(context, c17213);
                }
                c17213.m40146(i, colorStateListM27131);
            }
            colorStateList = colorStateListM27131;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m13321(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C23956 c23956 = f16865;
        c23956.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c23956.m25800(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C4800 m13323() {
        if (f16864 == null) {
            C4800 c4800 = new C4800();
            f16864 = c4800;
            m13327(c4800);
        }
        return f16864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13327(C4800 c4800) {
        if (Build.VERSION.SDK_INT < 24) {
            c4800.m13326("vector", new C3493());
            c4800.m13326("animated-vector", new C11256());
            c4800.m13326("animated-selector", new C6316());
            c4800.m13326("drawable", new C14784());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m13329(Context context, int i) {
        return m13330(context, i, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private Drawable m13328(Context context, int i) {
        if (this.f16866 == null) {
            this.f16866 = new TypedValue();
        }
        TypedValue typedValue = this.f16866;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM13322 = m13322(context, j);
        if (drawableM13322 != null) {
            return drawableM13322;
        }
        InterfaceC9845 interfaceC9845 = this.f16867;
        LayerDrawable layerDrawableM27132 = interfaceC9845 == null ? null : ((C10821) interfaceC9845).m27132(this, context, i);
        if (layerDrawableM27132 != null) {
            layerDrawableM27132.setChangingConfigurations(typedValue.changingConfigurations);
            m13324(context, j, layerDrawableM27132);
        }
        return layerDrawableM27132;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r11.f16868.getOrDefault(r0, null) != null) goto L15;
     */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.drawable.Drawable m13320(android.content.Context r12, int r13) {
        /*
            r11 = this;
            l.۫۠ r0 = r11.f16868
            r1 = 0
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb2
            l.ܿ۠ r0 = r11.f16869
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.m40144(r13, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto Lb2
            if (r0 == 0) goto L30
            l.۫۠ r3 = r11.f16868
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L30
            goto Lb2
        L29:
            l.ܿ۠ r0 = new l.ܿ۠
            r0.<init>()
            r11.f16869 = r0
        L30:
            android.util.TypedValue r0 = r11.f16866
            if (r0 != 0) goto L3b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f16866 = r0
        L3b:
            android.util.TypedValue r0 = r11.f16866
            android.content.res.Resources r3 = r12.getResources()
            r4 = 1
            r3.getValue(r13, r0, r4)
            int r5 = r0.assetCookie
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data
            long r7 = (long) r7
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.m13322(r12, r5)
            if (r7 == 0) goto L56
            return r7
        L56:
            java.lang.CharSequence r8 = r0.string
            if (r8 == 0) goto Laa
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto Laa
            android.content.res.XmlResourceParser r3 = r3.getXml(r13)     // Catch: java.lang.Exception -> La0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r3)     // Catch: java.lang.Exception -> La0
        L6e:
            int r9 = r3.next()     // Catch: java.lang.Exception -> La0
            r10 = 2
            if (r9 == r10) goto L78
            if (r9 == r4) goto L78
            goto L6e
        L78:
            if (r9 != r10) goto La2
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Exception -> La0
            l.ܿ۠ r9 = r11.f16869     // Catch: java.lang.Exception -> La0
            r9.m40146(r13, r4)     // Catch: java.lang.Exception -> La0
            l.۫۠ r9 = r11.f16868     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r9.getOrDefault(r4, r1)     // Catch: java.lang.Exception -> La0
            l.֫᩸ r1 = (l.InterfaceC2082) r1     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto L95
            android.content.res.Resources$Theme r4 = r12.getTheme()     // Catch: java.lang.Exception -> La0
            android.graphics.drawable.Drawable r7 = r1.mo6600(r12, r3, r8, r4)     // Catch: java.lang.Exception -> La0
        L95:
            if (r7 == 0) goto Laa
            int r0 = r0.changingConfigurations     // Catch: java.lang.Exception -> La0
            r7.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> La0
            r11.m13324(r12, r5, r7)     // Catch: java.lang.Exception -> La0
            goto Laa
        La0:
            goto Laa
        La2:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch: java.lang.Exception -> La0
            throw r12     // Catch: java.lang.Exception -> La0
        Laa:
            if (r7 != 0) goto Lb1
            l.ܿ۠ r12 = r11.f16869
            r12.m40146(r13, r2)
        Lb1:
            return r7
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4800.m13320(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13326(String str, InterfaceC2082 interfaceC2082) {
        if (this.f16868 == null) {
            this.f16868 = new C12274();
        }
        this.f16868.put(str, interfaceC2082);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13325(Drawable drawable, C23851 c23851, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c23851.f77106;
            if (z || c23851.f77108) {
                PorterDuffColorFilter porterDuffColorFilterM13321 = null;
                ColorStateList colorStateList = z ? c23851.f77107 : null;
                PorterDuff.Mode mode = c23851.f77108 ? c23851.f77105 : f16863;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilterM13321 = m13321(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilterM13321);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m13330(Context context, int i, boolean z) {
        Drawable drawableM13320;
        boolean z2 = false;
        if (!this.f16870) {
            this.f16870 = true;
            Drawable drawableM13329 = m13329(context, R.drawable.MT_Protector);
            if (drawableM13329 == null || (!(drawableM13329 instanceof C19861) && !"android.graphics.drawable.VectorDrawable".equals(drawableM13329.getClass().getName()))) {
                this.f16870 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableM13320 = m13320(context, i);
        if (drawableM13320 == null) {
            drawableM13320 = m13328(context, i);
        }
        if (drawableM13320 == null) {
            drawableM13320 = C10405.m26304(context, i);
        }
        if (drawableM13320 != null) {
            ColorStateList colorStateListM13333 = m13333(context, i);
            PorterDuff.Mode mode = null;
            if (colorStateListM13333 != null) {
                drawableM13320 = C7603.m20139(drawableM13320.mutate());
                C7603.m20129(drawableM13320, colorStateListM13333);
                if (this.f16867 != null && i == R.drawable.MT_Protector) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    C7603.m20132(drawableM13320, mode);
                }
            } else {
                InterfaceC9845 interfaceC9845 = this.f16867;
                if (interfaceC9845 == null || !((C10821) interfaceC9845).m27133(context, i, drawableM13320)) {
                    InterfaceC9845 interfaceC9846 = this.f16867;
                    if (interfaceC9846 != null && ((C10821) interfaceC9846).m27134(context, i, drawableM13320)) {
                        z2 = true;
                    }
                    if (!z2 && z) {
                        drawableM13320 = null;
                    }
                }
            }
        }
        if (drawableM13320 != null) {
            C20946.m47120(drawableM13320);
        }
        return drawableM13320;
    }
}
