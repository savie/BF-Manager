package l;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.᩹۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 842L */
/* JADX INFO: loaded from: classes.dex */
public class C23393 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C23393 f75729 = new C15933();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char[] f75730;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public SoftReference f75731;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC1960 f75732;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC14222 f75733;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f75734;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75735;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f75736;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f75737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15976 m52573() {
        return this.f75737;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52574(int i) {
        try {
            if (mo37956(i)) {
                return this.f75735;
            }
            return 0;
        } finally {
            this.f75730 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52572(int i, boolean z) {
        try {
            if (!mo37956(i)) {
                this.f75730 = null;
                return 0;
            }
            int i2 = 0;
            for (int i3 = this.f75734; i3 < i; i3++) {
                if (i3 < this.f75736) {
                    i2 = (this.f75730[i3] == '\t' && z) ? ((i2 / 8) * 8) + 8 : i2 + 1;
                } else {
                    this.f75730 = null;
                    return 0;
                }
            }
            int i4 = i2 + 1;
            this.f75730 = null;
            return i4;
        } catch (Throwable th) {
            this.f75730 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo37956(int i) {
        int i2;
        char[] charArray;
        SoftReference softReference;
        if (i != -1) {
            try {
                if (this.f75730 == null && (softReference = this.f75731) != null) {
                    this.f75730 = (char[]) softReference.get();
                }
                if (this.f75730 != null) {
                    if (this.f75734 > i) {
                        this.f75734 = 0;
                        this.f75735 = 1;
                    }
                } else {
                    CharSequence charSequenceMo7621 = this.f75737.mo7621(true);
                    if (charSequenceMo7621 instanceof CharBuffer) {
                        CharBuffer charBuffer = (CharBuffer) charSequenceMo7621;
                        int i3 = C2026.f6742;
                        if (charBuffer.hasArray()) {
                            charArray = (char[]) charBuffer.compact().flip().array();
                        } else {
                            charArray = charBuffer.toString().toCharArray();
                        }
                        this.f75736 = charBuffer.limit();
                    } else {
                        charArray = charSequenceMo7621.toString().toCharArray();
                        this.f75736 = charArray.length;
                    }
                    this.f75731 = new SoftReference(charArray);
                    this.f75730 = charArray;
                    this.f75734 = 0;
                    this.f75735 = 1;
                }
                int i4 = this.f75734;
                while (true) {
                    i2 = this.f75736;
                    if (i4 >= i2 || i4 >= i) {
                        break;
                    }
                    char[] cArr = this.f75730;
                    int i5 = i4 + 1;
                    char c = cArr[i4];
                    if (c == '\n') {
                        this.f75735++;
                        this.f75734 = i5;
                    } else if (c == '\r') {
                        if (i5 < i2 && cArr[i5] == '\n') {
                            i5 = i4 + 2;
                        }
                        this.f75735++;
                        this.f75734 = i5;
                    }
                    i4 = i5;
                }
                if (i4 <= i2) {
                    return true;
                }
            } catch (IOException unused) {
                this.f75733.mo20041(new Object[0]);
                this.f75730 = new char[0];
                return false;
            }
        }
        return false;
    }
}
