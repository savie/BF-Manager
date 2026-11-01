package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C17416 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f55419 = "null";

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f55418 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, this.f55419);
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
        ArrayList arrayList;
        AbstractC20745 abstractC20745M41587 = m41587("outputDir");
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("password");
        int iM41581 = m41581("level");
        boolean zM41573 = m41573("headerEncryption");
        boolean zM41574 = m41573("deleteSources");
        long jM41590 = m41590("splitSize");
        int length = strArrM41566.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f55418;
            if (i < length) {
                StringBuilder sb = new StringBuilder();
                sb.append(C16737.m39288(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                int i3 = i + 1;
                sb.append(i3);
                sb.append("/");
                sb.append(length);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                mo21457(sb.toString());
                m41578(i3, length);
                AbstractC20745 abstractC20745M15313 = C5553.m15313(strArrM41566[i], new String[0]);
                AbstractC20745 abstractC20745M46693 = abstractC20745M41587.m46690((abstractC20745M15313.mo33974() ? abstractC20745M15313.getName() : abstractC20745M15313.m46718()) + ".7z").m46693(true);
                this.f55419 = abstractC20745M46693.getName();
                C4612 c4612M3391 = C0815.m3391((AbstractC17902) this, new String[]{strArrM41566[i]}, false);
                int iM12760 = c4612M3391.m12760() + i2;
                if (mo2357()) {
                    return C5202.m14378();
                }
                C20451 c20451 = new C20451();
                c20451.f66380 = c4612M3391.f16331.size();
                c20451.f66378 = iM41581;
                c20451.f66379 = zM41573;
                ArrayList arrayList3 = new ArrayList();
                try {
                    AbstractC20745 abstractC20745 = abstractC20745M41587;
                    int i4 = iM41581;
                    boolean z = zM41573;
                    int i5 = length;
                    try {
                        C17628.m41007(c20451, new C12478(this, jM41590, abstractC20745M46693, arrayList3, strM41585, c4612M3391));
                        if (mo2357()) {
                            C0815.m3392(arrayList3);
                            return C5202.m14378();
                        }
                        arrayList2.addAll(arrayList3);
                        i = i3;
                        i2 = iM12760;
                        abstractC20745M41587 = abstractC20745;
                        iM41581 = i4;
                        zM41573 = z;
                        length = i5;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList3;
                        C0815.m3392(arrayList);
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList3;
                }
            } else {
                if (!mo2357() && zM41574) {
                    C0815.m3395(this, strArrM41566, arrayList2, i2);
                }
                return m41583();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, C0815.m3390((List) this.f55418));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
