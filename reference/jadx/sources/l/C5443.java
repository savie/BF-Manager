package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۚܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5443 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static WeakReference f18770;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Paint f18769 = new Paint(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f18771 = C13932.m33769(32.0f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15048(InterfaceC13911 interfaceC13911) {
        int i;
        Bitmap bitmapM15056;
        if (interfaceC13911 != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                final C2620 c2620 = new C2620(interfaceC13911);
                int iMax = 1;
                try {
                    options.inJustDecodeBounds = true;
                    C10854 c10854M51915 = C23554.m51915(c2620.f10237, new InterfaceC17203() { // from class: l.ܳ᩺᩺
                        @Override // l.InterfaceC17203
                        public final BitmapFactory.Options read() throws IOException {
                            InputStream inputStreamM8091 = c2620.m8091(true);
                            BitmapFactory.Options options2 = options;
                            BitmapFactory.decodeStream(inputStreamM8091, null, options2);
                            return options2;
                        }
                    });
                    EnumC5914 enumC5914 = c10854M51915.f36926;
                    if (enumC5914 != EnumC5914.UNKNOWN) {
                        if (enumC5914 == EnumC5914.SVG) {
                            bitmapM15056 = m15047(c2620.m8091(false));
                        } else if (enumC5914 != EnumC5914.TGA) {
                            if (c10854M51915.f36925 == null) {
                                BitmapFactory.decodeStream(c2620.m8091(true), null, options);
                            }
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            if (i2 > 0 && i3 > 0) {
                                try {
                                    int iM9015 = new C3021(c2620.m8091(true), 0).m9015();
                                    if (iM9015 == 3) {
                                        i = 180;
                                    } else if (iM9015 != 6) {
                                        i = iM9015 != 8 ? 0 : BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                    } else {
                                        i = 90;
                                    }
                                } catch (Exception unused) {
                                }
                                int i4 = f18771;
                                if (i2 <= i3 && i2 > i4) {
                                    iMax = Math.max(1, i2 / i4);
                                } else if (i2 >= i3 && i3 > i4) {
                                    iMax = Math.max(1, i3 / i4);
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = iMax;
                                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c2620.m8091(false), null, options);
                                if (bitmapDecodeStream != null) {
                                    Bitmap bitmapM15054 = m15054(bitmapDecodeStream, i4, i2, i3);
                                    if (i != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i);
                                        bitmapM15054 = Bitmap.createBitmap(bitmapM15054, 0, 0, bitmapM15054.getWidth(), bitmapM15054.getHeight(), matrix, false);
                                    }
                                    m15059(bitmapM15054);
                                    c2620.close();
                                    return bitmapM15054;
                                }
                                c2620.close();
                            }
                        } else if (interfaceC13911.length() <= 268435456) {
                            bitmapM15056 = m15056(c2620.m8091(false));
                            m15059(bitmapM15056);
                        }
                        c2620.close();
                        return bitmapM15056;
                    }
                    c2620.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        c2620.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f A[LOOP:0: B:12:0x0052->B:14:0x005f, LOOP_END] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15056(InputStream inputStream) throws Throwable {
        float f;
        float f2;
        float f3;
        int i;
        Bitmap bitmapM6733;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        C11338 c11338M6735 = C2164.m6735(inputStream);
        int i2 = c11338M6735.f38258;
        int i3 = c11338M6735.f38250;
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(i2, i3);
        int i4 = f18771;
        try {
            try {
                if (iMax <= 500) {
                    if (iMax > i4) {
                        f2 = iMin;
                        if (iMax / f2 > 3.0f) {
                            f3 = i4 / 3.0f;
                        }
                        float f4 = i4;
                        double d = f4 / f;
                        int iMin2 = Math.min(i2, (int) Math.ceil(d));
                        int iMin3 = Math.min(i3, (int) Math.ceil(d));
                        int i5 = (i2 - iMin2) / 2;
                        int i6 = (i3 - iMin3) / 2;
                        Rect rect = new Rect(i5, i6, i5 + iMin2, i6 + iMin3);
                        i = 1;
                        while (i * 2.0f * f <= 1.0f) {
                            i *= 2;
                        }
                        bitmapM6733 = C2164.m6733(inputStream, c11338M6735, rect, i, new C2144());
                        bitmap = null;
                        bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        float f5 = iMin2 * f;
                        float f6 = iMin3 * f;
                        Paint paint = new Paint();
                        paint.setFilterBitmap(false);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM6733, (Rect) null, new RectF((f4 - f5) / 2.0f, (f4 - f6) / 2.0f, (f5 + f4) / 2.0f, (f4 + f6) / 2.0f), paint);
                        bitmapM6733.recycle();
                        return bitmapCreateBitmap;
                    }
                    f = i4 / iMax;
                    float f7 = i4;
                    double d2 = f7 / f;
                    int iMin4 = Math.min(i2, (int) Math.ceil(d2));
                    int iMin5 = Math.min(i3, (int) Math.ceil(d2));
                    int i7 = (i2 - iMin4) / 2;
                    int i8 = (i3 - iMin5) / 2;
                    Rect rect2 = new Rect(i7, i8, i7 + iMin4, i8 + iMin5);
                    i = 1;
                    while (i * 2.0f * f <= 1.0f) {
                        i *= 2;
                    }
                    bitmapM6733 = C2164.m6733(inputStream, c11338M6735, rect2, i, new C2144());
                    bitmap = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    float f8 = iMin4 * f;
                    float f9 = iMin5 * f;
                    Paint paint2 = new Paint();
                    paint2.setFilterBitmap(false);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM6733, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint2);
                    bitmapM6733.recycle();
                    return bitmapCreateBitmap;
                }
                f3 = i4;
                f2 = iMin;
                Paint paint3 = new Paint();
                paint3.setFilterBitmap(false);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM6733, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint3);
                bitmapM6733.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                bitmapM6733.recycle();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
            float f10 = iMin4 * f;
            float f11 = iMin5 * f;
        } catch (Throwable th2) {
            th = th2;
        }
        f = f3 / f2;
        float f12 = i4;
        double d3 = f12 / f;
        int iMin6 = Math.min(i2, (int) Math.ceil(d3));
        int iMin7 = Math.min(i3, (int) Math.ceil(d3));
        int i9 = (i2 - iMin6) / 2;
        int i10 = (i3 - iMin7) / 2;
        Rect rect3 = new Rect(i9, i10, i9 + iMin6, i10 + iMin7);
        i = 1;
        while (i * 2.0f * f <= 1.0f) {
            i *= 2;
        }
        bitmapM6733 = C2164.m6733(inputStream, c11338M6735, rect3, i, new C2144());
        bitmap = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15057(InterfaceC13911 interfaceC13911) {
        C6037 c6037;
        XmlResourceParserC11068 xmlResourceParserC11068M47106;
        C21111 c21111M47538;
        if (interfaceC13911 != null) {
            try {
                if (interfaceC13911.length() <= 153600) {
                    InputStream inputStreamMo10545 = interfaceC13911.mo10545();
                    try {
                        inputStreamMo10545.mark(4);
                        if ((inputStreamMo10545.read() & 255) == 3 && (inputStreamMo10545.read() & 255) == 0) {
                            inputStreamMo10545.reset();
                            if (interfaceC13911 instanceof InterfaceC9907) {
                                c6037 = ((InterfaceC9907) interfaceC13911).mo25096();
                                int i = C21111.f68767;
                                xmlResourceParserC11068M47106 = C20945.m47094(inputStreamMo10545).m47106();
                            } else {
                                c6037 = new C6037();
                                int i2 = C21111.f68767;
                                xmlResourceParserC11068M47106 = C20945.m47094(inputStreamMo10545).m47106();
                            }
                            try {
                                c21111M47538 = C21111.m47538(xmlResourceParserC11068M47106, c6037, false);
                            } catch (Exception unused) {
                                c21111M47538 = null;
                            }
                            inputStreamMo10545.close();
                            if (c21111M47538 != null) {
                                int i3 = f18771;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Rect rectCopyBounds = c21111M47538.copyBounds();
                                int intrinsicWidth = c21111M47538.getIntrinsicWidth();
                                int intrinsicHeight = c21111M47538.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight) {
                                    int i4 = (int) ((i3 / intrinsicWidth) * intrinsicHeight);
                                    int i5 = (i3 - i4) / 2;
                                    c21111M47538.setBounds(0, i5, i3, i4 + i5);
                                } else {
                                    int i6 = (int) ((i3 / intrinsicHeight) * intrinsicWidth);
                                    int i7 = (i3 - i6) / 2;
                                    c21111M47538.setBounds(i7, 0, i6 + i7, i3);
                                }
                                c21111M47538.draw(canvas);
                                c21111M47538.setBounds(rectCopyBounds);
                                m15059(bitmapCreateBitmap);
                                return bitmapCreateBitmap;
                            }
                        }
                        inputStreamMo10545.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo10545.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15047(InputStream inputStream) {
        int i;
        try {
            C11644 c11644M29083 = C11644.m29083(inputStream);
            RectF rectFM29095 = c11644M29083.m29095();
            int iM29084 = (int) c11644M29083.m29084();
            int iM29096 = (int) c11644M29083.m29096();
            if (iM29084 == -1 && iM29096 == -1) {
                iM29084 = (int) (rectFM29095.right - rectFM29095.left);
                iM29096 = (int) (rectFM29095.bottom - rectFM29095.top);
            } else if (rectFM29095 == null) {
                c11644M29083.m29089(iM29084, iM29096);
            }
            if (iM29084 > 0 && iM29096 > 0) {
                int i2 = f18771;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                RectF rectF = new RectF();
                if (iM29084 > iM29096) {
                    float f = i2;
                    i = (int) ((f / iM29084) * iM29096);
                    int i3 = (i2 - i) / 2;
                    rectF.set(0.0f, i3, f, i3 + i);
                } else {
                    float f2 = i2;
                    int i4 = (int) ((f2 / iM29096) * iM29084);
                    int i5 = (i2 - i4) / 2;
                    rectF.set(i5, 0.0f, i5 + i4, f2);
                    i = i2;
                    i2 = i4;
                }
                c11644M29083.m29097(i2);
                c11644M29083.m29088(i);
                c11644M29083.m29091(canvas, rectF);
                m15059(bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15052(AbstractC20745 abstractC20745) {
        AbstractC20745 abstractC20745M46728;
        Bitmap frameAtTime;
        boolean zM43514 = C18862.m43514(abstractC20745.mo33986());
        int i = f18771;
        if (!zM43514) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    if (abstractC20745.m46729()) {
                        mediaMetadataRetriever.setDataSource(abstractC20745.mo24643());
                    } else if (abstractC20745.mo40126()) {
                        mediaMetadataRetriever.setDataSource(C16737.m39277(), abstractC20745.mo40127());
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        mediaMetadataRetriever.setDataSource(new C1667(abstractC20745));
                    } else {
                        if (abstractC20745.mo33964() <= 524288) {
                            abstractC20745M46728 = C11904.f39941.m46728();
                            try {
                                abstractC20745.m46701(abstractC20745M46728, (C5222) null, (InterfaceC8978) null);
                                mediaMetadataRetriever.setDataSource(abstractC20745M46728.mo33986());
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                                mediaMetadataRetriever.release();
                                if (abstractC20745M46728 != null) {
                                    abstractC20745M46728.mo24647();
                                }
                            } catch (Throwable unused) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused2) {
                                }
                                if (abstractC20745M46728 != null) {
                                    abstractC20745M46728.mo24647();
                                }
                                frameAtTime = null;
                            }
                            if (frameAtTime == null) {
                                return null;
                            }
                            return m15054(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
                        }
                        mediaMetadataRetriever.setDataSource(abstractC20745.mo33986());
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused3) {
                }
                abstractC20745M46728 = null;
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                if (abstractC20745M46728 != null) {
                    abstractC20745M46728.mo24647();
                }
            } catch (Throwable unused4) {
                abstractC20745M46728 = null;
            }
            if (frameAtTime == null) {
                return null;
            }
            return m15054(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
        }
        return C18862.m43508(abstractC20745, i).m18487();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C6867 m15053(AbstractC20745 abstractC20745) {
        return C18862.m43508(abstractC20745, f18771);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15055(MediaDataSource mediaDataSource) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(mediaDataSource);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            } catch (Throwable unused2) {
                mediaMetadataRetriever.release();
                frameAtTime = null;
                if (frameAtTime == null) {
                    return null;
                }
                return m15054(frameAtTime, f18771, frameAtTime.getWidth(), frameAtTime.getHeight());
            }
        } catch (Exception unused3) {
            frameAtTime = null;
        }
        if (frameAtTime == null) {
            return null;
        }
        return m15054(frameAtTime, f18771, frameAtTime.getWidth(), frameAtTime.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6867 m15050(MediaDataSource mediaDataSource) {
        return C18862.m43506(mediaDataSource, f18771);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15046(Bitmap bitmap, int i, int i2, int i3) {
        return m15054(bitmap, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15045(AbstractC20745 abstractC20745) throws Throwable {
        C2455 c2455;
        C2455 c2456 = null;
        try {
            c2455 = new C2455(abstractC20745);
            try {
                Bitmap bitmapM29803 = C11986.m29803(c2455);
                if (bitmapM29803 != null) {
                    m15051(bitmapM29803);
                    C19431.m44468(c2455);
                    return bitmapM29803;
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                c2456 = c2455;
                C19431.m44468(c2456);
                throw th;
            }
        } catch (IOException unused2) {
            c2455 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        C19431.m44468(c2455);
        WeakReference weakReference = f18770;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable drawableM39263 = C16737.m39263(R.drawable.MT_Protector);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f18771;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM39263.copyBounds();
        drawableM39263.setBounds(0, 0, i, i);
        drawableM39263.draw(canvas);
        drawableM39263.setBounds(rectCopyBounds);
        f18770 = new WeakReference(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15049(AbstractC20745 abstractC20745) {
        C18310 c18310M43738 = C19016.m43738(abstractC20745);
        if (c18310M43738 == null) {
            return null;
        }
        Drawable drawableM42529 = c18310M43738.m42529();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f18771;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM42529.copyBounds();
        int intrinsicWidth = drawableM42529.getIntrinsicWidth();
        int intrinsicHeight = drawableM42529.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = i;
            intrinsicHeight = intrinsicWidth;
        }
        try {
            drawableM42529.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f = i;
            canvas.scale(f / intrinsicWidth, f / intrinsicHeight);
            drawableM42529.draw(canvas);
            drawableM42529.setBounds(rectCopyBounds);
            m15051(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            drawableM42529.setBounds(rectCopyBounds);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۖۢ᩺] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15058(AbstractC20745 abstractC20745) throws Throwable {
        ?? r0;
        JSONObject jSONObject;
        String string;
        ?? r1;
        C12107 entry;
        ?? M46688 = "base.apk";
        ?? r4 = 0;
        try {
            try {
                ?? c2455 = new C2455(abstractC20745);
                try {
                    try {
                        jSONObject = new JSONObject(new String(c2455.m7475(c2455.m7470("manifest.json"), null), StandardCharsets.UTF_8));
                    } catch (Throwable th) {
                        th = th;
                        M46688 = 0;
                    }
                } catch (Exception unused) {
                    jSONObject = null;
                }
                int i = 0;
                if (jSONObject != null && jSONObject.contains("icon")) {
                    try {
                        byte[] bArrM7475 = c2455.m7475(c2455.getEntry(jSONObject.getString("icon")), null);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(C16737.m39279(), BitmapFactory.decodeByteArray(bArrM7475, 0, bArrM7475.length));
                        int i2 = f18771;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect rectCopyBounds = bitmapDrawable.copyBounds();
                        bitmapDrawable.setBounds(0, 0, i2, i2);
                        bitmapDrawable.draw(canvas);
                        bitmapDrawable.setBounds(rectCopyBounds);
                        m15051(bitmapCreateBitmap);
                        c2455.close();
                        return bitmapCreateBitmap;
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject == null || !jSONObject.contains("split_apks")) {
                    string = null;
                    break;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("split_apks");
                    int size = jSONArray.size();
                    while (true) {
                        if (i >= size) {
                            string = null;
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.contains("id") && jSONObject2.getString("id").equals("base")) {
                            string = jSONObject2.getString("file");
                            break;
                        }
                        i++;
                        string = null;
                        break;
                    }
                } catch (Exception unused3) {
                }
                if (string != null || c2455.getEntry("base.apk") == null) {
                    r1 = string;
                }
                if (r1 == 0) {
                    C11521 c11521Min = C9030.stream(c2455.m7466()).map(new C12964(2)).filter(new C19665(5)).min(C7618.comparingInt(new C21115()));
                    if (c11521Min.isPresent()) {
                        r1 = M46688;
                        r1 = (String) c11521Min.get();
                    }
                }
                if (r1 != 0 && (entry = c2455.getEntry(r1)) != null) {
                    M46688 = C11904.f39939.m46688(".apk");
                    try {
                        M46688.m46694(c2455.m7471(entry));
                        Bitmap bitmapM15049 = m15049((AbstractC20745) M46688);
                        c2455.close();
                        M46688.mo24647();
                        return bitmapM15049;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    c2455.close();
                    return null;
                }
                try {
                    c2455.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th;
            } catch (Exception unused4) {
                r0 = M46688;
                if (r0 != 0) {
                    r0.mo24647();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                r4 = M46688;
                if (r4 != 0) {
                    r4.mo24647();
                }
                throw th;
            }
        } catch (Exception unused5) {
            r0 = 0;
            if (r0 != 0) {
                r0.mo24647();
            }
        } catch (Throwable th5) {
            th = th5;
            if (r4 != 0) {
                r4.mo24647();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15059(Bitmap bitmap) {
        int iM9160;
        if (C10820.m27124(bitmap) <= 0.9f && (iM9160 = C3057.m9160(bitmap)) != 0) {
            if (C3057.m9162(iM9160, -328966)) {
                C10820.m27125(bitmap, 2.5f, 1, 1, -1442840576);
            } else if (C3057.m9162(iM9160, -13619152)) {
                C10820.m27125(bitmap, 3.5f, 1, 1, -1);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15051(Bitmap bitmap) {
        int iM9160;
        if (C10820.m27124(bitmap) <= 0.9f && (iM9160 = C3057.m9160(bitmap)) != 0) {
            if (C3057.m9162(iM9160, -328966)) {
                C10820.m27125(bitmap, 1.0f, 0, 0, -1434419072);
            } else if (C3057.m9162(iM9160, -13619152)) {
                C10820.m27125(bitmap, 2.0f, 0, 0, -1432313696);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Bitmap m15054(Bitmap bitmap, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            f = width;
            f2 = height;
        } else {
            f = height;
            f2 = width;
        }
        if (Math.max(i2, i3) <= 500) {
            float f5 = i;
            if (f < f5) {
                f3 = f5 / f;
            } else if (f <= f5) {
                f3 = 1.0f;
            } else if (f / f2 <= 3.0f) {
                f3 = f5 / f;
            } else {
                f4 = f5 / 3.0f;
            }
            if (f3 != 1.0f) {
                Matrix matrix = new Matrix();
                matrix.postScale(f3, f3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                bitmap.recycle();
                width = bitmapCreateBitmap.getWidth();
                height = bitmapCreateBitmap.getHeight();
                bitmap = bitmapCreateBitmap;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f18769);
            bitmap.recycle();
            return bitmapCreateBitmap2;
        }
        f4 = i;
        f3 = f4 / f2;
        if (f3 != 1.0f) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(f3, f3);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix2, true);
            bitmap.recycle();
            width = bitmapCreateBitmap3.getWidth();
            height = bitmapCreateBitmap3.getHeight();
            bitmap = bitmapCreateBitmap3;
        }
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap4).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f18769);
        bitmap.recycle();
        return bitmapCreateBitmap4;
    }
}
