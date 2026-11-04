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

/* JADX INFO: renamed from: l.۠ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AMJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8392 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11132 m22555(Activity activity, FoldingFeature foldingFeature) {
        C22321 c22321;
        C13612 c13612;
        Rect rectM27541;
        int i;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                c22321 = C22321.f72250;
            }
            return null;
        }
        c22321 = C22321.f72251;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                c13612 = C13612.f43238;
            }
            return null;
        }
        c13612 = C13612.f43239;
        Rect bounds = foldingFeature.getBounds();
        C15243.m36591(bounds, "oemFeature.bounds");
        C17342 c17342 = new C17342(bounds);
        C10803.f34284.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rectM27541 = C0189.m1547(activity);
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
                rectM27541 = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException unused) {
                rectM27541 = C10803.m27541(activity);
            } catch (NoSuchFieldException unused2) {
                rectM27541 = C10803.m27541(activity);
            } catch (NoSuchMethodException unused3) {
                rectM27541 = C10803.m27541(activity);
            } catch (InvocationTargetException unused4) {
                rectM27541 = C10803.m27541(activity);
            }
        } else if (i2 >= 28) {
            rectM27541 = C10803.m27541(activity);
        } else if (i2 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!C18088.m42152(activity)) {
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
            rectM27541 = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            C15243.m36591(defaultDisplay2, "defaultDisplay");
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
            rectM27541 = rect2;
        }
        Rect rectM14868 = new C4838(rectM27541).m14868();
        if ((c17342.m40720() != 0 || c17342.m40724() != 0) && ((c17342.m40724() == rectM14868.width() || c17342.m40720() == rectM14868.height()) && ((c17342.m40724() >= rectM14868.width() || c17342.m40720() >= rectM14868.height()) && (c17342.m40724() != rectM14868.width() || c17342.m40720() != rectM14868.height())))) {
            Rect bounds2 = foldingFeature.getBounds();
            C15243.m36591(bounds2, "oemFeature.bounds");
            return new C11132(new C17342(bounds2), c22321, c13612);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14115 m22556(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C11132 c11132M22555;
        C15243.m36590(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C15243.m36591(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C15243.m36591(foldingFeature, "feature");
                c11132M22555 = m22555(activity, foldingFeature);
            } else {
                c11132M22555 = null;
            }
            if (c11132M22555 != null) {
                arrayList.add(c11132M22555);
            }
        }
        return new C14115(arrayList);
    }
}
