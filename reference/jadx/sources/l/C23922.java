package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.d;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩺֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23922 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f77440;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16329 f77441;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f77442;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f77443 = new ArrayDeque();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f77444;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23176 f77445;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18415 f77446;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17208 f77447;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11241 f77448;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f77449;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77450;

    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    public C23922(AbstractC22044 abstractC22044, C10495 c10495, C11241 c11241, C16329 c16329, C18415 c18415, C20192 c20192) {
        boolean z;
        String str;
        String str2;
        this.f77448 = c11241;
        this.f77441 = c16329;
        this.f77446 = c18415;
        String strName = c10495.f33393.name();
        boolean z2 = strName.equalsIgnoreCase(a.D) || strName.equalsIgnoreCase("UTF-16LE") || strName.equalsIgnoreCase("UTF-16BE") || strName.equalsIgnoreCase("UTF-32LE") || strName.equalsIgnoreCase("UTF-32BE") || strName.equalsIgnoreCase("US-ASCII") || strName.equalsIgnoreCase(LocalizedMessage.DEFAULT_ENCODING);
        C23176 c23176 = new C23176(abstractC22044, c10495, z2 ? c11241.f35500 : c10495.f33394, c20192);
        this.f77445 = c23176;
        long j = z2 ? c11241.f35492 : 0L;
        long jPosition = c23176.position();
        while (true) {
            try {
                long j2 = c11241.f35495;
                if (j < j2) {
                    C17208 c17208M52095 = this.f77445.m52095(j);
                    if (c17208M52095 == null) {
                        throw new IOException("File ended before the text search checkpoint.");
                    }
                    if (c17208M52095.m40427() >= c11241.f35492) {
                        m53436(c17208M52095);
                    }
                    j++;
                    jPosition = c17208M52095.m40423();
                } else {
                    if (c11241.f35503) {
                        C17208 c17208M52096 = this.f77445.m52095(j2);
                        this.f77447 = c17208M52096;
                        if (c17208M52096 == null) {
                            throw new IOException("Missing pending search line.");
                        }
                        m53437();
                        if (this.f77442 != null) {
                            c11241.f35496 = this.f77447.m40429();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (CharacterCodingException e) {
                e = e;
                c11241.f35495 = j;
                c11241.f35496 = jPosition;
                c11241.f35503 = false;
                this.f77447 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f77442 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f77444 = str2;
                return;
            } catch (C15716 e2) {
                e = e2;
                c11241.f35495 = j;
                c11241.f35496 = jPosition;
                c11241.f35503 = false;
                this.f77447 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f77442 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f77444 = str2;
                return;
            } catch (Throwable th) {
                try {
                    this.f77445.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6022 m53439(long j, long j2, C10792 c10792) throws IOException {
        ArrayDeque arrayDeque;
        C23176 c23176;
        C16329 c16329;
        long j3;
        long j4;
        long jM40426;
        long j5;
        long j6;
        C11987 c11987;
        C16329 c163210 = this.f77441;
        C6022 c6022 = new C6022(c163210.m38759());
        c10792.getClass();
        long jNanoTime = System.nanoTime();
        C11241 c11241 = this.f77448;
        long j7 = c11241.f35496;
        boolean z = false;
        loop0: while (true) {
            C23176.m52093();
            String str = this.f77442;
            C23176 c23177 = this.f77445;
            arrayDeque = this.f77443;
            if (str == null) {
                C17208 c17208 = this.f77447;
                if (c17208 != null) {
                    boolean z2 = this.f77450;
                    JSONArray jSONArray = c6022.f20587;
                    if (!z2 || c11241.f35501 == c17208.m40427() || jSONArray.size() < c163210.m38757()) {
                        if (this.f77450) {
                            j5 = 1;
                        } else {
                            if (this.f77447.m40427() <= c11241.f35490) {
                                j5 = 1;
                            } else {
                                c16329 = c163210;
                                j3 = jNanoTime;
                                j4 = j7;
                                c23176 = c23177;
                                arrayDeque = arrayDeque;
                                j5 = 1;
                            }
                            jM40426 = 0;
                            m53436(this.f77447);
                            c11241.f35495 = this.f77447.m40427() + j5;
                            c11241.f35503 = false;
                            this.f77447 = null;
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (this.f77450) {
                            arrayList.addAll(arrayDeque);
                            c23176 = c23177;
                            long j8 = jNanoTime;
                            long jMax = Math.max(0L, this.f77447.m40427() - ((long) c163210.m38760()));
                            if (c163210.m38760() > 0) {
                                j3 = j8;
                                if (this.f77447.m40427() > 0 && (arrayDeque.isEmpty() || ((C17208) arrayDeque.getFirst()).m40427() > jMax || ((C17208) arrayDeque.getFirst()).m40426() > 0)) {
                                    c6022.m17486(jMax, "context_clipped");
                                }
                            } else {
                                j3 = j8;
                            }
                        } else {
                            j3 = jNanoTime;
                            c23176 = c23177;
                        }
                        arrayList.add(this.f77447);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C17208 c17209 = (C17208) it.next();
                                arrayDeque = arrayDeque;
                                if (c17209.m40427() < c11241.f35489) {
                                    arrayDeque = arrayDeque;
                                } else {
                                    long jM40427 = c17209.m40427();
                                    long j9 = c11241.f35489;
                                    long jM40428 = c17209.m40426();
                                    if (jM40427 == j9) {
                                        jM40428 = Math.max(jM40428, c11241.f35491);
                                    }
                                    long j10 = j7;
                                    if (c17209.m40427() < c6022.f20582) {
                                        j6 = j5;
                                    } else {
                                        if (c17209.m40427() == c6022.f20582) {
                                            jM40428 = Math.max(jM40428, c6022.f20586);
                                        }
                                        int iCodePointCount = c17209.m40425().codePointCount(0, c17209.m40425().length());
                                        long jM40429 = jM40428 - c17209.m40426();
                                        j6 = j5;
                                        if (jM40429 < iCodePointCount) {
                                            int i = (int) jM40429;
                                            int iOffsetByCodePoints = c17209.m40425().offsetByCodePoints(0, i);
                                            int i2 = c6022.f20584;
                                            if (i2 != 0) {
                                                int iMin = Math.min(i2, iCodePointCount - i);
                                                int iOffsetByCodePoints2 = c17209.m40425().offsetByCodePoints(iOffsetByCodePoints, iMin);
                                                if (iOffsetByCodePoints2 < c17209.m40425().length() && iOffsetByCodePoints2 > iOffsetByCodePoints && c17209.m40425().charAt(iOffsetByCodePoints2 - 1) == '\r' && c17209.m40425().charAt(iOffsetByCodePoints2) == '\n') {
                                                    iOffsetByCodePoints2--;
                                                    iMin--;
                                                }
                                                if (iMin != 0) {
                                                    C17208 c172010 = this.f77447;
                                                    if (c17209 == c172010 && this.f77450 && c11241.f35501 != c172010.m40427()) {
                                                        jSONArray.add(this.f77447.m40427());
                                                        c11241.f35501 = this.f77447.m40427();
                                                        c11241.f35490 = Math.max(c11241.f35490, this.f77447.m40427() + ((long) c163210.m38755()));
                                                    }
                                                    long jM404210 = c17209.m40427();
                                                    String strSubstring = c17209.m40425().substring(iOffsetByCodePoints, iOffsetByCodePoints2);
                                                    ArrayList arrayList2 = c6022.f20581;
                                                    if (!arrayList2.isEmpty() && jM404210 == c6022.f20582 && jM40428 == c6022.f20586) {
                                                        c11987 = (C11987) j$$ExternalSyntheticOutline0.m(arrayList2, 1);
                                                    } else {
                                                        C11987 c11988 = new C11987(jM404210, jM40428);
                                                        arrayList2.add(c11988);
                                                        c11987 = c11988;
                                                    }
                                                    c11987.f38621.append(strSubstring);
                                                    c6022.f20582 = jM404210;
                                                    c6022.f20586 = ((long) strSubstring.codePointCount(0, strSubstring.length())) + jM40428;
                                                    if (strSubstring.endsWith("\n") || strSubstring.endsWith("\r")) {
                                                        c6022.f20582 += j6;
                                                        c6022.f20586 = 0L;
                                                    }
                                                    c6022.f20584 -= iMin;
                                                    c11241.f35489 = c17209.m40427();
                                                    c11241.f35491 = jM40428 + ((long) iMin);
                                                    if (iOffsetByCodePoints2 >= c17209.m40425().length()) {
                                                        c11241.f35489 = c17209.m40427() + j6;
                                                        c11241.f35491 = 0L;
                                                        it = it;
                                                        c163210 = c163210;
                                                    }
                                                }
                                            }
                                            c6022.f20585 = "output_limit";
                                            break loop0;
                                        }
                                        j7 = j10;
                                        j5 = j6;
                                    }
                                    j7 = j10;
                                    j5 = j6;
                                }
                            } else {
                                c16329 = c163210;
                                j4 = j7;
                                arrayDeque = arrayDeque;
                                jM40426 = 0;
                                m53436(this.f77447);
                                c11241.f35495 = this.f77447.m40427() + j5;
                                c11241.f35503 = false;
                                this.f77447 = null;
                                z = true;
                            }
                        }
                    } else {
                        c6022.f20585 = "match_limit";
                    }
                } else {
                    c16329 = c163210;
                    j3 = jNanoTime;
                    j4 = j7;
                    c23176 = c23177;
                    arrayDeque = arrayDeque;
                    jM40426 = 0;
                }
                if (!this.f77440) {
                    if (z && (c11241.f35496 - j4 >= j || System.nanoTime() - j3 >= j2)) {
                        c6022.f20585 = "scan_budget";
                        break;
                    }
                    try {
                        C23176 c23178 = c23176;
                        C17208 c17208M52095 = c23178.m52095(c11241.f35495);
                        this.f77447 = c17208M52095;
                        if (c17208M52095 == null) {
                            this.f77440 = true;
                            c11241.f35496 = c23178.position();
                        } else {
                            m53437();
                            if (this.f77442 == null) {
                                c11241.f35503 = true;
                                c11241.f35496 = this.f77447.m40423();
                                c11241.f35489 = ((!this.f77450 || arrayDeque.isEmpty()) ? this.f77447 : (C17208) arrayDeque.getFirst()).m40427();
                                if (this.f77450 && !arrayDeque.isEmpty()) {
                                    jM40426 = ((C17208) arrayDeque.getFirst()).m40426();
                                }
                                c11241.f35491 = jM40426;
                            }
                        }
                    } catch (CharacterCodingException unused) {
                        this.f77442 = "decode_error";
                        this.f77444 = "invalid_encoding";
                    } catch (C15716 unused2) {
                        this.f77442 = "resource_limit";
                        this.f77444 = "line_too_long";
                    }
                    c163210 = c16329;
                    jNanoTime = j3;
                    j7 = j4;
                } else {
                    c6022.f20585 = d.aB;
                    break;
                }
            } else {
                c6022.f20585 = str;
                c6022.m17486(c11241.f35495, this.f77444);
                long j11 = c11241.f35495;
                if (j11 <= c11241.f35490) {
                    c6022.m17486(j11, "context_incomplete");
                }
            }
            c23176 = c23177;
            arrayDeque = arrayDeque;
            break;
        }
        if (arrayDeque.isEmpty()) {
            c11241.f35492 = c11241.f35495;
            C17208 c172011 = this.f77447;
            c11241.f35500 = c172011 == null ? c23176.position() : c172011.m40429();
        } else {
            c11241.f35492 = ((C17208) arrayDeque.getFirst()).m40427();
            c11241.f35500 = ((C17208) arrayDeque.getFirst()).m40429();
        }
        return c6022;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m53437() throws InterruptedIOException {
        C23176.m52093();
        C4245 c4245M36883 = C15407.m36883(this.f77446, this.f77447.m40425().substring(0, this.f77447.m40428()));
        this.f77450 = c4245M36883.find();
        C23176.m52093();
        if (c4245M36883.m13557() || c4245M36883.m13560()) {
            this.f77442 = "resource_limit";
            this.f77444 = "match_resource_limit";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53436(C17208 c17208) {
        C16329 c16329 = this.f77441;
        if (c16329.m38760() == 0) {
            return;
        }
        C17208 c17208M40424 = c17208.m40424(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        ArrayDeque arrayDeque = this.f77443;
        arrayDeque.addLast(c17208M40424);
        this.f77449 = c17208M40424.m40425().length() + this.f77449;
        while (arrayDeque.size() > c16329.m38760()) {
            this.f77449 -= ((C17208) arrayDeque.removeFirst()).m40425().length();
        }
        while (this.f77449 > 131072 && !arrayDeque.isEmpty()) {
            C17208 c17209 = (C17208) arrayDeque.removeFirst();
            int length = this.f77449 - c17209.m40425().length();
            this.f77449 = length;
            int i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - length;
            if (i > 1) {
                C17208 c17208M40425 = c17209.m40424(i);
                arrayDeque.addFirst(c17208M40425);
                this.f77449 = c17208M40425.m40425().length() + this.f77449;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m53438() {
        long length = (((long) this.f77441.m38758().length()) * 512) + 65536;
        int i = this.f77449;
        C17208 c17208 = this.f77447;
        return (((long) (i + (c17208 == null ? 0 : c17208.m40425().length()))) * 2) + length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f77445.close();
    }
}
