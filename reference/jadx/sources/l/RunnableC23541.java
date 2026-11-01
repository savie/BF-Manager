package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23541 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Paint f76234;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List f76235;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f76236;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static long f76237;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C5901 f76238;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int f76239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5901 f76240;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C5901 f76241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C10157 f76242;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static Paint f76243;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5901 f76244;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C5901 f76245;

    /* JADX INFO: renamed from: ܿ᩻֫, reason: not valid java name and contains not printable characters */
    private static final short[] f76246;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static ColorMatrixColorFilter f76247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Paint f76248;

    @Override // java.lang.Runnable
    public native void run();

    static {
        ApplicationC6132.m17119(167);
        f76246 = new short[]{6793, 32248, 32219, 32219, 32196, 32209, 32198, 32213, 32211, 32198, 32209, 32209, 32217, 32209, 32218, 32192, 32154, 32192, 32204, 32192};
        new RunnableC23541().run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51893(AbstractC16214 abstractC16214, int i) {
        return m51892(f76241, abstractC16214, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51890(int i) {
        return m51892(f76244, C0690.f2885, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51902(AbstractC16214 abstractC16214, int i) {
        return m51892(f76245, abstractC16214, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51891(int i, int i2, boolean z) {
        C5901 c5901 = z ? f76238 : f76240;
        Boolean boolValueOf = c5901.f20139;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C20368.f65967);
        }
        Paint paint = boolValueOf.booleanValue() ? f76248 : f76243;
        paint.setColor(i);
        int i3 = c5901.f20137;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c5901.f20135) {
            int i4 = c5901.f20137 / 2;
            int i5 = i4 - c5901.f20134;
            float f = i4;
            canvas.drawCircle(f, f, i5, paint);
        } else {
            int i6 = c5901.f20134;
            float f2 = i6;
            float f3 = c5901.f20137 - i6;
            float f4 = c5901.f20136;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM39263 = C16737.m39263(i2);
        int i7 = c5901.f20137;
        int i8 = c5901.f20133;
        int i9 = (i7 - i8) / 2;
        int i10 = i8 + i9;
        if (C3057.m9159(i) > 220) {
            drawableM39263.setTint(-12895429);
        } else {
            drawableM39263.setTint(-1);
        }
        drawableM39263.setBounds(i9, i9, i10, i10);
        drawableM39263.setAlpha((c5901.f20138 || !C20368.m45991()) ? 255 : 200);
        drawableM39263.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51892(C5901 c5901, AbstractC16214 abstractC16214, int i) {
        int iMo38326 = abstractC16214.mo38326();
        int iMo38328 = abstractC16214.mo38328();
        Boolean boolValueOf = c5901.f20139;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C20368.f65967);
        }
        Paint paint = boolValueOf.booleanValue() ? f76248 : f76243;
        paint.setColor(iMo38326);
        int i2 = c5901.f20137;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c5901.f20135) {
            int i3 = c5901.f20137 / 2;
            int i4 = i3 - c5901.f20134;
            float f = i3;
            canvas.drawCircle(f, f, i4, paint);
        } else {
            int i5 = c5901.f20134;
            float f2 = i5;
            float f3 = c5901.f20137 - i5;
            float f4 = c5901.f20136;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM39263 = C16737.m39263(i);
        int i6 = c5901.f20137;
        int i7 = c5901.f20133;
        int i8 = (i6 - i7) / 2;
        int i9 = i7 + i8;
        drawableM39263.setBounds(i8, i8, i9, i9);
        drawableM39263.setTint(iMo38328);
        drawableM39263.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4968 m51898(String str) {
        InterfaceC4968 interfaceC4968 = (InterfaceC4968) f76242.m25800(str);
        if (interfaceC4968 != null) {
            return interfaceC4968;
        }
        try {
            PackageManager packageManagerM39292 = C16737.m39292();
            PackageInfo packageInfo = packageManagerM39292.getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C17916.m41608(applicationInfo.icon, str);
            }
            C10841 c10841 = new C10841(C0690.f2900, packageInfo.applicationInfo.loadIcon(packageManagerM39292));
            f76242.m25801(str, c10841);
            return c10841;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4968 m51899(C14600 c14600, String str) {
        InterfaceC4968 interfaceC4968 = (InterfaceC4968) f76242.m25800("apks:".concat(str));
        if (interfaceC4968 != null) {
            return interfaceC4968;
        }
        try {
            C10841 c10841 = new C10841(C0690.f2882, c14600.m35074());
            f76242.m25801("apks:".concat(str), c10841);
            return c10841;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4968 m51903(String str) {
        InterfaceC4968 interfaceC4968 = (InterfaceC4968) f76242.m25800(str);
        if (interfaceC4968 != null) {
            return interfaceC4968;
        }
        File file = new File(str, "base.apk");
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                file = m51897(fileArrListFiles);
                if (file == null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            File file3 = new File(file2, "base.apk");
                            if (file3.exists()) {
                                file = file3;
                                break;
                            }
                        }
                    }
                }
                if (file == null) {
                    for (File file4 : fileArrListFiles) {
                        if (file4.isDirectory() && (file = m51897(file4.listFiles())) != null) {
                            break;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 34) {
                if (SystemClock.uptimeMillis() - f76237 > 10000) {
                    int i = 0;
                    f76235 = (List) C9030.stream(C16737.m39292().getInstalledPackages(0)).map(new C16485(i)).filter(new C12252(i)).collect(C1890.toList());
                    f76237 = SystemClock.uptimeMillis();
                }
                for (String str2 : f76235) {
                    if (str2.startsWith(str)) {
                        File file5 = new File(str2);
                        if (file5.exists()) {
                            file = file5;
                            break;
                        }
                    }
                }
            }
        }
        if (file != null) {
            try {
                PackageManager packageManagerM39292 = C16737.m39292();
                PackageInfo packageArchiveInfo = packageManagerM39292.getPackageArchiveInfo(file.getPath(), 1);
                if (packageArchiveInfo != null) {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.publicSourceDir = file.getPath();
                    applicationInfo.sourceDir = file.getPath();
                    C17916.m41608(applicationInfo.icon, applicationInfo.packageName);
                    C10841 c10841 = new C10841(C0690.f2900, applicationInfo.loadIcon(packageManagerM39292));
                    f76242.m25801(str, c10841);
                    return c10841;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m51897(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".apk")) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitmapDrawable m51896(Drawable drawable) {
        int iM33769 = C13932.m33769(50.0f);
        Resources resourcesM39279 = C16737.m39279();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM33769, iM33769, Bitmap.Config.ARGB_8888);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, iM33769, iM33769);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(rectCopyBounds);
        return new BitmapDrawable(resourcesM39279, bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitmapDrawable m51895(PackageInfo packageInfo) {
        BitmapDrawable bitmapDrawableM51896;
        String str = C22253.m49414(packageInfo.packageName).substring(0, 24) + Long.toHexString(packageInfo.lastUpdateTime);
        Bitmap bitmapM40091 = C17169.m40091(str);
        if (bitmapM40091 != null) {
            return new BitmapDrawable(C16737.m39279(), bitmapM40091);
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            C17916.m41608(applicationInfo.icon, packageInfo.packageName);
        }
        try {
            bitmapDrawableM51896 = m51896(packageInfo.applicationInfo.loadIcon(C16737.m39292()));
        } catch (Throwable unused) {
            bitmapDrawableM51896 = m51896(C16737.m39263(R.drawable.MT_Protector));
        }
        C17169.m40093(str, bitmapDrawableM51896.getBitmap());
        return bitmapDrawableM51896;
    }
}
