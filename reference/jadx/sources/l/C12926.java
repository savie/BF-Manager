package l;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12926 extends C16655 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f41400;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Field f41401;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f41402;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Constructor f41403;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public WindowInsets f41404;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13275 f41405;

    public C12926() {
        this.f41404 = m32275();
    }

    public C12926(C3977 c3977) {
        super(c3977);
        this.f41404 = c3977.m12827();
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩸ */
    public void mo28785(C13275 c13275) {
        WindowInsets windowInsets = this.f41404;
        if (windowInsets != null) {
            this.f41404 = windowInsets.replaceSystemWindowInsets(c13275.f42407, c13275.f42408, c13275.f42406, c13275.f42405);
        }
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩷ */
    public void mo28784(C13275 c13275) {
        this.f41405 = c13275;
    }

    @Override // l.C16655
    /* JADX INFO: renamed from: ᩷ */
    public C3977 mo28783() {
        m39361();
        C3977 c3977M12812 = C3977.m12812(null, this.f41404);
        c3977M12812.m12821(this.f53803);
        c3977M12812.m12820(this.f41405);
        return c3977M12812;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m32275() {
        if (!f41400) {
            try {
                f41401 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f41400 = true;
        }
        Field field = f41401;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f41402) {
            try {
                f41403 = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f41402 = true;
        }
        Constructor constructor = f41403;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }
}
