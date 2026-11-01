package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes4.dex */
public class C9801 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f33529;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String f33530;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5720;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("saveAsPath"), m41585("title"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        mo21457(m41585("title"));
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        AbstractC20745 abstractC20745M41587 = m41587("inputPath1");
        AbstractC20745 abstractC20745M41588 = m41587("inputPath2");
        C8516 c8516 = new C8516(abstractC20745M41588.mo33964() + abstractC20745M41587.mo33964());
        c8516.m22241(new C18280(5, this));
        InterfaceC20957[] interfaceC20957Arr = {C7551.m20067(), C7551.m20066(), C7551.m20064(), C7551.m20065()};
        C8963 c8963 = new C8963(interfaceC20957Arr);
        try {
            InputStream inputStreamMo33970 = abstractC20745M41587.mo33970();
            try {
                c8963.m23258(inputStreamMo33970, c8516);
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
                c8963.close();
                InterfaceC20957[] interfaceC20957Arr2 = {C7551.m20067(), C7551.m20066(), C7551.m20064(), C7551.m20065()};
                C8963 c8964 = new C8963(interfaceC20957Arr2);
                try {
                    InputStream inputStreamMo33971 = abstractC20745M41588.mo33970();
                    try {
                        c8964.m23258(inputStreamMo33971, c8516);
                        if (inputStreamMo33971 != null) {
                            inputStreamMo33971.close();
                        }
                        c8964.close();
                        byte[][] bArr = {interfaceC20957Arr[0].mo26268(), interfaceC20957Arr[1].mo26268(), interfaceC20957Arr[2].mo26268(), interfaceC20957Arr[3].mo26268()};
                        byte[][] bArr2 = {interfaceC20957Arr2[0].mo26268(), interfaceC20957Arr2[1].mo26268(), interfaceC20957Arr2[2].mo26268(), interfaceC20957Arr2[3].mo26268()};
                        boolean zDeepEquals = Arrays.deepEquals(bArr, bArr2);
                        this.f33529 = !zDeepEquals;
                        if (!zDeepEquals) {
                            this.f33530 = abstractC20745M41587.mo33986() + "\n" + abstractC20745M41588.mo33986() + "\n\n" + m24907(bArr[0], "[MD5]", bArr2[0]) + "\n\n" + m24907(bArr[1], "[SHA1]", bArr2[1]) + "\n\n" + m24907(bArr[2], "[SHA256]", bArr2[2]) + "\n\n" + m24907(bArr[3], "[CRC32]", bArr2[3]);
                        }
                        return m41583();
                    } catch (Throwable th) {
                        if (inputStreamMo33971 != null) {
                            try {
                                inputStreamMo33971.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c8964.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c8963.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24907(byte[] bArr, String str, byte[] bArr2) {
        String strM49424 = C22253.m49424(bArr);
        String strM49425 = C22253.m49424(bArr2);
        if (strM49424.equals(strM49425)) {
            return str + "\n✔ " + strM49424 + "\n✔ " + strM49425;
        }
        return str + "\n✘ " + strM49424 + "\n✘ " + strM49425;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (!this.f33529) {
                C15829.m37611(R.string.MT_Protector);
            } else {
                ActivityC21135.m47562(main, this.f33530, m41585("title"), m41585("saveAsPath"), null);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
