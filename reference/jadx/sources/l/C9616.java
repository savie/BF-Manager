package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f32397 = C11904.f39937.m46690("tc");

    static {
        C16737.m39273(new RunnableC20427(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24524() {
        AbstractC20745 abstractC20745 = f32397;
        abstractC20745.m46690(am.aC).mo24647();
        abstractC20745.m46690("o").mo24647();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m24527(boolean z) throws C8142 {
        AbstractC20745 abstractC20745M46690 = f32397.m46690("o");
        byte[] bArrM4673 = null;
        if (!z && abstractC20745M46690.mo33975()) {
            try {
                C17367 c17367M46713 = abstractC20745M46690.m46713();
                if (Math.abs(System.currentTimeMillis() - c17367M46713.readLong()) < 3600000) {
                    bArrM4673 = c17367M46713.m40451();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM4673 == null) {
            C1313 c1313M8314 = C2724.m8305(4209).m8314();
            if (c1313M8314.m4686()) {
                bArrM4673 = c1313M8314.m4673();
                try {
                    C11018 c11018 = new C11018();
                    c11018.m27791(System.currentTimeMillis());
                    c11018.m27794(bArrM4673);
                    abstractC20745M46690.m46697(c11018);
                } catch (Exception unused2) {
                }
            } else {
                throw new C8142(C4820.m13401(c1313M8314, R.string.MT_Protector));
            }
        }
        C17367 c17367M40441 = C17367.m40441(bArrM4673);
        ArrayList arrayList = new ArrayList();
        int i = c17367M40441.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C21609(c17367M40441));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m24523(boolean z) throws C8142 {
        AbstractC20745 abstractC20745M46690 = f32397.m46690(am.aC);
        byte[] bArrM4673 = null;
        if (!z && abstractC20745M46690.mo33975()) {
            try {
                C17367 c17367M46713 = abstractC20745M46690.m46713();
                if (Math.abs(System.currentTimeMillis() - c17367M46713.readLong()) < 3600000) {
                    bArrM4673 = c17367M46713.m40451();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM4673 == null) {
            C2724 c2724M8305 = C2724.m8305(4199);
            C1313 c1313M8314 = C1709.m5692() ? c2724M8305.m8314() : c2724M8305.m8313();
            if (c1313M8314.m4686()) {
                bArrM4673 = c1313M8314.m4673();
                try {
                    C11018 c11018 = new C11018();
                    c11018.m27791(System.currentTimeMillis());
                    c11018.m27794(bArrM4673);
                    abstractC20745M46690.m46697(c11018);
                } catch (Exception unused2) {
                }
            } else {
                throw new C8142(C4820.m13401(c1313M8314, R.string.MT_Protector));
            }
        }
        C17367 c17367M40441 = C17367.m40441(bArrM4673);
        int i = c17367M40441.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C18787(c17367M40441));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m24526(int i, String str) {
        AbstractC20745 abstractC20745M46690 = f32397.m46690("d" + i);
        if (!abstractC20745M46690.mo33975()) {
            return null;
        }
        try {
            C17367 c17367M46713 = abstractC20745M46690.m46713();
            if (c17367M46713.m40458().equals(str)) {
                return c17367M46713.m40451();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m24525(int i) throws C8142 {
        AbstractC20745 abstractC20745M46690 = f32397.m46690("d" + i);
        C2724 c2724M8305 = C2724.m8305(4200);
        c2724M8305.m8325(i);
        C1313 c1313M8314 = C1709.m5692() ? c2724M8305.m8314() : c2724M8305.m8313();
        if (c1313M8314.m4686()) {
            String[] strArr = {c1313M8314.m4683(), c1313M8314.m4683()};
            byte[] bArrM41967 = C18019.m41967(strArr[0]);
            try {
                abstractC20745M46690.mo46720();
                C11018 c11018 = new C11018();
                c11018.m27786(strArr[1]);
                c11018.m27794(bArrM41967);
                abstractC20745M46690.m46697(c11018);
            } catch (Exception unused) {
            }
            return bArrM41967;
        }
        throw new C8142(C4820.m13401(c1313M8314, R.string.MT_Protector));
    }
}
