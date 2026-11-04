package l;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes.dex */
public final class C24777 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC13433 f80193;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f80194;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Uri f80195;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f80196;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f80197;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f80198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f80199;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C25368 f80200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14178 f80201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f80202;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f80203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3147 f80204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f80205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23285 f80206;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f80207;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f80208 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15079 f80209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f80210;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f80211;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C25368 f80212;

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f80202.mo10894(interfaceC4639);
        this.f80211.mo10894(interfaceC4639);
    }

    public C24777(InterfaceC15079 interfaceC15079, InterfaceC13433 interfaceC13433, InterfaceC13433 interfaceC13434, C1656 c1656, InterfaceC23285 interfaceC23285, int i, boolean z) {
        this.f80209 = interfaceC15079;
        this.f80202 = interfaceC13434;
        this.f80206 = interfaceC23285;
        this.f80210 = (i & 2) != 0;
        this.f80203 = false;
        this.f80194 = z;
        if (interfaceC13433 != null) {
            this.f80211 = interfaceC13433;
            this.f80201 = c1656 != null ? new C14178(interfaceC13433, c1656) : null;
        } else {
            this.f80211 = C9703.f31332;
            this.f80201 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15079 m55308() {
        return this.f80209;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23285 m55307() {
        return this.f80206;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        try {
            String strMo25860 = this.f80206.mo25860(c25368);
            C11941 c11941M56734 = c25368.m56734();
            long j = c25368.f81909;
            long j2 = c25368.f81910;
            c11941M56734.m29912(strMo25860);
            C25368 c25368M29908 = c11941M56734.m29908();
            Uri uri = c25368M29908.f81907;
            this.f80200 = c25368M29908;
            boolean z = this.f80194;
            InterfaceC15079 interfaceC15079 = this.f80209;
            if (z) {
                String strM43654 = interfaceC15079.mo22517(strMo25860).m43654("exo_redir");
                Uri uri2 = strM43654 == null ? null : Uri.parse(strM43654);
                if (uri2 != null) {
                    uri = uri2;
                }
            }
            this.f80195 = uri;
            this.f80207 = j;
            boolean z2 = (this.f80210 && this.f80197) || (this.f80203 && j2 == -1);
            this.f80205 = z2;
            if (z2) {
                this.f80198 = -1L;
            } else {
                long jM42087 = C18063.m42087(interfaceC15079.mo22517(strMo25860));
                this.f80198 = jM42087;
                if (jM42087 != -1) {
                    long j3 = jM42087 - j;
                    this.f80198 = j3;
                    if (j3 < 0) {
                        throw new C5976(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.f80198;
                this.f80198 = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.f80198;
            if (j5 > 0 || j5 == -1) {
                m55305(c25368M29908, false);
            }
            return j2 != -1 ? j2 : this.f80198;
        } catch (Throwable th) {
            if (this.f80193 == this.f80202 || (th instanceof C22539)) {
                this.f80197 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:9:0x001f, B:11:0x0027, B:12:0x002a, B:14:0x003b, B:16:0x004c, B:18:0x0050, B:23:0x0059, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:33:0x0082, B:39:0x0090), top: B:48:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        InterfaceC13433 interfaceC13433 = this.f80202;
        if (i2 == 0) {
            return 0;
        }
        if (this.f80198 == 0) {
            return -1;
        }
        C25368 c25368 = this.f80200;
        c25368.getClass();
        C25368 c25369 = this.f80212;
        c25369.getClass();
        try {
            if (this.f80207 >= this.f80196) {
                m55305(c25368, true);
            }
            InterfaceC13433 interfaceC13434 = this.f80193;
            interfaceC13434.getClass();
            int i3 = interfaceC13434.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = i3;
                this.f80207 += j2;
                this.f80199 += j2;
                long j3 = this.f80198;
                if (j3 != -1) {
                    this.f80198 = j3 - j2;
                    return i3;
                }
            } else {
                InterfaceC13433 interfaceC13435 = this.f80193;
                if (!(interfaceC13435 == interfaceC13433)) {
                    long j4 = c25369.f81910;
                    if (j4 == -1 || this.f80199 < j4) {
                        String str = c25368.f81911;
                        String str2 = C7116.f23455;
                        this.f80198 = 0L;
                        if (interfaceC13435 == this.f80201) {
                            C7622 c7622 = new C7622();
                            C7622.m20818(c7622, this.f80207);
                            this.f80209.mo22520(str, c7622);
                            return i3;
                        }
                    } else {
                        j = this.f80198;
                        if (j <= 0) {
                            if (j == -1) {
                            }
                        }
                        m55306();
                        m55305(c25368, false);
                        return read(bArr, i, i2);
                    }
                } else {
                    j = this.f80198;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    m55306();
                    m55305(c25368, false);
                    return read(bArr, i, i2);
                }
            }
            return i3;
        } catch (Throwable th) {
            if (this.f80193 == interfaceC13433 || (th instanceof C22539)) {
                this.f80197 = true;
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f80195;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f80200 = null;
        this.f80195 = null;
        this.f80207 = 0L;
        try {
            m55306();
        } catch (Throwable th) {
            if (this.f80193 == this.f80202 || (th instanceof C22539)) {
                this.f80197 = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55305(C25368 c25368, boolean z) throws InterruptedIOException {
        C3147 c3147Mo22525;
        InterfaceC13433 interfaceC13433;
        InterfaceC13433 interfaceC13434;
        long j;
        C25368 c25368M29908;
        InterfaceC13433 interfaceC13435;
        long j2;
        long jMo8326;
        C7622 c7622;
        Uri uriMo8327;
        Uri uri;
        boolean z2;
        String str = c25368.f81911;
        String str2 = C7116.f23455;
        boolean z3 = this.f80205;
        InterfaceC15079 interfaceC15079 = this.f80209;
        if (z3) {
            c3147Mo22525 = null;
        } else if (this.f80208) {
            try {
                c3147Mo22525 = interfaceC15079.mo22525(str, this.f80207, this.f80198);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c3147Mo22525 = interfaceC15079.mo22522(str, this.f80207, this.f80198);
        }
        C14178 c14178 = this.f80201;
        InterfaceC13433 interfaceC13436 = this.f80202;
        InterfaceC13433 interfaceC13437 = this.f80211;
        if (c3147Mo22525 != null) {
            long jMin = c3147Mo22525.f10206;
            if (c3147Mo22525.f10210) {
                Uri uriFromFile = Uri.fromFile(c3147Mo22525.f10207);
                long j3 = c3147Mo22525.f10209;
                long j4 = this.f80207 - j3;
                long jMin2 = jMin - j4;
                interfaceC13433 = interfaceC13436;
                interfaceC13434 = interfaceC13437;
                long j5 = this.f80198;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                C11941 c11941M56734 = c25368.m56734();
                c11941M56734.m29911(uriFromFile);
                c11941M56734.m29915(j3);
                c11941M56734.m29917(j4);
                c11941M56734.m29910(jMin2);
                c25368M29908 = c11941M56734.m29908();
                j = -1;
                interfaceC13437 = interfaceC13433;
            } else {
                interfaceC13433 = interfaceC13436;
                interfaceC13434 = interfaceC13437;
                j = -1;
                if (jMin == -1) {
                    jMin = this.f80198;
                } else {
                    long j6 = this.f80198;
                    if (j6 != -1) {
                        jMin = Math.min(jMin, j6);
                    }
                }
                C11941 c11941M56735 = c25368.m56734();
                c11941M56735.m29917(this.f80207);
                c11941M56735.m29910(jMin);
                c25368M29908 = c11941M56735.m29908();
                if (c14178 != null) {
                    interfaceC13437 = c14178;
                } else {
                    interfaceC15079.mo22521(c3147Mo22525);
                    c3147Mo22525 = null;
                    interfaceC13437 = interfaceC13434;
                }
            }
        } else {
            C11941 c11941M56736 = c25368.m56734();
            c11941M56736.m29917(this.f80207);
            c11941M56736.m29910(this.f80198);
            c25368M29908 = c11941M56736.m29908();
            j = -1;
            interfaceC13433 = interfaceC13436;
            interfaceC13434 = interfaceC13437;
        }
        if (!this.f80205) {
            interfaceC13435 = interfaceC13434;
            if (interfaceC13437 == interfaceC13435) {
                j2 = this.f80207 + 102400;
            }
            this.f80196 = j2;
            if (z) {
                if (this.f80193 == interfaceC13435) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C20782.m47568(z2);
                if (interfaceC13437 == interfaceC13435) {
                    return;
                }
                try {
                    m55306();
                } catch (Throwable th) {
                    if (!c3147Mo22525.f10210) {
                        interfaceC15079.mo22521(c3147Mo22525);
                        throw th;
                    }
                    throw th;
                }
            }
            if (c3147Mo22525 != null && !c3147Mo22525.f10210) {
                this.f80204 = c3147Mo22525;
            }
            this.f80193 = interfaceC13437;
            this.f80212 = c25368M29908;
            this.f80199 = 0L;
            jMo8326 = interfaceC13437.mo8326(c25368M29908);
            c7622 = new C7622();
            if (c25368M29908.f81910 == j && jMo8326 != j) {
                this.f80198 = jMo8326;
                C7622.m20818(c7622, this.f80207 + jMo8326);
            }
            if (!(this.f80193 == interfaceC13433)) {
                uriMo8327 = interfaceC13437.mo8327();
                this.f80195 = uriMo8327;
                if (this.f80194) {
                    if (c25368.f81907.equals(uriMo8327)) {
                        uri = null;
                    } else {
                        uri = this.f80195;
                    }
                    C7622.m20819(c7622, uri);
                }
            }
            if (this.f80193 == c14178) {
                interfaceC15079.mo22520(str, c7622);
            }
        }
        interfaceC13435 = interfaceC13434;
        j2 = C25227.FOREVER_NS;
        this.f80196 = j2;
        if (z) {
            if (this.f80193 == interfaceC13435) {
                z2 = true;
            } else {
                z2 = false;
            }
            C20782.m47568(z2);
            if (interfaceC13437 == interfaceC13435) {
                return;
            } else {
                m55306();
            }
        }
        if (c3147Mo22525 != null) {
            this.f80204 = c3147Mo22525;
        }
        this.f80193 = interfaceC13437;
        this.f80212 = c25368M29908;
        this.f80199 = 0L;
        jMo8326 = interfaceC13437.mo8326(c25368M29908);
        c7622 = new C7622();
        if (c25368M29908.f81910 == j) {
            this.f80198 = jMo8326;
            C7622.m20818(c7622, this.f80207 + jMo8326);
        }
        if (!(this.f80193 == interfaceC13433)) {
            uriMo8327 = interfaceC13437.mo8327();
            this.f80195 = uriMo8327;
            if (this.f80194) {
                if (c25368.f81907.equals(uriMo8327)) {
                    uri = this.f80195;
                } else {
                    uri = null;
                }
                C7622.m20819(c7622, uri);
            }
        }
        if (this.f80193 == c14178) {
            interfaceC15079.mo22520(str, c7622);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        if (!(this.f80193 == this.f80202)) {
            return this.f80211.mo10893();
        }
        return Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m55306() {
        InterfaceC15079 interfaceC15079 = this.f80209;
        InterfaceC13433 interfaceC13433 = this.f80193;
        if (interfaceC13433 == null) {
            return;
        }
        try {
            interfaceC13433.close();
        } finally {
            this.f80212 = null;
            this.f80193 = null;
            C3147 c3147 = this.f80204;
            if (c3147 != null) {
                interfaceC15079.mo22521(c3147);
                this.f80204 = null;
            }
        }
    }
}
