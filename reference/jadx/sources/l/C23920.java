package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes.dex */
public class C23920 implements InterfaceC11211 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77432;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumSet f77433;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f77434;

    public C23920(Set set) {
        this.f77434 = new HashMap();
        this.f77433 = EnumSet.copyOf((Collection) set);
        m53433(EnumC22400.DEPTH, -1);
        m53433(EnumC22400.LENGTH, -1);
        this.f77432 = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[Catch: NumberFormatException -> 0x00bf, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00bf, blocks: (B:29:0x008f, B:35:0x0098, B:37:0x00a0, B:38:0x00ab, B:40:0x00b3), top: B:50:0x008f }] */
    public C23920(C13015 c13015, EnumSet enumSet) {
        this(enumSet);
        String strM32422 = c13015.m32422("diags.showSource");
        if (strM32422 != null) {
            if (strM32422.equals("true")) {
                m53432(EnumC5246.SOURCE, true);
            } else if (strM32422.equals("false")) {
                m53432(EnumC5246.SOURCE, false);
            }
        }
        String strM32423 = c13015.m32422("diags.formatterOptions");
        if (strM32423 != null) {
            List listAsList = Arrays.asList(strM32423.split(","));
            if (listAsList.contains(ClassTransform.SHORT)) {
                m53432(EnumC5246.DETAILS, false);
                m53432(EnumC5246.SUBDIAGNOSTICS, false);
            }
            if (listAsList.contains("source")) {
                m53432(EnumC5246.SOURCE, true);
            }
            if (listAsList.contains("-source")) {
                m53432(EnumC5246.SOURCE, false);
            }
        }
        String strM32424 = c13015.m32422("diags.multilinePolicy");
        if (strM32424 != null) {
            if (strM32424.equals("disabled")) {
                m53432(EnumC5246.SUBDIAGNOSTICS, false);
            } else if (strM32424.startsWith("limit:")) {
                String[] strArrSplit = strM32424.substring(6).split(":");
                try {
                    int length = strArrSplit.length;
                    if (length == 1) {
                        if (!strArrSplit[0].equals("*")) {
                            m53433(EnumC22400.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    } else if (length == 2) {
                        if (!strArrSplit[1].equals("*")) {
                            m53433(EnumC22400.DEPTH, Integer.parseInt(strArrSplit[1]));
                        }
                        if (!strArrSplit[0].equals("*")) {
                            m53433(EnumC22400.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    }
                } catch (NumberFormatException unused) {
                    m53433(EnumC22400.DEPTH, -1);
                    m53433(EnumC22400.LENGTH, -1);
                }
            }
        }
        String strM32425 = c13015.m32422("diags.showCaret");
        if (strM32425 == null || !strM32425.equals("false")) {
            this.f77432 = true;
        } else {
            this.f77432 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53433(EnumC22400 enumC22400, int i) {
        if (i < -1) {
            i = -1;
        }
        this.f77434.put(enumC22400, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53432(EnumC5246 enumC5246, boolean z) {
        if (z) {
            this.f77433.add(enumC5246);
        } else {
            this.f77433.remove(enumC5246);
        }
    }
}
