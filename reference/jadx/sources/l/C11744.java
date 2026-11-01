package l;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AMJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11744 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13155 m29350(Activity activity, FoldingFeature foldingFeature) {
        C1159 c1159;
        C5393 c5393;
        Rect rectM32312;
        int i;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                c1159 = C1159.f5183;
            }
            return null;
        }
        c1159 = C1159.f5184;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                c5393 = C5393.f18618;
            }
            return null;
        }
        c5393 = C5393.f18619;
        Rect bounds = foldingFeature.getBounds();
        C13465.m32967(bounds, "oemFeature.bounds");
        C8653 c8653 = new C8653(bounds);
        C13093.f43601.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rectM32312 = C23470.m51714(activity);
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectM32312 = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException unused) {
                rectM32312 = C13093.m32312(activity);
            } catch (NoSuchFieldException unused2) {
                rectM32312 = C13093.m32312(activity);
            } catch (NoSuchMethodException unused3) {
                rectM32312 = C13093.m32312(activity);
            } catch (InvocationTargetException unused4) {
                rectM32312 = C13093.m32312(activity);
            }
        } else if (i2 >= 28) {
            rectM32312 = C13093.m32312(activity);
        } else if (i2 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!C10770.m27069(activity)) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect.bottom = i3;
                } else {
                    int i4 = rect.right + dimensionPixelSize;
                    if (i4 == point.x) {
                        rect.right = i4;
                    }
                }
            }
            rectM32312 = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            C13465.m32967(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i5 = point2.x;
            if (i5 == 0 || (i = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect2);
            } else {
                rect2.right = i5;
                rect2.bottom = i;
            }
            rectM32312 = rect2;
        }
        Rect rectM49432 = new C22265(rectM32312).m49432();
        if ((c8653.m22454() != 0 || c8653.m22453() != 0) && ((c8653.m22453() == rectM49432.width() || c8653.m22454() == rectM49432.height()) && ((c8653.m22453() >= rectM49432.width() || c8653.m22454() >= rectM49432.height()) && (c8653.m22453() != rectM49432.width() || c8653.m22454() != rectM49432.height())))) {
            Rect bounds2 = foldingFeature.getBounds();
            C13465.m32967(bounds2, "oemFeature.bounds");
            return new C13155(new C8653(bounds2), c1159, c5393);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5331 m29349(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C13155 c13155M29350;
        C13465.m32966(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C13465.m32967(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C13465.m32967(foldingFeature, "feature");
                c13155M29350 = m29350(activity, foldingFeature);
            } else {
                c13155M29350 = null;
            }
            if (c13155M29350 != null) {
                arrayList.add(c13155M29350);
            }
        }
        return new C5331(arrayList);
    }
}
