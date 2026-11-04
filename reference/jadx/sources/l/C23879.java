package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩹᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6RA */
/* JADX INFO: loaded from: classes.dex */
public final class C23879 implements InterfaceC0516, InterfaceC24625 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f77311;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77312;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f77313;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f77314;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f77315;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f77318;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5596[] f77319;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f77320;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f77322;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f77323;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f77326;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f77327;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f77328;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f77334;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f77336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18415 f77337;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C9093 f77338;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f77339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Map f77340;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77341;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77342;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f77343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f77345;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f77346;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f77347;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17911 f77332 = new C17911(this);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f77317 = 2000;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f77330 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77331 = 1024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77316 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f77329 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77335 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f77310 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f77333 = 0;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77344 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f77325 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f77324 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C11944 f77321 = new C11944();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m53364() {
        this.f77336 = true;
        this.f77315 = 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m53357() {
        return this.f77315;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m53359() {
        return (((long) this.f77310) << 32) | (((long) this.f77335) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53338(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        if (i < -1 || i > this.f77313.length() || i2 < 0 || i2 > this.f77313.length()) {
            throw new IllegalArgumentException("Invalid regex match history");
        }
        this.f77310 = i;
        this.f77335 = i2;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m53348() {
        if (this.f77336) {
            this.f77315 |= 1;
        }
        return this.f77310;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m53356() {
        if (this.f77336) {
            int i = this.f77315;
            if ((i & 4) == 0) {
                this.f77315 = i | 2;
            }
        }
        return this.f77335;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53360(int i) {
        if (this.f77336) {
            this.f77315 |= 4;
        }
        this.f77335 = i;
    }

    public C23879(C18415 c18415, C9093 c9093, CharSequence charSequence) {
        this.f77338 = c9093;
        this.f77337 = c18415;
        this.f77313 = charSequence;
        this.f77327 = new int[Math.max(c9093.f29535, 10) * 2];
        C9093 c9094 = this.f77338;
        this.f77312 = c9094.f29535 * 2;
        this.f77328 = new int[c9094.f29544];
        this.f77319 = new C5596[c9094.f29542];
        m53370();
    }

    @Override // l.InterfaceC0516
    public final C18415 pattern() {
        return this.f77337;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53342(C18415 c18415, C9093 c9093) {
        this.f77338 = c9093;
        this.f77337 = c18415;
        this.f77340 = null;
        int iMax = Math.max(c9093.f29535, 10) * 2;
        int[] iArr = new int[iMax];
        this.f77327 = iArr;
        this.f77312 = iMax;
        this.f77328 = new int[this.f77338.f29544];
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
        int[] iArr2 = this.f77328;
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
        this.f77319 = new C5596[this.f77338.f29542];
        this.f77332.m41832();
        this.f77321.f38467.clear();
    }

    @Override // l.InterfaceC0516
    public final CharSequence getText() {
        return this.f77313;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m53370() {
        m53329();
        this.f77318 = 0;
        this.f77326 = this.f77313.length();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m53329() {
        this.f77329 = -1;
        this.f77335 = 0;
        this.f77310 = -1;
        int[] iArr = this.f77327;
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
        int[] iArr2 = this.f77328;
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
        this.f77332.m41832();
        for (C5596 c5596 : this.f77319) {
        }
        this.f77321.f38467.clear();
        this.f77333 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53339(CharSequence charSequence) {
        this.f77313 = charSequence;
        m53370();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m53349() {
        m53330();
        return this.f77329;
    }

    @Override // l.InterfaceC0516
    public final int start(int i) {
        m53330();
        m53331(i);
        return this.f77327[i * 2];
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m53366(String str) {
        return this.f77327[m53336(str) * 2];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m53351() {
        m53330();
        return this.f77335;
    }

    @Override // l.InterfaceC0516
    public final int end(int i) {
        m53330();
        m53331(i);
        return this.f77327[(i * 2) + 1];
    }

    @Override // l.InterfaceC0516
    public final String group(int i) {
        int i2;
        m53330();
        m53331(i);
        int[] iArr = this.f77327;
        int i3 = i * 2;
        int i4 = iArr[i3];
        if (i4 == -1 || (i2 = iArr[i3 + 1]) == -1) {
            return null;
        }
        return this.f77313.subSequence(i4, i2).toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m53371(String str) {
        int i;
        int iM53336 = m53336(str);
        int[] iArr = this.f77327;
        int i2 = iM53336 * 2;
        int i3 = iArr[i2];
        if (i3 == -1 || (i = iArr[i2 + 1]) == -1) {
            return null;
        }
        return this.f77313.subSequence(i3, i).toString();
    }

    @Override // l.InterfaceC0516
    public final int groupCount() {
        return this.f77338.f29535 - 1;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m53369() {
        return m53345(this.f77318, 1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m53378() {
        int i = this.f77335;
        if (i == this.f77329) {
            i++;
        }
        int i2 = this.f77318;
        if (i < i2) {
            i = i2;
        }
        if (i > this.f77326) {
            mo2478();
            this.f77339 = false;
            int[] iArr = this.f77327;
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
            this.f77321.f38467.clear();
            return false;
        }
        return m53379(i);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m53334() {
        return m53345(this.f77318, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53341(StringBuilder sb, String str) {
        m53330();
        int length = sb.length();
        try {
            sb.append(this.f77313, this.f77333, this.f77329);
            C7974.m21760(this, sb, str);
            this.f77333 = this.f77335;
        } catch (C24383 e) {
            sb.setLength(length);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder m53337(StringBuilder sb) {
        CharSequence charSequence = this.f77313;
        sb.append(charSequence, this.f77333, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m53352(String str) {
        m53329();
        if (m53378()) {
            StringBuilder sb = new StringBuilder();
            do {
                m53341(sb, str);
            } while (m53378());
            m53337(sb);
            return sb.toString();
        }
        return this.f77313.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m53376(String str) {
        if (str == null) {
            throw new NullPointerException("replacement");
        }
        m53329();
        if (!m53378()) {
            return this.f77313.toString();
        }
        StringBuilder sb = new StringBuilder();
        m53341(sb, str);
        m53337(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m53335() {
        return this.f77318;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m53381() {
        return this.f77326;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m53361() {
        return this.f77344;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m53377(boolean z) {
        this.f77344 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m53355() {
        return this.f77325;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53353(boolean z) {
        this.f77325 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegexMatcher[pattern=");
        sb.append(this.f77337);
        sb.append(" region=");
        sb.append(this.f77318);
        sb.append(',');
        sb.append(this.f77326);
        sb.append(" lastmatch=");
        if (this.f77329 >= 0 && group(0) != null) {
            sb.append(group(0));
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m53380() {
        return this.f77334;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m53358() {
        return this.f77311;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m53368(int i) {
        this.f77317 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53373(boolean z) {
        this.f77330 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53340(Runnable runnable) {
        this.f77343 = runnable;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Runnable m53367() {
        return this.f77343;
    }

    @Override // l.InterfaceC0516
    /* JADX INFO: renamed from: ۙ */
    public final void mo2478() {
        Runnable runnable = this.f77343;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m53333() {
        return this.f77317;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m53363() {
        return this.f77339;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m53362() {
        return this.f77314;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m53382() {
        return this.f77345;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m53332() {
        this.f77323 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53346(Thread thread) {
        mo2478();
        if (!thread.isInterrupted()) {
            return false;
        }
        this.f77345 = true;
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m53327() {
        this.f77339 = false;
        int i = this.f77317;
        this.f77341 = i;
        boolean z = this.f77330;
        boolean z2 = z && i <= 0;
        this.f77347 = z2;
        this.f77331 = 1024;
        this.f77342 = false;
        this.f77322 = z;
        if (z2) {
            C20653.m47269("Regex matching timeout: " + this.f77337.pattern());
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m53350() {
        int i = this.f77331 - 1;
        this.f77331 = i;
        if (i <= 0) {
            boolean z = m53374() || m53346(Thread.currentThread());
            this.f77331 = z ? 0 : 1024;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53374() {
        if (!this.f77347 && this.f77322) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f77342) {
                this.f77320 = jUptimeMillis + ((long) this.f77341);
                this.f77342 = true;
            } else if (jUptimeMillis >= this.f77320) {
                this.f77347 = true;
                C20653.m47269("Regex matching timeout: " + this.f77337.pattern());
            }
        }
        return this.f77347;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m53365() {
        if (this.f77342) {
            return;
        }
        m53374();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m53328() {
        this.f77339 = this.f77342 ? m53374() : this.f77347;
        this.f77322 = false;
        this.f77342 = false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m53379(int i) {
        boolean z = false;
        this.f77315 = 0;
        this.f77314 = false;
        this.f77345 = false;
        this.f77334 = false;
        this.f77311 = false;
        if (i < 0) {
            i = 0;
        }
        this.f77329 = i;
        int i2 = this.f77310;
        if (i2 < 0) {
            i2 = i;
        }
        this.f77310 = i2;
        int[] iArr = this.f77327;
        int i3 = this.f77312;
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
        this.f77312 = this.f77338.f29535 * 2;
        C17911 c17911 = this.f77332;
        c17911.m41832();
        for (C5596 c5596 : this.f77319) {
        }
        C11944 c11944 = this.f77321;
        c11944.f38467.clear();
        this.f77316 = 0;
        m53327();
        try {
            try {
                mo2478();
                try {
                    if (!this.f77347 && c17911.m41834(i, this.f77313)) {
                        z = true;
                    }
                } catch (C17165 unused) {
                    this.f77314 = true;
                }
                mo2478();
                m53328();
                boolean z2 = (!this.f77339) & z;
                if (!z2) {
                    this.f77329 = -1;
                }
                this.f77310 = this.f77335;
                if (z2 && this.f77324) {
                    Collections.sort(c11944.f38467);
                }
                return z2;
            } catch (CancellationException e) {
                this.f77329 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m53328();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53345(int i, int i2) {
        boolean z = false;
        this.f77315 = 0;
        this.f77314 = false;
        this.f77345 = false;
        this.f77334 = false;
        this.f77311 = false;
        if (i < 0) {
            i = 0;
        }
        this.f77329 = i;
        int i3 = this.f77310;
        if (i3 < 0) {
            i3 = i;
        }
        this.f77310 = i3;
        int[] iArr = this.f77327;
        int i4 = this.f77312;
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
        this.f77312 = this.f77338.f29535 * 2;
        C17911 c17911 = this.f77332;
        c17911.m41832();
        for (C5596 c5596 : this.f77319) {
        }
        C11944 c11944 = this.f77321;
        c11944.f38467.clear();
        this.f77316 = i2;
        m53327();
        try {
            try {
                mo2478();
                try {
                    if (!this.f77347 && c17911.m41833(i, this.f77313)) {
                        z = true;
                    }
                } catch (C17165 unused) {
                    this.f77314 = true;
                }
                mo2478();
                m53328();
                boolean z2 = (!this.f77339) & z;
                if (!z2) {
                    this.f77329 = -1;
                }
                this.f77310 = this.f77335;
                if (z2 && this.f77324) {
                    Collections.sort(c11944.f38467);
                }
                return z2;
            } catch (CancellationException e) {
                this.f77329 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m53328();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m53344(int i) {
        boolean z;
        this.f77315 = 0;
        this.f77314 = false;
        this.f77345 = false;
        this.f77334 = false;
        this.f77311 = false;
        this.f77329 = i;
        this.f77310 = i;
        C17911 c17911 = this.f77332;
        c17911.m41832();
        for (C5596 c5596 : this.f77319) {
        }
        this.f77316 = 0;
        m53327();
        try {
            try {
                mo2478();
                try {
                    z = !this.f77347 && c17911.m41833(i, this.f77313);
                } catch (C17165 unused) {
                    this.f77314 = true;
                }
                mo2478();
                m53328();
                return z && !this.f77339;
            } catch (CancellationException e) {
                this.f77329 = -1;
                throw e;
            }
        } catch (Throwable th) {
            m53328();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m53354(int i) {
        if (i < 0 || i > this.f77313.length()) {
            throw new IndexOutOfBoundsException();
        }
        return m53345(i, 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53372(int i, int i2) {
        if (i < 0 || i > this.f77313.length()) {
            throw new IndexOutOfBoundsException("start");
        }
        if (i2 < 0 || i2 > this.f77313.length()) {
            throw new IndexOutOfBoundsException("end");
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("start > end");
        }
        m53329();
        this.f77318 = i;
        this.f77326 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53375(int i) {
        int length = this.f77313.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Illegal start index");
        }
        m53329();
        return m53379(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53336(String str) {
        m53330();
        Map mapM42932 = this.f77340;
        if (mapM42932 == null) {
            mapM42932 = this.f77337.m42932();
            this.f77340 = mapM42932;
        }
        Integer num = (Integer) mapM42932.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(C14442.m34865("No group with name <", str, ">"));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m53331(int i) {
        if (i < 0 || i > groupCount()) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "No group "));
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m53330() {
        if (this.f77329 < 0) {
            throw new IllegalStateException("No match found");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53343(boolean z) {
        this.f77324 = z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m53347() {
        return this.f77321.f38467;
    }
}
