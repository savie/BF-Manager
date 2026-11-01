package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public class C4343 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f15538;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
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
        return C16737.m39264(R.string.MT_Protector, m41569("output"));
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
        OutputStream outputStreamM32283;
        String[] strArr;
        boolean z;
        C19908 c19908;
        this.f15538 = m41587("output");
        String[] strArrM41566 = m41566("ARG_PATHS");
        EnumC13060 enumC13060 = EnumC13060.values()[m41581("format")];
        int iM41581 = m41581("level");
        boolean zM41573 = m41573("deleteSources");
        boolean zM41574 = m41573("replaceExisting");
        C4612 c4612M3391 = C0815.m3391((AbstractC17902) this, strArrM41566, true);
        ArrayList arrayList = c4612M3391.f16331;
        if (mo2357()) {
            return C5202.m14378();
        }
        if (enumC13060.f43541 && arrayList.size() != 1) {
            throw new RuntimeException("Expected to be a single file, but file size = " + arrayList.size());
        }
        C19908 c19908M45178 = C19908.m45178(this.f15538, zM41574);
        AbstractC20745 abstractC20745M45186 = c19908M45178.m45186();
        if (enumC13060.f43541) {
            C3056 c3056 = (C3056) arrayList.get(0);
            mo21457(C16737.m39288(R.string.MT_Protector));
            CharSequence charSequence = c3056.f11521;
            AbstractC20745 abstractC20745 = c3056.f11517;
            mo41554(charSequence);
            try {
                OutputStream outputStreamM32284 = enumC13060.m32283(abstractC20745M45186.mo33976(false), iM41581, abstractC20745.mo33964());
                try {
                    abstractC20745.m46696(outputStreamM32284, new C9656(this, c3056));
                    if (outputStreamM32284 != null) {
                        outputStreamM32284.close();
                    }
                    strArr = strArrM41566;
                    z = zM41573;
                    c19908 = c19908M45178;
                } catch (Throwable th) {
                    if (outputStreamM32284 == null) {
                        throw th;
                    }
                    try {
                        outputStreamM32284.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e) {
                abstractC20745M45186.mo24644();
                throw e;
            }
        } else {
            EnumC13060 enumC13061 = enumC13060.f43544;
            try {
                if (enumC13061 == null) {
                    outputStreamM32283 = abstractC20745M45186.m46708();
                } else {
                    outputStreamM32283 = enumC13061.m32283(abstractC20745M45186.mo33976(false), iM41581, -1L);
                }
                C15694 c15694 = new C15694(outputStreamM32283);
                try {
                    c15694.m37391();
                    c15694.m37394();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3056 c3057 = (C3056) it.next();
                        if (mo2357()) {
                            break;
                        }
                        c4612M3391.m12759();
                        boolean z2 = c3057.f11515;
                        long j = c3057.f11516;
                        String str = c3057.f11523;
                        long j2 = c3057.f11519;
                        String str2 = c3057.f11521;
                        Iterator it2 = it;
                        boolean z3 = c3057.f11518;
                        String[] strArr2 = strArrM41566;
                        if (z2) {
                            C10049 c10049 = new C10049(z3 ? (byte) 50 : (byte) 53, str2 + "/");
                            c10049.m25411(C16502.fromMillis(j2));
                            if (c3057.f11520) {
                                c10049.m25406(c3057.f11514 | 16384);
                                c10049.m25403(c3057.f11524);
                                c10049.m25408(c3057.f11522);
                            }
                            if (z3) {
                                c10049.m25427(str);
                            }
                            c15694.m37393(c10049);
                            c15694.m37392();
                        } else {
                            AbstractC20745 abstractC20746 = c3057.f11517;
                            mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c4612M3391.m12755() + "/" + c4612M3391.m12760() + MotionUtils.EASING_TYPE_FORMAT_END);
                            mo41554(str2);
                            C10049 c100410 = new C10049(z3 ? (byte) 50 : UTF8.S_P3A, str2);
                            c100410.m25426(z3 ? 0L : j);
                            c100410.m25411(C16502.fromMillis(j2));
                            if (c3057.f11520) {
                                c100410.m25406(c3057.f11514 | 32768);
                                c100410.m25403(c3057.f11524);
                                c100410.m25408(c3057.f11522);
                            }
                            if (z3) {
                                c100410.m25427(str);
                            }
                            c15694.m37393(c100410);
                            if (!z3) {
                                abstractC20746.m46696(c15694, new C3304(this, c4612M3391));
                            }
                            c15694.m37392();
                            c4612M3391.m12756(j);
                        }
                        it = it2;
                        strArrM41566 = strArr2;
                        zM41573 = zM41573;
                        c19908M45178 = c19908M45178;
                    }
                    strArr = strArrM41566;
                    z = zM41573;
                    c19908 = c19908M45178;
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
            } catch (Exception e2) {
                abstractC20745M45186.mo24644();
                throw e2;
            }
        }
        if (mo2357()) {
            abstractC20745M45186.mo24644();
            return C5202.m14378();
        }
        List listM45185 = c19908.m45185(Collections.singletonList(abstractC20745M45186), EnumC15675.NONE);
        if (mo2357()) {
            return C5202.m14378();
        }
        if (z) {
            C0815.m3395(this, strArr, listM45185, c4612M3391.m12760());
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, Collections.singletonList(this.f15538.getName()));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
