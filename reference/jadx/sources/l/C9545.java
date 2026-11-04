package l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9545 extends AbstractC16714 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f30895 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30896 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f30897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f30898;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f30899;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30900;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f30901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ColorStateList f30902;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f30903;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Parcelable f30904;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f30906;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9545 m24960(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        C9545 c9545 = new C9545(2);
        c9545.f30905 = i;
        if (resources != null) {
            try {
                c9545.f30906 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            c9545.f30906 = str;
        }
        c9545.f30903 = str;
        return c9545;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9545 m24962(Bitmap bitmap) {
        bitmap.getClass();
        C9545 c9545 = new C9545(1);
        c9545.f30906 = bitmap;
        return c9545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9545 m24961(Bitmap bitmap) {
        C9545 c9545 = new C9545(5);
        c9545.f30906 = bitmap;
        return c9545;
    }

    public C9545() {
        this.f30901 = -1;
        this.f30898 = null;
        this.f30904 = null;
        this.f30905 = 0;
        this.f30900 = 0;
        this.f30902 = null;
        this.f30899 = f30895;
        this.f30897 = null;
    }

    public C9545(int i) {
        this.f30898 = null;
        this.f30904 = null;
        this.f30905 = 0;
        this.f30900 = 0;
        this.f30902 = null;
        this.f30899 = f30895;
        this.f30897 = null;
        this.f30901 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m24970() {
        int i;
        int i2 = this.f30901;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            return i2;
        }
        Object obj = this.f30906;
        if (i >= 28) {
            return C10291.m26523(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            C17359.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            C17359.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            C17359.toString(obj);
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m24966() {
        int i;
        int i2 = this.f30901;
        if (i2 == -1 && (i = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f30906;
            if (i >= 28) {
                return C10291.m26524(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i2 != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        String str = this.f30903;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.f30906).split(":", -1)[0];
        }
        return this.f30903;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24968() {
        int i;
        int i2 = this.f30901;
        if (i2 != -1 || (i = Build.VERSION.SDK_INT) < 23) {
            if (i2 != 2) {
                throw new IllegalStateException("called getResId() on " + this);
            }
            return this.f30905;
        }
        Object obj = this.f30906;
        if (i >= 28) {
            return C10291.m26522(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m24963() {
        int i = this.f30901;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f30906;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f30906;
        }
        if (i == 5) {
            return m24959((Bitmap) this.f30906, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri m24967() {
        int i = this.f30901;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C8055.m21945(this.f30906);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f30906);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Icon m24969(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C8055.m21944(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24965(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmapCopy;
        Object obj;
        Resources resourcesForApplication;
        if (this.f30901 == 2 && (obj = this.f30906) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strM24966 = m24966();
                    if ("android".equals(strM24966)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strM24966, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException unused) {
                            StringBuilder sb = new StringBuilder("Unable to find pkg=");
                            sb.append(strM24966);
                            sb.append(" for icon");
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (this.f30905 != identifier) {
                        this.f30905 = identifier;
                    }
                }
            }
        }
        int i = this.f30901;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.f30906;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m24966(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f30905));
                    return;
                }
                Drawable drawableM20563 = C7508.m20563(contextCreatePackageContext, this.f30905);
                if (drawableM20563.getIntrinsicWidth() <= 0 || drawableM20563.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM20563.getIntrinsicWidth(), drawableM20563.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM20563.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM20563.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f30906, e);
            }
        } else if (i == 5) {
            bitmapCopy = m24959((Bitmap) this.f30906, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m24964(Context context) {
        Uri uriM24967 = m24967();
        String scheme = uriM24967.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM24967);
            } catch (Exception unused) {
                uriM24967.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f30906));
        } catch (FileNotFoundException unused2) {
            uriM24967.toString();
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f30901 == -1) {
            return String.valueOf(this.f30906);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f30901) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f30901) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f30906).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f30906).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f30903);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m24968())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f30905);
                if (this.f30900 != 0) {
                    sb.append(" off=");
                    sb.append(this.f30900);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f30906);
                break;
        }
        if (this.f30902 != null) {
            sb.append(" tint=");
            sb.append(this.f30902);
        }
        if (this.f30899 != f30895) {
            sb.append(" mode=");
            sb.append(this.f30899);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m24959(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
