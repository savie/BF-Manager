package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܺᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16102 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15397 f52058;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f52059;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C14690 f52060;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8258 f52061;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f52062 = new ArrayDeque();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f52063;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18924 f52064;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52066;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52067;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19630 f52068;

    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    public C16102(AbstractC20745 abstractC20745, C5518 c5518, C15397 c15397, C8258 c8258, C14690 c14690, C10458 c10458) {
        boolean z;
        String str;
        String str2;
        this.f52058 = c15397;
        this.f52061 = c8258;
        this.f52060 = c14690;
        String strName = c5518.f18938.name();
        boolean z2 = strName.equalsIgnoreCase(a.D) || strName.equalsIgnoreCase("UTF-16LE") || strName.equalsIgnoreCase("UTF-16BE") || strName.equalsIgnoreCase("UTF-32LE") || strName.equalsIgnoreCase("UTF-32BE") || strName.equalsIgnoreCase("US-ASCII") || strName.equalsIgnoreCase(LocalizedMessage.DEFAULT_ENCODING);
        C19630 c19630 = new C19630(abstractC20745, c5518, z2 ? c15397.f50123 : c5518.f18939, c10458);
        this.f52068 = c19630;
        long j = z2 ? c15397.f50121 : 0L;
        long jPosition = c19630.position();
        while (true) {
            try {
                long j2 = c15397.f50128;
                if (j < j2) {
                    C18924 c18924M44734 = this.f52068.m44734(j);
                    if (c18924M44734 == null) {
                        throw new IOException("File ended before the text search checkpoint.");
                    }
                    if (c18924M44734.m43587() >= c15397.f50121) {
                        m38133(c18924M44734);
                    }
                    j++;
                    jPosition = c18924M44734.m43589();
                } else {
                    if (c15397.f50129) {
                        C18924 c18924M44735 = this.f52068.m44734(j2);
                        this.f52064 = c18924M44735;
                        if (c18924M44735 == null) {
                            throw new IOException("Missing pending search line.");
                        }
                        m38134();
                        if (this.f52063 != null) {
                            c15397.f50125 = this.f52064.m43591();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (CharacterCodingException e) {
                e = e;
                c15397.f50128 = j;
                c15397.f50125 = jPosition;
                c15397.f50129 = false;
                this.f52064 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f52063 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f52059 = str2;
                return;
            } catch (C8341 e2) {
                e = e2;
                c15397.f50128 = j;
                c15397.f50125 = jPosition;
                c15397.f50129 = false;
                this.f52064 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f52063 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f52059 = str2;
                return;
            } catch (Throwable th) {
                try {
                    this.f52068.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21040 m38136(long j, long j2, C14517 c14517) throws IOException {
        ArrayDeque arrayDeque;
        C19630 c19630;
        C8258 c8258;
        long j3;
        long j4;
        long jM43588;
        long j5;
        long j6;
        C7635 c7635;
        C8258 c8259 = this.f52061;
        C21040 c21040 = new C21040(c8259.m21656());
        c14517.getClass();
        long jNanoTime = System.nanoTime();
        C15397 c15397 = this.f52058;
        long j7 = c15397.f50125;
        boolean z = false;
        loop0: while (true) {
            C19630.m44732();
            String str = this.f52063;
            C19630 c19631 = this.f52068;
            arrayDeque = this.f52062;
            if (str == null) {
                C18924 c18924 = this.f52064;
                if (c18924 != null) {
                    boolean z2 = this.f52067;
                    JSONArray jSONArray = c21040.f68527;
                    if (!z2 || c15397.f50116 == c18924.m43587() || jSONArray.size() < c8259.m21652()) {
                        if (this.f52067) {
                            j5 = 1;
                        } else {
                            if (this.f52064.m43587() <= c15397.f50118) {
                                j5 = 1;
                            } else {
                                c8258 = c8259;
                                j3 = jNanoTime;
                                j4 = j7;
                                c19630 = c19631;
                                arrayDeque = arrayDeque;
                                j5 = 1;
                            }
                            jM43588 = 0;
                            m38133(this.f52064);
                            c15397.f50128 = this.f52064.m43587() + j5;
                            c15397.f50129 = false;
                            this.f52064 = null;
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (this.f52067) {
                            arrayList.addAll(arrayDeque);
                            c19630 = c19631;
                            long j8 = jNanoTime;
                            long jMax = Math.max(0L, this.f52064.m43587() - ((long) c8259.m21655()));
                            if (c8259.m21655() > 0) {
                                j3 = j8;
                                if (this.f52064.m43587() > 0 && (arrayDeque.isEmpty() || ((C18924) arrayDeque.getFirst()).m43587() > jMax || ((C18924) arrayDeque.getFirst()).m43588() > 0)) {
                                    c21040.m47441(jMax, "context_clipped");
                                }
                            } else {
                                j3 = j8;
                            }
                        } else {
                            j3 = jNanoTime;
                            c19630 = c19631;
                        }
                        arrayList.add(this.f52064);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C18924 c18925 = (C18924) it.next();
                                arrayDeque = arrayDeque;
                                if (c18925.m43587() < c15397.f50117) {
                                    arrayDeque = arrayDeque;
                                } else {
                                    long jM43587 = c18925.m43587();
                                    long j9 = c15397.f50117;
                                    long jM43589 = c18925.m43588();
                                    if (jM43587 == j9) {
                                        jM43589 = Math.max(jM43589, c15397.f50122);
                                    }
                                    long j10 = j7;
                                    if (c18925.m43587() < c21040.f68530) {
                                        j6 = j5;
                                    } else {
                                        if (c18925.m43587() == c21040.f68530) {
                                            jM43589 = Math.max(jM43589, c21040.f68531);
                                        }
                                        int iCodePointCount = c18925.m43592().codePointCount(0, c18925.m43592().length());
                                        long jM435810 = jM43589 - c18925.m43588();
                                        j6 = j5;
                                        if (jM435810 < iCodePointCount) {
                                            int i = (int) jM435810;
                                            int iOffsetByCodePoints = c18925.m43592().offsetByCodePoints(0, i);
                                            int i2 = c21040.f68532;
                                            if (i2 != 0) {
                                                int iMin = Math.min(i2, iCodePointCount - i);
                                                int iOffsetByCodePoints2 = c18925.m43592().offsetByCodePoints(iOffsetByCodePoints, iMin);
                                                if (iOffsetByCodePoints2 < c18925.m43592().length() && iOffsetByCodePoints2 > iOffsetByCodePoints && c18925.m43592().charAt(iOffsetByCodePoints2 - 1) == '\r' && c18925.m43592().charAt(iOffsetByCodePoints2) == '\n') {
                                                    iOffsetByCodePoints2--;
                                                    iMin--;
                                                }
                                                if (iMin != 0) {
                                                    C18924 c18926 = this.f52064;
                                                    if (c18925 == c18926 && this.f52067 && c15397.f50116 != c18926.m43587()) {
                                                        jSONArray.add(this.f52064.m43587());
                                                        c15397.f50116 = this.f52064.m43587();
                                                        c15397.f50118 = Math.max(c15397.f50118, this.f52064.m43587() + ((long) c8259.m21653()));
                                                    }
                                                    long jM435811 = c18925.m43587();
                                                    String strSubstring = c18925.m43592().substring(iOffsetByCodePoints, iOffsetByCodePoints2);
                                                    ArrayList arrayList2 = c21040.f68528;
                                                    if (!arrayList2.isEmpty() && jM435811 == c21040.f68530 && jM43589 == c21040.f68531) {
                                                        c7635 = (C7635) C19084.m43861(arrayList2, 1);
                                                    } else {
                                                        C7635 c7636 = new C7635(jM435811, jM43589);
                                                        arrayList2.add(c7636);
                                                        c7635 = c7636;
                                                    }
                                                    c7635.f25206.append(strSubstring);
                                                    c21040.f68530 = jM435811;
                                                    c21040.f68531 = ((long) strSubstring.codePointCount(0, strSubstring.length())) + jM43589;
                                                    if (strSubstring.endsWith("\n") || strSubstring.endsWith("\r")) {
                                                        c21040.f68530 += j6;
                                                        c21040.f68531 = 0L;
                                                    }
                                                    c21040.f68532 -= iMin;
                                                    c15397.f50117 = c18925.m43587();
                                                    c15397.f50122 = jM43589 + ((long) iMin);
                                                    if (iOffsetByCodePoints2 >= c18925.m43592().length()) {
                                                        c15397.f50117 = c18925.m43587() + j6;
                                                        c15397.f50122 = 0L;
                                                        it = it;
                                                        c8259 = c8259;
                                                    }
                                                }
                                            }
                                            c21040.f68529 = "output_limit";
                                            break loop0;
                                        }
                                        j7 = j10;
                                        j5 = j6;
                                    }
                                    j7 = j10;
                                    j5 = j6;
                                }
                            } else {
                                c8258 = c8259;
                                j4 = j7;
                                arrayDeque = arrayDeque;
                                jM43588 = 0;
                                m38133(this.f52064);
                                c15397.f50128 = this.f52064.m43587() + j5;
                                c15397.f50129 = false;
                                this.f52064 = null;
                                z = true;
                            }
                        }
                    } else {
                        c21040.f68529 = "match_limit";
                    }
                } else {
                    c8258 = c8259;
                    j3 = jNanoTime;
                    j4 = j7;
                    c19630 = c19631;
                    arrayDeque = arrayDeque;
                    jM43588 = 0;
                }
                if (!this.f52065) {
                    if (z && (c15397.f50125 - j4 >= j || System.nanoTime() - j3 >= j2)) {
                        c21040.f68529 = "scan_budget";
                        break;
                    }
                    try {
                        C19630 c19632 = c19630;
                        C18924 c18924M44734 = c19632.m44734(c15397.f50128);
                        this.f52064 = c18924M44734;
                        if (c18924M44734 == null) {
                            this.f52065 = true;
                            c15397.f50125 = c19632.position();
                        } else {
                            m38134();
                            if (this.f52063 == null) {
                                c15397.f50129 = true;
                                c15397.f50125 = this.f52064.m43589();
                                c15397.f50117 = ((!this.f52067 || arrayDeque.isEmpty()) ? this.f52064 : (C18924) arrayDeque.getFirst()).m43587();
                                if (this.f52067 && !arrayDeque.isEmpty()) {
                                    jM43588 = ((C18924) arrayDeque.getFirst()).m43588();
                                }
                                c15397.f50122 = jM43588;
                            }
                        }
                    } catch (CharacterCodingException unused) {
                        this.f52063 = "decode_error";
                        this.f52059 = "invalid_encoding";
                    } catch (C8341 unused2) {
                        this.f52063 = "resource_limit";
                        this.f52059 = "line_too_long";
                    }
                    c8259 = c8258;
                    jNanoTime = j3;
                    j7 = j4;
                } else {
                    c21040.f68529 = d.aB;
                    break;
                }
            } else {
                c21040.f68529 = str;
                c21040.m47441(c15397.f50128, this.f52059);
                long j11 = c15397.f50128;
                if (j11 <= c15397.f50118) {
                    c21040.m47441(j11, "context_incomplete");
                }
            }
            c19630 = c19631;
            arrayDeque = arrayDeque;
            break;
        }
        if (arrayDeque.isEmpty()) {
            c15397.f50121 = c15397.f50128;
            C18924 c18927 = this.f52064;
            c15397.f50123 = c18927 == null ? c19630.position() : c18927.m43591();
        } else {
            c15397.f50121 = ((C18924) arrayDeque.getFirst()).m43587();
            c15397.f50123 = ((C18924) arrayDeque.getFirst()).m43591();
        }
        return c21040;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m38134() throws InterruptedIOException {
        C19630.m44732();
        C6222 c6222Matcher = this.f52060.matcher((CharSequence) this.f52064.m43592().substring(0, this.f52064.m43593()));
        this.f52067 = c6222Matcher.find();
        C19630.m44732();
        if (c6222Matcher.m17270() || c6222Matcher.m17258()) {
            this.f52063 = "resource_limit";
            this.f52059 = "match_resource_limit";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38133(C18924 c18924) {
        C8258 c8258 = this.f52061;
        if (c8258.m21655() == 0) {
            return;
        }
        C18924 c18924M43590 = c18924.m43590(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        ArrayDeque arrayDeque = this.f52062;
        arrayDeque.addLast(c18924M43590);
        this.f52066 = c18924M43590.m43592().length() + this.f52066;
        while (arrayDeque.size() > c8258.m21655()) {
            this.f52066 -= ((C18924) arrayDeque.removeFirst()).m43592().length();
        }
        while (this.f52066 > 131072 && !arrayDeque.isEmpty()) {
            C18924 c18925 = (C18924) arrayDeque.removeFirst();
            int length = this.f52066 - c18925.m43592().length();
            this.f52066 = length;
            int i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - length;
            if (i > 1) {
                C18924 c18924M43591 = c18925.m43590(i);
                arrayDeque.addFirst(c18924M43591);
                this.f52066 = c18924M43591.m43592().length() + this.f52066;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38135() {
        long length = (((long) this.f52061.m21651().length()) * 512) + 65536;
        int i = this.f52066;
        C18924 c18924 = this.f52064;
        return (((long) (i + (c18924 == null ? 0 : c18924.m43592().length()))) * 2) + length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f52068.close();
    }
}
