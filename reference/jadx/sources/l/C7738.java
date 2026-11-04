package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 698T */
/* JADX INFO: loaded from: classes4.dex */
public class C7738 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f25482;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public String f25483;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46047;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("saveAsPath"), m43865("title"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        mo16837(m43865("title"));
        m43859(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        AbstractC22044 abstractC22044M43860 = m43860("inputPath1");
        AbstractC22044 abstractC22044M43861 = m43860("inputPath2");
        C3374 c3374 = new C3374(abstractC22044M43861.mo4285() + abstractC22044M43860.mo4285());
        c3374.m11078(new C13809(2, this));
        InterfaceC16199[] interfaceC16199Arr = {C17691.m41402(), C17691.m41401(), C17691.m41403(), C17691.m41400()};
        C25151 c25151 = new C25151(interfaceC16199Arr);
        try {
            InputStream inputStreamMo4290 = abstractC22044M43860.mo4290();
            try {
                c25151.m56054(inputStreamMo4290, c3374);
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                c25151.close();
                InterfaceC16199[] interfaceC16199Arr2 = {C17691.m41402(), C17691.m41401(), C17691.m41403(), C17691.m41400()};
                C25151 c25152 = new C25151(interfaceC16199Arr2);
                try {
                    InputStream inputStreamMo4291 = abstractC22044M43861.mo4290();
                    try {
                        c25152.m56054(inputStreamMo4291, c3374);
                        if (inputStreamMo4291 != null) {
                            inputStreamMo4291.close();
                        }
                        c25152.close();
                        byte[][] bArr = {interfaceC16199Arr[0].mo38425(), interfaceC16199Arr[1].mo38425(), interfaceC16199Arr[2].mo38425(), interfaceC16199Arr[3].mo38425()};
                        byte[][] bArr2 = {interfaceC16199Arr2[0].mo38425(), interfaceC16199Arr2[1].mo38425(), interfaceC16199Arr2[2].mo38425(), interfaceC16199Arr2[3].mo38425()};
                        boolean zDeepEquals = Arrays.deepEquals(bArr, bArr2);
                        this.f25482 = !zDeepEquals;
                        if (!zDeepEquals) {
                            this.f25483 = abstractC22044M43860.mo4294() + "\n" + abstractC22044M43861.mo4294() + "\n\n" + m21063(bArr[0], "[MD5]", bArr2[0]) + "\n\n" + m21063(bArr[1], "[SHA1]", bArr2[1]) + "\n\n" + m21063(bArr[2], "[SHA256]", bArr2[2]) + "\n\n" + m21063(bArr[3], "[CRC32]", bArr2[3]);
                        }
                        return m43857();
                    } catch (Throwable th) {
                        if (inputStreamMo4291 != null) {
                            try {
                                inputStreamMo4291.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c25152.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c25151.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21063(byte[] bArr, String str, byte[] bArr2) {
        String strM36182 = C15022.m36182(bArr);
        String strM36183 = C15022.m36182(bArr2);
        if (strM36182.equals(strM36183)) {
            return str + "\n✔ " + strM36182 + "\n✔ " + strM36183;
        }
        return str + "\n✘ " + strM36182 + "\n✘ " + strM36183;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (!this.f25482) {
                C22673.m51152(R.string.MT_Protector);
            } else {
                ActivityC4300.m13685(main, this.f25483, m43865("title"), m43865("saveAsPath"), null);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
