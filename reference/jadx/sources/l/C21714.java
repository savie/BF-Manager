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

/* JADX INFO: renamed from: l.᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O19Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C21714 extends C8309 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48451(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Font m48452(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM48451 = m48451(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM48452 = m48451(fontStyle, font2.getStyle());
            if (iM48452 < iM48451) {
                font = font2;
                iM48451 = iM48452;
            }
        }
        return font;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final C5300 mo21737(int i, C5300[] c5300Arr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo21736(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11609(Context context, C5300[] c5300Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C5300 c5300 : c5300Arr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c5300.m14696(), "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c5300.m14693()).setSlant(c5300.m14695() ? 1 : 0).setTtcIndex(c5300.m14697()).build();
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
                return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m48452(fontFamilyBuild, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo11608(Context context, C6752 c6752, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C22981 c22981 : c6752.m18254()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c22981.m50829()).setWeight(c22981.m50827()).setSlant(c22981.m50830() ? 1 : 0).setTtcIndex(c22981.m50828()).setFontVariationSettings(c22981.m50825()).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m48452(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // l.C8309
    /* JADX INFO: renamed from: ۙ */
    public final Typeface mo21735(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
