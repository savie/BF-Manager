package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.util.Xml;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܺ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16502 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19486 m39135(final AbstractC13057 abstractC13057, final C24246 c24246) {
        final C6808 c6808 = C6808.f22671;
        m39138(c24246);
        C15294 c15294Mo17423 = abstractC13057.mo17423();
        c6808.getClass();
        C6808 c6809 = C6808.f22672;
        long j = c15294Mo17423.f50004;
        C13519.m33209(j, c6809);
        C0841 c0841M33207 = C13519.m33207(abstractC13057, c6809);
        try {
            C7753 c7753M43963 = C18940.m43963(c0841M33207);
            String str = c7753M43963.f25516;
            EnumC0295 enumC0295 = c7753M43963.f25517;
            c0841M33207.m3343();
            EnumC0295 enumC0296 = EnumC0295.TGA;
            if (enumC0295 != enumC0296 && !"image/jpeg".equals(str)) {
                C6808 c6808M18988 = c6808.m18988(str, c7753M43963.f25518);
                C13519.m33209(j, c6808M18988);
                c0841M33207.m3344(c6808M18988);
            }
            c0841M33207.close();
            if (enumC0295 == EnumC0295.UNKNOWN || enumC0295 == enumC0296) {
                try {
                    C13519.m33209(j, c6808);
                    c7753M43963 = C18940.m43964(c7753M43963, new InterfaceC18194() { // from class: l.ۙ֫֫
                        @Override // l.InterfaceC18194
                        public final BitmapFactory.Options read() {
                            return C16502.m39130(c24246, abstractC13057, c6808);
                        }
                    });
                } catch (C9789 e) {
                    if (c7753M43963.f25517 != EnumC0295.TGA) {
                        throw e;
                    }
                }
            }
            abstractC13057.m32544(c15294Mo17423);
            m39138(c24246);
            return new C19486(c15294Mo17423, c7753M43963);
        } catch (Throwable th) {
            try {
                c0841M33207.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ BitmapFactory.Options m39130(C24246 c24246, AbstractC13057 abstractC13057, C6808 c6808) throws InterruptedIOException {
        m39138(c24246);
        return C13519.m33213(abstractC13057, c6808);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x029e  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #2 {all -> 0x00e1, blocks: (B:27:0x0099, B:28:0x00a0, B:74:0x011d, B:75:0x0120, B:53:0x00eb, B:55:0x00f3, B:57:0x00f7, B:59:0x00fb, B:60:0x0100, B:61:0x0101, B:62:0x0108, B:63:0x0109, B:64:0x010e, B:65:0x010f, B:66:0x0114, B:40:0x00da, B:41:0x00dd), top: B:183:0x0099 }] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r21.m32544(r7);
        l.AbstractC13057.m32543(r28);
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C15010 m39134(l.AbstractC13057 r21, l.C19486 r22, final l.C2442 r23, long r24, final long r26, final l.C4108 r28) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16502.m39134(l.۫ۧ֫, l.ᩴ֫֫, l.ۖۚ֫, long, long, l.ۘۧ֫):l.ܳ֫֫");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m39142(String str, int i, byte[] bArr) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39136(int i, int i2, byte[] bArr) {
        for (int i3 = 0; i3 < 3; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (i3 * 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x025b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0260  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:136:0x026a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:140:0x0275  */
    /* JADX WARN: Code duplicated, block: B:142:0x027e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0283  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15010 m39133(AbstractC13057 abstractC13057, C15294 c15294, C21724 c21724, C2442 c2442, long j, C4108 c4108) throws Throwable {
        C9153 c9153;
        C9153 c9153M39131;
        C6741 c6741;
        C20911 c20911;
        C9153 c9153M39132;
        Bitmap bitmapCreateBitmap;
        Picture pictureM6181;
        C6741 c6741M18841;
        C20911 c20912;
        C9153 c9153M39133;
        long j2;
        C20911 c20913;
        int i;
        int i2;
        C12773 c12773M39132 = m39132(c21724, c4108);
        LinkedHashSet linkedHashSet = c12773M39132.f40871;
        C9153 c9153M39134 = m39131(c2442, c12773M39132.f40872);
        try {
            int i3 = c12773M39132.f40875;
            int i4 = i3 - 1;
            C1752 c1752M6176 = C1752.m6176(new ByteArrayInputStream(c21724.f69322, 0, c21724.f69323));
            m39138(c4108);
            RectF rectFM6191 = c1752M6176.m6191();
            float fM6197 = c1752M6176.m6197();
            float fM6195 = c1752M6176.m6195();
            if (fM6197 <= 0.0f && rectFM6191 != null) {
                fM6197 = rectFM6191.width();
            }
            if (fM6195 <= 0.0f && rectFM6191 != null) {
                fM6195 = rectFM6191.height();
            }
            int iM39128 = m39128(fM6197);
            int iM39129 = m39128(fM6195);
            C6808.f22671.m18989(iM39128, iM39129);
            if (rectFM6191 == null) {
                c1752M6176.m6185(iM39128, iM39129);
            }
            boolean z = !C6972.m19274(c1752M6176) && Build.VERSION.SDK_INT >= 28 && c12773M39132.f40873;
            if (z) {
                j2 = (((long) c12773M39132.f40874) * 256) + (c12773M39132.f40870 * 8) + 65536;
            } else {
                j2 = 0;
            }
            c9153M39132 = z ? m39131(c2442, j2) : null;
            try {
                long jM8241 = c2442.m8241() - c2442.m8244();
                if (!linkedHashSet.isEmpty()) {
                    jM8241 /= 2;
                }
                long jMin = Math.min(j, jM8241);
                int i5 = 1;
                while (i5 <= 32768) {
                    try {
                        if (C13519.m33203(iM39128, i5) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX || C13519.m33203(iM39129, i5) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX || C13519.m33204(iM39128, iM39129, i5) * ((long) i3) > jMin) {
                            c9153 = c9153M39134;
                            i5 *= 2;
                            iM39129 = iM39129;
                            c12773M39132 = c12773M39132;
                            iM39128 = iM39128;
                            c9153M39134 = c9153;
                        } else {
                            int iM33203 = (int) C13519.m33203(iM39128, i5);
                            int iM33204 = (int) C13519.m33203(iM39129, i5);
                            c9153 = c9153M39134;
                            long j3 = ((long) iM33204) * ((long) iM33203) * 4;
                            c9153M39133 = m39131(c2442, ((long) i4) * j3);
                            try {
                                c9153M39131 = m39131(c2442, j3);
                                try {
                                    if (linkedHashSet.isEmpty()) {
                                        c6741M18841 = null;
                                    } else {
                                        c6741M18841 = C6741.m18841(linkedHashSet, c2442, j, c4108);
                                        try {
                                            c1752M6176.m6190(c6741M18841);
                                        } catch (C14429 e) {
                                            e = e;
                                            bitmapCreateBitmap = null;
                                            c20912 = null;
                                            pictureM6181 = null;
                                            throw new IOException("SVG could not be parsed", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmapCreateBitmap = null;
                                            pictureM6181 = null;
                                            c20912 = null;
                                            C20911 c20914 = c20912;
                                            c6741 = c6741M18841;
                                            c20911 = c20914;
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            if (c9153M39131 != null) {
                                                c9153M39131.close();
                                            }
                                            if (c9153M39133 != null) {
                                                c9153M39133.close();
                                            }
                                            if (c20911 != null) {
                                                c20911.m47771((C9153) null);
                                            }
                                            if (c6741 != null) {
                                                c6741.close();
                                            }
                                            if (pictureM6181 != null) {
                                                pictureM6181.beginRecording(1, 1);
                                                pictureM6181.endRecording();
                                            }
                                            if (c9153M39132 != null) {
                                                c9153M39132.close();
                                            }
                                            if (c9153 != null) {
                                                c9153.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(iM33203, iM33204, Bitmap.Config.ARGB_8888);
                                    try {
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        float f = iM39128;
                                        float f2 = iM39129;
                                        canvas.scale(iM33203 / f, iM33204 / f2);
                                        c1752M6176.m6187(canvas, new RectF(0.0f, 0.0f, f, f2));
                                        m39138(c4108);
                                        if (!c9153M39131.m24288(bitmapCreateBitmap.getAllocationByteCount())) {
                                            throw new C18740("SVG raster allocation exceeds budget");
                                        }
                                        if (z) {
                                            pictureM6181 = c1752M6176.m6181(iM39128, iM39129);
                                            try {
                                                m39138(c4108);
                                                c20913 = new C20911(null, pictureM6181, iM39128, iM39129, c12773M39132.f40875, c9153M39132, null);
                                                c6741 = c6741M18841;
                                                c9153M39132 = null;
                                                i = iM39128;
                                                i2 = iM39129;
                                            } catch (C14429 e2) {
                                                e = e2;
                                                c20912 = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c20912 = null;
                                                C20911 c20915 = c20912;
                                                c6741 = c6741M18841;
                                                c20911 = c20915;
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                }
                                                if (c9153M39131 != null) {
                                                    c9153M39131.close();
                                                }
                                                if (c9153M39133 != null) {
                                                    c9153M39133.close();
                                                }
                                                if (c20911 != null) {
                                                    c20911.m47771((C9153) null);
                                                }
                                                if (c6741 != null) {
                                                    c6741.close();
                                                }
                                                if (pictureM6181 != null) {
                                                    pictureM6181.beginRecording(1, 1);
                                                    pictureM6181.endRecording();
                                                }
                                                if (c9153M39132 != null) {
                                                    c9153M39132.close();
                                                }
                                                if (c9153 != null) {
                                                    c9153.close();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = iM39128;
                                            i2 = iM39129;
                                            c20913 = new C20911(c1752M6176, null, i, i2, c12773M39132.f40875, c9153, c6741M18841);
                                            c9153 = null;
                                            c6741 = null;
                                        }
                                        c20911 = c20913;
                                        try {
                                            C15010 c15010 = new C15010(new C9044(abstractC13057.mo17426(), i, i2, 1, "image/svg+xml", c15294), bitmapCreateBitmap, c9153M39131, c20911);
                                            c9153M39133.close();
                                            if (c6741 != null) {
                                                c6741.close();
                                            }
                                            if (c9153M39132 != null) {
                                                c9153M39132.close();
                                            }
                                            if (c9153 != null) {
                                                c9153.close();
                                            }
                                            return c15010;
                                        } catch (C14429 e3) {
                                            e = e3;
                                            pictureM6181 = null;
                                            C6741 c6742 = c6741;
                                            c20912 = c20911;
                                            c6741M18841 = c6742;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            pictureM6181 = null;
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            if (c9153M39131 != null) {
                                                c9153M39131.close();
                                            }
                                            if (c9153M39133 != null) {
                                                c9153M39133.close();
                                            }
                                            if (c20911 != null) {
                                                c20911.m47771((C9153) null);
                                            }
                                            if (c6741 != null) {
                                                c6741.close();
                                            }
                                            if (pictureM6181 != null) {
                                                pictureM6181.beginRecording(1, 1);
                                                pictureM6181.endRecording();
                                            }
                                            if (c9153M39132 != null) {
                                                c9153M39132.close();
                                            }
                                            if (c9153 != null) {
                                                c9153.close();
                                            }
                                            throw th;
                                        }
                                    } catch (C14429 e4) {
                                        e = e4;
                                        c20912 = null;
                                        pictureM6181 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        pictureM6181 = null;
                                        c20912 = null;
                                        C20911 c20916 = c20912;
                                        c6741 = c6741M18841;
                                        c20911 = c20916;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c9153M39131 != null) {
                                            c9153M39131.close();
                                        }
                                        if (c9153M39133 != null) {
                                            c9153M39133.close();
                                        }
                                        if (c20911 != null) {
                                            c20911.m47771((C9153) null);
                                        }
                                        if (c6741 != null) {
                                            c6741.close();
                                        }
                                        if (pictureM6181 != null) {
                                            pictureM6181.beginRecording(1, 1);
                                            pictureM6181.endRecording();
                                        }
                                        if (c9153M39132 != null) {
                                            c9153M39132.close();
                                        }
                                        if (c9153 != null) {
                                            c9153.close();
                                        }
                                        throw th;
                                    }
                                } catch (C14429 e5) {
                                    e = e5;
                                    c6741M18841 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    c6741M18841 = null;
                                }
                            } catch (C14429 e6) {
                                e = e6;
                                c6741M18841 = null;
                                c20912 = null;
                                c9153M39131 = null;
                                bitmapCreateBitmap = null;
                            } catch (Throwable th6) {
                                th = th6;
                                c6741 = null;
                                bitmapCreateBitmap = null;
                                pictureM6181 = null;
                                c20911 = null;
                                c9153M39131 = null;
                            }
                        }
                    } catch (C14429 e7) {
                        e = e7;
                        c6741M18841 = null;
                        c20912 = null;
                        c9153M39131 = null;
                        bitmapCreateBitmap = null;
                        pictureM6181 = null;
                        c9153M39133 = null;
                    } catch (Throwable th7) {
                        th = th7;
                        c9153M39131 = null;
                        bitmapCreateBitmap = null;
                        pictureM6181 = null;
                        c6741 = null;
                        c20911 = null;
                        c9153M39133 = null;
                        if (bitmapCreateBitmap != null) {
                            bitmapCreateBitmap.recycle();
                        }
                        if (c9153M39131 != null) {
                            c9153M39131.close();
                        }
                        if (c9153M39133 != null) {
                            c9153M39133.close();
                        }
                        if (c20911 != null) {
                            c20911.m47771((C9153) null);
                        }
                        if (c6741 != null) {
                            c6741.close();
                        }
                        if (pictureM6181 != null) {
                            pictureM6181.beginRecording(1, 1);
                            pictureM6181.endRecording();
                        }
                        if (c9153M39132 != null) {
                            c9153M39132.close();
                        }
                        if (c9153 != null) {
                            c9153.close();
                        }
                        throw th;
                    }
                    c6741M18841 = null;
                    c20912 = null;
                    c9153M39131 = null;
                    bitmapCreateBitmap = null;
                    pictureM6181 = null;
                    c9153M39133 = null;
                    try {
                        throw new IOException("SVG could not be parsed", e);
                    } catch (Throwable th8) {
                        th = th8;
                        C20911 c20917 = c20912;
                        c6741 = c6741M18841;
                        c20911 = c20917;
                        if (bitmapCreateBitmap != null) {
                            bitmapCreateBitmap.recycle();
                        }
                        if (c9153M39131 != null) {
                            c9153M39131.close();
                        }
                        if (c9153M39133 != null) {
                            c9153M39133.close();
                        }
                        if (c20911 != null) {
                            c20911.m47771((C9153) null);
                        }
                        if (c6741 != null) {
                            c6741.close();
                        }
                        if (pictureM6181 != null) {
                            pictureM6181.beginRecording(1, 1);
                            pictureM6181.endRecording();
                        }
                        if (c9153M39132 != null) {
                            c9153M39132.close();
                        }
                        if (c9153 != null) {
                            c9153.close();
                        }
                        throw th;
                    }
                }
                throw new C18740("Animation frames do not fit allocation limit");
            } catch (C14429 e8) {
                e = e8;
                c9153 = c9153M39134;
            } catch (Throwable th9) {
                th = th9;
                c9153 = c9153M39134;
            }
        } catch (C14429 e9) {
            e = e9;
            c9153 = c9153M39134;
            c6741M18841 = null;
            c20912 = null;
            c9153M39131 = null;
            c9153M39132 = null;
            bitmapCreateBitmap = null;
            pictureM6181 = null;
        } catch (Throwable th10) {
            th = th10;
            c9153 = c9153M39134;
            c9153M39131 = null;
            c6741 = null;
            c20911 = null;
            c9153M39132 = null;
            bitmapCreateBitmap = null;
            pictureM6181 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02c2 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x039b A[Catch: XmlPullParserException -> 0x0597, TRY_ENTER, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x03a5 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x03db  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e5 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:247:0x0408 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0419  */
    /* JADX WARN: Code duplicated, block: B:254:0x0427  */
    /* JADX WARN: Code duplicated, block: B:255:0x0428 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0435 A[Catch: XmlPullParserException -> 0x0597, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0441 A[Catch: XmlPullParserException -> 0x0597, LOOP:2: B:256:0x042f->B:260:0x0441, LOOP_END, TryCatch #0 {XmlPullParserException -> 0x0597, blocks: (B:3:0x0004, B:6:0x0058, B:8:0x005f, B:11:0x006c, B:12:0x0073, B:17:0x007d, B:20:0x008f, B:22:0x0095, B:25:0x009c, B:26:0x00a3, B:27:0x00a4, B:29:0x00aa, B:31:0x00b0, B:33:0x00ba, B:35:0x00c0, B:42:0x00ce, B:46:0x00d8, B:297:0x0510, B:47:0x00ea, B:50:0x00f4, B:53:0x0113, B:55:0x011b, B:57:0x0123, B:59:0x012b, B:61:0x0131, B:63:0x0137, B:65:0x013f, B:67:0x0145, B:72:0x014f, B:75:0x015d, B:77:0x0165, B:82:0x016f, B:85:0x0177, B:88:0x0181, B:90:0x0187, B:92:0x018d, B:95:0x0195, B:96:0x01bf, B:98:0x01c5, B:101:0x01e3, B:104:0x01eb, B:106:0x01f1, B:108:0x01f7, B:264:0x0454, B:109:0x021d, B:111:0x0242, B:114:0x024b, B:162:0x02e0, B:164:0x02e6, B:166:0x02ec, B:167:0x02f5, B:169:0x02fb, B:171:0x0303, B:172:0x0306, B:174:0x030c, B:176:0x0312, B:179:0x031a, B:181:0x0320, B:183:0x0326, B:185:0x032c, B:187:0x0332, B:189:0x0338, B:191:0x033e, B:196:0x034d, B:201:0x0359, B:203:0x035f, B:205:0x0365, B:207:0x036d, B:209:0x0375, B:217:0x038f, B:220:0x039b, B:222:0x03a5, B:224:0x03ad, B:226:0x03b5, B:228:0x03bd, B:230:0x03c5, B:239:0x03e5, B:241:0x03eb, B:245:0x03fe, B:247:0x0408, B:255:0x0428, B:256:0x042f, B:258:0x0435, B:260:0x0441, B:261:0x044c, B:262:0x0451, B:248:0x0413, B:249:0x0418, B:210:0x0379, B:212:0x0381, B:265:0x0468, B:266:0x046f, B:116:0x025f, B:118:0x0265, B:156:0x02c7, B:126:0x027f, B:147:0x02a9, B:150:0x02b2, B:152:0x02ba, B:154:0x02c2, B:157:0x02cc, B:269:0x0474, B:272:0x048a, B:274:0x04a7, B:275:0x04ae, B:278:0x04bf, B:280:0x04c3, B:281:0x04ca, B:288:0x04d8, B:290:0x04f2, B:294:0x0502, B:295:0x0509, B:300:0x052a, B:304:0x0575, B:310:0x0588, B:312:0x058f, B:313:0x0596), top: B:317:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x044c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12773 m39132(C21724 c21724, C4108 c4108) throws IOException {
        String str;
        LinkedHashSet linkedHashSet;
        long j;
        long jMax;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String str4;
        boolean z3;
        ArrayList arrayList;
        int size;
        String str5;
        String str6;
        String strM19276;
        String str7 = "opacity";
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            int i = 0;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            int i2 = 1;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(c21724.f69322, 0, c21724.f69323), null);
            C5316 c5316 = new C5316(0);
            ArrayDeque arrayDeque = new ArrayDeque();
            HashMap map = new HashMap();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            arrayDeque.push(c5316);
            int eventType = xmlPullParserNewPullParser.getEventType();
            int i3 = 0;
            int i4 = 0;
            long length = 0;
            boolean z4 = false;
            boolean z5 = true;
            long j2 = 0;
            long length2 = 0;
            long j3 = 0;
            int i5 = 0;
            while (eventType != i2) {
                m39138(c4108);
                if (eventType == 10 && xmlPullParserNewPullParser.getText().contains("<!ENTITY")) {
                    throw new C1587("SVG entity declarations are not supported");
                }
                if (eventType == 2) {
                    if (i5 == 0) {
                        String namespace = xmlPullParserNewPullParser.getNamespace();
                        if (!"svg".equals(xmlPullParserNewPullParser.getName()) || (namespace != null && !namespace.isEmpty() && !"http://www.w3.org/2000/svg".equals(namespace))) {
                            throw new IOException("Image XML root is not SVG");
                        }
                    }
                    i5++;
                    if (i5 > 8192 || (i3 = i3 + 1) > 64) {
                        throw new C22470("SVG structure exceeds safe render limits");
                    }
                    String name = xmlPullParserNewPullParser.getName();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    boolean z6 = namespace2 == null || namespace2.isEmpty() || "http://www.w3.org/2000/svg".equals(namespace2);
                    if (i4 != 0 || (z6 && !C6972.m19275(name))) {
                        str = str7;
                        linkedHashSet = linkedHashSet2;
                        j = j3;
                        i4++;
                        z4 = z4;
                    } else if (!z6) {
                        arrayDeque.push((C5316) arrayDeque.peek());
                        arrayDeque = arrayDeque;
                        str = str7;
                        linkedHashSet = linkedHashSet2;
                        c5316 = c5316;
                    } else {
                        boolean zEquals = "image".equals(name);
                        if (zEquals) {
                            z5 = false;
                        }
                        C5316 c5317 = new C5316(i);
                        ArrayList arrayList2 = c5317.f18700;
                        String str8 = "radialGradient";
                        j = j3;
                        boolean z7 = z4;
                        c5317.f18699 = "defs".equals(name) || "symbol".equals(name) || "marker".equals(name) || "clipPath".equals(name) || "pattern".equals(name) || "mask".equals(name) || "view".equals(name) || "linearGradient".equals(name) || "radialGradient".equals(name);
                        boolean z8 = "title".equals(name) || "desc".equals(name) || "style".equals(name);
                        if ("style".equals(name)) {
                            z7 = true;
                        }
                        int i6 = i4;
                        if ("mask".equals(name) || "pattern".equals(name) || MessageHandler.Properties.Filter.equals(name) || "style".equals(name)) {
                            z5 = false;
                        }
                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                        ((C5316) arrayDeque.peek()).f18702.add(c5317);
                        arrayDeque.push(c5317);
                        boolean z9 = false;
                        ArrayList arrayList3 = arrayList2;
                        int i7 = 0;
                        boolean z10 = z5;
                        String str9 = "linearGradient";
                        String str10 = "pattern";
                        long j4 = j2;
                        boolean z11 = z10;
                        String str11 = null;
                        while (i7 < xmlPullParserNewPullParser.getAttributeCount()) {
                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i7);
                            String str12 = str8;
                            String strTrim = xmlPullParserNewPullParser.getAttributeValue(i7).trim();
                            String str13 = name;
                            String attributeNamespace = xmlPullParserNewPullParser.getAttributeNamespace(i7);
                            HashMap map2 = map;
                            boolean z12 = z9;
                            if (zEquals && "href".equals(attributeName) && (attributeNamespace == null || attributeNamespace.isEmpty() || "http://www.w3.org/1999/xlink".equals(attributeNamespace))) {
                                length += (long) strTrim.length();
                                jMax = Math.max(j4, strTrim.length());
                                str11 = strTrim;
                                z = z8;
                                str2 = str9;
                                arrayList = arrayList3;
                                str3 = str13;
                                str4 = str12;
                                map = map2;
                                str7 = str7;
                            } else {
                                xmlPullParserNewPullParser = xmlPullParserNewPullParser;
                                c5317.f18698 += (long) strTrim.length();
                                jMax = Math.max(j4, strTrim.length());
                                if (!"d".equals(attributeName) && !"points".equals(attributeName)) {
                                    length2 += (long) strTrim.length();
                                    z = z8;
                                } else {
                                    int i8 = 0;
                                    boolean z13 = false;
                                    boolean z14 = false;
                                    long j5 = 0;
                                    while (i8 < strTrim.length()) {
                                        char cCharAt = strTrim.charAt(i8);
                                        boolean z15 = z8;
                                        if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                                            if (cCharAt == '-' || cCharAt == '+') {
                                                if (i8 != 0) {
                                                    int i9 = i8 - 1;
                                                    if (strTrim.charAt(i9) != 'e' && strTrim.charAt(i9) != 'E') {
                                                        j5++;
                                                        z14 = false;
                                                    }
                                                } else {
                                                    j5++;
                                                    z14 = false;
                                                }
                                            } else if ((cCharAt != 'e' && cCharAt != 'E') || !z13) {
                                                if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                                                    j5++;
                                                }
                                                z13 = false;
                                                z14 = false;
                                            }
                                            i8++;
                                            z8 = z15;
                                        } else {
                                            if (!z13 || (cCharAt == '.' && z14)) {
                                                j5++;
                                            }
                                            if (cCharAt == '.') {
                                                z14 = true;
                                            }
                                        }
                                        z13 = true;
                                        i8++;
                                        z8 = z15;
                                    }
                                    z = z8;
                                    j += j5;
                                    c5317.f18703 += j5;
                                }
                                if (j > 262144 || length2 > 1048576) {
                                    throw new C22470("SVG data exceeds safe parse limits");
                                }
                                if (str7.equals(attributeName) && C6972.m19277(strTrim)) {
                                    c5317.f18701 = Math.max(c5317.f18701, 1);
                                }
                                if ("mask".equals(attributeName) && !"none".equals(strTrim)) {
                                    c5317.f18701 = 3;
                                }
                                if ("style".equals(attributeName) && (strTrim.contains(str7) || strTrim.contains("mask"))) {
                                    z7 = true;
                                }
                                if (str7.equals(attributeName) || "mask".equals(attributeName) || MessageHandler.Properties.Filter.equals(attributeName) || ("style".equals(attributeName) && (strTrim.contains(str7) || strTrim.contains("mask") || strTrim.contains(MessageHandler.Properties.Filter)))) {
                                    z11 = false;
                                }
                                String attributePrefix = xmlPullParserNewPullParser.getAttributePrefix(i7);
                                if (z || z12 || !(attributePrefix == null || attributePrefix.isEmpty() || DocumentReader.RESERVED.equals(attributePrefix))) {
                                    map = map2;
                                } else {
                                    if ("id".equals(attributeName)) {
                                        map = map2;
                                        if (!map.containsKey(strTrim)) {
                                            map.put(strTrim, c5317);
                                        }
                                    } else {
                                        map = map2;
                                        if (!DocumentReader.RESERVED.equals(attributePrefix) || !"space".equals(attributeName)) {
                                        }
                                        if ("href".equals(attributeName)) {
                                            str3 = str13;
                                            if (!"use".equals(str3) || "tref".equals(str3) || "textPath".equals(str3)) {
                                                str2 = str9;
                                            } else {
                                                str2 = str9;
                                                if (!str2.equals(str3)) {
                                                    str4 = str12;
                                                    if (str4.equals(str3)) {
                                                        str7 = str7;
                                                        str6 = str10;
                                                    } else {
                                                        str7 = str7;
                                                        str6 = str10;
                                                        if (!str6.equals(str3)) {
                                                            str10 = str6;
                                                        }
                                                    }
                                                }
                                                if (attributeNamespace != null || attributeNamespace.isEmpty()) {
                                                    str10 = str6;
                                                    z3 = z2;
                                                } else {
                                                    str10 = str6;
                                                    z3 = z2;
                                                    if (!"http://www.w3.org/1999/xlink".equals(attributeNamespace)) {
                                                        arrayList = arrayList3;
                                                    }
                                                    if (z) {
                                                        C6972.m19272(attributeName, strTrim, arrayList);
                                                        for (size = arrayList.size(); size < arrayList.size(); size++) {
                                                            str5 = (String) arrayList.get(size);
                                                            if (str5.startsWith("#")) {
                                                                throw new C1587("SVG external resources are not supported");
                                                            }
                                                            arrayList.set(size, str5.substring(1));
                                                        }
                                                    }
                                                    z12 = z3;
                                                }
                                                strM19276 = C6972.m19276(strTrim);
                                                if (strM19276.startsWith("#")) {
                                                    throw new C1587("SVG external resources are not supported");
                                                }
                                                arrayList = arrayList3;
                                                arrayList.add(strM19276.substring(1));
                                                if (z) {
                                                    C6972.m19272(attributeName, strTrim, arrayList);
                                                    while (size < arrayList.size()) {
                                                        str5 = (String) arrayList.get(size);
                                                        if (str5.startsWith("#")) {
                                                            throw new C1587("SVG external resources are not supported");
                                                        }
                                                        arrayList.set(size, str5.substring(1));
                                                    }
                                                }
                                                z12 = z3;
                                            }
                                            str6 = str10;
                                            str4 = str12;
                                            if (attributeNamespace != null) {
                                                str10 = str6;
                                                z3 = z2;
                                            } else {
                                                str10 = str6;
                                                z3 = z2;
                                            }
                                            strM19276 = C6972.m19276(strTrim);
                                            if (strM19276.startsWith("#")) {
                                                throw new C1587("SVG external resources are not supported");
                                            }
                                            arrayList = arrayList3;
                                            arrayList.add(strM19276.substring(1));
                                            if (z) {
                                                C6972.m19272(attributeName, strTrim, arrayList);
                                                while (size < arrayList.size()) {
                                                    str5 = (String) arrayList.get(size);
                                                    if (str5.startsWith("#")) {
                                                        throw new C1587("SVG external resources are not supported");
                                                    }
                                                    arrayList.set(size, str5.substring(1));
                                                }
                                            }
                                            z12 = z3;
                                        } else {
                                            str2 = str9;
                                            str3 = str13;
                                            str4 = str12;
                                            str7 = str7;
                                        }
                                        z3 = z2;
                                        arrayList = arrayList3;
                                        if (z) {
                                            C6972.m19272(attributeName, strTrim, arrayList);
                                            while (size < arrayList.size()) {
                                                str5 = (String) arrayList.get(size);
                                                if (str5.startsWith("#")) {
                                                    throw new C1587("SVG external resources are not supported");
                                                }
                                                arrayList.set(size, str5.substring(1));
                                            }
                                        }
                                        z12 = z3;
                                    }
                                    z2 = true;
                                    if ("href".equals(attributeName)) {
                                        str3 = str13;
                                        if ("use".equals(str3)) {
                                            str2 = str9;
                                            str6 = str10;
                                            str4 = str12;
                                        } else {
                                            str2 = str9;
                                            str6 = str10;
                                            str4 = str12;
                                        }
                                        if (attributeNamespace != null) {
                                            str10 = str6;
                                            z3 = z2;
                                        } else {
                                            str10 = str6;
                                            z3 = z2;
                                        }
                                        strM19276 = C6972.m19276(strTrim);
                                        if (strM19276.startsWith("#")) {
                                            throw new C1587("SVG external resources are not supported");
                                        }
                                        arrayList = arrayList3;
                                        arrayList.add(strM19276.substring(1));
                                        if (z) {
                                            C6972.m19272(attributeName, strTrim, arrayList);
                                            while (size < arrayList.size()) {
                                                str5 = (String) arrayList.get(size);
                                                if (str5.startsWith("#")) {
                                                    throw new C1587("SVG external resources are not supported");
                                                }
                                                arrayList.set(size, str5.substring(1));
                                            }
                                        }
                                        z12 = z3;
                                    } else {
                                        str2 = str9;
                                        str3 = str13;
                                        str4 = str12;
                                        str7 = str7;
                                    }
                                    z3 = z2;
                                    arrayList = arrayList3;
                                    if (z) {
                                        C6972.m19272(attributeName, strTrim, arrayList);
                                        while (size < arrayList.size()) {
                                            str5 = (String) arrayList.get(size);
                                            if (str5.startsWith("#")) {
                                                throw new C1587("SVG external resources are not supported");
                                            }
                                            arrayList.set(size, str5.substring(1));
                                        }
                                    }
                                    z12 = z3;
                                }
                                z2 = z12;
                                if ("href".equals(attributeName)) {
                                    str3 = str13;
                                    if ("use".equals(str3)) {
                                        str2 = str9;
                                        str6 = str10;
                                        str4 = str12;
                                    } else {
                                        str2 = str9;
                                        str6 = str10;
                                        str4 = str12;
                                    }
                                    if (attributeNamespace != null) {
                                        str10 = str6;
                                        z3 = z2;
                                    } else {
                                        str10 = str6;
                                        z3 = z2;
                                    }
                                    strM19276 = C6972.m19276(strTrim);
                                    if (strM19276.startsWith("#")) {
                                        throw new C1587("SVG external resources are not supported");
                                    }
                                    arrayList = arrayList3;
                                    arrayList.add(strM19276.substring(1));
                                    if (z) {
                                        C6972.m19272(attributeName, strTrim, arrayList);
                                        while (size < arrayList.size()) {
                                            str5 = (String) arrayList.get(size);
                                            if (str5.startsWith("#")) {
                                                throw new C1587("SVG external resources are not supported");
                                            }
                                            arrayList.set(size, str5.substring(1));
                                        }
                                    }
                                    z12 = z3;
                                } else {
                                    str2 = str9;
                                    str3 = str13;
                                    str4 = str12;
                                    str7 = str7;
                                }
                                z3 = z2;
                                arrayList = arrayList3;
                                if (z) {
                                    C6972.m19272(attributeName, strTrim, arrayList);
                                    while (size < arrayList.size()) {
                                        str5 = (String) arrayList.get(size);
                                        if (str5.startsWith("#")) {
                                            throw new C1587("SVG external resources are not supported");
                                        }
                                        arrayList.set(size, str5.substring(1));
                                    }
                                }
                                z12 = z3;
                            }
                            i7++;
                            arrayList3 = arrayList;
                            str9 = str2;
                            name = str3;
                            str8 = str4;
                            str7 = str7;
                            z9 = z12;
                            zEquals = zEquals;
                            j4 = jMax;
                            z8 = z;
                        }
                        str = str7;
                        if (str11 != null) {
                            C6741.m18844(str11);
                            linkedHashSet = linkedHashSet3;
                            linkedHashSet.add(str11);
                        } else {
                            linkedHashSet = linkedHashSet3;
                        }
                        z4 = z7;
                        z5 = z11;
                        i4 = i6;
                        j2 = j4;
                    }
                    j3 = j;
                    i3 = i3;
                    i5 = i5;
                } else {
                    arrayDeque = arrayDeque;
                    str = str7;
                    linkedHashSet = linkedHashSet2;
                    c5316 = c5316;
                    int i10 = i4;
                    long j6 = j3;
                    boolean z16 = z4;
                    if (eventType == 3) {
                        i3--;
                        if (i10 > 0) {
                            i4 = i10 - 1;
                            z4 = z16;
                            j3 = j6;
                        } else {
                            arrayDeque.pop();
                        }
                    } else if (i10 == 0 && i5 > 0 && (eventType == 4 || eventType == 5)) {
                        ((C5316) arrayDeque.peek()).f18698 += (long) xmlPullParserNewPullParser.getText().length();
                        if (!xmlPullParserNewPullParser.isWhitespace()) {
                            length2 += (long) xmlPullParserNewPullParser.getText().length();
                        }
                        if (length2 > 1048576) {
                            throw new C22470("SVG text exceeds safe parse limits");
                        }
                    }
                    z4 = z16;
                    j3 = j6;
                    i4 = i10;
                }
                eventType = xmlPullParserNewPullParser.nextToken();
                i = 0;
                i2 = 1;
                linkedHashSet2 = linkedHashSet;
                c5316 = c5316;
                arrayDeque = arrayDeque;
                str7 = str;
            }
            LinkedHashSet linkedHashSet4 = linkedHashSet2;
            C5316 c5318 = c5316;
            long j7 = j3;
            boolean z17 = z4;
            if (i5 == 0) {
                throw new IOException("SVG root element is missing");
            }
            long[] jArr = {0, 0, 0, 0, 0};
            m39137(c5318, map, new HashSet(), jArr, 0, 0, z17, c4108);
            long j8 = (length * 4) + (j2 * 2) + (length2 * 2) + (j7 * 32) + (((long) i5) * 512) + 65536;
            int i11 = ((int) jArr[3]) + 1;
            long j9 = jArr[0];
            int i12 = (int) j9;
            long j10 = jArr[2];
            return new C12773(i11, i12, j10, j8, z5 && j9 <= 128 && jArr[1] <= 16 && j10 <= 16384, linkedHashSet4);
        } catch (XmlPullParserException e) {
            throw new IOException("SVG XML could not be parsed", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39137(C5316 c5316, HashMap map, HashSet hashSet, long[] jArr, int i, int i2, boolean z, C4108 c4108) throws C22470, InterruptedIOException {
        m39138(c4108);
        long j = jArr[0] + 1;
        jArr[0] = j;
        if (j > X931RNG.BLOCK64_RESEED_MAX || i > 64 || !hashSet.add(c5316)) {
            throw new C22470("SVG references exceed safe render limits");
        }
        jArr[1] = Math.max(jArr[1], i);
        jArr[2] = jArr[2] + c5316.f18698;
        long j2 = jArr[4] + c5316.f18703;
        jArr[4] = j2;
        if (j2 > 1048576) {
            throw new C22470("SVG expanded geometry exceeds safe render limits");
        }
        int i3 = i2 + ((!z || i <= 0) ? c5316.f18701 : 3);
        jArr[3] = Math.max(jArr[3], i3);
        for (C5316 c5317 : c5316.f18702) {
            if (!c5317.f18699 || z) {
                m39137(c5317, map, hashSet, jArr, i + 1, i3, z, c4108);
            }
        }
        Iterator it = c5316.f18700.iterator();
        while (it.hasNext()) {
            C5316 c5318 = (C5316) map.get((String) it.next());
            if (c5318 != null) {
                m39137(c5318, map, hashSet, jArr, i + 1, i3, z, c4108);
            }
        }
        hashSet.remove(c5316);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39128(float f) throws IOException {
        if (f <= 0.0f || Float.isInfinite(f) || f > 1000000.0f) {
            throw new IOException("Image has no finite dimensions");
        }
        return Math.max(1, (int) Math.ceil(f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9153 m39131(C2442 c2442, long j) throws C18740 {
        C9153 c9153M8242 = c2442.m8242(j);
        if (c9153M8242 != null) {
            return c9153M8242;
        }
        throw new C18740("Special image reservation exceeds budget");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39138(InterfaceC7509 interfaceC7509) throws InterruptedIOException {
        if (interfaceC7509.mo924()) {
            throw new InterruptedIOException("Image decode cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39139(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() + i <= bArr.length) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39129(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39141(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | m39129(i, bArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m39140(int i, byte[] bArr) {
        return ((((long) bArr[i + 3]) & 255) << 24) | (((long) m39141(i, bArr)) & 16777215);
    }
}
