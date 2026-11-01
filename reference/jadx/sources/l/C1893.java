package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public class C1893 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f7148 = "null";

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f7147 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5202 mo6160(Exception exc) {
        if (!mo2357()) {
            return C5202.m14375(exc);
        }
        return C5202.m14378();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, this.f7148);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        int i;
        int i2;
        AbstractC20745 abstractC20745M41587 = m41587("outputDir");
        String[] strArrM41566 = m41566("ARG_PATHS");
        int iM41581 = m41581("level");
        EnumC13060 enumC13060 = EnumC13060.values()[m41581("format")];
        boolean zM41573 = m41573("deleteSources");
        boolean z = true;
        C21983 c21983 = new C21983(this, strArrM41566, true);
        if (mo2357()) {
            return C5202.m14378();
        }
        int length = strArrM41566.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7147;
            if (i4 >= length) {
                if (!mo2357() && zM41573) {
                    C0815.m3395(this, strArrM41566, arrayList, c21983.m48807());
                }
                return m41583();
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(strArrM41566[i4], new String[i3]);
            if (enumC13060.f43541 && abstractC20745M15313.mo33974()) {
                throw new Exception(C17922.m41615(abstractC20745M15313, new StringBuilder("Can not compress directory: ")));
            }
            StringBuilder sbM23356 = C9023.m23356((abstractC20745M15313.mo33974() || enumC13060.f43541) ? abstractC20745M15313.getName() : abstractC20745M15313.m46718());
            sbM23356.append(enumC13060.f43543);
            AbstractC20745 abstractC20745M46693 = abstractC20745M41587.m46690(sbM23356.toString()).m46693(z);
            this.f7148 = abstractC20745M46693.getName();
            C4612 c4612M48804 = c21983.m48804(i4);
            if (enumC13060.f43541 && c4612M48804.f16331.size() != z) {
                throw new RuntimeException("Expected to be a single file, but file size = " + c4612M48804.f16331.size());
            }
            try {
                boolean z2 = enumC13060.f43541;
                String str = MotionUtils.EASING_TYPE_FORMAT_END;
                String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
                String str3 = "/";
                if (z2) {
                    C3056 c3056 = (C3056) c4612M48804.f16331.get(0);
                    CharSequence charSequence = c3056.f11521;
                    AbstractC20745 abstractC20745 = c3056.f11517;
                    mo41554(charSequence);
                    c21983.m48806();
                    mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c21983.m48803() + "/" + c21983.m48807() + MotionUtils.EASING_TYPE_FORMAT_END);
                    OutputStream outputStreamM32283 = enumC13060.m32283(abstractC20745M46693.mo33976(false), iM41581, abstractC20745.mo33964());
                    try {
                        abstractC20745.m46696(outputStreamM32283, new C23767(this, c21983));
                        if (outputStreamM32283 != null) {
                            outputStreamM32283.close();
                        }
                        i = iM41581;
                        enumC13060 = enumC13060;
                        i2 = length;
                        i4 = i4;
                        arrayList = arrayList;
                    } catch (Throwable th) {
                        if (outputStreamM32283 == null) {
                            throw th;
                        }
                        try {
                            outputStreamM32283.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    EnumC13060 enumC13061 = enumC13060.f43544;
                    C15694 c15694 = new C15694(enumC13061 == null ? abstractC20745M46693.m46708() : enumC13061.m32283(abstractC20745M46693.mo33976(false), iM41581, -1L));
                    try {
                        c15694.m37391();
                        c15694.m37394();
                        Iterator it = c4612M48804.f16331.iterator();
                        while (it.hasNext()) {
                            C3056 c3057 = (C3056) it.next();
                            if (mo2357()) {
                                break;
                            }
                            c21983.m48806();
                            mo21457(C16737.m39288(R.string.MT_Protector) + str2 + c21983.m48803() + str3 + c21983.m48807() + str);
                            boolean z3 = c3057.f11515;
                            String str4 = c3057.f11523;
                            long j = c3057.f11519;
                            Iterator it2 = it;
                            String str5 = c3057.f11521;
                            int i5 = iM41581;
                            boolean z4 = c3057.f11518;
                            if (z3) {
                                C10049 c10049 = new C10049(z4 ? (byte) 50 : (byte) 53, str5 + str3);
                                c10049.m25411(C16502.fromMillis(j));
                                if (c3057.f11520) {
                                    c10049.m25406(c3057.f11514 | 16384);
                                    c10049.m25403(c3057.f11524);
                                    c10049.m25408(c3057.f11522);
                                }
                                if (z4) {
                                    c10049.m25427(str4);
                                }
                                c15694.m37393(c10049);
                                c15694.m37392();
                                str2 = str2;
                                str3 = str3;
                            } else {
                                length = length;
                                AbstractC20745 abstractC20746 = c3057.f11517;
                                mo41554(str5);
                                C10049 c100410 = new C10049(z4 ? (byte) 50 : UTF8.S_P3A, str5);
                                c100410.m25426(z4 ? 0L : c3057.f11516);
                                c100410.m25411(C16502.fromMillis(j));
                                if (c3057.f11520) {
                                    c100410.m25406(c3057.f11514 | 32768);
                                    c100410.m25403(c3057.f11524);
                                    c100410.m25408(c3057.f11522);
                                }
                                if (z4) {
                                    c100410.m25427(str4);
                                }
                                c15694.m37393(c100410);
                                if (!z4) {
                                    abstractC20746.m46696(c15694, new C14595(this, c21983));
                                }
                                c15694.m37392();
                            }
                            str3 = str3;
                            str = str;
                            it = it2;
                            iM41581 = i5;
                            length = length;
                            str2 = str2;
                        }
                        i = iM41581;
                        i2 = length;
                        c15694.close();
                    } catch (Throwable th3) {
                        try {
                            c15694.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (mo2357()) {
                    abstractC20745M46693.mo24644();
                    return C5202.m14378();
                }
                arrayList.add(abstractC20745M46693);
                i4++;
                z = true;
                i3 = 0;
                abstractC20745M41587 = abstractC20745M41587;
                enumC13060 = enumC13060;
                iM41581 = i;
                length = i2;
            } catch (Exception e) {
                abstractC20745M46693.mo24644();
                throw e;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, C0815.m3390((List) this.f7147));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
