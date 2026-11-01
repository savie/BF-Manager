package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7324 implements InterfaceC1988, InterfaceC16497 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24321;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24323;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Runnable f24324;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f24327;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4853 f24330;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f24332;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f24333;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f24334;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f24335;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f24336;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1791[] f24337;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f24338;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f24340;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f24342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24343;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f24344;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f24345;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f24346;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14690 f24349;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f24351;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f24352;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Map f24353;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f24354;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f24357;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f24358;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8736 f24356 = new C8736(this);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f24329 = 2000;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f24326 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24347 = 1024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24328 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24322 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24355 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24348 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f24350 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f24325 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24339 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24331 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18613 f24341 = new C18613();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m19532() {
        this.f24321 = true;
        this.f24354 = 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m19533() {
        return this.f24354;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m19580() {
        return (((long) this.f24348) << 32) | (((long) this.f24355) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19540(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        if (i < -1 || i > this.f24345.length() || i2 < 0 || i2 > this.f24345.length()) {
            throw new IllegalArgumentException("Invalid regex match history");
        }
        this.f24348 = i;
        this.f24355 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m19557() {
        if (this.f24321) {
            this.f24354 |= 1;
        }
        return this.f24348;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m19556() {
        if (this.f24321) {
            int i = this.f24354;
            if ((i & 4) == 0) {
                this.f24354 = i | 2;
            }
        }
        return this.f24355;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19581(int i) {
        if (this.f24321) {
            this.f24354 |= 4;
        }
        this.f24355 = i;
    }

    public C7324(C14690 c14690, C4853 c4853, CharSequence charSequence) {
        this.f24330 = c4853;
        this.f24349 = c14690;
        this.f24345 = charSequence;
        this.f24332 = new int[Math.max(c4853.f17086, 10) * 2];
        C4853 c4854 = this.f24330;
        this.f24327 = c4854.f17086 * 2;
        this.f24335 = new int[c4854.f17084];
        this.f24337 = new C1791[c4854.f17087];
        m19577();
    }

    @Override // l.InterfaceC1988
    public final C14690 pattern() {
        return this.f24349;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19544(C14690 c14690, C4853 c4853) {
        this.f24330 = c4853;
        this.f24349 = c14690;
        this.f24353 = null;
        int iMax = Math.max(c4853.f17086, 10) * 2;
        int[] iArr = new int[iMax];
        this.f24332 = iArr;
        this.f24327 = iMax;
        this.f24335 = new int[this.f24330.f17084];
        int i = 0;
        switch (iMax) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i2 = 0;
                while (i2 < iMax - 7) {
                    iArr[i2] = -1;
                    iArr[i2 + 1] = -1;
                    iArr[i2 + 2] = -1;
                    iArr[i2 + 3] = -1;
                    iArr[i2 + 4] = -1;
                    iArr[i2 + 5] = -1;
                    iArr[i2 + 6] = -1;
                    iArr[i2 + 7] = -1;
                    i2 += 8;
                }
                while (i2 < iMax) {
                    iArr[i2] = -1;
                    i2++;
                }
                break;
        }
        int[] iArr2 = this.f24335;
        int length = iArr2.length;
        switch (length) {
            case 0:
                break;
            case 1:
                iArr2[0] = -1;
                break;
            case 2:
                iArr2[0] = -1;
                iArr2[1] = -1;
                break;
            case 3:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                break;
            case 4:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                break;
            case 5:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                break;
            case 6:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                break;
            case 7:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                break;
            case 8:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                iArr2[7] = -1;
                break;
            default:
                while (i < length - 7) {
                    iArr2[i] = -1;
                    iArr2[i + 1] = -1;
                    iArr2[i + 2] = -1;
                    iArr2[i + 3] = -1;
                    iArr2[i + 4] = -1;
                    iArr2[i + 5] = -1;
                    iArr2[i + 6] = -1;
                    iArr2[i + 7] = -1;
                    i += 8;
                }
                while (i < length) {
                    iArr2[i] = -1;
                    i++;
                }
                break;
        }
        this.f24337 = new C1791[this.f24330.f17087];
        this.f24356.m22673();
        this.f24341.f59218.clear();
    }

    @Override // l.InterfaceC1988
    public final CharSequence getText() {
        return this.f24345;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m19577() {
        m19529();
        this.f24342 = 0;
        this.f24340 = this.f24345.length();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m19529() {
        this.f24322 = -1;
        this.f24355 = 0;
        this.f24348 = -1;
        int[] iArr = this.f24332;
        int length = iArr.length;
        switch (length) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i = 0;
                while (i < length - 7) {
                    iArr[i] = -1;
                    iArr[i + 1] = -1;
                    iArr[i + 2] = -1;
                    iArr[i + 3] = -1;
                    iArr[i + 4] = -1;
                    iArr[i + 5] = -1;
                    iArr[i + 6] = -1;
                    iArr[i + 7] = -1;
                    i += 8;
                }
                while (i < length) {
                    iArr[i] = -1;
                    i++;
                }
                break;
        }
        int[] iArr2 = this.f24335;
        int length2 = iArr2.length;
        switch (length2) {
            case 0:
                break;
            case 1:
                iArr2[0] = -1;
                break;
            case 2:
                iArr2[0] = -1;
                iArr2[1] = -1;
                break;
            case 3:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                break;
            case 4:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                break;
            case 5:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                break;
            case 6:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                break;
            case 7:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                break;
            case 8:
                iArr2[0] = -1;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = -1;
                iArr2[4] = -1;
                iArr2[5] = -1;
                iArr2[6] = -1;
                iArr2[7] = -1;
                break;
            default:
                int i2 = 0;
                while (i2 < length2 - 7) {
                    iArr2[i2] = -1;
                    iArr2[i2 + 1] = -1;
                    iArr2[i2 + 2] = -1;
                    iArr2[i2 + 3] = -1;
                    iArr2[i2 + 4] = -1;
                    iArr2[i2 + 5] = -1;
                    iArr2[i2 + 6] = -1;
                    iArr2[i2 + 7] = -1;
                    i2 += 8;
                }
                while (i2 < length2) {
                    iArr2[i2] = -1;
                    i2++;
                }
                break;
        }
        this.f24356.m22673();
        for (C1791 c1791 : this.f24337) {
        }
        this.f24341.f59218.clear();
        this.f24350 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19541(CharSequence charSequence) {
        this.f24345 = charSequence;
        m19577();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19573() {
        m19530();
        return this.f24322;
    }

    @Override // l.InterfaceC1988
    public final int start(int i) {
        m19530();
        m19527(i);
        return this.f24332[i * 2];
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m19549(String str) {
        return this.f24332[m19538(str) * 2];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19559() {
        m19530();
        return this.f24355;
    }

    @Override // l.InterfaceC1988
    public final int end(int i) {
        m19530();
        m19527(i);
        return this.f24332[(i * 2) + 1];
    }

    @Override // l.InterfaceC1988
    public final String group(int i) {
        int i2;
        m19530();
        m19527(i);
        int[] iArr = this.f24332;
        int i3 = i * 2;
        int i4 = iArr[i3];
        if (i4 == -1 || (i2 = iArr[i3 + 1]) == -1) {
            return null;
        }
        return this.f24345.subSequence(i4, i2).toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m19565(String str) {
        int i;
        int iM19538 = m19538(str);
        int[] iArr = this.f24332;
        int i2 = iM19538 * 2;
        int i3 = iArr[i2];
        if (i3 == -1 || (i = iArr[i2 + 1]) == -1) {
            return null;
        }
        return this.f24345.subSequence(i3, i).toString();
    }

    @Override // l.InterfaceC1988
    public final int groupCount() {
        return this.f24330.f17086 - 1;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m19576() {
        return m19547(this.f24342, 1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m19535() {
        int i = this.f24355;
        if (i == this.f24322) {
            i++;
        }
        int i2 = this.f24342;
        if (i < i2) {
            i = i2;
        }
        if (i > this.f24340) {
            mo6401();
            this.f24352 = false;
            int[] iArr = this.f24332;
            int length = iArr.length;
            switch (length) {
                case 0:
                    break;
                case 1:
                    iArr[0] = -1;
                    break;
                case 2:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    break;
                case 3:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    break;
                case 4:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    break;
                case 5:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    break;
                case 6:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    break;
                case 7:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    break;
                case 8:
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    iArr[7] = -1;
                    break;
                default:
                    int i3 = 0;
                    while (i3 < length - 7) {
                        iArr[i3] = -1;
                        iArr[i3 + 1] = -1;
                        iArr[i3 + 2] = -1;
                        iArr[i3 + 3] = -1;
                        iArr[i3 + 4] = -1;
                        iArr[i3 + 5] = -1;
                        iArr[i3 + 6] = -1;
                        iArr[i3 + 7] = -1;
                        i3 += 8;
                    }
                    while (i3 < length) {
                        iArr[i3] = -1;
                        i3++;
                    }
                    break;
            }
            this.f24341.f59218.clear();
            return false;
        }
        return m19536(i);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m19555() {
        return m19547(this.f24342, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19543(StringBuilder sb, String str) {
        m19530();
        int length = sb.length();
        try {
            sb.append(this.f24345, this.f24350, this.f24322);
            C9751.m24731(this, sb, str);
            this.f24350 = this.f24355;
        } catch (C17511 e) {
            sb.setLength(length);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder m19539(StringBuilder sb) {
        CharSequence charSequence = this.f24345;
        sb.append(charSequence, this.f24350, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m19560(String str) {
        m19529();
        if (m19535()) {
            StringBuilder sb = new StringBuilder();
            do {
                m19543(sb, str);
            } while (m19535());
            m19539(sb);
            return sb.toString();
        }
        return this.f24345.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m19534(String str) {
        if (str == null) {
            throw new NullPointerException("replacement");
        }
        m19529();
        if (!m19535()) {
            return this.f24345.toString();
        }
        StringBuilder sb = new StringBuilder();
        m19543(sb, str);
        m19539(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19578() {
        return this.f24342;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m19554() {
        return this.f24340;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19574() {
        return this.f24325;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19561(boolean z) {
        this.f24325 = z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m19553() {
        return this.f24339;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19567(boolean z) {
        this.f24339 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegexMatcher[pattern=");
        sb.append(this.f24349);
        sb.append(" region=");
        sb.append(this.f24342);
        sb.append(',');
        sb.append(this.f24340);
        sb.append(" lastmatch=");
        if (this.f24322 >= 0 && group(0) != null) {
            sb.append(group(0));
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m19575() {
        return this.f24346;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m19571() {
        return this.f24338;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19551(int i) {
        this.f24329 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m19563() {
        this.f24326 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19542(Runnable runnable) {
        this.f24324 = runnable;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Runnable m19550() {
        return this.f24324;
    }

    @Override // l.InterfaceC1988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6401() {
        Runnable runnable = this.f24324;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m19537() {
        return this.f24329;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19579() {
        return this.f24352;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m19570() {
        return this.f24334;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m19582() {
        return this.f24351;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19572() {
        this.f24358 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19548(Thread thread) {
        mo6401();
        if (!thread.isInterrupted()) {
            return false;
        }
        this.f24351 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m19531() {
        this.f24352 = false;
        int i = this.f24329;
        this.f24343 = i;
        boolean z = this.f24326;
        boolean z2 = z && i <= 0;
        this.f24357 = z2;
        this.f24347 = 1024;
        this.f24344 = false;
        this.f24323 = z;
        if (z2) {
            C0577.m2744("Regex matching timeout: " + this.f24349.pattern());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19558() {
        int i = this.f24347 - 1;
        this.f24347 = i;
        if (i <= 0) {
            boolean z = m19568() || m19548(Thread.currentThread());
            this.f24347 = z ? 0 : 1024;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19568() {
        if (!this.f24357 && this.f24323) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f24344) {
                this.f24336 = jUptimeMillis + ((long) this.f24343);
                this.f24344 = true;
            } else if (jUptimeMillis >= this.f24336) {
                this.f24357 = true;
                C0577.m2744("Regex matching timeout: " + this.f24349.pattern());
            }
        }
        return this.f24357;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m19552() {
        if (this.f24344) {
            return;
        }
        m19568();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19528() {
        this.f24352 = this.f24344 ? m19568() : this.f24357;
        this.f24323 = false;
        this.f24344 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m19536(int i) {
        boolean z = false;
        this.f24354 = 0;
        this.f24334 = false;
        this.f24351 = false;
        this.f24346 = false;
        this.f24338 = false;
        if (i < 0) {
            i = 0;
        }
        this.f24322 = i;
        int i2 = this.f24348;
        if (i2 < 0) {
            i2 = i;
        }
        this.f24348 = i2;
        int[] iArr = this.f24332;
        int i3 = this.f24327;
        switch (i3) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i4 = 0;
                while (i4 < i3 - 7) {
                    iArr[i4] = -1;
                    iArr[i4 + 1] = -1;
                    iArr[i4 + 2] = -1;
                    iArr[i4 + 3] = -1;
                    iArr[i4 + 4] = -1;
                    iArr[i4 + 5] = -1;
                    iArr[i4 + 6] = -1;
                    iArr[i4 + 7] = -1;
                    i4 += 8;
                }
                while (i4 < i3) {
                    iArr[i4] = -1;
                    i4++;
                }
                break;
        }
        this.f24327 = this.f24330.f17086 * 2;
        C8736 c8736 = this.f24356;
        c8736.m22673();
        for (C1791 c1791 : this.f24337) {
        }
        C18613 c18613 = this.f24341;
        c18613.f59218.clear();
        this.f24328 = 0;
        m19531();
        try {
            try {
                mo6401();
                try {
                    if (!this.f24357 && c8736.m22675(i, this.f24345)) {
                        z = true;
                    }
                } catch (C19319 unused) {
                    this.f24334 = true;
                }
                mo6401();
                m19528();
                boolean z2 = (!this.f24352) & z;
                if (!z2) {
                    this.f24322 = -1;
                }
                this.f24348 = this.f24355;
                if (z2 && this.f24331) {
                    Collections.sort(c18613.f59218);
                }
                return z2;
            } catch (CancellationException e) {
                this.f24322 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m19528();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19547(int i, int i2) {
        boolean z = false;
        this.f24354 = 0;
        this.f24334 = false;
        this.f24351 = false;
        this.f24346 = false;
        this.f24338 = false;
        if (i < 0) {
            i = 0;
        }
        this.f24322 = i;
        int i3 = this.f24348;
        if (i3 < 0) {
            i3 = i;
        }
        this.f24348 = i3;
        int[] iArr = this.f24332;
        int i4 = this.f24327;
        switch (i4) {
            case 0:
                break;
            case 1:
                iArr[0] = -1;
                break;
            case 2:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
            case 3:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                break;
            case 4:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                break;
            case 5:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                break;
            case 6:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                break;
            case 7:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                break;
            case 8:
                iArr[0] = -1;
                iArr[1] = -1;
                iArr[2] = -1;
                iArr[3] = -1;
                iArr[4] = -1;
                iArr[5] = -1;
                iArr[6] = -1;
                iArr[7] = -1;
                break;
            default:
                int i5 = 0;
                while (i5 < i4 - 7) {
                    iArr[i5] = -1;
                    iArr[i5 + 1] = -1;
                    iArr[i5 + 2] = -1;
                    iArr[i5 + 3] = -1;
                    iArr[i5 + 4] = -1;
                    iArr[i5 + 5] = -1;
                    iArr[i5 + 6] = -1;
                    iArr[i5 + 7] = -1;
                    i5 += 8;
                }
                while (i5 < i4) {
                    iArr[i5] = -1;
                    i5++;
                }
                break;
        }
        this.f24327 = this.f24330.f17086 * 2;
        C8736 c8736 = this.f24356;
        c8736.m22673();
        for (C1791 c1791 : this.f24337) {
        }
        C18613 c18613 = this.f24341;
        c18613.f59218.clear();
        this.f24328 = i2;
        m19531();
        try {
            try {
                mo6401();
                try {
                    if (!this.f24357 && c8736.m22674(i, this.f24345)) {
                        z = true;
                    }
                } catch (C19319 unused) {
                    this.f24334 = true;
                }
                mo6401();
                m19528();
                boolean z2 = (!this.f24352) & z;
                if (!z2) {
                    this.f24322 = -1;
                }
                this.f24348 = this.f24355;
                if (z2 && this.f24331) {
                    Collections.sort(c18613.f59218);
                }
                return z2;
            } catch (CancellationException e) {
                this.f24322 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m19528();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19546(int i) {
        boolean z;
        this.f24354 = 0;
        this.f24334 = false;
        this.f24351 = false;
        this.f24346 = false;
        this.f24338 = false;
        this.f24322 = i;
        this.f24348 = i;
        C8736 c8736 = this.f24356;
        c8736.m22673();
        for (C1791 c1791 : this.f24337) {
        }
        this.f24328 = 0;
        m19531();
        try {
            try {
                mo6401();
                try {
                    z = !this.f24357 && c8736.m22674(i, this.f24345);
                } catch (C19319 unused) {
                    this.f24334 = true;
                }
                mo6401();
                m19528();
                return z && !this.f24352;
            } catch (Throwable th) {
                m19528();
                throw th;
            }
        } catch (CancellationException e) {
            this.f24322 = -1;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m19562(int i) {
        if (i < 0 || i > this.f24345.length()) {
            throw new IndexOutOfBoundsException();
        }
        return m19547(i, 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19566(int i, int i2) {
        if (i < 0 || i > this.f24345.length()) {
            throw new IndexOutOfBoundsException("start");
        }
        if (i2 < 0 || i2 > this.f24345.length()) {
            throw new IndexOutOfBoundsException("end");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("start > end");
        }
        m19529();
        this.f24342 = i;
        this.f24340 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19569(int i) {
        int length = this.f24345.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Illegal start index");
        }
        m19529();
        return m19536(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m19538(String str) {
        m19530();
        Map mapM35221 = this.f24353;
        if (mapM35221 == null) {
            mapM35221 = this.f24349.m35221();
            this.f24353 = mapM35221;
        }
        Integer num = (Integer) mapM35221.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C16523.m38890("No group with name <", str, ">"));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m19527(int i) {
        if (i < 0 || i > groupCount()) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "No group "));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m19530() {
        if (this.f24322 < 0) {
            throw new IllegalStateException("No match found");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19545(boolean z) {
        this.f24331 = z;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m19564() {
        return this.f24341.f59218;
    }
}
