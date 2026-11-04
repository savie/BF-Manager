package l;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Looper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 06MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10226 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9044 f32669;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9153 f32670;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Thread f32671 = Thread.currentThread();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8594 f32672;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32673;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream f32674;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f32675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BitmapRegionDecoder f32676;

    public C10226(AbstractC13057 abstractC13057, C9044 c9044, InputStream inputStream, BitmapRegionDecoder bitmapRegionDecoder) {
        this.f32675 = abstractC13057;
        this.f32669 = c9044;
        this.f32674 = inputStream;
        this.f32676 = bitmapRegionDecoder;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۜ֫֫] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.۫ۧ֫] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.۫ۧ֫] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10226 m26360(AbstractC13057 th, C9044 c9044) throws IOException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        InputStream inputStream;
        ?? r0 = C6808.f22671;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Tile decoder must be opened on a worker thread");
        }
        String str = c9044.f29436;
        C15294 c15294 = c9044.f29430;
        ?? r3 = c9044.f29435;
        C6808 c6808M18988 = r0.m18988(str, r3);
        C13519.m33210((AbstractC13057) th, c9044, c6808M18988);
        if (!m26362(c9044.f29436)) {
            throw new C19177("Image format does not support region decoding");
        }
        BitmapRegionDecoder bitmapRegionDecoder = null;
        try {
            try {
                try {
                    if (th.mo17424() != null) {
                        InputStream inputStreamMo17428 = th.mo17428();
                        if (!(inputStreamMo17428 instanceof FileInputStream)) {
                            throw new IOException("Local source requires a file stream");
                        }
                        C13519.m33209(C19853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStreamMo17428).getChannel()).size(), c6808M18988);
                        bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(((FileInputStream) inputStreamMo17428).getFD(), false);
                        inputStream = inputStreamMo17428;
                    } else {
                        C0841 c0841M33207 = C13519.m33207((AbstractC13057) th, c6808M18988);
                        try {
                            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance((InputStream) c0841M33207, false);
                            c0841M33207.m3343();
                            inputStream = c0841M33207;
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = c0841M33207;
                            bitmapRegionDecoder = null;
                            if (bitmapRegionDecoder != null) {
                                bitmapRegionDecoder.recycle();
                            }
                            if (r3 != 0) {
                                r3.close();
                            }
                            throw th;
                        }
                    }
                    th.m32544(c15294);
                    if (bitmapRegionDecoderNewInstance == null) {
                        throw new C19177("Platform rejected region decoding");
                    }
                    if (bitmapRegionDecoderNewInstance.getWidth() != c9044.f29428 || bitmapRegionDecoderNewInstance.getHeight() != c9044.f29431) {
                        throw new C19770("Region decoder dimensions changed");
                    }
                    return new C10226(th, c9044, inputStream, bitmapRegionDecoderNewInstance);
                } catch (IOException e) {
                    e = e;
                    th.m32544(c15294);
                    if (!(e instanceof C19770) && !(e instanceof C9789) && !(e instanceof C19177)) {
                        throw new C19177("Platform could not open a region decoder", e);
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th4) {
            th = th4;
            r3 = bitmapRegionDecoder;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10226 m26361(AbstractC13057 abstractC13057, C9044 c9044, C2442 c2442, InterfaceC7509 interfaceC7509) {
        C6808 c6808 = C6808.f22671;
        C13519.m33210(abstractC13057, c9044, c6808);
        C1137 c1137 = c9044.f29432;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("TGA decoder requires a worker");
        }
        if (abstractC13057.mo17424() == null) {
            throw new C19177("TGA regions require a prepared local file");
        }
        C9153 c9153M8242 = c2442.m8242(c1137.m4212(true));
        if (c9153M8242 == null) {
            throw new C18740("TGA index exceeds bitmap budget");
        }
        C8594 c8594 = null;
        try {
            C8594 c8594M23101 = C8594.m23101(abstractC13057.mo17424(), c1137, c6808.m18988(c9044.f29436, c9044.f29435).f22673, interfaceC7509);
            try {
                abstractC13057.m32544(c9044.f29430);
                C10226 c10226 = new C10226(abstractC13057, c9044, null, null);
                c10226.f32672 = c8594M23101;
                c10226.f32670 = c9153M8242;
                return c10226;
            } catch (Throwable th) {
                th = th;
                c8594 = c8594M23101;
                if (c8594 != null) {
                    try {
                        c8594.close();
                    } finally {
                        c9153M8242.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l.ۖۚ֫] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [l.ۡۚ֫] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [l.ۡۚ֫] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8299 m26363(Rect rect, int i, C2442 c2442, InterfaceC7509 interfaceC7509) throws Throwable {
        C9153 c9153M8242;
        if (Thread.currentThread() == this.f32671) {
            if (this.f32673) {
                throw new IOException("Tile decoder is closed");
            }
            if (!rect.isEmpty() && rect.left >= 0 && rect.top >= 0) {
                int i2 = rect.right;
                C9044 c9044 = this.f32669;
                int i3 = c9044.f29428;
                C15294 c15294 = c9044.f29430;
                if (i2 <= i3 && rect.bottom <= c9044.f29431 && i > 0 && ((i - 1) & i) == 0) {
                    AbstractC13057 abstractC13057 = this.f32675;
                    abstractC13057.m32544(c15294);
                    C9153 c9153M8243 = c2442.m8242(C13519.m33204(rect.width(), rect.height(), i));
                    if (c9153M8243 == null) {
                        throw new C18740("Tile reservation exceeds bitmap budget");
                    }
                    Bitmap bitmap = null;
                    try {
                        try {
                            if (this.f32672 != null) {
                                c9153M8242 = c2442.m8242(C13519.m33203(rect.width(), i) * 4);
                                if (c9153M8242 == null) {
                                    c2442 = c9153M8242;
                                    throw new C18740("TGA row exceeds bitmap budget");
                                }
                            } else {
                                c2442 = 0;
                            }
                            c2442 = c9153M8242;
                            C8594 c8594 = this.f32672;
                            Bitmap bitmapDecodeRegion = c8594 == null ? this.f32676.decodeRegion(rect, C13519.m33206(i)) : c8594.m23107(rect, i, interfaceC7509);
                            try {
                                AbstractC13057.m32543(interfaceC7509);
                                InputStream inputStream = this.f32674;
                                if (inputStream instanceof C0841) {
                                    ((C0841) inputStream).m3343();
                                }
                                abstractC13057.m32544(c15294);
                                if (bitmapDecodeRegion == null) {
                                    throw new IOException("Image region could not be decoded");
                                }
                                if (!c9153M8243.m24288(bitmapDecodeRegion.getAllocationByteCount())) {
                                    throw new C18740("Tile allocation exceeds bitmap budget");
                                }
                                C8299 c8299 = new C8299(bitmapDecodeRegion, c9153M8243, i);
                                if (c2442 != 0) {
                                    c2442.close();
                                }
                                return c8299;
                            } catch (Throwable th) {
                                bitmap = bitmapDecodeRegion;
                                th = th;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                c9153M8243.close();
                                if (c2442 != 0) {
                                    c2442.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c2442 = 0;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid region or sample size");
        }
        throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f32674;
        if (Thread.currentThread() != this.f32671) {
            throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
        }
        if (this.f32673) {
            return;
        }
        this.f32673 = true;
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f32676;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            C8594 c8594 = this.f32672;
            if (c8594 != null) {
                c8594.close();
            }
        } finally {
            C9153 c9153 = this.f32670;
            if (c9153 != null) {
                c9153.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26362(String str) {
        return "image/x-tga".equals(str) || "image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }
}
