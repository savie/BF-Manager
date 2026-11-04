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

/* JADX INFO: renamed from: l.۠֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8275 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static WeakReference f27225;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Paint f27224 = new Paint(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f27226 = C6907.m19160(32.0f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m22342(InterfaceC0817 interfaceC0817) {
        int i;
        Bitmap bitmapM22350;
        if (interfaceC0817 != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                final C2309 c2309 = new C2309(interfaceC0817);
                int iMax = 1;
                try {
                    options.inJustDecodeBounds = true;
                    C7753 c7753M43964 = C18940.m43964(C18940.m43963(c2309.f7471), new InterfaceC18194() { // from class: l.ܿ֡᩻
                        @Override // l.InterfaceC18194
                        public final BitmapFactory.Options read() throws IOException {
                            InputStream inputStreamM7798 = c2309.m7798(true);
                            BitmapFactory.Options options2 = options;
                            BitmapFactory.decodeStream(inputStreamM7798, null, options2);
                            return options2;
                        }
                    });
                    EnumC0295 enumC0295 = c7753M43964.f25517;
                    if (enumC0295 != EnumC0295.UNKNOWN) {
                        if (enumC0295 == EnumC0295.SVG) {
                            bitmapM22350 = m22341(c2309.m7798(false));
                        } else if (enumC0295 != EnumC0295.TGA) {
                            if (c7753M43964.f25515 == null) {
                                BitmapFactory.decodeStream(c2309.m7798(true), null, options);
                            }
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            if (i2 > 0 && i3 > 0) {
                                try {
                                    int iM23690 = new C8826(c2309.m7798(true), 0).m23690(1, "Orientation");
                                    if (iM23690 == 3) {
                                        i = 180;
                                    } else if (iM23690 != 6) {
                                        i = iM23690 != 8 ? 0 : BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                    } else {
                                        i = 90;
                                    }
                                } catch (Exception unused) {
                                }
                                int i4 = f27226;
                                if (i2 <= i3 && i2 > i4) {
                                    iMax = Math.max(1, i2 / i4);
                                } else if (i2 >= i3 && i3 > i4) {
                                    iMax = Math.max(1, i3 / i4);
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = iMax;
                                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c2309.m7798(false), null, options);
                                if (bitmapDecodeStream != null) {
                                    Bitmap bitmapM22348 = m22348(bitmapDecodeStream, i4, i2, i3);
                                    if (i != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i);
                                        bitmapM22348 = Bitmap.createBitmap(bitmapM22348, 0, 0, bitmapM22348.getWidth(), bitmapM22348.getHeight(), matrix, false);
                                    }
                                    m22353(bitmapM22348);
                                    c2309.close();
                                    return bitmapM22348;
                                }
                                c2309.close();
                            }
                        } else if (interfaceC0817.length() <= 268435456) {
                            bitmapM22350 = m22350(c2309.m7798(false));
                            m22353(bitmapM22350);
                        }
                        c2309.close();
                        return bitmapM22350;
                    }
                    c2309.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        c2309.close();
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

    /* JADX WARN: Code duplicated, block: B:14:0x0064 A[LOOP:0: B:12:0x0057->B:14:0x0064, LOOP_END] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m22350(InputStream inputStream) throws Throwable {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        Bitmap bitmapM23098;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        C1137 c1137M23099 = C8594.m23099(268435456L, inputStream);
        int i2 = c1137M23099.f4225;
        int i3 = c1137M23099.f4228;
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(i2, i3);
        int i4 = f27226;
        try {
            try {
                if (iMax <= 500) {
                    if (iMax > i4) {
                        f2 = iMin;
                        if (iMax / f2 > 3.0f) {
                            f3 = i4 / 3.0f;
                        }
                        f4 = f;
                        float f5 = i4;
                        double d = f5 / f4;
                        int iMin2 = Math.min(i2, (int) Math.ceil(d));
                        int iMin3 = Math.min(i3, (int) Math.ceil(d));
                        int i5 = (i2 - iMin2) / 2;
                        int i6 = (i3 - iMin3) / 2;
                        Rect rect = new Rect(i5, i6, i5 + iMin2, i6 + iMin3);
                        i = 1;
                        while (i * 2.0f * f4 <= 1.0f) {
                            i *= 2;
                        }
                        bitmapM23098 = C8594.m23098(inputStream, c1137M23099, rect, i, 268435456L, new C0071());
                        bitmap = null;
                        bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        float f6 = iMin2 * f4;
                        float f7 = iMin3 * f4;
                        Paint paint = new Paint();
                        paint.setFilterBitmap(false);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM23098, (Rect) null, new RectF((f5 - f6) / 2.0f, (f5 - f7) / 2.0f, (f6 + f5) / 2.0f, (f5 + f7) / 2.0f), paint);
                        bitmapM23098.recycle();
                        return bitmapCreateBitmap;
                    }
                    f = i4 / iMax;
                    f4 = f;
                    float f8 = i4;
                    double d2 = f8 / f4;
                    int iMin4 = Math.min(i2, (int) Math.ceil(d2));
                    int iMin5 = Math.min(i3, (int) Math.ceil(d2));
                    int i7 = (i2 - iMin4) / 2;
                    int i8 = (i3 - iMin5) / 2;
                    Rect rect2 = new Rect(i7, i8, i7 + iMin4, i8 + iMin5);
                    i = 1;
                    while (i * 2.0f * f4 <= 1.0f) {
                        i *= 2;
                    }
                    bitmapM23098 = C8594.m23098(inputStream, c1137M23099, rect2, i, 268435456L, new C0071());
                    bitmap = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    float f9 = iMin4 * f4;
                    float f10 = iMin5 * f4;
                    Paint paint2 = new Paint();
                    paint2.setFilterBitmap(false);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM23098, (Rect) null, new RectF((f8 - f9) / 2.0f, (f8 - f10) / 2.0f, (f9 + f8) / 2.0f, (f8 + f10) / 2.0f), paint2);
                    bitmapM23098.recycle();
                    return bitmapCreateBitmap;
                }
                f3 = i4;
                f2 = iMin;
                Paint paint3 = new Paint();
                paint3.setFilterBitmap(false);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM23098, (Rect) null, new RectF((f8 - f9) / 2.0f, (f8 - f10) / 2.0f, (f9 + f8) / 2.0f, (f8 + f10) / 2.0f), paint3);
                bitmapM23098.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                bitmapM23098.recycle();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
            float f11 = iMin4 * f4;
            float f12 = iMin5 * f4;
        } catch (Throwable th2) {
            th = th2;
        }
        f = f3 / f2;
        f4 = f;
        float f13 = i4;
        double d3 = f13 / f4;
        int iMin6 = Math.min(i2, (int) Math.ceil(d3));
        int iMin7 = Math.min(i3, (int) Math.ceil(d3));
        int i9 = (i2 - iMin6) / 2;
        int i10 = (i3 - iMin7) / 2;
        Rect rect3 = new Rect(i9, i10, i9 + iMin6, i10 + iMin7);
        i = 1;
        while (i * 2.0f * f4 <= 1.0f) {
            i *= 2;
        }
        bitmapM23098 = C8594.m23098(inputStream, c1137M23099, rect3, i, 268435456L, new C0071());
        bitmap = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m22351(InterfaceC0817 interfaceC0817) {
        C21246 c21246;
        XmlResourceParserC9734 xmlResourceParserC9734M35991;
        C24236 c24236M54217;
        if (interfaceC0817 != null) {
            try {
                if (interfaceC0817.length() <= 153600) {
                    InputStream inputStreamMo3286 = interfaceC0817.mo3286();
                    try {
                        inputStreamMo3286.mark(4);
                        if ((inputStreamMo3286.read() & 255) == 3 && (inputStreamMo3286.read() & 255) == 0) {
                            inputStreamMo3286.reset();
                            if (interfaceC0817 instanceof InterfaceC7529) {
                                c21246 = ((InterfaceC7529) interfaceC0817).mo3884();
                                int i = C24236.f78487;
                                xmlResourceParserC9734M35991 = C14955.m35973(inputStreamMo3286).m35991();
                            } else {
                                c21246 = new C21246();
                                int i2 = C24236.f78487;
                                xmlResourceParserC9734M35991 = C14955.m35973(inputStreamMo3286).m35991();
                            }
                            try {
                                c24236M54217 = C24236.m54217(xmlResourceParserC9734M35991, c21246, false);
                            } catch (Exception unused) {
                                c24236M54217 = null;
                            }
                            inputStreamMo3286.close();
                            if (c24236M54217 != null) {
                                int i3 = f27226;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Rect rectCopyBounds = c24236M54217.copyBounds();
                                int intrinsicWidth = c24236M54217.getIntrinsicWidth();
                                int intrinsicHeight = c24236M54217.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight) {
                                    int i4 = (int) ((i3 / intrinsicWidth) * intrinsicHeight);
                                    int i5 = (i3 - i4) / 2;
                                    c24236M54217.setBounds(0, i5, i3, i4 + i5);
                                } else {
                                    int i6 = (int) ((i3 / intrinsicHeight) * intrinsicWidth);
                                    int i7 = (i3 - i6) / 2;
                                    c24236M54217.setBounds(i7, 0, i6 + i7, i3);
                                }
                                c24236M54217.draw(canvas);
                                c24236M54217.setBounds(rectCopyBounds);
                                m22353(bitmapCreateBitmap);
                                return bitmapCreateBitmap;
                            }
                        }
                        inputStreamMo3286.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo3286.close();
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
    public static Bitmap m22341(InputStream inputStream) {
        int i;
        try {
            C1752 c1752M6180 = C1752.m6180(inputStream);
            RectF rectFM6191 = c1752M6180.m6191();
            int iM6197 = (int) c1752M6180.m6197();
            int iM6195 = (int) c1752M6180.m6195();
            if (iM6197 == -1 && iM6195 == -1) {
                iM6197 = (int) (rectFM6191.right - rectFM6191.left);
                iM6195 = (int) (rectFM6191.bottom - rectFM6191.top);
            } else if (rectFM6191 == null) {
                c1752M6180.m6185(iM6197, iM6195);
            }
            if (iM6197 > 0 && iM6195 > 0) {
                int i2 = f27226;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                RectF rectF = new RectF();
                if (iM6197 > iM6195) {
                    float f = i2;
                    i = (int) ((f / iM6197) * iM6195);
                    int i3 = (i2 - i) / 2;
                    rectF.set(0.0f, i3, f, i3 + i);
                } else {
                    float f2 = i2;
                    int i4 = (int) ((f2 / iM6195) * iM6197);
                    int i5 = (i2 - i4) / 2;
                    rectF.set(i5, 0.0f, i5 + i4, f2);
                    i = i2;
                    i2 = i4;
                }
                c1752M6180.m6196(i2);
                c1752M6180.m6184(i);
                c1752M6180.m6187(canvas, rectF);
                m22353(bitmapCreateBitmap);
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
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Bitmap m22347(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M49877;
        Bitmap frameAtTime;
        boolean zM13361 = C4177.m13361(abstractC22044.mo4294());
        int i = f27226;
        if (!zM13361) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    if (abstractC22044.m49870()) {
                        mediaMetadataRetriever.setDataSource(abstractC22044.mo4278());
                    } else if (abstractC22044.mo42886()) {
                        mediaMetadataRetriever.setDataSource(C21576.m49084(), abstractC22044.mo42888());
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        mediaMetadataRetriever.setDataSource(new C0596(abstractC22044));
                    } else {
                        if (abstractC22044.mo4285() <= 524288) {
                            abstractC22044M49877 = C6382.f21563.m49877();
                            try {
                                abstractC22044.m49847(abstractC22044M49877, (C24523) null, (InterfaceC23711) null);
                                mediaMetadataRetriever.setDataSource(abstractC22044M49877.mo4294());
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                                mediaMetadataRetriever.release();
                                if (abstractC22044M49877 != null) {
                                    abstractC22044M49877.mo4296();
                                }
                            } catch (Throwable unused) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused2) {
                                }
                                if (abstractC22044M49877 != null) {
                                    abstractC22044M49877.mo4296();
                                }
                                frameAtTime = null;
                            }
                            if (frameAtTime == null) {
                                return null;
                            }
                            return m22348(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
                        }
                        mediaMetadataRetriever.setDataSource(abstractC22044.mo4294());
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused3) {
                }
                abstractC22044M49877 = null;
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                if (abstractC22044M49877 != null) {
                    abstractC22044M49877.mo4296();
                }
            } catch (Throwable unused4) {
                abstractC22044M49877 = null;
            }
            if (frameAtTime == null) {
                return null;
            }
            return m22348(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
        }
        return C4177.m13351(abstractC22044, i).m11193();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3431 m22346(AbstractC22044 abstractC22044) {
        return C4177.m13351(abstractC22044, f27226);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m22349(MediaDataSource mediaDataSource) {
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
                return m22348(frameAtTime, f27226, frameAtTime.getWidth(), frameAtTime.getHeight());
            }
        } catch (Exception unused3) {
            frameAtTime = null;
        }
        if (frameAtTime == null) {
            return null;
        }
        return m22348(frameAtTime, f27226, frameAtTime.getWidth(), frameAtTime.getHeight());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3431 m22344(MediaDataSource mediaDataSource) {
        return C4177.m13349(mediaDataSource, f27226);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m22340(Bitmap bitmap, int i, int i2, int i3) {
        return m22348(bitmap, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Bitmap m22354(AbstractC22044 abstractC22044) throws Throwable {
        C22941 c22941;
        C22941 c22942 = null;
        try {
            c22941 = new C22941(abstractC22044);
            try {
                Bitmap bitmapM42646 = C18300.m42646(c22941);
                if (bitmapM42646 != null) {
                    m22345(bitmapM42646);
                    C20244.m46520(c22941);
                    return bitmapM42646;
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                c22942 = c22941;
                C20244.m46520(c22942);
                throw th;
            }
        } catch (IOException unused2) {
            c22941 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        C20244.m46520(c22941);
        WeakReference weakReference = f27225;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable drawableM49058 = C21576.m49058(R.drawable.MT_Protector);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f27226;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM49058.copyBounds();
        drawableM49058.setBounds(0, 0, i, i);
        drawableM49058.draw(canvas);
        drawableM49058.setBounds(rectCopyBounds);
        f27225 = new WeakReference(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m22343(AbstractC22044 abstractC22044) {
        C11381 c11381M55329 = C24808.m55329(abstractC22044);
        if (c11381M55329 == null) {
            return null;
        }
        Drawable drawableM28713 = c11381M55329.m28713();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f27226;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM28713.copyBounds();
        int intrinsicWidth = drawableM28713.getIntrinsicWidth();
        int intrinsicHeight = drawableM28713.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = i;
            intrinsicHeight = intrinsicWidth;
        }
        try {
            drawableM28713.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f = i;
            canvas.scale(f / intrinsicWidth, f / intrinsicHeight);
            drawableM28713.draw(canvas);
            drawableM28713.setBounds(rectCopyBounds);
            m22345(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            drawableM28713.setBounds(rectCopyBounds);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.᩸ܽܺ] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m22352(AbstractC22044 abstractC22044) throws Throwable {
        ?? r0;
        JSONObject jSONObject;
        String string;
        ?? r1;
        C8002 entry;
        ?? M49857 = "base.apk";
        ?? r4 = 0;
        try {
            try {
                ?? c22941 = new C22941(abstractC22044);
                try {
                    try {
                        jSONObject = new JSONObject(new String(c22941.m51731(c22941.m51724("manifest.json"), null), StandardCharsets.UTF_8));
                    } catch (Throwable th) {
                        th = th;
                        M49857 = 0;
                    }
                } catch (Exception unused) {
                    jSONObject = null;
                }
                int i = 0;
                if (jSONObject != null && jSONObject.contains("icon")) {
                    try {
                        byte[] bArrM51731 = c22941.m51731(c22941.getEntry(jSONObject.getString("icon")), null);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(C21576.m49055(), BitmapFactory.decodeByteArray(bArrM51731, 0, bArrM51731.length));
                        int i2 = f27226;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect rectCopyBounds = bitmapDrawable.copyBounds();
                        bitmapDrawable.setBounds(0, 0, i2, i2);
                        bitmapDrawable.draw(canvas);
                        bitmapDrawable.setBounds(rectCopyBounds);
                        m22345(bitmapCreateBitmap);
                        c22941.close();
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
                if (string != null || c22941.getEntry("base.apk") == null) {
                    r1 = string;
                }
                if (r1 == 0) {
                    C15867 c15867Min = C1170.stream(c22941.m51742()).map(new C6360(1)).filter(new C20954(0)).min(C2661.comparingInt(new C3919()));
                    if (c15867Min.isPresent()) {
                        r1 = M49857;
                        r1 = (String) c15867Min.get();
                    }
                }
                if (r1 != 0 && (entry = c22941.getEntry(r1)) != null) {
                    M49857 = C6382.f21565.m49857(".apk");
                    try {
                        M49857.m49840(c22941.m51727(entry));
                        Bitmap bitmapM22343 = m22343((AbstractC22044) M49857);
                        c22941.close();
                        M49857.mo4296();
                        return bitmapM22343;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    c22941.close();
                    return null;
                }
                try {
                    c22941.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th;
            } catch (Exception unused4) {
                r0 = M49857;
                if (r0 != 0) {
                    r0.mo4296();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                r4 = M49857;
                if (r4 != 0) {
                    r4.mo4296();
                }
                throw th;
            }
        } catch (Exception unused5) {
            r0 = 0;
            if (r0 != 0) {
                r0.mo4296();
            }
        } catch (Throwable th5) {
            th = th5;
            if (r4 != 0) {
                r4.mo4296();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22353(Bitmap bitmap) {
        int iM22612;
        if (C18862.m43760(bitmap) <= 0.9f && (iM22612 = C8420.m22612(bitmap)) != 0) {
            if (C8420.m22614(iM22612, -328966)) {
                C18862.m43761(bitmap, 2.5f, 1, 1, -1442840576);
            } else if (C8420.m22614(iM22612, -13619152)) {
                C18862.m43761(bitmap, 3.5f, 1, 1, -1);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22345(Bitmap bitmap) {
        int iM22612;
        if (C18862.m43760(bitmap) <= 0.9f && (iM22612 = C8420.m22612(bitmap)) != 0) {
            if (C8420.m22614(iM22612, -328966)) {
                C18862.m43761(bitmap, 1.0f, 0, 0, -1434419072);
            } else if (C8420.m22614(iM22612, -13619152)) {
                C18862.m43761(bitmap, 2.0f, 0, 0, -1432313696);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m22348(Bitmap bitmap, int i, int i2, int i3) {
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
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f27224);
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
        new Canvas(bitmapCreateBitmap4).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f27224);
        bitmap.recycle();
        return bitmapCreateBitmap4;
    }
}
