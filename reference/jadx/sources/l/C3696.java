package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۗ᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C3696 extends C3674 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f12703;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15628 f12704;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f12702 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f12701 = {KeyFactorySpi.x448_type, 97, 116, 10};

    public C3696(byte[] bArr) {
        C15628 c15628;
        super(bArr, 0);
        if (bArr.length < 52) {
            throw new C23088();
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != f12702[i]) {
                throw new C23088();
            }
        }
        byte b = bArr[4];
        if (b == 1) {
            this.f12703 = false;
        } else {
            if (b != 2) {
                throw new C11153(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
            }
            this.f12703 = true;
        }
        for (AbstractC2205 abstractC2205 : (AbstractList) m12009()) {
            if (abstractC2205.f7245.mo8725(abstractC2205.f7244 + 4) == 11) {
                Iterator it = new C25326(new C23834(this, abstractC2205)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c15628 = null;
                        break;
                    }
                    AbstractC16374 abstractC16374 = (AbstractC16374) it.next();
                    if (abstractC16374.mo38861().equals("oatdata")) {
                        try {
                            AbstractC2205 abstractC2206 = (AbstractC2205) ((C5188) abstractC16374.f53159.f77188.m12009()).get(abstractC16374.mo38863());
                            long jMo7529 = abstractC2206.mo7529();
                            int iMo7533 = abstractC2206.mo7533();
                            int iMo7531 = abstractC2206.mo7531();
                            long jMo38862 = abstractC16374.mo38862();
                            if (jMo38862 >= jMo7529 && jMo38862 < ((long) iMo7531) + jMo7529) {
                                c15628 = new C15628(this, (int) ((abstractC16374.mo38862() - jMo7529) + ((long) iMo7533)));
                                break;
                            }
                            throw new C11153("symbol address lies outside it's associated section");
                        } catch (IndexOutOfBoundsException unused) {
                            throw new C11153("Section index for symbol is out of bounds");
                        }
                    }
                }
                if (c15628 == null) {
                    throw new C11153("Oat file has no oatdata symbol");
                }
                this.f12704 = c15628;
                if (!c15628.m37380()) {
                    throw new C11153("Invalid oat magic value");
                }
                C19647.m45291(c15628.m37378());
                return;
            }
        }
        throw new C11153("Oat file has no symbol table");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3696 m12006(BufferedInputStream bufferedInputStream) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                C5020.m15247(bufferedInputStream, bArr, 0, 4);
                bufferedInputStream.reset();
                for (int i = 0; i < 4; i++) {
                    if (bArr[i] != f12702[i]) {
                        throw new C23088();
                    }
                }
                bufferedInputStream.reset();
                return new C3696(C5020.m15248(bufferedInputStream));
            } catch (EOFException unused) {
                throw new C23088();
            }
        } catch (Throwable th) {
            bufferedInputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m12012() {
        return this.f12704.m37378();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m12013() {
        return new C13785(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List m12009() {
        int iMo8719;
        int iM8721;
        int iM8722;
        if (this.f12703) {
            iMo8719 = m8726(40);
            iM8721 = m8721(58);
            iM8722 = m8721(60);
        } else {
            iMo8719 = mo8719(32);
            iM8721 = m8721(46);
            iM8722 = m8721(48);
        }
        if ((iM8721 * iM8722) + iMo8719 > length()) {
            throw new C11153("The ELF section headers extend past the end of the file");
        }
        return new C5188(this, iM8722, iMo8719, iM8721);
    }
}
