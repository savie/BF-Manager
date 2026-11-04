package l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O19Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C12529 extends C4326 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31131(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Font m31132(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM31131 = m31131(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM31132 = m31131(fontStyle, font2.getStyle());
            if (iM31132 < iM31131) {
                font = font2;
                iM31131 = iM31132;
            }
        }
        return font;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final C11258 mo13822(int i, C11258[] c11258Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo13821(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11638(Context context, C11258[] c11258Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C11258 c11258 : c11258Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c11258.m28499(), "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c11258.m28502()).setSlant(c11258.m28500() ? 1 : 0).setTtcIndex(c11258.m28501()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder != null) {
                FontFamily fontFamilyBuild = builder.build();
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m31132(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11637(Context context, C3252 c3252, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C20406 c20406 : c3252.m10611()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c20406.m46806()).setWeight(c20406.m46805()).setSlant(c20406.m46804() ? 1 : 0).setTtcIndex(c20406.m46803()).setFontVariationSettings(c20406.m46807()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m31132(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // l.C4326
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11636(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
