package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C8309 {
    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11608(Context context, C6752 c6752, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11609(Context context, C5300[] c5300Arr, int i) {
        throw null;
    }

    public C8309() {
        new ConcurrentMapC13783();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5300 mo21737(int i, C5300[] c5300Arr) {
        C18186 c18186 = new C18186();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C5300 c5300 = null;
        int i3 = Integer.MAX_VALUE;
        for (C5300 c5301 : c5300Arr) {
            int iAbs = (Math.abs(c18186.mo42310(c5301) - i2) * 2) + (c18186.mo42309(c5301) == z ? 0 : 1);
            if (c5300 == null || i3 > iAbs) {
                c5300 = c5301;
                i3 = iAbs;
            }
        }
        return c5300;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo21736(Context context, InputStream inputStream) {
        File fileM44692 = C19598.m44692(context);
        if (fileM44692 == null) {
            return null;
        }
        try {
            if (C19598.m44696(fileM44692, inputStream)) {
                return Typeface.createFromFile(fileM44692.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM44692.delete();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo21735(Context context, Resources resources, int i, String str, int i2) {
        File fileM44692 = C19598.m44692(context);
        if (fileM44692 == null) {
            return null;
        }
        try {
            if (C19598.m44695(fileM44692, resources, i)) {
                return Typeface.createFromFile(fileM44692.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM44692.delete();
        }
    }
}
