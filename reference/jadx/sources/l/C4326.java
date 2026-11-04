package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5Z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C4326 {
    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11637(Context context, C3252 c3252, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11638(Context context, C11258[] c11258Arr, int i) {
        throw null;
    }

    public C4326() {
        new ConcurrentMapC17249();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11258 mo13822(int i, C11258[] c11258Arr) {
        C6564 c6564 = new C6564();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C11258 c11258 = null;
        int i3 = Integer.MAX_VALUE;
        for (C11258 c11259 : c11258Arr) {
            int iAbs = (Math.abs(c6564.mo18483(c11259) - i2) * 2) + (c6564.mo18482(c11259) == z ? 0 : 1);
            if (c11258 == null || i3 > iAbs) {
                c11258 = c11259;
                i3 = iAbs;
            }
        }
        return c11258;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Typeface mo13821(Context context, InputStream inputStream) {
        File fileM35533 = C14766.m35533(context);
        if (fileM35533 == null) {
            return null;
        }
        try {
            if (C14766.m35537(fileM35533, inputStream)) {
                return Typeface.createFromFile(fileM35533.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM35533.delete();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public Typeface mo11636(Context context, Resources resources, int i, String str, int i2) {
        File fileM35533 = C14766.m35533(context);
        if (fileM35533 == null) {
            return null;
        }
        try {
            if (C14766.m35536(fileM35533, resources, i)) {
                return Typeface.createFromFile(fileM35533.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM35533.delete();
        }
    }
}
