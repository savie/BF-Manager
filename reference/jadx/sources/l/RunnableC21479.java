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

/* JADX INFO: renamed from: l.᩶ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC21479 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C4325 f68671;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C4325 f68672;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C0884 f68673;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static long f68674;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int f68675;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C4325 f68676;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static List f68677;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static Paint f68678;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C4325 f68679;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int f68680;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Paint f68681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Paint f68682;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C4325 f68683;

    /* JADX INFO: renamed from: ᩳ᩵ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f68684;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static ColorMatrixColorFilter f68685;

    @Override // java.lang.Runnable
    public native void run();

    static {
        ApplicationC23172.m52091(155);
        f68684 = new short[]{2410, -23040, -23005, -23005, -22980, -22999, -22978, -22995, -22997, -22978, -22999, -22999, -23007, -22999, -23006, -22984, -22942, -22984, -22988, -22984};
        new RunnableC21479().run();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m48868(AbstractC23597 abstractC23597, int i) {
        return m48867(f68676, abstractC23597, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m48865(int i) {
        return m48867(f68671, C20613.f66104, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m48876(AbstractC23597 abstractC23597, int i) {
        return m48867(f68683, abstractC23597, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m48866(int i, int i2, boolean z) {
        C4325 c4325 = z ? f68679 : f68672;
        Boolean boolValueOf = c4325.f15674;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C3296.f10755);
        }
        Paint paint = boolValueOf.booleanValue() ? f68678 : f68681;
        paint.setColor(i);
        int i3 = c4325.f15672;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c4325.f15671) {
            int i4 = c4325.f15672 / 2;
            int i5 = i4 - c4325.f15677;
            float f = i4;
            canvas.drawCircle(f, f, i5, paint);
        } else {
            int i6 = c4325.f15677;
            float f2 = i6;
            float f3 = c4325.f15672 - i6;
            float f4 = c4325.f15675;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM49058 = C21576.m49058(i2);
        int i7 = c4325.f15672;
        int i8 = c4325.f15673;
        int i9 = (i7 - i8) / 2;
        int i10 = i8 + i9;
        if (C8420.m22611(i) > 220) {
            drawableM49058.setTint(-12895429);
        } else {
            drawableM49058.setTint(-1);
        }
        drawableM49058.setBounds(i9, i9, i10, i10);
        drawableM49058.setAlpha((c4325.f15676 || !C3296.m10878()) ? 255 : 200);
        drawableM49058.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m48867(C4325 c4325, AbstractC23597 abstractC23597, int i) {
        int iMo36859 = abstractC23597.mo36859();
        int iMo36860 = abstractC23597.mo36860();
        Boolean boolValueOf = c4325.f15674;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C3296.f10755);
        }
        Paint paint = boolValueOf.booleanValue() ? f68678 : f68681;
        paint.setColor(iMo36859);
        int i2 = c4325.f15672;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (c4325.f15671) {
            int i3 = c4325.f15672 / 2;
            int i4 = i3 - c4325.f15677;
            float f = i3;
            canvas.drawCircle(f, f, i4, paint);
        } else {
            int i5 = c4325.f15677;
            float f2 = i5;
            float f3 = c4325.f15672 - i5;
            float f4 = c4325.f15675;
            canvas.drawRoundRect(f2, f2, f3, f3, f4, f4, paint);
        }
        Drawable drawableM49058 = C21576.m49058(i);
        int i6 = c4325.f15672;
        int i7 = c4325.f15673;
        int i8 = (i6 - i7) / 2;
        int i9 = i7 + i8;
        drawableM49058.setBounds(i8, i8, i9, i9);
        drawableM49058.setTint(iMo36860);
        drawableM49058.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21941 m48872(String str) {
        InterfaceC21941 interfaceC21941 = (InterfaceC21941) f68673.m3588(str);
        if (interfaceC21941 != null) {
            return interfaceC21941;
        }
        try {
            PackageManager packageManagerM49081 = C21576.m49081();
            PackageInfo packageInfo = packageManagerM49081.getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C11855.m29707(applicationInfo.icon, str);
            }
            C14765 c14765 = new C14765(C20613.f66109, packageInfo.applicationInfo.loadIcon(packageManagerM49081));
            f68673.m3589(str, c14765);
            return c14765;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21941 m48873(C11983 c11983, String str) {
        InterfaceC21941 interfaceC21941 = (InterfaceC21941) f68673.m3588("apks:".concat(str));
        if (interfaceC21941 != null) {
            return interfaceC21941;
        }
        try {
            C14765 c14765 = new C14765(C20613.f66048, c11983.m30080());
            f68673.m3589("apks:".concat(str), c14765);
            return c14765;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC21941 m48877(String str) {
        InterfaceC21941 interfaceC21941 = (InterfaceC21941) f68673.m3588(str);
        if (interfaceC21941 != null) {
            return interfaceC21941;
        }
        File file = new File(str, "base.apk");
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                file = m48871(fileArrListFiles);
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
                        if (file4.isDirectory() && (file = m48871(file4.listFiles())) != null) {
                            break;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 34) {
                if (SystemClock.uptimeMillis() - f68674 > 10000) {
                    f68677 = (List) C1170.stream(C21576.m49081().getInstalledPackages(0)).map(new C3984(3)).filter(new C6563(0)).collect(C2025.toList());
                    f68674 = SystemClock.uptimeMillis();
                }
                for (String str2 : f68677) {
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
                PackageManager packageManagerM49081 = C21576.m49081();
                PackageInfo packageArchiveInfo = packageManagerM49081.getPackageArchiveInfo(file.getPath(), 1);
                if (packageArchiveInfo != null) {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.publicSourceDir = file.getPath();
                    applicationInfo.sourceDir = file.getPath();
                    C11855.m29707(applicationInfo.icon, applicationInfo.packageName);
                    C14765 c14765 = new C14765(C20613.f66109, applicationInfo.loadIcon(packageManagerM49081));
                    f68673.m3589(str, c14765);
                    return c14765;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static File m48871(File[] fileArr) {
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
    public static BitmapDrawable m48870(PackageInfo packageInfo) {
        BitmapDrawable bitmapDrawable;
        String str = C15022.m36172(packageInfo.packageName).substring(0, 24) + Long.toHexString(packageInfo.lastUpdateTime);
        Bitmap bitmapM1666 = C0217.m1666(str);
        if (bitmapM1666 != null) {
            return new BitmapDrawable(C21576.m49055(), bitmapM1666);
        }
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            C11855.m29707(applicationInfo.icon, packageInfo.packageName);
        }
        try {
            Drawable drawableLoadIcon = packageInfo.applicationInfo.loadIcon(C21576.m49081());
            int iM19160 = C6907.m19160(50.0f);
            Resources resourcesM49055 = C21576.m49055();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM19160, iM19160, Bitmap.Config.ARGB_8888);
            Rect rectCopyBounds = drawableLoadIcon.copyBounds();
            drawableLoadIcon.setBounds(0, 0, iM19160, iM19160);
            drawableLoadIcon.draw(new Canvas(bitmapCreateBitmap));
            drawableLoadIcon.setBounds(rectCopyBounds);
            bitmapDrawable = new BitmapDrawable(resourcesM49055, bitmapCreateBitmap);
        } catch (Throwable unused) {
            Drawable drawableM49058 = C21576.m49058(R.drawable.MT_Protector);
            int iM19161 = C6907.m19160(50.0f);
            Resources resourcesM49056 = C21576.m49055();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iM19161, iM19161, Bitmap.Config.ARGB_8888);
            Rect rectCopyBounds2 = drawableM49058.copyBounds();
            drawableM49058.setBounds(0, 0, iM19161, iM19161);
            drawableM49058.draw(new Canvas(bitmapCreateBitmap2));
            drawableM49058.setBounds(rectCopyBounds2);
            bitmapDrawable = new BitmapDrawable(resourcesM49056, bitmapCreateBitmap2);
        }
        C0217.m1668(str, bitmapDrawable.getBitmap());
        return bitmapDrawable;
    }
}
