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

/* JADX INFO: renamed from: l.ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C16775 extends AbstractC0104 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f53688 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53689 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ColorStateList f53690;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f53691;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f53692;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f53693;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Parcelable f53694;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53695;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f53696;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f53697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53698;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f53699;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16775 m39334(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        C16775 c16775 = new C16775(2);
        c16775.f53698 = i;
        if (resources != null) {
            try {
                c16775.f53691 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            c16775.f53691 = str;
        }
        c16775.f53699 = str;
        return c16775;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16775 m39337(Bitmap bitmap) {
        bitmap.getClass();
        C16775 c16775 = new C16775(1);
        c16775.f53691 = bitmap;
        return c16775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16775 m39336(Icon icon) {
        icon.getClass();
        int iM47181 = C21008.m47181(icon);
        if (iM47181 == 2) {
            return m39334((Resources) null, C21008.m47182(icon), C21008.m47178(icon));
        }
        if (iM47181 == 4) {
            Uri uriM47177 = C21008.m47177(icon);
            uriM47177.getClass();
            String string = uriM47177.toString();
            string.getClass();
            C16775 c16775 = new C16775(4);
            c16775.f53691 = string;
            return c16775;
        }
        if (iM47181 != 6) {
            C16775 c16776 = new C16775(-1);
            c16776.f53691 = icon;
            return c16776;
        }
        Uri uriM47178 = C21008.m47177(icon);
        uriM47178.getClass();
        String string2 = uriM47178.toString();
        string2.getClass();
        C16775 c16777 = new C16775(6);
        c16777.f53691 = string2;
        return c16777;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16775 m39335(Bitmap bitmap) {
        C16775 c16775 = new C16775(5);
        c16775.f53691 = bitmap;
        return c16775;
    }

    public C16775() {
        this.f53695 = -1;
        this.f53693 = null;
        this.f53694 = null;
        this.f53698 = 0;
        this.f53696 = 0;
        this.f53690 = null;
        this.f53697 = f53688;
        this.f53692 = null;
    }

    public C16775(int i) {
        this.f53693 = null;
        this.f53694 = null;
        this.f53698 = 0;
        this.f53696 = 0;
        this.f53690 = null;
        this.f53697 = f53688;
        this.f53692 = null;
        this.f53695 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m39338() {
        int i = this.f53695;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C21008.m47181(this.f53691);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m39343() {
        int i = this.f53695;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C21008.m47182(this.f53691);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        String str = this.f53699;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.f53691).split(":", -1)[0];
        }
        return this.f53699;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m39344() {
        int i = this.f53695;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C21008.m47178(this.f53691);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.f53698;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m39339() {
        int i = this.f53695;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f53691;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f53691;
        }
        if (i == 5) {
            return m39333((Bitmap) this.f53691, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Uri m39342() {
        int i = this.f53695;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C21008.m47177(this.f53691);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f53691);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Icon m39345(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C21008.m47180(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39341(Intent intent, Drawable drawable, Context context) {
        Bitmap bitmapCopy;
        Object obj;
        Resources resourcesForApplication;
        if (this.f53695 == 2 && (obj = this.f53691) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strM39343 = m39343();
                    if ("android".equals(strM39343)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strM39343, 8192);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException unused) {
                            StringBuilder sb = new StringBuilder("Unable to find pkg=");
                            sb.append(strM39343);
                            sb.append(" for icon");
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (this.f53698 != identifier) {
                        this.f53698 = identifier;
                    }
                }
            }
        }
        int i = this.f53695;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.f53691;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(m39343(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.f53698));
                    return;
                }
                Drawable drawableM26304 = C10405.m26304(contextCreatePackageContext, this.f53698);
                if (drawableM26304.getIntrinsicWidth() <= 0 || drawableM26304.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawableM26304.getIntrinsicWidth(), drawableM26304.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawableM26304.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawableM26304.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.f53691, e);
            }
        } else if (i == 5) {
            bitmapCopy = m39333((Bitmap) this.f53691, true);
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
    public final InputStream m39340(Context context) {
        Uri uriM39342 = m39342();
        String scheme = uriM39342.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM39342);
            } catch (Exception unused) {
                uriM39342.toString();
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f53691));
        } catch (FileNotFoundException unused2) {
            uriM39342.toString();
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f53695 == -1) {
            return String.valueOf(this.f53691);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f53695) {
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
        switch (this.f53695) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f53691).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f53691).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f53699);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m39344())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f53698);
                if (this.f53696 != 0) {
                    sb.append(" off=");
                    sb.append(this.f53696);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f53691);
                break;
        }
        if (this.f53690 != null) {
            sb.append(" tint=");
            sb.append(this.f53690);
        }
        if (this.f53697 != f53688) {
            sb.append(" mode=");
            sb.append(this.f53697);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m39333(Bitmap bitmap, boolean z) {
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
