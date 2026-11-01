package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۢܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C9654 extends C1788 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20237 f32458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f32459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32457 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32456 = {KeyFactorySpi.x448_type, 97, 116, 10};

    public C9654(byte[] bArr) {
        C20237 c20237;
        super(bArr, 0);
        if (bArr.length < 52) {
            throw new C20942();
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != f32457[i]) {
                throw new C20942();
            }
        }
        byte b = bArr[4];
        if (b == 1) {
            this.f32459 = false;
        } else {
            if (b != 2) {
                throw new C7536(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
            }
            this.f32459 = true;
        }
        for (AbstractC12476 abstractC12476 : (AbstractList) m24547()) {
            if (abstractC12476.f41591.mo5859(abstractC12476.f41590 + 4) == 11) {
                Iterator it = new C6125(new C1891(this, abstractC12476)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c20237 = null;
                        break;
                    }
                    AbstractC14593 abstractC14593 = (AbstractC14593) it.next();
                    if (abstractC14593.mo27885().equals("oatdata")) {
                        try {
                            AbstractC12476 abstractC12477 = (AbstractC12476) ((C8948) abstractC14593.f47751.f7135.m24547()).get(abstractC14593.mo27887());
                            long jMo2350 = abstractC12477.mo2350();
                            int iMo2349 = abstractC12477.mo2349();
                            int iMo2351 = abstractC12477.mo2351();
                            long jMo27886 = abstractC14593.mo27886();
                            if (jMo27886 >= jMo2350 && jMo27886 < ((long) iMo2351) + jMo2350) {
                                c20237 = new C20237(this, (int) ((abstractC14593.mo27886() - jMo2350) + ((long) iMo2349)));
                                break;
                            }
                            throw new C7536("symbol address lies outside it's associated section");
                        } catch (IndexOutOfBoundsException unused) {
                            throw new C7536("Section index for symbol is out of bounds");
                        }
                    }
                }
                if (c20237 == null) {
                    throw new C7536("Oat file has no oatdata symbol");
                }
                this.f32458 = c20237;
                if (!c20237.m45740()) {
                    throw new C7536("Invalid oat magic value");
                }
                C7474.m19962(c20237.m45742());
                return;
            }
        }
        throw new C7536("Oat file has no symbol table");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9654 m24548(BufferedInputStream bufferedInputStream) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                C2221.m6840(bufferedInputStream, bArr, 0, 4);
                bufferedInputStream.reset();
                for (int i = 0; i < 4; i++) {
                    if (bArr[i] != f32457[i]) {
                        throw new C20942();
                    }
                }
                bufferedInputStream.reset();
                return new C9654(C2221.m6841(bufferedInputStream));
            } catch (EOFException unused) {
                throw new C20942();
            }
        } catch (Throwable th) {
            bufferedInputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m24553() {
        return this.f32458.m45742();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m24554() {
        return new C19531(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List m24547() {
        int iMo9809;
        int iM42183;
        int iM42184;
        if (this.f32459) {
            iMo9809 = m42180(40);
            iM42183 = m42183(58);
            iM42184 = m42183(60);
        } else {
            iMo9809 = mo9809(32);
            iM42183 = m42183(46);
            iM42184 = m42183(48);
        }
        if ((iM42183 * iM42184) + iMo9809 > length()) {
            throw new C7536("The ELF section headers extend past the end of the file");
        }
        return new C8948(this, iM42184, iMo9809, iM42183);
    }
}
