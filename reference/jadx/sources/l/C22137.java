package l;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.᩹۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 842L */
/* JADX INFO: loaded from: classes.dex */
public class C22137 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C22137 f71655 = new C5203();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC21514 f71656;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f71657;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char[] f71658;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f71659;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC4518 f71660;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public SoftReference f71661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f71663;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 m49095() {
        return this.f71657;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m49096(int i) {
        try {
            if (mo14385(i)) {
                return this.f71659;
            }
            return 0;
        } finally {
            this.f71658 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49094(int i, boolean z) {
        try {
            if (!mo14385(i)) {
                this.f71658 = null;
                return 0;
            }
            int i2 = 0;
            for (int i3 = this.f71663; i3 < i; i3++) {
                if (i3 < this.f71662) {
                    i2 = (this.f71658[i3] == '\t' && z) ? ((i2 / 8) * 8) + 8 : i2 + 1;
                } else {
                    this.f71658 = null;
                    return 0;
                }
            }
            int i4 = i2 + 1;
            this.f71658 = null;
            return i4;
        } catch (Throwable th) {
            this.f71658 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo14385(int i) {
        int i2;
        char[] charArray;
        SoftReference softReference;
        if (i != -1) {
            try {
                if (this.f71658 == null && (softReference = this.f71661) != null) {
                    this.f71658 = (char[]) softReference.get();
                }
                if (this.f71658 != null) {
                    if (this.f71663 > i) {
                        this.f71663 = 0;
                        this.f71659 = 1;
                    }
                } else {
                    CharSequence charSequenceMo10164 = this.f71657.mo10164(true);
                    if (charSequenceMo10164 instanceof CharBuffer) {
                        CharBuffer charBuffer = (CharBuffer) charSequenceMo10164;
                        int i3 = C14315.f46886;
                        if (charBuffer.hasArray()) {
                            charArray = (char[]) charBuffer.compact().flip().array();
                        } else {
                            charArray = charBuffer.toString().toCharArray();
                        }
                        this.f71662 = charBuffer.limit();
                    } else {
                        charArray = charSequenceMo10164.toString().toCharArray();
                        this.f71662 = charArray.length;
                    }
                    this.f71661 = new SoftReference(charArray);
                    this.f71658 = charArray;
                    this.f71663 = 0;
                    this.f71659 = 1;
                }
                int i4 = this.f71663;
                while (true) {
                    i2 = this.f71662;
                    if (i4 >= i2 || i4 >= i) {
                        break;
                    }
                    char[] cArr = this.f71658;
                    int i5 = i4 + 1;
                    char c = cArr[i4];
                    if (c == '\n') {
                        this.f71659++;
                        this.f71663 = i5;
                    } else if (c == '\r') {
                        if (i5 < i2 && cArr[i5] == '\n') {
                            i5 = i4 + 2;
                        }
                        this.f71659++;
                        this.f71663 = i5;
                    }
                    i4 = i5;
                }
                if (i4 <= i2) {
                    return true;
                }
            } catch (IOException unused) {
                this.f71656.mo46179(new Object[0]);
                this.f71658 = new char[0];
                return false;
            }
        }
        return false;
    }
}
